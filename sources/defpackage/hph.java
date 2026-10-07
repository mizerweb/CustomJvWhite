package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class hph extends DrawableWrapper implements eph, Animatable {
    public final int a;

    public hph(Drawable drawable, Context context) {
        super(drawable);
        this.a = R.attr.icon_tertiary;
        if (context != null) {
            setTint(oc9.Z(R.attr.icon_tertiary, pq3.j.e(context).m()));
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            return animatable.isRunning();
        }
        return false;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        if (!(getDrawable() instanceof eph)) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                drawable.setTint(oc9.Z(this.a, kbcVar));
                return;
            }
            return;
        }
        Object drawable2 = getDrawable();
        eph ephVar = drawable2 instanceof eph ? (eph) drawable2 : null;
        if (ephVar != null) {
            ephVar.onThemeChanged(kbcVar);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
