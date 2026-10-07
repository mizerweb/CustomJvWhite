package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class bn4 extends lfe {
    public static final int[] w = {-16239405, -16737808};
    public static final int[] x = {-11664148, -7436801};
    public final um4 u;
    public final kp0 v;

    public bn4(Context context, um4 um4Var, kp0 kp0Var) {
        pzb pzbVar = new pzb(context);
        super(pzbVar);
        this.u = um4Var;
        this.v = kp0Var;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        pzbVar.setLayoutParams(marginLayoutParams);
    }
}
