class Util {

	public static int fatorial(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++) f *= i;	
		return f;
	}
	
	public static int fact(int n) {
		if (n <= 1) return 1;
		return n * fact(n - 1);
	}

	public static int combinacao(int n, int p) {
		return fatorial(n) / 
				(fatorial(p) * fatorial(n - p));
	}

	
	
	
	
	
	
	
	
}
