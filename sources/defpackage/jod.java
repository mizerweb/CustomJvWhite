package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jod implements mod {
    public final sx3 a;

    public jod(sx3 sx3Var) {
        this.a = sx3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jod) && cqk.d(this.a, ((jod) obj).a);
    }

    public final int hashCode() {
        sx3 sx3Var = this.a;
        if (sx3Var == null) {
            return 0;
        }
        return sx3Var.a.hashCode();
    }

    public final String toString() {
        return "LastNamePayload(errorText=" + this.a + ")";
    }
}
