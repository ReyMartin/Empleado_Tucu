package ej_empleado;

public class Empleado {

    private String Nombre;
    private String Apellido;
    private Integer Sueldo;
    private Integer horas_trabajadas;
    private Integer horas_extras;
    private Integer sueldo_bruto;
    private Integer antiguedad = 800 , cant_agnos;
   
    
  public Empleado(String Nombre, String Apellido){
      
      this.Nombre = Nombre;
      this.Apellido = Apellido;
  }


  public void cant_horas_trbajadas(Integer phoras_trabajadas){
      
      this.horas_trabajadas = phoras_trabajadas;
      this.Sueldo = horas_trabajadas*8*20;  // esta ecuacion pide horas normales trajadas + horas diarias que se trabajaron + dias trabajados del mes
  }
  
    public Integer dame_sueldo(){
        
        return Sueldo;
}
  
    public void cant_horas_extras(Integer phoras_extras){  //seteo cantidad de horas extras que tuvo.
        
        this.horas_extras = phoras_extras;
        this.horas_extras = horas_extras*150;  //Pido que calcule las horas extras, y que devuelva el resultado.
    }
    
    
    public Integer dame_horas_extras(){     
        
        return horas_extras;
    }
    
    
    public Integer dame_sueldo_bruto(){
        
        sueldo_bruto = Sueldo + horas_extras;
        
        return sueldo_bruto;
    }
    
   
    public void cant_agnos_antiguedad(Integer pcant_agnos){
        
        this.cant_agnos = pcant_agnos;
    
        
    }
    
     public Integer dame_antiguedad(){
        
        return ;
        
        
        
    }

    



}

