package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class x9j extends w9j {
    @Override // defpackage.f6m
    public final float a(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.f6m
    public final void e(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.w9j
    public final void g(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.w9j
    public final void h(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.w9j
    public final void i(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.w9j
    public final void j(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}
