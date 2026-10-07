package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rv5 {
    public final String a;
    public final String b;
    public final int c;

    public rv5(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv5)) {
            return false;
        }
        rv5 rv5Var = (rv5) obj;
        return this.a.equals(rv5Var.a) && this.b.equals(rv5Var.b) && this.c == rv5Var.c;
    }

    public final int hashCode() {
        return zo5.d(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        return zo5.t(qv1.q("DropRecord(event='", this.a, "', reason='", this.b, "', count="), this.c, ")");
    }
}
