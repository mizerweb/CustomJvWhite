package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class fr3 extends gr4 {
    public final boolean d;
    public final gr4 e;
    public final nr3 f;

    public fr3(boolean z, int i) {
        z = (i & 1) != 0 ? true : z;
        no9 no9Var = new no9(1, true);
        this.d = z;
        this.e = no9Var;
        this.f = new nr3(z, 2);
    }

    @Override // defpackage.gr4
    public final void a() {
        this.e.a();
    }

    @Override // defpackage.gr4
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.gr4
    public final void f(gr4 gr4Var, br4 br4Var) {
        this.e.f(gr4Var, br4Var);
    }

    @Override // defpackage.gr4
    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, er4 er4Var) {
        boolean z2 = view2 != null && view2.getHeight() > 0 && view2.getWidth() > 0;
        if (view == null && !z && z2) {
            oml.c(view2);
            er4Var.a();
            return;
        }
        if (z && view2 != null) {
            if (oml.b(view, true, false) != null) {
                this.f.g(viewGroup, view, view2, z, er4Var);
                return;
            } else {
                oml.c(view);
                this.e.g(viewGroup, view, view2, z, er4Var);
                return;
            }
        }
        if (z || view == null) {
            oml.c(view2);
            oml.c(view);
            this.e.g(viewGroup, view, view2, z, er4Var);
        } else if (oml.b(view2, false, false) != null) {
            this.f.g(viewGroup, view, view2, z, er4Var);
        } else {
            oml.c(view2);
            this.e.g(viewGroup, view, view2, z, er4Var);
        }
    }

    public fr3() {
        this(false, 3);
    }
}
