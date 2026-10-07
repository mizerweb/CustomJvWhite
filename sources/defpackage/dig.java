package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dig {
    public final l40 a;
    public final ewe b;

    public dig(l40 l40Var, ewe eweVar) {
        this.a = l40Var;
        this.b = eweVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dig) {
            dig digVar = (dig) obj;
            return cqk.d(this.a, digVar.a) && this.b == digVar.b;
        }
        return false;
    }

    public final int hashCode() {
        l40 l40Var = this.a;
        return this.b.hashCode() + ((l40Var == null ? 0 : l40Var.hashCode()) * 31);
    }

    public final String toString() {
        return "StartMessage(media=" + this.a + ", text=" + this.b + ")";
    }
}
