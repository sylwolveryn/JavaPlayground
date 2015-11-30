class Engine {
	public Engine(){}
	protected Engine(Engine other) {}
	
	public Engine copy() {
		return new Engine(this);
	}
	
	public String toString() {
		return getClass().getName();
	}
}

class TurboEngine() {
	public TurboEngine() {
		super(); 
	}
	
	public TruboEngine(TurboEngine other) {
		super(other);
	}
}

class PistonEngine() {
	public PistonEngine() {
		super(); 
	}
	
	public PistonEngine(PistonEngine other) {
		super(other);
	}
}