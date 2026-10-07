package androidx.loader.app;

import defpackage.b8j;
import defpackage.ba9;
import defpackage.ca9;
import defpackage.keg;
import defpackage.ore;
import defpackage.rxk;

/* JADX INFO: loaded from: classes2.dex */
class LoaderManagerImpl$LoaderViewModel extends b8j {
    public static final a d = new a();
    public final keg b = new keg(0);
    public boolean c = false;

    @Override // defpackage.b8j
    public final void b() {
        keg kegVar = this.b;
        int i = kegVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ba9 ba9Var = (ba9) kegVar.c(i2);
            rxk rxkVar = ba9Var.l;
            rxkVar.a();
            rxkVar.c = true;
            ca9 ca9Var = ba9Var.n;
            if (ca9Var != null) {
                ba9Var.j(ca9Var);
            }
            ba9 ba9Var2 = rxkVar.a;
            if (ba9Var2 == null) {
                ore.k("No listener register");
                return;
            }
            if (ba9Var2 != ba9Var) {
                ore.p("Attempting to unregister the wrong listener");
                return;
            }
            rxkVar.a = null;
            if (ca9Var != null) {
                boolean z = ca9Var.b;
            }
            rxkVar.d = true;
            rxkVar.b = false;
            rxkVar.c = false;
            rxkVar.e = false;
        }
        int i3 = kegVar.c;
        Object[] objArr = kegVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        kegVar.c = 0;
    }
}
