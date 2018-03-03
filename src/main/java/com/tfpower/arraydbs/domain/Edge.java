package com.tfpower.arraydbs.domain;

import com.tfpower.arraydbs.util.Pair;

/**
 * Created by vlad on 21.02.18.
 */
public class Edge {

    private String start;
    private String end;
    private Integer weight;
    private String id;

    public Edge(String id, String start, String end, Integer weight) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    public Edge(String start, String end, Integer weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public boolean isIncidentTo(String id) {
        return start.equals(id) || end.equals(id);
    }

    public String endDifferingFrom(String id) {
        return start.equals(id) ? end : start;
    }

    @Override
    public String toString() {
        return "." + start + "--" + weight +"-->" + end + ".";
    }

    public String getId() {
        if (id == null){
            id = computeId();
        }
        return id;
    }

    private String computeId() {
        return String.valueOf(start) + "-->" + String.valueOf(end);
    }
}
