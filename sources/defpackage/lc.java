package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lc implements nc {
    public final q24 a;
    public final long b;
    public final List c;
    public final boolean d;

    public lc(q24 q24Var, long j, List list, boolean z) {
        this.a = q24Var;
        this.b = j;
        this.c = list;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc)) {
            return false;
        }
        lc lcVar = (lc) obj;
        return cqk.d(this.a, lcVar.a) && this.b == lcVar.b && this.c.equals(lcVar.c) && this.d == lcVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qv1.c(qt4.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "ResolveCommentsToDelete(commentsId=" + this.a + ", authorUserId=" + this.b + ", selectedCommentIds=" + this.c + ", deleteAllUserComments=" + this.d + ")";
    }
}
