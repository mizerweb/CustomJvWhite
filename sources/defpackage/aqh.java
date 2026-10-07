package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class aqh implements k79 {
    public final boolean a;
    public final String b;
    public final nbc c;
    public final Drawable d;

    public aqh(boolean z, String str, nbc nbcVar, Drawable drawable) {
        this.a = z;
        this.b = str;
        this.c = nbcVar;
        this.d = drawable;
    }

    public static aqh i(aqh aqhVar, boolean z, oph ophVar, int i) {
        if ((i & 1) != 0) {
            z = aqhVar.a;
        }
        String str = aqhVar.b;
        nbc nbcVar = aqhVar.c;
        Drawable drawable = ophVar;
        if ((i & 8) != 0) {
            drawable = aqhVar.d;
        }
        return new aqh(z, str, nbcVar, drawable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqh)) {
            return false;
        }
        aqh aqhVar = (aqh) obj;
        return this.a == aqhVar.a && this.b.equals(aqhVar.b) && this.c == aqhVar.c && cqk.d(this.d, aqhVar.d);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.b.hashCode();
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return getItemId() == k79Var.getItemId();
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + zo5.d(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31;
        Drawable drawable = this.d;
        return iHashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 0;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        boolean z;
        aqh aqhVar = k79Var instanceof aqh ? (aqh) k79Var : null;
        if (aqhVar == null || this.a == (z = aqhVar.a)) {
            return null;
        }
        return new yph(z);
    }

    public final String o() {
        int i = zph.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i == 1) {
            return "space";
        }
        if (i == 2) {
            return "nature";
        }
        if (i == 3) {
            return "neon";
        }
        if (i != 4) {
            return i != 5 ? "unknown" : "Moscow";
        }
        return "simple";
    }

    public final String toString() {
        return "ThemeItem(isSelected=" + this.a + ", themeName=" + this.b + ", theme=" + this.c + ", backgroundDrawable=" + this.d + ")";
    }
}
