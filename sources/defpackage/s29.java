package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class s29 implements h65 {
    public static final s29 a = new s29();
    public static final t29 b = t29.c;

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        if (!((LinkedHashSet) t29.c.b).contains(m65Var)) {
            return null;
        }
        return new u65(str, m65Var, bundle, 0, s65.c, false, new vi6(bundle, new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE)), 2), 40);
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
