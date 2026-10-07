package defpackage;

import android.view.ScaleGestureDetector;

/* JADX INFO: loaded from: classes2.dex */
public final class c0d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ d0d a;

    public c0d(d0d d0dVar) {
        this.a = d0dVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        d0d d0dVar = this.a;
        float f = focusX - d0dVar.h;
        float f2 = focusY - d0dVar.i;
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float f3 = d0dVar.h;
        float f4 = d0dVar.i;
        t58 t58Var = d0dVar.b;
        float fU = oc9.u(d0dVar.d * scaleFactor, 1.0f, 8.0f);
        if (fU != d0dVar.d) {
            float translationX = (f3 - t58Var.getTranslationX()) / d0dVar.d;
            float translationY = (f4 - t58Var.getTranslationY()) / d0dVar.d;
            t58Var.setTranslationX(f3 - (translationX * fU));
            t58Var.setTranslationY(f4 - (translationY * fU));
            d0dVar.d = fU;
            t58Var.setScaleX(fU);
            t58Var.setScaleY(d0dVar.d);
        }
        t58Var.setTranslationX(t58Var.getTranslationX() + f);
        t58Var.setTranslationY(t58Var.getTranslationY() + f2);
        d0dVar.h = focusX;
        d0dVar.i = focusY;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        float focusX = scaleGestureDetector.getFocusX();
        d0d d0dVar = this.a;
        d0dVar.h = focusX;
        d0dVar.i = scaleGestureDetector.getFocusY();
        return true;
    }
}
