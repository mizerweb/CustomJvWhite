package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ne5 implements Comparable {
    public final boolean a;
    public final boolean b;

    public ne5(int i, b87 b87Var) {
        this.a = (b87Var.e & 1) != 0;
        this.b = ks0.k(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ne5 ne5Var) {
        return a54.a.d(this.b, ne5Var.b).d(this.a, ne5Var.a).f();
    }
}
