package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ube implements wbe {
    public final tnh a;
    public final vnh b;
    public final List c;

    public ube(tnh tnhVar, vnh vnhVar, List list) {
        this.a = tnhVar;
        this.b = vnhVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ube)) {
            return false;
        }
        ube ubeVar = (ube) obj;
        return this.a.equals(ubeVar.a) && this.b.equals(ubeVar.b) && this.c.equals(ubeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a.c) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowSendConfirmation(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", buttons=");
        return qv1.n(")", sb, this.c);
    }
}
