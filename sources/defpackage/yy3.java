package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yy3 implements bz3 {
    public final q24 a;
    public final long b;
    public final long c;

    public yy3(q24 q24Var, long j, long j2) {
        this.a = q24Var;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.bz3
    public final q24 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy3)) {
            return false;
        }
        yy3 yy3Var = (yy3) obj;
        return cqk.d(this.a, yy3Var.a) && this.b == yy3Var.b && this.c == yy3Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qt4.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteCommentRangeEvent(commentsId=");
        sb.append(this.a);
        sb.append(", startTime=");
        sb.append(this.b);
        return zo5.k(this.c, ", endTime=", ")", sb);
    }
}
