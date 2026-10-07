package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d10 extends f10 {
    public final long a;
    public final boolean b;
    public final boolean c;

    public d10(long j, boolean z, boolean z2) {
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
        if (!(obj instanceof d10)) {
            return false;
        }
        d10 d10Var = (d10) obj;
        return this.a == d10Var.a && this.b == d10Var.b && this.c == d10Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nbh.n(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return nbh.z(qt4.u(this.a, "LoadingNext(time=", ", isRemoteCaused=", this.b), ", remoteHasNew=", this.c, ")");
    }

    public /* synthetic */ d10(long j) {
        this(j, false, false);
    }
}
