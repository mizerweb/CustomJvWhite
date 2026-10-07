package defpackage;

import androidx.media3.transformer.ExportException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class nh6 {
    public final long a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final int i;
    public final ex3 j;
    public final int k;
    public final int l;
    public final int m;
    public final String n;
    public final String o;
    public final int p;
    public final ExportException q;
    public final int r;
    public final c98 s;

    public nh6(ghe gheVar, long j, long j2, int i, int i2, int i3, String str, String str2, int i4, ex3 ex3Var, int i5, int i6, int i7, String str3, String str4, int i8, ExportException exportException) {
        this.s = gheVar;
        this.a = j;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str;
        this.h = str2;
        this.i = i4;
        this.j = ex3Var;
        this.k = i5;
        this.l = i6;
        this.m = i7;
        this.n = str3;
        this.o = str4;
        this.p = i8;
        this.q = exportException;
        a(str2, i8, gheVar, 1);
        this.r = a(str4, i8, gheVar, 2);
    }

    public static int a(String str, int i, ghe gheVar, int i2) {
        int i3 = 0;
        if (str == null) {
            return 0;
        }
        if (i == 1) {
            return i2 == 1 ? 2 : 3;
        }
        a98 a98VarListIterator = gheVar.listIterator(0);
        while (a98VarListIterator.hasNext()) {
            mh6 mh6Var = (mh6) a98VarListIterator.next();
            if ((i2 == 1 ? mh6Var.d : mh6Var.e) == null) {
                if (i3 == 1) {
                    return 3;
                }
                i3 = 2;
            } else {
                if (i3 == 2) {
                    return 3;
                }
                i3 = 1;
            }
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh6)) {
            return false;
        }
        nh6 nh6Var = (nh6) obj;
        return Objects.equals(this.s, nh6Var.s) && this.b == nh6Var.b && this.c == nh6Var.c && this.d == nh6Var.d && this.e == nh6Var.e && this.f == nh6Var.f && Objects.equals(this.g, nh6Var.g) && Objects.equals(this.h, nh6Var.h) && this.i == nh6Var.i && Objects.equals(this.j, nh6Var.j) && this.k == nh6Var.k && this.l == nh6Var.l && this.m == nh6Var.m && Objects.equals(this.n, nh6Var.n) && Objects.equals(this.o, nh6Var.o) && this.p == nh6Var.p && this.q == nh6Var.q;
    }

    public final int hashCode() {
        return Objects.hashCode(this.q) + ((((Objects.hashCode(this.o) + ((Objects.hashCode(this.n) + ((((((((Objects.hashCode(this.j) + ((((Objects.hashCode(this.h) + ((Objects.hashCode(this.g) + (((((((((((Objects.hashCode(this.s) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31)) * 31)) * 31) + this.i) * 31)) * 31) + this.k) * 31) + this.l) * 31) + this.m) * 31)) * 31)) * 31) + this.p) * 31);
    }
}
