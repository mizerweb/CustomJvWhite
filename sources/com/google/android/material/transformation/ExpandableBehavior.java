package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.et4;
import defpackage.i7j;
import defpackage.ys4;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ExpandableBehavior extends ys4 {
    public ExpandableBehavior() {
    }

    @Override // defpackage.ys4
    public abstract boolean b(View view, View view2);

    @Override // defpackage.ys4
    public final boolean d(et4 et4Var, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.ys4
    public final boolean h(et4 et4Var, View view, int i) {
        WeakHashMap weakHashMap = i7j.a;
        if (!view.isLaidOut()) {
            List listD = et4Var.d(view);
            int size = listD.size();
            for (int i2 = 0; i2 < size; i2++) {
                b(view, (View) listD.get(i2));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
