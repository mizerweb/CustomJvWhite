package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hv {
    public static final hv d;
    public final List a;
    public final List b;
    public final Drawable c;

    static {
        r66 r66Var = r66.a;
        d = new hv(r66Var, r66Var, null);
    }

    public hv(List list, List list2, Drawable drawable) {
        this.a = list;
        this.b = list2;
        this.c = drawable;
    }

    public static hv a(hv hvVar, List list, Drawable drawable) {
        List list2 = hvVar.b;
        hvVar.getClass();
        return new hv(list, list2, drawable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv)) {
            return false;
        }
        hv hvVar = (hv) obj;
        return cqk.d(this.a, hvVar.a) && cqk.d(this.b, hvVar.b) && cqk.d(this.c, hvVar.c);
    }

    public final int hashCode() {
        int iC = qv1.c(this.a.hashCode() * 31, 31, this.b);
        Drawable drawable = this.c;
        return iC + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "State(themes=" + this.a + ", modes=" + this.b + ", currentThemeDrawable=" + this.c + ")";
    }
}
