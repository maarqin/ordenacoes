//import static org.junit.Assert.*;
//import org.junit.Test;
//import org.junit.After;
//import org.junit.Before;
////
/////**
//// * The test class OrdenacaoTest.
//// *
//// * @author  (your name)
//// * @version (a version number or a date)
//// */
//public class OrdenacaoTest
//{
////    /**
////     * Default constructor for test class OrdenacaoTest
////     */
////    public OrdenacaoTest()
////    {
////    }
////
////    /**
////     * Sets up the test fixture.
////     *
////     * Called before every test case method.
////     */
////    @Before
////    public void setUp()
////    {
////    }
////    
//    @Test
//    public void bubblesortTest() {
//        int[] a  = { 3, 5, 2, 6, 4, 8, 7, 9, 0, 1 },
//              ca = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
//              b  = { 3, 5, 2, 6, 4, 8, 7, 9, 0 },
//              cb = { 0, 2, 3, 4, 5, 6, 7, 8, 9 },
//              c  = { 3, 5, 3, 5, 3, 5 },
//              cc = { 3, 3, 3, 5, 5, 5 },
//              d  = { 1, 0 },
//              cd = { 0, 1 };
//        
//        Ordenacao.bubbleSort(a);
//        assertArrayEquals("Não ordena quantidades pares", a, ca);
//        
//        Ordenacao.bubbleSort(b);
//        assertArrayEquals("Não ordena quantidades ímpares", b, cb);
//        
//        Ordenacao.bubbleSort(c);
//        assertArrayEquals("Não ordena números repetidos", c, cc);
//        
//        Ordenacao.bubbleSort(d);
//        assertArrayEquals("Arranjo com apenas 2 elementos", d, cd);
//    }
//    
//    @Test
//    public void selectionsortTest() {
//        int[] a  = { 3, 5, 2, 6, 4, 8, 7, 9, 0, 1 },
//              ca = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
//              b  = { 3, 5, 2, 6, 4, 8, 7, 9, 0 },
//              cb = { 0, 2, 3, 4, 5, 6, 7, 8, 9 },
//              c  = { 3, 5, 3, 5, 3, 5 },
//              cc = { 3, 3, 3, 5, 5, 5 },
//              d  = { 1, 0 },
//              cd = { 0, 1 };
//        
//        Ordenacao.selectionSort(a);
//        assertArrayEquals("Não ordena quantidades pares", a, ca);
//        
//        Ordenacao.selectionSort(b);
//        assertArrayEquals("Não ordena quantidades ímpares", b, cb);
//        
//        Ordenacao.selectionSort(c);
//        assertArrayEquals("Não ordena números repetidos", c, cc);
//        
//        Ordenacao.selectionSort(d);
//        assertArrayEquals("Arranjo com apenas 2 elementos", d, cd);
//    }
//    
//    @Test
//    public void insertionsortTest() {
//        int[] a  = { 3, 5, 2, 6, 4, 8, 7, 9, 0, 1 },
//              ca = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
//              b  = { 3, 5, 2, 6, 4, 8, 7, 9, 0 },
//              cb = { 0, 2, 3, 4, 5, 6, 7, 8, 9 },
//              c  = { 3, 5, 3, 5, 3, 5 },
//              cc = { 3, 3, 3, 5, 5, 5 },
//              d  = { 1, 0 },
//              cd = { 0, 1 };
//        
//        Ordenacao.insertionSort(a);
//        assertArrayEquals("Não ordena quantidades pares", a, ca);
//        
//        Ordenacao.insertionSort(b);
//        assertArrayEquals("Não ordena quantidades ímpares", b, cb);
//        
//        Ordenacao.insertionSort(c);
//        assertArrayEquals("Não ordena números repetidos", c, cc);
//        
//        Ordenacao.insertionSort(d);
//        assertArrayEquals("Arranjo com apenas 2 elementos", d, cd);
//    }
////
////    /**
////     * Tears down the test fixture.
////     *
////     * Called after every test case method.
////     */
////    @After
////    public void tearDown()
////    {
////    }
//}
