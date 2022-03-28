/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Néstor
 */
public class Perro implements IMamifero
{
    private String nombre;
    
    public Perro (String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public void ladrar()
    {
        System.out.println("wof");
    }
    @Override
    public void caminar()
    {
        System.out.println("El perro camina");
    }
    @Override
    public void correr()
    {
        System.out.println("El perro corre");
    }
    @Override
    public void saltar()
    {
        System.out.println("El perro salta");
    }
    public boolean respondeA(String unNombre)
    {
        return this.nombre.equals(unNombre);
    }
    
}
