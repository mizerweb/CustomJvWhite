package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yqa extends luk {
    public final q24 a;
    public final List b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;

    public yqa(q24 q24Var, List list, long j, boolean z, long j2, long j3, long j4) {
        this.a = q24Var;
        this.b = list;
        this.c = j;
        this.d = z;
        this.e = j2;
        this.f = j3;
        this.g = j4;
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
        if (!(obj instanceof yqa)) {
            return false;
        }
        yqa yqaVar = (yqa) obj;
        return cqk.d(this.a, yqaVar.a) && cqk.d(this.b, yqaVar.b) && this.c == yqaVar.c && this.d == yqaVar.d && this.e == yqaVar.e && this.f == yqaVar.f && this.g == yqaVar.g;
    }

    @Override // defpackage.luk
    public final long f() {
        return this.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + qt4.g(qt4.g(nbh.n(qt4.g(qv1.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteAndBlockUser(commentsId=");
        sb.append(this.a);
        sb.append(", commentIds=");
        sb.append(this.b);
        sb.append(", authorUserId=");
        sb.append(this.c);
        sb.append(", deleteAllUserComments=");
        sb.append(this.d);
        qt4.z(this.e, ", triggerCommentServerId=", ", channelChatId=", sb);
        sb.append(this.f);
        return zo5.k(this.g, ", channelChatServerId=", ")", sb);
    }
}
