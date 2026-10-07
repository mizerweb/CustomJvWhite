package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class vn4 extends lfe {
    public static final int[] w = {-16239405, -16737808};
    public static final int[] x = {-11664148, -7436801};
    public final um4 u;
    public final kp0 v;

    public vn4(Context context, um4 um4Var, kp0 kp0Var) {
        y4c y4cVar = new y4c(context);
        super(y4cVar);
        this.u = um4Var;
        this.v = kp0Var;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        y4cVar.setLayoutParams(marginLayoutParams);
        y4cVar.setOnTouchListener(new zw1(1, this));
    }
}
