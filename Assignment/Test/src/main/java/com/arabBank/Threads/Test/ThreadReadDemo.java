package com.arabBank.Threads.Test;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class ThreadReadDemo {

	public static void main(String[] args) throws InterruptedException {

		LinkedHashSet<Integer> s=new LinkedHashSet<Integer>();
		s.add(1);
		s.add(3);
		s.add(2);
		
		System.out.println(s.toString());
		Thread t1=new Thread(new MultiThread());
		Thread t2=new Thread(new MultiThread());
		t1.start();
		t1.join();
		t2.start();
	}

}


 class MultiThread implements Runnable{	
	private static BufferedReader br = null;
	private ArrayList<String> list;
	
	static{
		try {
			br = new BufferedReader(new FileReader("textX"));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
	
	public void run() {
		String line = null;
		int count = 0;
		while(true) {
			this.list = new ArrayList<String>();
			synchronized(br) {
				try {
					while((line = br.readLine()) != null) {
						if(count<15) {
							list.add(line);
							count++;
						}else {
							list.add(line);
							count = 0;
							break;
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(1);
				display(this.list);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(line == null)
				break;
		}
		
		
	}
	
	public void display(java.util.List<String> list) {
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println(list.size());
	}
	
}