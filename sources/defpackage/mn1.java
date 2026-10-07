package defpackage;

import android.view.ViewGroup;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mn1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallIndicatorWidget b;

    public /* synthetic */ mn1(CallIndicatorWidget callIndicatorWidget, int i) {
        this.a = i;
        this.b = callIndicatorWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        CallIndicatorWidget callIndicatorWidget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = CallIndicatorWidget.g;
                hn1 hn1Var = new hn1(callIndicatorWidget.getContext());
                hn1Var.setId(R.id.call_indicator_panel);
                hn1Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                qe7.H(hn1Var, 300L, new t8(6, callIndicatorWidget));
                hn1Var.setPadding(0, 0, 0, gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
                lvb.H(hn1Var, new oi8(0, 3, 0, null, 13), null);
                return hn1Var;
            default:
                ln1 ln1Var = (ln1) callIndicatorWidget.b.getAccessor().c(863);
                return new kn1(ln1Var.a, ln1Var.b, ln1Var.c, ln1Var.d, ln1Var.e, ln1Var.f, ln1Var.g, ln1Var.h, ln1Var.i, ln1Var.j);
        }
    }
}
