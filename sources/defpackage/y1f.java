package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y1f {
    public final String a;
    public final long b;
    public final boolean c;
    public final String d;

    public y1f(long j, String str, gda gdaVar, String str2) {
        this.a = gdaVar.g;
        ng5 ng5Var = gdaVar.q;
        this.b = ng5Var != null ? ng5Var.a : System.currentTimeMillis();
        this.c = gdaVar.e == xja.d;
        Object objT1 = ww3.t1(gdaVar.h);
        String str3 = null;
        puc pucVar = objT1 instanceof puc ? (puc) objT1 : null;
        if (pucVar != null) {
            String str4 = pucVar.n;
            str3 = str4 == null ? pucVar.d : str4;
        }
        this.d = str3;
    }
}
