package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class yxa extends Drawable implements Animatable {
    public final Context a;
    public final ny8 b;
    public final ny8 c;
    public final ik d;
    public final ObjectAnimator e;
    public final dk f;
    public final ObjectAnimator g;
    public final Path h;
    public float i;

    public yxa(Context context) {
        this.a = context;
        final int i = 0;
        this.b = rx8.P(3, new af7(this) { // from class: wxa
            public final /* synthetic */ yxa b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                a8g a8gVar = pq3.j;
                yxa yxaVar = this.b;
                switch (i2) {
                    case 0:
                        Context context2 = yxaVar.a;
                        Drawable drawable = context2.getDrawable(R.drawable.icon_microphone_fill);
                        a8gVar.k(context2);
                        drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        return drawable;
                    default:
                        Paint paint = new Paint();
                        paint.setColor(a8gVar.k(yxaVar.a).b.getIcon().i);
                        paint.setAntiAlias(true);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        paint.setStyle(Paint.Style.FILL_AND_STROKE);
                        paint.setStrokeWidth(2.0f);
                        return paint;
                }
            }
        });
        final int i2 = 1;
        this.c = rx8.P(3, new af7(this) { // from class: wxa
            public final /* synthetic */ yxa b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                a8g a8gVar = pq3.j;
                yxa yxaVar = this.b;
                switch (i3) {
                    case 0:
                        Context context2 = yxaVar.a;
                        Drawable drawable = context2.getDrawable(R.drawable.icon_microphone_fill);
                        a8gVar.k(context2);
                        drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        return drawable;
                    default:
                        Paint paint = new Paint();
                        paint.setColor(a8gVar.k(yxaVar.a).b.getIcon().i);
                        paint.setAntiAlias(true);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        paint.setStyle(Paint.Style.FILL_AND_STROKE);
                        paint.setStrokeWidth(2.0f);
                        return paint;
                }
            }
        });
        ik ikVar = new ik("waveX", 0);
        this.d = ikVar;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((Object) null, ikVar, 0, getBounds().width());
        objectAnimatorOfInt.setDuration(1000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: xxa
            public final /* synthetic */ yxa b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = i;
                yxa yxaVar = this.b;
                switch (i3) {
                    case 0:
                        yxaVar.invalidateSelf();
                        break;
                    default:
                        yxaVar.a(yxaVar.h);
                        yxaVar.invalidateSelf();
                        break;
                }
            }
        });
        this.e = objectAnimatorOfInt;
        dk dkVar = new dk("volume", 0.0f);
        this.f = dkVar;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, dkVar, 0.0f, 0.7f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setRepeatCount(0);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: xxa
            public final /* synthetic */ yxa b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = i2;
                yxa yxaVar = this.b;
                switch (i3) {
                    case 0:
                        yxaVar.invalidateSelf();
                        break;
                    default:
                        yxaVar.a(yxaVar.h);
                        yxaVar.invalidateSelf();
                        break;
                }
            }
        });
        this.g = objectAnimatorOfFloat;
        this.h = new Path();
        this.i = 0.7f;
    }

    public final void a(Path path) {
        float fWidth = getBounds().width();
        float fHeight = getBounds().height();
        float f = fHeight - (this.f.a * fHeight);
        float fK = (gm0.K(yl5.d().getDisplayMetrics().density * 4.0f) / 2) + f;
        path.rewind();
        path.moveTo(0.0f, fK);
        float f2 = fWidth / 3.0f;
        path.cubicTo(f2, (gm0.K(yl5.d().getDisplayMetrics().density * 4.0f) / 2) + f, 2.0f * f2, f, fWidth, f + (gm0.K(4.0f * yl5.d().getDisplayMetrics().density) / 2));
        path.lineTo(fWidth, fHeight);
        path.lineTo(0.0f, fHeight);
        path.lineTo(0.0f, fK);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(new RectF(getBounds()), null);
        ((Drawable) this.b.getValue()).draw(canvas);
        ik ikVar = this.d;
        canvas.translate(-ikVar.a, 0.0f);
        ny8 ny8Var = this.c;
        Paint paint = (Paint) ny8Var.getValue();
        Path path = this.h;
        canvas.drawPath(path, paint);
        canvas.translate(getBounds().width(), 0.0f);
        canvas.drawPath(path, (Paint) ny8Var.getValue());
        canvas.translate(ikVar.a - getBounds().width(), 0.0f);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.e.isRunning() || this.g.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ((Drawable) this.b.getValue()).setBounds(rect);
        this.e.setValues(PropertyValuesHolder.ofInt(this.d, 0, rect.width()));
        a(this.h);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.e.start();
        this.g.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.e.cancel();
        this.g.cancel();
    }
}
