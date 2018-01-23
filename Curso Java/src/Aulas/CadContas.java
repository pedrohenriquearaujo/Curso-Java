package Aulas;

public class CadContas {
	
	private RepositorioContasArray r;
	
	public CadContas(RepositorioContasArray r) {
		this.r = r;
	}
	
	public void inserir(Conta c){
		
		if(!r.existe(c.getNumero())){		
			r.inserir(c);
		}else{
			System.out.println("Conta já Existe");
		}
	}
	
	public void atualizar (Conta c){			
			r.atualizar(c);
	}
	
	public void remover (String numeroConta){
			r.remover(numeroConta);		
	}
	public Conta procurar(String numeroConta){
		return r.procurar(numeroConta);		
	}
}
