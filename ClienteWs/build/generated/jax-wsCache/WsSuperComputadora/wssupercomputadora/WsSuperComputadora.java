
package wssupercomputadora;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WsSuperComputadora", targetNamespace = "http://wsSuperComputadora/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WsSuperComputadora {


    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "suma", targetNamespace = "http://wsSuperComputadora/", className = "wssupercomputadora.Suma")
    @ResponseWrapper(localName = "sumaResponse", targetNamespace = "http://wsSuperComputadora/", className = "wssupercomputadora.SumaResponse")
    @Action(input = "http://wsSuperComputadora/WsSuperComputadora/sumaRequest", output = "http://wsSuperComputadora/WsSuperComputadora/sumaResponse")
    public int suma(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param numero
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "esPrimo", targetNamespace = "http://wsSuperComputadora/", className = "wssupercomputadora.EsPrimo")
    @ResponseWrapper(localName = "esPrimoResponse", targetNamespace = "http://wsSuperComputadora/", className = "wssupercomputadora.EsPrimoResponse")
    @Action(input = "http://wsSuperComputadora/WsSuperComputadora/esPrimoRequest", output = "http://wsSuperComputadora/WsSuperComputadora/esPrimoResponse")
    public boolean esPrimo(
        @WebParam(name = "numero", targetNamespace = "")
        int numero);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://wsSuperComputadora/", className = "wssupercomputadora.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://wsSuperComputadora/", className = "wssupercomputadora.HelloResponse")
    @Action(input = "http://wsSuperComputadora/WsSuperComputadora/helloRequest", output = "http://wsSuperComputadora/WsSuperComputadora/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param p1
     * @param p2
     * @throws InterruptedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "procesarComputo", targetNamespace = "http://wsSuperComputadora/", className = "wssupercomputadora.ProcesarComputo")
    @ResponseWrapper(localName = "procesarComputoResponse", targetNamespace = "http://wsSuperComputadora/", className = "wssupercomputadora.ProcesarComputoResponse")
    @Action(input = "http://wsSuperComputadora/WsSuperComputadora/procesarComputoRequest", output = "http://wsSuperComputadora/WsSuperComputadora/procesarComputoResponse", fault = {
        @FaultAction(className = InterruptedException_Exception.class, value = "http://wsSuperComputadora/WsSuperComputadora/procesarComputo/Fault/InterruptedException")
    })
    public void procesarComputo(
        @WebParam(name = "p1", targetNamespace = "")
        int p1,
        @WebParam(name = "p2", targetNamespace = "")
        int p2)
        throws InterruptedException_Exception
    ;

}
