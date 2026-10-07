package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class iga implements tga {
    public final Collection a;
    public final boolean b;
    public final boolean c;

    public iga(Collection collection, boolean z, boolean z2) {
        this.a = collection;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iga)) {
            return false;
        }
        iga igaVar = (iga) obj;
        return cqk.d(this.a, igaVar.a) && this.b == igaVar.b && this.c == igaVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nbh.n(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Add(messageIds=");
        sb.append(this.a);
        sb.append(", isSelf=");
        sb.append(this.b);
        sb.append(", isIncoming=");
        return qt4.r(sb, this.c, ")");
    }
}
