package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class me5 extends te5 implements Comparable {
    public final int e;
    public final int f;

    public me5(int i, hyh hyhVar, int i2, pe5 pe5Var, int i3) {
        super(i, hyhVar, i2);
        this.e = ks0.k(i3, pe5Var.B0) ? 1 : 0;
        this.f = this.d.b();
    }

    @Override // defpackage.te5
    public final int a() {
        return this.e;
    }

    @Override // defpackage.te5
    public final /* bridge */ /* synthetic */ boolean b(te5 te5Var) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((me5) obj).f);
    }
}
