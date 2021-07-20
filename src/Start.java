import UseCases.FindPrimeNumber.FindPrimeNumberController;
import UseCases.FindPrimeNumber.FindPrimeNumberUseCase;
import utils.IO;

public class Start
{
  public static void main(String[] args)
  {    
    IO.output.accept("Enter any number: ");

    var findPrimeNumberUseCase = new FindPrimeNumberUseCase();
    var findPrimeNumberController = new FindPrimeNumberController(
      findPrimeNumberUseCase
    );
    
    findPrimeNumberController.handle(
      IO.input,
      IO.output
    );
  }
}