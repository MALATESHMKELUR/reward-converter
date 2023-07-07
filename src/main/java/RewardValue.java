public class RewardValue
{
  double cashValue;
  int milesValue;
  public double getCashValue()
  {
      return cashValue;
  }

  public int getMilesValue()
  {
    return milesValue;
  }

  public RewardValue(double cashValue)
  {
    this.cashValue=cashValue;
    this.milesValue=(int)(cashValue/0.0035);
  }

  public RewardValue(int milesValue)
  {
    this.milesValue=milesValue;
    this.cashValue=milesValue*0.0035;
  }
}
