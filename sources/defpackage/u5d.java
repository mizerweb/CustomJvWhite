package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class u5d extends ViewGroup {
    public static final /* synthetic */ zv8[] d;
    public final int[] a;
    public final Point b;
    public final t5d c;

    static {
        z8b z8bVar = new z8b(u5d.class, "bubbleColors", "getBubbleColors()Lone/me/sdk/design/theme/OneMeTheme$Bubbles$Colors;");
        zfe.a.getClass();
        d = new zv8[]{z8bVar};
    }

    public u5d(Context context) {
        super(context);
        this.a = new int[2];
        this.b = new Point();
        this.c = new t5d(0, this);
    }

    public final xac getBubbleColors() {
        zv8 zv8Var = d[0];
        return (xac) this.c.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int measuredHeight = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            qyj.M(childAt, 0, measuredHeight, 0, 12);
            measuredHeight += childAt.getMeasuredHeight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            childAt.measure(i, i2);
            size += childAt.getMeasuredHeight();
        }
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    public final void setBubbleColors(xac xacVar) {
        this.c.B(this, d[0], xacVar);
    }
}
