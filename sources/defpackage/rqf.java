package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class rqf implements h65 {
    public static final rqf a = new rqf();
    public static final sqf b = sqf.c;

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        if (((LinkedHashSet) b.b).contains(m65Var)) {
            ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
            sqf.c.getClass();
            if (m65Var.equals(sqf.d)) {
                return new u65(str, m65Var, bundle, 0, null, false, new i(21, ha9Var), 56);
            }
            String name = rqf.class.getName();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(qv1.h("invalid route ", m65Var));
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, qv1.h("invalid route ", m65Var), illegalArgumentException);
                }
            }
        }
        return null;
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
