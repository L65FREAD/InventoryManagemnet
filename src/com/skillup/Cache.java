package com.skillup;

import java.util.ArrayList;
import java.util.HashMap;

public class Cache {
    public static void main(String[] args) {

        int[] inte = {1,0,3};
        try{
            System.out.println(inte[8]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(inte[8]);
        }catch (Exception e){
            System.out.println("finally");
        }finally {
            System.out.println("in finally");
        }
    }
}
