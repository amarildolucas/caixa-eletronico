import java.util.ArrayList;
import java.util.Collections;


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
			float valorAux;
			int aux;
			
			while (valor != quantia) {
				Collections.sort(qtdNotas);
				aux = (int) (quantia / (((Integer)qtdNotas.get(qtdNotas.size() - 1)).intValue()));
				if (mostraQtdTipoNotas (((Integer) qtdNotas.get(qtdNotas.size() - 1)).intValue()) == aux) {
					for (int i = 0; i < aux; i++) {
						valor = (int) valor + ((Integer) qtdNotas.get(qtdNotas.size() - 1)).intValue();
						qtdNotas.remove(qtdNotas.size() - 1);
					}
				}
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
