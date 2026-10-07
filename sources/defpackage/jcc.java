package defpackage;

import android.graphics.drawable.Drawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class jcc implements lcc {
    public final int a;
    public final Drawable b;
    public final int c;
    public final int d;
    public final ynh e;
    public final String f;
    public final float g;
    public final cf7 h;

    public jcc(int i, Drawable drawable, tnh tnhVar, String str, float f, cf7 cf7Var, int i2) {
        drawable = (i2 & 2) != 0 ? null : drawable;
        int i3 = (i2 & 4) != 0 ? 4 : 0;
        int i4 = (i2 & 16) != 0 ? R.attr.icon_primary_inverse_static : R.attr.icon_primary;
        ynh ynhVar = (i2 & 32) != 0 ? ynh.b : tnhVar;
        str = (i2 & 64) != 0 ? null : str;
        f = (i2 & np0.m) != 0 ? 0.0f : f;
        this.a = i;
        this.b = drawable;
        this.c = i3;
        this.d = i4;
        this.e = ynhVar;
        this.f = str;
        this.g = f;
        this.h = cf7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcc)) {
            return false;
        }
        jcc jccVar = (jcc) obj;
        return this.a == jccVar.a && this.c == jccVar.c && this.d == jccVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + nbh.m(zo5.c(this.c, Integer.hashCode(this.a) * 31, 31), 12.0f, 31);
    }
}
