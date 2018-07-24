package polimorfismo;
// uma caixa com tipagem paramétrica
public class Box<T> {

	private T obj;
	
	public Box() {}
	
	public Box(T o) { this.obj = o; }
	
	public void set(T o) { this.obj = o; }
	
	public T get() { return this.obj; }
	
	public boolean isEmpty() { return this.obj == null; }
	
}
