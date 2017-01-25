public class Calcular
{
    private int [][] matriz;
    
    public Calcular()
    {
        matriz = new int[9][9];
    }
    // implementacion de los metodos Setter y Getters de los atributos de la clase Calcular
    public void setMatriz(int fil, int col, int val)
    {
        // le asignare a la matriz el valor de val, en la posicion fil, col que se hayan pasado como parametro
        matriz[fil][col] = val;
    }

    public int getMatriz(int fil, int col)
    {
        // retornare el valor que haya en la fil, col que se haya pasado como parametro
        return matriz[fil][col];
    }


    // implemnetacion del metodo para dibujar la matriz
    public void dibujarMatriz()
    {
        
        int temp = 1;

        for (int i = 0; i < 9; i++)
        {
            temp = i+1;
            for (int j = 0; j < 9; j++)
            {
                
                if (j < temp)
                {
                    
                    setMatriz(i, j, temp);
                }
                else
                {
                    
                    temp++;
                    
                    setMatriz(i, j, temp);
                }
            }
        }
    }
}