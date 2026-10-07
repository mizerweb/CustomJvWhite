package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.DrawableWrapper;
import one.me.rlottie.RLottieDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class gph extends DrawableWrapper implements eph, Animatable {
    public final RLottieDrawable a;
    public final Integer b;
    public final int c;
    public final int d;
    public final int e;
    public final ifh f;
    public final Paint g;
    public final Path h;

    public gph(RLottieDrawable rLottieDrawable, Integer num, Context context, int i, int i2) {
        super(rLottieDrawable);
        this.a = rLottieDrawable;
        this.b = num;
        this.c = R.attr.icon_themed;
        this.d = i;
        this.e = i2;
        this.f = new ifh(new xre(this, 24, context));
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(oc9.Z(R.attr.icon_themed, pq3.j.e(context).m()));
        if (i2 >= 0) {
            paint.setAlpha(i2);
        }
        this.g = paint;
        Path path = new Path();
        float f = i;
        jxf.a(path, 2.247d, new Rect(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * f), gm0.K(f * yl5.d().getDisplayMetrics().density)));
        this.h = path;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = this.d;
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * f);
        RLottieDrawable rLottieDrawable = this.a;
        float f2 = (-(iK - rLottieDrawable.getBounds().width())) / 2.0f;
        float f3 = (-(gm0.K(f * yl5.d().getDisplayMetrics().density) - rLottieDrawable.getBounds().height())) / 2.0f;
        int iSave = canvas.save();
        canvas.translate(f2, f3);
        try {
            canvas.drawPath(this.h, this.g);
            canvas.restoreToCount(iSave);
            if (this.b != null) {
                rLottieDrawable.draw(canvas, (Paint) this.f.getValue());
            } else {
                super.draw(canvas);
            }
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.a.isRunning();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        Paint paint;
        Integer num = this.b;
        if (num != null && (paint = (Paint) this.f.getValue()) != null) {
            paint.setColorFilter(new PorterDuffColorFilter(oc9.Z(num.intValue(), kbcVar), PorterDuff.Mode.SRC_IN));
        }
        int iZ = oc9.Z(this.c, kbcVar);
        Paint paint2 = this.g;
        paint2.setColor(iZ);
        int i = this.e;
        if (i >= 0) {
            paint2.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.a.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.a.stop();
    }

    public /* synthetic */ gph(RLottieDrawable rLottieDrawable, Integer num, Context context) {
        this(rLottieDrawable, num, context, 36, -1);
    }
}
