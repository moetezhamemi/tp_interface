public class proprieteprivee extends propriete {
    private int nbpeices;
    public proprieteprivee(int nb,int i,personne p,String a,double s)
    {
        super(i,p,a,s);
        nbpeices = nb;
    }
    public double calculimpot()
    {
        double d = ((getSurface()/100)*50) + nbpeices * 10;
        return d;
    }
    public int getNbpeices() {
        return nbpeices;
    }

    public void setNbpeices(int nbpeices) {
        this.nbpeices = nbpeices;
    }
}
