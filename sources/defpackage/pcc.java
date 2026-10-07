package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class pcc implements View.OnLayoutChangeListener {
    public final /* synthetic */ rcc a;

    public pcc(rcc rccVar) {
        this.a = rccVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        rcc.g(this.a);
    }
}
