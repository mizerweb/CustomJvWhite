package defpackage;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class hlg extends FrameLayout {
    public final zo7 a;
    public rmg b;
    public tlg c;

    public hlg(Context context) {
        super(context, null);
        zo7 zo7Var = new zo7(context, 15);
        this.a = zo7Var;
        setClipToPadding(false);
        addView((l1c) zo7Var.b, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(tlg tlgVar) {
        tlg tlgVar2 = this.c;
        boolean z = true;
        if (tlgVar2 != null && tlgVar2.g == tlgVar.g && tlgVar2.h == tlgVar.h) {
            z = false;
        }
        this.c = tlgVar;
        rmg rmgVar = this.b;
        if (rmgVar != null) {
            rmgVar.b(tlgVar);
        }
        this.a.g(tlgVar.d);
        if (z) {
            requestLayout();
        }
    }

    public final rmg getSizeConfigurator() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        rmg rmgVar = this.b;
        gx gxVarA = rmgVar != null ? rmgVar.a(i, i2) : null;
        if (gxVarA != null) {
            i = gxVarA.a;
        }
        if (gxVarA != null) {
            i2 = gxVarA.b;
        }
        super.onMeasure(i, i2);
    }

    public final void setSizeConfigurator(rmg rmgVar) {
        this.b = rmgVar;
    }
}
