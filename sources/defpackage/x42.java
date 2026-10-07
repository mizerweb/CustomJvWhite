package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x42 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g52 b;

    public /* synthetic */ x42(g52 g52Var, int i) {
        this.a = i;
        this.b = g52Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        a8g a8gVar = pq3.j;
        g52 g52Var = this.b;
        switch (i) {
            case 0:
                return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{a8gVar.l(g52Var).b.b().g, 0, 0});
            case 1:
                af7 af7Var = g52Var.G1;
                if (af7Var != null) {
                    return (lxi) af7Var.invoke();
                }
                return null;
            default:
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(a8gVar.l(g52Var).b.b().c);
                return shapeDrawable;
        }
    }
}
