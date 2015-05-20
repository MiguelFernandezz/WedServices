
package wssupercomputadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para procesarComputo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="procesarComputo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="p1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "procesarComputo", propOrder = {
    "p1",
    "p2"
})
public class ProcesarComputo {

    protected int p1;
    protected int p2;

    /**
     * Obtiene el valor de la propiedad p1.
     * 
     */
    public int getP1() {
        return p1;
    }

    /**
     * Define el valor de la propiedad p1.
     * 
     */
    public void setP1(int value) {
        this.p1 = value;
    }

    /**
     * Obtiene el valor de la propiedad p2.
     * 
     */
    public int getP2() {
        return p2;
    }

    /**
     * Define el valor de la propiedad p2.
     * 
     */
    public void setP2(int value) {
        this.p2 = value;
    }

}
