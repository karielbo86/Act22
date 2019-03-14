class Voiture{
	int m_nbPortes;
	String m_nomMarque;
	int m_numMatricule;
	String m_couleur;
	String m_typemoteur;

	//constructeur par defaut
	public Voiture(){
		m_nbPortes = 4;
		m_nomMarque = "Sans marque";
		m_couleur = "Sans Couleur"
		m_numMatricule = 0;
		m_typemoteur = "Sans type":
	}

	//constructeur avec paramètres
	public Voiture(String marque, String couleur, int portes, int matricul, String typemoteur){

		m_nomMarque = marque;
		m_couleur= couleur;
		m_nbPortes = portes;
		m_numMatricule = matricule;
		m_typemoteur = typemoteur;
	}

	///****************ACCESSEURS*********************///
	public String getMarque(){
		return m_nomMarque;
	}

	public String getCouleur(){

		return m_couleur;
	}

	public int getPortes(){

		return m_nbPortes;
	}

	public int getMatricule(){
		return m_numMatricule;
	}

	public String getTypeMoteur(){
		return m_typemoteur;
	}

	//************MUTATEURS**********************/
	public void setMarque(String marque){
			m_nomMarque = marque;

	}

	public void setCouleur(String couleur){
		m_couleur = couleur;
	}

	public void setPortes(int portes){
		m_nbPortes = portes;
	}

	public void setMatricule(int matricule){
		m_numMatricule = matricule;
	}

	public void setTypeMoteur(String typemoteur){

		m_typemoteur = typemoteur;
	}


}