package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class czl {
    public static final String a(nh6 nh6Var) {
        String str = nh6Var.n;
        String str2 = nh6Var.g;
        int i = nh6Var.l;
        int i2 = nh6Var.k;
        long j = nh6Var.c;
        ex3 ex3Var = nh6Var.j;
        int i3 = nh6Var.r;
        StringBuilder sbQ = qv1.q("video codec: ", str, ", audio codec: ", str2, ", size: ");
        qt4.x(i, i2, "X", " px,\nfile size: ", sbQ);
        sbQ.append(j);
        sbQ.append(" bytes, colorInfo: ");
        sbQ.append(ex3Var);
        return zo5.v(sbQ, "\nresult: ", i3);
    }

    public static int b(float f) {
        if (Float.isNaN(f)) {
            return 0;
        }
        int iK = gm0.K(f);
        if (iK < 0) {
            return -1;
        }
        if (iK == 0) {
            return 0;
        }
        if (1 > iK || iK >= 101) {
            return 100;
        }
        return iK;
    }
}
