package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f2b {
    public final String a;
    public final int b;
    public final int c;

    public f2b(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2b)) {
            return false;
        }
        f2b f2bVar = (f2b) obj;
        return this.a.equals(f2bVar.a) && this.b == f2bVar.b && this.c == f2bVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + spc.a(this.b, this.a.hashCode() * 31);
    }

    public final String toString() {
        return zo5.t(c0a.r(this.b, "Quality(link=", this.a, ", width=", ", height="), this.c, ")");
    }
}
