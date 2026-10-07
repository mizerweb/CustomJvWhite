package defpackage;

import android.net.Uri;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class tn implements zo {
    public static final Uri b = fq.b("auth.anonymLogin");
    public final String a;

    public tn(String str) {
        this.a = str;
    }

    @Override // defpackage.zo
    public final vo getConfigExtractor() {
        return ldf.b;
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
        return b;
    }

    @Override // defpackage.op
    public final void writeParams(mv8 mv8Var) {
        mv8Var.a0("session_data");
        mv8Var.p();
        mv8Var.a0(AnalyticsBaseParamsConstantsKt.DEVICE_ID).p0(this.a);
        ((x1) mv8Var.a0("version")).y(2);
        mv8Var.a0("client_version").p0("android_8");
        mv8Var.a0(ApiProtocol.KEY_CLIENT_TYPE).p0("SDK_ANDROID");
        mv8Var.t();
    }
}
