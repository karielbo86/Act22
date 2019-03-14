class Main{

	public static void main(String[] args){

		Voiture V1 = new Voiture();
		Voiture V2 = new Voiture("Renault", "Blanche", 4, 785963, "Elec");

		V1.setMarque("Peugeot");
		V1.setCouleur("Noire");
		V1.setPortes(3);
		V1.setMatricule(456852);
		V1.setTypeMoteur("Diesel");

	}
}