package casino;

class Tragamonedas {
	
	private Tambor t1;
	private Tambor t2;
	private Tambor t3;

    /**
     * post: los 3 Tambores del Tragamonedas están en la posición 1.
     */
    public Tragamonedas() { 
    	this.t1 = new Tambor();
    	this.t2 = new Tambor();
    	this.t3 = new Tambor();
    	
    }

    /**
     * post: activa el Tragamonedas haciendo girar sus 3 Tambores.
     */
    public void activar() { 
    	this.t1.girar();
    	this.t2.girar();
    	this.t3.girar();
    }

    /**
     * post: indica si el Tragamonedas entrega un premio a partir de la posición de sus 3 Tambores.
     */
    public boolean entregaPremio() { 
    	return t1.obtenerPosicion() == t2.obtenerPosicion() &&
    			t1.obtenerPosicion() == t3.obtenerPosicion();
    }

	@Override
	public String toString() {
		return "[" + t1.obtenerPosicion() + "]" +"[" + t2.obtenerPosicion() + "]" + 
	"[" + t3.obtenerPosicion() +"]";
	}
    
    public static void main(String[] args) {
		Tragamonedas tramposito = new Tragamonedas();
		//System.out.println(tramposito);
		
		int aciertos = 0;
		for (int i = 0; i < 100; i++) {
				tramposito.activar();
				if(tramposito.entregaPremio()) {
					aciertos ++;
					System.out.println("En el intento " + i + " salio: " + tramposito);
				}
		}
		System.out.println("Tuviste " + aciertos + " aciertos.");
		
		System.out.println("-------------------------");
		
		int intentos = 0;
		while(!tramposito.entregaPremio()) {
			tramposito.activar();
			intentos ++;
		}
		System.out.println(tramposito + " Luego de " + intentos + " intentos");
		
		
				
	}


}
