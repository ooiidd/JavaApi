package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.api.Dijkstra;

public class DijkstraTest {
	public static void main(String[] args) {
		/**
		 * Test Case 1
		 */
		int[][] lift = {
				{0,2000},
				{2500,5500},
				{3000,6000},
				{5000,9000}
		};
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(10000);
		for(int i=0;i<lift.length;i++) {
			int[] cur = lift[i];
			for(int j=0;j<cur.length;j++) {
				list.add(lift[i][j]);
			}
		}
		list = list.stream().distinct().sorted().collect(Collectors.toList());

		Dijkstra dijkstra = new Dijkstra(list.size());
		/**
		 * Path 찾을때 Naming을위해서만 사용
		 */
		for(int i=0;i<list.size();i++) {
			dijkstra.addName(i, String.valueOf(list.get(i)));
		}
		
		
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size();j++) {
				if(i==j) continue;
				int curi = list.get(i), curj = list.get(j);
				for(int k=0;k<lift.length;k++) {
					if(lift[k][0] == curi && lift[k][1]==curj) {
						dijkstra.addEdge(i, j, 0);
						dijkstra.addEdge(j, i, 0);
					}
				}
				dijkstra.addEdge(i, j, Math.abs(list.get(j)-list.get(i)));
			}
		}

		System.out.println(dijkstra.getDist(0,list.size()-1));
		System.out.println(dijkstra.getPath(list.size()-1));
		
		
		
		/**
		 * Test Case 2
		 */
		/**
		 * 도보 Edge 넣음
		 */
		Dijkstra dijkstra2 = new Dijkstra(12);
		for(int i=1;i<=12;i++) {
			for(int j=1;j<=12;j++) {
				if(i!=j)
					dijkstra2.addEdge(i, j, Math.abs(i-j)*240);
			}
		}
		/*
		 * 자전거 Edge 넣음
		 */
		int[] jajungu = {3,5,9};
		int l = jajungu.length;
		for(int i=0;i<l;i++) {
			for(int j=0;j<l;j++) {
				if(i!=j)
					dijkstra2.addEdge(jajungu[i], jajungu[j], Math.abs(jajungu[i]-jajungu[j])*70);
			}
		}
		
		System.out.println(dijkstra2.getDist(6,10));
		System.out.println(dijkstra2.getPath(10));
		

		/**
		 * Test Case 3
		 * Test Case 2 의 Edge 유지
		 */
		dijkstra2.init();
		dijkstra2.setStartState(600);
		
		int[] bus = {1,12};
		int busl = bus.length;
		for(int i=0;i<busl;i++) {
			for(int j=0;j<busl;j++) {
				if(i!=j)
					dijkstra2.addEdge(bus[i], bus[j], Math.abs(bus[i]-bus[j])*20,1);
			}
		}
		System.out.println(dijkstra2.getDist(4,12));
		System.out.println(dijkstra2.getPath(12));
	}
}
