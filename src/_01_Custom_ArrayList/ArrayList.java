package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	private T[] t;
	
	public ArrayList() {
		t = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return t[loc];
	}
	
	public void add(T val) {
		T[] temp = (T[]) new Object[size() + 1];
		temp[temp.length - 1] = val;
		for(int i = 0; i<t.length; i++) {
			temp[i] = t[i];
		}
		t = temp;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[size() + 1];
		for(int i = 0; i<temp.length; i++) {
			if(i == loc) {
				temp[i] = val;
			}else if(i > loc) {
				temp[i] = t[i - 1];
			}else {
				temp[i] = t[i];
			}
		}
		t = temp;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		t[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[size() - 1];
		for(int i = 0; i<temp.length; i++) {
			if(i >= loc) {
				temp[i] = t[i + 1];
			}else {
				temp[i] = t[i];
			}
		}
		t = temp;
	}
	
	public int size() {
		return t.length;
	}
	
	public boolean contains(T val) {
		for(T t: t) {
			if(t.equals(val)) return true;
		}
		return false;
	}
}