package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public final class dk7 {
    public u0 a;
    public final float b;
    public boolean c;
    public boolean d;
    public long e;
    public float f;
    public float g;

    public dk7(Context context) {
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }

    public static dk7 c(Context context) {
        return new dk7(context);
    }

    public final void a() {
        this.a = null;
        e();
    }

    public final boolean b() {
        return this.c;
    }

    public final void d(MotionEvent motionEvent) {
        u0 u0Var;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.c = true;
            this.d = true;
            this.e = motionEvent.getEventTime();
            this.f = motionEvent.getX();
            this.g = motionEvent.getY();
            return;
        }
        float f = this.b;
        if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    return;
                }
                this.c = false;
                this.d = false;
                return;
            }
            if (Math.abs(motionEvent.getX() - this.f) > f || Math.abs(motionEvent.getY() - this.g) > f) {
                this.d = false;
                return;
            }
            return;
        }
        this.c = false;
        if (Math.abs(motionEvent.getX() - this.f) > f || Math.abs(motionEvent.getY() - this.g) > f) {
            this.d = false;
        }
        if (this.d && motionEvent.getEventTime() - this.e <= ViewConfiguration.getLongPressTimeout() && (u0Var = this.a) != null) {
            if (pj6.a.h(2)) {
                pj6.e(u0.v, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(u0Var)), u0Var.j);
            }
            if (u0Var.q()) {
                u0Var.d.c++;
                wj7 wj7Var = u0Var.h;
                wj7Var.f.o(wj7Var.a);
                wj7Var.g();
                u0Var.r();
            }
        }
        this.d = false;
    }

    public final void e() {
        this.c = false;
        this.d = false;
    }

    public final void f(u0 u0Var) {
        this.a = u0Var;
    }
}
