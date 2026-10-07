package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ck8 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Object b;

    static {
        Charset.forName("ISO-8859-1");
        b = new Object();
    }

    public static int a(Map map, int i, int i2, int i3) {
        int iM = uu3.m(i);
        int iJ = 0;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null || value == null) {
                ore.k("keys and values in maps cannot be null");
                return 0;
            }
            int iD = uu3.d(2, i3, value) + uu3.d(1, i2, key);
            iJ += uu3.j(iD) + iM + iD;
        }
        return iJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r7v0, types: [sia] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Serializable] */
    public static final Map b(su3 su3Var, Map map, em9 em9Var, int i, int i2, sia siaVar, int i3, int i4) throws InvalidProtocolBufferNanoException {
        Map mapK = em9Var.k(map);
        int iE = su3Var.e(su3Var.p());
        Serializable serializableC = null;
        while (true) {
            int iS = su3Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == i3) {
                serializableC = su3Var.k(i);
            } else if (iS == i4) {
                if (i2 == 11) {
                    su3Var.j((sia) siaVar);
                } else {
                    siaVar = su3Var.k(i2);
                }
            } else if (!su3Var.u(iS)) {
                break;
            }
        }
        su3Var.a(0);
        su3Var.d(iE);
        if (serializableC == null) {
            serializableC = c(i);
        }
        if (siaVar == 0) {
            siaVar = c(i2);
        }
        mapK.put(serializableC, siaVar);
        return mapK;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [byte[], java.io.Serializable] */
    public static Serializable c(int i) {
        switch (i) {
            case 1:
                return Double.valueOf(0.0d);
            case 2:
                return Float.valueOf(0.0f);
            case 3:
            case 4:
            case 6:
            case 16:
            case 18:
                return 0L;
            case 5:
            case 7:
            case 13:
            case 14:
            case 15:
            case 17:
                return 0;
            case 8:
                return Boolean.FALSE;
            case 9:
                return "";
            case 10:
            case 11:
            default:
                ore.p(c0a.k(i, "Type: ", " is not a primitive type."));
                return null;
            case 12:
                return sb8.i;
        }
    }

    public static void d(uu3 uu3Var, Map map, int i, int i2, int i3) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null || value == null) {
                ore.k("keys and values in maps cannot be null");
                return;
            }
            int iD = uu3.d(2, i3, value) + uu3.d(1, i2, key);
            uu3Var.F(i, 2);
            uu3Var.C(iD);
            uu3Var.u(1, i2, key);
            uu3Var.u(2, i3, value);
        }
    }
}
