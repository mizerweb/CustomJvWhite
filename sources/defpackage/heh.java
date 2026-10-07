package defpackage;

import android.util.Range;

/* JADX INFO: loaded from: classes2.dex */
public final class heh implements awi {
    public final awi a;

    public heh(awi awiVar) {
        this.a = awiVar;
        if (awiVar.a()) {
            return;
        }
        ore.p("Failed requirement.");
        throw null;
    }

    @Override // defpackage.awi
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.awi
    public final Range b(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.awi
    public final int d() {
        return this.a.g();
    }

    @Override // defpackage.awi
    public final boolean e(int i, int i2) {
        return this.a.e(i2, i);
    }

    @Override // defpackage.awi
    public final boolean f(int i, int i2) {
        return this.a.f(i2, i);
    }

    @Override // defpackage.awi
    public final int g() {
        return this.a.d();
    }

    @Override // defpackage.awi
    public final Range h() {
        return this.a.h();
    }

    @Override // defpackage.awi
    public final Range i(int i) {
        return this.a.b(i);
    }

    @Override // defpackage.awi
    public final Range j() {
        return this.a.k();
    }

    @Override // defpackage.awi
    public final Range k() {
        return this.a.j();
    }
}
