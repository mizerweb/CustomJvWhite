package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.widget.a;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bt {
    public final TextView a;
    public lh6 b;
    public lh6 c;
    public lh6 d;
    public lh6 e;
    public lh6 f;
    public lh6 g;
    public lh6 h;
    public final kt i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public bt(TextView textView) {
        this.a = textView;
        this.i = new kt(textView);
    }

    public static lh6 c(Context context, xr xrVar, int i) {
        ColorStateList colorStateListG;
        synchronized (xrVar) {
            colorStateListG = xrVar.a.g(context, i);
        }
        if (colorStateListG == null) {
            return null;
        }
        lh6 lh6Var = new lh6();
        lh6Var.c = true;
        lh6Var.d = colorStateListG;
        return lh6Var;
    }

    public final void a(Drawable drawable, lh6 lh6Var) {
        if (drawable == null || lh6Var == null) {
            return;
        }
        xr.d(drawable, lh6Var, this.a.getDrawableState());
    }

    public final void b() {
        lh6 lh6Var = this.b;
        TextView textView = this.a;
        if (lh6Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        lh6 lh6Var = this.h;
        if (lh6Var != null) {
            return (ColorStateList) lh6Var.d;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        lh6 lh6Var = this.h;
        if (lh6Var != null) {
            return (PorterDuff.Mode) lh6Var.e;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:224:0x0390  */
    /* JADX WARN: Code duplicated, block: B:226:0x0395  */
    /* JADX WARN: Code duplicated, block: B:229:0x039c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:230:0x039e  */
    /* JADX WARN: Code duplicated, block: B:232:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:234:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:236:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:239:? A[RETURN, SYNTHETIC] */
    public final void f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        float dimensionPixelSize;
        int iB;
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        TextView textView = this.a;
        Context context = textView.getContext();
        xr xrVarA = xr.a();
        int[] iArr = l3e.h;
        vbf vbfVarK = vbf.k(context, attributeSet, iArr, i);
        i7j.k(textView, textView.getContext(), iArr, attributeSet, (TypedArray) vbfVarK.b, i, 0);
        TypedArray typedArray = (TypedArray) vbfVarK.b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, xrVarA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, xrVarA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, xrVarA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, xrVarA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, xrVarA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, xrVarA, typedArray.getResourceId(6, 0));
        }
        vbfVarK.l();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = l3e.w;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            vbf vbfVar = new vbf(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            m(context, vbfVar);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            vbfVar.l();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        vbf vbfVar2 = new vbf(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z2 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (Build.VERSION.SDK_INT >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, vbfVar2);
        vbfVar2.l();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            zs.d(textView, string);
        }
        if (string2 != null) {
            ys.b(textView, ys.a(string2));
        }
        kt ktVar = this.i;
        Context context2 = ktVar.j;
        int[] iArr3 = l3e.i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = ktVar.i;
        i7j.k(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            ktVar.a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i2 = 0; i2 < length; i2++) {
                    iArr4[i2] = typedArrayObtainTypedArray.getDimensionPixelSize(i2, -1);
                }
                ktVar.f = kt.b(iArr4);
                ktVar.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!ktVar.j()) {
            ktVar.a = 0;
        } else if (ktVar.a == 1) {
            if (!ktVar.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                ktVar.k(dimension2, f, dimension);
            }
            ktVar.h();
        }
        if (r9j.c && ktVar.a != 0) {
            int[] iArr5 = ktVar.f;
            if (iArr5.length > 0) {
                if (zs.a(textView) != -1.0f) {
                    zs.b(textView, Math.round(ktVar.d), Math.round(ktVar.e), Math.round(ktVar.c), 0);
                } else {
                    zs.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? xrVarA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? xrVarA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? xrVarA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? xrVarA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? xrVarA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? xrVarA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = np4.l(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            ixl.g(textView, colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            ixl.h(textView, vt5.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                iB = zzl.b(typedValuePeekValue.data);
                dimensionPixelSize = TypedValue.complexToFloat(typedValuePeekValue.data);
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != -1) {
                a.b(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != -1) {
                a.c(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != -1.0f) {
                if (iB == -1) {
                    a.d(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    v4.k(textView, iB, dimensionPixelSize);
                } else {
                    a.d(textView, Math.round(TypedValue.applyDimension(iB, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        dimensionPixelSize = -1.0f;
        iB = -1;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != -1) {
            a.b(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            a.c(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (iB == -1) {
                a.d(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                v4.k(textView, iB, dimensionPixelSize);
            } else {
                a.d(textView, Math.round(TypedValue.applyDimension(iB, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, l3e.w);
        vbf vbfVar = new vbf(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, vbfVar);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            zs.d(textView, string);
        }
        vbfVar.l();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i, int i2, int i3, int i4) {
        kt ktVar = this.i;
        if (ktVar.j()) {
            DisplayMetrics displayMetrics = ktVar.j.getResources().getDisplayMetrics();
            ktVar.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (ktVar.h()) {
                ktVar.a();
            }
        }
    }

    public final void i(int[] iArr, int i) {
        kt ktVar = this.i;
        if (ktVar.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = ktVar.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                ktVar.f = kt.b(iArrCopyOf);
                if (!ktVar.i()) {
                    qr7.j(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                ktVar.g = false;
            }
            if (ktVar.h()) {
                ktVar.a();
            }
        }
    }

    public final void j(int i) {
        kt ktVar = this.i;
        if (ktVar.j()) {
            if (i == 0) {
                ktVar.a = 0;
                ktVar.d = -1.0f;
                ktVar.e = -1.0f;
                ktVar.c = -1.0f;
                ktVar.f = new int[0];
                ktVar.b = false;
                return;
            }
            if (i != 1) {
                ore.p(zo5.h(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = ktVar.j.getResources().getDisplayMetrics();
            ktVar.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (ktVar.h()) {
                ktVar.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new lh6();
        }
        lh6 lh6Var = this.h;
        lh6Var.d = colorStateList;
        lh6Var.c = colorStateList != null;
        this.b = lh6Var;
        this.c = lh6Var;
        this.d = lh6Var;
        this.e = lh6Var;
        this.f = lh6Var;
        this.g = lh6Var;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new lh6();
        }
        lh6 lh6Var = this.h;
        lh6Var.e = mode;
        lh6Var.b = mode != null;
        this.b = lh6Var;
        this.c = lh6Var;
        this.d = lh6Var;
        this.e = lh6Var;
        this.f = lh6Var;
        this.g = lh6Var;
    }

    public final void m(Context context, vbf vbfVar) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) vbfVar.b;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceH = vbfVar.h(i5, this.j, new ws(this, i6, i7, new WeakReference(this.a)));
                if (typefaceH != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = typefaceH;
                    } else {
                        this.l = at.a(Typeface.create(typefaceH, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = at.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
