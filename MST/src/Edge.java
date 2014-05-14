public class Edge implements Comparable <Edge> 
{
	int weight;
	int v;
	int w;
	Edge(int first, int second, int myWeight)
	{
		v=first;
		w=second;
		weight=myWeight;
	}
	int Either()
	{
		return v;
	}
	int Other (int a)
	{
		if(a==v)
			return w;
		else
			return v;
	}
	@Override
	public int compareTo(Edge myEdge)
	{
		return this.weight - myEdge.weight;
	}
}
