package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class wi6 implements h65 {
    public static final wi6 a = new wi6();
    public static final xi6 b = xi6.c;

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        if (!((LinkedHashSet) b.b).contains(m65Var)) {
            return null;
        }
        ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
        xi6.c.getClass();
        if (m65Var.equals(xi6.d)) {
            return new u65(str, m65Var, bundle, 0, null, false, new vi6(bundle, ha9Var, 0), 56);
        }
        ore.k(qt4.m("unknown screen ", m65Var));
        return null;
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
