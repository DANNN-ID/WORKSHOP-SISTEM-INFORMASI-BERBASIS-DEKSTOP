package Graph;
/*
    @author : AHMAD WILDAN
    NIM     : E41201452
    GOL     : TIF B - BONDOWOSO
*/
public class GraphApp {
    public static void main(String[] Args) {
        Graph theGraph = new Graph();
        
        theGraph.addVertex('A'); // 0
        theGraph.addVertex('B'); // 1
        theGraph.addVertex('C'); // 2
        theGraph.addVertex('D'); // 3
        theGraph.addVertex('E'); // 4
        
        
        theGraph.addEdge(0, 1); //AB
        theGraph.addEdge(1, 2); //BC
        theGraph.addEdge(2, 3); //CD
        theGraph.addEdge(3, 4); //DE
        
        //theGraph.bfs();
        theGraph.display();
    }
}