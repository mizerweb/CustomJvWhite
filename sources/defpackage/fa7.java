package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
public final class fa7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha7 b;

    public /* synthetic */ fa7(ha7 ha7Var, int i) {
        this.a = i;
        this.b = ha7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ha7 ha7Var = this.b;
        switch (i) {
            case 0:
                ViewParent parent = ha7Var.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                ha7Var.a();
                View view = ha7Var.d;
                if (view.isEnabled() && !view.isLongClickable() && ha7Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    ha7Var.g = true;
                    break;
                }
                break;
        }
    }
}
