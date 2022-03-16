package Exception;

public class GarbageCollector {
	
	static GarbageCollector obj;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obj=new GarbageCollector();
		obj=null;//obj is not reachable
		
		GarbageCollector obj1=new GarbageCollector();
		GarbageCollector obj2=new GarbageCollector();
		
		GarbageCollector obj3=new GarbageCollector();
		
		System.gc();//It is only request it doesn't mean JVM will call garbage
		Runtime.getRuntime().gc();
	
		
	}

}
