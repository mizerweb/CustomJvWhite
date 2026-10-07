package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import one.me.pinbars.PinBarsWidget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qzc implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PinBarsWidget b;

    public /* synthetic */ qzc(PinBarsWidget pinBarsWidget, int i) {
        this.a = i;
        this.b = pinBarsWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        szc szcVarValueOf;
        int i = this.a;
        a8g a8gVar = pq3.j;
        PinBarsWidget pinBarsWidget = this.b;
        switch (i) {
            case 0:
                ozc ozcVar = (ozc) pinBarsWidget.b.getAccessor().c(929);
                kzc kzcVar = (kzc) pinBarsWidget.f.getValue();
                vv vvVar = pinBarsWidget.a;
                zv8 zv8Var = PinBarsWidget.z[0];
                String str = (String) vvVar.a(pinBarsWidget);
                if (str == null || (szcVarValueOf = szc.valueOf(str)) == null) {
                    szcVarValueOf = szc.d;
                }
                return new nzc(kzcVar, szcVarValueOf, ozcVar.a, ozcVar.b, ozcVar.c, ozcVar.d, ozcVar.e, ozcVar.f, ozcVar.g, ozcVar.h, ozcVar.i, ozcVar.j, ozcVar.k, ozcVar.l, ozcVar.m, ozcVar.n, ozcVar.o, ozcVar.p, ozcVar.q, ozcVar.r, ozcVar.s, ozcVar.t, ozcVar.u, ozcVar.v, ozcVar.w, ozcVar.x, ozcVar.y, ozcVar.z, ozcVar.A, ozcVar.B, ozcVar.C, ozcVar.D, ozcVar.E, ozcVar.F, ozcVar.G, ozcVar.H, ozcVar.I, ozcVar.J, ozcVar.K, ozcVar.L);
            case 1:
                return vd7.o(pinBarsWidget.c, new ifh(new rzc(pinBarsWidget, 1)), pinBarsWidget);
            case 2:
                zv8[] zv8VarArr = PinBarsWidget.z;
                int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                float[] fArr = new float[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    fArr[i2] = yl5.d().getDisplayMetrics().density * 24.0f;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                shapeDrawable.getPaint().setColor(a8gVar.e(pinBarsWidget.getContext()).m().B().b);
                shapeDrawable.setIntrinsicHeight(gm0.J(((double) yl5.d().getDisplayMetrics().density) * 0.5d));
                return new InsetDrawable((Drawable) shapeDrawable, iK, 0, iK, 0);
            default:
                zv8[] zv8VarArr2 = PinBarsWidget.z;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RectShape());
                shapeDrawable2.getPaint().setColor(a8gVar.e(pinBarsWidget.getContext()).m().B().b);
                shapeDrawable2.setIntrinsicHeight(gm0.J(((double) yl5.d().getDisplayMetrics().density) * 0.5d));
                return shapeDrawable2;
        }
    }
}
