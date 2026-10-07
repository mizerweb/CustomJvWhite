package defpackage;

import android.view.View;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mc1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qc1 b;

    public /* synthetic */ mc1(qc1 qc1Var, int i) {
        this.a = i;
        this.b = qc1Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        Object value;
        int i = this.a;
        qc1 qc1Var = this.b;
        switch (i) {
            case 0:
                return pq3.j.l(qc1Var).b;
            case 1:
                View viewF = n7j.f(qc1Var, R.id.call_bottom_control_container);
                return viewF == null ? qc1Var : viewF;
            default:
                qc1Var.I = null;
                pc1 pc1Var = qc1Var.D;
                if (pc1Var != null) {
                    CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) ((rj5) pc1Var).b;
                    zv8[] zv8VarArr = CallBottomPanelWidget.l;
                    f9b f9bVarI = callBottomPanelWidget.p1().E().i();
                    do {
                        value = f9bVarI.getValue();
                    } while (!f9bVarI.h(value, k52.a((k52) value, null, 0, null, null, null, null, 0L, 959)));
                }
                return sbi.a;
        }
    }
}
