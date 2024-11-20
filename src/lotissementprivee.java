public class lotissementprivee extends lotissement {

        public lotissementprivee(int c) {
            super(c);
        }
        @Override
        public boolean ajouter(propriete p) {
            if (p instanceof proprieteprivee) {
                if (nombre < MAX_PROPRIETES) {
                    tabProp[nombre] = p;
                    nombre++;
                    return true;
                }
            }
            return false;
        }
        public proprieteprivee getproprietebyindex(int i) {
            if (i >= 0 && i < nombre && tabProp[i] instanceof proprieteprivee) {
                return (proprieteprivee) tabProp[i];
            }
            return null;
        }
        @Override
        public int getnbpieces() {
            int n = 0;
            for (int i = 0; i < nombre; i++) {
                if (tabProp[i] instanceof proprieteprivee) {
                    n++;
                }
            }
            return n;
        }
    }
