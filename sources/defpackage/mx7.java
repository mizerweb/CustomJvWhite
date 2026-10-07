package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class mx7 {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;
    public final boolean i;
    public final long j;
    public final long k;
    public final c98 l;
    public final c98 m;
    public final ghe n;
    public final boolean o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final String t;

    public mx7(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3, long j7, long j8, String str4) {
        lvb.R((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = arrayList;
        this.i = z;
        this.j = j5;
        this.k = j6;
        this.l = c98.n(arrayList2);
        this.m = c98.n(arrayList3);
        this.n = c98.x(arrayList4, new ps0(16));
        this.o = z2;
        this.p = str2;
        this.q = str3;
        this.r = j7;
        this.s = j8;
        this.t = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx7)) {
            return false;
        }
        mx7 mx7Var = (mx7) obj;
        return this.d == mx7Var.d && this.e == mx7Var.e && this.f == mx7Var.f && this.g == mx7Var.g && this.i == mx7Var.i && this.j == mx7Var.j && this.k == mx7Var.k && this.o == mx7Var.o && this.r == mx7Var.r && this.s == mx7Var.s && Objects.equals(this.a, mx7Var.a) && Objects.equals(this.b, mx7Var.b) && Objects.equals(this.c, mx7Var.c) && Objects.equals(this.h, mx7Var.h) && Objects.equals(this.l, mx7Var.l) && Objects.equals(this.m, mx7Var.m) && Objects.equals(this.n, mx7Var.n) && Objects.equals(this.p, mx7Var.p) && Objects.equals(this.q, mx7Var.q) && Objects.equals(this.t, mx7Var.t);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q, Long.valueOf(this.r), Long.valueOf(this.s), this.t);
    }
}
