package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class az1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bz1 b;

    public /* synthetic */ az1(bz1 bz1Var, int i) {
        this.a = i;
        this.b = bz1Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        bz1 bz1Var = this.b;
        switch (i9) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                c1d c1dVar = bz1Var.w;
                if (c1dVar != null) {
                    c1dVar.c();
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                bz1Var.getCallModeChangeManager().a().f();
                break;
        }
    }
}
