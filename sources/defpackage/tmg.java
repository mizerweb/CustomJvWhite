package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.widget.FrameLayout;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class tmg extends s7g {
    public final int A;
    public final int B;
    public co2 C;
    public final Context u;
    public final ShapeDrawable v;
    public final kbc w;
    public LayerDrawable x;
    public final int y;
    public final int z;

    public tmg(Context context, ShapeDrawable shapeDrawable, nv4 nv4Var, kbc kbcVar) {
        l1c l1cVar = new l1c(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 36.0f), gm0.K(36.0f * yl5.d().getDisplayMetrics().density));
        int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        l1cVar.setPadding(iK, iK, iK, iK);
        l1cVar.setLayoutParams(layoutParams);
        ((wj7) l1cVar.getHierarchy()).h(i1f.m);
        super(l1cVar);
        this.u = context;
        this.v = shapeDrawable;
        this.w = kbcVar;
        this.y = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        this.z = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        this.A = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        this.B = gm0.K(14.0f * yl5.d().getDisplayMetrics().density);
        n1g.N(new zu(this, (lq4) null, 13), l1cVar);
        qe7.H(l1cVar, 300L, new jvf(this, 8, nv4Var));
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        co2 co2Var = (co2) k79Var;
        this.C = co2Var;
        omg omgVar = co2Var.b;
        String str = omgVar.c;
        Integer num = co2Var.d;
        View view = this.a;
        if (str != null && str.length() != 0) {
            ((l1c) view).setImageURI(str);
        } else if (num != null) {
            ((l1c) view).setImageResource(num.intValue());
        }
        I(omgVar.g);
        H(omgVar.f);
    }

    public final void H(int i) {
        View view = this.a;
        if (i != 5) {
            ((wj7) ((l1c) view).getHierarchy()).k(null);
            return;
        }
        if (this.x == null) {
            this.x = J();
        }
        ((wj7) ((l1c) view).getHierarchy()).k(this.x);
    }

    public final void I(boolean z) {
        View view = this.a;
        if (z) {
            ((l1c) view).setBackground(this.v);
        } else {
            ((l1c) view).setBackground(null);
        }
        co2 co2Var = this.C;
        if ((co2Var != null ? co2Var.d : null) == null) {
            ((l1c) view).setImageTintList(null);
            return;
        }
        l1c l1cVar = (l1c) view;
        dbc icon = K().getIcon();
        l1cVar.setImageTintList(ColorStateList.valueOf(z ? icon.b : icon.d));
    }

    public final LayerDrawable J() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        sb8.m0(K().h().b, shapeDrawable);
        Drawable drawable = ((l1c) this.a).getContext().getDrawable(R.drawable.icon_plus_mini);
        sb8.m0(K().getIcon().c, drawable);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawable});
        int i = this.z;
        layerDrawable.setLayerSize(0, i, i);
        int i2 = this.y;
        layerDrawable.setLayerSize(1, i2, i2);
        int i3 = this.B;
        layerDrawable.setLayerInset(0, i3, i3, 0, 0);
        int i4 = this.A;
        layerDrawable.setLayerInset(1, i4, i4, 0, 0);
        return layerDrawable;
    }

    public final kbc K() {
        kbc kbcVar = this.w;
        return kbcVar == null ? pq3.j.e(this.u).m() : kbcVar;
    }
}
