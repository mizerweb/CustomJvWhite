package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes2.dex */
public final class el2 extends NestedScrollView {
    public final /* synthetic */ fl2 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el2(Context context, fl2 fl2Var) {
        super(context);
        this.F = fl2Var;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.F.getPanelState() != dl2.c) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
