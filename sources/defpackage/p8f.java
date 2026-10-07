package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p8f implements q8f {
    public final r73 a;

    public p8f(r73 r73Var) {
        this.a = r73Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8f) && this.a == ((p8f) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchResult(result=" + this.a + ")";
    }
}
