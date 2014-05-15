import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class PrQueue 
{
	Map<Integer, Edge> myPrMap = new TreeMap <Integer, Edge> ();
	void CreateMST(MSTree myMSTree, int index, Map<Integer, Set<Edge> > myMap)
	{
		//while(myMSTree.mySet.size()!=7)
		//{
			for(Edge myEdge : myMap.get(index))
			{
				if(myPrMap.get(myEdge.Other(index))!=null)
				{
					if(myEdge.weight < myPrMap.get(myEdge.Other(index)).weight)
					{
						myPrMap.put(myEdge.Other(index), myEdge);
					}
				}
				else
				{
					myPrMap.put(myEdge.Other(index), myEdge);
				}
			}
			for (Map.Entry<Integer, Edge> entry : myPrMap.entrySet())
			{
				System.out.println(entry.getKey() + "/" + entry.getValue());
			}
			
		}
	//}
}