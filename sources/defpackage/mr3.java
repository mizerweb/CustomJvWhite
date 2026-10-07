package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class mr3 extends js0 {
    public int h;
    public int i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr3(Context context) {
        super(R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, context);
        int i = lr3.m;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        ch3.d(context, null, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = k3e.i;
        ch3.f(context, null, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        this.h = Math.max(cqk.s(context, typedArrayObtainStyledAttributes, 2, dimensionPixelSize), this.a * 2);
        this.i = cqk.s(context, typedArrayObtainStyledAttributes, 1, dimensionPixelSize2);
        this.j = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        a();
    }
}
