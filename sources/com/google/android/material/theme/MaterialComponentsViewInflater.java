package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.br;
import defpackage.ch3;
import defpackage.cqk;
import defpackage.cr;
import defpackage.e9i;
import defpackage.er;
import defpackage.fo9;
import defpackage.fs;
import defpackage.ho9;
import defpackage.k3e;
import defpackage.nt;
import defpackage.oo9;
import defpackage.p90;
import defpackage.vn9;
import defpackage.zn9;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends nt {
    @Override // defpackage.nt
    public final br a(Context context, AttributeSet attributeSet) {
        return new vn9(context, attributeSet);
    }

    @Override // defpackage.nt
    public final cr b(Context context, AttributeSet attributeSet) {
        return new zn9(context, attributeSet);
    }

    @Override // defpackage.nt
    public final er c(Context context, AttributeSet attributeSet) {
        return new fo9(context, attributeSet);
    }

    @Override // defpackage.nt
    public final fs d(Context context, AttributeSet attributeSet) {
        ho9 ho9Var = new ho9(p90.T(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, 0);
        Context context2 = ho9Var.getContext();
        TypedArray typedArrayB = ch3.B(context2, attributeSet, k3e.t, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayB.hasValue(0)) {
            ho9Var.setButtonTintList(cqk.r(context2, typedArrayB, 0));
        }
        ho9Var.f = typedArrayB.getBoolean(1, false);
        typedArrayB.recycle();
        return ho9Var;
    }

    @Override // defpackage.nt
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        oo9 oo9Var = new oo9(p90.T(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = oo9Var.getContext();
        if (e9i.t0(R.attr.textAppearanceLineHeightEnabled, context2, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = k3e.w;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int iS = -1;
            for (int i = 0; i < 2 && iS < 0; i++) {
                iS = cqk.s(context2, typedArrayObtainStyledAttributes, iArr2[i], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iS == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, k3e.v);
                    Context context3 = oo9Var.getContext();
                    int[] iArr3 = {1, 2};
                    int iS2 = -1;
                    for (int i2 = 0; i2 < 2 && iS2 < 0; i2++) {
                        iS2 = cqk.s(context3, typedArrayObtainStyledAttributes3, iArr3[i2], -1);
                    }
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iS2 >= 0) {
                        oo9Var.setLineHeight(iS2);
                    }
                }
            }
        }
        return oo9Var;
    }
}
