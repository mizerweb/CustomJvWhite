package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.cca;
import defpackage.rca;
import defpackage.vbf;
import defpackage.xba;
import defpackage.yba;

/* JADX INFO: loaded from: classes2.dex */
public final class ExpandedMenuView extends ListView implements xba, rca, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public yba a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        vbf vbfVarK = vbf.k(context, attributeSet, b, i);
        TypedArray typedArray = (TypedArray) vbfVarK.b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(vbfVarK.d(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(vbfVarK.d(1));
        }
        vbfVarK.l();
    }

    @Override // defpackage.rca
    public final void a(yba ybaVar) {
        this.a = ybaVar;
    }

    @Override // defpackage.xba
    public final boolean b(cca ccaVar) {
        return this.a.r(ccaVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        b((cca) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
