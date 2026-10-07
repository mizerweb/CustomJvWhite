package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class vyf extends sr implements azf {
    public af7 c;

    public vyf() {
        super(new chf(10));
    }

    @Override // defpackage.azf
    public final void C() {
        ny8 ny8Var = (ny8) this.b;
        if (ny8Var.d()) {
            Q().setVisibility(8);
        }
    }

    @Override // defpackage.azf
    public final float b(int i) {
        if (!n7j.o((ny8) this.b)) {
            return zo5.D(6.0f, yl5.d().getDisplayMetrics().density, i) - (gm0.K(32.0f * yl5.d().getDisplayMetrics().density) / 2.0f);
        }
        return (Q().getHeight() / 2.0f) + Q().getTop();
    }

    @Override // defpackage.azf
    public final void setOnShareButtonClickListener(af7 af7Var) {
        this.c = af7Var;
    }

    @Override // defpackage.azf
    public final void setShareButtonSwipeProgress(float f) {
        ny8 ny8Var = (ny8) this.b;
        if (ny8Var.d()) {
            ((View) ny8Var.getValue()).setAlpha(1.0f - f);
        }
    }

    @Override // defpackage.azf
    public final void w() {
        r();
        Q().setOnClickListener(new gwc(24, this));
        Q().setVisibility(0);
    }
}
