import java.util.ArrayList;
import java.util.List;

public class Node<T> {

    private T data = null;

    private List<Node<T>> childreNodes = new ArrayList<>();

    private Node<T> parent = null;


    public Node(T data) {
        this.data = data;
    }

    public void addChild (Node <T> child) {
        childreNodes.add(child);
        child.setParent(this);
    }

    public void addChildren(ArrayList<Node<T>> childrenList) {
        childreNodes.addAll(childrenList);

        for (Node<T> node : childrenList) {
            node.setParent(this);
        }
    }

    public void writeTree (Node<T> root) {
        System.out.println(root.getData());

        ArrayList<Node<T>> childrenList = (ArrayList<Node<T>>) root.getChildreNodes();
        for (Node<T> node : childrenList) {
            writeTree(node);
        }
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<Node<T>> getChildreNodes() {
        return childreNodes;
    }

    public void setChildreNodes(List<Node<T>> childreNodes) {
        this.childreNodes = childreNodes;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }
}
