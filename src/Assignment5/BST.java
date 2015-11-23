import java.util.Collection;
import java.util.LinkedList;

public class BST<T extends Comparable<T>> implements BSTInterface<T> {
    BSTNode<T> root, current, previous;
    Collection<T> output;
    String ingredients = null;
    String[] nameArray, partsArray;

    boolean found;
    public BST() {
        root = null;
    }

    private BSTNode<T> recAdd(T element, BSTNode<T> tree)
// Adds element to tree; tree retains its BST property.
    {
        if (tree == null) {
            // Addition place found
            tree = new BSTNode<T>(element);
            if(ingredients!=null){
                tree.setParts(ingredients);
                ingredients = null;
            }
        }
        else if (element.compareTo(tree.getElement()) <= 0)
            tree.setLeft(recAdd(element, tree.getLeft()));     // Add in left subtree
        else
            tree.setRight(recAdd(element, tree.getRight()));   // Add in right subtree
        return tree;
    }

    public void add (T element)
// Adds element to this BST. The tree retains its BST property.
    {
        root = recAdd(element, root);
    }

    public void add (T element, String ingredients)
// Adds element to this BST. The tree retains its BST property.
    {
        this.ingredients = ingredients;
        root = recAdd(element, root);
    }

    public void populateBST()
    {
        Method meth = new Method();
        meth.GetFile();
        nameArray = meth.nameArray;
        partsArray = meth.partsArray;
        for (int x =0; x<nameArray.length; x++){
           if (nameArray[x]!= null && partsArray[x] != null) {
                String name = nameArray[x];
                String ingredients = partsArray[x];
                Main.abst.add(name,ingredients);
            }
        }
    }


    @Override
    public String search(T element) throws BSTUnderflowException {
        return recSearch(element, root);
    }

    public String recSearch(T element, BSTNode<T> tree){
        if (tree == null)
            return null;             // element is not found
        else if (element.compareTo(tree.getElement()) < 0)
            return recSearch(element, tree.getLeft());          // get from left subtree
        else
        if (element.compareTo(tree.getElement()) > 0)
            return recSearch(element, tree.getRight());         // get from right subtree
        else
            return tree.getParts();  // element is found

    }
    @Override
    public boolean contains(T element) throws BSTUnderflowException {
        return false;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return root == null;
    }

    @Override
    public Collection<T> traversal(Order order) {
        // TODO Auto-generated method stub
        output = new LinkedList<T>();
        if (!isEmpty()) {

            if (order == Order.INORDER) {
               inOrder(root);
            } else if (order == Order.POSTORDER) {
                postOrder(root);
            } else if (order == Order.PREORDER) {
            preOrder(root);
            }
            return output;
        }
        return output;
    }

    private void inOrder(BSTNode<T> tree)
    // Initializes inOrderQueue with tree elements in inOrder order.
    {
        if (tree != null)
        {
            inOrder(tree.getLeft());
            output.add(tree.getElement());
            inOrder(tree.getRight());
        }
    }

    private void preOrder(BSTNode<T> tree)
    // Initializes preOrderQueue with tree elements in preOrder order.
    {
        if (tree != null)
        {
            output.add(tree.getElement());
            preOrder(tree.getLeft());
            preOrder(tree.getRight());
        }
    }

    private void postOrder(BSTNode<T> tree)
    // Initializes postOrderQueue with tree elements in postOrder order.
    {
        if (tree != null)
        {
            postOrder(tree.getLeft());
            postOrder(tree.getRight());
            output.add(tree.getElement());
        }
    }

    public BSTNode<T> getLeftNode(BSTNode<T> r) {
        if (r.getLeft() == null) {
            return r;
        }
        return getLeftNode(r.getLeft());
    }

    public BSTNode<T> getRightNode(BSTNode<T> r) {
        if (r.getRight() == null) {
            return r;
        }
        return getRightNode(r.getRight());
    }
    private Object getPredecessor(BSTNode tree)
    // Returns the information held in the rightmost node in tree
    {
        while (tree.getRight() != null)
            tree = tree.getRight();
        return tree.getElement();
    }

    private BSTNode<T> removeNode(BSTNode<T> tree)
    // Removes the information at the node referenced by tree.
    // The user's data in the node referenced by tree is no
    // longer in the tree.  If tree is a leaf node or has only
    // a non-null child pointer, the node pointed to by tree is
    // removed; otherwise, the user's data is replaced by its
    // logical predecessor and the predecessor's node is removed.
    {
        T data;

        if (tree.getLeft() == null)
            return tree.getRight();
        else if (tree.getRight() == null)
            return tree.getLeft();
        else
        {
            data = (T)getPredecessor(tree.getLeft());
            tree.setElement(data);
            tree.setLeft(recRemove(data, tree.getLeft()));
            return tree;
        }
    }

    private BSTNode<T> recRemove(T element, BSTNode<T> tree)
    // Removes an element e from tree such that e.compareTo(element) == 0
    // and returns true; if no such element exists, returns false.
    {
        if (tree == null)
            found = false;
        else if (element.compareTo(tree.getElement()) < 0)
            tree.setLeft(recRemove(element, tree.getLeft()));
        else if (element.compareTo(tree.getElement()) > 0)
            tree.setRight(recRemove(element, tree.getRight()));
        else
        {
           // tree = removeNode(tree);
            found = true;
        }
        return tree;
    }

    public boolean remove (T element)
    // Removes an element e from this BST such that e.compareTo(element) == 0
    // and returns true; if no such element exists, returns false.
    {
        root = recRemove(element, root);
        return found;
    }
public int redo = 0;
    public void balanceRecursive(int low, int high){
        if (redo == 0) {
            Main.abst = new BST();
            redo++;
        }

        if(low == high)
            return;

        int midpoint = (low + high)/2;

        String insertName = nameArray[midpoint];
        String insertPart = partsArray[midpoint];
        Main.abst.add(insertName,insertPart);

        balanceRecursive(midpoint+1, high);
        balanceRecursive(low, midpoint);
    }
}
