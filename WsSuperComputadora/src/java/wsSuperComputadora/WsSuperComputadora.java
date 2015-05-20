/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsSuperComputadora;

import static java.lang.Thread.sleep;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author miguel
 */
@WebService(serviceName = "WsSuperComputadora")
public class WsSuperComputadora {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public int suma(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return a+b;
    }

    /**
     * Web service operation
     * @param p1
     * @param p2
     * @throws java.lang.InterruptedException
     */
    @WebMethod(operationName = "procesarComputo")
    public void procesarComputo(@WebParam(name = "p1") int p1, @WebParam(name = "p2") int p2) throws InterruptedException {
        sleep((p1+p2)/2);
    }

    /**
     * Web service operation
     * @param numero
     * @return 
     */
    @WebMethod(operationName = "esPrimo")
    public boolean esPrimo(@WebParam(name = "numero") int numero) {
        //TODO write your implementation code here:
        return true;
    }

}
