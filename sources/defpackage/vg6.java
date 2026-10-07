package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class vg6 extends TouchDelegate {
    public boolean a;
    public final Rect b;
    public final int c;
    public final Rect d;
    public final View e;

    public vg6(Rect rect, View view) {
        super(rect, view);
        this.b = rect;
        this.e = view;
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.c = scaledTouchSlop;
        Rect rect2 = new Rect(rect);
        this.d = rect2;
        int i = -scaledTouchSlop;
        rect2.inset(i, i);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zContains;
        boolean z;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked == 0) {
            zContains = this.b.contains(x, y);
            this.a = zContains;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z = this.a;
            if (z || this.d.contains(x, y)) {
                zContains = z;
            } else {
                zContains = z;
                z2 = false;
            }
        } else if (actionMasked == 3) {
            zContains = this.a;
            this.a = false;
        } else if (actionMasked == 5 || actionMasked == 6) {
            z = this.a;
            if (z) {
                zContains = z;
            } else {
                zContains = z;
            }
        } else {
            zContains = false;
        }
        if (!zContains) {
            return false;
        }
        View view = this.e;
        if (z2) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            float f = -(this.c * 2);
            motionEvent.setLocation(f, f);
        }
        TouchDelegate touchDelegate = view.getTouchDelegate();
        view.setTouchDelegate(null);
        boolean zDispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
        view.setTouchDelegate(touchDelegate);
        return zDispatchTouchEvent;
    }
}
