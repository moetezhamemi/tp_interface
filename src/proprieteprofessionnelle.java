public class proprieteprofessionnelle extends propriete{
    private int nbemployes;
    private boolean estetatique;
    public proprieteprofessionnelle(int nb,boolean b,int i,personne p,String a,double s)
    {
        super(i,p,a,s);
        nbemployes = nb;
        estetatique = b;
    }
    @Override
    public double calculimpot() {
        if(estetatique == false)
        {
            double d =  ((getSurface()/100)*100) + (30 * nbemployes);
            return d;
        }
        else{
            return 0;
        }
    }


}
