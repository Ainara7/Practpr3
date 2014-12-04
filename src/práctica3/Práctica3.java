package práctica3;

import java.math.BigInteger;

public class Práctica3 {
    private static BigInteger multiplicaciónRusa (BigInteger a, BigInteger b){
      BigInteger dos = new BigInteger("2");
      if (b == BigInteger.ONE) return a;
      if (b.mod(dos) == BigInteger.ZERO) return multiplicaciónRusa(a.multiply(dos),b.divide(dos));
      return a.add(multiplicaciónRusa(a.multiply(dos),b.divide(dos)));
    }
    
     private static BigInteger sumasSucesivas(BigInteger a, BigInteger b) {
         if(a == BigInteger.ZERO) return b;
         return sumasSucesivas(a.subtract(BigInteger.ONE), b).add(b);
     }
    
    public static void main(String[] args) {
        BigInteger a = new BigInteger("00000");
        BigInteger b = new BigInteger("12345");
        BigInteger f = sumasSucesivas(a, b);
        System.out.println(f);
        //System.out.println("Tamaño de las Ristras         Tiempo Sumas   Tiempo Rusas   Tiempo Egipcia");
        
        //double tiempo = System.currentTimeMillis();
       
    }

   
    
}
