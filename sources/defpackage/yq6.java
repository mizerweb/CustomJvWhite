package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import one.me.filedownloadwarning.FileDownloadWarningBottomSheet;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class yq6 extends x9g {
    public static final yq6 b = new yq6();

    @Override // defpackage.x9g
    public final f2 c() {
        return new q65(new s35(20), new s35(21));
    }

    @Override // defpackage.x9g
    public final t65 d(Bundle bundle) {
        final ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
        final long jH0 = sb8.h0(bundle, "chat_id");
        final long jH1 = sb8.h0(bundle, "message_id");
        final String string = bundle.getString("attach_id");
        final long jH2 = sb8.h0(bundle, "file_id");
        final String strJ0 = sb8.j0(bundle, "file_name");
        final long jH3 = sb8.h0(bundle, "file_size");
        Parcelable parcelable = bundle.getParcelable("file_url");
        if (parcelable != null) {
            final Uri uri = (Uri) parcelable;
            return new t65() { // from class: xq6
                @Override // defpackage.t65
                public final Object t() {
                    return new FileDownloadWarningBottomSheet(jH0, jH1, string, jH2, strJ0, uri.toString(), jH3, ha9Var);
                }
            };
        }
        ore.p("Required value was null.");
        return null;
    }

    @Override // defpackage.x9g
    public final void e(w9g w9gVar) {
        f83.d(w9gVar, ":dialogs/file-download-warning", new String[]{"chat_id", "message_id", "file_id", "file_name", "file_size"}, Collections.singleton("file_url"), 12);
    }
}
