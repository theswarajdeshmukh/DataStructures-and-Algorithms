package Trees;


class BSTNode{
    BSTNode left, right;
    int data;

    public BSTNode(int n){
        left = null;
        right = null;
        data = n;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

class BST {
    private BSTNode root;

    public BST() {
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int data){
        root = insert(root, data);


    }

    private BSTNode insert(BSTNode node, int data){
        if (node == null){
            node = new BSTNode(data);
        }
        else {
            if (data <= node.getData()) {
                node.left = insert(node.left, data);
            }else {
                node.right = insert(node.right, data);
            }
        }
        return node;
    }

    public boolean search(int val){
        return search(root,val);
    }

    private boolean search(BSTNode r, int val){
        boolean found = false;
        while (r != null && !found) {
            int rval = r.getData();
            if (val < rval){
                r = r.getLeft();
            }
            else if (val > rval) {
                r = r.getRight();
            }
            else {
                found = true;   // terminating case
                break;
            }
            found = search(r, val);
        }
        return found;
    }

    public void deleteKey(int key) {
        root = deleteKey(root, key);
    }

    private BSTNode deleteKey(BSTNode r, int key){
        if (r == null) return r;

        if (key < r.getData()) {
            r.left = deleteKey(r.getLeft(), key);
        }
        else if (key > r.getData()) {
            r.right = deleteKey(r.getRight(), key);
        }
    }

    int inorderSuccessor(BSTNode r) {
        int rval = r.getData();
        while (r.getLeft() != null) {
            rval = r.getData();
            r = r.getLeft();
        }
        return rval;
    }
}

public class BinarySearchTree {



    public static void main(String[] args) {

    }
}
