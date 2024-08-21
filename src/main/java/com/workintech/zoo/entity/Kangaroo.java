package com.workintech.zoo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Kangaroo {
    private int id;
    private String name;
    private double height;
    private double weight;
    private String gender;
    private boolean isAggresive;

    public boolean getIsAggressive(){
        return isAggresive;
    }

    public void setIsAggressive(boolean isAggresive){
        this.isAggresive = isAggresive;
    }
}
