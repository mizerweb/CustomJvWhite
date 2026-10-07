package defpackage;

import one.me.android.externalcallback.ExternalCallbackWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bj6 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ExternalCallbackWidget b;

    public /* synthetic */ bj6(ExternalCallbackWidget externalCallbackWidget, int i) {
        this.a = i;
        this.b = externalCallbackWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ExternalCallbackWidget externalCallbackWidget = this.b;
        switch (i) {
            case 0:
                h hVar = externalCallbackWidget.u;
                return new aj6(hVar.getAccessor().d(114), hVar.getAccessor().d(23));
            default:
                int i2 = ExternalCallbackWidget.y;
                xc8 xc8Var = new xc8(externalCallbackWidget.getContext());
                int iK = gm0.K(44.0f * yl5.d().getDisplayMetrics().density);
                xc8Var.setBounds(0, 0, iK, iK);
                return xc8Var;
        }
    }
}
