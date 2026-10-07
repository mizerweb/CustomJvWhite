package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import defpackage.et4;
import defpackage.rq;

/* JADX INFO: loaded from: classes2.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout$ScrollingViewBehavior {
    public boolean g;

    public SearchBar$ScrollingViewBehavior() {
        this.g = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior, defpackage.ys4
    public final boolean d(et4 et4Var, View view, View view2) {
        super.d(et4Var, view, view2);
        if (!this.g && (view2 instanceof rq)) {
            this.g = true;
            rq rqVar = (rq) view2;
            rqVar.setBackgroundColor(0);
            rqVar.setTargetElevation(0.0f);
        }
        return false;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = false;
    }
}
