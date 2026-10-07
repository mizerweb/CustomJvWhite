package defpackage;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class sj9 extends g6g {
    public final qma f;

    public sj9(ScheduledExecutorService scheduledExecutorService, qma qmaVar) {
        super(scheduledExecutorService);
        this.f = qmaVar;
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        TextView textView = new TextView(viewGroup.getContext());
        am0 am0Var = new am0(textView, 8);
        int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        textView.setLayoutParams(new wee(-2, -1));
        textView.setPaddingRelative(iK2, iK, iK2, iK);
        q9i.a(q9i.i, textView);
        qe7.H(textView, 300L, new z36(am0Var, 17, this.f));
        textView.setGravity(16);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        n1g.N(new xc9(3, null, 1), textView);
        return am0Var;
    }
}
