
class Data implements IData {
	
	private int dia = 1, mes = 1, ano = 2000;
	private int[] dias = 
		{31, 28, 31, 30, 31, 30, 
		 31, 31, 30, 31, 30, 31};

	private boolean ehBissexto() {
		return this.ano % 4 == 0 || 
		   (this.ano % 400 == 0 
		    && this.ano % 100 != 0);			
	}
	
	@Override
	public int getDia() {
		return this.dia;
	}

	@Override
	public int getMes() {
		return this.mes;
	}

	@Override
	public int getAno() {		
		return this.ano;
	}

	@Override
	public String getData() {		
		return (this.dia < 10 ? "0" : "") 
				+ this.dia 
				+ "/" 
				+  (this.mes < 10 ? "0" : "") 
				+ this.mes
				+ "/" + this.ano;
	}
	
	@Override
	public String toString() {
		return this.getData();
	}

	private boolean ehUltimoDia() {
		if (ehBissexto() && this.mes == 2) {
			return this.dia == 29;
		} else {
			return this.dia == this.dias[this.mes - 1];
		}
	}
	
	@Override
	public void amanha() {		
		if (ehUltimoDia()) {
			this.mes++;
			if (this.mes == 13) {
				this.mes = 1;
				this.ano++;
			}
			this.dia = 1;
		} else {
			this.dia++;
		}
	}

	@Override
	public void avanca(int n, Parte parte) {
		switch(parte) {
		case DIAS: for (int i = 0; i < n; i++) amanha(); break;
		case MESES:
		case ANOS:
		}		
	}

	@Override
	public void volta(int n, Parte parte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ontem() {
		// TODO Auto-generated method stub
		
	}

}
