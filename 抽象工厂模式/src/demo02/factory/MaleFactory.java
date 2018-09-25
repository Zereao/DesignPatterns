package demo02.factory;


import demo02.human.Human;
import demo02.human.MaleYellowHuman;

/**
 * @author Zereao
 * @version 2018/07/25  10:35
 */
public class MaleFactory implements HumanFactory {

    @Override
    public Human getYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human getWhiteHuman() {
        return null;
    }

    @Override
    public Human getBlackHuman() {
        return null;
    }
}
