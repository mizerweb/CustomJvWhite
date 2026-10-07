package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n62 implements q62 {
    public final vnh a;
    public final xnh b;
    public final int c;
    public final List d;
    public final long e;

    public n62(vnh vnhVar, xnh xnhVar, int i, c79 c79Var, long j) {
        this.a = vnhVar;
        this.b = xnhVar;
        this.c = i;
        this.d = c79Var;
        this.e = j;
    }

    @Override // defpackage.q62
    public final long a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n62)) {
            return false;
        }
        n62 n62Var = (n62) obj;
        return this.a.equals(n62Var.a) && this.b.equals(n62Var.b) && this.c == n62Var.c && cqk.d(this.d, n62Var.d) && this.e == n62Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + qv1.c(c0a.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Multi(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", titleEllipsizeMode=");
        sb.append(bc1.v(this.c));
        sb.append(", avatarInfo=");
        sb.append(this.d);
        sb.append(", lastUpdate=");
        return c0a.m(this.e, ")", sb);
    }
}
