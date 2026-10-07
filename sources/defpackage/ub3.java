package defpackage;

import android.view.View;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ub3 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd3 b;

    public /* synthetic */ ub3(xd3 xd3Var, int i) {
        this.a = i;
        this.b = xd3Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        xd3 xd3Var = this.b;
        switch (i) {
            case 0:
                if (((Throwable) obj) instanceof CancellationException) {
                    gm0.Y(xd3Var.p, "draft saving cancelled");
                }
                break;
            case 1:
                if (((Throwable) obj) instanceof CancellationException) {
                    gm0.Y(xd3Var.p, "clear draft cancelling");
                }
                break;
            case 2:
                a8j.x(xd3Var.L1, ac3.c);
                break;
            case 3:
                a8j.x(xd3Var.L1, ac3.c);
                break;
            default:
                zv8[] zv8VarArr = xd3.X1;
                a8j.t(xd3Var, ((n0c) xd3Var.H()).b(), new in1(xd3Var, (View) obj, null, 28), 2);
                break;
        }
        return sbiVar;
    }
}
