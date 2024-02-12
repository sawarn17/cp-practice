package javautildemo.setimple.hashsetexample;

public class HashSetImpl {
	
	/* It is actually backed by hashMap, it means it is just an instance of HashMap. 
	 * It is backed by HashTable. || Internally used HashTable DataStructure.
	 * It used HashMap to store data internally. 
	 * Storage in HashMap: Actually the value we insert in HashSet acts as a key to the map Object and for its value, 
	 * java uses a constant variable. So in the key-value pair, all the values will be the same.
	 *  
	 * 
	 * 
	 *  It stores unique elements and permits nulls || It’s backed by a HashMap 
	 *  It doesn’t maintain insertion order || It’s not thread-safe
	 *  It maintain the object uniqueness on the basis of the hashcode 
	 * 
	 * 
	 * 
	 * 
	 *  *****But two objects with the same hashCode might not be equal.
	 */

	public static void main(String [] args) {
		
	}
}
