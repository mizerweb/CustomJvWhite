package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class jq8 implements h65 {
    public static final jq8 a = new jq8();
    public static final kq8 b = kq8.c;

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        if (!((LinkedHashSet) b.b).contains(m65Var)) {
            return null;
        }
        q65 q65Var = new q65(new q38(13), new q38(14));
        kq8.c.getClass();
        if (m65Var.equals(kq8.d)) {
            return new u65(str, m65Var, bundle, 0, q65Var, false, new jw2(sb8.h0(bundle, "id"), sb8.j0(bundle, "link"), new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE)), 2), 40);
        }
        ore.k(qt4.m("unknown screen ", m65Var));
        return null;
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
