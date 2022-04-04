import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class testLinkedLIst {
    public static void main(String[] args) {
		List<String> placeToVisit = new LinkedList<String>();
		placeToVisit.add("kerala");
		placeToVisit.add("America");
		placeToVisit.add("Europe");
		placeToVisit.add("Mayapur");
		
		System.out.println(placeToVisit.contains("kerala"));
		System.out.println(placeToVisit.contains("delhi"));
		System.out.println(placeToVisit.indexOf("kerala"));
		
		
//		printList(placeToVisit);
//		printList2(placeToVisit);
	}
    
    private static void printList(List<String> placeToVisit) {
    	Iterator<String> it = placeToVisit.iterator();
    	while(it.hasNext()) {
    		System.out.println("Now visiting..." + it.next());
    	}
    }
    
    private static void printList2(List<String> myList) {
    	 for(Iterator it = myList.iterator();it.hasNext();) {
    		  System.out.println(it.next());
    	 }
    	
    }
    
    // removing element from linkedlist
    
}
