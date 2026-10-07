package defpackage;

import android.net.Uri;
import ru.ok.android.onelog.UploadService;

/* JADX INFO: loaded from: classes3.dex */
public final class ari {
    public static CharSequence a(int i, String str) {
        if (str == null) {
            gm0.Y(ari.class.getName(), "Early return in invoke cuz of link == null");
            return null;
        }
        int i2 = i == 0 ? -1 : zqi.$EnumSwitchMapping$0[qt4.D(i)];
        if (i2 == -1) {
            return str;
        }
        if (i2 != 1) {
            ore.o();
            return null;
        }
        if (i == 0) {
            throw null;
        }
        Uri uri = Uri.parse(str.toString());
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!cqk.d(str2, "utm_source")) {
                builderClearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        builderClearQuery.appendQueryParameter("utm_source", UploadService.EXTRA_TRIGGER);
        return builderClearQuery.build().toString();
    }
}
