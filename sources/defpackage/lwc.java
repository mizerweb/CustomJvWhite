package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lwc implements mwc {
    public final tnh a;
    public final vnh b;
    public final List c;

    public lwc(tnh tnhVar, vnh vnhVar, List list) {
        this.a = tnhVar;
        this.b = vnhVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwc)) {
            return false;
        }
        lwc lwcVar = (lwc) obj;
        return this.a.equals(lwcVar.a) && this.b.equals(lwcVar.b) && this.c.equals(lwcVar.c);
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
