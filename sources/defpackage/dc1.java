package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dc1 {
    public final int a;
    public final long b;

    public dc1(int i, long j) {
        lvb.R(j >= 0);
        this.a = i;
        this.b = j;
    }

    public static dc1 c(long j) {
        return new dc1(8, j, false);
    }

    public static dc1 d(int i) {
        return new dc1(3, i, false);
    }

    public static dc1 e(long j) {
        return new dc1(9, j, false);
    }

    public static dc1 g(int i) {
        return new dc1(2, i, false);
    }

    public static dc1 h(kj6 kj6Var, nmc nmcVar) {
        kj6Var.u(0, nmcVar.a, 8);
        nmcVar.N(0);
        return new dc1(nmcVar.m(), nmcVar.r(), false);
    }

    public static dc1 i() {
        return new dc1(1, 0L, false);
    }

    public static dc1 j() {
        return new dc1(10, 0L, false);
    }

    public static dc1 k(long j) {
        return new dc1(4, j, false);
    }

    public boolean f() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public dc1(boolean z, long j, int i) {
        this.b = j;
        this.a = i;
    }

    public /* synthetic */ dc1(int i, long j, boolean z) {
        this.a = i;
        this.b = j;
    }
}
