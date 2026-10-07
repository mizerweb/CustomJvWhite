package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class f4e extends LayerDrawable implements Animatable {
    public final sj a;

    public f4e(Context context) {
        super(new Drawable[0]);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(pq3.j.k(context).b.h().a);
        int iAddLayer = addLayer(shapeDrawable);
        sj sjVarA = sj.a(context, R.drawable.avd_handup);
        this.a = sjVarA;
        int iAddLayer2 = addLayer(sjVarA);
        setLayerSize(iAddLayer, gm0.K(yl5.d().getDisplayMetrics().density * 48.0f), gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
        setLayerGravity(iAddLayer, 17);
        setLayerSize(iAddLayer2, gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
        setLayerGravity(iAddLayer2, 17);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        sj sjVar = this.a;
        return sjVar != null && sjVar.isRunning();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setHotspot(rect.centerX(), rect.centerY());
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        sj sjVar = this.a;
        if (sjVar != null) {
            sjVar.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        sj sjVar = this.a;
        if (sjVar != null) {
            sjVar.stop();
        }
    }
}
