package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class q87 {
    public final Set a;
    public final Long b;
    public final boolean c;
    public final CharSequence d;
    public final boolean e;
    public final ng5 f;

    public q87(Set set, Long l, boolean z, CharSequence charSequence, boolean z2, ng5 ng5Var) {
        this.a = set;
        this.b = l;
        this.c = z;
        this.d = charSequence;
        this.e = z2;
        this.f = ng5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q87)) {
            return false;
        }
        q87 q87Var = (q87) obj;
        return cqk.d(this.a, q87Var.a) && cqk.d(this.b, q87Var.b) && this.c == q87Var.c && cqk.d(this.d, q87Var.d) && this.e == q87Var.e && cqk.d(this.f, q87Var.f);
    }

    public final int hashCode() {
        Set set = this.a;
        int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
        Long l = this.b;
        int iN = nbh.n((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c);
        CharSequence charSequence = this.d;
        int iN2 = nbh.n((iN + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.e);
        ng5 ng5Var = this.f;
        return iN2 + (ng5Var != null ? ng5Var.hashCode() : 0);
    }

    public final String toString() {
        return "ForwardMessagesSendData(messageIds=" + this.a + ", attachId=" + this.b + ", isForwardAttach=" + this.c + ", text=" + ((Object) this.d) + ", shouldHideAuthor=" + this.e + ", delayedAttributes=" + this.f + ")";
    }
}
