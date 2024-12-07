import javax.swing.JOptionPane;
public class ArreglosMultiplicacion {
    public static void main(String[] yas) {
        String filas []={" ","0","1","2"};
        String columnas[]={"0","1","2"};
        byte numeros [][]= new byte[4][3];
        byte o,p,a,i;
        
        for (o=0;o<3;o++){//filas
            for (p=0;p<3;p++){//columnas
                numeros [o][p]= Byte.parseByte(JOptionPane.showInputDialog("Ingresa numeros del 1 al 9"));
                
            }
        }
         for (o=0;o<=3;o++){
            System.out.print(filas[o]+"\t");
        }
        System.out.println("\n");
        for (o=0;o<=2;o++){
            System.out.print(columnas[o]+"\t");
            
            for (p=0;p<3;p++){
                System.out.print(numeros[o][p]+"\t"); 
            }
            System.out.println("\n");
        }
        System.out.println("\n");
        for (a=0;a<3;a++){//filas
            for (i=0;i<3;i++){//columnas
                numeros [a][i]= Byte.parseByte(JOptionPane.showInputDialog("Ingresa numeros del 1 al 9"));
                
            }
        }
         for (a=0;a<=3;a++){
            System.out.print(filas[a]+"\t");
        }
        System.out.println("\n");
        for (a=0;a<=2;a++){
            System.out.print(columnas[a]+"\t");
            
            for (i=0;i<3;i++){
                System.out.print(numeros[a][i]+"\t"); 
            }
            System.out.println("\n");
        }
        
    }
    
}
