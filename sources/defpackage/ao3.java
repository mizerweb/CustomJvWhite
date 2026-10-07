package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class ao3 implements h65 {
    public static final ao3 a = new ao3();
    public static final bo3 b = bo3.c;

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        if (!((LinkedHashSet) b.b).contains(m65Var)) {
            return null;
        }
        q65 q65Var = new q65(new k82(29), new zn3(0));
        ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
        if (m65Var.equals(bo3.d)) {
            return new u65(str, m65Var, bundle, 1, q65Var, false, new i(4, ha9Var), 32);
        }
        ore.k(qt4.m("invalid route ", m65Var));
        return null;
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
