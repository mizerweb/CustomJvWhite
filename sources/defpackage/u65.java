package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class u65 {
    public final String a;
    public final m65 b;
    public final Bundle c;
    public final int d;
    public final f2 e;
    public final boolean f;
    public final t65 g;

    public u65(String str, m65 m65Var, Bundle bundle, int i, f2 f2Var, boolean z, t65 t65Var, int i2) {
        i = (i2 & 8) != 0 ? 1 : i;
        f2Var = (i2 & 16) != 0 ? r65.c : f2Var;
        z = (i2 & 32) != 0 ? false : z;
        this.a = str;
        this.b = m65Var;
        this.c = bundle;
        this.d = i;
        this.e = f2Var;
        this.f = z;
        this.g = t65Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u65)) {
            return false;
        }
        u65 u65Var = (u65) obj;
        return cqk.d(this.a, u65Var.a) && cqk.d(this.b, u65Var.b) && cqk.d(this.c, u65Var.c) && this.d == u65Var.d && cqk.d(this.e, u65Var.e) && this.f == u65Var.f && cqk.d(this.g, u65Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + nbh.n((this.e.hashCode() + c0a.f(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31)) * 31, 31, this.f);
    }

    public final String toString() {
        return "DeepLinkScreen(name=" + this.a + ", route=" + this.b + ", deepLinkBundle=" + ("DeepLinkBundle(bundle=" + this.c + ")") + ", mode=" + x05.p(this.d) + ", animations=" + this.e + ", isInBottomBar=" + this.f + ", screenFactory=" + this.g + ")";
    }
}
