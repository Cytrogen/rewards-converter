/**
 * The RewardValue class represents the value of the award, which can be either a cash value or a mileage value.
 * The conversion rate between miles and cash is 0.0035.
 */
public class RewardValue {
    private final double cashValue;
    private final double milesValue;
    private static final double CONVERSION_RATE = 0.0035;

    /**
     * Constructor that accepts a cash value as an argument.
     * @param cashValue Cash value
     */
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / CONVERSION_RATE;
    }

    /**
     * Constructor that accepts a mileage value as an argument.
     * @param milesValue Miles value
     */
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * CONVERSION_RATE;
    }

    /**
     * Get the cash value of RewardValue.
     * @return Cash value
     */
    public double getCashValue() {
        return this.cashValue;
    }

    /**
     * Get the miles value of RewardValue.
     * @return Miles value
     */
    public double getMilesValue() {
        return this.milesValue;
    }
}
