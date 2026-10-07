package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class ywf {
    public yab a;
    public yab b;
    public yab c;
    public yab d;
    public mt4 e;
    public mt4 f;
    public mt4 g;
    public mt4 h;
    public cy5 i;
    public cy5 j;
    public cy5 k;
    public cy5 l;

    public static r00 a(Context context, int i, int i2, f0 f0Var) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(k3e.y);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            mt4 mt4VarC = c(typedArrayObtainStyledAttributes, 5, f0Var);
            mt4 mt4VarC2 = c(typedArrayObtainStyledAttributes, 8, mt4VarC);
            mt4 mt4VarC3 = c(typedArrayObtainStyledAttributes, 9, mt4VarC);
            mt4 mt4VarC4 = c(typedArrayObtainStyledAttributes, 7, mt4VarC);
            mt4 mt4VarC5 = c(typedArrayObtainStyledAttributes, 6, mt4VarC);
            r00 r00Var = new r00();
            r00Var.r(i4, mt4VarC2);
            r00Var.u(i5, mt4VarC3);
            r00Var.o(i6, mt4VarC4);
            r00Var.l(i7, mt4VarC5);
            return r00Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static r00 b(Context context, AttributeSet attributeSet, int i, int i2) {
        f0 f0Var = new f0(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3e.u, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, f0Var);
    }

    public static mt4 c(TypedArray typedArray, int i, mt4 mt4Var) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new f0(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new rhe(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return mt4Var;
    }

    public final boolean d(RectF rectF) {
        boolean z = this.l.getClass().equals(cy5.class) && this.j.getClass().equals(cy5.class) && this.i.getClass().equals(cy5.class) && this.k.getClass().equals(cy5.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof ave) && (this.a instanceof ave) && (this.c instanceof ave) && (this.d instanceof ave));
    }
}
