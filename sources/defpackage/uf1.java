package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class uf1 extends g6g {
    public final c7k f;

    public uf1(c7k c7kVar, ExecutorService executorService) {
        super(executorService);
        this.f = c7kVar;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        if (!(s7gVar instanceof tf1)) {
            s7gVar.B((k79) F(i));
            return;
        }
        tf1 tf1Var = (tf1) s7gVar;
        View view = tf1Var.a;
        k79 k79Var = (k79) F(i);
        if (k79Var instanceof yf1) {
            atf atfVar = (atf) view;
            atfVar.setThemeDepended(usf.b);
            tf1Var.B(k79Var);
            atfVar.setEnabled(true);
            qe7.H(view, 300L, new ee(this.f, 4, (yf1) k79Var));
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i == R.id.call_debug_menu_settings_item_vh) {
            return new tf1(new atf(viewGroup.getContext()));
        }
        if (i != R.id.call_debug_menu_settings_header_vh) {
            ore.k(nbh.q(i, "unknown item viewType "));
            return null;
        }
        TextView textView = new TextView(viewGroup.getContext());
        q9i.a(q9i.k.g(), textView);
        textView.setTextColor(pq3.j.l(textView).b.getText().d);
        return new z91(textView, 2);
    }
}
