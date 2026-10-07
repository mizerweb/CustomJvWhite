package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o8f implements q8f {
    public final yq0 a;

    public o8f(yq0 yq0Var) {
        this.a = yq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8f) && this.a.equals(((o8f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchError(event=" + this.a + ")";
    }
}
