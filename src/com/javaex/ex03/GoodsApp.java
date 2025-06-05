package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("상품을 입력해주세요(종료q)");
    	
    	List<Goods> gList = new ArrayList<Goods>();
    	int total = 0;
    	
    	while(true) {
    		
    		String in = sc.nextLine();
    		
    		if("q".equals(in)) {
    			System.out.println("[입력완료]");
    			break;
    		}
    		
    		String[] iArray = in.split(",");
    		Goods gs = new Goods(iArray[0],iArray[1],Integer.parseInt(iArray[2]));
    		gList.add(gs);
    		
    	}
    	
    	System.out.println("==============================");
    	for(int i=0; i<gList.size(); i++) {
    		gList.get(i).income();
    	}
    	for(int i=0; i<gList.size(); i++) {
    		total = total + gList.get(i).getCount();
    	}
    	
    	System.out.println("모든 상품의 갯수는 "+total+"개입니다.");
    	sc.close();
       
    }

}
