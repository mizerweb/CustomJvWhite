package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class w8j extends RecyclerView {
    public final /* synthetic */ y8j j2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8j(y8j y8jVar, Context context) {
        super(context);
        this.j2 = y8jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.j2.t.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        y8j y8jVar = this.j2;
        accessibilityEvent.setFromIndex(y8jVar.d);
        accessibilityEvent.setToIndex(y8jVar.d);
        accessibilityEvent.setSource((y8j) y8jVar.t.a);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.j2.r && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.j2.r && super.onTouchEvent(motionEvent);
    }
}
