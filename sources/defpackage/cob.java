package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class cob extends g6g {
    public final vn7 f;

    public cob(vn7 vn7Var, ExecutorService executorService) {
        super(executorService);
        this.f = vn7Var;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        if (!(s7gVar instanceof bob)) {
            s7gVar.B((k79) F(i));
            return;
        }
        bob bobVar = (bob) s7gVar;
        View view = bobVar.a;
        k79 k79Var = (k79) F(i);
        if (k79Var instanceof vnb) {
            bobVar.B(k79Var);
            vnb vnbVar = (vnb) k79Var;
            boolean z = vnbVar.f instanceof ksf;
            vn7 vn7Var = this.f;
            if (z) {
                ((atf) view).setOnSwitchCheckedListener(new s81(12, vn7Var));
            } else {
                ((atf) view).setOnSwitchListener(null);
            }
            qe7.H(view, 300L, new aeb(vn7Var, 1, vnbVar));
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i == R.id.oneme_notifications_settings_item_vh) {
            return new bob(new atf(viewGroup.getContext()));
        }
        lq4 lq4Var = null;
        if (i == R.id.oneme_notifications_settings_header_vh) {
            TextView textView = new TextView(viewGroup.getContext());
            textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), textView.getPaddingTop(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), textView.getPaddingBottom());
            q9i.a(q9i.k.g(), textView);
            n1g.N(new xc9(3, lq4Var, 5), textView);
            return new z91(textView, 11);
        }
        String name = cob.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.h(i, "unknown item viewType: "), null);
            }
        }
        return new z91(new View(viewGroup.getContext()), 12);
    }
}
