public class main 
{
	public static void main(String[] args) 
	{
		System.out.println("Let's start MST bithces");
		PrQueue myPrQueue = new PrQueue ();
		Graph myGraph = new Graph();
		myGraph.Insert(0, 2, 7);
		myGraph.Insert(3, 4, 9);
		myGraph.Insert(1, 5, 2);
		myPrQueue.Initialize(myGraph.myMap);
	}
}
