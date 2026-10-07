package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class awf extends g6g {
    public final vn7 f;

    public awf(vn7 vn7Var, ExecutorService executorService) {
        super(executorService);
        this.f = vn7Var;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        boolean z = s7gVar instanceof zvf;
        vn7 vn7Var = this.f;
        if (z) {
            zvf zvfVar = (zvf) s7gVar;
            k79 k79Var = (k79) F(i);
            if (k79Var instanceof mbf) {
                zvfVar.B(k79Var);
                qe7.H((atf) zvfVar.a, 300L, new jvf(vn7Var, 2, (mbf) k79Var));
                return;
            }
            return;
        }
        if (!(s7gVar instanceof xvf)) {
            s7gVar.B((k79) F(i));
            return;
        }
        xvf xvfVar = (xvf) s7gVar;
        k79 k79Var2 = (k79) F(i);
        if (k79Var2 instanceof lbf) {
            xvfVar.B(k79Var2);
            qe7.H((cyb) xvfVar.a, 300L, new jvf(vn7Var, 1, (lbf) k79Var2));
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i == R.id.oneme_settings_storage_screen_settings_item_vh) {
            return new zvf(new atf(viewGroup.getContext()));
        }
        if (i == R.id.oneme_settings_storage_screen_settings_header_vh) {
            TextView textView = new TextView(viewGroup.getContext());
            textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
            q9i.a(q9i.k.g(), textView);
            n1g.N(new yvf(3, null, 0), textView);
            return new lvf(textView, 1);
        }
        if (i != R.id.oneme_settings_storage_screen_settings_button_vh) {
            String name = awf.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, zo5.h(i, "unknown item viewType: "), null);
                }
            }
            return new lvf(new View(viewGroup.getContext()), 2);
        }
        cyb cybVar = new cyb(viewGroup.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        layoutParams.leftMargin = iK;
        layoutParams.rightMargin = iK;
        layoutParams.topMargin = iK;
        layoutParams.bottomMargin = iK;
        cybVar.setLayoutParams(layoutParams);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        return new xvf(cybVar);
    }
}
