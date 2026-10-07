package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.et4;
import defpackage.ou7;
import defpackage.vn7;

/* JADX INFO: loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final ou7 h;

    public BaseTransientBottomBar$Behavior() {
        ou7 ou7Var = new ou7(17);
        this.e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.d = 0;
        this.h = ou7Var;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.ys4
    public final boolean g(et4 et4Var, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (vn7.d == null) {
                    vn7.d = new vn7(29);
                }
                synchronized (vn7.d.b) {
                }
            }
        } else if (et4Var.l(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (vn7.d == null) {
                vn7.d = new vn7(29);
            }
            synchronized (vn7.d.b) {
            }
        }
        return super.g(et4Var, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean s() {
        this.h.getClass();
        return false;
    }
}
