package UseCases;

import lambdas.Executor;

public class Controller
{
  protected void tryCatch(Executor executor)
  {
    try
      { executor.exe(); }
    catch (Exception e)
      { System.out.println("Houve um erro: " + e.getMessage()); }
  }  
}
