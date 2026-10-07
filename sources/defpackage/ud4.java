package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ud4 {
    public final String a;
    public final String b;
    public final boolean c;
    public final ifh d = new ifh(new d2(12, this));

    public ud4(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud4)) {
            return false;
        }
        ud4 ud4Var = (ud4) obj;
        return cqk.d(this.a, ud4Var.a) && cqk.d(this.b, ud4Var.b) && this.c == ud4Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + zo5.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return qt4.r(qv1.q("ConnectionHost{host=", this.a, "|port=", this.b, "|tls="), this.c, "}");
    }
}
