package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class qm0 extends FrameLayout {
    public final int a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public y8j f;
    public boolean g;
    public y8j h;

    public qm0(Context context) {
        super(context);
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.g = true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        y8j y8jVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            y8j y8jVar2 = this.f;
            if (y8jVar2 != null) {
                y8jVar2.b();
            }
            this.f = null;
            this.e = false;
            this.b = motionEvent.getX();
            this.c = motionEvent.getY();
            this.d = motionEvent.getX();
            return false;
        }
        if (actionMasked == 2) {
            if (this.e) {
                return true;
            }
            if (!this.g) {
                float x = motionEvent.getX() - this.b;
                float y = motionEvent.getY() - this.c;
                if (Math.abs(x) > this.a && Math.abs(x) > Math.abs(y) && (y8jVar = this.h) != null && y8jVar.getVisibility() == 0 && y8jVar.a()) {
                    this.e = true;
                    this.f = y8jVar;
                    this.d = motionEvent.getX();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.e) {
            return false;
        }
        y8j y8jVar = this.f;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (y8jVar != null) {
                    y8jVar.c(motionEvent.getX() - this.d);
                }
                this.d = motionEvent.getX();
                return true;
            }
            if (actionMasked != 3) {
                return true;
            }
        }
        if (y8jVar != null) {
            y8jVar.b();
        }
        this.f = null;
        this.e = false;
        return true;
    }

    public final void setBackgroundViewPager(y8j y8jVar) {
        this.h = y8jVar;
    }

    public final void setSwipeBlocked(boolean z) {
        this.g = z;
    }
}
