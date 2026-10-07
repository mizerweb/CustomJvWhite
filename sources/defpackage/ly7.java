package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class ly7 implements View.OnTouchListener {
    public final w09 a;
    public final mp5 b;
    public final int c;
    public sgg d;
    public boolean e;
    public float f;
    public float g;

    public ly7(w09 w09Var, int i, mp5 mp5Var) {
        this.a = w09Var;
        this.b = mp5Var;
        this.c = i * i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) throws IllegalAccessException, InvocationTargetException {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        lq4 lq4Var = null;
        if (action == 0) {
            if (view != null) {
                view.setPressed(true);
            }
            this.f = motionEvent.getX();
            this.g = motionEvent.getY();
            sgg sggVar = this.d;
            if (sggVar != null) {
                sggVar.b(null);
            }
            this.e = false;
            this.d = yab.i0(this.a, null, 0, new qc5(this, lq4Var, 26), 3);
            return true;
        }
        if (action == 1 || action == 3) {
            if (view != null) {
                view.setPressed(false);
            }
            sgg sggVar2 = this.d;
            if (sggVar2 != null) {
                sggVar2.b(null);
            }
            this.d = null;
            float x = motionEvent.getX() - this.f;
            float y = motionEvent.getY() - this.g;
            if (!this.e) {
                if ((y * y) + (x * x) < this.c) {
                    this.b.invoke();
                }
            }
        }
        return true;
    }
}
