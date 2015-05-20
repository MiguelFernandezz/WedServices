
package wssupercomputadora;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wssupercomputadora package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InterruptedException_QNAME = new QName("http://wsSuperComputadora/", "InterruptedException");
    private final static QName _ProcesarComputo_QNAME = new QName("http://wsSuperComputadora/", "procesarComputo");
    private final static QName _EsPrimoResponse_QNAME = new QName("http://wsSuperComputadora/", "esPrimoResponse");
    private final static QName _Hello_QNAME = new QName("http://wsSuperComputadora/", "hello");
    private final static QName _EsPrimo_QNAME = new QName("http://wsSuperComputadora/", "esPrimo");
    private final static QName _HelloResponse_QNAME = new QName("http://wsSuperComputadora/", "helloResponse");
    private final static QName _Suma_QNAME = new QName("http://wsSuperComputadora/", "suma");
    private final static QName _SumaResponse_QNAME = new QName("http://wsSuperComputadora/", "sumaResponse");
    private final static QName _ProcesarComputoResponse_QNAME = new QName("http://wsSuperComputadora/", "procesarComputoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wssupercomputadora
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Suma }
     * 
     */
    public Suma createSuma() {
        return new Suma();
    }

    /**
     * Create an instance of {@link SumaResponse }
     * 
     */
    public SumaResponse createSumaResponse() {
        return new SumaResponse();
    }

    /**
     * Create an instance of {@link ProcesarComputoResponse }
     * 
     */
    public ProcesarComputoResponse createProcesarComputoResponse() {
        return new ProcesarComputoResponse();
    }

    /**
     * Create an instance of {@link EsPrimo }
     * 
     */
    public EsPrimo createEsPrimo() {
        return new EsPrimo();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link EsPrimoResponse }
     * 
     */
    public EsPrimoResponse createEsPrimoResponse() {
        return new EsPrimoResponse();
    }

    /**
     * Create an instance of {@link InterruptedException }
     * 
     */
    public InterruptedException createInterruptedException() {
        return new InterruptedException();
    }

    /**
     * Create an instance of {@link ProcesarComputo }
     * 
     */
    public ProcesarComputo createProcesarComputo() {
        return new ProcesarComputo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterruptedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSuperComputadora/", name = "InterruptedException")
    public JAXBElement<InterruptedException> createInterruptedException(InterruptedException value) {
        return new JAXBElement<InterruptedException>(_InterruptedException_QNAME, InterruptedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesarComputo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSuperComputadora/", name = "procesarComputo")
    public JAXBElement<ProcesarComputo> createProcesarComputo(ProcesarComputo value) {
        return new JAXBElement<ProcesarComputo>(_ProcesarComputo_QNAME, ProcesarComputo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsPrimoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSuperComputadora/", name = "esPrimoResponse")
    public JAXBElement<EsPrimoResponse> createEsPrimoResponse(EsPrimoResponse value) {
        return new JAXBElement<EsPrimoResponse>(_EsPrimoResponse_QNAME, EsPrimoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSuperComputadora/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsPrimo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSuperComputadora/", name = "esPrimo")
    public JAXBElement<EsPrimo> createEsPrimo(EsPrimo value) {
        return new JAXBElement<EsPrimo>(_EsPrimo_QNAME, EsPrimo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSuperComputadora/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSuperComputadora/", name = "suma")
    public JAXBElement<Suma> createSuma(Suma value) {
        return new JAXBElement<Suma>(_Suma_QNAME, Suma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSuperComputadora/", name = "sumaResponse")
    public JAXBElement<SumaResponse> createSumaResponse(SumaResponse value) {
        return new JAXBElement<SumaResponse>(_SumaResponse_QNAME, SumaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesarComputoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsSuperComputadora/", name = "procesarComputoResponse")
    public JAXBElement<ProcesarComputoResponse> createProcesarComputoResponse(ProcesarComputoResponse value) {
        return new JAXBElement<ProcesarComputoResponse>(_ProcesarComputoResponse_QNAME, ProcesarComputoResponse.class, null, value);
    }

}
