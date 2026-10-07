package defpackage;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class tlh extends u7e {
    public j28 e;
    public g7b f;
    public oc7 g;
    public final wm7 h;

    public tlh(wm7 wm7Var, o02 o02Var) {
        super(o02Var);
        this.h = wm7Var;
    }

    @Override // defpackage.u7e
    public final synchronized void b() {
        j28 j28Var = this.e;
        j28Var.getClass();
        j28Var.k();
        super.b();
    }

    @Override // defpackage.u7e
    public final int f() {
        int size;
        j28 j28Var = this.e;
        j28Var.getClass();
        synchronized (j28Var) {
            size = ((ArrayDeque) j28Var.f).size();
        }
        return size;
    }

    @Override // defpackage.u7e
    public final void j(final int i, final long j) {
        final oc7 oc7Var = this.g;
        oc7Var.getClass();
        this.f.getClass();
        ((o02) this.a).q(new pwi() { // from class: slh
            @Override // defpackage.pwi
            public final void run() {
                tlh tlhVar = this.a;
                int i2 = i;
                oc7 oc7Var2 = oc7Var;
                long j2 = j;
                b87 b87Var = oc7Var2.a;
                dn7 dn7Var = new dn7(i2, -1, b87Var.u, b87Var.v);
                j28 j28Var = tlhVar.e;
                j28Var.getClass();
                j28Var.v(dn7Var, j2);
                int i3 = oc7Var2.a.u;
                LinkedHashMap linkedHashMap = g55.a;
                synchronized (g55.class) {
                }
            }
        }, true);
    }

    @Override // defpackage.u7e
    public final void m() {
    }

    @Override // defpackage.u7e
    public final void q(oc7 oc7Var, boolean z) {
        this.g = oc7Var;
    }

    @Override // defpackage.u7e
    public final void r(g7b g7bVar) {
        this.f = g7bVar;
    }

    @Override // defpackage.u7e
    public final void s(md5 md5Var) {
        this.e = new j28(this.h, md5Var, (o02) this.a);
    }

    @Override // defpackage.u7e
    public final void t() {
        ((o02) this.a).q(new if5(1, this), true);
    }

    @Override // defpackage.an7
    public final void y() {
        this.e.getClass();
        o02 o02Var = (o02) this.a;
        j28 j28Var = this.e;
        Objects.requireNonNull(j28Var);
        o02Var.q(new if5(2, j28Var), true);
    }

    @Override // defpackage.an7
    public final void z(dn7 dn7Var) {
        ((o02) this.a).q(new zo2(this, 5, dn7Var), true);
    }
}
