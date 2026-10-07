package defpackage;

import android.net.Uri;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import javax.inject.Provider;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class vuh implements zo {
    public final Provider a;
    public final String b;

    public vuh(String str, Provider provider) {
        this.b = str;
        this.a = provider;
    }

    @Override // defpackage.zo
    public final hu8 getOkParser() {
        return dul.c;
    }

    @Override // defpackage.op
    public final up getScope() {
        return up.b;
    }

    @Override // defpackage.zo
    public final vp getScopeAfter() {
        return vp.b;
    }

    @Override // defpackage.op
    public final Uri getUri() {
        return fq.b("auth.anonymLogin");
    }

    @Override // defpackage.op
    public final void writeParams(mv8 mv8Var) {
        mv8Var.a0("session_data");
        mv8Var.p();
        String str = (String) this.a.get();
        if (str != null) {
            mv8Var.a0("auth_token").p0(str);
        }
        ((x1) mv8Var.a0("version")).y(3);
        mv8Var.a0(AnalyticsBaseParamsConstantsKt.DEVICE_ID).p0(this.b);
        ((x1) mv8Var.a0("client_version")).y(1);
        mv8Var.a0(ApiProtocol.KEY_CLIENT_TYPE).p0("SDK_ANDROID");
        mv8Var.t();
    }
}
