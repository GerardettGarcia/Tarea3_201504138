 
package tarea3;
  import java.util.Scanner;


public class Tarea3 {
    public static void main(String[] args) {
        int valor;
        Scanner desicion=new Scanner(System.in);
        int ress=0;
        int conta=0;
        int div=10;
        
        int a=0;
        int b=0;
        int c=0;
        
        int matriz [][]= new int[6][6];
        Scanner dentro = new Scanner(System.in);
        int promedio1=0;
        int promedio2=0;
        int promedio3=0;
        int promedio4=0;
        int promedio5=0;
        int promedio6=0;
 int numero = 0;
 while(numero !=5){
 Scanner entrada = new Scanner(System.in);
 System.out.println("[IPC1]Tarea3_201504138");
 System.out.println("1.Usuarios");
 System.out.println("2.Contador de Digitos");
 System.out.println("3.Tres numeros de mayor a menor");
 System.out.println("4.Calcular promedio");
 System.out.println("5.Salir");
 numero = entrada.nextInt();
   switch(numero){
    case 1:  
        String usuario[]= new String[5];
        int opcion=0;
        while(opcion!=4){
        Scanner tecla = new Scanner(System.in);
        System.out.println("1.Ingresar Usuarios");
        System.out.println("2.Mostrar Usuarios Ascendente");
        System.out.println("3.Mostrar Usuarios Descendente");
        System.out.println("4.Menu Principal");
        opcion = tecla.nextInt(); 
           switch(opcion){
               case 1: 
                    Scanner guardar = new Scanner(System.in);
                      for(int i=0; i<usuario.length; i++){          
                      System.out.print("Ingrese Usuarios "+(i+1)+":");
                      usuario[i] = guardar.next();   
                      }          
               break;
               case 2: 
                    System.out.println(usuario[4]);
                    System.out.println(usuario[3]);
                    System.out.println(usuario[2]);
                    System.out.println(usuario[1]);
                    System.out.println(usuario[0]);
               break;
               case 3:
                   System.out.println(usuario[0]);
                   System.out.println(usuario[1]);
                   System.out.println(usuario[2]);
                   System.out.println(usuario[3]);
                   System.out.println(usuario[4]);
                break;
                case 4: break;
           }        
        }
        
    break;
    case 2:
        int entrar=0;
        while(entrar!=3){
        Scanner partida = new Scanner(System.in);
        System.out.println("1.Ingresar Número");
        System.out.println("2.Mostrar Dígitos del Número");
        System.out.println("3.Menu Principal");
        entrar = partida.nextInt();    
           
           switch(entrar){
                case 1: 
                     
                   System.out.println("Ingrese un Número");
                   valor=desicion.nextInt();
                   if(valor>0 && valor<100000){
                          do{
                            ress=valor/div;
                            conta++;
                            div=div*10;
                          }while(ress>=1); 
                   }else System.out.println("el numero no esta dentro del rango");
                   
                break;
                case 2:
                   
                   System.out.println("Los digitos del númeroson: "+conta+".");
                 
                break;
                case 3: break;
        }        
        }     
                
              
    break;
    case 3:
          
        int ingreso=0;
        while(ingreso!=3){
        Scanner abierto = new Scanner(System.in);
        System.out.println("1.Ingresar Números");
        System.out.println("2.Mostrar ordenados");
        System.out.println("3.Menu Principal");
        ingreso = abierto.nextInt();  
            
           switch(ingreso){        
                case 1: 
                   Scanner a1=new Scanner(System.in);
                   Scanner a2=new Scanner(System.in);
                   Scanner a3=new Scanner(System.in); 
                   System.out.println("Ingrese 3 números");
                   System.out.println("Número 1: ");
                   a= a1.nextInt();
                   System.out.println("Número 2: ");
                   b= a2.nextInt();
                   System.out.println("Número 3: ");
                   c= a3.nextInt();
                 
                break;
                case 2: 
                   if(a>b && b>c){
                      System.out.println("De Mayor a Menor: "+a+","+b+","+c+".");
                   }else
                   if(a>c &&c>b){
                      System.out.println("De Mayor a Menor: "+a+","+c+","+b+".");
                   }else
                   if(b>a && a>c){
                      System.out.println("De Mayor a Menor: "+b+","+a+","+c+".");
                   }else
                   if(b>c &&c>a){
                      System.out.println("De Mayor a Menor: "+b+","+c+","+a+".");
                   }else
                   if(c>a && a>b){
                      System.out.println("De Mayor a Menor: "+c+","+a+","+b+".");
                   }else
                   if(c>b && b>a){
                      System.out.println("De Mayor a Menor: "+c+","+b+","+a+".");
                   }
                   
                break;
                case 3: break;
               
            }   
        }
    break;
    case 4:      
        int ent=0;
        while(ent!=3){
        Scanner par = new Scanner(System.in);
        System.out.println("1.Ingresar Alumnos");
        System.out.println("2.Mostrar Promedio");
        System.out.println("3.Menu Principal");
        ent = par.nextInt();    
        
        
           switch(ent){
               case 1: 
                   
                   
                   System.out.println("Ingrese datos del alumno 1:");
                   System.out.println("Ingrese el IDE");
                   matriz[0][0]=entrada.nextInt();
                   System.out.println("Ingrese Nota 1");
                   matriz[0][1]=entrada.nextInt();
                   System.out.println("Ingrese Nota 2");
                   matriz[0][2]=entrada.nextInt();
                   System.out.println("Ingrese Nota 3");
                   matriz[0][3]=entrada.nextInt();
                   System.out.println("Ingrese Nota 4");
                   matriz[0][4]=entrada.nextInt();
                   
                   System.out.println("Ingrese datos del alumno 2:");
                   System.out.println("Ingrese el IDE");
                   matriz[1][0]=entrada.nextInt();
                   System.out.println("Ingrese Nota 1");
                   matriz[1][1]=entrada.nextInt();
                   System.out.println("Ingrese Nota 2");
                   matriz[1][2]=entrada.nextInt();
                   System.out.println("Ingrese Nota 3");
                   matriz[1][3]=entrada.nextInt();
                   System.out.println("Ingrese Nota 4");
                   matriz[1][4]=entrada.nextInt();
                   
                   System.out.println("Ingrese datos del alumno 3:");
                   System.out.println("Ingrese el IDE");
                   matriz[2][0]=entrada.nextInt();
                   System.out.println("Ingrese Nota 1");
                   matriz[2][1]=entrada.nextInt();
                   System.out.println("Ingrese Nota 2");
                   matriz[2][2]=entrada.nextInt();
                   System.out.println("Ingrese Nota 3");
                   matriz[2][3]=entrada.nextInt();
                   System.out.println("Ingrese Nota 4");
                   matriz[2][4]=entrada.nextInt();
                   
                   System.out.println("Ingrese datos del alumno 4:");
                   System.out.println("Ingrese el IDE");
                   matriz[3][0]=entrada.nextInt();
                   System.out.println("Ingrese Nota 1");
                   matriz[3][1]=entrada.nextInt();
                   System.out.println("Ingrese Nota 2");
                   matriz[3][2]=entrada.nextInt();
                   System.out.println("Ingrese Nota 3");
                   matriz[3][3]=entrada.nextInt();
                   System.out.println("Ingrese Nota 4");
                   matriz[3][4]=entrada.nextInt();
                   
                   System.out.println("Ingrese datos del alumno 5:");
                   System.out.println("Ingrese el IDE");
                   matriz[4][0]=entrada.nextInt();
                   System.out.println("Ingrese Nota 1");
                   matriz[4][1]=entrada.nextInt();
                   System.out.println("Ingrese Nota 2");
                   matriz[4][2]=entrada.nextInt();
                   System.out.println("Ingrese Nota 3");
                   matriz[4][3]=entrada.nextInt();
                   System.out.println("Ingrese Nota 4");
                   matriz[4][4]=entrada.nextInt();
                   
                   System.out.println("Ingrese datos del alumno 6:");
                   System.out.println("Ingrese el IDE");
                   matriz[5][0]=entrada.nextInt();
                   System.out.println("Ingrese Nota 1");
                   matriz[5][1]=entrada.nextInt();
                   System.out.println("Ingrese Nota 2");
                   matriz[5][2]=entrada.nextInt();
                   System.out.println("Ingrese Nota 3");
                   matriz[5][3]=entrada.nextInt();
                   System.out.println("Ingrese Nota 4");
                   matriz[5][4]=entrada.nextInt();
                   
                   promedio1=((matriz[0][1]+matriz[0][2]+matriz[0][3]+matriz[0][4])/4);
                   matriz[0][5]= (int)promedio1;
                   
                   promedio2=((matriz[1][1]+matriz[1][2]+matriz[1][3]+matriz[1][4])/4);
                   matriz[1][5]= (int)promedio2;
                   
                   promedio3=((matriz[2][1]+matriz[2][2]+matriz[2][3]+matriz[2][4])/4);
                   matriz[2][5]= (int)promedio3;
                   
                   promedio4=((matriz[3][1]+matriz[3][2]+matriz[3][3]+matriz[3][4])/4);
                   matriz[3][5]= (int)promedio4;
                   
                   promedio5=((matriz[4][1]+matriz[4][2]+matriz[4][3]+matriz[4][4])/4);
                   matriz[4][5]= (int)promedio5;
                   
                   promedio6=((matriz[5][1]+matriz[5][2]+matriz[5][3]+matriz[5][4])/4);
                   matriz[5][5]= (int)promedio6;
                   
                break;
                case 2: 
                  for(int fila=0; fila<matriz.length; fila++){
                       for(int columna=0; columna<matriz.length; columna++){
                           System.out.print(matriz[fila][columna]+"\t");    
                       }
                           System.out.println();
                      }
                  
                  
                break;
                case 3: break;
           
        }
        
        
        }
        
        
    break;
    case 5: 
    break;
            default: System.out.print("ERROR OPCION NO VALIDA");
        }
           
        }
      
     } 
   
        
        
        
        }
    
    

