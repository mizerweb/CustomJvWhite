package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mll {
    public static final sgg a(gu4 gu4Var, long j, xhh xhhVar, cic cicVar, String str) {
        return yab.h0(gu4Var, ((n0c) xhhVar).a(), 2, new h99(str, cicVar, j, (lq4) null));
    }

    public static qx2 b(String str) {
        y1 y1Var = new y1(0, qx2.d);
        while (y1Var.hasNext()) {
            qx2 qx2Var = (qx2) y1Var.next();
            if (qx2Var.a.equals(str)) {
                return qx2Var;
            }
        }
        ore.f("Collection contains no element matching the predicate.");
        return null;
    }
}
