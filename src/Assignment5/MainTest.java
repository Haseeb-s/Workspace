import junit.framework.TestCase;

import java.util.Collection;
import java.util.LinkedList;

public class MainTest extends TestCase {
    BST testBST;

    public void testPOSTORDER(){
        Main.abst.populateBST();
        testBST = Main.abst;
        Collection<String> alist = testBST.traversal(Order.POSTORDER);
        assertEquals("[Fritos Burritos, Hot Dog, Ham and Cheese, BLT, PB&J]", alist.toString());
    }

    public void testPREORDER() throws BSTUnderflowException {
        testBST = Main.abst;
        Collection<String> alist = testBST.traversal(Order.PREORDER);
        assertEquals("[PB&J, BLT, Ham and Cheese, Fritos Burritos, Hot Dog]", alist.toString());
    }

    public void testINORDER() throws BSTUnderflowException {
        testBST = Main.abst;
        Collection<String> alist = testBST.traversal(Order.INORDER);
        assertEquals("[BLT, Fritos Burritos, Ham and Cheese, Hot Dog, PB&J]", alist.toString());
    }


}
