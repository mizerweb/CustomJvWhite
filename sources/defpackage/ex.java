package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ex {
    public static final long a = bj8.a(-1, -1);

    public static final long a(ViewGroup viewGroup, float f, int i, int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = ((View.MeasureSpec.getSize(i3) - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom()) - i;
        if (size2 <= 0 || f <= 0.0f) {
            return a;
        }
        int paddingEnd = viewGroup.getPaddingEnd() + viewGroup.getPaddingStart();
        int i4 = size - paddingEnd;
        float f2 = i4;
        float f3 = size2;
        if (f2 / f3 > f) {
            i4 = (int) (f3 * f);
        } else {
            size2 = (int) (f2 / f);
        }
        return bj8.a(View.MeasureSpec.makeMeasureSpec(i4 + paddingEnd, 1073741824), View.MeasureSpec.makeMeasureSpec(viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() + size2 + i, 1073741824));
    }
}
