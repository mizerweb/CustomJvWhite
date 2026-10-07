package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class suf implements h65 {
    public static final suf a = new suf();
    public static final tuf b = tuf.c;

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        t65 d27Var;
        t65 rufVar;
        if (((LinkedHashSet) b.b).contains(m65Var)) {
            ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
            tuf.c.getClass();
            if (m65Var.equals(tuf.d)) {
                rufVar = new i(27, ha9Var);
            } else if (m65Var.equals(tuf.e)) {
                rufVar = new i(28, ha9Var);
            } else if (m65Var.equals(tuf.f)) {
                rufVar = new i(29, ha9Var);
            } else {
                if (m65Var.equals(tuf.g)) {
                    String strJ0 = sb8.j0(bundle, "mode");
                    if (strJ0.equals("setup")) {
                        rufVar = new ruf(0, ha9Var);
                    } else {
                        if (!strJ0.equals("confirm")) {
                            ore.k("illegal mode");
                            return null;
                        }
                        d27Var = new d27(sb8.j0(bundle, "hash"), ha9Var, 2);
                    }
                    return new u65(str, m65Var, bundle, 0, null, false, d27Var, 56);
                }
                String name = suf.class.getName();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(qv1.h("invalid route ", m65Var));
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, qv1.h("invalid route ", m65Var), illegalArgumentException);
                    }
                }
            }
            d27Var = rufVar;
            return new u65(str, m65Var, bundle, 0, null, false, d27Var, 56);
        }
        return null;
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
