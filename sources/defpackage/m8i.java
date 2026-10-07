package defpackage;

import android.view.View;
import one.me.settings.twofa.restore.TwoFAStartRestoreScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class m8i implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoFAStartRestoreScreen b;

    public /* synthetic */ m8i(TwoFAStartRestoreScreen twoFAStartRestoreScreen, int i) {
        this.a = i;
        this.b = twoFAStartRestoreScreen;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        TwoFAStartRestoreScreen twoFAStartRestoreScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = TwoFAStartRestoreScreen.j;
                a8j.x(twoFAStartRestoreScreen.o1().o, nol.b());
                break;
            default:
                zv8[] zv8VarArr2 = TwoFAStartRestoreScreen.j;
                p8i p8iVarO1 = twoFAStartRestoreScreen.o1();
                p8iVarO1.r.B(p8iVarO1, p8i.u[0], yab.h0(p8iVarO1.b, ((n0c) ((xhh) p8iVarO1.i.getValue())).b(), 2, new ryf(p8iVarO1, null, 25)));
                break;
        }
    }
}
