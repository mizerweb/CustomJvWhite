package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aa0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha0 b;
    public final /* synthetic */ y90 c;

    public /* synthetic */ aa0(ha0 ha0Var, y90 y90Var, int i) {
        this.a = i;
        this.b = ha0Var;
        this.c = y90Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        y90 y90Var = this.c;
        ha0 ha0Var = this.b;
        switch (i) {
            case 0:
                ha0Var.a.invoke(new ana(y90Var.c, y90Var));
                break;
            case 1:
                ValueAnimator valueAnimator = ha0Var.w;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    ha0Var.a.invoke(new gna(y90Var.c));
                }
                break;
            default:
                ha0Var.a.invoke(new ana(y90Var.c, y90Var));
                break;
        }
    }
}
