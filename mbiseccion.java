

public class mbiseccion{
    
    
    public static void main(String[] args) {
       
        double a=2;
        double b=1;
        System.out.println("El valor de a es "+ a);
        System.out.println("El valor de a es "+ b);
        
        double funcion;
        double Xr=(a+b)/2;
        System.out.println("Xr es igual a  "+Xr);
        
        
        do{
           
            funcion=((Math.pow(Xr,3))+(4*(Math.pow(Xr,2)))-10);
            System.out.println("Funcion en f(x) actual es "+ funcion);
            
            if(funcion>0){
            a=Xr;
            Xr=(a+b)/2;
            System.out.println("Xr es igual a  "+ Xr);
                }else{
                    b=Xr;
                    Xr=Xr=(a+b)/2;
                    System.out.println("Xr es igual a "+ Xr);
        }
            if(funcion==0){
                System.out.println("Raiz aproximada es igual a "+ Xr);
                System.exit(0);
            }
        }while(Xr>=0);
        
            
        }
        
}



