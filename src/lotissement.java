 public class lotissement implements gestionpropriete{
    protected propriete[] tabProp;
    protected int nombre;
    public lotissement(int c)
    {
        tabProp = new propriete[c];
        nombre = 0;
    }
    public void afficherProprietes(int i) {
        System.out.println(tabProp[i].toString());
    }
    public boolean ajouter(propriete p) {
        if(nombre < MAX_PROPRIETES)
        {
            tabProp[nombre] = p;
            nombre ++;
            return true;
        }
        else {return false;
        }
    }
    public boolean supprimer(propriete p) {
        for(int i = 0;i<nombre;i++)
        {
            if(tabProp[i].getId() == p.getId())
            {
                for(int j= i;j<nombre-1;j++)
                {
                    tabProp[j] = tabProp[j+1];
                }
                nombre--;
                return true;
            }
        }
        return false;
    }
    propriete getproprietebyindex(int i)
    {
        return tabProp[i];
    }

    public int getNombre() {
        return nombre;
    }

    public int getnbpieces()
    {
        int n = 0;
        for(int i=0;i<nombre;i++)
        {
            if(tabProp[i] instanceof proprieteprivee)
            {n++;}
        }
        return n;
    }
}
