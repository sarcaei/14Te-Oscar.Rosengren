
public class Lastbil extends Bil {
	
	public int lastutrymme; //lastutrymme i kubikmeter
	
	public Lastbil(int p, int v, String f, String r, int h, double a, int l) {
		super(p, v, f, r, h, a);
		lastutrymme = l;
	}
}