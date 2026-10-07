package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xcf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xcf(zfh zfhVar, View view) {
        this.a = 9;
        this.b = zfhVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ycf ycfVar = (ycf) obj;
                ycfVar.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ycfVar.invalidateSelf();
                break;
            case 1:
                unf unfVar = (unf) obj;
                unfVar.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unfVar.invalidateSelf();
                break;
            case 2:
                ((p0g) obj).invalidateSelf();
                break;
            case 3:
                ((TextView) obj).setWidth(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 4:
                c0h c0hVar = (c0h) obj;
                c0hVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c0hVar.invalidateSelf();
                break;
            case 5:
                y6h y6hVar = (y6h) obj;
                y6hVar.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y6hVar.invalidate();
                break;
            case 6:
                cyi cyiVar = (cyi) obj;
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = cyiVar.getLayoutParams();
                layoutParams.width = iIntValue;
                layoutParams.height = iIntValue;
                cyiVar.setLayoutParams(layoutParams);
                break;
            case 7:
                g1j g1jVar = (g1j) obj;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1jVar.I = fFloatValue;
                o09 o09Var = g1jVar.r;
                be2 be2VarR = o09Var != null ? o09Var.r() : null;
                if (be2VarR != null) {
                    ((ia) be2VarR).f(fFloatValue);
                }
                break;
            case 8:
                r1j r1jVar = (r1j) obj;
                r1jVar.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1jVar.invalidateSelf();
                break;
            default:
                ((View) ((lwj) ((zfh) obj).a).d.getParent()).invalidate();
                break;
        }
    }

    public /* synthetic */ xcf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
