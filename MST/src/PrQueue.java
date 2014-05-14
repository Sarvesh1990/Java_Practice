import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class PrQueue 
{
	PriorityQueue<Edge> myQueue = new PriorityQueue<Edge>();
	void Initialize(Map<Integer, Set<Edge>> myMap)
	{
		for(Map.Entry<Integer, Set<Edge>> entry : myMap.entrySet())
		{
			System.out.println("Key is " + entry.getKey());
		}
		
	}
}