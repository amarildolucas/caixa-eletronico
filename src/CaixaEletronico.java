import java.util.ArrayList;


public class CaixaEletronico {
	float quantia;
	ArrayList qtdNotas;
	public CaixaEletronico() {
		qtdNotas = new ArrayList();
	}
	
	public boolean sacar(float quantia) {
		if (quantia <= 0) {
			return false;
		}
		else if (quantia > consultarSaldo()) {
			return false;
		}
		else {
			float valor = 0;
			for (int i = 0; i < qtdNotas.size(); i++) {
				
			}
			return true;
		}
	}
	
	public void repor(int nota, int qtdDeNotas) {
		for (int i = 0; i < qtdDeNotas; i++) {
			qtdNotas.add(nota);
		}
	}
	
	public float consultarSaldo() {
		float somaNotas = 0;
		
		if (!qtdNotas.isEmpty()) {
			for (int i = 0; i < qtdNotas.size(); i++) {
				somaNotas = somaNotas + ((Integer) qtdNotas.get(i)).intValue();
			}
		}
		return somaNotas;
	}
	
	public int mostraQtdTipoNotas(int nota) {
		int qtdDeNotas = 0;
		for (int i = 0; i < qtdNotas.size(); i++) {
			if (qtdNotas.get(i).equals(nota)) {
				qtdDeNotas = qtdDeNotas + 1;
			}
		}
		return qtdDeNotas;
	} 
}
