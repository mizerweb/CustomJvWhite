package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class utf implements h65 {
    public static final utf a = new utf();
    public static final vtf b = vtf.c;

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        t65 d27Var;
        i iVar;
        if (((LinkedHashSet) b.b).contains(m65Var)) {
            ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
            vtf.c.getClass();
            if (!m65Var.equals(vtf.d)) {
                if (m65Var.equals(vtf.e)) {
                    iVar = new i(26, ha9Var);
                } else if (m65Var.equals(vtf.f)) {
                    d27Var = new d27(sb8.j0(bundle, "type"), ha9Var);
                } else {
                    String name = utf.class.getName();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(qv1.h("invalid route ", m65Var));
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, name, qv1.h("invalid route ", m65Var), illegalArgumentException);
                        }
                    }
                }
                return new u65(str, m65Var, bundle, 0, null, false, d27Var, 56);
            }
            iVar = new i(25, ha9Var);
            d27Var = iVar;
            return new u65(str, m65Var, bundle, 0, null, false, d27Var, 56);
        }
        return null;
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
