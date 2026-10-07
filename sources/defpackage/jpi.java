package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jpi extends mpi {
    public final b68 a;
    public final boolean b;
    public final u8b c;

    public jpi(b68 b68Var, boolean z, u8b u8bVar) {
        this.a = b68Var;
        this.b = z;
        this.c = u8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpi)) {
            return false;
        }
        jpi jpiVar = (jpi) obj;
        return this.a.equals(jpiVar.a) && this.b == jpiVar.b && cqk.d(this.c, jpiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nbh.n(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ShowPhoto(config=" + this.a + ", useFallbackBlur=" + this.b + ", layers=" + this.c + ")";
    }
}
