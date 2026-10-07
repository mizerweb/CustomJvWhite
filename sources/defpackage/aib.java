package defpackage;

import android.content.Context;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class aib extends wf4 {
    public final TextView s;
    public final TextView t;

    public aib(Context context) {
        super(context);
        TextView textViewE = qv1.e(context, R.id.not_contact_view_country_title);
        textViewE.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 120.0f), -2));
        textViewE.setText(np4.q(textViewE.getContext(), R.string.non_contact_view_country_title));
        noh nohVar = q9i.i;
        q9i.a(nohVar, textViewE);
        a8g a8gVar = pq3.j;
        textViewE.setTextColor(a8gVar.e(context).j().b.getText().d);
        textViewE.setGravity(8388613);
        TextView textView = new TextView(context);
        textView.setId(R.id.not_contact_view_registration_title);
        textView.setLayoutParams(new uf4(gm0.K(120.0f * yl5.d().getDisplayMetrics().density), -2));
        textView.setText(np4.q(textView.getContext(), R.string.non_contact_view_registration_title));
        textView.setGravity(8388613);
        q9i.a(nohVar, textView);
        textView.setTextColor(a8gVar.e(context).j().b.getText().d);
        TextView textView2 = new TextView(context);
        textView2.setId(R.id.not_contact_view_country_text);
        q9i.a(nohVar, textView2);
        textView2.setMaxLines(2);
        textView2.setTextColor(a8gVar.e(context).j().b.getText().b);
        textView2.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), -2));
        this.s = textView2;
        TextView textView3 = new TextView(context);
        textView3.setId(R.id.not_contact_view_registration_text);
        q9i.a(nohVar, textView3);
        textView3.setTextColor(a8gVar.e(context).j().b.getText().b);
        textView3.setLayoutParams(new uf4(gm0.K(0.0f * yl5.d().getDisplayMetrics().density), -2));
        this.t = textView3;
        int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        setLayoutParams(new uf4(gm0.K(300.0f * yl5.d().getDisplayMetrics().density), -2));
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        setMinHeight(gm0.K(88.0f * yl5.d().getDisplayMetrics().density));
        ip7 ip7Var = new ip7(context);
        int[] iArr = (int[]) ((t84) lbc.F7.c).d;
        ip7Var.b.B(ip7Var, ip7.g[0], iArr);
        setBackground(ip7Var);
        b6h b6hVar = new b6h(context);
        b6hVar.b((int[]) ((t84) a8gVar.e(context).j().b.f().c).g);
        setForeground(b6hVar);
        addView(textViewE);
        addView(textView);
        addView(textView2);
        addView(textView3);
        eg4 eg4VarH = ch3.h(this);
        int id = textViewE.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 4, textView.getId(), 3);
        new bsb(4, eg4VarH, id).a(iK);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, textView2.getId(), 6);
        new bsb(7, eg4VarH, id).a(iK);
        int id2 = textView.getId();
        eg4VarH.d(id2, 4, 0, 4);
        eg4VarH.d(id2, 3, textViewE.getId(), 4);
        eg4VarH.d(id2, 6, 0, 6);
        eg4VarH.d(id2, 7, textView3.getId(), 6);
        new bsb(7, eg4VarH, id2).a(iK);
        int id3 = textView2.getId();
        eg4VarH.d(id3, 3, 0, 3);
        eg4VarH.d(id3, 4, textView3.getId(), 3);
        new bsb(4, eg4VarH, id3).a(iK);
        eg4VarH.d(id3, 6, textViewE.getId(), 7);
        eg4VarH.d(id3, 7, 0, 7);
        int id4 = textView3.getId();
        eg4VarH.d(id4, 4, 0, 4);
        eg4VarH.d(id4, 6, textView.getId(), 7);
        eg4VarH.d(id4, 7, 0, 7);
        eg4VarH.d(id4, 3, textView2.getId(), 4);
        eg4VarH.a(this);
    }

    public final void setCountry(String str) {
        this.s.setText(str);
    }

    public final void setRegistration(String str) {
        this.t.setText(str);
    }
}
