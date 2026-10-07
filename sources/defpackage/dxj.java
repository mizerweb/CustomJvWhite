package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes2.dex */
public final class dxj extends cxj {
    public static final ixj s = ixj.g(WindowInsets.CONSUMED, null);

    public dxj(ixj ixjVar, WindowInsets windowInsets) {
        super(ixjVar, windowInsets);
    }

    @Override // defpackage.cxj, defpackage.ywj, defpackage.exj
    public mi8 f(int i) {
        return mi8.c(this.c.getInsets(hxj.a(i)));
    }

    @Override // defpackage.cxj, defpackage.ywj, defpackage.exj
    public boolean o(int i) {
        return this.c.isVisible(hxj.a(i));
    }
}
