package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class y5c extends l1c implements eph {
    public final ShapeDrawable o;
    public final eu9 p;
    public final kr3 q;
    public final LayerDrawable r;
    public final LayerDrawable s;
    public boolean t;

    public y5c(Context context) {
        super(context);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.o = shapeDrawable;
        eu9 eu9Var = new eu9(0, 0, context);
        this.p = eu9Var;
        kr3 kr3Var = new kr3();
        this.q = kr3Var;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, eu9Var});
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 40.0f);
        int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
        layerDrawable.setLayerSize(0, iK, iK);
        layerDrawable.setLayerSize(1, iK2, iK2);
        int i = (iK / 2) - (iK2 / 2);
        layerDrawable.setLayerInset(1, i, i, 0, 0);
        this.r = layerDrawable;
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{shapeDrawable, eu9Var, kr3Var});
        int iK3 = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
        int iK4 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        layerDrawable2.setLayerSize(0, iK3, iK3);
        layerDrawable2.setLayerSize(1, iK4, iK4);
        layerDrawable2.setLayerSize(2, gm0.K(yl5.d().getDisplayMetrics().density * 36.0f), gm0.K(36.0f * yl5.d().getDisplayMetrics().density));
        int i2 = (iK3 / 2) - (iK4 / 2);
        layerDrawable2.setLayerInset(1, i2, i2, 0, 0);
        layerDrawable2.setLayerInset(2, gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
        this.s = layerDrawable2;
        ((wj7) getHierarchy()).m(eve.a());
        onThemeChanged(pq3.j.h(this));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        boolean z = this.t;
        ShapeDrawable shapeDrawable = this.o;
        if (z) {
            sb8.m0(kbcVar.b().g, shapeDrawable);
        } else {
            sb8.m0(kbcVar.getIcon().h, shapeDrawable);
        }
        this.p.c(-1);
        this.q.a.setColor(-1);
    }

    public final void setCover(Uri uri) {
        this.t = uri != null;
        kbc kbcVarH = pq3.j.h(this);
        boolean z = this.t;
        ShapeDrawable shapeDrawable = this.o;
        if (z) {
            sb8.m0(kbcVarH.b().g, shapeDrawable);
        } else {
            sb8.m0(kbcVarH.getIcon().h, shapeDrawable);
        }
        l1c.j(this, v78.a(uri), null, 6);
    }

    public final void setPlaying(boolean z) {
        eu9 eu9Var = this.p;
        if (z) {
            zv8[] zv8VarArr = eu9.u;
            eu9Var.d();
            ((wj7) getHierarchy()).k(this.s);
        } else {
            zv8[] zv8VarArr2 = eu9.u;
            eu9Var.e(true);
            ((wj7) getHierarchy()).k(this.r);
        }
    }

    public final void setProgress(float f) {
        kr3 kr3Var = this.q;
        kr3Var.b = f * 3.6f;
        kr3Var.invalidateSelf();
    }
}
