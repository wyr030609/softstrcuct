package example;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public class HelloWorld {
  @WebMethod
  public Double calcTax(Double income) {

    double result=0;
    if(income>3500){
      result=(income-3500)*0.02;
    }
    return result;
  }
}
