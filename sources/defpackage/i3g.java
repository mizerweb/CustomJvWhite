package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i3g extends vgd {
    public final tnh a;
    public final vnh b;
    public final List c;

    public i3g(tnh tnhVar, vnh vnhVar, List list) {
        this.a = tnhVar;
        this.b = vnhVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3g)) {
            return false;
        }
        i3g i3gVar = (i3g) obj;
        return this.a.equals(i3gVar.a) && this.b.equals(i3gVar.b) && this.c.equals(i3gVar.c);
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
