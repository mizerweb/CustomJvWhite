package defpackage;

import android.os.Bundle;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class j0e extends x9g {
    public static final j0e b = new j0e();

    @Override // defpackage.x9g
    public final t65 d(Bundle bundle) {
        ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
        Boolean boolW = sb8.W(bundle, "can_select_file");
        boolean zBooleanValue = boolW != null ? boolW.booleanValue() : true;
        Long lY = sb8.Y(bundle, "source_id");
        Integer numX = sb8.X(bundle, "mode");
        return new je5(zBooleanValue, lY, rml.c(Integer.valueOf(numX != null ? numX.intValue() : k0e.WEBAPP.a())), ha9Var);
    }

    @Override // defpackage.x9g
    public final void e(w9g w9gVar) {
        f83.d(w9gVar, ":qr-scanner", new String[0], null, 14);
    }
}
