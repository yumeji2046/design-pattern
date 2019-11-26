package strategy;

/**
 * @author yumeji
 * @data 2019/11/26
 */
public class CNstrategy implements Strategy{
    public void operate(double money) {
        System.out.println("CN: " + money);
    }
}
