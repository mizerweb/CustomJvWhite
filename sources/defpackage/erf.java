package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class erf implements h65 {
    public static final erf a = new erf();
    public static final frf b = frf.c;

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        i iVar;
        if (!((LinkedHashSet) b.b).contains(m65Var)) {
            return null;
        }
        f2 q65Var = r65.c;
        ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
        frf.c.getClass();
        if (m65Var.equals(frf.d)) {
            iVar = new i(22, ha9Var);
        } else {
            if (!m65Var.equals(frf.e)) {
                ore.k(qt4.m("invalid route ", m65Var));
                return null;
            }
            q65Var = new q65(new tyd(28), new tyd(29));
            iVar = new i(23, ha9Var);
        }
        return new u65(str, m65Var, bundle, 0, q65Var, false, iVar, 40);
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
