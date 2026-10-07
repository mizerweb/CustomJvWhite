package defpackage;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes3.dex */
public final class nmd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ ScrollView c;

    public /* synthetic */ nmd(LinearLayout linearLayout, ScrollView scrollView, int i) {
        this.a = i;
        this.b = linearLayout;
        this.c = scrollView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ScrollView scrollView = this.c;
        LinearLayout linearLayout = this.b;
        switch (i) {
            case 0:
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                scrollView.setPadding(scrollView.getPaddingLeft(), scrollView.getPaddingTop(), scrollView.getPaddingRight(), linearLayout.getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
                break;
            default:
                ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null);
                scrollView.setPadding(scrollView.getPaddingLeft(), scrollView.getPaddingTop(), scrollView.getPaddingRight(), zo5.b(12.0f, yl5.d().getDisplayMetrics().density, linearLayout.getMeasuredHeight() + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0)));
                break;
        }
    }
}
