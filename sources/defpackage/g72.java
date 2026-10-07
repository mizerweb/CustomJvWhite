package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.view.ScaleGestureDetector;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* JADX INFO: loaded from: classes2.dex */
public final class g72 implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g72(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        b99 b99VarH;
        t1k t1kVar;
        b99 b99VarH2;
        t1k t1kVar2;
        ValueAnimator valueAnimator;
        int i = this.a;
        float fB = 1.0f;
        Object obj = this.b;
        switch (i) {
            case 0:
                i72 i72Var = (i72) obj;
                Matrix matrix = i72Var.h;
                float[] fArr = i72Var.p;
                Matrix matrix2 = i72Var.i;
                float[] fArr2 = i72Var.o;
                Matrix matrix3 = i72Var.t;
                TextureViewRenderer textureViewRenderer = i72Var.g;
                if (textureViewRenderer == null) {
                    return false;
                }
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                float fA = v3e.a(matrix3);
                if (fA * scaleFactor > 3.0f) {
                    scaleFactor = 3.0f / fA;
                }
                if (fA * scaleFactor < 1.0f) {
                    scaleFactor = 1.0f / fA;
                }
                float focusX = (scaleGestureDetector.getFocusX() - textureViewRenderer.getLeft()) + ((i72Var.c / 2) - (textureViewRenderer.getWidth() / 2));
                float focusY = (scaleGestureDetector.getFocusY() - textureViewRenderer.getTop()) + ((i72Var.d / 2) - (textureViewRenderer.getHeight() / 2));
                fArr2[0] = focusX;
                fArr2[1] = focusY;
                matrix2.mapPoints(fArr, fArr2);
                matrix.mapPoints(fArr2, fArr);
                matrix3.postScale(scaleFactor, scaleFactor, fArr2[0], fArr2[1]);
                matrix3.invert(matrix2);
                textureViewRenderer.setTransform(matrix3);
                textureViewRenderer.invalidate();
                float fA2 = v3e.a(matrix);
                if (fA2 != 0.0f) {
                    i72Var.d(gm0.K((v3e.a(matrix3) / fA2) * 100.0f));
                }
                return true;
            case 1:
                return false;
            default:
                zv8[] zv8VarArr = VideoMessageWidget.B;
                f2j f2jVarY1 = ((VideoMessageWidget) obj).y1();
                float scaleFactor2 = scaleGestureDetector.getScaleFactor();
                g1j g1jVar = f2jVarY1.c;
                ValueAnimator valueAnimator2 = g1jVar.J;
                if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = g1jVar.J) != null) {
                    valueAnimator.cancel();
                }
                float fC = g1jVar.I * c0a.c(scaleFactor2, 1.0f, 2.0f, 1.0f);
                g1jVar.I = fC;
                nf2 nf2VarT = g1jVar.t();
                if (nf2VarT != null && (b99VarH2 = ((ja) nf2VarT).b.H()) != null && (t1kVar2 = (t1k) b99VarH2.d()) != null) {
                    fB = t1kVar2.b();
                }
                nf2 nf2VarT2 = g1jVar.t();
                float fU = oc9.u(fC, fB, (nf2VarT2 == null || (b99VarH = ((ja) nf2VarT2).b.H()) == null || (t1kVar = (t1k) b99VarH.d()) == null) ? 10.0f : t1kVar.a());
                o09 o09Var = g1jVar.r;
                be2 be2VarR = o09Var != null ? o09Var.r() : null;
                if (be2VarR != null) {
                    ((ia) be2VarR).f(fU);
                }
                return true;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        switch (this.a) {
            case 0:
                i72 i72Var = (i72) this.b;
                i72Var.t.invert(i72Var.i);
                ViewParent parent = i72Var.a.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                i72Var.x = true;
                break;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                bwc bwcVar = (bwc) obj;
                u1k zoomableController = bwcVar.getZoomableController();
                if (zoomableController != null && v3e.a(((uf5) zoomableController).m) > 1.1f) {
                    zoomableController.a(bwcVar.getWidth() / 2.0f, bwcVar.getHeight() / 2.0f);
                }
                break;
            default:
                zv8[] zv8VarArr = VideoMessageWidget.B;
                g1j g1jVar = ((VideoMessageWidget) obj).y1().c;
                ValueAnimator valueAnimator = g1jVar.J;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(g1jVar.I, 1.0f);
                    valueAnimatorOfFloat.setDuration(150L);
                    valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    valueAnimatorOfFloat.addUpdateListener(new xcf(7, g1jVar));
                    valueAnimatorOfFloat.addListener(new li(22, g1jVar));
                    g1jVar.J = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.start();
                }
                break;
        }
    }
}
