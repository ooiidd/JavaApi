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
	    Integer edgeType;
	    public Node(int index, int distance) {
	        this.index = index;
	        this.distance = distance;
	        edgeType = null;
	    }
	    
	    public Node(int index, int distance,int edgeType) {
	    	this(index,distance);
	    	this.edgeType = edgeType;
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
	
	/**
	 * State 사용할때, 조건부 dijkstra
	 */
	private int[] state;
	private Integer startState = null;
	
	public Dijkstra(int N){
		this.N = N;
		dist = new int[N+1];
		state = new int[N+1];
		Arrays.fill(dist, INF);
		startState = null;
		
		for(int i=0;i<=N;i++) {
			list.add(new ArrayList<>());
			path.add(new ArrayList<>());
		}
	}
	
	public void init() {
//		list = new ArrayList<>();
		path = new ArrayList<>();
		
		dist = new int[N+1];
		state = new int[N+1];
		Arrays.fill(dist, INF);
		startState = null;
		
		for(int i=0;i<=N;i++) {
//			list.add(new ArrayList<>());
			path.add(new ArrayList<>());
		}
	}
	
	public void addEdge(int start,int end, int dist){
		list.get(start).add(new Node(end,dist));
	}

	public void addEdge(int start,int end, int dist, int edgeType){ 
		list.get(start).add(new Node(end,dist,edgeType));
	}
	
	public void addName(int number, String name) {
		nameMap.put(number, name);
	}
	
	public void setStartState(int startState) {
		this.startState = startState;
	}
	
	
	
	public void solve(int start) {
		boolean[] visited = new boolean[N+1];
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		
		dist[start] = 0;
		//조건 사용 체크
		if(startState != null) {
			state[start] = startState;
		}
		pq.add(new Node(start,0));
		path.get(start).add(nameMap.get(start)==null ? String.valueOf(start) : nameMap.get(start));
		while(!pq.isEmpty()) {
			int cur = pq.poll().index;
			
			if(visited[cur]) continue;
			visited[cur] = true;
			for(Node node : list.get(cur)) {
				int nextVal = dist[cur] + node.distance;
				/**
				 * 조건부
				 */
				if(node.edgeType!= null && node.edgeType==1) {
					nextVal += (600-(startState+dist[cur])%600)%600;//대기 시간 추가
				}
				if(dist[node.index] > nextVal) {
					dist[node.index] = nextVal;
					path.set( node.index,( (ArrayList<String>)path.get(cur).clone() ));//.add(nameMap.get(node.index)) );
					path.get(node.index).add( nameMap.get(node.index)==null? String.valueOf(node.index) : nameMap.get(node.index) );
					pq.add(new Node(node.index,dist[node.index]));
				}
			}
		}
	}
	public List<String> getPath(int point){
		return path.get(point);
	}
	
	public int getDist(int point) {
		return dist[point];
	}
	
	public int getDist(int start,int end) {
		solve(start);
		return getDist(end);
	}
	
	
	/**
	 * State 사용할때, 조건부 dijkstra
	 */
}
