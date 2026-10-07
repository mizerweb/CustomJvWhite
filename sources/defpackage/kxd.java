package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kxd implements lxd {
    public final d9 a;
    public final m9b b;

    public kxd(d9 d9Var, m9b m9bVar) {
        this.a = d9Var;
        this.b = m9bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxd)) {
            return false;
        }
        kxd kxdVar = (kxd) obj;
        return this.a == kxdVar.a && this.b == kxdVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(activeCamera=" + this.a + ", token=" + this.b + ')';
    }
}
