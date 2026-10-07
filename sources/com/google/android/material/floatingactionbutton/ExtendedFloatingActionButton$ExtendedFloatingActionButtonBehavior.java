package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.bt4;
import defpackage.et4;
import defpackage.k3e;
import defpackage.ys4;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends ys4 {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3e.l);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.ys4
    public final /* synthetic */ boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // defpackage.ys4
    public final void c(bt4 bt4Var) {
        if (bt4Var.h == 0) {
            bt4Var.h = 80;
        }
    }

    @Override // defpackage.ys4
    public final boolean d(et4 et4Var, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // defpackage.ys4
    public final boolean h(et4 et4Var, View view, int i) {
        throw new ClassCastException();
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }
}
