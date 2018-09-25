package demo02.human;

/**
 * 抽象黄种人
 *
 * @author Zereao
 * @version 2018/07/25  10:29
 */
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说中文");
    }
}
