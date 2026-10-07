package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o53 {
    public final qy9 a;
    public final rui b;

    public /* synthetic */ o53(py9 py9Var, int i) {
        this((i & 1) != 0 ? null : py9Var, (rui) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o53)) {
            return false;
        }
        o53 o53Var = (o53) obj;
        return cqk.d(this.a, o53Var.a) && cqk.d(this.b, o53Var.b);
    }

    public final int hashCode() {
        qy9 qy9Var = this.a;
        int iHashCode = (qy9Var == null ? 0 : qy9Var.hashCode()) * 31;
        rui ruiVar = this.b;
        return iHashCode + (ruiVar != null ? ruiVar.hashCode() : 0);
    }

    public final String toString() {
        return "VideoPageState(mediaItem=" + this.a + ", videoContent=" + this.b + ")";
    }

    public o53(qy9 qy9Var, rui ruiVar) {
        this.a = qy9Var;
        this.b = ruiVar;
    }
}
