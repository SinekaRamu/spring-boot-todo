package com.sine.spring_boot_todo.models;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Todo")
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private boolean complete;

    @Getter
    @Setter
    private Instant createDate;

    @Getter
    @Setter
    private Instant updateDate;

    public TodoItem() {
    }

    public TodoItem(String desscription) {
        this.description = desscription;
        this.complete = false;
        this.createDate = Instant.now();
        this.updateDate = Instant.now();
    }

    @Override
    public String toString() {
        return String.format("TodoItem{id=%d, description='%s', complete='%s', createDate='%s', updateDate='%s'}", id,
                description, complete, createDate, updateDate);
    }

}
