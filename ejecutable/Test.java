package ejecutable;

import modelo.Ahorros;

public class Test 
{
    public static void main(String[] args) 
    {
        Ahorros n = new Ahorros(20000000,0);

        System.out.println(n.calcularIntereses());
    }
}
