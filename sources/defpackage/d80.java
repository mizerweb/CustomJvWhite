package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d80 {
    public final String a;
    public final String b;
    public final String c;

    public d80(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d80)) {
            return false;
        }
        d80 d80Var = (d80) obj;
        return this.a.equals(d80Var.a) && this.b.equals(d80Var.b) && cqk.d(this.c, d80Var.c);
    }

    public final int hashCode() {
        int iD = zo5.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return (iD + (str == null ? 0 : str.hashCode())) * 31;
    }

    public final String toString() {
        return zo5.w(qv1.q("AudioErrorEvent(domain=", this.a, ", subDomain=", this.b, ", reason="), this.c, ", code=null)");
    }
}
