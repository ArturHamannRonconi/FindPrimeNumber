package UseCases.FindPrimeNumber;

import java.util.Scanner;
import java.util.function.Consumer;

import UseCases.Controller;
import lambdas.Executor;

public class FindPrimeNumberController extends Controller
{
  private FindPrimeNumberUseCase findPrimeNumberUseCase;

  public FindPrimeNumberController(FindPrimeNumberUseCase findPrimeNumberUseCase)
  {
    this.findPrimeNumberUseCase = findPrimeNumberUseCase;
  }

  public void handle(Scanner input, Consumer<String> output)
  {
    Executor executor = () -> {
      Integer number = input.nextInt();
      String response = this.findPrimeNumberUseCase.execute(number);
      output.accept(response);
    };

    super.tryCatch(executor);
  }  
}
