package com.example.a15017573.cleanhands;

/**
 * Created by 15017573 on 7/6/2017.
 */

public class Record {
    private String role;
    private String rank;
    private int action;
    private String notes;
    private String conditions;

    public Record(String role, String rank, int action, String notes, String conditions) {
        this.role = role;
        this.rank = rank;
        this.action = action;
        this.notes = notes;
        this.conditions = conditions;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }
}
