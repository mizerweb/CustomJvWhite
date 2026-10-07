package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class a7e implements View.OnLayoutChangeListener {
    public final /* synthetic */ b7e a;
    public final /* synthetic */ View b;
    public final /* synthetic */ long c;

    public a7e(b7e b7eVar, View view, long j) {
        this.a = b7eVar;
        this.b = view;
        this.c = j;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        b7e b7eVar = this.a;
        View view2 = (View) b7eVar.c.b;
        View view3 = this.b;
        Rect rectD = view3 == null ? null : n9j.d(view3, view2);
        if (rectD == null) {
            return;
        }
        b7eVar.b.d(this.c, rectD);
    }
}
