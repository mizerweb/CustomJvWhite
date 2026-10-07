package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class o2d extends LayerDrawable implements eph {
    public final Context a;
    public final int b;
    public final int c;

    public o2d(Context context) {
        super(new Drawable[0]);
        this.a = context;
        int iAddLayer = addLayer(new ShapeDrawable(new OvalShape()));
        this.b = iAddLayer;
        int iAddLayer2 = addLayer(col.c(-16777216, context.getDrawable(R.drawable.icon_play_fill), null, 4));
        this.c = iAddLayer2;
        setLayerSize(iAddLayer, gm0.K(yl5.d().getDisplayMetrics().density * 44.0f), gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
        setLayerGravity(iAddLayer, 17);
        setLayerSize(iAddLayer2, gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        setLayerGravity(iAddLayer2, 17);
        onThemeChanged(pq3.j.e(context).m());
    }

    public final void a() {
        Context context = this.a;
        setDrawable(this.c, col.c(-16777216, context.getDrawable(R.drawable.icon_download), null, 4));
        onThemeChanged(pq3.j.e(context).m());
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setHotspot(rect.centerX(), rect.centerY());
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        Paint paint = ((ShapeDrawable) getDrawable(this.b)).getPaint();
        a8g a8gVar = pq3.j;
        Context context = this.a;
        paint.setColor(a8gVar.e(context).m().h().i);
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable(this.c);
        rippleDrawable.setColor(ColorStateList.valueOf(a8gVar.e(context).m().h().i));
        Drawable drawable = rippleDrawable.getDrawable(0);
        a8gVar.e(context).m();
        drawable.setTint(-1);
    }
}
