package practica1;

import java.util.*;
public class Practica1 {

    //EJERCICIO 1
    public static Set<Integer> multiplos (Iterator<Integer> it) {
        Set<Integer> conjunto = new HashSet<>();
        Set<Integer> repetidos = new HashSet<>();      //Se guardaran aqui en el caso de que la coleccion tenga numeros repetidos

        while (it.hasNext()){
            int elem = it.next();
            if (elem != 0)  {
                if (conjunto.contains(elem))    {
                    repetidos.add(elem);
                }
                else {
                    conjunto.add(elem);
                }
            }
        }
        Set<Integer> resultado = new HashSet<>(repetidos);     //seran multiplos de ellos mismos ya que estan 2 veces, entonces se añaden todos

        for (int num1 : conjunto){
            for(int num2 : conjunto)    {
                if(num1 != num2 && num1%num2 == 0)  {
                    resultado.add(num1);
                }
            }
        }
        return resultado;
    }

    //EJERCICIO2
    public static void separate (Set<Integer> cuadrados, Set<Integer> noCuadrados)  {       //NO FUNCIONA

        Set<Integer> union = new HashSet<>(cuadrados);
        union.addAll(noCuadrados);

        Iterator<Integer> it1 = cuadrados.iterator();
        while (it1.hasNext()){
            int elem1 = it1.next();
            int raiz1 = (int) Math.sqrt(elem1);
            if (!union.contains(raiz1))   {
                it1.remove();                   //elimino el ultimo elemento leido por next
                noCuadrados.add(elem1);
            }
        }

        Iterator<Integer> it2 = noCuadrados.iterator();
        while (it2.hasNext())   {
            int elem2 = it2.next();
            int raiz2 = (int) Math.sqrt(elem2);
            if (union.contains(raiz2))   {
                it2.remove();                   //elimino el ultimo elemento leido por next
                cuadrados.add(elem2);
            }
        }
    }

    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) { //me va mal
        Collection<Set<T>> resultado = new LinkedList<>();

        Set<T> aux = new HashSet<>();
        while (it.hasNext()){
            T elem = it.next();
            if (aux.contains(elem))  {
                resultado.add(aux);
                aux = new HashSet<>();
                aux.add(elem);
            }
            else {
                aux.add(elem);
            }
        }
        if (!aux.isEmpty())
            resultado.add(aux);
        return resultado;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        Collection<Set<T>> resultado = new ArrayList<>();

        Iterator<Set<T>>
    }




}