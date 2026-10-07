package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class gr7 extends wf4 implements eph {
    public final nqe s;
    public final View t;
    public final q9c u;
    public final TextView v;
    public final TextView w;
    public final cyb x;

    public gr7(Context context) {
        super(context);
        nqe nqeVar = new nqe(nqe.m, nqe.n);
        this.s = nqeVar;
        View view = new View(context);
        view.setId(R.id.pinbars_group_call_bar_divider);
        a8g a8gVar = pq3.j;
        view.setBackgroundColor(a8gVar.e(context).m().B().b);
        this.t = view;
        q9c q9cVar = new q9c(context);
        q9cVar.setId(R.id.pinbars_group_call_bar_stack);
        q9cVar.j = new in2(new m9c(q9cVar, 0), new lh9(20, q9cVar), new m9c(q9cVar, 1));
        q9cVar.setListener(new uvc(this, 19, q9cVar));
        this.u = q9cVar;
        TextView textViewE = qv1.e(context, R.id.pinbars_group_call_bar_title);
        textViewE.setText(context.getString(R.string.pinbars_group_call_bar_title));
        q9i.a(q9i.i, textViewE);
        this.v = textViewE;
        TextView textViewE2 = qv1.e(context, R.id.pinbars_group_call_bar_subtitle);
        q9i.a(q9i.k, textViewE2);
        this.w = textViewE2;
        cyb cybVar = new cyb(context);
        cybVar.setId(R.id.pinbars_group_call_bar_button);
        cybVar.setSize(ayb.j);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.pinbars_group_call_bar_button_text));
        this.x = cybVar;
        setLayoutParams(new uf4(-1, -2));
        addView(view, 0, gm0.K(1.0f * yl5.d().getDisplayMetrics().density));
        addView(q9cVar, 0, -2);
        addView(cybVar, 0, -2);
        addView(textViewE, 0, -2);
        addView(textViewE2, 0, -2);
        setBackground(nqeVar);
        onThemeChanged(a8gVar.h(this));
        eg4 eg4VarH = ch3.h(this);
        int id = view.getId();
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, 0, 7);
        eg4VarH.d(id, 3, 0, 3);
        int id2 = q9cVar.getId();
        eg4VarH.d(id2, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id2));
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 4, 0, 4);
        eg4VarH.g(id2).d.l0 = true;
        int id3 = textViewE.getId();
        eg4VarH.d(id3, 6, q9cVar.getId(), 7);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id3));
        eg4VarH.d(id3, 3, 0, 3);
        eg4VarH.d(id3, 4, textViewE2.getId(), 3);
        new bsb(4, eg4VarH, id3).a(gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.d(id3, 7, cybVar.getId(), 6);
        new bsb(7, eg4VarH, id3).a(gm0.K(yl5.d().getDisplayMetrics().density * 9.0f));
        eg4VarH.g(id3).d.l0 = true;
        eg4VarH.g(id3).d.W = 2;
        int id4 = textViewE2.getId();
        eg4VarH.d(id4, 6, q9cVar.getId(), 7);
        new bsb(6, eg4VarH, id4).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        eg4VarH.d(id4, 3, textViewE.getId(), 4);
        eg4VarH.d(id4, 4, 0, 4);
        eg4VarH.d(id4, 7, cybVar.getId(), 6);
        new bsb(7, eg4VarH, id4).a(gm0.K(9.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.g(id4).d.l0 = true;
        int id5 = cybVar.getId();
        eg4VarH.d(id5, 7, 0, 7);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id5));
        eg4VarH.d(id5, 3, 0, 3);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id5));
        eg4VarH.d(id5, 4, 0, 4);
        new bsb(4, eg4VarH, id5).a(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.g(id5).d.l0 = true;
        eg4VarH.a(this);
        setClipToPadding(false);
        setClipChildren(false);
    }

    public final View getDividerView() {
        return this.t;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.v.setTextColor(kbcVar.getText().b);
        this.w.setTextColor(kbcVar.getText().d);
        this.x.e();
        this.t.setBackgroundColor(kbcVar.B().b);
    }

    public final void setJoinAction(af7 af7Var) {
        cyb cybVar = this.x;
        if (af7Var == null) {
            cybVar.setOnClickListener(null);
        } else {
            qe7.H(cybVar, 300L, new d8(6, af7Var));
        }
    }

    public final void u(dr7 dr7Var) {
        this.u.setAvatars(dr7Var.c);
        this.w.setText(dr7Var.b.d(this));
    }
}
