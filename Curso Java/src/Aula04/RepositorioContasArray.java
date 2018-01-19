package Aula04;

public class RepositorioContasArray {

	

	public static final int TAM_CACHE_CONTAS = 100;
	private Conta contas[];
	private static int indice;
	
	public static int getIndice() {
		return indice;
	}
	
	public RepositorioContasArray(){
		indice = 0;
		contas = new Conta [TAM_CACHE_CONTAS];		
	}
	
	public void inserir(Conta c){
		
		contas[indice] = c;
		indice++;		
	}
	
	public void atualizar (Conta c){
		
		int i = procurarIndice(c.getNumero());
		
		if(i != -1){			
			contas[i]= c;
		}else{
			System.out.println("Conta não encontrada");
		}
	}
	
	public void remover (String numeroConta){
		
		if(existe(numeroConta)){
			int i = procurarIndice(numeroConta);
			contas[i] = contas[indice - 1];
			contas[indice - 1] = null;
			indice = indice - 1;			
		}
		
	}
	
	private int procurarIndice(String numeroConta){
		
		int ind =-1;
		
		for(int i=0; i < RepositorioContasArray.getIndice();i++){
			
			if(contas[i].getNumero().equals(numeroConta)){
				ind=i;
				break;				
			}
			i++;			
		}
		return ind;		
	}
	
	public boolean existe (String numeroConta){
		
		boolean resp = false;
		
		int i = procurarIndice(numeroConta);
		
		if( i != -1){
			resp = true;
		}
		
		return resp;
		
	}
	
	public Conta procurar(String numeroConta){
		
		Conta c = null;
		
		int i = procurarIndice(numeroConta);
		
		if(i != -1 ){
			contas[i] = c;
		}else{
			System.out.println("Conta não encontrada");
		}		
		return c;		
	}
}
