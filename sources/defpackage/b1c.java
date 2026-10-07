package defpackage;

import android.os.Bundle;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
public final class b1c implements c65 {
    public final lve a;

    public b1c(lve lveVar) {
        this.a = lveVar;
    }

    public final Bundle a() {
        Bundle bundle = this.a.d().getBundle("RouterTransaction.controller.bundle");
        if (bundle != null) {
            return bundle.getBundle("Controller.args");
        }
        return null;
    }

    public final ha9 b() {
        Bundle bundleA = a();
        return bundleA != null ? new ha9(bundleA.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE)) : ha9.b;
    }

    public final String c() {
        String str = this.a.b;
        return str == null ? "" : str;
    }
}
