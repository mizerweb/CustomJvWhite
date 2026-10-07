package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class ep2 extends u2i {
    public boolean a = false;
    public final ViewGroup b;

    public ep2(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.u2i, defpackage.q2i
    public final void b() {
        e4m.b(this.b, false);
    }

    @Override // defpackage.u2i, defpackage.q2i
    public final void c(r2i r2iVar) {
        if (!this.a) {
            e4m.b(this.b, false);
        }
        r2iVar.B(this);
    }

    @Override // defpackage.u2i, defpackage.q2i
    public final void d() {
        e4m.b(this.b, true);
    }

    @Override // defpackage.u2i, defpackage.q2i
    public final void e(r2i r2iVar) {
        e4m.b(this.b, false);
        this.a = true;
    }
}
