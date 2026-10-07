package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kae implements Comparable {
    public final rt2 a;
    public final vg4 b;

    public kae(rt2 rt2Var, vg4 vg4Var) {
        this.a = rt2Var;
        this.b = vg4Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        kae kaeVar = (kae) obj;
        rt2 rt2Var = this.a;
        long j = rt2Var != null ? rt2Var.b.a0 : this.b.a.b.q;
        rt2 rt2Var2 = kaeVar.a;
        return tre.P(rt2Var2 != null ? rt2Var2.b.a0 : kaeVar.b.a.b.q, j);
    }
}
