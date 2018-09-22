package com.zereao.responsibilitychain.demo01;

/**
 * 抽象处理人员类
 *
 * @author Zereao
 * @version 2018/09/22  20:11
 */
public abstract class AbstractHandler {
    public static final int FATHER_LEVEL_REQUEST = 1;
    public static final int HUSBAND_LEVEL_REQUEST = 2;
    public static final int SON_LEVEL_REQUEST = 3;

    // 能处理的级别
    private int level = 0;
    // 责任传递，下一个责任人是谁
    private AbstractHandler nextHandler;

    //  每个人都要说明一下自己能处理哪些类型的请求
    public AbstractHandler(int level) {
        this.level = level;
    }

    // 有请示的话，需要回应
    protected abstract void response(IWomen women);

    // 此处设置为final，想到模板方法99966
    //  模式
    public final void handleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                // 有后续环节，才把请求往后传递
                this.nextHandler.handleMessage(women);
            } else {
                System.out.println("-------没地方请示了，按照不同意处理!-----");
            }
        }
    }

    /**
     * 如果不属于你处理的请求，应该让她找下一个环节的人。
     * 如果女儿出嫁了，还向父亲请示，那父亲就应该告诉女儿，应该找丈夫请示
     */
    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
