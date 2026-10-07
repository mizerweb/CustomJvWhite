package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class qqf extends g6g {
    public final due f;

    public qqf(due dueVar, ExecutorService executorService) {
        super(executorService);
        this.f = dueVar;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        if (!(s7gVar instanceof pqf)) {
            s7gVar.B((k79) F(i));
            return;
        }
        pqf pqfVar = (pqf) s7gVar;
        k79 k79Var = (k79) F(i);
        if (k79Var instanceof naf) {
            pqfVar.B(k79Var);
            atf atfVar = (atf) pqfVar.a;
            naf nafVar = (naf) k79Var;
            boolean z = nafVar.g instanceof ksf;
            due dueVar = this.f;
            if (z) {
                atfVar.setOnSwitchCheckedListener(new s81(18, dueVar));
            } else {
                atfVar.setOnSwitchListener(null);
            }
            qe7.H(atfVar, 300L, new aeb(dueVar, 24, nafVar));
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i == R.id.oneme_settings_battery_screen_settings_item_vh) {
            return new pqf(new atf(viewGroup.getContext()));
        }
        int i2 = 3;
        lq4 lq4Var = null;
        if (i == R.id.oneme_settings_battery_screen_settings_header_vh) {
            TextView textView = new TextView(viewGroup.getContext());
            textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), textView.getPaddingTop(), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), textView.getPaddingBottom());
            q9i.a(q9i.k.g(), textView);
            int i3 = 19;
            n1g.N(new xc9(i2, lq4Var, i3), textView);
            return new z91(textView, i3);
        }
        if (i != R.id.oneme_settings_battery_screen_settings_footer_vh) {
            String name = qqf.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, zo5.h(i, "unknown item viewType: "), null);
                }
            }
            return new z91(new View(viewGroup.getContext()), 20);
        }
        TextView textView2 = new TextView(viewGroup.getContext());
        textView2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), textView2.getPaddingBottom());
        q9i.a(q9i.i, textView2);
        int i4 = 18;
        n1g.N(new xc9(i2, lq4Var, i4), textView2);
        return new z91(textView2, i4);
    }
}
