package defpackage;

import android.view.View;
import one.me.login.confirm.ConfirmPhoneScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fb4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmPhoneScreen b;

    public /* synthetic */ fb4(ConfirmPhoneScreen confirmPhoneScreen, int i) {
        this.a = i;
        this.b = confirmPhoneScreen;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        ConfirmPhoneScreen confirmPhoneScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = ConfirmPhoneScreen.z;
                qb4 qb4VarU1 = confirmPhoneScreen.u1();
                qb4VarU1.v = null;
                qb4VarU1.c.a(qb4VarU1.b, ((n0c) ((xhh) qb4VarU1.k.getValue())).b(), 1, new qy3(qb4VarU1, null, 4));
                break;
            default:
                zv8[] zv8VarArr2 = ConfirmPhoneScreen.z;
                qb4 qb4VarU2 = confirmPhoneScreen.u1();
                qb4VarU2.getClass();
                a8j.x(qb4VarU2.p, new db4(lpl.a((String) ((e5d) qb4VarU2.g.getValue()).x.a(e5d.S6[15]).i())));
                break;
        }
    }
}
