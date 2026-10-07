package defpackage;

import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u32 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a42 b;

    public /* synthetic */ u32(a42 a42Var, int i) {
        this.a = i;
        this.b = a42Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        a42 a42Var = this.b;
        switch (i) {
            case 0:
                return pq3.j.l(a42Var).b;
            default:
                z32 z32Var = a42Var.s;
                if (z32Var != null) {
                    CallTopPanelWidget callTopPanelWidget = (CallTopPanelWidget) ((b1k) z32Var).b;
                    zv8[] zv8VarArr = CallTopPanelWidget.e;
                    callTopPanelWidget.p1().d.c().r();
                }
                return sbi.a;
        }
    }
}
