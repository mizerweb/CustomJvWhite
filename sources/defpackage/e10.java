package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e10 extends f10 {
    public final long a;
    public final boolean b;
    public final boolean c;

    public e10(long j, boolean z, boolean z2) {
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    public final boolean a() {
        return this.c;
    }

    public final long b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e10)) {
            return false;
        }
        e10 e10Var = (e10) obj;
        return this.a == e10Var.a && this.b == e10Var.b && this.c == e10Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nbh.n(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return nbh.z(qt4.u(this.a, "LoadingPrev(time=", ", isRemoteCaused=", this.b), ", remoteHasNew=", this.c, ")");
    }

    public /* synthetic */ e10(long j) {
        this(j, false, false);
    }
}
