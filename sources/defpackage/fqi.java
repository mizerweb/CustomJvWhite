package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fqi extends oqi {
    public final tnh a;
    public final ro1 b;

    public fqi(tnh tnhVar, ro1 ro1Var) {
        this.a = tnhVar;
        this.b = ro1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fqi) {
            fqi fqiVar = (fqi) obj;
            return this.a.equals(fqiVar.a) && this.b == fqiVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.c) * 31);
    }

    public final String toString() {
        return "ShowHideAuthorSnackbar(title=" + this.a + ", onDismiss=" + this.b + ")";
    }
}
