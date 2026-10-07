package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nw7 implements qw7 {
    public final String a;
    public final long b;
    public final Long c;
    public final CharSequence d;
    public final List e;
    public final List f;
    public final long g;

    public nw7(String str, long j, Long l, String str2, List list, List list2, long j2) {
        this.a = str;
        this.b = j;
        this.c = l;
        this.d = str2;
        this.e = list;
        this.f = list2;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw7)) {
            return false;
        }
        nw7 nw7Var = (nw7) obj;
        return this.a.equals(nw7Var.a) && this.b == nw7Var.b && cqk.d(this.c, nw7Var.c) && cqk.d(this.d, nw7Var.d) && this.e.equals(nw7Var.e) && cqk.d(this.f, nw7Var.f) && this.g == nw7Var.g;
    }

    public final int hashCode() {
        int iG = qt4.g(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        return Long.hashCode(this.g) + qv1.c(qv1.c(mw7.f((iG + (l == null ? 0 : l.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.b, "Link(link=", this.a, ", chatLocalId=");
        sbB.append(", chatServerId=");
        sbB.append(this.c);
        sbB.append(", chatName=");
        sbB.append((Object) this.d);
        sbB.append(", messagesIds=");
        sbB.append(this.e);
        sbB.append(", serverMessagesIds=");
        sbB.append(this.f);
        return zo5.k(this.g, ", time=", ")", sbB);
    }
}
