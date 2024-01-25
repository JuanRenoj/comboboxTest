package com.example.comboboxtest;


import java.util.ArrayList;

public class Person {
    private int codigo;
    private String nombre, apellido, direccion;


    public Person(int codigo, String nombre, String apellido, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return

                  nombre + " \t " +
                  apellido
                ;
    }
    public static   Person getPerson(ArrayList<Person> personList, int codigo){
        Person person=null;
        for (Person li : personList){
            if (li.getCodigo()==codigo){
                person=li;
                break;
            }
        }
        return person;
    }
}
