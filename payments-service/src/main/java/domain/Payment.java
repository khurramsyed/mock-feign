package domain;

import lombok.Data;

@Data
public class Payment {

    private String id;

    public  Payment(String id){
        this.id=id;
    }
}
