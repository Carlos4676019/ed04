package org.example;

import java.util.*;

/**
 * Clase agenda de contactos que implementa la interfaz IAgenda.
 */
public class Agenda implements IAgenda {
    private List<Persona> contacts; // Lista de contactos

    /**
     * Constructor de la clase Agenda.
     * Inicializa una lista vacía de contactos.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Agrega un contacto a la agenda. Si el contacto ya existe, añade un nuevo número.
     *
     * @param name  Nombre del contacto.
     * @param phone Número de teléfono del contacto.
     */
    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Elimina un contacto de la agenda por su nombre.
     *
     * @param name Nombre del contacto a eliminar.
     */
    @Override
    public void removeContact(String name) {
        contacts.removeIf(c -> c.getName().equalsIgnoreCase(name));
    }

    /**
     * Modifica un número de teléfono de un contacto.
     *
     * @param name     Nombre del contacto.
     * @param oldPhone Número de teléfono antiguo.
     * @param newPhone Nuevo número de teléfono.
     */
    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();
                int index = phones.indexOf(oldPhone);
                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Obtiene la lista de contactos de la agenda.
     *
     * @return Lista de contactos.
     */
    @Override
    public List<Persona> getContacts() {
        return this.contacts;
    }
}
