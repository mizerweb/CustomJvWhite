package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class fk7 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ af7 b;

    public /* synthetic */ fk7(int i, af7 af7Var) {
        this.a = i;
        this.b = af7Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        int i = this.a;
        af7 af7Var = this.b;
        switch (i) {
            case 0:
                af7Var.invoke();
                break;
            default:
                af7Var.invoke();
                break;
        }
        return true;
    }
}
