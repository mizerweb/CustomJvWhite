package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a12 {
    public final cnf a;
    public final String b;
    public final boolean c;
    public final List d;
    public final int e;
    public final yt1 f;
    public final Long g;

    public a12(int i, yt1 yt1Var, cnf cnfVar, Long l, String str, List list, boolean z) {
        cnfVar.getClass();
        str.getClass();
        this.a = cnfVar;
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = i;
        this.f = yt1Var;
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a12)) {
            return false;
        }
        a12 a12Var = (a12) obj;
        return cqk.d(this.a, a12Var.a) && cqk.d(this.b, a12Var.b) && this.c == a12Var.c && this.d.equals(a12Var.d) && this.e == a12Var.e && cqk.d(this.f, a12Var.f) && cqk.d(this.g, a12Var.g);
    }

    public final int hashCode() {
        int iA = spc.a(this.e, qv1.c(pwe.b(zo5.d(Integer.hashCode(this.a.a) * 31, 31, this.b), this.c), 31, this.d));
        yt1 yt1Var = this.f;
        int iHashCode = (iA + (yt1Var == null ? 0 : yt1Var.hashCode())) * 31;
        Long l = this.g;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "CallSessionRoom(id=" + this.a + ", name=" + this.b + ", isActive=" + this.c + ", participantIds=" + this.d + ", participantCount=" + this.e + ", pinnedParticipantId=" + this.f + ", timeoutMs=" + this.g + ")";
    }
}
