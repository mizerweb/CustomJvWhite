package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ydj implements cej {
    public final String a;
    public final String b;
    public final cx0 c;

    public ydj(cx0 cx0Var, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = cx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydj)) {
            return false;
        }
        ydj ydjVar = (ydj) obj;
        return cqk.d(this.a, ydjVar.a) && cqk.d(this.b, ydjVar.b) && cqk.d(this.c, ydjVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        cx0 cx0Var = this.c;
        return iHashCode2 + (cx0Var != null ? cx0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("AuthBiometry(title=", this.a, ", reason=", this.b, ", cryptoObject=");
        sbQ.append(this.c);
        sbQ.append(")");
        return sbQ.toString();
    }
}
