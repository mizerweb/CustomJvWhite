package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q23 implements s23 {
    public final long a;
    public final String b;

    public q23(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q23)) {
            return false;
        }
        q23 q23Var = (q23) obj;
        return this.a == q23Var.a && this.b.equals(q23Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "DownloadComplete(messageId=", ", attachLocalId=", this.b);
        sbT.append(")");
        return sbT.toString();
    }
}
