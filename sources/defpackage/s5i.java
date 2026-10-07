package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public final class s5i {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public pmh r;
    public String t;
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(s5i s5iVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (s5iVar != null) {
            if (!this.c && s5iVar.c) {
                this.b = s5iVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = s5iVar.h;
            }
            if (this.i == -1) {
                this.i = s5iVar.i;
            }
            if (this.a == null && (str = s5iVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = s5iVar.f;
            }
            if (this.g == -1) {
                this.g = s5iVar.g;
            }
            if (this.n == -1) {
                this.n = s5iVar.n;
            }
            if (this.o == null && (alignment2 = s5iVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = s5iVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = s5iVar.q;
            }
            if (this.j == -1) {
                this.j = s5iVar.j;
                this.k = s5iVar.k;
            }
            if (this.r == null) {
                this.r = s5iVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = s5iVar.s;
            }
            if (this.t == null) {
                this.t = s5iVar.t;
            }
            if (this.u == null) {
                this.u = s5iVar.u;
            }
            if (!this.e && s5iVar.e) {
                this.d = s5iVar.d;
                this.e = true;
            }
            if (this.m != -1 || (i = s5iVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
