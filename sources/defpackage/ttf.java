package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ttf extends g6g {
    public final rtf f;

    public ttf(rtf rtfVar, ExecutorService executorService) {
        super(executorService);
        this.f = rtfVar;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        k79 k79Var = (k79) F(i);
        if (!(s7gVar instanceof stf)) {
            if (!(s7gVar instanceof dpf)) {
                s7gVar.B(k79Var);
                return;
            }
            dpf dpfVar = (dpf) s7gVar;
            bad badVar = new bad(this, 8, k79Var);
            if (k79Var instanceof cbf) {
                dpfVar.B(k79Var);
                ((cqf) dpfVar.a).setSliderAction(badVar);
                return;
            }
            return;
        }
        stf stfVar = (stf) s7gVar;
        if (k79Var instanceof bbf) {
            stfVar.B(k79Var);
            atf atfVar = (atf) stfVar.a;
            bbf bbfVar = (bbf) k79Var;
            boolean z = bbfVar.g instanceof ksf;
            rtf rtfVar = this.f;
            if (z) {
                atfVar.setOnSwitchCheckedListener(new s81(21, rtfVar));
            } else {
                atfVar.setOnSwitchListener(null);
            }
            qe7.H(atfVar, 300L, new aeb(rtfVar, 28, bbfVar));
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i == R.id.oneme_settings_media_screen_settings_item_vh) {
            return new stf(new atf(viewGroup.getContext()));
        }
        int i2 = 23;
        int i3 = 24;
        int i4 = 3;
        lq4 lq4Var = null;
        if (i == R.id.oneme_settings_media_screen_settings_header_vh) {
            TextView textView = new TextView(viewGroup.getContext());
            textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), textView.getPaddingTop(), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), textView.getPaddingBottom());
            q9i.a(q9i.k.g(), textView);
            n1g.N(new xc9(i4, lq4Var, i3), textView);
            return new z91(textView, i2);
        }
        if (i == R.id.oneme_settings_media_screen_settings_description_vh) {
            TextView textView2 = new TextView(viewGroup.getContext());
            textView2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), textView2.getPaddingTop(), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), textView2.getPaddingBottom());
            textView2.setLayoutParams(new wee(-1, -2));
            q9i.a(q9i.i, textView2);
            n1g.N(new xc9(i4, lq4Var, i2), textView2);
            return new z91(textView2, 22);
        }
        if (i == R.id.oneme_settings_media_screen_settings_slider_item_vh) {
            return new dpf(new cqf(viewGroup.getContext()));
        }
        String name = ttf.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.h(i, "unknown item viewType: "), null);
            }
        }
        return new z91(new View(viewGroup.getContext()), i3);
    }
}
