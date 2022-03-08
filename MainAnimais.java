package HerancaPolimorfismo;

public class MainAnimais {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguica pre = new Preguica();
		
		dog.setNome("Meg");
		dog.setIdade(10);
		dog.setFamilia("Canina");
		dog.setRaca("shitzu");
		dog.setPorte("Pequeno");
		
		cav.setNome("Snow");
		cav.setIdade(17);
		cav.setFamilia("Equina");
		cav.setRaca("Shire");
		cav.setColoracao("Preto com patas brancas");
		
		pre.setNome("cuca");
		pre.setIdade(32);
		pre.setFamilia("Choloepus");
		pre.setRaca("Pregui�a-real");
		pre.setHabitat("Mata atlantica/Amazonha");
		

		
		System.out.println("As informa��es do cachorro � ");
		System.out.println();
		
		System.out.println("Nome: "+dog.getNome());
		System.out.println("Idade: "+ dog.getIdade());
		System.out.println("Familia: "+dog.getFamilia());
		System.out.println("Ra�a: "+dog.getRaca());
		System.out.println("Porte: "+ dog.getPorte());
		
		System.out.println();
		dog.correr();
		dog.barulho();
		System.out.println();
		
		System.out.println("As informa�oes do cavalo � ");
		System.out.println();
		
		System.out.println("Nome: "+cav.getNome());
		System.out.println("Idade: "+ cav.getIdade());
		System.out.println("Familia: "+cav.getFamilia());
		System.out.println("Ra�a: "+cav.getRaca());
		System.out.println("Colora��o: "+cav.getColoracao());
		
		System.out.println();
		cav.correr();
		cav.barulho();
		System.out.println();
		
		System.out.println("As informa��es da pregui�a � ");
		System.out.println();
		
		System.out.println("Nome: "+pre.getNome());
		System.out.println("Idade: "+ pre.getIdade());
		System.out.println("Familia: "+pre.getFamilia());
		System.out.println("Ra�a: "+pre.getRaca());
		System.out.println("Habitat: "+pre.getHabitat());
		
		System.out.println();
		pre.escalar();
		pre.barulho();
		
		
		
	}

}
