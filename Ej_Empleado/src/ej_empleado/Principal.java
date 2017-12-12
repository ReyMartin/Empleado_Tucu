package ej_empleado;

public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here

        Empleado empleado_1 = new Empleado("Martin","Rodriguez");
        Empleado empleado_2 = new Empleado("Marcelo","Perez");
        Empleado empleado_3 = new Empleado("Maria","Gomez");
        
        empleado_1.cant_horas_trbajadas(120);  //Setter---Defino la cantidad de horas normales que tuvo.
        empleado_1.dame_sueldo();  //Getter---Pido el sueldo de un empleado cualquiera.
        empleado_1.cant_horas_extras(2);  //Setter---Defino la cantidad de horas extras que tuvo.
        empleado_1.cant_agnos_antiguedad(5);  //Setter---Defino la cantidad de años de antiguedad.
        
        System.out.println("El Sueldo de Martin Rodriguez es de $ : " + empleado_1.dame_sueldo());
        System.out.println("Cantidad de horas extras en $ : " + empleado_1.dame_horas_extras());
        System.out.println("Sueldo bruto del empleado en $ : " + empleado_1.dame_sueldo_bruto());
        System.out.println("Antiguedad del empleado es de " + empleado_1.dame_antiguedad() + " años ");


    }
    
}
