package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class v79 implements View.OnTouchListener {
    public final /* synthetic */ w79 a;

    public v79(w79 w79Var) {
        this.a = w79Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        w79 w79Var = this.a;
        s79 s79Var = w79Var.r;
        Handler handler = w79Var.v;
        es esVar = w79Var.z;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && esVar != null && esVar.isShowing() && x >= 0 && x < esVar.getWidth() && y >= 0 && y < esVar.getHeight()) {
            handler.postDelayed(s79Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(s79Var);
        return false;
    }
}
