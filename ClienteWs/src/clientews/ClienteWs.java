/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientews;

/**
 *
 * @author miguel
 */
public class ClienteWs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = suma(5,4);
        System.out.println(suma);
    }

    private static int suma(int a, int b) {
        wsSuperComputadora.WsSuperComputadora_Service service = new wsSuperComputadora.WsSuperComputadora_Service();
        wsSuperComputadora.WsSuperComputadora port = service.getWsSuperComputadoraPort();
        return port.suma(a, b);
    }
    
}
