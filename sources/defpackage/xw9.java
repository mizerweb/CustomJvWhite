package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xw9 {
    public final hb9 a;
    public final rui b;

    public /* synthetic */ xw9(hb9 hb9Var, int i) {
        this((i & 1) != 0 ? null : hb9Var, (rui) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw9)) {
            return false;
        }
        xw9 xw9Var = (xw9) obj;
        return cqk.d(this.a, xw9Var.a) && cqk.d(this.b, xw9Var.b);
    }

    public final int hashCode() {
        hb9 hb9Var = this.a;
        int iHashCode = (hb9Var == null ? 0 : hb9Var.hashCode()) * 31;
        rui ruiVar = this.b;
        return iHashCode + (ruiVar != null ? ruiVar.hashCode() : 0);
    }

    public final String toString() {
        return "VideoPageState(mediaItem=" + this.a + ", videoContent=" + this.b + ")";
    }

    public xw9(hb9 hb9Var, rui ruiVar) {
        this.a = hb9Var;
        this.b = ruiVar;
    }
}
