package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class ihg implements h65 {
    public static final ihg a = new ihg();
    public static final khg b = khg.c;

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        t65 ak1Var;
        t65 e27Var;
        if (((LinkedHashSet) b.b).contains(m65Var)) {
            ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
            khg.c.getClass();
            if (m65Var.equals(khg.d)) {
                ak1Var = new ruf(3, ha9Var);
            } else if (m65Var.equals(khg.e)) {
                ak1Var = new ruf(4, ha9Var);
            } else {
                if (!m65Var.equals(khg.f)) {
                    if (m65Var.equals(khg.g)) {
                        e27Var = new e27(1, sb8.Z(bundle, "ids"), ha9Var);
                    } else if (m65Var.equals(khg.h)) {
                        ak1Var = new ak1(sb8.h0(bundle, "id"), 8, ha9Var);
                    } else {
                        String name = ihg.class.getName();
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(qv1.h("invalid route ", m65Var));
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, name, qv1.h("invalid route ", m65Var), illegalArgumentException);
                            }
                        }
                    }
                    return new u65(str, m65Var, bundle, 1, null, false, e27Var, 48);
                }
                ak1Var = new ruf(5, ha9Var);
            }
            e27Var = ak1Var;
            return new u65(str, m65Var, bundle, 1, null, false, e27Var, 48);
        }
        return null;
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
