package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e23 {
    public final long a;
    public final long b;
    public final String c;
    public final dq5 d;
    public final boolean e;

    public e23(long j, long j2, String str, dq5 dq5Var, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = dq5Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e23)) {
            return false;
        }
        e23 e23Var = (e23) obj;
        return this.a == e23Var.a && this.b == e23Var.b && cqk.d(this.c, e23Var.c) && this.d == e23Var.d && this.e == e23Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + zo5.d(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "DownloadData(msgId=", ", attachId=");
        qv1.s(this.b, ", localAttachId=", this.c, sbS);
        sbS.append(", cause=");
        sbS.append(this.d);
        sbS.append(", completed=");
        sbS.append(this.e);
        sbS.append(")");
        return sbS.toString();
    }
}
