package br.com.etec.biblioteca.cadastro;

public class ClasseInformacoes {

	//Atributos
	String titulosAt;
	String subtitulosAt;
	int numerosPaginasAt;
	String autoresAt;
	String generosAt;
	
	//Construtor vazio
	public ClasseInformacoes(){
		
	}
	
	//Construtor 
	public ClasseInformacoes(String autorPar, String tituloPar){
		this.autoresAt = autorPar;
		this.titulosAt = tituloPar;
	}
	
	//Getters
	public String getTitulos(){
		return titulosAt;
	}
	
	public String getSubtitulos(){
		return subtitulosAt;
	}


	public int getNumerosPaginas(){
		return numerosPaginasAt;
	}
	
	public String getAutores(){
		return autoresAt;
	}

	public String getGenero(){
		return generosAt;
	}

	//Setters
	public void setTitulos(String titulosPar){
		this.titulosAt = titulosPar;
	}

	public void setSubtitulos(String subtitulosPar){
		this.subtitulosAt = subtitulosPar;
	}

	public void setNumerosPaginas(int numerosPaginasPar){
		this.numerosPaginasAt = numerosPaginasPar;
	}

	public void setAutores(String autoresPar){
		this.autoresAt = autoresPar;
	}

	public void setGenero(String generosPar){
		this.generosAt = generosPar;
	}

	//Método próprio
	public void mostrarDados(){
		System.out.println("Informações do produto:");
		System.out.println(titulosAt);
		System.out.println(subtitulosAt);
		System.out.println(numerosPaginasAt);
		System.out.println(autoresAt);
		System.out.println(generosAt);
	}
}
