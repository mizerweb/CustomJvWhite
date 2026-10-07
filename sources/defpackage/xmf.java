package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xmf {
    public final cnf a;
    public final String b;
    public final boolean c;
    public final int d;
    public final List e;
    public final yt1 f;
    public final Long g;

    public xmf(int i, yt1 yt1Var, cnf cnfVar, Long l, String str, List list, boolean z) {
        cnfVar.getClass();
        str.getClass();
        this.a = cnfVar;
        this.b = str;
        this.c = z;
        this.d = i;
        this.e = list;
        this.f = yt1Var;
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmf)) {
            return false;
        }
        xmf xmfVar = (xmf) obj;
        return cqk.d(this.a, xmfVar.a) && cqk.d(this.b, xmfVar.b) && this.c == xmfVar.c && this.d == xmfVar.d && this.e.equals(xmfVar.e) && cqk.d(this.f, xmfVar.f) && cqk.d(this.g, xmfVar.g);
    }

    public final int hashCode() {
        int iC = qv1.c(spc.a(this.d, pwe.b(zo5.d(Integer.hashCode(this.a.a) * 31, 31, this.b), this.c)), 31, this.e);
        yt1 yt1Var = this.f;
        int iHashCode = (iC + (yt1Var == null ? 0 : yt1Var.hashCode())) * 31;
        Long l = this.g;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionRoom(id=" + this.a + ", name=" + this.b + ", isActive=" + this.c + ", participantCount=" + this.d + ", participantIds=" + this.e + ", pinnedParticipantId=" + this.f + ", timeoutMs=" + this.g + ")";
    }
}
