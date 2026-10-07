package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class r58 implements View.OnLayoutChangeListener {
    public final /* synthetic */ t58 a;
    public final /* synthetic */ g58 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public r58(t58 t58Var, g58 g58Var, int i, int i2, int i3, int i4) {
        this.a = t58Var;
        this.b = g58Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        view.removeOnLayoutChangeListener(this);
        bne bneVar = null;
        int i11 = this.d;
        bne bneVar2 = (i11 <= 0 || (i10 = this.c) <= 0) ? null : new bne(i10, i11, Math.max(Math.max(i10, i11), 2048.0f), 8);
        int i12 = this.f;
        if (i12 > 0 && (i9 = this.e) > 0) {
            bneVar = new bne(i9, i12, Math.max(Math.max(i9, i12), 2048.0f), 8);
        }
        this.a.p(this.b, true, bneVar2, bneVar, false);
    }
}
