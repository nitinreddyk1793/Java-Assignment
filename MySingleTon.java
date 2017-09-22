
1)Lazy initialized
	
	class Sin {
    private static class SinHolder {
       public static Sin instance = new Sin();//Only once the object is created and evrytime the object is used
    }
 
    public static Sin getInstance() {
        return SinHolder.instance;
    }
}
 2)Singleton Implementation with Enum:
 public enum EnumSin {

    INSTANCE;
    
    public static void do(){
        
    }
}
    

3)BillPughSingleton Implemetation:

public class BillPugh {

    private BillPugh(){}
    
    private static class Singleton{// it only performs the instantiation of the singleton
        private static final BillPugh INSTANCE = new BillPugh();
    }
    
    public static BillPugh getInstance(){
        return Singleton.INSTANCE;
    }
}
4)Double checked locking implementation:
public static ThreadSafeSin getDoublelocking(){
    if(instance == null){//If the object is not created once then it allowed to be created 
        synchronized (ThreadSafeSingleton.class) {
            if(instance == null){
                instance = new ThreadSafeSingleton();
            }
        }
    }
    return instance;
}