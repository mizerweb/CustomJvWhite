package defpackage;

import android.os.Bundle;
import one.me.complaintbottomsheet.ComplaintBottomSheet;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class w54 extends x9g {
    public static final w54 b = new w54();

    @Override // defpackage.x9g
    public final f2 c() {
        return new q65(new zn3(4), new zn3(5));
    }

    @Override // defpackage.x9g
    public final t65 d(Bundle bundle) {
        final ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
        final Long lY = sb8.Y(bundle, "parent_id");
        final Long lY2 = sb8.Y(bundle, "post_server_id");
        final long[] jArrZ = sb8.Z(bundle, "ids");
        final String string = bundle.getString("type");
        final Integer numX = sb8.X(bundle, "source_screen");
        Boolean boolW = sb8.W(bundle, "is_dark");
        final boolean zBooleanValue = boolW != null ? boolW.booleanValue() : false;
        return new t65() { // from class: v54
            @Override // defpackage.t65
            public final Object t() {
                return new ComplaintBottomSheet(lY, lY2, jArrZ, string, numX, ha9Var, zBooleanValue);
            }
        };
    }

    @Override // defpackage.x9g
    public final void e(w9g w9gVar) {
        f83.d(w9gVar, ":complaint", new String[0], null, 14);
    }
}
