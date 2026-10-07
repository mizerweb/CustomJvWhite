package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h1c {
    public final long a;
    public final wx8 b;
    public final Long c;
    public final Long d;

    public h1c(long j, wx8 wx8Var, Long l, Long l2) {
        this.a = j;
        this.b = wx8Var;
        this.c = l;
        this.d = l2;
    }

    public final long a() {
        return this.a;
    }

    public final String b() {
        wx8 wx8Var = this.b;
        if (wx8Var != null) {
            return wx8Var.a;
        }
        return null;
    }

    public final boolean c() {
        return iel.c(this.b) && this.d == null && this.c == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1c)) {
            return false;
        }
        h1c h1cVar = (h1c) obj;
        wx8 wx8Var = h1cVar.b;
        if (this.a != h1cVar.a) {
            return false;
        }
        wx8 wx8Var2 = this.b;
        return ((iel.c(wx8Var2) && iel.c(wx8Var)) || cqk.d(wx8Var2, wx8Var)) && cqk.d(this.c, h1cVar.c) && cqk.d(this.d, h1cVar.d);
    }

    public final int hashCode() {
        wx8 wx8Var = this.b;
        int iG = qt4.g((wx8Var != null ? wx8Var.hashCode() : 0) * 31, 31, this.a);
        Long l = this.c;
        int iHashCode = (iG + (l != null ? Long.hashCode(l.longValue()) : 0)) * 31;
        Long l2 = this.d;
        return iHashCode + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
    }

    public final String toString() {
        return "OneMeDraft(cid=" + this.a + ", lastInputText=" + this.b + ", replyMessageId=" + this.c + ", editMessageId=" + this.d + ", attaches=null)";
    }
}
