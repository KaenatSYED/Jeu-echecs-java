
public class TestRoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Piece piece1 = new Piece(1,1,1);
		
		Case c2 = new Case(2,2,piece1);
		
		Roi ro1 = new Roi(1,2,0);
		
		System.out.println(piece1.toString());
		System.out.println(c2.toString());
		System.out.println(ro1.toString());

        Echiquier e2 = new Echiquier();
        Case d = e2.getCase(5,3);
        Case a = e2.getCase(4,3);
        e2.setCase(d, new Roi(5,3,0));
        e2.setCase(a, new Pion(3,3,0));
        System.out.println("\n");
        System.out.println(d.getP().verifDeplacement(e2,a));
        System.out.println("\n");
        
		
		System.out.println("Test ok !");

	}

}
