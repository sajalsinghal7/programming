package graphReviewer;

public class Edge {
	private Integer pairNodeId;
	private Integer weight;
	private Edge nextReviewer;
//	public Edge(Integer index, Integer weight) {
//		// TODO Auto-generated constructor stub
//		pairNodeIndex = index;
//		this.weight = weight;
//	}
	public Integer getPairNodeId() {
		return pairNodeId;
	}
	public Integer getWeight() {
		return weight;
	}
	public Edge getNextReviewer() {
		return nextReviewer;
	}
	public Edge setNextReviewer(Edge nextReviewer) {
		this.nextReviewer = nextReviewer;
		return this;
	}
	public Edge setWeight(Integer weight) {
		this.weight = weight;
		return this;
	}
	public Edge setPairNodeId(Integer pairNodeId) {
		this.pairNodeId = pairNodeId;
		return this;
	}
	
}
