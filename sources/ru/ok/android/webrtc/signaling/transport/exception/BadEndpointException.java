package ru.ok.android.webrtc.signaling.transport.exception;

import defpackage.c0a;
import defpackage.pnl;
import defpackage.sn9;
import defpackage.tn9;
import defpackage.u8h;
import defpackage.ww3;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/android/webrtc/signaling/transport/exception/BadEndpointException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "webrtc-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BadEndpointException extends IllegalArgumentException {
    public final String a;

    public BadEndpointException(String str) {
        str.getClass();
        Set setP1 = a.p1(new String[]{ApiProtocol.KEY_TOKEN, "auth_data", "credential", "auth_token", "session_data"});
        if (!setP1.isEmpty()) {
            Matcher matcher = Pattern.compile("(?<=[?&])(" + ww3.z1(setP1, "|", null, null, new u8h(20), 30) + ")=[^&]*").matcher(str);
            int i = 0;
            tn9 tn9VarA = pnl.a(matcher, 0, str);
            if (tn9VarA == null) {
                str = str.toString();
            } else {
                int length = str.length();
                StringBuilder sb = new StringBuilder(length);
                do {
                    sb.append((CharSequence) str, i, tn9VarA.b().a);
                    sb.append((CharSequence) (((sn9) tn9VarA.a()).get(1) + "=<ERASED_SECRET>"));
                    i = tn9VarA.b().b + 1;
                    tn9VarA = tn9VarA.d();
                    if (i >= length) {
                        break;
                    }
                } while (tn9VarA != null);
                if (i < length) {
                    sb.append((CharSequence) str, i, length);
                }
                str = sb.toString();
            }
        }
        this.a = c0a.o("Unexpected endpoint: \"", str, "\"");
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
