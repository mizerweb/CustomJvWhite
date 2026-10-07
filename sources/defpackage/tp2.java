package defpackage;

import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class tp2 extends FrameLayout implements fr4 {
    public int a;

    @Override // defpackage.fr4
    public final void W0(br4 br4Var, br4 br4Var2, boolean z) {
        this.a--;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a > 0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // defpackage.fr4
    public final void w(br4 br4Var, br4 br4Var2, boolean z) {
        this.a++;
    }
}
