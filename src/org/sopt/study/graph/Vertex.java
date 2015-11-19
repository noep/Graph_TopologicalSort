package org.sopt.study.graph;


/**
 * Created by NOEP on 2015. 10. 25..
 * 정점
 */
public class Vertex {

    int Data;
    boolean Visited = false;
    int Index;

    Vertex Next;
    Edge AdjacencyList;

    public Vertex( int Data){
        this.Data = Data;
        this.Next = null;
        this.AdjacencyList = null;
        this.Visited = false;
        this.Index = -1;
    }

    public void AddEdge( Edge e){

        Vertex v = this;

        if( v.AdjacencyList == null){
            v.AdjacencyList = e;
        }else{

            Edge AdjacencyList = v.AdjacencyList;

            while(AdjacencyList.Next != null){
                AdjacencyList = AdjacencyList.Next;
            }

            AdjacencyList.Next = e;
        }
    }

    public int getData() {
        return Data;
    }

    public void setData(int data) {
        Data = data;
    }
}
