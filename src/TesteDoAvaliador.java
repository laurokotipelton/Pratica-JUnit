
public class TesteDoAvaliador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario l1 = new Usuario(1, "Lauro");
		Usuario l2 = new Usuario(2, "Leila");
		Usuario l3 = new Usuario(3, "Alice");
		
		Leilao l = new Leilao("Carros");
		
		Lance carros1 = new Lance(l1, 300);
		Lance carros2 = new Lance(l2, 400);
		Lance carros3 = new Lance(l3, 250);
		
		Avaliador av = new Avaliador();
		
		av.avalia(l);
		
		
	}

}
