package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class bk1 implements h65 {
    public static final bk1 a = new bk1();
    public static final ck1 b = ck1.c;

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        t65 ak1Var;
        if (!((LinkedHashSet) b.b).contains(m65Var)) {
            return null;
        }
        ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
        ck1.c.getClass();
        byte b2 = 0;
        if (m65Var.equals(ck1.d)) {
            ak1Var = new yj1(b2 == true ? 1 : 0, bundle);
        } else if (m65Var.equals(ck1.e)) {
            String string = bundle.getString("call_link");
            String string2 = bundle.getString("call_title");
            Long lY = sb8.Y(bundle, "call_chat_id");
            Boolean boolW = sb8.W(bundle, "is_link_call");
            ak1Var = new zj1(lY, string, string2, boolW != null ? boolW.booleanValue() : false, ha9Var);
        } else {
            if (!m65Var.equals(ck1.f)) {
                ore.k(qt4.m("invalid route ", m65Var));
                return null;
            }
            ak1Var = new ak1(sb8.h0(bundle, "chat_id"), 0, ha9Var);
        }
        return new u65(str, m65Var, bundle, 0, null, false, ak1Var, 56);
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
