package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class q45 extends w45 implements View.OnClickListener {
    public final View.OnClickListener d;

    public q45(long j, View.OnClickListener onClickListener) {
        super(j);
        this.d = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dx4 dx4Var = new dx4(this, 2, view);
        if (this.b) {
            this.b = false;
            dx4Var.invoke();
            view.postDelayed(new pi(10, this.c), this.a);
        }
    }
}
