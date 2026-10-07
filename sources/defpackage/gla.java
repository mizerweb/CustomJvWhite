package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class gla {
    public final Set a;
    public final Long b;
    public final boolean c;

    public gla(Set set, Long l, boolean z) {
        this.a = set;
        this.b = l;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gla)) {
            return false;
        }
        gla glaVar = (gla) obj;
        return cqk.d(this.a, glaVar.a) && cqk.d(this.b, glaVar.b) && this.c == glaVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForwardIds(messageIds=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", isForwardAttach=");
        return qt4.r(sb, this.c, ")");
    }
}
