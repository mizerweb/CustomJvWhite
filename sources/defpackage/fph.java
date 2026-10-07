package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.DrawableWrapper;
import one.me.rlottie.RLottieDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class fph extends DrawableWrapper implements eph, Animatable {
    public final RLottieDrawable a;
    public final int b;
    public final Paint c;

    public fph(RLottieDrawable rLottieDrawable, Context context) {
        pq3 pq3VarE;
        super(rLottieDrawable);
        this.a = rLottieDrawable;
        this.b = R.attr.icon_themed;
        Paint paint = new Paint(1);
        paint.setColorFilter(new PorterDuffColorFilter((context == null || (pq3VarE = pq3.j.e(context)) == null) ? 0 : oc9.Z(R.attr.icon_themed, pq3VarE.m()), PorterDuff.Mode.SRC_IN));
        this.c = paint;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.a.draw(canvas, this.c);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.a.isRunning();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.c.setColorFilter(new PorterDuffColorFilter(oc9.Z(this.b, kbcVar), PorterDuff.Mode.SRC_IN));
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
}
