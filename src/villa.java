public class villa extends proprieteprivee{
    private boolean avecpiscine;
    public villa(boolean piscine,int nb,int i,personne p,String a,double s)
    {
        super(nb,i,p,a,s);
        avecpiscine = piscine;
    }
    public String toString()
    {
        String c = super.toString() + " nbpieces: " + getNbpeices() + " avec piscine ? : " + avecpiscine;
        return c;
    }
    @Override
    public double calculimpot() {
        if(avecpiscine == true)
        {
            return (200 + super.calculimpot());
        }
        else {
            return super.calculimpot();
        }
    }
}
