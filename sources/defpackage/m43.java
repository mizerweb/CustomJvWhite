package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m43 {
    public static final m43 d = new m43(r66.a, false, false);
    public final List a;
    public final boolean b;
    public final boolean c;

    public m43(List list, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m43)) {
            return false;
        }
        m43 m43Var = (m43) obj;
        return this.a.equals(m43Var.a) && this.b == m43Var.b && this.c == m43Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nbh.n(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachesViewState(messages=");
        sb.append(this.a);
        sb.append(", hasMoreNext=");
        sb.append(this.b);
        sb.append(", hasMorePrev=");
        return qt4.r(sb, this.c, ")");
    }
}
