
import java.util.Scanner;



  
  

  public class interfaz {
    static String[] cuentas = new String[2]; 
    static String[] nip = new String[2];
    static String [] nombredelusuario = new String [2];
    static String [] numerodecelular = new  String [2];
    static int usuariosRegistrados = 1; 
    static int Intentos = 3;
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        cuentas[0] = "44763041"; 
        nip [0] = "1326"; 
         
       
        
        
        int opcion;
        do{ 
            System.out.println("Menú Cajero:");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");
            System.out.print("Elija opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
         switch (opcion) {
                case 1:
                    agregarUsuario(sc);
                    break;
                
                case 2:
                    iniciarSesion(sc);
                    break;
                
                case 3:
                    System.out.println("Gracias por su preferencia");
                    break;
               
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }

   
        public static void agregarUsuario (Scanner sc){
        if (usuariosRegistrados >= cuentas.length) {
            System.out.println("No se pueden agregar más usuarios.");
            return;
        }
        System.out.println("Ingrese nombre completo");
        nombredelusuario[usuariosRegistrados]= sc.nextLine();
        System.out.println("numero de telefono");
        numerodecelular[usuariosRegistrados]= sc.nextLine();
        System.out.print("Ingresa la cuenta: ");
        cuentas[usuariosRegistrados] = sc.nextLine();
        System.out.print("Ingresa el NIP: ");
        nip[usuariosRegistrados] = sc.nextLine();
        usuariosRegistrados++;
        System.out.println("Usuario agregado correctamente.");
    }

    public static void iniciarSesion(Scanner sc) {
        System.out.print("Ingresa tu cuenta: ");
        String cuentaIngresada = sc.nextLine();
        System.out.print("Ingresa tu NIP: ");
        String nipIngresado = sc.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < usuariosRegistrados;  i++ ) {
           
            if (cuentas[i].equals(cuentaIngresada) && nip[i].equals(nipIngresado)){
            
                encontrado = true;
                System.out.println("Operacion a realizar");
                 break;
            }
        }
        if (!encontrado) {
            System.out.println("Cuenta o NIP incorrectos.");
        }
    }
}


