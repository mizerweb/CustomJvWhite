package defpackage;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gw7 implements hw7 {
    public final long b;
    public final long c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final Comparator h;
    public final Comparator i;

    public gw7(hw7 hw7Var) {
        this.b = hw7Var.d();
        this.c = hw7Var.k();
        this.d = ww3.T1(hw7Var.l());
        this.e = hw7Var.b();
        this.f = hw7Var.a();
        this.g = hw7Var.e();
        this.h = hw7Var.c();
        this.i = hw7Var.h();
    }

    @Override // defpackage.hw7
    public final boolean a() {
        return this.f;
    }

    @Override // defpackage.hw7
    public final boolean b() {
        return this.e;
    }

    @Override // defpackage.hw7
    public final Comparator c() {
        return this.h;
    }

    @Override // defpackage.hw7
    public final long d() {
        return this.b;
    }

    @Override // defpackage.hw7
    public final long e() {
        return this.g;
    }

    @Override // defpackage.hw7
    public final Comparator h() {
        return this.i;
    }

    @Override // defpackage.hw7
    public final long k() {
        return this.c;
    }

    @Override // defpackage.hw7
    public final List l() {
        return this.d;
    }
}
