package designpattern;

import java.lang.reflect.Constructor;

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

        //breaking of singleton instance
        SingletonDemo single1 = SingletonDemo.getSingleTonInstance();
        SingletonDemo single2 = null;

        Constructor [] constructors = SingletonDemo.class.getDeclaredConstructors();
        try {
            for(Constructor cons : constructors){
                cons.setAccessible(true);
                single2 = (SingletonDemo) cons.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("THE instance of first single "+ single1.hashCode());
        System.out.println("The instance of second instance is "+ single2.hashCode());

	}
}
