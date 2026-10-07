package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ic implements nc {
    public final q24 a;
    public final long b;
    public final long c;

    public ic(q24 q24Var, long j, long j2) {
        this.a = q24Var;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic)) {
            return false;
        }
        ic icVar = (ic) obj;
        return cqk.d(this.a, icVar.a) && this.b == icVar.b && this.c == icVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qt4.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteAllUserComments(commentsId=");
        sb.append(this.a);
        sb.append(", authorUserId=");
        sb.append(this.b);
        return zo5.k(this.c, ", triggerCommentServerId=", ")", sb);
    }
}
