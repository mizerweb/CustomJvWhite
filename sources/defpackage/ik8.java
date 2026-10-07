package defpackage;

import ru.ok.android.externcalls.analytics.internal.upload.UploadHelper;
import ru.ok.android.externcalls.sdk.api.delegate.InternalParamsDto;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;

/* JADX INFO: loaded from: classes3.dex */
public final class ik8 {
    public final yo a;
    public final mo b;

    public ik8(yo yoVar, mo moVar) {
        this.a = yoVar;
        this.b = moVar;
    }

    public final String a(StartCallApiParams startCallApiParams) {
        String str = this.b != null ? "CGPGAGLGDIHBABABA" : null;
        yo yoVar = this.a;
        return new InternalParamsDto(UploadHelper.SDK_TYPE_STRING, "0.2.6", str, yoVar != null ? ((ek5) ((ny8) ((uii) ((ot4) yoVar).b).g).getValue()).a() : null, startCallApiParams.getIsMultipleDevicesEnabled() ? 6 : 5, startCallApiParams.getDomainId(), false, startCallApiParams.getIsWaitForAdminEnabled(), startCallApiParams.getHexCapability()).toJson();
    }
}
