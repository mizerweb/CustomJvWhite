package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class tbd {
    public final xbd a;
    public int b;

    public tbd(xbd xbdVar) {
        this.a = xbdVar;
    }

    public final void a(int i) {
        View viewC;
        xbd xbdVar = this.a;
        if (xbdVar == null || (viewC = xbdVar.c()) == null) {
            return;
        }
        int iV = oc9.v(i - xbdVar.b(), 0, Integer.MAX_VALUE);
        int i2 = iV - this.b;
        this.b = iV;
        viewC.offsetTopAndBottom(i2);
    }
}
