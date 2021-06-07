import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Echiquier e = new Echiquier();
    	Piece roi = new Roi(4, 4,1);
        Piece pion = new Pion(2, 4,0);
        Piece fou = new Fou(3, 5,0);

        /*Demo Echec : Il y a echec */
        e.setCase(e.getCase(4, 4), roi);
        e.setCase(e.getCase(3, 4), pion);
        e.setCase(e.getCase(3, 5), fou);
        
        System.out.println(e.afficher());
        System.out.println(e.enEchec(roi));
        System.out.println("Se fait manger par le fou");
        
        
        
        Echiquier e2 = new Echiquier();
        Case d = e2.getCase(5,3);
        Case a = e2.getCase(4,3);
        e2.setCase(d, new Roi(5,3,0));
        e2.setCase(a, new Pion(3,3,0));
        System.out.println(d.getP().verifDeplacement(e2,a));
//        d.getPiece().deplacerPieces(e,a);
        //System.out.println(e2.afficher());
        
  

}

	}


