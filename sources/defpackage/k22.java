package defpackage;

import android.view.View;
import one.me.calls.ui.ui.call.CallScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k22 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m22 b;

    public /* synthetic */ k22(m22 m22Var, int i) {
        this.a = i;
        this.b = m22Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        m22 m22Var = this.b;
        switch (i) {
            case 0:
                l22 l22Var = m22Var.x;
                if (l22Var != null) {
                    fu1 fu1Var = m22Var.C;
                    CallScreen callScreen = ((fx1) l22Var).a;
                    l6m l6mVar = CallScreen.D1;
                    callScreen.R1().g.g(fu1Var);
                }
                break;
            default:
                l22 l22Var2 = m22Var.x;
                if (l22Var2 != null) {
                    CallScreen callScreen2 = ((fx1) l22Var2).a;
                    l6m l6mVar2 = CallScreen.D1;
                    callScreen2.R1().g.i();
                }
                break;
        }
    }
}
