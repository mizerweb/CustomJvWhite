package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class gf8 implements if8 {
    public final String a;
    public final ynh b;
    public final ynh c;
    public final Drawable d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final ynh h;
    public final fe8 i;
    public final int j;

    public gf8(String str, ynh ynhVar, ynh ynhVar2, Drawable drawable, boolean z, boolean z2, boolean z3, ynh ynhVar3, fe8 fe8Var, int i) {
        this.a = str;
        this.b = ynhVar;
        this.c = ynhVar2;
        this.d = drawable;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = ynhVar3;
        this.i = fe8Var;
        this.j = i;
    }

    public static gf8 a(gf8 gf8Var, ynh ynhVar, ynh ynhVar2, Drawable drawable, ynh ynhVar3, int i, int i2) {
        String str = gf8Var.a;
        if ((i2 & 2) != 0) {
            ynhVar = gf8Var.b;
        }
        ynh ynhVar4 = ynhVar;
        if ((i2 & 4) != 0) {
            ynhVar2 = gf8Var.c;
        }
        ynh ynhVar5 = ynhVar2;
        if ((i2 & 8) != 0) {
            drawable = gf8Var.d;
        }
        return new gf8(str, ynhVar4, ynhVar5, drawable, gf8Var.e, gf8Var.f, gf8Var.g, (i2 & np0.m) != 0 ? gf8Var.h : ynhVar3, gf8Var.i, (i2 & np0.o) != 0 ? gf8Var.j : i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf8)) {
            return false;
        }
        gf8 gf8Var = (gf8) obj;
        return cqk.d(this.a, gf8Var.a) && this.b.equals(gf8Var.b) && this.c.equals(gf8Var.c) && cqk.d(this.d, gf8Var.d) && this.e == gf8Var.e && this.f == gf8Var.f && this.g == gf8Var.g && this.h.equals(gf8Var.h) && cqk.d(this.i, gf8Var.i) && this.j == gf8Var.j;
    }

    public final int hashCode() {
        int iH = bc1.h(bc1.h(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Drawable drawable = this.d;
        int iHashCode = (this.i.hashCode() + bc1.h(nbh.n(nbh.n(nbh.n((iH + (drawable == null ? 0 : drawable.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31;
        int i = this.j;
        return iHashCode + (i != 0 ? qt4.D(i) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", drawable=");
        sb.append(this.d);
        sb.append(", useTextShimmer=");
        qt4.B(", hideCloseButton=", ", hideOnClick=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", buttonText=");
        sb.append(this.h);
        sb.append(", type=");
        sb.append(this.i);
        sb.append(", selfUpdateState=");
        sb.append(mw7.r(this.j));
        sb.append(")");
        return sb.toString();
    }
}
