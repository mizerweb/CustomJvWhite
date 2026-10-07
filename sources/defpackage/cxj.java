package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class cxj extends bxj {
    public static final ixj r = ixj.g(WindowInsets.CONSUMED, null);

    public cxj(ixj ixjVar, WindowInsets windowInsets) {
        super(ixjVar, windowInsets);
    }

    @Override // defpackage.ywj, defpackage.exj
    public final void d(View view) {
    }

    @Override // defpackage.ywj, defpackage.exj
    public mi8 f(int i) {
        return mi8.c(this.c.getInsets(gxj.a(i)));
    }

    @Override // defpackage.ywj, defpackage.exj
    public boolean o(int i) {
        return this.c.isVisible(gxj.a(i));
    }
}
