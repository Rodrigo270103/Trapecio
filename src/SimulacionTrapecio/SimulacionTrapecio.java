package SimulacionTrapecio;


public class SimulacionTrapecio {
	
	private TrapecioParalelo trapecio1;
	
	public void initialize() {
		trapecio1 = new TrapecioParalelo();
		trapecio1.start();
		}
	
	
	SimulacionTrapecio(){
		initialize();
	}
	public static void main (String[] args) {
		SimulacionTrapecio window = new SimulacionTrapecio();
		
	}
}