/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.supermercado_cine;

/**
 *
 * @author JOSE SANDOVAL
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<SuperCliente> listaclientess = new ArrayList<>();
        ArrayList<SuperEmpleado> listaEmpleados = new ArrayList<>();
        ArrayList<SuperProducto> listaProductos= new ArrayList<>();
        ArrayList<SuperProveedor> listaProveedors = new ArrayList<>();
        ArrayList<SuperSeccion> listaSeccions = new ArrayList<>();
        ArrayList<CinCliente> listaClientec = new ArrayList<>();
        ArrayList<CinEmpleado> listaEmpleadoc = new ArrayList<>();
        ArrayList<CinProductoComida> listaProductoComidac = new ArrayList<>();
        ArrayList<CinSala> listaSalac = new ArrayList<>();
        ArrayList<CinTicket> listaTicketc = new ArrayList<>();

        boolean F = true;
        while (F == true) {
            System.out.println(" \n  \n  \n ");
            System.out.println("BIENVENIDO AL SISTEMA");
            System.out.println("ELIJA MENU");
            System.out.println("(1)SUPERMERCADO");
            System.out.println("(2)CINE");
            System.out.println("(3)SALIR");
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "NUMERO"));
            switch (num) {
                case 1:
                    Main.MENUSUPER();
                    int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "NUMERO"));
                    switch (num1) {
                        case 1:
                            Main.SUBVSUPER();
                            int num9 = Integer.parseInt(JOptionPane.showInputDialog(null, "NUMERO"));
                            switch (num9) {
                                case 1:
                                    VERCLIENTESSU(listaclientess);
                                    break;
                                case 2:
                                    VEREMPLEADOSSU(listaEmpleados);
                                    break;
                                case 3:
                                    VERPRODUCTOSU(listaProductos);
                                    break;
                                case 4:
                                    VERPROVEEDORSU(listaProveedors);
                                    break;
                                case 5:
                                    VERSECCIONSU(listaSeccions);
                                    break;
                            }
                            break;
                        case 2:
                            Main.SUBASUPER();
                            int num8 = Integer.parseInt(JOptionPane.showInputDialog(null, "NUMERO"));
                            switch (num8) {
                                case 1:
                                    AGREGARCLIENTESU(listaclientess);
                                    break;
                                case 2:
                                    AGREGAREMPLEADOSSU(listaEmpleados);
                                    break;
                                case 3:
                                    AGREGARPRODUCTOSSU(listaProductos);
                                    break;
                                case 4:
                                    AGREGARPROVEEDORSU(listaProveedors);
                                    break;
                                case 5:
                                    AGREGARSECCIONSU(listaSeccions);
                                    break;
                            }
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 2:
                    Main.MENUCINE();
                    int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "NUMERO"));
                    switch (num2) {
                        case 1:
                            Main.SUBVCINE();
                            int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "NUMERO"));
                            switch (num3) {
                                case 1:
                                    VERCLIENTESCI(listaClientec);
                                    break;
                                case 2:
                                    VEREMPLEADOCI(listaEmpleadoc);
                                    break;
                                case 3:
                                    VERPRODUCTOCOMIDACI(listaProductoComidac);
                                    break;
                                case 4:
                                    VERSALASCI(listaSalac);
                                    break;
                                case 5:
                                    VERTICKETSCI(listaTicketc);
                                    break;
                            }
                            break;
                        case 2:
                            Main.SUBACINE();
                            int num4 = Integer.parseInt(JOptionPane.showInputDialog(null, "NUMERO"));
                            switch (num4) {
                                case 1:
                                    AGREGARCLIENTECI(listaClientec);
                                    break;
                                case 2:
                                    AGREGAREMPLEADOCI(listaEmpleadoc);
                                    break;
                                case 3:
                                    AGREGARPRODUCTODECOMIDACI(listaProductoComidac);
                                    break;
                                case 4:
                                    AGREGARSALASCI(listaSalac);
                                    break;
                                case 5:
                                    AGREGARTICKETSCI(listaTicketc);
                                    break;
                            }
                            break;
                        case 3:
                            break;
                    }
                    break;

                case 3:
                    F=false;
                    break;
            }
        }
    }

    public static void MENUSUPER() {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("(1)VER ELEMENTOS DEL SUPERMERCADO");
        System.out.println("(2)AGREGAR ELEMENTOS DEL SUPERMERCADO");
        System.out.println("(3)SALIR");
    }

    public static void MENUCINE() {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("(1)VER ELEMENTOS DEL CINE");
        System.out.println("(2)AGREGAR ELEMENTOS DEL CINE");
        System.out.println("(3)SALIR");
    }

    public static void SUBASUPER() {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("(1)Agregar Cliente");
        System.out.println("(2)Agregar Empleado");
        System.out.println("(3)Agregar Producto");
        System.out.println("(4)Agregar Proveedor");
        System.out.println("(5)Agregar Seccion");
    }

    public static void SUBACINE() {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("(1)Agregar Cliente");
        System.out.println("(2)Agregar Empleado");
        System.out.println("(3)Agregar Producto de Comida");
        System.out.println("(4)Agregar Sala");
        System.out.println("(5)Agregar Ticket");
    }

    public static void SUBVSUPER() {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("(1)Ver clientes");
        System.out.println("(2)Ver empleados");
        System.out.println("(3)Ver productos");
        System.out.println("(4)Ver proveedores");
        System.out.println("(5)Ver secciones");
    }

    public static void SUBVCINE() {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("(1)Ver clientes");
        System.out.println("(2)Ver empleados");
        System.out.println("(3)Ver productos de comida ");
        System.out.println("(4)Ver salas");
        System.out.println("(5)Ver tickets");
    }

    public static void VERCLIENTESSU(ArrayList<SuperCliente> lista) {

        System.out.println("**********************************");
        System.out.println("los clientes registrados son: ");
        for (SuperCliente i : lista) {
            System.out.println(i);
        }
        System.out.println("***********************************");

    }

    public static void AGREGARCLIENTESU(ArrayList<SuperCliente> listaclientess) {

        System.out.println("-----------------------------------------------");
        System.out.println("Digite la informacion del cliente");
        System.out.print("nombre:");
        String nombre = JOptionPane.showInputDialog(null, "");
        System.out.println(nombre);
        System.out.print("cedula:");
        String cedula = JOptionPane.showInputDialog(null, "");
        System.out.println(cedula);
        System.out.print("e mail: ");
//        SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
        String email = JOptionPane.showInputDialog(null, "");
        System.out.println(email);
        System.out.print("fecha de nacimiento: ");
        String nac = (JOptionPane.showInputDialog(null, ""));
        System.out.println(nac);
        System.out.print("telefono:");
        String tele = JOptionPane.showInputDialog(null, "");
        System.out.println(tele);
        SuperCliente c1 = new SuperCliente(nombre, cedula, email, nac, tele);
        listaclientess.add(c1);

    }
    
    public static void VEREMPLEADOSSU(ArrayList<SuperEmpleado> lista) {

        System.out.println("**********************************");
        System.out.println("los empleados registrados son: ");
        for (SuperEmpleado i : lista) {
            System.out.println(i);
        }
        System.out.println("***********************************");

    }

    public static void AGREGAREMPLEADOSSU(ArrayList<SuperEmpleado> listaEmpleados) {

        System.out.println("-----------------------------------------------");
        System.out.println("Digite la informacion del empleado");
        System.out.print("tipo de empleado:");
        String tip = JOptionPane.showInputDialog(null, "");
        System.out.println(tip);
        System.out.print("nombre:");
        String nom = JOptionPane.showInputDialog(null, "");
        System.out.println(nom);
        System.out.print("cedula");
//        SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
        String ced = JOptionPane.showInputDialog(null, "");
        System.out.println(ced);
        System.out.print("sueldo");
        int sueld = Integer.parseInt(JOptionPane.showInputDialog(null, ""));
        System.out.println(sueld);
        SuperEmpleado c1 = new SuperEmpleado(tip, nom, ced, sueld);
        listaEmpleados.add(c1);

    }
    
    public static void VERPRODUCTOSU(ArrayList<SuperProducto> lista) {

        System.out.println("**********************************");
        System.out.println("los productos registrados son: ");
        for (SuperProducto i : lista) {
            System.out.println(i);
        }
        System.out.println("***********************************");

    }

    public static void AGREGARPRODUCTOSSU(ArrayList<SuperProducto> listaProductos) {

        System.out.println("-----------------------------------------------");
        System.out.println("Digite la informacion del producto");
        System.out.print("nombre:");
        String nombre = JOptionPane.showInputDialog(null, "");
        System.out.println(nombre);
        System.out.print("pasillo:");
        String pas = JOptionPane.showInputDialog(null, "");
        System.out.println(pas);
        System.out.print("tipo de producto:");
//        SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
        String tip = JOptionPane.showInputDialog(null, "");
        System.out.println(tip);
        System.out.print("zona: ");
        String zon =JOptionPane.showInputDialog(null, "");
        System.out.println(zon);
        System.out.print("precio:");
        double pre = Double.parseDouble(JOptionPane.showInputDialog(null, ""));
        System.out.print(pre);
        SuperProducto c1 = new SuperProducto(nombre, pas, tip, zon, pre);
        listaProductos.add(c1);

    }
    
    public static void VERPROVEEDORSU(ArrayList<SuperProveedor> lista) {

        System.out.println("**********************************");
        System.out.println("los proveedores registrados son: ");
        for (SuperProveedor i : lista) {
            System.out.println(i);
        }
        System.out.println("***********************************");

    }

    public static void AGREGARPROVEEDORSU(ArrayList<SuperProveedor> listaProveedores) {

        System.out.println("-----------------------------------------------");
        System.out.println("Digite la informacion del proveedor");
        System.out.print("nombre:");
        String nombre = JOptionPane.showInputDialog(null, "");
        System.out.println(nombre);
        System.out.print("telefono:");
        String tel = JOptionPane.showInputDialog(null, "");
        System.out.println(tel);
        System.out.print("producto:");
//        SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
        String pro = JOptionPane.showInputDialog(null, "");
        System.out.println(pro);
        System.out.print("NIT: ");
        String ni = (JOptionPane.showInputDialog(null, ""));
        System.out.println(ni);
        SuperProveedor c1 = new SuperProveedor(nombre, tel, pro, ni);
        listaProveedores.add(c1);

    }
    
    public static void VERSECCIONSU(ArrayList<SuperSeccion> lista) {

        System.out.println("**********************************");
        System.out.println("las secciones registradas son: ");
        for (SuperSeccion i : lista) {
            System.out.println(i);
        }
        System.out.println("***********************************");

    }

    public static void AGREGARSECCIONSU(ArrayList<SuperSeccion> listaSeccions) {

        System.out.println("-----------------------------------------------");
        System.out.println("Digite la informacion de la seccion");
        System.out.print("numero de seccion:");
        String nc = JOptionPane.showInputDialog(null, "");
        System.out.println(nc);
        System.out.print("nombre de seccion:");
        String nom = JOptionPane.showInputDialog(null, "");
        System.out.println(nom);
        System.out.print("id de seccion:");
//        SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
        String id = JOptionPane.showInputDialog(null, "");
        System.out.println(id);
        SuperSeccion c1 = new SuperSeccion(nc, nom, id);
        listaSeccions.add(c1);

    }
    
    public static void VERCLIENTESCI(ArrayList<CinCliente> lista) {

        System.out.println("**********************************");
        System.out.println("los clientes registrados son: ");
        for (CinCliente i : lista) {
            System.out.println(i);
        }
        System.out.println("***********************************");

    }

    public static void AGREGARCLIENTECI(ArrayList<CinCliente> listaclientesc) {

        System.out.println("-----------------------------------------------");
        System.out.println("Digite la informacion del cliente");
        System.out.print("nombre:");
        String nombre = JOptionPane.showInputDialog(null, "");
        System.out.println(nombre);
        System.out.print("cedula:");
        String cedula = JOptionPane.showInputDialog(null, "");
        System.out.println(cedula);
        System.out.print("fecha de nacimiento");
//        SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
        String nac = JOptionPane.showInputDialog(null, "");
        System.out.println(nac);
        System.out.print("numero de tickets comprados:");
        int tick = Integer.parseInt(JOptionPane.showInputDialog(null, ""));
        System.out.println(tick);
        System.out.print("arl:");
        String arl = JOptionPane.showInputDialog(null, "");
        System.out.println(arl);
        CinCliente c1 = new CinCliente(nombre, cedula, nac, tick, arl);
        listaclientesc.add(c1);

    }
    
    public static void VEREMPLEADOCI(ArrayList<CinEmpleado> lista) {

        System.out.println("**********************************");
        System.out.println("los empleados registrados son: ");
        for (CinEmpleado i : lista) {
            System.out.println(i);
        }
        System.out.println("***********************************");

    }

    public static void AGREGAREMPLEADOCI(ArrayList<CinEmpleado> listaempleadoC) {

        System.out.println("-----------------------------------------------");
        System.out.println("Digite la informacion del empleado");
        System.out.print("nombre:");
        String nombre = JOptionPane.showInputDialog(null, "");
        System.out.println(nombre);
        System.out.print("tipo de empleado:");
        String tip = JOptionPane.showInputDialog(null, "");
        System.out.println(tip);
        System.out.print("cedula:");
//        SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
        String ced = JOptionPane.showInputDialog(null, "");
        System.out.println(ced);
        System.out.print("sueldo:");
        double su = Double.parseDouble(JOptionPane.showInputDialog(null, ""));
        System.out.println(su);
        CinEmpleado c1 = new CinEmpleado(nombre, tip, ced, su);
        listaempleadoC.add(c1);

    }
    
    public static void VERPRODUCTOCOMIDACI(ArrayList<CinProductoComida> lista) {

        System.out.println("**********************************");
        System.out.println("los productos de comida registrados son: ");
        for (CinProductoComida i : lista) {
            System.out.println(i);
        }
        System.out.println("***********************************");

    }

    public static void AGREGARPRODUCTODECOMIDACI(ArrayList<CinProductoComida> listaProductoComidac) {

        System.out.println("-----------------------------------------------");
        System.out.println("Digite la informacion del producto de comida");
        System.out.print("nombre:");
        String nombre = JOptionPane.showInputDialog(null, "");
        System.out.println(nombre);
        System.out.print("tamano:");
        String tam = JOptionPane.showInputDialog(null, "");
        System.out.println(tam);
        System.out.print("precio");
//        SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
        double pre = Double.parseDouble(JOptionPane.showInputDialog(null, ""));
        System.out.println(pre);
        CinProductoComida c1 = new CinProductoComida(nombre, tam, pre);
        listaProductoComidac.add(c1);

    }
    
    public static void VERSALASCI(ArrayList<CinSala> lista) {

        System.out.println("**********************************");
        System.out.println("las salas registradas son: ");
        for (CinSala i : lista) {
            System.out.println(i);
        }
        System.out.println("***********************************");

    }

    public static void AGREGARSALASCI(ArrayList<CinSala> listaclientesC) {

        System.out.println("-----------------------------------------------");
        System.out.println("Digite la informacion de la sala");
        System.out.print("nombre:");
        String nombre = JOptionPane.showInputDialog(null, "");
        System.out.println(nombre);
        System.out.print("cantidad de puestos:");
        int can = Integer.parseInt(JOptionPane.showInputDialog(null, ""));
        System.out.println(can);
        System.out.print("area de la sala:");
//        SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
        int ar = Integer.parseInt(JOptionPane.showInputDialog(null, ""));
        System.out.println(ar);
        CinSala c1 = new CinSala(nombre, can, ar);
        listaclientesC.add(c1);

    }
    
    public static void VERTICKETSCI(ArrayList<CinTicket> lista) {

        System.out.println("**********************************");
        System.out.println("los tickets registrados son: ");
        for (CinTicket i : lista) {
            System.out.println(i);
        }
        System.out.println("***********************************");

    }

    public static void AGREGARTICKETSCI(ArrayList<CinTicket> listaTicketc) {

        System.out.println("-----------------------------------------------");
        System.out.println("Digite la informacion del ticket");
        System.out.print("tipo de pelicula:");
        String tip = JOptionPane.showInputDialog(null, "");
        System.out.println(tip);
        System.out.print("nombre de pelicula:");
        String nom = JOptionPane.showInputDialog(null, "");
        System.out.println(nom);
        System.out.print("codigo de ticket:");
//        SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
        String cod = JOptionPane.showInputDialog(null, "");
        System.out.println(cod);
        System.out.print("hora de funcion:");
        String hor = (JOptionPane.showInputDialog(null, ""));
        System.out.println(hor);
        CinTicket c1 = new CinTicket(tip, nom, cod, hor);
        listaTicketc.add(c1);

    }

}
