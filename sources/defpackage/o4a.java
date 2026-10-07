package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o4a implements h2a {
    public final y28 a;
    public final int b;

    public o4a(y28 y28Var, int i) {
        this.a = y28Var;
        this.b = i;
    }

    @Override // defpackage.h2a
    public final void a(int i, PendingIntent pendingIntent) {
        this.a.a(i, pendingIntent);
    }

    @Override // defpackage.h2a
    public final void b(int i) {
        this.a.b(i);
    }

    @Override // defpackage.h2a
    public final void c(int i, int i2, int i3) {
        this.a.c(i, i2, i3);
    }

    @Override // defpackage.h2a
    public final void d(int i, emf emfVar) {
        this.a.P(i, emfVar.b(), Bundle.EMPTY);
    }

    @Override // defpackage.h2a
    public final void e(int i, e09 e09Var) {
        this.a.o(i, e09Var.c());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != o4a.class) {
            return false;
        }
        return Objects.equals(this.a.asBinder(), ((o4a) obj).a.asBinder());
    }

    @Override // defpackage.h2a
    public final void f(int i, umf umfVar, boolean z, boolean z2, int i2) {
        this.a.O(i, umfVar.a(z, z2).c(i2));
    }

    @Override // defpackage.h2a
    public final void g(int i, h3d h3dVar) {
        this.a.N(i, h3dVar.c());
    }

    @Override // defpackage.h2a
    public final void h(int i, wmf wmfVar) {
        this.a.C(i, wmfVar.b());
    }

    public final int hashCode() {
        return Objects.hash(this.a.asBinder());
    }

    @Override // defpackage.h2a
    public final void i(int i, c4d c4dVar, h3d h3dVar, boolean z, boolean z2) {
        Bundle bundleR;
        int i2 = this.b;
        lvb.b0(i2 != 0);
        boolean z3 = z || !h3dVar.a(17);
        boolean z4 = z2 || !h3dVar.a(30);
        y28 y28Var = this.a;
        if (i2 < 2) {
            y28Var.s(c4dVar.o(h3dVar, z, true).r(i2), i, z3);
            return;
        }
        c4d c4dVarO = c4dVar.o(h3dVar, z, z2);
        if (y28Var instanceof sv9) {
            bundleR = new Bundle();
            bundleR.putBinder(c4d.o0, new b4d(c4dVarO));
        } else {
            bundleR = c4dVarO.r(i2);
        }
        y28Var.Q(i, bundleR, new a4d(z3, z4).b());
    }

    @Override // defpackage.h2a
    public final void onDisconnected() {
        cqk.l(this.a);
    }
}
