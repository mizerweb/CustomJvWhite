package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class oog implements h65 {
    public static final oog a = new oog();
    public static final pog b = pog.c;

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        t65 hmdVar;
        ruf rufVar;
        if (!((LinkedHashSet) b.b).contains(m65Var)) {
            return null;
        }
        ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
        Long lY = sb8.Y(bundle, "set_id");
        long jLongValue = lY != null ? lY.longValue() : -1L;
        Boolean boolW = sb8.W(bundle, "from_settings");
        boolean zBooleanValue = boolW != null ? boolW.booleanValue() : false;
        pog.c.getClass();
        if (m65Var.equals(pog.d)) {
            rufVar = new ruf(6, ha9Var);
        } else {
            if (!m65Var.equals(pog.e)) {
                if (m65Var.equals(pog.f)) {
                    rufVar = new ruf(8, ha9Var);
                } else {
                    if (!m65Var.equals(pog.g)) {
                        ore.k(qt4.m("invalid route ", m65Var));
                        return null;
                    }
                    hmdVar = new hmd(jLongValue, zBooleanValue, ha9Var, 2);
                }
                return new u65(str, m65Var, bundle, 1, null, false, hmdVar, 48);
            }
            rufVar = new ruf(7, ha9Var);
        }
        hmdVar = rufVar;
        return new u65(str, m65Var, bundle, 1, null, false, hmdVar, 48);
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
