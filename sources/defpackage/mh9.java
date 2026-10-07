package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mh9 extends nee {
    public final gjg d;

    public mh9(mjg mjgVar) {
        this.d = mjgVar;
    }

    @Override // defpackage.nee
    public final int l() {
        return ((List) this.d.getValue()).size();
    }

    @Override // defpackage.nee
    public final void u(lfe lfeVar, int i) {
        int iI0;
        String str = (String) ww3.u1(i, (List) this.d.getValue());
        View view = ((nh9) lfeVar).a;
        ((TextView) view).setText(str);
        if (str == null || !r5h.L0(str, "exception", true)) {
            iI0 = (str == null || !r5h.L0(str, "error", true)) ? 0 : lvb.I0(-65536, 0.75f);
        } else {
            iI0 = lvb.I0(-65536, 0.75f);
        }
        view.setBackgroundColor(iI0);
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        TextView textView = new TextView(viewGroup.getContext());
        q9i.a(q9i.e, textView);
        textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 3.0f), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), gm0.K(3.0f * yl5.d().getDisplayMetrics().density));
        textView.setTextColor(pq3.j.h(textView).getText().b);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setTextIsSelectable(true);
        return new nh9(textView);
    }
}
