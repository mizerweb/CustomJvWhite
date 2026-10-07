package defpackage;

import android.util.Size;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class rmg {
    public final View a;
    public int b;
    public final gx c;
    public tlg d;

    public rmg(View view) {
        this.a = view;
        gx gxVar = new gx();
        gxVar.a = 0;
        gxVar.b = 0;
        this.c = gxVar;
    }

    public final gx a(int i, int i2) {
        tlg tlgVar = this.d;
        gx gxVar = this.c;
        if (tlgVar == null) {
            gxVar.a = i;
            gxVar.b = i2;
            return gxVar;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size2 = -1;
        }
        View view = this.a;
        Size sizeA = prl.a(tlgVar, size, view.getPaddingRight() + view.getPaddingLeft(), view.getPaddingBottom() + view.getPaddingTop(), size2);
        gxVar.a = View.MeasureSpec.makeMeasureSpec(sizeA.getWidth(), 1073741824);
        gxVar.b = View.MeasureSpec.makeMeasureSpec(sizeA.getHeight(), 1073741824);
        return gxVar;
    }

    public final void b(tlg tlgVar) {
        this.d = tlgVar;
        c();
    }

    public final void c() {
        this.b = gm0.K(yl5.d().getDisplayMetrics().density * 170.0f);
        gm0.K(170.0f * yl5.d().getDisplayMetrics().density);
    }
}
