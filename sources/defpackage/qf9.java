package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class qf9 implements h65 {
    public static final qf9 a = new qf9();
    public static final rf9 b = rf9.c;

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        t65 of9Var;
        if (!((LinkedHashSet) b.b).contains(m65Var)) {
            return null;
        }
        final ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
        if (m65Var.equals(rf9.d)) {
            of9Var = new of9(0, bundle);
        } else {
            if (!m65Var.equals(rf9.e)) {
                ore.k(qt4.m("invalid route ", m65Var));
                return null;
            }
            final long jH0 = sb8.h0(bundle, "id");
            of9Var = new t65() { // from class: pf9
                @Override // defpackage.t65
                public final Object t() {
                    return new NeuroAvatarsScreen(jH0, ha9Var);
                }
            };
        }
        return new u65(str, m65Var, bundle, 0, null, false, of9Var, 56);
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
