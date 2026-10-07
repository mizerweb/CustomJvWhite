package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lt6 {
    public final int a;
    public final dii b;
    public final int c;
    public final boolean d;
    public final long e;
    public final boolean f;
    public final String g;

    public lt6(int i, dii diiVar, int i2, boolean z, long j, boolean z2) {
        String str;
        this.a = i;
        this.b = diiVar;
        this.c = i2;
        this.d = z;
        this.e = j;
        this.f = z2;
        switch (kt6.$EnumSwitchMapping$0[qt4.D(i)]) {
            case 1:
            case 2:
            case 3:
            case 4:
                str = "application/octet-stream";
                break;
            case 5:
            case 6:
            case 7:
                str = "application/x-binary; charset=x-user-defined";
                break;
            default:
                ore.o();
                throw null;
        }
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt6)) {
            return false;
        }
        lt6 lt6Var = (lt6) obj;
        return this.a == lt6Var.a && this.b == lt6Var.b && this.c == lt6Var.c && this.d == lt6Var.d && this.e == lt6Var.e && this.f == lt6Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qt4.g(nbh.n(zo5.c(this.c, (this.b.hashCode() + (qt4.D(this.a) * 31)) * 31, 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "UploadConfig(type=" + v0h.o(this.a) + ", backend=" + this.b + ", parallelism=" + this.c + ", parallelHeaderDisabled=" + this.d + ", chunkSize=" + this.e + ", uploadFromStart=" + this.f + ")";
    }
}
