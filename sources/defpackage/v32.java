package defpackage;

import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v32 implements tue {
    public final /* synthetic */ int a;
    public final /* synthetic */ a42 b;

    public /* synthetic */ v32(a42 a42Var, wue wueVar) {
        this.a = 1;
        this.b = a42Var;
    }

    @Override // defpackage.tue
    public final void a() {
        int i = this.a;
        a42 a42Var = this.b;
        switch (i) {
            case 0:
                z32 z32Var = a42Var.s;
                if (z32Var != null) {
                    CallTopPanelWidget callTopPanelWidget = (CallTopPanelWidget) ((b1k) z32Var).b;
                    zv8[] zv8VarArr = CallTopPanelWidget.e;
                    a8j.x(callTopPanelWidget.p1().c.G, wx1.F);
                }
                break;
            case 1:
                z32 z32Var2 = a42Var.s;
                if (z32Var2 != null) {
                    CallTopPanelWidget callTopPanelWidget2 = (CallTopPanelWidget) ((b1k) z32Var2).b;
                    zv8[] zv8VarArr2 = CallTopPanelWidget.e;
                    a8j.x(callTopPanelWidget2.p1().c.G, ey1.F);
                }
                break;
            default:
                z32 z32Var3 = a42Var.s;
                if (z32Var3 != null) {
                    CallTopPanelWidget callTopPanelWidget3 = (CallTopPanelWidget) ((b1k) z32Var3).b;
                    zv8[] zv8VarArr3 = CallTopPanelWidget.e;
                    a8j.x(callTopPanelWidget3.p1().c.G, ny1.F);
                }
                break;
        }
    }

    public /* synthetic */ v32(a42 a42Var, int i) {
        this.a = i;
        this.b = a42Var;
    }
}
