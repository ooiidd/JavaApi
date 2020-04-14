package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.api.Dijkstra;

public class DijkstraTest {
	public static void main(String[] args) {
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
		
		
		/**
		 * 자전거 넣음
		 */
//		dijkstra.addEdge(3, 5, );
	}
}
