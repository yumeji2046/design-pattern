import strategy.CNstrategy;
import strategy.StrategyContext;
import strategy.USstrategy;

/**
 * @author yumeji
 * @data 2019/11/26
 */
public class StrategyDemo {
    public static void main(String[] args) {

        new StrategyContext(new CNstrategy()).StrategyAlgorithm(100);
        new StrategyContext(new USstrategy()).StrategyAlgorithm(100);
    }
}
