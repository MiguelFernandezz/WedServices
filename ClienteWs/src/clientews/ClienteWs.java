/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientews;

import wssupercomputadora.InterruptedException_Exception;

/**
 *
 * @author miguel
 */
public class ClienteWs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, InterruptedException_Exception {
        long tiempoProcesarComputo = System.currentTimeMillis();
        procesarComputo(5,8);
        tiempoProcesarComputo = System.currentTimeMillis() - tiempoProcesarComputo;
        
        long tiempoEsPrimo = System.currentTimeMillis();
        esPrimo(5);
        tiempoEsPrimo = System.currentTimeMillis() - tiempoEsPrimo;
        
        System.out.println("Tiempo total de procesar computo: "+tiempoProcesarComputo+" ms");
        System.out.println("Tiempo total de es primo: "+tiempoEsPrimo+" ms");
    }   

    private static void procesarComputo(int p1, int p2) throws InterruptedException_Exception {
        wssupercomputadora.WsSuperComputadora_Service service = new wssupercomputadora.WsSuperComputadora_Service();
        wssupercomputadora.WsSuperComputadora port = service.getWsSuperComputadoraPort();
        port.procesarComputo(p1, p2);
    }

    private static boolean esPrimo(int numero) {
        wssupercomputadora.WsSuperComputadora_Service service = new wssupercomputadora.WsSuperComputadora_Service();
        wssupercomputadora.WsSuperComputadora port = service.getWsSuperComputadoraPort();
        return port.esPrimo(numero);
    }

    
}
