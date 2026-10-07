package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ita {
    public final long a;
    public final t3f b;
    public final long c;
    public final long d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final q24 i;
    public final boolean j;

    public ita(long j, t3f t3fVar, long j2, long j3, List list, boolean z, boolean z2, String str, q24 q24Var, boolean z3) {
        this.a = j;
        this.b = t3fVar;
        this.c = j2;
        this.d = j3;
        this.e = list;
        this.f = z;
        this.g = z2;
        this.h = str;
        this.i = q24Var;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ita)) {
            return false;
        }
        ita itaVar = (ita) obj;
        return this.a == itaVar.a && cqk.d(this.b, itaVar.b) && this.c == itaVar.c && this.d == itaVar.d && this.e.equals(itaVar.e) && this.f == itaVar.f && this.g == itaVar.g && cqk.d(this.h, itaVar.h) && cqk.d(this.i, itaVar.i) && this.j == itaVar.j;
    }

    public final int hashCode() {
        int iN = nbh.n(nbh.n(qv1.c(qt4.g(qt4.g((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int iHashCode = (iN + (str == null ? 0 : str.hashCode())) * 31;
        q24 q24Var = this.i;
        return Boolean.hashCode(this.j) + ((iHashCode + (q24Var != null ? q24Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesListWidgetArgs(chatId=");
        sb.append(this.a);
        sb.append(", parentScope=");
        sb.append(this.b);
        qt4.z(this.c, ", loadMark=", ", loadMessageId=", sb);
        sb.append(this.d);
        sb.append(", highlights=");
        sb.append(this.e);
        qv1.v(", shouldHighlightMessage=", ", shouldSkipUnreadDecoration=", sb, this.f, this.g);
        sb.append(", pushLink=");
        sb.append(this.h);
        sb.append(", commentsId=");
        sb.append(this.i);
        return nbh.z(sb, ", isChatPreview=", this.j, ")");
    }
}
