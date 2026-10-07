package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lbe implements pbe {
    public final t2 a;
    public final g4b b;
    public final boolean c;

    public lbe(t2 t2Var, g4b g4bVar, boolean z) {
        this.a = t2Var;
        this.b = g4bVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbe)) {
            return false;
        }
        lbe lbeVar = (lbe) obj;
        return this.a.equals(lbeVar.a) && this.b.equals(lbeVar.b) && this.c == lbeVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMediaMessageSend(media=");
        sb.append(this.a);
        sb.append(", sliceData=");
        sb.append(this.b);
        sb.append(", sendDelayed=");
        return qt4.r(sb, this.c, ")");
    }
}
