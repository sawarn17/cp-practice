package designpattern;

class SingletonDemo {
    public static SingletonDemo singleton;
    
    private SingletonDemo(){
        
    }
    
    public static SingletonDemo getSingleTonInstance(){
        if(singleton == null){
            synchronized(SingletonDemo.class){
                singleton = new SingletonDemo();
                return singleton;
            }
        }
        return singleton;
    }
}

public class SingletonDesign
{
	public static void main(String[] args) {
		System.out.println("HASH CODE ARE "+ SingletonDemo.getSingleTonInstance().hashCode());
		System.out.println("HASH CODE ARE "+ SingletonDemo.getSingleTonInstance().hashCode());
	}
}
