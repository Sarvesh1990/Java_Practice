import java.util.HashMap;
import java.util.*;
public class main 
{
	public static void main(String[] args)
	{
		Map<Integer, Set<Integer>> myMap = new HashMap<Integer, Set<Integer>>();
		Graph myGraph = new Graph(myMap);
		myGraph.Insert(0,5);
		myGraph.Insert(0,1);
		myGraph.Insert(0,2);
		myGraph.Insert(6,4);
		myGraph.Insert(3,5);
		myGraph.Insert(5,2);
		myGraph.Insert(6,0);
		myGraph.Insert(1,4);
		myGraph.Insert(3,6);
		myGraph.Insert(3,4);
		myGraph.Insert(3,2);
		boolean done = false;
		while(!done)
		{
			for(int i=0; i<=6; i++)
			{
				if(myGraph.myArray[i]<0 && myGraph.myArray[i]!=-2)
				{
					myGraph.myArray[i]=-2;
					myGraph.dfs(i);
				}
				else
				{
					done=true;
				}
			}
		}
		myGraph.IterateTopo();
	}
}


