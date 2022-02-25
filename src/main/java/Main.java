public class Main {

	public static void main(String argv[]) {
        Pile maPile = new Pile(1);
        if (!maPile.estVide()) System.out.println("NOK1");

        try {
            maPile.empiler(5);
            if (maPile.estVide()) System.out.println("NOK2");

            if (maPile.sommet() != 5) System.out.println("NOK3");

            if (!maPile.estPleine()) System.out.println("NOK4");

            if (!maPile.toString().equals("|5|vide")) System.out.println("NOK5");
            
            maPile.depiler();
            if (!maPile.estVide()) System.out.println("NOK6");

            System.out.println(maPile);
        } catch (Exception e) {
        	System.out.println("Error: " + e);
        }
	}

}
