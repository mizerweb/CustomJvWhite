package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.sdk.arch.Widget;
import one.me.settings.twofa.password.TwoFACheckPassScreen;

/* JADX INFO: loaded from: classes.dex */
public final class f7i implements h65 {
    public static final f7i a = new f7i();
    public static final g7i b = g7i.c;

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        t65 d27Var;
        t65 d7iVar;
        m6i m6iVar = m6i.d;
        if (((LinkedHashSet) b.b).contains(m65Var)) {
            final ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
            g7i.c.getClass();
            if (!m65Var.equals(g7i.d)) {
                if (m65Var.equals(g7i.e)) {
                    d7iVar = new d7i(sb8.j0(bundle, "src"), sb8.j0(bundle, "track_id"), ha9Var, 0);
                } else if (m65Var.equals(g7i.f)) {
                    d27Var = new ruf(9, ha9Var);
                } else if (m65Var.equals(g7i.h)) {
                    final String strJ0 = sb8.j0(bundle, "track_id");
                    final String strJ1 = sb8.j0(bundle, "phone");
                    final String string = bundle.getString("hint");
                    final String string2 = bundle.getString("email");
                    Integer numX = sb8.X(bundle, "p_mn_l");
                    final int iIntValue = numX != null ? numX.intValue() : m6iVar.c();
                    Integer numX2 = sb8.X(bundle, "p_mx_l");
                    final int iIntValue2 = numX2 != null ? numX2.intValue() : m6iVar.b();
                    Integer numX3 = sb8.X(bundle, "h_mx_l");
                    final int iIntValue3 = numX3 != null ? numX3.intValue() : m6iVar.a();
                    d7iVar = new t65() { // from class: e7i
                        @Override // defpackage.t65
                        public final Object t() {
                            int i = 0;
                            return new TwoFACheckPassScreen("AUTH", strJ0, ha9Var, new pk8(null, string, new ok8(i, 14, 0L, string2, null), strJ1, new m6i(iIntValue, iIntValue2, iIntValue3), 1));
                        }
                    };
                } else if (m65Var.equals(g7i.g)) {
                    d27Var = new d27(bundle.getString("hint"), ha9Var, 4);
                } else {
                    String name = f7i.class.getName();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(qv1.h("invalid route ", m65Var));
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, name, qv1.h("invalid route ", m65Var), illegalArgumentException);
                        }
                    }
                }
                return new u65(str, m65Var, bundle, 0, null, false, d7iVar, 56);
            }
            d27Var = new d27(sb8.j0(bundle, "state"), ha9Var, 3);
            d7iVar = d27Var;
            return new u65(str, m65Var, bundle, 0, null, false, d7iVar, 56);
        }
        return null;
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
