public class Main {
    public static void main(String[] args) {

        personne p1 = new personne(0,"hamemi","moetez");
        personne p2 = new personne(0,"jday","louay");
        personne p3 = new personne(0,"mejrissi ","ahmed");
        lotissement l = new lotissement(10);
        lotissement lp= new lotissementprivee(10);
        proprieteprivee prop1 = new proprieteprivee(4,1,p1,"corniche",350);
        proprieteprivee prop2 = new proprieteprivee(6,4,p1,"jarra",1000);
        villa v1 = new villa(true,6,2,p2,"dar chaabane",400);
        appartement a1 = new appartement(3,8,3,p2,"hammamet",1200);
        proprieteprofessionnelle pp1 = new proprieteprofessionnelle(50,true,4,p3,"korba",1000);
        proprieteprofessionnelle pp2 = new proprieteprofessionnelle(400,false,5,p1,"bir bouragba",2500);
        l.ajouter(prop1);
        l.ajouter(v1);
        l.ajouter(a1);
        l.ajouter(pp1);
        l.ajouter(pp2);
        for (int i = 0; i < l.getNombre(); i++) {
            propriete prop = l.getproprietebyindex(i);
            System.out.println(prop.toString());
            System.out.println("impot a payer: " + prop.calculimpot());
        }
        l.getnbpieces();
        proprieteprivee pmin = null;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < l.getNombre(); i++) {
            propriete prop = l.getproprietebyindex(i);
            if (prop instanceof proprieteprivee) {
                double impots = prop.calculimpot();
                if (impots < min) {
                    min = impots;
                    pmin = (proprieteprivee) prop;
                }
            }
        }
        System.out.println("propriete avec moin dimpots");
        System.out.println("propriétaire: " + pmin.getResponsable().getNom());
        System.out.println("montant impot " + min);
        propriete ahammamet = null;
        for (int i = 0; i < l.getNombre(); i++) {
            propriete prop = l.getproprietebyindex(i);
            if (prop instanceof appartement && prop.getAdresse().equals("hammamet")) {
                ahammamet = prop;
                break;
            }
        }
        l.supprimer(ahammamet);
        for (int i = 0; i < l.getNombre(); i++) {
            System.out.println(l.getproprietebyindex(i).toString());}
        lp.ajouter(prop1);
        lp.ajouter(prop2);
        System.out.println(lp.getproprietebyindex(0).toString());
        System.out.println(lp.getnbpieces());
    }
}