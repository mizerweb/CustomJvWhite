package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mx2 {
    public String a;
    public long b;
    public String c;
    public int d;
    public List e;
    public int f;
    public int g;

    public static mx2 b() {
        return new mx2();
    }

    public mx2 a() {
        mx2 mx2Var = new mx2();
        mx2Var.a = this.a;
        mx2Var.b = this.b;
        mx2Var.c = this.c;
        mx2Var.d = this.d;
        mx2Var.e = this.e;
        mx2Var.f = this.f;
        int i = this.g;
        if (i == 0) {
            i = 3;
        }
        mx2Var.g = i;
        return mx2Var;
    }

    public void c(int i) {
        this.d = i;
    }

    public void d(String str) {
        this.a = str;
    }

    public void e(String str) {
        this.c = str;
    }

    public void f(int i) {
        this.g = i;
    }

    public void g(List list) {
        this.e = list;
    }

    public void h(long j) {
        this.b = j;
    }

    public void i(int i) {
        this.f = i;
    }
}
