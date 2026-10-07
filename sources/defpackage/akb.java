package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class akb extends kih {
    public final long c;
    public final st2 d;
    public final long e;
    public final gda f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final String j;
    public final int k;
    public final long l;

    public akb(long j, st2 st2Var, long j2, gda gdaVar, boolean z, long j3, boolean z2, String str, int i, long j4) {
        this.c = j;
        this.d = st2Var;
        this.e = j2;
        this.f = gdaVar;
        this.g = z;
        this.h = j3;
        this.i = z2;
        this.j = str;
        this.k = i;
        this.l = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akb)) {
            return false;
        }
        akb akbVar = (akb) obj;
        return this.c == akbVar.c && cqk.d(this.d, akbVar.d) && this.e == akbVar.e && cqk.d(this.f, akbVar.f) && this.g == akbVar.g && this.h == akbVar.h && this.i == akbVar.i && cqk.d(this.j, akbVar.j) && this.k == akbVar.k && this.l == akbVar.l;
    }

    public final st2 h() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.c) * 31;
        st2 st2Var = this.d;
        int iN = nbh.n(qt4.g(nbh.n((this.f.hashCode() + qt4.g((iHashCode + (st2Var == null ? 0 : st2Var.hashCode())) * 31, 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        return Long.hashCode(this.l) + zo5.c(this.k, (iN + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    public final long i() {
        return this.c;
    }

    public final gda k() {
        return this.f;
    }

    @Override // defpackage.sq0
    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(chatId=");
        sb.append(this.c);
        sb.append(", chat=");
        sb.append(this.d);
        qt4.z(this.e, ", postId=", ", message=", sb);
        sb.append(this.f);
        sb.append(", isInvisible=");
        sb.append(this.g);
        sb.append(", prevMessageId=");
        sb.append(this.h);
        sb.append(", ttl=");
        sb.append(this.i);
        sb.append(", url=");
        sb.append(this.j);
        sb.append(", unread=");
        sb.append(this.k);
        return zo5.k(this.l, ", mark=", ")", sb);
    }
}
