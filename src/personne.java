public class personne {
    private int cin;
    private String nom;
    private String prenom;
    public personne(int c,String n,String p)
    {
        cin = c;
        nom = n;
        prenom = p;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String toString()
    {
        String c = "cin: " + cin +" nom: " + nom + "prenom: "+ prenom;
        System.out.println(" ");
        return c;

    }

}
