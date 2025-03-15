package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase de contacto en la agenda.
 */
public class Persona {
    private String name;
    private List<String> phones;

    /**
     * Constructor de la clase Contacto.
     *
     * @param name  Para el nombre del contacto.
     * @param phone Para el número de teléfono del contacto.
     */
    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Obtener el nombre del contacto.
     *
     * @return Nombre del contacto.
     */
    public String getName() {return this.name;}

    /**
     * Modificar el nombre del contacto.
     *
     * @param name Nuevo nombre del contacto.
     */
    public void setName(String name) {this.name = name;}

    /**
     * Obtener la lista de teléfonos del contacto.
     *
     * @return Lista de números de teléfonos ligados al contacto.
     */
    public List<String> getPhones() {return this.phones;}

    /**
     * Modificar la lista de teléfonos del contacto.
     *
     * @param phones Nueva lista de números de teléfonos.
     */
    public void setPhones(List<String> phones) {this.phones = phones;}

    /**
     * Agregar un nuevo número de teléfono al contacto.
     *
     * @param phone Número de teléfono a agregar.
     */
    public void addPhone(String phone) {this.phones.add(phone);}
}
