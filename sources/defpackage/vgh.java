package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class vgh implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ wgh b;

    public vgh(wgh wghVar, View view) {
        this.b = wghVar;
        this.a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.a;
        if (view2.getVisibility() == 0) {
            this.b.c(view2);
        }
    }
}
