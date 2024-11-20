abstract public class propriete {
    private int id;
    private personne responsable;
    private String adresse;
    private double surface;
    public propriete(int i,personne p,String a,double s)
    {
        id = i;
        responsable = p;
        adresse = a;
        surface = s;
    }
    public String toString()
    {
        String c = "id: " + id +" nom responsable: " + responsable.getNom() + "prenom responsable:  "+ responsable.getPrenom() + "cin responsable: " + responsable.getCin() +
                "adresse: "+ adresse + "surface: " + surface;
        return c;
    }
    public abstract double calculimpot();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public personne getResponsable() {
        return responsable;
    }

    public void setResponsable(personne responsable) {
        this.responsable = responsable;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }
}
