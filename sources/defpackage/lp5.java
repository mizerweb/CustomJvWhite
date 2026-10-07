package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.OvershootInterpolator;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class lp5 extends View {
    public final String a;
    public final float b;
    public final float c;
    public final Drawable d;
    public final OvershootInterpolator e;
    public final AccelerateDecelerateInterpolator f;
    public kp5 g;

    public lp5(Context context, int i) {
        super(context);
        this.a = lp5.class.getName();
        this.b = yl5.d().getDisplayMetrics().density * 96.0f;
        this.c = yl5.d().getDisplayMetrics().density * 24.0f;
        Drawable drawableMutate = getContext().getDrawable(R.drawable.icon_heart_fill).mutate();
        sb8.m0(i, drawableMutate);
        int iCeil = ((int) Math.ceil((yl5.d().getDisplayMetrics().density * 96.0f) * 1.15f)) / 2;
        int i2 = -iCeil;
        drawableMutate.setBounds(i2, i2, iCeil, iCeil);
        this.d = drawableMutate;
        this.e = new OvershootInterpolator();
        this.f = new AccelerateDecelerateInterpolator();
        setClickable(false);
        setFocusable(false);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        je9 je9Var = je9.d;
        kp5 kp5Var = this.g;
        if (kp5Var == null) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - kp5Var.c;
        if (jCurrentAnimationTimeMillis < 0) {
            jCurrentAnimationTimeMillis = 0;
        }
        if (jCurrentAnimationTimeMillis >= 710) {
            String str = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(jCurrentAnimationTimeMillis, "won't draw heart, elapsedMs="), null);
            }
            this.g = null;
            return;
        }
        float interpolation = this.f.getInterpolation(oc9.u((jCurrentAnimationTimeMillis - 460) / 250.0f, 0.0f, 1.0f));
        float f = jCurrentAnimationTimeMillis;
        float interpolation2 = this.f.getInterpolation(oc9.u(f / 120.0f, 0.0f, 1.0f)) - interpolation;
        if (interpolation2 <= 0.0f) {
            String str2 = this.a;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "won't draw heart, alpha: " + interpolation2, null);
            }
        } else {
            float interpolation3 = this.e.getInterpolation(oc9.u(f / 260.0f, 0.0f, 1.0f));
            float fB = interpolation3 < 0.5f ? esk.b(0.3f, 1.15f, interpolation3 / 0.5f) : esk.b(1.15f, 1.0f, (interpolation3 - 0.5f) / 0.5f);
            float f2 = (-this.c) * interpolation;
            int iWidth = this.d.getBounds().width();
            if (iWidth <= 0) {
                String str3 = this.a;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null) {
                    je9 je9Var2 = je9.f;
                    if (a4cVar3.b(je9Var2)) {
                        a4cVar3.c(je9Var2, str3, "heart bounds are non valid: " + this.d.getBounds(), null);
                    }
                }
            } else {
                float f3 = (fB * this.b) / iWidth;
                this.d.setAlpha(oc9.v(gm0.K(interpolation2 * 255.0f), 0, 255));
                float f4 = kp5Var.a;
                float f5 = kp5Var.b + f2;
                int iSave = canvas.save();
                canvas.translate(f4, f5);
                try {
                    int iSave2 = canvas.save();
                    canvas.scale(f3, f3, 0.0f, 0.0f);
                    try {
                        this.d.draw(canvas);
                        canvas.restoreToCount(iSave2);
                        canvas.restoreToCount(iSave);
                    } catch (Throwable th) {
                        canvas.restoreToCount(iSave2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    canvas.restoreToCount(iSave);
                    throw th2;
                }
            }
        }
        postInvalidateOnAnimation();
    }
}
