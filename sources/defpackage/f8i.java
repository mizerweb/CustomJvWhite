package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class f8i extends g6g {
    public final c4h f;

    public f8i(c4h c4hVar, ExecutorService executorService) {
        super(executorService);
        this.f = c4hVar;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        if (!(s7gVar instanceof e8i)) {
            s7gVar.B((k79) F(i));
            return;
        }
        e8i e8iVar = (e8i) s7gVar;
        k79 k79Var = (k79) F(i);
        if (k79Var instanceof c8i) {
            e8iVar.B(k79Var);
            c4h c4hVar = this.f;
            qe7.H(e8iVar.a, 300L, new jvf(c4hVar, 18, (c8i) k79Var));
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i == R.id.oneme_settings_twofa_configuration_setting_item) {
            return new e8i(new atf(viewGroup.getContext()));
        }
        if (i == R.id.oneme_settings_twofa_configuration_header_item) {
            TextView textView = new TextView(viewGroup.getContext());
            q9i.a(q9i.k.g(), textView);
            n1g.N(new yvf(3, null, 4), textView);
            return new lvf(textView, 7);
        }
        if (i == R.id.oneme_settings_twofa_configuration_description_item) {
            TextView textView2 = new TextView(viewGroup.getContext());
            textView2.setLayoutParams(new wee(-1, -2));
            q9i.a(q9i.i, textView2);
            n1g.N(new yvf(3, null, 3), textView2);
            return new lvf(textView2, 6);
        }
        String name = f8i.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.h(i, "unknown item viewType: "), null);
            }
        }
        return new lvf(new View(viewGroup.getContext()), 8);
    }
}
