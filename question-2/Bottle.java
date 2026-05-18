
public class Bottle {

    private double maxCap;
    private double currentAmt;
    private double minAmount;

    public Bottle(double startingAmt) {
        maxCap = startingAmt;
        currentAmt = startingAmt;
        minAmount = startingAmt / 4.0;
    } 

    public double updateAmount(double amt) {
        currentAmt -= amt;

        if (currentAmt < minAmount) {
            currentAmt = maxCap;
        }

        return currentAmt;
    }
  
}
