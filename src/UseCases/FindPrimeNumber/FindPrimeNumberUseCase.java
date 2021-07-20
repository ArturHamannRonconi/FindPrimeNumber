package UseCases.FindPrimeNumber;

public class FindPrimeNumberUseCase
{
  private Integer divisor;

  public FindPrimeNumberUseCase()
  {
    this.divisor = 1;
  }

  String execute(Integer dividend)
  {
    var isDivisible = this.verifyDividendIsDivisibleByDivisor(dividend);
    var isDifferentOneAndDividend = this.verifyDivisorIsDifferentOneAndDividend(dividend);

    if(isDifferentOneAndDividend && isDivisible)
      return "Is not a prime number";

    if(dividend == this.divisor)
      return "Is a prime number";

    this.addtoDivisor();
    return this.execute(dividend);
  }

  private boolean verifyDividendIsDivisibleByDivisor(Integer dividend)
  {
    var remainder = 0;

    return dividend % this.divisor == remainder
    ? true : false;
  }
  private boolean verifyDivisorIsDifferentOneAndDividend(Integer dividend)
  {
    return this.divisor != 1 && this.divisor != dividend; 
  } 
  private void addtoDivisor()
  {
    ++this.divisor;
  }
}