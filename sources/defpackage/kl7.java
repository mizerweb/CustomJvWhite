package defpackage;

import android.net.Uri;
import java.util.Locale;
import ru.ok.android.externcalls.analytics.internal.upload.UploadHelper;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class kl7 implements rp, jsb, zo {
    public final /* synthetic */ jt0 a;

    public kl7(String str, nji njiVar, String str2) {
        Uri uriB = fq.b("vchat.getLogUploadUrl");
        np npVar = new np();
        npVar.a(new j5h(ApiProtocol.PARAM_CONVERSATION_ID, str));
        npVar.a(new j5h(ApiProtocol.PARAM_WEB_RTC_PLATFORM, UploadHelper.SDK_TYPE_STRING));
        npVar.a(new j5h("type", njiVar.name().toLowerCase(Locale.ROOT)));
        if (str2 != null) {
            npVar.a(new j5h(ApiProtocol.PARAM_ANONYM_TOKEN, str2));
        }
        this.a = new jt0(uriB, up.c, npVar, ll7.b);
    }

    @Override // defpackage.op
    public final boolean canRepeat() {
        return this.a.c.b;
    }

    @Override // defpackage.zo
    public final vo getConfigExtractor() {
        this.a.getClass();
        return vo.M;
    }

    @Override // defpackage.zo
    public final hu8 getFailParser() {
        this.a.getClass();
        return l6m.c;
    }

    @Override // defpackage.zo
    public final hu8 getOkParser() {
        return this.a.d;
    }

    @Override // defpackage.op
    public final int getPriority() {
        this.a.getClass();
        return 16;
    }

    @Override // defpackage.op
    public final up getScope() {
        return this.a.b;
    }

    @Override // defpackage.zo
    public final vp getScopeAfter() {
        this.a.getClass();
        return vp.a;
    }

    @Override // defpackage.op
    public final Uri getUri() {
        return this.a.a;
    }

    @Override // defpackage.jsb
    public final Object handleInterruptedIO() {
        return new ll7(null);
    }

    @Override // defpackage.op
    public final boolean shouldNeverGzip() {
        this.a.getClass();
        return false;
    }

    @Override // defpackage.op
    public final boolean shouldNeverPost() {
        this.a.getClass();
        return false;
    }

    @Override // defpackage.op
    public final boolean willWriteParams() {
        return this.a.c.d;
    }

    @Override // defpackage.op
    public final boolean willWriteSupplyParams() {
        return this.a.c.e;
    }

    @Override // defpackage.op
    public final void writeParams(mv8 mv8Var) {
        this.a.writeParams(mv8Var);
    }

    @Override // defpackage.op
    public final void writeSupplyParams(mv8 mv8Var) {
        this.a.writeSupplyParams(mv8Var);
    }
}
