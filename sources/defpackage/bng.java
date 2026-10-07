package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class bng implements h65 {
    public static final bng a = new bng();
    public static final cng b = cng.c;

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        if (!((LinkedHashSet) b.b).contains(m65Var)) {
            return null;
        }
        ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
        cng.c.getClass();
        if (m65Var.equals(cng.d)) {
            return new u65(str, m65Var, bundle, 1, new q65(new irf(20), new irf(21)), false, new wg5(bundle, sb8.h0(bundle, "sticker_id"), bundle.getString("entry_point") != null ? l21.d(sb8.j0(bundle, "entry_point")) : null, ha9Var, 3), 32);
        }
        ore.k(qt4.m("invalid route ", m65Var));
        return null;
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
