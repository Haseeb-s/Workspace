import java.util.Collection;
import java.util.Scanner;

public class Main{
    public static BST abst = new BST();
    public static void main(String[] args) throws BSTUnderflowException{
        // TODO Auto-generated method stub
        Collection alist;
        abst.populateBST();
        abst.balanceRecursive(0,5);
        alist = abst.traversal(Order.POSTORDER);
        System.out.println(alist.toString());
        BSTNode blt = new BSTNode("BLT");
        blt.setParts("Bacon, Lettuce, Tomato, Bread, Cheese");
        System.out.println(abst.contains(blt));
        boolean found = true;
        if (found) {
            System.out.println(abst.search("BLT"));
        }
        else{
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Item not found.");
            System.out.print("Enter new food name(0 to quit): ");
            String newName = keyboard.nextLine();
            if(newName!= "0"){
            System.out.print("\nEnter new food ingredients seperated by ',': ");
            String newIngredients = keyboard.nextLine();
            abst.add(newName,newIngredients);
            }

        }
        abst.remove("BLT");
        alist = abst.traversal(Order.POSTORDER);
        System.out.println(alist.toString());
        //FB,HD,HC,BLT,PB
        System.out.println(alist.toString());
    }
}
