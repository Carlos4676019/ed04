package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase de contacto en la agenda.
 */

class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Constructor de la clase Contacto.
     *
     * @param name  Para el nombre del contacto.
     * @param phone Para el número de teléfono del contacto.
     */

    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Obetener el nombre del contacto.
     *
     * @return Nombre del contacto.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Obtener la lista de teléfonos del contacto.
     *
     * @return Lista de números de teléfonos ligados al contacto.
     */

    public List<String> getPhones() {
        return this.phones;
    }
}