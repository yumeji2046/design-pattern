package template;

/**
 * @author yumeji
 * @data 2019/11/25
 */
public abstract class Game {
    public final void play() {
        init();
        ready();
        start();
    }

    protected abstract void init();
    protected void ready() {
        System.out.println("游戏准备！");
    }
    protected abstract void start();
}
