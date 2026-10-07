package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vy3 implements bz3 {
    public final q24 a;
    public final List b;
    public final boolean c;
    public final boolean d;

    public vy3(q24 q24Var, List list, boolean z, boolean z2) {
        this.a = q24Var;
        this.b = list;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.bz3
    public final q24 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy3)) {
            return false;
        }
        vy3 vy3Var = (vy3) obj;
        return cqk.d(this.a, vy3Var.a) && cqk.d(this.b, vy3Var.b) && this.c == vy3Var.c && this.d == vy3Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + nbh.n(qv1.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddCommentEvent(commentsId=");
        sb.append(this.a);
        sb.append(", ids=");
        sb.append(this.b);
        sb.append(", isSelf=");
        return bc1.m(", isIncoming=", ")", sb, this.c, this.d);
    }
}
