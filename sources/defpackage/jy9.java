package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jy9 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Uri a;
    public final String b;
    public final gy9 c;
    public final zx9 d;
    public final List e;
    public final String f;
    public final c98 g;
    public final long h;

    static {
        String str = vqi.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public jy9(Uri uri, String str, gy9 gy9Var, zx9 zx9Var, List list, String str2, c98 c98Var, long j2) {
        this.a = uri;
        this.b = uya.n(str);
        this.c = gy9Var;
        this.d = zx9Var;
        this.e = list;
        this.f = str2;
        this.g = c98Var;
        z88 z88VarL = c98.l();
        for (int i2 = 0; i2 < c98Var.size(); i2++) {
            z88VarL.c(ny9.a(((oy9) c98Var.get(i2)).a()));
        }
        z88VarL.h();
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy9)) {
            return false;
        }
        jy9 jy9Var = (jy9) obj;
        if (!this.a.equals(jy9Var.a) || !Objects.equals(this.b, jy9Var.b) || !Objects.equals(this.c, jy9Var.c) || !Objects.equals(this.d, jy9Var.d) || !this.e.equals(jy9Var.e) || !Objects.equals(this.f, jy9Var.f)) {
            return false;
        }
        c98 c98Var = jy9Var.g;
        c98 c98Var2 = this.g;
        c98Var2.getClass();
        return j8f.a(c98Var2, c98Var) && this.h == jy9Var.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        gy9 gy9Var = this.c;
        int iHashCode3 = (iHashCode2 + (gy9Var == null ? 0 : gy9Var.hashCode())) * 31;
        zx9 zx9Var = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (zx9Var == null ? 0 : zx9Var.hashCode())) * 31)) * 31;
        String str2 = this.f;
        return (int) ((((long) ((this.g.hashCode() + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31) + this.h);
    }
}
