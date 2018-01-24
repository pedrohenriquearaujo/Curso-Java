package Aulas;

public class CadContas {
	
	private RepositorioContasArray r;
	
<<<<<<< HEAD
	public CadContas(RepositorioContasArray r) {
		this.r = r;
	}
	
=======
>>>>>>> fdd5bbb4b3aafad698ca3fb917504cc795940d45
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
<<<<<<< HEAD
			r.remover(numeroConta);		
=======
		r.remover(numeroConta);		
>>>>>>> fdd5bbb4b3aafad698ca3fb917504cc795940d45
	}
	public Conta procurar(String numeroConta){
		return r.procurar(numeroConta);		
	}
<<<<<<< HEAD
=======
	

>>>>>>> fdd5bbb4b3aafad698ca3fb917504cc795940d45
}
