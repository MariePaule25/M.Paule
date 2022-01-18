package exercice;

public class monapplication10 {
	public static void main(String arg[]) {
		System.out.println("Bienvenu dans mon application de gestion de ressources humaines");
		String employe1 = "yves";
		int salaire1;
		ServicesPaye2 servicePaye2;
		
		servicePaye2 = new ServicePaye2();
		salaire1 = servicePaye2.calculerSalaire(employe1);
		System.out.println(employe1+"a un salaire de"+salaire1);
}
}
