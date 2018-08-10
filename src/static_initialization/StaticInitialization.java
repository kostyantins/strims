package static_initialization;


public class StaticInitialization {

        private static StaticInitialization instance = new StaticInitialization();

        private static final int DELTA = 6;
        private static int BASE = 7;
        private int x = 5;

        private StaticInitialization() {
            x = BASE + DELTA;
        }

        public static int countNumbers (){
            return instance.x;
        }

        public static void main(String... argv) {
            
            System.out.println(StaticInitialization.instance.x);

            System.out.println(countNumbers());
        }
    }

