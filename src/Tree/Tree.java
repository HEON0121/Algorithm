package Tree;
/*
       (1)
       / \
     (2) (3)
     / \
   (4) (5)
 Inorder (Left, Root, Right): 4 2 5 1 3
 Preorder (Root, Left, Right): 1 2 4 5 3
 Postorder (Left, Right, Root): 4 5 2 3 1

 */
class Node {
    int data;
    // child Node
    Node left;
    Node right;
}
class Tree {
    public Node root;
    public Node getRoot(){
        return root;
    }
    public void setRoot(Node node){
        this.root = node;
    }
    public Node makeNode( Node left, int data, Node right) {
        Node node = new Node();
        node.data = data;
        node.left = left;
        node.right = right;
        return node;
    }
    public void inorder(Node node) {
        if(node != null){
            inorder(node.left);
            System.out.print(node.data+" ");
            inorder(node.right);
        }
    }

    public void preorder(Node node) {
        if(node != null){
            System.out.print(node.data+" "); // 자기 자신 출력
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void postorder(Node node) {
        if(node != null){
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data+" ");
        }
    }
}
class Test {
/*
       (1)
       / \
     (2) (3)
     / \
   (4) (5)
 Inorder (Left, Root, Right): 4 2 5 1 3
 Preorder (Root, Left, Right): 1 2 4 5 3
 Postorder (Left, Right, Root): 4 5 2 3 1

 */
    public static void main(String[] args) {
        Tree t = new Tree();
        // 마지막 노드부터 생성
        Node n4 = t.makeNode(null, 4, null);
        Node n5 = t.makeNode(null, 5, null);
        Node n2 = t.makeNode(n4,2,n5);
        Node n3 = t.makeNode(null, 3, null);
        Node n1 = t.makeNode(n2,1,n3);
//        t.setRoot(n1);
//        t.inorder(n1); // 4 2 5 1 3
//        t.postorder(n1); // 4 5 2 3 1
//        t.preorder(n1); // 1 2 4 5 3
//        t.inorder(n2); // 4 2 5
//        t.preorder(n2); // 2 4 5
    }
}