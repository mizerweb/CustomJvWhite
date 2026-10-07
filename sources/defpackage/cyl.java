package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cyl {
    public static final e8g a(q8g q8gVar, esh eshVar, cf7 cf7Var) {
        eshVar.getClass();
        wfe wfeVar = new wfe();
        return new e8g(new e8g(q8gVar, new cmf(wfeVar, eshVar, false, 12), 1), new r6a(wfeVar, cf7Var, eshVar), 2);
    }

    public static xp9 b(nmc nmcVar) {
        nmcVar.O(1);
        int iD = nmcVar.D();
        long j = ((long) nmcVar.b) + ((long) iD);
        int i = iD / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jU = nmcVar.u();
            if (jU == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jU;
            jArrCopyOf2[i2] = nmcVar.u();
            nmcVar.O(2);
        }
        nmcVar.O((int) (j - ((long) nmcVar.b)));
        return new xp9(jArrCopyOf, 18, jArrCopyOf2);
    }

    public static final void c(esh eshVar, long j) {
        eshVar.getClass();
        if (eshVar instanceof gsh) {
            gsh gshVar = (gsh) eshVar;
            synchronized (gshVar) {
                gshVar.b(j / 1000000);
            }
        }
    }
}
