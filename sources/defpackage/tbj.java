package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class tbj {
    public final Context a;
    public final ifh b;
    public final ifh c;

    public tbj(Context context) {
        this.a = context;
        final int i = 0;
        this.b = new ifh(new af7(this) { // from class: sbj
            public final /* synthetic */ tbj b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                a8g a8gVar = pq3.j;
                tbj tbjVar = this.b;
                switch (i2) {
                    case 0:
                        Context context2 = tbjVar.a;
                        Drawable drawableMutate = context2.getDrawable(R.drawable.icon_check).mutate();
                        drawableMutate.setTintList(ColorStateList.valueOf(a8gVar.k(context2).b.getIcon().i));
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setAlpha(40);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawableMutate});
                        layerDrawable.setLayerInset(1, gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        return layerDrawable;
                    default:
                        Context context3 = tbjVar.a;
                        Drawable drawableMutate2 = context3.getDrawable(R.drawable.icon_cross).mutate();
                        drawableMutate2.setTintList(ColorStateList.valueOf(a8gVar.k(context3).b.getIcon().j));
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setAlpha(40);
                        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{shapeDrawable2, drawableMutate2});
                        layerDrawable2.setLayerInset(1, gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        return layerDrawable2;
                }
            }
        });
        final int i2 = 1;
        this.c = new ifh(new af7(this) { // from class: sbj
            public final /* synthetic */ tbj b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                a8g a8gVar = pq3.j;
                tbj tbjVar = this.b;
                switch (i3) {
                    case 0:
                        Context context2 = tbjVar.a;
                        Drawable drawableMutate = context2.getDrawable(R.drawable.icon_check).mutate();
                        drawableMutate.setTintList(ColorStateList.valueOf(a8gVar.k(context2).b.getIcon().i));
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setAlpha(40);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawableMutate});
                        layerDrawable.setLayerInset(1, gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        return layerDrawable;
                    default:
                        Context context3 = tbjVar.a;
                        Drawable drawableMutate2 = context3.getDrawable(R.drawable.icon_cross).mutate();
                        drawableMutate2.setTintList(ColorStateList.valueOf(a8gVar.k(context3).b.getIcon().j));
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setAlpha(40);
                        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{shapeDrawable2, drawableMutate2});
                        layerDrawable2.setLayerInset(1, gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        return layerDrawable2;
                }
            }
        });
    }
}
