package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class quf extends g6g {
    public final c7k f;

    public quf(c7k c7kVar, ExecutorService executorService) {
        super(executorService);
        this.f = c7kVar;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        if (!(s7gVar instanceof puf)) {
            s7gVar.B((k79) F(i));
            return;
        }
        puf pufVar = (puf) s7gVar;
        View view = pufVar.a;
        k79 k79Var = (k79) F(i);
        if (k79Var instanceof raf) {
            pufVar.B(k79Var);
            raf rafVar = (raf) k79Var;
            boolean z = rafVar.k;
            c7k c7kVar = this.f;
            if (z) {
                ((atf) view).setEnabled(true);
                qe7.H(view, 300L, new aeb(c7kVar, 29, rafVar));
            } else {
                ((atf) view).setEnabled(false);
                view.setOnClickListener(null);
            }
            ((atf) view).setOnSwitchCheckedListener(new s81(22, c7kVar));
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i == R.id.oneme_settings_privacy_screen_settings_item_vh) {
            return new puf(new atf(viewGroup.getContext()));
        }
        int i2 = 3;
        lq4 lq4Var = null;
        if (i == R.id.oneme_settings_privacy_screen_settings_header_vh) {
            TextView textView = new TextView(viewGroup.getContext());
            textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), textView.getPaddingTop(), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), textView.getPaddingBottom());
            q9i.a(q9i.k.g(), textView);
            int i3 = 25;
            n1g.N(new xc9(i2, lq4Var, i3), textView);
            return new z91(textView, i3);
        }
        if (i != R.id.oneme_settings_privacy_screen_settings_warning_vh) {
            String name = quf.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, zo5.h(i, "unknown item viewType: "), null);
                }
            }
            return new z91(new View(viewGroup.getContext()), 27);
        }
        TextView textView2 = new TextView(viewGroup.getContext());
        textView2.setLayoutParams(new wee(-1, -2));
        textView2.setGravity(17);
        int iK = gm0.K(15.0f * yl5.d().getDisplayMetrics().density);
        textView2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), iK, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), iK);
        q9i.a(q9i.i, textView2);
        int i4 = 26;
        n1g.N(new xc9(i2, lq4Var, i4), textView2);
        return new z91(textView2, i4);
    }
}
