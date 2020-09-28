import java.util.ArrayList;
import java.util.List;

public class Tree {

    public static void main(String[] args) {

        Node<String> root = new Node<>("root");

        Node<String> node1 = new Node<>("node1");
        Node<String> node2 = new Node<>("node2");
        Node<String> node3 = new Node<>("node3");

        root.addChild(node1);
        node1.addChild(node2);
        node2.addChild(node3);

        List<Node<String>> chiList = new ArrayList<>();

        chiList.add(new Node<String> ("Node 10"));
        chiList.add(new Node<String> ("Node 11"));
        chiList.add(new Node<String> ("Node 12"));
        chiList.add(new Node<String> ("Node 13"));
        chiList.add(new Node<String> ("Node 14"));

        node3.addChildren((ArrayList<Node<String>>) chiList);

        root.writeTree(root);

    }
}
