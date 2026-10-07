package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a1g extends Drawable implements Animatable, eph {
    public static final /* synthetic */ zv8[] n = {new z8b(a1g.class, "colorState", "getColorState()Lone/me/sdk/uikit/common/emptyview/ShineAnimatedDrawable$Companion$ColorState;"), zo5.e(zfe.a, a1g.class, "blurPadding", "getBlurPadding()I"), new z8b(a1g.class, "rotationValues", "getRotationValues()[F"), new z8b(a1g.class, "rotationDirection", "getRotationDirection()Lone/me/sdk/uikit/common/emptyview/ShineAnimatedDrawable$Companion$RotateDirection;"), new z8b(a1g.class, "rotationDuration", "getRotationDuration()J"), new z8b(a1g.class, "scaleValues", "getScaleValues()[F"), new z8b(a1g.class, "scaleDuration", "getScaleDuration()J"), new z8b(a1g.class, "shapeHeight", "getShapeHeight()Ljava/lang/Integer;"), new z8b(a1g.class, "isScaleAnimationEnabled", "isScaleAnimationEnabled()Z")};
    public static final float[] o = {1.0f, 0.33f, 1.0f};
    public static final float[] p = {0.0f, 359.0f};
    public final Context a;
    public final ny8 b = rx8.P(3, new xlf(1, this));
    public final awd c;
    public final awd d;
    public final ObjectAnimator e;
    public final ObjectAnimator f;
    public final ny8 g;
    public final z0g h;
    public final z0g i;
    public final z0g j;
    public final z0g k;
    public final z0g l;
    public final z0g m;

    public a1g(Context context) {
        this.a = context;
        final int i = 1;
        awd awdVar = new awd("scaleXY", 1.0f);
        this.c = awdVar;
        awd awdVar2 = new awd("rotation", 0.0f);
        this.d = awdVar2;
        float[] fArr = o;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, awdVar, Arrays.copyOf(fArr, fArr.length));
        objectAnimatorOfFloat.setDuration(8000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        final int i2 = 0;
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: w0g
            public final /* synthetic */ a1g b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = i2;
                a1g a1gVar = this.b;
                switch (i3) {
                    case 0:
                        a1gVar.invalidateSelf();
                        break;
                    default:
                        a1gVar.invalidateSelf();
                        break;
                }
            }
        });
        this.e = objectAnimatorOfFloat;
        float[] fArr2 = p;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat((Object) null, awdVar2, Arrays.copyOf(fArr2, fArr2.length));
        objectAnimatorOfFloat2.setDuration(8000L);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: w0g
            public final /* synthetic */ a1g b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = i;
                a1g a1gVar = this.b;
                switch (i3) {
                    case 0:
                        a1gVar.invalidateSelf();
                        break;
                    default:
                        a1gVar.invalidateSelf();
                        break;
                }
            }
        });
        this.f = objectAnimatorOfFloat2;
        this.g = rx8.P(3, new a5d(17));
        this.h = new z0g(this, 0);
        this.i = new z0g(Integer.valueOf(gm0.K(150.0f * yl5.d().getDisplayMetrics().density) * 2), this);
        this.j = new z0g(this, 2);
        this.k = new z0g(this, 3);
        this.l = new z0g(this, 4);
        this.m = new z0g(this, 5);
    }

    public final x0g a() {
        zv8 zv8Var = n[0];
        return (x0g) this.h.b;
    }

    public final Integer b() {
        zv8 zv8Var = n[7];
        return (Integer) this.l.b;
    }

    public final void c() {
        this.m.B(this, n[8], Boolean.FALSE);
    }

    public final void d() {
        zv8 zv8Var = n[8];
        if (((Boolean) this.m.b).booleanValue()) {
            ObjectAnimator objectAnimator = this.e;
            if (objectAnimator.isRunning()) {
                return;
            }
            objectAnimator.start();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        BitmapDrawable bitmapDrawableA = ((g51) this.b.getValue()).a(pq3.j.e(this.a).m(), a(), b());
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        int iSave = canvas.save();
        try {
            z0g z0gVar = this.i;
            zv8 zv8Var = n[1];
            float fIntValue = ((Number) z0gVar.b).intValue();
            canvas.scale((getBounds().width() + fIntValue) / bitmapDrawableA.getBounds().width(), (getBounds().height() + fIntValue) / bitmapDrawableA.getBounds().width(), fCenterX, fCenterY);
            int iSave2 = canvas.save();
            try {
                canvas.rotate(this.d.a, fCenterX, fCenterY);
                float f = this.c.a;
                canvas.scale(f, f, fCenterX, fCenterY);
                float fCenterX2 = fCenterX - bitmapDrawableA.getBounds().centerX();
                float fCenterY2 = fCenterY - bitmapDrawableA.getBounds().centerY();
                iSave = canvas.save();
                canvas.translate(fCenterX2, fCenterY2);
                try {
                    Bitmap bitmap = bitmapDrawableA.getBitmap();
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) this.g.getValue());
                    }
                    canvas.restoreToCount(iSave);
                    canvas.restoreToCount(iSave2);
                } finally {
                    canvas.restoreToCount(iSave);
                }
            } catch (Throwable th) {
                canvas.restoreToCount(iSave2);
                throw th;
            }
        } catch (Throwable th2) {
            canvas.restoreToCount(iSave);
            throw th2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return ((Paint) this.g.getValue()).getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f.isRunning() || this.e.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        ((g51) this.b.getValue()).a(pq3.j.e(this.a).m(), a(), b());
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        ((g51) this.b.getValue()).a(kbcVar, a(), b());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        ((Paint) this.g.getValue()).setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        ((Paint) this.g.getValue()).setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        gm0.n("ShineAnimatedDrawable", "start()");
        d();
        this.f.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        gm0.n("ShineAnimatedDrawable", "stop()");
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        this.f.cancel();
    }
}
