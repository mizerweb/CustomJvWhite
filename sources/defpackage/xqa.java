package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class xqa extends luk {
    public final q24 a;
    public final List b;
    public final long c;
    public final boolean d;
    public final long e;

    public xqa(q24 q24Var, List list, long j, boolean z, long j2) {
        this.a = q24Var;
        this.b = list;
        this.c = j;
        this.d = z;
        this.e = j2;
    }

    @Override // defpackage.luk
    public final long a() {
        return this.c;
    }

    @Override // defpackage.luk
    public final List b() {
        return this.b;
    }

    @Override // defpackage.luk
    public final q24 c() {
        return this.a;
    }

    @Override // defpackage.luk
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqa)) {
            return false;
        }
        xqa xqaVar = (xqa) obj;
        return cqk.d(this.a, xqaVar.a) && cqk.d(this.b, xqaVar.b) && this.c == xqaVar.c && this.d == xqaVar.d && this.e == xqaVar.e;
    }

    @Override // defpackage.luk
    public final long f() {
        return this.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + nbh.n(qt4.g(qv1.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Delete(commentsId=");
        sb.append(this.a);
        sb.append(", commentIds=");
        sb.append(this.b);
        sb.append(", authorUserId=");
        sb.append(this.c);
        sb.append(", deleteAllUserComments=");
        sb.append(this.d);
        return zo5.k(this.e, ", triggerCommentServerId=", ")", sb);
    }
}
