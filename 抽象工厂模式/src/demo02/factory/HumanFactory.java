package demo02.factory;


import demo02.human.Human;

/**
 * 八卦炉 - 人类工厂
 *
 * @author Zereao
 * @version 2018/07/25  10:33
 */
public interface HumanFactory {
    public Human getYellowHuman();

    public Human getWhiteHuman();

    public Human getBlackHuman();
}
