package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("상품을 입력해주세요(종료q");
    	
    	List<Goods> gList = new ArrayList<Goods>();
    	
    	while(true) {
    		
    		String in = sc.nextLine();
    		String[] iArray = in.split(",");
    		
    		if("q".equals(in)) {
    			break;
    		}
    		
    		
    	}
    	
    	
    	sc.close();
       
    }

}
