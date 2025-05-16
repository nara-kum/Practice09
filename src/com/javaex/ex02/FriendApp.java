package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	//친구 정보를 담을 리스트 생성
    	List<Friend> fList = new ArrayList<Friend>();
    	
    	System.out.println("친구 3명을 등록하세요");
    	
    	for(int i=0; i<3; i++) {
    		
    		String info = sc.nextLine();
    		
    		String[] fArray = info.split(" ");
    		
    		Friend frd = new Friend(fArray[0],fArray[1],fArray[2]);
    		
    		fList.add(frd);
    	}
    	
    	for(int i=0; i<fList.size(); i ++) {
    		fList.get(i).showInfo();
    	}
    	
    	sc.close();
    	
    }

}
