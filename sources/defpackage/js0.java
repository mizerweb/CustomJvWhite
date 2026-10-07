package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class js0 {
    public int a;
    public int b;
    public int[] c;
    public int d;
    public int e;
    public int f;
    public int g;

    public js0(int i, int i2, Context context) {
        this.c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        Integer numValueOf = null;
        ch3.d(context, null, i, i2);
        int[] iArr = k3e.d;
        ch3.f(context, null, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, i, i2);
        this.a = cqk.s(context, typedArrayObtainStyledAttributes, 9, dimensionPixelSize);
        this.b = Math.min(cqk.s(context, typedArrayObtainStyledAttributes, 8, 0), this.a / 2);
        this.e = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(2)) {
            TypedValue typedValueS0 = e9i.s0(context, R.attr.colorPrimary);
            if (typedValueS0 != null) {
                int i3 = typedValueS0.resourceId;
                numValueOf = Integer.valueOf(i3 != 0 ? context.getColor(i3) : typedValueS0.data);
            }
            this.c = new int[]{numValueOf != null ? numValueOf.intValue() : -1};
        } else if (typedArrayObtainStyledAttributes.peekValue(2).type != 1) {
            this.c = new int[]{typedArrayObtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(2, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                ore.p("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            this.d = typedArrayObtainStyledAttributes.getColor(7, -1);
        } else {
            this.d = this.c[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.d = qyj.o(this.d, (int) (f * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void a() {
        if (this.g >= 0) {
            return;
        }
        ore.p("indicatorTrackGapSize must be >= 0.");
    }
}
