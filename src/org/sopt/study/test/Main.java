package org.sopt.study.test;

import org.sopt.study.graph.Edge;
import org.sopt.study.graph.Graph;
import org.sopt.study.graph.Vertex;
import sun.misc.Queue;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList sortedList = new LinkedList<Vertex>();
        /**
         * 그래프 생성
         */
        Graph graph = new Graph();
        /* 정점 생성 */
        Vertex V1 = new Vertex(1);
        Vertex V2 = new Vertex(2);
        Vertex V3 = new Vertex(3);
        Vertex V4 = new Vertex(4);
        Vertex V5 = new Vertex(5);
        Vertex V6 = new Vertex(6);
        Vertex V7 = new Vertex(7);
        Vertex V8 = new Vertex(8);

        //그래프에 정점 추가
        graph.AddVertex(V1);
        graph.AddVertex(V2);
        graph.AddVertex(V3);
        graph.AddVertex(V4);
        graph.AddVertex(V5);
        graph.AddVertex(V6);
        graph.AddVertex(V7);
        graph.AddVertex(V8);


        //정점과 정점을 간선으로 이어준다
        V1.AddEdge( new Edge(V1,V3,0));
        V1.AddEdge( new Edge(V1,V4,0));

        V2.AddEdge(new Edge(V2,V3,0));
        V2.AddEdge(new Edge(V2,V5,0));

        V3.AddEdge(new Edge(V3,V6,0));

        V4.AddEdge(new Edge(V4,V6,0));
        V4.AddEdge(new Edge(V4,V7,0));

        V5.AddEdge(new Edge(V5,V7,0));

        V6.AddEdge(new Edge(V6,V8,0));

        V7.AddEdge(new Edge(V5,V8,0));
        //연결O
        //graph.printGraph();

        graph.topologicalSort(sortedList);

        System.out.println("Topological Sort : ");
        for (int i =0; i<sortedList.size(); i++){
            System.out.print(sortedList.get(i)+" ");
        }
        System.out.println("");
        System.out.println("Topological Sort End ");

    }


    public Graph sampleGraph1(){
//        그래프 생성
        Graph G = new Graph();
        //정점 생성
        Vertex V1 = new Vertex(1);
        Vertex V2 = new Vertex(2);
        Vertex V3 = new Vertex(3);
        Vertex V4 = new Vertex(4);
        Vertex V5 = new Vertex(5);

        //그래프에 정점 추가
        G.AddVertex(V1);
        G.AddVertex(V2);
        G.AddVertex(V3);
        G.AddVertex(V4);
        G.AddVertex(V5);

        //정점과 정점을 간선으로 이어준다
        V1.AddEdge( new Edge(V1,V2,0));
        V1.AddEdge( new Edge(V1,V3,0));
        V1.AddEdge( new Edge(V1,V4,0));
        V1.AddEdge( new Edge(V1,V5,0));

        V2.AddEdge(new Edge(V2,V1,0));
        V2.AddEdge(new Edge(V2,V3,0));
        V2.AddEdge(new Edge(V2,V5,0));

        V3.AddEdge(new Edge(V3,V1,0));
        V3.AddEdge(new Edge(V3,V2,0));

        V4.AddEdge(new Edge(V4,V1,0));
        V4.AddEdge(new Edge(V4,V5,0));

        V5.AddEdge(new Edge(V5,V1,0));
        V5.AddEdge(new Edge(V5,V2,0));
        V5.AddEdge(new Edge(V5,V4,0));

        G.printGraph();
        return G;
    }





}
