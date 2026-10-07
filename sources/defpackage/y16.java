package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y16 {
    public final kb9 a;
    public final rui b;

    public /* synthetic */ y16(kb9 kb9Var, int i) {
        this((i & 1) != 0 ? null : kb9Var, (rui) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y16)) {
            return false;
        }
        y16 y16Var = (y16) obj;
        return cqk.d(this.a, y16Var.a) && cqk.d(this.b, y16Var.b);
    }

    public final int hashCode() {
        kb9 kb9Var = this.a;
        int iHashCode = (kb9Var == null ? 0 : kb9Var.hashCode()) * 31;
        rui ruiVar = this.b;
        return iHashCode + (ruiVar != null ? ruiVar.hashCode() : 0);
    }

    public final String toString() {
        return "VideoPageState(mediaItem=" + this.a + ", videoContent=" + this.b + ")";
    }

    public y16(kb9 kb9Var, rui ruiVar) {
        this.a = kb9Var;
        this.b = ruiVar;
    }
}
