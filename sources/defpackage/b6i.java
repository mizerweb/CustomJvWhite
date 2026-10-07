package defpackage;

import android.view.ViewGroup;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes3.dex */
public final class b6i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rcc b;
    public final /* synthetic */ ScrollView c;

    public /* synthetic */ b6i(rcc rccVar, ScrollView scrollView, int i) {
        this.a = i;
        this.b = rccVar;
        this.c = scrollView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i = this.a;
        ScrollView scrollView = this.c;
        rcc rccVar = this.b;
        switch (i) {
            case 0:
                ViewGroup.LayoutParams layoutParams = rccVar.getLayoutParams();
                marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                scrollView.setPadding(scrollView.getPaddingLeft(), rccVar.getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0), scrollView.getPaddingRight(), scrollView.getPaddingBottom());
                break;
            case 1:
                ViewGroup.LayoutParams layoutParams2 = rccVar.getLayoutParams();
                marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                scrollView.setPadding(scrollView.getPaddingLeft(), rccVar.getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0), scrollView.getPaddingRight(), scrollView.getPaddingBottom());
                break;
            default:
                ViewGroup.LayoutParams layoutParams3 = rccVar.getLayoutParams();
                marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                scrollView.setPadding(scrollView.getPaddingLeft(), rccVar.getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0), scrollView.getPaddingRight(), scrollView.getPaddingBottom());
                break;
        }
    }
}
