package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.DrawableWrapper;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class xc8 extends DrawableWrapper {
    public xc8(Context context) {
        mr3 mr3Var = new mr3(context);
        mr3Var.i = gm0.K(0.0f * yl5.d().getDisplayMetrics().density);
        mr3Var.a = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        yc8 yc8Var = new yc8(context, mr3Var, new gr3(mr3Var), new ir3(mr3Var));
        Resources resources = context.getResources();
        dsi dsiVar = new dsi();
        ThreadLocal threadLocal = mne.a;
        dsiVar.a = resources.getDrawable(R.drawable.indeterminate_static, null);
        new csi(dsiVar.a.getConstantState());
        yc8Var.n = dsiVar;
        super(yc8Var);
    }
}
