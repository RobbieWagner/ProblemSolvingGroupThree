public class Node {
    public int connections;
    public boolean traversed;

    public Node(int connectionsIn) {
        connections = connectionsIn;
        traversed = false;
    }

    public String toString(){
        return "connections: " + connections + "\ntraversed? " + traversed;
    }
}
