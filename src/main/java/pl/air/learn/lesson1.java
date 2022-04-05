package pl.air.learn;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class lesson1 {

    public int temp;

    public void check(int temp)
    {
        if(temp>0)
        {
            System.out.println("temperatura jest dodatnia i Wynosi " +temp+" stopnie");
        }
        else{
            System.out.println("Tfffblnlallaf");
        }
    }




}
/*
1 leeson

Napisz metodę, która sprawdzi czy temperatura przekazana jako argument jest dodatnia.

 */