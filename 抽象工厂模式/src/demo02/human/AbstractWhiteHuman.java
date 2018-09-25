package demo02.human;

/**
 * 白色人种 抽象类
 *
 * @author Zereao
 * @version 2018/07/25  10:23
 */
public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种");
    }

    @Override
    public void talk() {
        System.out.println("白色人种说英语");
    }
}
