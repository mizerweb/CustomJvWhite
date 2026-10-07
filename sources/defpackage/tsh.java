package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class tsh {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object p = new Object();
    public static final Object q = new Object();
    public static final ry9 r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public Object a = p;
    public ry9 b = r;
    public Object c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public iy9 i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public int n;
    public long o;

    static {
        jy9 jy9Var;
        by9 by9Var = new by9();
        fy9 fy9Var = new fy9();
        List list = Collections.EMPTY_LIST;
        ghe gheVar = ghe.e;
        hy9 hy9Var = new hy9();
        ly9 ly9Var = ly9.d;
        Uri uri = Uri.EMPTY;
        lvb.b0(fy9Var.b == null || fy9Var.a != null);
        gy9 gy9Var = null;
        if (uri != null) {
            if (fy9Var.a != null) {
                gy9Var = new gy9(fy9Var);
            }
            jy9Var = new jy9(uri, null, gy9Var, null, list, null, gheVar, -9223372036854775807L);
        } else {
            jy9Var = null;
        }
        r = new ry9("androidx.media3.common.Timeline", new dy9(by9Var), jy9Var, new iy9(hy9Var), b0a.K, ly9Var);
        s = Integer.toString(1, 36);
        t = Integer.toString(2, 36);
        u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = Integer.toString(5, 36);
        x = Integer.toString(6, 36);
        y = Integer.toString(7, 36);
        z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        return this.i != null;
    }

    public final void b(Object obj, ry9 ry9Var, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, iy9 iy9Var, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        this.b = ry9Var != null ? ry9Var : r;
        if (ry9Var != null) {
            jy9 jy9Var = ry9Var.b;
        }
        this.c = obj2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z2;
        this.h = z3;
        this.i = iy9Var;
        this.k = j4;
        this.l = j5;
        this.m = i;
        this.n = i2;
        this.o = j6;
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tsh.class.equals(obj.getClass())) {
            tsh tshVar = (tsh) obj;
            if (Objects.equals(this.a, tshVar.a) && Objects.equals(this.b, tshVar.b) && Objects.equals(this.c, tshVar.c) && Objects.equals(this.i, tshVar.i) && this.d == tshVar.d && this.e == tshVar.e && this.f == tshVar.f && this.g == tshVar.g && this.h == tshVar.h && this.j == tshVar.j && this.k == tshVar.k && this.l == tshVar.l && this.m == tshVar.m && this.n == tshVar.n && this.o == tshVar.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.c;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        iy9 iy9Var = this.i;
        int iHashCode3 = (iHashCode2 + (iy9Var != null ? iy9Var.hashCode() : 0)) * 31;
        long j = this.d;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31;
        long j4 = this.k;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.l;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.m) * 31) + this.n) * 31;
        long j6 = this.o;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
