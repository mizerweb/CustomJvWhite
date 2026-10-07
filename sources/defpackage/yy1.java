package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class yy1 extends FrameLayout {
    public final /* synthetic */ bz1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy1(bz1 bz1Var, Context context) {
        super(context, null, 0, 0);
        this.a = bz1Var;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a.getCallModeChangeManager().a().b(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.getCallModeChangeManager().a().a(motionEvent);
    }
}
