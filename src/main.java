/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Néstor
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Gato gato = new Gato("Carmela");
        Perro unPerro = new Perro("Dunkel");
        System.out.println("El gato responde a Carmela? : " + gato.respondeA("Carmela"));
        System.out.println("Responde a Juan "+unPerro.respondeA("Juan"));
        System.out.println("Responde a Dunkel " +unPerro.respondeA("Dunkel"));
        
        //Maquina A
        unPerro.caminar();
        unPerro.saltar();
        
        //Maquina B
        gato.maullar();
        gato.correr();
    }
    
}
