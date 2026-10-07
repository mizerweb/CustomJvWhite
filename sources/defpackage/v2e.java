package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.FrameLayout;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class v2e extends FrameLayout {
    public final int a;
    public final l1c b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public Drawable g;

    public v2e(Context context) {
        super(context);
        this.a = 40;
        l1c l1cVar = new l1c(context);
        l1cVar.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 4.0f));
        this.b = l1cVar;
        this.c = rx8.P(3, new bzb(context, 20));
        this.d = rx8.P(3, new k9d(context, 18, this));
        final int i = 0;
        this.e = rx8.P(3, new af7(this) { // from class: u2e
            public final /* synthetic */ v2e b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                a8g a8gVar = pq3.j;
                v2e v2eVar = this.b;
                switch (i2) {
                    case 0:
                        float[] fArr = new float[8];
                        for (int i3 = 0; i3 < 8; i3++) {
                            fArr[i3] = yl5.d().getDisplayMetrics().density * 4.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        sb8.m0(a8gVar.h(v2eVar).b().g, shapeDrawable);
                        a8gVar.h(v2eVar);
                        Drawable drawableMutate = v2eVar.getContext().getDrawable(R.drawable.icon_media).mutate();
                        sb8.m0(-1, drawableMutate);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawableMutate});
                        int iK = gm0.K(v2eVar.a * yl5.d().getDisplayMetrics().density);
                        layerDrawable.setLayerSize(0, iK, iK);
                        int iK2 = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                        layerDrawable.setLayerSize(1, iK2, iK2);
                        int i4 = (iK / 2) - (iK2 / 2);
                        layerDrawable.setLayerInset(1, i4, i4, 0, 0);
                        return layerDrawable;
                    default:
                        float[] fArr2 = new float[8];
                        for (int i5 = 0; i5 < 8; i5++) {
                            fArr2[i5] = yl5.d().getDisplayMetrics().density * 4.0f;
                        }
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr2, null, null));
                        sb8.m0(((xac) a8gVar.h(v2eVar).f().a).a.e, shapeDrawable2);
                        int i6 = a8gVar.h(v2eVar).getIcon().d;
                        Drawable drawableMutate2 = v2eVar.getContext().getDrawable(R.drawable.icon_eye_crossed_fill).mutate();
                        sb8.m0(i6, drawableMutate2);
                        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{shapeDrawable2, drawableMutate2});
                        int iK3 = gm0.K(v2eVar.a * yl5.d().getDisplayMetrics().density);
                        layerDrawable2.setLayerSize(0, iK3, iK3);
                        int iK4 = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                        layerDrawable2.setLayerSize(1, iK4, iK4);
                        int i7 = (iK3 / 2) - (iK4 / 2);
                        layerDrawable2.setLayerInset(1, i7, i7, 0, 0);
                        return layerDrawable2;
                }
            }
        });
        final int i2 = 1;
        this.f = rx8.P(3, new af7(this) { // from class: u2e
            public final /* synthetic */ v2e b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                a8g a8gVar = pq3.j;
                v2e v2eVar = this.b;
                switch (i3) {
                    case 0:
                        float[] fArr = new float[8];
                        for (int i4 = 0; i4 < 8; i4++) {
                            fArr[i4] = yl5.d().getDisplayMetrics().density * 4.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        sb8.m0(a8gVar.h(v2eVar).b().g, shapeDrawable);
                        a8gVar.h(v2eVar);
                        Drawable drawableMutate = v2eVar.getContext().getDrawable(R.drawable.icon_media).mutate();
                        sb8.m0(-1, drawableMutate);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawableMutate});
                        int iK = gm0.K(v2eVar.a * yl5.d().getDisplayMetrics().density);
                        layerDrawable.setLayerSize(0, iK, iK);
                        int iK2 = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                        layerDrawable.setLayerSize(1, iK2, iK2);
                        int i5 = (iK / 2) - (iK2 / 2);
                        layerDrawable.setLayerInset(1, i5, i5, 0, 0);
                        return layerDrawable;
                    default:
                        float[] fArr2 = new float[8];
                        for (int i6 = 0; i6 < 8; i6++) {
                            fArr2[i6] = yl5.d().getDisplayMetrics().density * 4.0f;
                        }
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr2, null, null));
                        sb8.m0(((xac) a8gVar.h(v2eVar).f().a).a.e, shapeDrawable2);
                        int i7 = a8gVar.h(v2eVar).getIcon().d;
                        Drawable drawableMutate2 = v2eVar.getContext().getDrawable(R.drawable.icon_eye_crossed_fill).mutate();
                        sb8.m0(i7, drawableMutate2);
                        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{shapeDrawable2, drawableMutate2});
                        int iK3 = gm0.K(v2eVar.a * yl5.d().getDisplayMetrics().density);
                        layerDrawable2.setLayerSize(0, iK3, iK3);
                        int iK4 = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                        layerDrawable2.setLayerSize(1, iK4, iK4);
                        int i8 = (iK3 / 2) - (iK4 / 2);
                        layerDrawable2.setLayerInset(1, i8, i8, 0, 0);
                        return layerDrawable2;
                }
            }
        });
        addView(l1cVar);
    }

    @Override // android.view.ViewGroup
    public final void measureChildren(int i, int i2) {
        this.b.measure(i, i2);
        ny8 ny8Var = this.d;
        if (ny8Var.d()) {
            ((View) ny8Var.getValue()).measure(i, i2);
        }
    }

    public final void setDrawOverlay(boolean z) {
        l1c l1cVar = this.b;
        if (z) {
            ((wj7) l1cVar.getHierarchy()).k((Drawable) this.e.getValue());
        } else {
            ((wj7) l1cVar.getHierarchy()).k(null);
        }
    }
}
