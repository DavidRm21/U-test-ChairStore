import java.util.Scanner;

/**
 * Write a description of class Main here.
 *
 * @author (Cristian Romero)
 * @version (23-05-13)
 */
public class Main
{
    // Mostrar los productos de la categoria y devolver la cantidad de articulos adquiridos
    
    public static int showCategoryOption(Articles[] articles, int quantities){
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < articles.length; i++){
                System.out.println((i+1) + ". " + articles[i].article + "    $" + articles[i].price);
            }
            System.out.println("\nDigite el producto que desea adquirir: ");
            int option = sc.nextInt();
            System.out.println("\nSelección: " + articles[option - 1].article);
            System.out.println("Digite la cantidad: ");
            int quantity = sc.nextInt();
            
            System.out.println("\n\tProducto: " + articles[option - 1].article);
            System.out.println("\tCantidad: " + quantity);
            System.out.println("¿Los datos son correctos? \n1. Si \n2. No");
            option = sc.nextInt();
            
            if(option == 1){
                articles[option - 1].quantity += quantity;
                quantities += quantity;
            }
            return  quantities;
    }
    
    // Muestra los items adquiridos
    
    public static float showPurchasedItems(Articles[] articles){
        float total = 0;
        for (int i = 0; i < articles.length ; i++){
            if(articles[i].quantity > 0){
                System.out.println("\t" + articles[i].article + "    $" + articles[i].price + " - " + articles[i].quantity + " unds");
                total += (articles[i].price * articles[i].quantity);
            }
        }
        return total;
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String name = "", lastName = "", address = "", phone = "", company = "", nit = "";
        int isCompany = 0, option = 0, quantity = 0, quantities = 0;
        float discount = 0, total = 0;
        
        Articles[] articlesA = new Articles[] {
            new Articles("Silla interlocutora", 70000, 0), 
            new Articles("Silla plástica de auditorio", 85000, 0),
            new Articles("Silla para teatro", 110000, 0)
        };
        Articles[] articlesE = new Articles[] {
            new Articles("Silla ergonómica portable", 210000, 0),
            new Articles("Silla para oficina", 70000, 0),
            new Articles("Silla de cuero", 90000, 0)
        };
        Articles[] articlesI = new Articles[] {
            new Articles("Silla metálica", 35000, 0),
            new Articles("Silla de madera", 65000, 0),
            new Articles("Silla plástica", 45000, 0)
        };
        
        
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
                    quantities = showCategoryOption(articlesA, quantities);
                    break;
                case 2:
                    quantities = showCategoryOption(articlesE, quantities);
                    break;
                case 3: 
                    quantities = showCategoryOption(articlesI, quantities);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            
            System.out.println("\n\n¿Continuar comprando?\n1. Si, seguir comprando.\n2. No, finalizar compra.");
            option = sc.nextInt();
            
        }while(option == 1);
        
        if(quantities > 100){
            discount = 8;
        }else if(quantities > 350){
            discount = 20;
        }else if(quantities > 800){
            discount = 30;
        }
        
        System.out.println("\n\n\n\n");
        
        if(isCompany == 1){
            System.out.println("\tEmpresa: " + company);
            System.out.println("\tNIT: " + nit);
        }
        
        System.out.println("\tCliente: " + name + " " + lastName);
        System.out.println("\tDirección: " + address);
        System.out.println("\tTeléfono: " + phone);
        System.out.println("\n");
        
        total += showPurchasedItems(articlesA);
        total += showPurchasedItems(articlesE);
        total += showPurchasedItems(articlesI);
        
        System.out.println("\n\t*******************************\n");
        System.out.println("\tUnds adquiridas: " + quantities);
        System.out.println("\tDescuento: " + discount);
        System.out.println("\tTotal de la compra: " + total);
        discount = total * (discount / 100);
        System.out.println("\tTotal a pagar: " + (total - discount));
    }
}
