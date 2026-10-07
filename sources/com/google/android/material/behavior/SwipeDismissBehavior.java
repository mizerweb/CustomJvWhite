package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import defpackage.et4;
import defpackage.i1m;
import defpackage.i7j;
import defpackage.j7j;
import defpackage.leh;
import defpackage.s4;
import defpackage.ys4;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends ys4 {
    public j7j a;
    public boolean b;
    public boolean c;
    public int d = 2;
    public float e = 0.0f;
    public float f = 0.5f;
    public final leh g = new leh(this);

    @Override // defpackage.ys4
    public boolean g(et4 et4Var, View view, MotionEvent motionEvent) {
        boolean zL = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zL = et4Var.l(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = zL;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b = false;
        }
        if (zL) {
            if (this.a == null) {
                this.a = new j7j(et4Var.getContext(), et4Var, this.g);
            }
            if (!this.c && this.a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ys4
    public final boolean h(et4 et4Var, View view, int i) {
        WeakHashMap weakHashMap = i7j.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            i7j.i(view, 1048576);
            i7j.g(view, 0);
            if (s()) {
                i7j.j(view, s4.j, new i1m(this));
            }
        }
        return false;
    }

    @Override // defpackage.ys4
    public final boolean r(et4 et4Var, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.j(motionEvent);
        return true;
    }

    public boolean s() {
        return true;
    }
}
