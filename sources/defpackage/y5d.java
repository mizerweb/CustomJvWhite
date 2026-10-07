package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y5d implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qf7 b;

    public /* synthetic */ y5d(qf7 qf7Var, int i) {
        this.a = i;
        this.b = qf7Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.a;
        qf7 qf7Var = this.b;
        switch (i) {
            case 0:
                break;
        }
        return ((Boolean) qf7Var.invoke(view, motionEvent)).booleanValue();
    }
}
