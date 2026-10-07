package defpackage;

import android.os.Bundle;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class uyf extends x9g {
    public static final uyf b = new uyf();

    @Override // defpackage.x9g
    public final f2 c() {
        return s65.c;
    }

    @Override // defpackage.x9g
    public final t65 d(Bundle bundle) {
        final ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
        final long jH0 = sb8.h0(bundle, "msg_id");
        final long jH1 = sb8.h0(bundle, "attach_id");
        final String strJ0 = sb8.j0(bundle, "local_attach_id");
        final int iG0 = sb8.g0(bundle, "cause_ordinal");
        final Integer numX = sb8.X(bundle, "snack_bot_margin");
        final Boolean boolW = sb8.W(bundle, "force_dark");
        return new t65() { // from class: tyf
            @Override // defpackage.t65
            public final Object t() {
                return new ChatMediaDownloadBottomSheet(jH0, jH1, strJ0, iG0, numX, boolW, ha9Var);
            }
        };
    }

    @Override // defpackage.x9g
    public final void e(w9g w9gVar) {
        f83.d(w9gVar, ":dialogs/share-media", new String[]{"msg_id", "attach_id", "local_attach_id", "cause_ordinal"}, null, 14);
    }
}
