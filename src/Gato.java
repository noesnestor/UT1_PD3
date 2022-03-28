/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Néstor
 */
public class Gato 
{
    private String nombre;
    
    public Gato(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public void ladrar()
    {
        System.out.println("Wof");
    }
    public boolean respondeA(String unNombre)
    {
        return this.nombre.equals(unNombre);
    }
}
