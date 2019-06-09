package com.wlk.demo.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        for(int i = 0 ; i < list.size() ; i ++){
            System.out.println(i+"-"+list.get(i));
            if(list.get(i).equals(2)){
                list.remove(i);
            }
        }

    }

}
