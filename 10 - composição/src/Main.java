
public class Main {
	public static void main(String[] args) {
		
		Jogador j1 = new Jogador("D'alessandro");
		System.out.println(j1);
		System.out.println(j1.getNome());
		j1.setNome("Andrés D'alessandro");
		System.out.println(j1);
		
		Jogador j2 = new Jogador("Geromel");
		
		System.out.println(j2);
		
		Time t1 = new Time("Internacional");
		System.out.println(t1);
		
		System.out.println(t1.getNroJogadores() == 0);
		
		t1.contrata(j1, 10);
		
		int nro = t1.getNroJogadores();
		System.out.println(nro == 1);
		
		Jogador[] equipe = t1.getEquipe();
		System.out.println(equipe.length == 1);
		System.out.println(j1.equals(equipe[0]));
		
		try {
			t1.contrata(j2, 0);
		} catch (Exception e) {
			System.err.println(e);
		}
		
		try {
			t1.contrata(j2, 51);
		} catch (Exception e) {
			System.err.println(e);
		}
		
		try {
			t1.contrata(j2, 10);
		} catch (Exception e) {
			System.err.println(e);
		}
		
		// t1.demite(10);			
		Time t2 = new Time("Gremio");
		Time t3 = new Time("Juventude");
		Time t4 = new Time("São Paulo");
		
		// n * (n - 1) 
		int f = Util.fatorial(5);
		System.out.println(f == 120);
		System.out.println(Util.fatorial(0) == 1);
		System.out.println(Util.fatorial(1) == 1);

		int comb = Util.combinacao(4, 2);
		System.out.println(comb == 6);
		
		//Jogo j1 = new Jogo(t1, t2);
		
		Campeonato c = new Campeonato("Gauchão", 2017, t1, t2, t3, t4);
		// t1 vs t2
		// t1 vs t3
		// t1 vs t4
		// t2 vs t3
		// t2 vs t4
		// t3 vs t4		
		System.out.println(c.getNome().equals("Gauchão"));
		Time[] times = c.getTimes();
		System.out.println(times.length == 4);
		System.out.println(times[0] == t1);
		System.out.println(times[1] == t2);
		System.out.println(times[2] == t3);
		System.out.println(times[3] == t4);
		Jogo[] jogos = c.getJogos();
		System.out.println(jogos.length == 6);
		
		Time campeao = c.getCampeao();
		System.out.println(campeao == null);
		
		while (c.aberto()) {
			c.placar((int)(Math.random() * 6),
					 (int)(Math.random() * 6));
		}
		
		campeao = c.getCampeao();
		System.out.println(campeao != null);
		System.out.println(campeao);
		
		
		
		
		
		
		
		
		
	}
}
