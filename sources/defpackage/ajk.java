package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajk {
    public final int a;
    public final bq9 b;
    public final boolean c;

    public ajk(int i, bq9 bq9Var, boolean z) {
        if (i == 0) {
            throw null;
        }
        bq9Var.getClass();
        this.a = i;
        this.b = bq9Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajk)) {
            return false;
        }
        ajk ajkVar = (ajk) obj;
        return this.a == ajkVar.a && cqk.d(this.b, ajkVar.b) && this.c == ajkVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (qt4.D(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkParameters(condition=");
        sb.append(mw7.n(this.a));
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", preferHardwareVPX=");
        return qt4.r(sb, this.c, ")");
    }
}
