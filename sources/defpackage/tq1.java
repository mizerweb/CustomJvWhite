package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tq1 implements uq1 {
    public final long a;
    public final String b;
    public final boolean c;
    public final String d;

    public tq1(long j, String str, String str2, boolean z) {
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq1)) {
            return false;
        }
        tq1 tq1Var = (tq1) obj;
        return this.a == tq1Var.a && this.b.equals(tq1Var.b) && this.c == tq1Var.c && this.d.equals(tq1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nbh.n(zo5.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "Exist(serverChatId=", ", link=", this.b);
        sbT.append(", isLinkCall=");
        sbT.append(this.c);
        sbT.append(", title=");
        sbT.append((Object) this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
