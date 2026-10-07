package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yn4 implements zn4 {
    public final tnh a;
    public final vnh b;
    public final List c;

    public yn4(tnh tnhVar, vnh vnhVar, List list) {
        this.a = tnhVar;
        this.b = vnhVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn4)) {
            return false;
        }
        yn4 yn4Var = (yn4) obj;
        return this.a.equals(yn4Var.a) && this.b.equals(yn4Var.b) && this.c.equals(yn4Var.c);
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
