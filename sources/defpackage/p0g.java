package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public class p0g extends Drawable {
    public final xcf a = new xcf(2, this);
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Matrix d = new Matrix();
    public ValueAnimator e;
    public m0g f;

    public final void a() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null || valueAnimator.isStarted()) {
            return;
        }
        m0g m0gVar = this.f;
        if (m0gVar == null) {
            m0gVar = null;
        }
        if (!m0gVar.j || getCallback() == null) {
            return;
        }
        this.e.start();
    }

    public final void b(m0g m0gVar) {
        boolean zIsStarted;
        ValueAnimator valueAnimator;
        this.f = m0gVar;
        this.b.setXfermode(new PorterDuffXfermode(m0gVar.k));
        e();
        ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2 != null) {
            zIsStarted = valueAnimator2.isStarted();
            valueAnimator2.cancel();
            valueAnimator2.removeAllUpdateListeners();
        } else {
            zIsStarted = false;
        }
        m0g m0gVar2 = this.f;
        if (m0gVar2 == null) {
            m0gVar2 = null;
        }
        m0g m0gVar3 = m0gVar2;
        ValueAnimator valueAnimatorOfFloat = m0gVar3.q;
        if (valueAnimatorOfFloat == null) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            long j = m0gVar3.n;
            long j2 = m0gVar3.o + j;
            valueAnimatorOfFloat.setRepeatMode(m0gVar3.m);
            valueAnimatorOfFloat.setRepeatCount(m0gVar3.l);
            valueAnimatorOfFloat.setDuration(j2);
            valueAnimatorOfFloat.setInterpolator(new l0g(j, j2, m0gVar3));
            m0gVar3.q = valueAnimatorOfFloat;
        }
        this.e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(this.a);
        if (zIsStarted && (valueAnimator = this.e) != null) {
            valueAnimator.start();
        }
        invalidateSelf();
    }

    public final void c() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            if ((valueAnimator == null || !valueAnimator.isStarted()) && getCallback() != null) {
                this.e.start();
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null || valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        this.e.cancel();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float fC;
        float f;
        float fC2;
        Paint paint = this.b;
        if (paint.getShader() == null) {
            return;
        }
        m0g m0gVar = this.f;
        if (m0gVar == null) {
            m0gVar = null;
        }
        m0gVar.getClass();
        float fTan = (float) Math.tan(Math.toRadians(0.0d));
        Rect rect = this.c;
        float fWidth = (rect.width() * fTan) + rect.height();
        float fHeight = (fTan * rect.height()) + rect.width();
        ValueAnimator valueAnimator = this.e;
        Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
        Float f2 = animatedValue instanceof Float ? (Float) animatedValue : null;
        float fFloatValue = f2 != null ? f2.floatValue() : 0.0f;
        m0g m0gVar2 = this.f;
        if (m0gVar2 == null) {
            m0gVar2 = null;
        }
        int iD = qt4.D(m0gVar2.c);
        if (iD != 0) {
            if (iD == 1) {
                float f3 = -fWidth;
                fC2 = c0a.c(fWidth, f3, fFloatValue, f3);
            } else if (iD == 2) {
                fC = c0a.c(-fHeight, fHeight, fFloatValue, fHeight);
            } else {
                if (iD != 3) {
                    ore.o();
                    return;
                }
                fC2 = c0a.c(-fWidth, fWidth, fFloatValue, fWidth);
            }
            f = fC2;
            fC = 0.0f;
            Matrix matrix = this.d;
            matrix.reset();
            m0g m0gVar3 = this.f;
            (m0gVar3 != null ? m0gVar3 : null).getClass();
            matrix.setRotate(0.0f, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(fC, f);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
        float f4 = -fHeight;
        fC = c0a.c(fHeight, f4, fFloatValue, f4);
        f = 0.0f;
        Matrix matrix2 = this.d;
        matrix2.reset();
        m0g m0gVar4 = this.f;
        (m0gVar4 != null ? m0gVar4 : null).getClass();
        matrix2.setRotate(0.0f, rect.width() / 2.0f, rect.height() / 2.0f);
        matrix2.postTranslate(fC, f);
        paint.getShader().setLocalMatrix(matrix2);
        canvas.drawRect(rect, paint);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    public final void e() {
        boolean z;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0) {
            return;
        }
        m0g m0gVar = this.f;
        if (m0gVar == null) {
            m0gVar = null;
        }
        int iK = m0gVar.f;
        if (iK <= 0) {
            iK = gm0.K(m0gVar.g * iWidth);
        }
        m0g m0gVar2 = this.f;
        if (m0gVar2 == null) {
            m0gVar2 = null;
        }
        int iK2 = gm0.K(m0gVar2.h * iHeight);
        m0g m0gVar3 = this.f;
        if ((m0gVar3 == null ? null : m0gVar3).c == 2) {
            z = true;
        } else {
            if (m0gVar3 == null) {
                m0gVar3 = null;
            }
            if (m0gVar3.c == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            iK = 0;
        }
        if (!z) {
            iK2 = 0;
        }
        float f = iK;
        float f2 = iK2;
        m0g m0gVar4 = this.f;
        this.b.setShader(new LinearGradient(0.0f, 0.0f, f, f2, (m0gVar4 == null ? null : m0gVar4).b, (m0gVar4 != null ? m0gVar4 : null).a, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        m0g m0gVar = this.f;
        if ((m0gVar == null ? null : m0gVar).i) {
            return -3;
        }
        if (m0gVar == null) {
            m0gVar = null;
        }
        return m0gVar.k == PorterDuff.Mode.DST_IN ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(0, 0, rect.width(), rect.height());
        e();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
