package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qh8 extends mk0 {
    public final String b;
    public final String c;
    public final int d;
    public final long e;
    public final String f;

    public qh8(String str, String str2, int i, long j, String str3) {
        super(8);
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = j;
        this.f = str3;
    }

    public final int a() {
        return this.d;
    }

    public final long b() {
        return this.e;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh8)) {
            return false;
        }
        qh8 qh8Var = (qh8) obj;
        return this.b.equals(qh8Var.b) && cqk.d(this.c, qh8Var.c) && this.d == qh8Var.d && this.e == qh8Var.e && cqk.d(this.f, qh8Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + qt4.g(zo5.c(this.d, zo5.d(this.b.hashCode() * 31, 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("PhoneConfirmScreen(verifyToken=", this.b, ", phone=", this.c, ", codeLength=");
        c0a.v(sbQ, this.d, ", codeResendMillis=", this.e);
        return qt4.q(sbQ, ", countryNameCode=", this.f, ")");
    }
}
