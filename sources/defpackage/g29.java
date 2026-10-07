package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g29 extends i29 {
    public final long a;
    public final String b;

    public g29(long j, String str) {
        this.a = j;
        this.b = str;
    }

    @Override // defpackage.i29
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g29)) {
            return false;
        }
        g29 g29Var = (g29) obj;
        return this.a == g29Var.a && cqk.d(this.b, g29Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "ErrorLinkInfo(requestId=", ", error=", this.b);
        sbT.append(")");
        return sbT.toString();
    }
}
