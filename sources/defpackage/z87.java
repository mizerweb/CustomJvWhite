package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class z87 implements a97 {
    public final tnh a;
    public final ynh b;
    public final List c;

    public z87(tnh tnhVar, ynh ynhVar, List list) {
        this.a = tnhVar;
        this.b = ynhVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z87)) {
            return false;
        }
        z87 z87Var = (z87) obj;
        return this.a.equals(z87Var.a) && this.b.equals(z87Var.b) && this.c.equals(z87Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + bc1.h(Integer.hashCode(this.a.c) * 31, 31, this.b);
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
