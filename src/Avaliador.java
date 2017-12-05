public class Avaliador {
	
	double maiorDeTodos;
	double menorDeTodos;
	
	public void avalia(Leilao leilao){
		for(Lance lance: leilao.getLances()){
			if(lance.getValor() > maiorDeTodos) {
				maiorDeTodos = lance.getValor();
			}else{
				menorDeTodos = lance.getValor();
			}
		}
	}
}
