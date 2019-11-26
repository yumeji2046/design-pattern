package strategy;

/**
 * @author yumeji
 * @data 2019/11/26
 */
public class StrategyContext {
    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void StrategyAlgorithm(double money) {
        strategy.operate(money);
    }
}
