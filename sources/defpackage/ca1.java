package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ca1 extends g6g {
    public final due f;

    public ca1(due dueVar, ExecutorService executorService) {
        super(executorService);
        this.f = dueVar;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        if (!(s7gVar instanceof ba1)) {
            s7gVar.B((k79) F(i));
            return;
        }
        ba1 ba1Var = (ba1) s7gVar;
        View view = ba1Var.a;
        k79 k79Var = (k79) F(i);
        if (k79Var instanceof cb1) {
            atf atfVar = (atf) view;
            atfVar.setThemeDepended(usf.b);
            ba1Var.B(k79Var);
            cb1 cb1Var = (cb1) k79Var;
            boolean z = cb1Var.i;
            due dueVar = this.f;
            if (z) {
                atfVar.setEnabled(true);
                qe7.H(view, 300L, new aa1(ba1Var, cb1Var, dueVar, 0));
            } else {
                atfVar.setEnabled(false);
                view.setOnClickListener(null);
            }
            atfVar.setOnSwitchCheckedListener(new s81(1, dueVar));
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i == R.id.call_admin_settings_item_vh) {
            return new ba1(new atf(viewGroup.getContext()));
        }
        a8g a8gVar = pq3.j;
        if (i == R.id.call_admin_settings_header_vh) {
            TextView textView = new TextView(viewGroup.getContext());
            q9i.a(q9i.k.g(), textView);
            textView.setTextColor(a8gVar.l(textView).b.getText().d);
            return new z91(textView, 1);
        }
        if (i != R.id.call_admin_settings_header_bottom_vh) {
            ore.k(nbh.q(i, "unknown item viewType "));
            return null;
        }
        TextView textView2 = new TextView(viewGroup.getContext());
        q9i.a(q9i.i, textView2);
        textView2.setTextColor(a8gVar.l(textView2).b.getText().d);
        return new z91(textView2, 0);
    }
}
