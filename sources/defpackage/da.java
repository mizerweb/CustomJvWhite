package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class da {
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public final long a;
    public final int b;
    public final int c;
    public final Uri[] d;
    public final ry9[] e;
    public final int[] f;
    public final long[] g;
    public final String[] h;
    public final ea[] i;
    public final long j;
    public final boolean k;
    public final boolean l;

    static {
        String str = vqi.a;
        m = Integer.toString(0, 36);
        n = Integer.toString(1, 36);
        o = Integer.toString(2, 36);
        p = Integer.toString(3, 36);
        q = Integer.toString(4, 36);
        r = Integer.toString(5, 36);
        s = Integer.toString(6, 36);
        t = Integer.toString(7, 36);
        u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
        w = Integer.toString(10, 36);
        x = Integer.toString(11, 36);
    }

    public da(long j, int i, int i2, int[] iArr, ry9[] ry9VarArr, long[] jArr, long j2, boolean z, String[] strArr, ea[] eaVarArr, boolean z2) {
        Uri uri;
        int i3 = 0;
        lvb.R(iArr.length == ry9VarArr.length);
        lvb.R(iArr.length == eaVarArr.length);
        this.a = j;
        this.b = i;
        this.c = i2;
        this.f = iArr;
        this.e = ry9VarArr;
        this.g = jArr;
        this.j = j2;
        this.k = z;
        this.d = new Uri[ry9VarArr.length];
        while (true) {
            Uri[] uriArr = this.d;
            if (i3 >= uriArr.length) {
                this.h = strArr;
                this.i = eaVarArr;
                this.l = z2;
                return;
            }
            ry9 ry9Var = ry9VarArr[i3];
            if (ry9Var == null) {
                uri = null;
            } else {
                jy9 jy9Var = ry9Var.b;
                jy9Var.getClass();
                uri = jy9Var.a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f;
            if (i3 >= iArr.length || this.k || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && da.class == obj.getClass()) {
            da daVar = (da) obj;
            if (this.a == daVar.a && this.b == daVar.b && this.c == daVar.c && Arrays.equals(this.e, daVar.e) && Arrays.equals(this.f, daVar.f) && Arrays.equals(this.g, daVar.g) && this.j == daVar.j && this.k == daVar.k && Arrays.equals(this.h, daVar.h) && Arrays.equals(this.i, daVar.i) && this.l == daVar.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.b * 31) + this.c) * 31;
        long j = this.a;
        int iHashCode = (Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31)) * 31;
        long j2 = this.j;
        return ((Arrays.hashCode(this.i) + ((((((iHashCode + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.k ? 1 : 0)) * 31) + Arrays.hashCode(this.h)) * 31)) * 31) + (this.l ? 1 : 0);
    }
}
