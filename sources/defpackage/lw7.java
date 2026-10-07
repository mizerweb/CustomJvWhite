package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lw7 implements qw7 {
    public final long a;
    public final long b;
    public final boolean c;
    public final List d;
    public final String e;
    public final List f;
    public final long g;

    public lw7(long j, long j2, boolean z, List list, String str, List list2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = list;
        this.e = str;
        this.f = list2;
        this.g = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw7)) {
            return false;
        }
        lw7 lw7Var = (lw7) obj;
        return this.a == lw7Var.a && this.b == lw7Var.b && this.c == lw7Var.c && this.d.equals(lw7Var.d) && this.e.equals(lw7Var.e) && cqk.d(this.f, lw7Var.f) && this.g == lw7Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + qv1.c(zo5.d(qv1.c(nbh.n(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "Group(chatServerId=", ", chatLocalId=");
        sbS.append(this.b);
        sbS.append(", isGroupCallAvailable=");
        sbS.append(this.c);
        sbS.append(", messagesIds=");
        sbS.append(this.d);
        sbS.append(", link=");
        sbS.append(this.e);
        sbS.append(", serverMessagesIds=");
        sbS.append(this.f);
        sbS.append(", time=");
        return c0a.m(this.g, ")", sbS);
    }
}
