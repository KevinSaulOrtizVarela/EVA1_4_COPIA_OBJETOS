package eva1_4_copia_objetos;
//PROJECTO PARA DIFERENCIAR LAS REFERENCIAS DE MEMORIAS 
/**
 * @author 16550549
 */
public class EVA1_4_COPIA_OBJETOS {

    public static void main(String[] args) {
        // TODO code application logic here
        int i = 5;
        System.out.println(" i =  " + 5);
        //CREAR UNA COPIA DE i
        int iCopia = i;
        System.out.println("Copia de i = " + iCopia);
        i++;
        System.out.println("i++ = " + i);
        System.out.println("iCopia = " + iCopia);
        //DECLARAR UN OBJETO DE TIPO NUMERO
        Numero nVal = new Numero();
        System.out.println("Valor de nVaL.i = " + nVal.i);
        Numero nCopiaVal = nVal; //CREAMOS UNA COPIA <-------- NO ES UNA COPIA
        System.out.println("Valor de nCopia.i = " + nCopiaVal.i);
        nVal.i++;
        //IMRIMIR nVal y nCopiaVal
        System.out.println("Valor de nCopia.i = " + nCopiaVal.i);
        System.out.println("Valor de nVaL.i = " + nVal.i);
        //IMPRIMIR LOS OBJETOS
        System.out.println(nVal);
        System.out.println(nCopiaVal);
        //COPIA REAL DE UN OBJETO
        Numero nCopiaReal = new Numero();
        nCopiaReal.i = nVal.i; //ATRIBUTO POR ATRIBUTO HACER LA COPIA
        System.out.println("Valor de nCopiaReal.i = " + nCopiaReal.i);
        System.out.println("Valor de nVaL.i = " + nVal.i);
        nVal.i++;
        System.out.println("Valor de nCopiaReal.i = " + nCopiaReal.i);
        System.out.println("Valor de nVaL.i = " + nVal.i);
        //IMPRIMIR LOS OBJETOS
         System.out.println(nVal);
        System.out.println(nCopiaVal);
        
    }

}
class Numero {

    public int i = 10;

}
