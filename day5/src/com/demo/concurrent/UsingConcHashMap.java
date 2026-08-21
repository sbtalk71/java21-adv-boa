package com.demo.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingConcHashMap {

	public static void main(String[] args) throws Exception{
		
		//Map<String, String> dataMap=new HashMap<>();
		Map<String, String> dataMap=new ConcurrentHashMap<>();
		
		ExecutorService es= Executors.newFixedThreadPool(5);
		es.execute(new MapWriter(dataMap));
		es.execute(new MapWriter(dataMap));
		es.execute(new MapWriter(dataMap));
		es.execute(new MapWriter(dataMap));
		
		Thread.sleep(15000);
		es.shutdown();
		System.out.println("The Size of Map : "+dataMap.size());
	}

}

class MapWriter implements Runnable{
	private Map<String, String> dataMap;
	
	public MapWriter(Map<String, String> dataMap) {
		this.dataMap = dataMap;
	}

	@Override
	public void run() {
		String tname=Thread.currentThread().getName();
		System.out.println("Thread in action : "+tname);
		for(int i=0;i<100;i++) {
			dataMap.put(tname+i, tname+i);
			try {
				Thread.sleep(120);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}


