package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class b1g extends LayerDrawable implements Animatable, eph {
    public static final /* synthetic */ zv8[] i;
    public final Context a;
    public final int b;
    public final a1g c;
    public final int d;
    public int e;
    public int f;
    public final boolean g;
    public final qj0 h;

    static {
        z8b z8bVar = new z8b(b1g.class, "backgroundColorRes", "getBackgroundColorRes()I");
        zfe.a.getClass();
        i = new zv8[]{z8bVar};
    }

    public b1g(Context context) {
        super(new Drawable[0]);
        this.a = context;
        a1g a1gVar = new a1g(context);
        this.c = a1gVar;
        this.e = gm0.K(80.0f * yl5.d().getDisplayMetrics().density);
        this.f = -1;
        this.g = lvb.w0(context).compareTo(pk5.AVERAGE) >= 0;
        this.h = new qj0(Integer.valueOf(R.attr.background_primary), this);
        Drawable colorDrawable = new ColorDrawable();
        colorDrawable.setCallback(this);
        int iAddLayer = addLayer(colorDrawable);
        this.b = iAddLayer;
        setLayerGravity(iAddLayer, 119);
        int iAddLayer2 = addLayer(a1gVar);
        this.d = iAddLayer2;
        a1gVar.setCallback(this);
        setLayerGravity(iAddLayer2, 17);
        onThemeChanged(pq3.j.e(context).m());
    }

    public final void a(int i2, Rect rect) {
        Drawable drawable = getDrawable(this.d);
        int intrinsicHeight = (drawable != null ? drawable.getIntrinsicHeight() : 0) / 2;
        setLayerInset(this.d, 0, i2 - intrinsicHeight, 0, rect.height() - (i2 + intrinsicHeight));
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c.getAlpha();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(drawable);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.g && this.c.isRunning();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int iMin = Math.min(rect.width() - (this.e * 2), rect.height() - (this.e * 2));
        setLayerSize(this.d, iMin, iMin);
        int i2 = this.f;
        if (i2 > 0) {
            a(i2, rect);
        }
        this.c.setBounds(new Rect(0, 0, iMin, iMin));
        super.onBoundsChange(rect);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.c.onThemeChanged(kbcVar);
        ColorDrawable colorDrawable = (ColorDrawable) getDrawable(this.b);
        zv8 zv8Var = i[0];
        colorDrawable.setColor(oc9.Z(((Number) this.h.b).intValue(), kbcVar));
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        super.setAlpha(i2);
        this.c.setAlpha(i2);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (z) {
            start();
        } else {
            stop();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.g) {
            this.c.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.g) {
            this.c.stop();
        }
    }
}
