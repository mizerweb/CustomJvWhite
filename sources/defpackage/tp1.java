package defpackage;

import one.me.calls.ui.ui.previewjoinlink.CallJoinLinkPreviewWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class tp1 implements p52 {
    public final /* synthetic */ CallJoinLinkPreviewWidget a;

    public tp1(CallJoinLinkPreviewWidget callJoinLinkPreviewWidget) {
        this.a = callJoinLinkPreviewWidget;
    }

    @Override // defpackage.p52
    public final void w() {
        Object value;
        lp1 lp1Var;
        zv8[] zv8VarArr = CallJoinLinkPreviewWidget.v;
        mjg mjgVar = this.a.o1().n;
        do {
            value = mjgVar.getValue();
            lp1Var = (lp1) value;
        } while (!mjgVar.h(value, lp1.a(lp1Var, null, null, null, !lp1Var.d, null, null, null, 119)));
    }
}
