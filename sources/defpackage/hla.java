package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class hla {
    public final Set a;
    public final Long b;
    public final boolean c;
    public final jla d;
    public final lla e;

    public hla(Set set, Long l, boolean z, jla jlaVar, lla llaVar) {
        this.a = set;
        this.b = l;
        this.c = z;
        this.d = jlaVar;
        this.e = llaVar;
    }

    public final q87 a() {
        jla jlaVar = this.d;
        return new q87(this.a, this.b, this.c, jlaVar != null ? jlaVar.a : null, this.e.e, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hla)) {
            return false;
        }
        hla hlaVar = (hla) obj;
        return cqk.d(this.a, hlaVar.a) && cqk.d(this.b, hlaVar.b) && this.c == hlaVar.c && cqk.d(this.d, hlaVar.d) && cqk.d(this.e, hlaVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int iN = nbh.n((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c);
        jla jlaVar = this.d;
        return this.e.hashCode() + ((iN + (jlaVar != null ? jlaVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ForwardMessagesData(messageIds=" + this.a + ", fwdAttachId=" + this.b + ", isForwardAttach=" + this.c + ", inputData=" + this.d + ", quoteData=" + this.e + ")";
    }
}
