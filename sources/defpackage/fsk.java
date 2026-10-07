package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fsk {
    public static ObjectAnimator a(View view, Property property, float f, float f2, long j, long j2, boolean z, int i) {
        if ((i & 8) != 0) {
            j = 0;
        }
        if ((i & 16) != 0) {
            j2 = 0;
        }
        int i2 = (i & 32) != 0 ? 1 : 2;
        int i3 = (i & 64) != 0 ? 0 : -1;
        if ((i & np0.m) != 0) {
            z = false;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f, f2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setRepeatMode(i2);
        objectAnimatorOfFloat.setRepeatCount(i3);
        if (z) {
            objectAnimatorOfFloat.addListener(new bk(property, view, f2));
        }
        return objectAnimatorOfFloat;
    }

    public static oba b(int i) {
        Object next;
        y1 y1Var = new y1(0, oba.g);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
        } while (((oba) next).a != i);
        oba obaVar = (oba) next;
        return obaVar == null ? oba.INTERVAL : obaVar;
    }

    public static final c79 c(View view, float f, float f2, long j, long j2) {
        c79 c79VarW = yab.w();
        c79VarW.add(a(view, View.SCALE_X, f, f2, j, j2, false, 224));
        c79VarW.add(a(view, View.SCALE_Y, f, f2, j, j2, false, 224));
        return yab.j(c79VarW);
    }
}
