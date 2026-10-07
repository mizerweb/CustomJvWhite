package defpackage;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class np0 {
    public static final int A = 8;
    public static final int B = 9;
    public static final int C = 10;
    public static final int D = 11;
    public static final int E = 12;
    public static final int d = -1;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 4;
    public static final int i = 8;
    public static final int j = 16;
    public static final int k = 32;
    public static final int l = 64;
    public static final int m = 128;
    public static final int n = 256;
    public static final int o = 512;
    public static final int p = 1024;
    public static final int q = 2048;
    public static final int r = 4096;
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 3;
    public static final int w = 4;
    public static final int x = 5;
    public static final int y = 6;
    public static final int z = 7;
    private final rp0 a;
    private final Rect b;
    private final Point[] c;

    public static class a {
        public static final int c = 0;
        public static final int d = 1;
        public static final int e = 2;
        private final int a;
        private final String[] b;

        /* JADX INFO: renamed from: np0$a$a, reason: collision with other inner class name */
        @Retention(RetentionPolicy.CLASS)
        public @interface InterfaceC0003a {
        }

        public a(int i, String[] strArr) {
            this.a = i;
            this.b = strArr;
        }

        public String[] a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface b {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface c {
    }

    public static class d {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final int f;
        private final boolean g;
        private final String h;

        public d(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = z;
            this.h = str;
        }

        public int a() {
            return this.c;
        }

        public int b() {
            return this.d;
        }

        public int c() {
            return this.e;
        }

        public int d() {
            return this.b;
        }

        public String e() {
            return this.h;
        }

        public int f() {
            return this.f;
        }

        public int g() {
            return this.a;
        }

        public boolean h() {
            return this.g;
        }
    }

    public static class e {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final d f;
        private final d g;

        public e(String str, String str2, String str3, String str4, String str5, d dVar, d dVar2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = dVar;
            this.g = dVar2;
        }

        public String a() {
            return this.b;
        }

        public d b() {
            return this.g;
        }

        public String c() {
            return this.c;
        }

        public String d() {
            return this.d;
        }

        public d e() {
            return this.f;
        }

        public String f() {
            return this.e;
        }

        public String g() {
            return this.a;
        }
    }

    public static class f {
        private final j a;
        private final String b;
        private final String c;
        private final List d;
        private final List e;
        private final List f;
        private final List g;

        public f(j jVar, String str, String str2, List<k> list, List<h> list2, List<String> list3, List<a> list4) {
            this.a = jVar;
            this.b = str;
            this.c = str2;
            this.d = list;
            this.e = list2;
            this.f = list3;
            this.g = list4;
        }

        public List<a> a() {
            return this.g;
        }

        public List<h> b() {
            return this.e;
        }

        public j c() {
            return this.a;
        }

        public String d() {
            return this.b;
        }

        public List<k> e() {
            return this.d;
        }

        public String f() {
            return this.c;
        }

        public List<String> g() {
            return this.f;
        }
    }

    public static class g {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final String f;
        private final String g;
        private final String h;
        private final String i;
        private final String j;
        private final String k;
        private final String l;
        private final String m;
        private final String n;

        public g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
            this.i = str9;
            this.j = str10;
            this.k = str11;
            this.l = str12;
            this.m = str13;
            this.n = str14;
        }

        public String a() {
            return this.g;
        }

        public String b() {
            return this.h;
        }

        public String c() {
            return this.f;
        }

        public String d() {
            return this.i;
        }

        public String e() {
            return this.m;
        }

        public String f() {
            return this.a;
        }

        public String g() {
            return this.l;
        }

        public String h() {
            return this.b;
        }

        public String i() {
            return this.e;
        }

        public String j() {
            return this.k;
        }

        public String k() {
            return this.n;
        }

        public String l() {
            return this.d;
        }

        public String m() {
            return this.j;
        }

        public String n() {
            return this.c;
        }
    }

    public static class h {
        public static final int e = 0;
        public static final int f = 1;
        public static final int g = 2;
        private final int a;
        private final String b;
        private final String c;
        private final String d;

        @Retention(RetentionPolicy.CLASS)
        public @interface a {
        }

        public h(int i, String str, String str2, String str3) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public String a() {
            return this.b;
        }

        public String b() {
            return this.d;
        }

        public String c() {
            return this.c;
        }

        public int d() {
            return this.a;
        }
    }

    public static class i {
        private final double a;
        private final double b;

        public i(double d, double d2) {
            this.a = d;
            this.b = d2;
        }

        public double a() {
            return this.a;
        }

        public double b() {
            return this.b;
        }
    }

    public static class j {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final String f;
        private final String g;

        public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
        }

        public String a() {
            return this.d;
        }

        public String b() {
            return this.a;
        }

        public String c() {
            return this.f;
        }

        public String d() {
            return this.e;
        }

        public String e() {
            return this.c;
        }

        public String f() {
            return this.b;
        }

        public String g() {
            return this.g;
        }
    }

    public static class k {
        public static final int c = 0;
        public static final int d = 1;
        public static final int e = 2;
        public static final int f = 3;
        public static final int g = 4;
        private final String a;
        private final int b;

        @Retention(RetentionPolicy.CLASS)
        public @interface a {
        }

        public k(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }
    }

    public static class l {
        private final String a;
        private final String b;

        public l(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    public static class m {
        private final String a;
        private final String b;

        public m(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    public static class n {
        public static final int d = 1;
        public static final int e = 2;
        public static final int f = 3;
        private final String a;
        private final String b;
        private final int c;

        @Retention(RetentionPolicy.CLASS)
        public @interface a {
        }

        public n(String str, String str2, int i) {
            this.a = str;
            this.b = str2;
            this.c = i;
        }

        public int a() {
            return this.c;
        }

        public String b() {
            return this.b;
        }

        public String c() {
            return this.a;
        }
    }

    public np0(rp0 rp0Var, Matrix matrix) {
        yab.s(rp0Var);
        this.a = rp0Var;
        Rect rectF = rp0Var.f();
        if (rectF != null && matrix != null) {
            h44.g(rectF, matrix);
        }
        this.b = rectF;
        Point[] pointArrK = rp0Var.k();
        if (pointArrK != null && matrix != null) {
            h44.d(pointArrK, matrix);
        }
        this.c = pointArrK;
    }

    public Rect a() {
        return this.b;
    }

    public e b() {
        return this.a.b();
    }

    public f c() {
        return this.a.i();
    }

    public Point[] d() {
        return this.c;
    }

    public String e() {
        return this.a.c();
    }

    public g f() {
        return this.a.e();
    }

    public h g() {
        return this.a.l();
    }

    public int h() {
        int format = this.a.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }

    public i i() {
        return this.a.m();
    }

    public k j() {
        return this.a.d();
    }

    public byte[] k() {
        byte[] bArrJ = this.a.j();
        if (bArrJ != null) {
            return Arrays.copyOf(bArrJ, bArrJ.length);
        }
        return null;
    }

    public String l() {
        return this.a.g();
    }

    public l m() {
        return this.a.h();
    }

    public m n() {
        return this.a.getUrl();
    }

    public int o() {
        return this.a.a();
    }

    public n p() {
        return this.a.n();
    }

    public np0(rp0 rp0Var) {
        this(rp0Var, null);
    }
}
