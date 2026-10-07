package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class v60 {
    public long a;
    public String b;
    public int c;
    public int d;
    public String e;
    public String f;
    public List g;
    public String h;
    public long i;
    public int j;
    public long k;
    public String l;
    public boolean m;
    public int n;
    public String o;

    public final void a(List list) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        this.g.addAll(list);
    }

    public final w60 b() {
        if (this.g == null) {
            this.g = Collections.EMPTY_LIST;
        }
        if (this.j == 0) {
            this.j = 1;
        }
        if (this.n == 0) {
            this.n = 1;
        }
        return new w60(this);
    }

    public final void c(boolean z) {
        this.m = z;
    }

    public final void d(String str) {
        this.f = str;
    }

    public final void e(int i) {
        this.d = i;
    }

    public final void f(String str) {
        this.l = str;
    }

    public final void g(String str) {
        this.e = str;
    }

    public final void h(String str) {
        this.h = str;
    }

    public final void i(long j) {
        this.k = j;
    }

    public final void j(int i) {
        this.n = i;
    }

    public final void k(long j) {
        this.a = j;
    }

    public final void l(int i) {
        this.j = i;
    }

    public final void m(List list) {
        this.g = list;
    }

    public final void n(long j) {
        this.i = j;
    }

    public final void o(String str) {
        this.b = str;
    }

    public final void p(String str) {
        this.o = str;
    }

    public final void q(int i) {
        this.c = i;
    }
}
