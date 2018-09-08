public interface State {

	public abstract void insert(int coin);

	public abstract void eject();

	public abstract void turnCrank();

	public abstract void dispense();

}
