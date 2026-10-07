package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cz8 implements dz8 {
    public final String a;
    public final dwb b;
    public final tj0 c;
    public final qcd d;
    public final ifh e;

    public cz8(String str, dwb dwbVar, tj0 tj0Var, pue pueVar) {
        this.a = str;
        this.b = dwbVar;
        this.c = tj0Var;
        this.d = pueVar;
        this.e = new ifh(new ww8(1, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz8)) {
            return false;
        }
        cz8 cz8Var = (cz8) obj;
        return cqk.d(this.a, cz8Var.a) && cqk.d(this.b, cz8Var.b) && cqk.d(this.c, cz8Var.c) && cqk.d(this.d, cz8Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        qcd qcdVar = this.d;
        return iHashCode + (qcdVar == null ? 0 : qcdVar.hashCode());
    }

    public final String toString() {
        return "Media(iconUrl=" + this.a + ", shape=" + this.b + ", placeholder=" + this.c + ", postprocessor=" + this.d + ")";
    }

    public /* synthetic */ cz8(tj0 tj0Var, String str) {
        this(str, cwb.a, tj0Var, null);
    }
}
