/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Néstor
 */
public class Gato implements IMamifero
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
    public void maullar()
    {
        System.out.println("miau");
    }
    @Override
    public void caminar()
    {
        System.out.println("El gato camina");
    }
    @Override
    public void correr()
    {
        System.out.println("El gato corre");
    }
    @Override
    public void saltar()
    {
        System.out.println("El gato salta");
    }
    public boolean respondeA(String unNombre)
    {
        return this.nombre.equals(unNombre);
    }
}
