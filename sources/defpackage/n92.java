package defpackage;

import android.content.Intent;
import one.me.android.calls.CallNotifierFixActivity;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
public final class n92 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public n92(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    public final boolean a(be1 be1Var, boolean z, String str) {
        gm0.n("CallsNavigatorTag", "show showIncomingCallUi");
        boolean zA = ((c95) this.a.getValue()).a();
        if (zA) {
            gm0.n("CallsNavigatorTag", "notification available, will show via service.");
            return true;
        }
        if (zA || !((gue) this.c.getValue()).e()) {
            gm0.n("CallsNavigatorTag", "can't show incoming call ui");
            return false;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallsNavigatorTag", zo5.s("show call screen areIncomingNotificationsEnabled=", zA), null);
            }
        }
        so1 so1Var = (so1) this.b.getValue();
        so1Var.getClass();
        Intent intent = new Intent(so1Var.c(), (Class<?>) CallNotifierFixActivity.class);
        so1.b(intent, be1Var, z, str);
        intent.putExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, so1Var.a.a);
        so1Var.c().startActivity(intent);
        return true;
    }
}
