package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public final class ahd {
    public final ua3 a;
    public n61 b;
    public n61 c;
    public final int d;
    public final int e = ViewConfiguration.getLongPressTimeout();
    public long f = qx6.a(0.0f, 0.0f);
    public boolean g = true;
    public boolean h;
    public boolean i;

    public ahd(Context context, ua3 ua3Var) {
        this.a = ua3Var;
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final void a(MotionEvent motionEvent) {
        if (!this.a.getAsBoolean()) {
            this.g = true;
            this.h = false;
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f = qx6.a(motionEvent.getX(), motionEvent.getY());
            this.g = true;
            n61 n61Var = this.b;
            this.h = n61Var != null ? ((Boolean) n61Var.invoke(motionEvent)).booleanValue() : false;
            this.i = false;
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked != 3) {
                return;
            }
            this.g = false;
            return;
        }
        long j = this.f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (!this.g || ((float) Math.hypot(motionEvent.getX() - fIntBitsToFloat, motionEvent.getY() - fIntBitsToFloat2)) <= this.d) {
            return;
        }
        this.g = false;
    }

    public final boolean b(MotionEvent motionEvent) {
        n61 n61Var;
        if (!this.a.getAsBoolean() || motionEvent.getActionMasked() != 1 || !this.g || this.h) {
            return false;
        }
        if (!this.i) {
            this.i = true;
            if (motionEvent.getEventTime() - motionEvent.getDownTime() < this.e && (n61Var = this.c) != null) {
                n61Var.invoke(motionEvent);
            }
        }
        return true;
    }
}
