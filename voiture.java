class Voiture{
	int m_nbPortes;
	String m_nomMarque;
	int m_numMatricule;
	String m_couleur;

	//constructeur par defaut
	public Voiture(){
		m_nbPortes = 4;
		m_nomMarque = "Sans marque";
		m_couleur = "Sans Couleur"
		m_numMatricule = 0;
	}

	//constructeur avec paramètres
	public Voiture(String marque, String couleur, int portes, int matricule){

		m_nomMarque = marque;
		m_couleur= couleur;
		m_nbPortes = portes;
		m_numMatricule = matricule;
	}


}