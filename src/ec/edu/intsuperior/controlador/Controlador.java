/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.formulario.*;

/**
 *
 * @author User
 */
public class Controlador {
    Loggin loggin = new Loggin (this);
    Administrador administrador = new Administrador(this);
    Cliente cliente = new Cliente (this);
    Empleado empleado = new Empleado (this);
}
