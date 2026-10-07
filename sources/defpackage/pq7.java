package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class pq7 extends t8j {
    public final af7 a;
    public final WeakReference b;
    public int c = 0;
    public int d = 0;

    public pq7(vq7 vq7Var, mp5 mp5Var) {
        this.a = mp5Var;
        this.b = new WeakReference(vq7Var);
    }

    @Override // defpackage.t8j
    public final void h(int i) {
        this.c = this.d;
        this.d = i;
    }

    @Override // defpackage.t8j
    public final void i(int i, float f, int i2) {
        vq7 vq7Var = (vq7) this.b.get();
        try {
            af7 af7Var = this.a;
            Integer num = af7Var != null ? (Integer) af7Var.invoke() : null;
            int iIntValue = i + (num != null ? num.intValue() : 0);
            if (vq7Var != null) {
                vq7.a(vq7Var.c.a, iIntValue);
                vq7Var.e(iIntValue, f);
            }
        } catch (IllegalArgumentException e) {
            String name = pq7.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, qv1.k("updatePagesNumber error: ", e.getMessage()), e);
            }
        }
    }

    @Override // defpackage.t8j
    public final void j(int i) {
        vq7 vq7Var = (vq7) this.b.get();
        try {
            int i2 = this.d;
            if (i2 == 0 || (i2 == 2 && this.c == 0)) {
                af7 af7Var = this.a;
                Integer num = af7Var != null ? (Integer) af7Var.invoke() : null;
                int iIntValue = i + (num != null ? num.intValue() : 0);
                if (vq7Var != null) {
                    vq7Var.setSelectedPageIndex(iIntValue);
                }
            }
        } catch (IllegalArgumentException e) {
            String name = pq7.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, qv1.k("updatePagesNumber error: ", e.getMessage()), e);
            }
        }
    }
}
