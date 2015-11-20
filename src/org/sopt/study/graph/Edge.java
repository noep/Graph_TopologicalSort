package org.sopt.study.graph;

/**
 * Created by NOEP on 2015. 10. 25..
 * 간선
 */
public class Edge {

    int Weight;
    Vertex From;
    Vertex Target;

    Edge Next;

    public Edge (Vertex From, Vertex Target, int Weight){
        this.From = From;
        this.Target = Target;
        this. Weight = Weight;
        this. Next = null;
    }
    @Override
    public String toString(){
        return new String("From : "+From.Data+" to : "+Target.Data+" Weight : "+Weight);
    }
}
