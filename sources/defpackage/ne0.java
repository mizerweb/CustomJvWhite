package defpackage;

import android.net.Uri;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class ne0 extends g0 implements rp {
    public final String a;
    public final String b;

    public ne0(String str, String str2) {
        this.a = str2;
        this.b = str;
    }

    @Override // defpackage.op
    public final up getScope() {
        return up.b;
    }

    @Override // defpackage.op
    public final Uri getUri() {
        return fq.b("auth.anonymLogin");
    }

    @Override // defpackage.g0
    public final void populateParams(np npVar) {
        npVar.b("referrer", null);
        String str = this.a;
        npVar.b(ApiProtocol.PARAM_DEVICE_ID, str);
        npVar.a(new xz0("verification_supported", true));
        npVar.b("verification_token", null);
        npVar.b("verification_supported_v", "1");
        npVar.b("client", "test");
        npVar.a(new xz0("gen_token", true));
        if (str == null) {
            str = "test";
        }
        String str2 = this.b;
        npVar.b("session_data", str2 != null ? nbh.w("{\"auth_token\": \"", str2, "\", \"version\": 3, \"device_id\": \"", str, "\", \"client_version\": \"1.0.1\"}") : c0a.o("{\"version\": 2, \"device_id\": \"", str, "\", \"client_version\": \"1.0.1\"}"));
    }
}
