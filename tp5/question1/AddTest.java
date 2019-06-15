package question1;

public class AddTest extends junit.framework.TestCase {
    //Test de la méthode Add dans la classe Ensemble.
    public void testAdd() {//q1-2
        question1.Ensemble<Integer> e1, e2;
        e1 = new question1.Ensemble();
        e2 = new question1.Ensemble();
        assertEquals(true, e1.add(2));
        assertEquals(true, e1.add(3));
        assertEquals(2, e1.size());

        assertEquals(true, e2.add(3));
        assertEquals(true, e2.add(4));
        assertEquals(2, e2.size());

        assertEquals(false, e1.add(2));//déjà ajouter
        assertEquals(2, e1.size());
        
        assertTrue(e1.contains(2));
        assertTrue(e1.contains(3));
        assertTrue(e2.contains(4));
         
        assertEquals(true, e1.add(6));
        assertEquals(3, e1.size());
    }
}