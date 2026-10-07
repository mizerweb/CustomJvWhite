package defpackage;

import android.os.Bundle;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class ntf extends x9g {
    public static final ntf b = new ntf();

    @Override // defpackage.x9g
    public final f2 c() {
        return s65.c;
    }

    @Override // defpackage.x9g
    public final t65 d(Bundle bundle) {
        return new i(24, new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE)));
    }

    @Override // defpackage.x9g
    public final void e(w9g w9gVar) {
        f83.d(w9gVar, ":settings/locale", new String[0], null, 14);
    }
}
