package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class mvf extends g6g {
    public final ks9 f;

    public mvf(ks9 ks9Var, ExecutorService executorService) {
        super(executorService);
        this.f = ks9Var;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        if (!(s7gVar instanceof kvf)) {
            s7gVar.B((k79) F(i));
            return;
        }
        kvf kvfVar = (kvf) s7gVar;
        View view = kvfVar.a;
        k79 k79Var = (k79) F(i);
        if (k79Var instanceof jbf) {
            kvfVar.B(k79Var);
            jbf jbfVar = (jbf) k79Var;
            ks9 ks9Var = this.f;
            qe7.H(view, 300L, new jvf(ks9Var, 0, jbfVar));
            if (jbfVar.h) {
                ((atf) view).setOnLongClickListener(new o03(ks9Var, kvfVar, jbfVar, 5));
            } else {
                ((atf) view).setOnLongClickListener(null);
            }
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i == R.id.oneme_settings_ringtone_section_item_vh) {
            return new kvf(new atf(viewGroup.getContext()));
        }
        int i2 = 28;
        int i3 = 3;
        lq4 lq4Var = null;
        if (i == R.id.oneme_settings_ringtone_section_header_vh) {
            TextView textView = new TextView(viewGroup.getContext());
            textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), textView.getPaddingTop(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), textView.getPaddingBottom());
            q9i.a(q9i.k.g(), textView);
            n1g.N(new xc9(i3, lq4Var, i2), textView);
            return new z91(textView, 29);
        }
        if (i == R.id.oneme_settings_ringtone_section_bottom_vh) {
            TextView textView2 = new TextView(viewGroup.getContext());
            textView2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), textView2.getPaddingTop(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), textView2.getPaddingBottom());
            q9i.a(q9i.i, textView2);
            n1g.N(new xc9(i3, lq4Var, 27), textView2);
            return new z91(textView2, i2);
        }
        String name = mvf.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.h(i, "unknown item viewType: "), null);
            }
        }
        return new lvf(new View(viewGroup.getContext()), 0);
    }
}
