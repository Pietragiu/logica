package modelo;

public class Matematica {

	public static void main(String[] args) {
      int v1 = 13;
      int v2 = 3;
      int e = (int) Math.pow(v1 , v2);
      float raiz = (float) Math.sqrt(e);
      
      System.out.printf("%d + %d ", v1 + v2 );
      System.out.printf("%d + %d ", v1 - v2 ); 
      System.out.printf("%d + %d ", v1 + v2 );
      System.out.printf("%d + %d ", v1 + v2 );
      System.out.printf("O resto e %d\n", v1,v2,v1 / v2);
      System.out.printf(" %d e %d\n", v1 ,v1, e);
      System.out.printf(" A raiz de %d\n",e, raiz);
      
      
      }

}
