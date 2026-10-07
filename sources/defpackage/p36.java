package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class p36 extends gp0 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p36(int i) {
        super(25);
        this.r = i;
    }

    @Override // defpackage.gp0
    public final void m(xgh xghVar, View view, View view2, float f, Drawable drawable) {
        float fSin;
        float fCos;
        switch (this.r) {
            case 0:
                RectF rectFB = gp0.b(xghVar, view);
                RectF rectFB2 = gp0.b(xghVar, view2);
                if (rectFB.left < rectFB2.left) {
                    double d = (((double) f) * 3.141592653589793d) / 2.0d;
                    fSin = (float) (1.0d - Math.cos(d));
                    fCos = (float) Math.sin(d);
                } else {
                    double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
                    fSin = (float) Math.sin(d2);
                    fCos = (float) (1.0d - Math.cos(d2));
                }
                drawable.setBounds(lk.c((int) rectFB.left, fSin, (int) rectFB2.left), drawable.getBounds().top, lk.c((int) rectFB.right, fCos, (int) rectFB2.right), drawable.getBounds().bottom);
                break;
            default:
                if (f >= 0.5f) {
                    view = view2;
                }
                RectF rectFB3 = gp0.b(xghVar, view);
                float fB = f < 0.5f ? lk.b(1.0f, 0.0f, 0.0f, 0.5f, f) : lk.b(0.0f, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) rectFB3.left, drawable.getBounds().top, (int) rectFB3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (fB * 255.0f));
                break;
        }
    }
}
