package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ivd extends sr {
    public ivd() {
        super(new skd(9));
    }

    public static int Z() {
        return gm0.K(60.0f * yl5.d().getDisplayMetrics().density);
    }

    public final void J() {
        ny8 ny8Var = (ny8) this.b;
        if (ny8Var.d()) {
            ((View) ny8Var.getValue()).setVisibility(8);
        }
    }

    public final void a0(int i, int i2, int i3, int i4) {
        ny8 ny8Var = (ny8) this.b;
        if (ny8Var.d()) {
            qyj.M((View) ny8Var.getValue(), ((i3 - Z()) / 2) + i, ((i4 - Z()) / 2) + i2, 0, 12);
        }
    }

    public final void b0() {
        ny8 ny8Var = (ny8) this.b;
        if (ny8Var.d()) {
            ((View) ny8Var.getValue()).measure(View.MeasureSpec.makeMeasureSpec(Z(), 1073741824), View.MeasureSpec.makeMeasureSpec(Z(), 1073741824));
        }
    }
}
