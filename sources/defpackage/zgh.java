package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zgh extends t8j {
    public final WeakReference a;
    public int c = 0;
    public int b = 0;

    public zgh(xgh xghVar) {
        this.a = new WeakReference(xghVar);
    }

    @Override // defpackage.t8j
    public final void h(int i) {
        this.b = this.c;
        this.c = i;
        xgh xghVar = (xgh) this.a.get();
        if (xghVar != null) {
            xghVar.o1 = this.c;
        }
    }

    @Override // defpackage.t8j
    public final void i(int i, float f, int i2) {
        xgh xghVar = (xgh) this.a.get();
        if (xghVar != null) {
            int i3 = this.c;
            boolean z = true;
            if (i3 == 2 && this.b != 1) {
                z = false;
            }
            if (i3 == 2 && this.b == 0) {
                z = false;
            }
            xghVar.o(i, f, z, z, false);
        }
    }

    @Override // defpackage.t8j
    public final void j(int i) {
        xgh xghVar = (xgh) this.a.get();
        if (xghVar == null || xghVar.getSelectedTabPosition() == i || i >= xghVar.getTabCount()) {
            return;
        }
        int i2 = this.c;
        xghVar.n(xghVar.h(i), i2 == 0 || (i2 == 2 && this.b == 0));
    }
}
