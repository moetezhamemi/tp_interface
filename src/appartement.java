public class appartement extends proprieteprivee{
    private int numetage;
    public appartement(int num,int nb,int i,personne p,String a,double s)
    {
        super(nb,i,p,a,s);
        numetage = num;
    }
    public String toString()
    {
        String c = super.toString() + "nbpieces: " + getNbpeices() + "num etage : " + numetage;
        return c;
    }

}
