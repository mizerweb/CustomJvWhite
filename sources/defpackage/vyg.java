package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class vyg extends FrameLayout {
    public final qni a;
    public final rea b;
    public final boolean c;
    public final int[] d;
    public final u8b e;

    public vyg(Context context, int i, qni qniVar, rea reaVar, boolean z) {
        super(context);
        this.a = qniVar;
        this.b = reaVar;
        this.c = z;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = View.generateViewId();
        }
        this.d = iArr;
        this.e = new u8b();
    }

    public static void a(uyg uygVar) {
        uygVar.b = null;
        View view = uygVar.a;
        view.clearFocus();
        view.setPressed(false);
        view.setVisibility(8);
        view.setClickable(false);
        view.setFocusable(false);
        view.setContentDescription(null);
        view.setBackground(null);
        view.setRotation(0.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        dy8 dy8VarB;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size > 0 && size2 > 0) {
            u8b u8bVar = this.e;
            Object[] objArr = u8bVar.a;
            int i3 = u8bVar.b;
            for (int i4 = 0; i4 < i3; i4++) {
                uyg uygVar = (uyg) objArr[i4];
                ryg rygVar = uygVar.b;
                View view = uygVar.a;
                if (rygVar != null && (dy8VarB = rygVar.b()) != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                    float f = size;
                    int iK = gm0.K(dy8VarB.c * f);
                    if (iK < 1) {
                        iK = 1;
                    }
                    layoutParams.width = iK;
                    float f2 = size2;
                    int iK2 = gm0.K(dy8VarB.d * f2);
                    layoutParams.height = iK2 >= 1 ? iK2 : 1;
                    layoutParams.leftMargin = gm0.K((dy8VarB.a * f) - (layoutParams.width / 2.0f));
                    layoutParams.topMargin = gm0.K((dy8VarB.b * f2) - (layoutParams.height / 2.0f));
                    view.setRotation(dy8VarB.e);
                }
            }
        }
        super.onMeasure(i, i2);
    }
}
