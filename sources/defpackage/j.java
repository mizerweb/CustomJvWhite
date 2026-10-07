package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class j implements h65 {
    public static final j a = new j();
    public static final k b = k.c;

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        if (!((LinkedHashSet) b.b).contains(m65Var)) {
            return null;
        }
        ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
        if (m65Var.equals(k.d)) {
            return new u65(str, m65Var, bundle, 1, null, false, new i(0, ha9Var), 48);
        }
        ore.k(qt4.m("Unknown route=", m65Var));
        return null;
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
