package defpackage;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class m65 {
    public final Uri a;
    public final c9b b;
    public final LinkedHashSet c;
    public final boolean d;
    public final Set e;

    public m65(Uri uri, c9b c9bVar, LinkedHashSet linkedHashSet, boolean z, Set set) {
        this.a = uri;
        this.b = c9bVar;
        this.c = linkedHashSet;
        this.d = z;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m65)) {
            return false;
        }
        m65 m65Var = (m65) obj;
        return this.a.equals(m65Var.a) && cqk.d(this.b, m65Var.b) && this.c.equals(m65Var.c) && this.d == m65Var.d && cqk.d(this.e, m65Var.e);
    }

    public final int hashCode() {
        int iN = nbh.n((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        Set set = this.e;
        return iN + (set == null ? 0 : set.hashCode());
    }

    public final String toString() {
        return "DeepLinkRoute(deepLinkUri=" + this.a.toString() + ", constraints=" + this.b + ", requiredParams=" + this.c + ", supportRoot=" + this.d + ", bundleRequiredParams=" + this.e + ")";
    }
}
