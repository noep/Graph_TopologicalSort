package org.sopt.study.graph;

import sun.misc.Queue;

import java.util.LinkedList;

/**
 * Created by NOEP on 2015. 10. 25..
 * 그래프는 Vertex의 집합체
 */
public class Graph {

    public Vertex Vertices;
    int VertexCount;

    /**
     * Create Graph
     */
    public Graph (){
        this.Vertices = null;
        this.VertexCount = 0;
    }

    public void AddVertex(Vertex v){

        Graph g = this;
        Vertex VertexList = g.Vertices;

        if(VertexList == null){
            g.Vertices = v;
        }else{
            while(VertexList.Next != null){
                VertexList = VertexList.Next;
            }
            VertexList.Next = v;
        }
    }

    public void printGraph(){

        Graph g = this;
        Vertex v;
        Edge e;

        if( (v = g.Vertices) == null){
            return;
        }

        while(v != null){
            System.out.print(" "+v.Data+ " ");
            if( (e = v.AdjacencyList) == null){
                v = v.Next;
                System.out.println(" ");
                continue;
            }
            while(e !=null){
                System.out.print(" "+e.Target.Data + " " + e.Weight +" ");
                e = e.Next;
            }
            System.out.println(" ");
            v = v.Next;
        }

            System.out.println(" ");
    }

    public static void DFS(Vertex v) {
        Edge e = null;
        System.out.println("data : " + v.Data);
        v.Visited = true;
        e = v.AdjacencyList;
        while (e != null) {
            if (e.Target != null && e.Target.Visited == false) {
                DFS(e.Target);
            }
            e=e.Next;
        }
    }

    public static void BFS(Vertex v, Queue<Vertex> queue){
        Edge e = null;
        System.out.println("data : " + v.Data);
        v.Visited = true;
        queue.enqueue(v);
        while( !queue.isEmpty()){
            try {
                v = queue.dequeue();
                e = v.AdjacencyList;
                while( e != null){
                    v = e.Target;

                    if(v != null && v.Visited ==false){
                        System.out.print(" "+ v.Data +" ");
                        v.Visited = true;
                        queue.enqueue(v);
                    }

                    e = e.Next;
                }
            }catch (InterruptedException e1){
                e1.printStackTrace();
            }
        }
    }

    public void topologicalSort( LinkedList sortedList) {
        //System.out.println("topologicalSort "+vertices.Data);
        Vertex vertex = this.Vertices;

        while(vertex != null  && vertex.Visited ==false){
            TS_DFS(vertex,sortedList);
            vertex = vertex.Next;
        }
    }

    private void TS_DFS(Vertex vertex, LinkedList sortedList) {
        //System.out.println("TS_DFS "+vertex.Data);
        vertex.Visited = true;
        //이렇게 하면 그냥 DFS
        //sortedList.add(vertex.Data);


        Edge edge = vertex.AdjacencyList;
        while (edge != null){
            if(edge.Target != null && edge.Target.Visited == false){
                TS_DFS(edge.Target,sortedList);
            }
            edge = edge.Next;
        }
        sortedList.push(vertex.Data);

    }

    public void tSort(){
        System.out.println("Tsort Started");

        Vertex vertices = this.Vertices;
        Edge edge;

        //전체 Vertex를 조사
        while(vertices != null && vertices.Visited ==false){
            System.out.println("Vertex : " +vertices.Data);
            edge = vertices.AdjacencyList;

            while( edge !=null){
                System.out.print("Vertex Has Edge : "+ edge.From.Data + edge.Target.Data);



                edge = edge.Next;
            }
            System.out.println();



            vertices.Visited = true;
            vertices = vertices.Next;


        }




    }


}
