package tools;

import API.ABBTDA;

public class UtilidadesArbolBinario {

    public static boolean existeElementoEnABB(ABBTDA t, int x) {
        if (t.ArbolVacio()) {
            return false;
        } else if (t.Raiz() == x) {
                return true;
            }
            if (t.Raiz() > x) {
                return existeElementoEnABB(t.HijoIzq(), x);
            } else {
                return existeElementoEnABB(t.HijoDer(), x);
            }
        }
    }
