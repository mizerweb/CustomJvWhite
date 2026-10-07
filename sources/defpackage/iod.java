package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class iod implements mod {
    public final sx3 a;

    public iod(sx3 sx3Var) {
        this.a = sx3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iod) && cqk.d(this.a, ((iod) obj).a);
    }

    public final int hashCode() {
        sx3 sx3Var = this.a;
        if (sx3Var == null) {
            return 0;
        }
        return sx3Var.a.hashCode();
    }

    public final String toString() {
        return "FirstNamePayload(errorText=" + this.a + ")";
    }
}
