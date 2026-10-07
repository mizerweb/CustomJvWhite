package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import java.util.Arrays;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class anl {
    public static final LayerDrawable a(Context context, int i) {
        kbc kbcVarM = pq3.j.e(context).m();
        int i2 = kbcVarM.getIcon().c;
        Drawable drawableMutate = context.getDrawable(R.drawable.icon_chevron_down_mini).mutate();
        sb8.m0(i2, drawableMutate);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setIntrinsicWidth(i);
        shapeDrawable.setIntrinsicHeight(i);
        shapeDrawable.setTint(kbcVarM.h().b);
        int iK = (i - gm0.K(16.0f * yl5.d().getDisplayMetrics().density)) / 2;
        int iK2 = (i - gm0.K(12.0f * yl5.d().getDisplayMetrics().density)) / 2;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawableMutate});
        layerDrawable.setLayerInset(1, iK, iK2, iK, iK2);
        return layerDrawable;
    }

    public static final int b(int i) {
        if (i == 0) {
            return 0;
        }
        return Color.parseColor(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1)));
    }

    public static final int c(int i) {
        return i | (-16777216);
    }
}
