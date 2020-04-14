package com.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;


public class Dijkstra {
	class Node implements Comparable<Node> {
	    int index, distance;
	    String name=null;
	    public Node(int index, int distance) {
	        this.index = index;
	        this.distance = distance;
	    }
	    public Node(int index, int distance,String name) {
	        this(index,distance);
	        this.name = name;
	    }

	    public int compareTo(Node n) {
	        return this.distance - n.distance;
	    }
	}
	private final int INF = 987654321;
	private List<List<Node>> list = new ArrayList<>();
	private int[] dist;
	private int N;
	private Map<Integer,String> nameMap = new HashMap<>();
	private ArrayList<ArrayList<String>> path = new ArrayList<>();
	
	public Dijkstra(int N){
		this.N = N;
		dist = new int[N+1];
		Arrays.fill(dist, INF);
		
		for(int i=0;i<=N;i++) {
			list.add(new ArrayList<>());
			path.add(new ArrayList<>());
		}
	}
	
	public void addEdge(int start,int end, int dist){
		list.get(start).add(new Node(end,dist));
	}
	/*
	 * public void addEdge(int start,int end, int dist){ list.get(start).add(new
	 * Node(end,dist,name)); nameMap.put(start, name); }
	 */
	public void addName(int number, String name) {
		nameMap.put(number, name);
	}
	
	public void solve(int start) {
		boolean[] visited = new boolean[N+1];
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		
		dist[start] = 0;
		pq.add(new Node(start,0));
		path.get(start).add(nameMap.get(start));
		while(!pq.isEmpty()) {
			int cur = pq.poll().index;
			
			if(visited[cur]) continue;
			visited[cur] = true;
			for(Node node : list.get(cur)) {
				if(dist[node.index] > dist[cur] + node.distance) {
					dist[node.index] = dist[cur] + node.distance;
					path.set( node.index,( (ArrayList<String>)path.get(cur).clone() ));//.add(nameMap.get(node.index)) );
					path.get(node.index).add(nameMap.get(node.index));
					pq.add(new Node(node.index,dist[node.index]));
				}
			}
		}
	}
	
	public int getDist(int point) {
		return dist[point];
	}
	
	public int getDist(int start,int end) {
		solve(start);
		return getDist(end);
	}
	
}
