package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class h5f extends n86 {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable m(int i, nmc nmcVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(nmcVar.u()));
        }
        if (i == 1) {
            return Boolean.valueOf(nmcVar.A() == 1);
        }
        if (i == 2) {
            return o(nmcVar);
        }
        if (i != 3) {
            if (i == 8) {
                return n(nmcVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(nmcVar.u()));
                nmcVar.O(2);
                return date;
            }
            int iE = nmcVar.E();
            ArrayList arrayList = new ArrayList(iE);
            for (int i2 = 0; i2 < iE; i2++) {
                Serializable serializableM = m(nmcVar.A(), nmcVar);
                if (serializableM != null) {
                    arrayList.add(serializableM);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strO = o(nmcVar);
            int iA = nmcVar.A();
            if (iA == 9) {
                return map;
            }
            Serializable serializableM2 = m(iA, nmcVar);
            if (serializableM2 != null) {
                map.put(strO, serializableM2);
            }
        }
    }

    public static HashMap n(nmc nmcVar) {
        int iE = nmcVar.E();
        HashMap map = new HashMap(iE);
        for (int i = 0; i < iE; i++) {
            String strO = o(nmcVar);
            Serializable serializableM = m(nmcVar.A(), nmcVar);
            if (serializableM != null) {
                map.put(strO, serializableM);
            }
        }
        return map;
    }

    public static String o(nmc nmcVar) {
        int iH = nmcVar.H();
        int i = nmcVar.b;
        nmcVar.O(iH);
        return new String(nmcVar.a, i, iH);
    }
}
