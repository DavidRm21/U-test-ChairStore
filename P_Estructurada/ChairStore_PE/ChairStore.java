import java.util.Scanner;

/**
 * Write a description of class ChairStore here.
 *
 * @author (Cristian Romero)
 * @version (2023-05-13)
 */
public class ChairStore
{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int option = 0, quantity = 0, isCompany = 0, quantities = 0;
        float discount = 0, total = 0;
        String name = "", lastName = "", address = "", phone = "", company = "", nit = "";
        
        String[] articlesA = new String[] 
        {"Silla interlocutora", "Silla plástica de auditorio", "Silla para teatro"};
        
        String[] articlesE = new String[] 
        {"Silla ergonómica portable", "Silla para oficina", "Silla de cuero"};
        
        String[] articlesI = new String[] 
        {"Silla metálica", "Silla de madera", "Silla plástica"};
        
        float[] pricesA = new float[] {70000, 85000, 110000};
        float[] pricesE = new float[] {210000, 70000, 90000};
        float[] pricesI = new float[] {35000, 65000, 45000};
        int[] quantityA = new int[]{0, 0, 0};
        int[] quantityE = new int[]{0, 0, 0};
        int[] quantityI = new int[]{0, 0, 0};
        
        System.out.println("Bienvenido a la tienda de Sillas");
        System.out.println("--------------------------------");
        System.out.println("Digite el nombre del Cliente: ");
        name = sc.next();
        System.out.println("Digite el apellido del Cliente: ");
        lastName = sc.next();
        System.out.println("Digite la dirección: ");
        address = sc.next();
        System.out.println("Digite el número de teléfono: ");
        phone = sc.next();
        System.out.println("¿El Cliente es empresarial? \n1. Si\n0. No");
        isCompany = sc.nextInt();
        
        if (isCompany == 1){
            System.out.println("Digite el nombre de la empresa: ");
            company = sc.next();
            System.out.println("Digite el nit de la empresa: ");
            nit = sc.next();
        }
        
        do{
            System.out.println("\n\nSeleccione el tipo de silla.");
            System.out.println("1. Auditorio\n2. Ergonómicas\n3. Invitados");
            option = sc.nextInt();
            
            while(option > 3 && option < 1){
                option = sc.nextInt();
            }
            
            switch(option){
                case 1:
                    for(int i = 0; i < articlesA.length; i++){
                        System.out.println((i+1) + ". " + articlesA[i] + "    $" + pricesA[i]);
                    }
                    System.out.println("\nDigite el producto que desea adquirir: ");
                    option = sc.nextInt();
                    System.out.println("Selección: " + articlesA[option - 1]);
                    System.out.println("Digite la cantidad: ");
                    quantity = sc.nextInt();
                    
                    System.out.println("\n\tProducto: " + articlesA[option - 1]);
                    System.out.println("\tCantidad: " + quantity);
                    System.out.println("¿Los datos son correctos? \n1. Si \n2. No");
                    option = sc.nextInt();
                    
                    if(option == 1){
                        quantityA[option - 1] = quantities += quantity;
                    }
                    
                    break;
                case 2: 
                    for(int i = 0; i < articlesE.length; i++){
                        System.out.println((i+1) + ". " + articlesE[i] + "    $" + pricesE[i]);
                    }
                    System.out.println("\nDigite el producto que desea adquirir: ");
                    option = sc.nextInt();
                    System.out.println("Selección: " + articlesE[option - 1]);
                    System.out.println("Digite la cantidad: ");
                    quantity = sc.nextInt();
                    
                    System.out.println("\n\tProducto: " + articlesA[option - 1]);
                    System.out.println("\tCantidad: " + quantity);
                    System.out.println("¿Los datos son correctos? \n1. Si \n2. No");
                    option = sc.nextInt();
                    
                    if(option == 1){
                        quantityE[option - 1] = quantities += quantity;
                    }
                    
                    break;
                case 3:
                    for(int i = 0; i < articlesI.length; i++){
                        System.out.println((i+1) + ". " + articlesI[i] + "    $" + pricesI[i]);
                    }
                    System.out.println("\nDigite el producto que desea adquirir: ");
                    option = sc.nextInt();
                    System.out.println("Selección: " + articlesI[option - 1]);
                    System.out.println("Digite la cantidad: ");
                    quantity = sc.nextInt();
                    
                    System.out.println("\n\tProducto: " + articlesA[option - 1]);
                    System.out.println("\tCantidad: " + quantity);
                    System.out.println("¿Los datos son correctos? \n1. Si \n2. No");
                    option = sc.nextInt();
                    
                    if(option == 1){
                        quantityI[option - 1] = quantities += quantity;
                    }
                    
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
                    
            }
            
            
            System.out.println("\n\n¿Continuar comprando?\n1. Si, seguir comprando.\n2. No, finalizar compra.");
            option = sc.nextInt();
            
        }while(option == 1);
        
        // Aplicación del descuento de acuerdo al número de unidades adquiridas
        
        if(quantities > 250){
            discount = 8;
        }else if(quantities > 700){
            discount = 20;
        }else if(quantities > 1000){
            discount = 30;
        }
        
        // Impresión de la factura final
        
        if(isCompany == 1){
            System.out.println("\n\n\n\n\tEmpresa: " + company);
            System.out.println("\tNIT: " + nit);
        }
        
        System.out.println("\tCliente: " + name + " " + lastName);
        System.out.println("\tDirección: " + address);
        System.out.println("\tTeléfono: " + phone);
        System.out.println("\n\n\n");
        for (int i = 0; i < articlesA.length ; i++){
            if(quantityA[i] > 0){
                System.out.println("\t" + articlesA[i] + "    $" + pricesA[i] + " - " + quantityA[i] + "unds");
                total += (pricesA[i]*quantityA[i]);
            }
            if(quantityE[i] > 0){
                System.out.println("\t" + articlesE[i] + "    $" + pricesE[i] + " - " + quantityE[i] + "unds");
                total += (pricesE[i]*quantityE[i]);
            }
            if(quantityI[i] > 0){
                System.out.println("\t" + articlesI[i] + "    $" + pricesI[i] + " - " + quantityI[i] + "unds");
                total += (pricesI[i]*quantityI[i]);
            }
        }
        System.out.println("\n\t*******************************\n" + total);
        System.out.println("\tUnds adquiridas: " + quantities);
        System.out.println("\tDescuento: " + discount);
        System.out.println("\tTotal de la compra: " + total);
        discount = total * (discount / 100);
        System.out.println("\tTotal a pagar: " + (total - discount));
    }
}
