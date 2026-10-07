package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class v87 implements a97 {
    public final Long a;
    public final Long b;
    public final Set c;
    public final Long d;
    public final boolean e;
    public final n87 f;

    public v87(Long l, Long l2, Set set, Long l3, boolean z, n87 n87Var, int i) {
        l2 = (i & 2) != 0 ? null : l2;
        set = (i & 4) != 0 ? null : set;
        l3 = (i & 8) != 0 ? null : l3;
        z = (i & 16) != 0 ? false : z;
        n87Var = (i & 32) != 0 ? null : n87Var;
        this.a = l;
        this.b = l2;
        this.c = set;
        this.d = l3;
        this.e = z;
        this.f = n87Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v87)) {
            return false;
        }
        v87 v87Var = (v87) obj;
        return cqk.d(this.a, v87Var.a) && cqk.d(this.b, v87Var.b) && cqk.d(this.c, v87Var.c) && cqk.d(this.d, v87Var.d) && this.e == v87Var.e && cqk.d(this.f, v87Var.f);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Set set = this.c;
        int iHashCode3 = (iHashCode2 + (set == null ? 0 : set.hashCode())) * 31;
        Long l3 = this.d;
        int iN = nbh.n((iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.e);
        n87 n87Var = this.f;
        return iN + (n87Var != null ? n87Var.hashCode() : 0);
    }

    public final String toString() {
        return "ClosePicker(destinationId=" + this.a + ", fwdChtId=" + this.b + ", fwdMsgIds=" + this.c + ", fwdAttachId=" + this.d + ", isForwardAttach=" + this.e + ", inAppReviewData=" + this.f + ")";
    }
}
