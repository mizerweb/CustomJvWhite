package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class oj8 extends nee {
    public final ArrayList d = new ArrayList();
    public final Pattern e = Pattern.compile("\\b([\\w\\-\\.]+\\.(dex|so))\\b");

    @Override // defpackage.nee
    public final int l() {
        return this.d.size();
    }

    @Override // defpackage.nee
    public final void u(lfe lfeVar, int i) {
        CharSequence charSequence = (CharSequence) this.d.get(i);
        View view = ((pj8) lfeVar).a;
        ((TextView) view).setText(charSequence);
        int iI0 = 0;
        if (r5h.L0(charSequence, "result: true", false) || r5h.L0(charSequence, "Digests are equal", false)) {
            iI0 = lvb.I0(-16711936, 0.75f);
        } else if (r5h.L0(charSequence, "Validating digest", false)) {
            iI0 = lvb.I0(-16776961, 0.75f);
        } else if (r5h.L0(charSequence, "E/", false) || r5h.L0(charSequence, "fail", true) || r5h.L0(charSequence, "exception", true) || r5h.L0(charSequence, "error", true)) {
            iI0 = lvb.I0(-65536, 0.75f);
        }
        view.setBackgroundColor(iI0);
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        TextView textView = new TextView(viewGroup.getContext());
        q9i.a(q9i.e, textView);
        textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
        textView.setTextColor(pq3.j.h(textView).getText().b);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new pj8(textView);
    }
}
