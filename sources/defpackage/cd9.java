package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.location.map.show.ShowLocationScreen;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class cd9 implements h65 {
    public static final cd9 a = new cd9();
    public static final dd9 b = dd9.c;

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        t65 ad9Var;
        if (!((LinkedHashSet) b.b).contains(m65Var)) {
            return null;
        }
        final ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
        dd9.c.getClass();
        if (m65Var.equals(dd9.d)) {
            ad9Var = new ad9(sb8.h0(bundle, "chat_id"), sb8.g0(bundle, "request_code"), ha9Var, bundle.getString("chat_scope_id"));
        } else {
            if (!m65Var.equals(dd9.e)) {
                ore.k(qt4.m("invalid route ", m65Var));
                return null;
            }
            final Long lY = sb8.Y(bundle, "chat_id");
            final Long lY2 = sb8.Y(bundle, "sender_id");
            final Long lY3 = sb8.Y(bundle, "msg_id");
            String string = bundle.getString("lat");
            Double dValueOf = string != null ? Double.valueOf(Double.parseDouble(string)) : null;
            if (dValueOf == null) {
                ore.p("Required value was null.");
                return null;
            }
            final double dDoubleValue = dValueOf.doubleValue();
            String string2 = bundle.getString("lon");
            Double dValueOf2 = string2 != null ? Double.valueOf(Double.parseDouble(string2)) : null;
            if (dValueOf2 == null) {
                ore.p("Required value was null.");
                return null;
            }
            final double dDoubleValue2 = dValueOf2.doubleValue();
            String string3 = bundle.getString("z");
            final Float fValueOf = string3 != null ? Float.valueOf(Float.parseFloat(string3)) : null;
            Integer numX = sb8.X(bundle, "source_type_id");
            final int iIntValue = numX != null ? numX.intValue() : 0;
            Long lY4 = sb8.Y(bundle, "source_id");
            final long jLongValue = lY4 != null ? lY4.longValue() : 0L;
            ad9Var = new t65() { // from class: bd9
                @Override // defpackage.t65
                public final Object t() {
                    return new ShowLocationScreen(lY, lY2, lY3, dDoubleValue, dDoubleValue2, fValueOf, iIntValue, jLongValue, ha9Var);
                }
            };
        }
        return new u65(str, m65Var, bundle, 1, new q65(new q38(28), new q38(29)), false, ad9Var, 32);
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
