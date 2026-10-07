package one.me.sdk.gallery.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import defpackage.b43;
import defpackage.gm0;
import defpackage.j95;
import defpackage.yl5;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatMediaRowLayout extends FrameLayout {
    public /* synthetic */ ChatMediaRowLayout(Context context, AttributeSet attributeSet, int i, j95 j95Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        WindowInsets rootWindowInsets;
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getRootView().getMeasuredWidth();
        View rootView = getRootView();
        Rect rect = null;
        if (rootView != null && (rootWindowInsets = rootView.getRootWindowInsets()) != null) {
            rect = new Rect(rootWindowInsets.getStableInsetLeft(), rootWindowInsets.getStableInsetTop(), rootWindowInsets.getStableInsetRight(), rootWindowInsets.getStableInsetBottom());
        }
        if (rect != null) {
            measuredWidth -= rect.left + rect.right;
        }
        int iK = (measuredWidth - (gm0.K(3.0f * yl5.d().getDisplayMetrics().density) * 2)) / 3;
        if (iK < size) {
            i = View.MeasureSpec.makeMeasureSpec(iK, 1073741824);
        }
        super.onMeasure(i, i);
    }

    public final void setListener(b43 b43Var) {
    }

    public ChatMediaRowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChatMediaRowLayout(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
