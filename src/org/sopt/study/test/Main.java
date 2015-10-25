package org.sopt.study.test;

import org.sopt.study.graph.Edge;
import org.sopt.study.graph.Graph;
import org.sopt.study.graph.Vertex;
import sun.misc.Queue;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //그래프 생성
//        Graph G = new Graph();
//        //정점 생성
//        Vertex V1 = new Vertex(1);
//        Vertex V2 = new Vertex(2);
//        Vertex V3 = new Vertex(3);
//        Vertex V4 = new Vertex(4);
//        Vertex V5 = new Vertex(5);
//
//        //그래프에 정점 추가
//        G.AddVertex(V1);
//        G.AddVertex(V2);
//        G.AddVertex(V3);
//        G.AddVertex(V4);
//        G.AddVertex(V5);
//
//        //정점과 정점을 간선으로 이어준다
//        V1.AddEdge( new Edge(V1,V2,0));
//        V1.AddEdge( new Edge(V1,V3,0));
//        V1.AddEdge( new Edge(V1,V4,0));
//        V1.AddEdge( new Edge(V1,V5,0));
//
//        V2.AddEdge(new Edge(V2,V1,0));
//        V2.AddEdge(new Edge(V2,V3,0));
//        V2.AddEdge(new Edge(V2,V5,0));
//
//        V3.AddEdge(new Edge(V3,V1,0));
//        V3.AddEdge(new Edge(V3,V2,0));
//
//        V4.AddEdge(new Edge(V4,V1,0));
//        V4.AddEdge(new Edge(V4,V5,0));
//
//        V5.AddEdge(new Edge(V5,V1,0));
//        V5.AddEdge(new Edge(V5,V2,0));
//        V5.AddEdge(new Edge(V5,V4,0));
//
//
//        G.printGraph();


        Graph graph = new Graph();

        //정점 생성
        Vertex V1 = new Vertex(1);
        Vertex V2 = new Vertex(2);
        Vertex V3 = new Vertex(3);
        Vertex V4 = new Vertex(4);
        Vertex V5 = new Vertex(5);
        Vertex V6 = new Vertex(6);
        Vertex V7 = new Vertex(7);

        //그래프에 정점 추가
        graph.AddVertex(V1);
        graph.AddVertex(V2);
        graph.AddVertex(V3);
        graph.AddVertex(V4);
        graph.AddVertex(V5);
        graph.AddVertex(V6);
        graph.AddVertex(V7);

        V1.AddEdge(new Edge(V1,V2,0));
        V1.AddEdge(new Edge(V1,V3,0));

        V2.AddEdge(new Edge(V2,V4,0));
        V2.AddEdge(new Edge(V2,V5,0));

        V3.AddEdge(new Edge(V3,V4,0));
        V3.AddEdge(new Edge(V3,V6,0));

        V4.AddEdge(new Edge(V4,V7,0));

        V5.AddEdge(new Edge(V5,V7,0));

        graph.printGraph(graph);


        Graph.DFS(graph.Vertices);
//        Graph.BFS(graph.Vertices,new Queue<Vertex>());



    }
}
