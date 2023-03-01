package pruebadeoperadores;

public class PruebaDeOperadores {

     int x,y = 2; 
        double z = 3.0;
    
        public void Operaciones(){
        
        x = 5;
        System.out.println("x + y + z = " + (x + y + z));
        x += y;
        y++;
        z--;
        z *= x;
        System.out.println("x + y + z = " + (x + y + z));
        }   
    public static void main(String[] args){
       PruebaDeOperadores Operaciones=new PruebaDeOperadores ();
       Operaciones.Operaciones();
    }


}
