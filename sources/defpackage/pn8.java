package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class pn8 extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ rn8 b;

    public pn8(rn8 rn8Var) {
        this.b = rn8Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewN;
        rn8 rn8Var = this.b;
        qn8 qn8Var = rn8Var.m;
        if (!this.a || (viewN = rn8Var.n(motionEvent)) == null || rn8Var.r.S(viewN) == null) {
            return;
        }
        RecyclerView recyclerView = rn8Var.r;
        int i = qn8Var.d;
        int i2 = qn8Var.c;
        int i3 = (i << 16) | (i2 << 8) | i2 | i;
        WeakHashMap weakHashMap = i7j.a;
        if ((qn8.c(i3, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i4 = rn8Var.l;
            if (pointerId == i4) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i4);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                rn8Var.d = x;
                rn8Var.e = y;
                rn8Var.i = 0.0f;
                rn8Var.h = 0.0f;
                qn8Var.getClass();
            }
        }
    }
}
