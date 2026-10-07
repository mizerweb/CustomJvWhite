package defpackage;

import android.view.View;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x32 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ a42 b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        a42 a42Var = this.b;
        switch (i) {
            case 0:
                z32 z32Var = a42Var.s;
                if (z32Var != null) {
                    CallTopPanelWidget callTopPanelWidget = (CallTopPanelWidget) ((b1k) z32Var).b;
                    zv8[] zv8VarArr = CallTopPanelWidget.e;
                    a8j.x(callTopPanelWidget.p1().c.G, jy1.F);
                }
                break;
            default:
                z32 z32Var2 = a42Var.s;
                if (z32Var2 != null) {
                    boolean z = !a42Var.y;
                    CallTopPanelWidget callTopPanelWidget2 = (CallTopPanelWidget) ((b1k) z32Var2).b;
                    zv8[] zv8VarArr2 = CallTopPanelWidget.e;
                    callTopPanelWidget2.p1().d.e.a(z);
                }
                break;
        }
    }

    public /* synthetic */ x32(a42 a42Var, View view) {
        this.b = a42Var;
    }
}
