package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class wx2 extends tq0 {
    public final kwb a;
    public final TextView b;
    public final TextView c;
    public final vx2 d;

    public wx2(Context context) {
        super(context, 0, 0, 28);
        kwb kwbVar = new kwb(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 71.0f), gm0.K(71.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        kwbVar.setLayoutParams(layoutParams);
        this.a = kwbVar;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.bottomMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        textView.setTextAlignment(4);
        textView.setSingleLine(true);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        q9i.a(q9i.h, textView);
        int i = 3;
        lq4 lq4Var = null;
        n1g.N(new f7(i, lq4Var, 5), textView);
        this.b = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(17);
        q9i.a(q9i.k, textView2);
        n1g.N(new f7(i, lq4Var, 4), textView2);
        this.c = textView2;
        vx2 vx2Var = new vx2(context);
        vx2Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.d = vx2Var;
        addView(kwbVar);
        addView(textView);
        addView(textView2);
        addView(vx2Var);
        setGravity(1);
        setMinimumWidth(gm0.K(296.0f * yl5.d().getDisplayMetrics().density));
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
    }

    @Override // defpackage.tq0, defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        super.onThemeChanged(kbcVar);
        pq3.g(pq3.j.e(getContext()), this);
    }

    public final void setDescriptions(List<? extends ynh> list) {
        vx2 vx2Var = this.d;
        vx2Var.getClass();
        List<? extends ynh> list2 = list;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ynh) it.next()).d(vx2Var));
        }
        vx2Var.f = arrayList;
        vx2Var.requestLayout();
        vx2Var.invalidate();
        this.c.setGravity(list.isEmpty() ? 17 : 8388611);
    }

    public final void setSubtitle(ynh ynhVar) {
        CharSequence charSequenceD = ynhVar.d(this);
        TextView textView = this.c;
        textView.setText(charSequenceD);
        CharSequence text = textView.getText();
        textView.setVisibility(text == null || text.length() == 0 ? 8 : 0);
    }

    public final void setTitle(ynh ynhVar) {
        TextView textView = this.b;
        textView.setText(ynhVar.b(textView.getContext()));
    }
}
