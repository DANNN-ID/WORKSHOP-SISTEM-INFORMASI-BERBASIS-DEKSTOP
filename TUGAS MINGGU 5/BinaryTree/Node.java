package BinaryTree;
/*
    @author : AHMAD WILDAN
    NIM     : E41201452
    GOL     : TIF B - BONDOWOSO
*/
public class Node {
    public int id;
    public String data;
    public Node leftChild;
    public Node rightChild;

    public void displayNode(){
        System.out.print(" { " + id + " " + data + " } ");
    }
}