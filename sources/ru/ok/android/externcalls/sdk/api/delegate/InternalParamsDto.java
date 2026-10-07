package ru.ok.android.externcalls.sdk.api.delegate;

import defpackage.cqk;
import defpackage.nbh;
import defpackage.np0;
import defpackage.qt4;
import defpackage.qv1;
import defpackage.zo5;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0080\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001b\u001a\u00020\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003Ji\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0014\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010(\u001a\u00020\bHÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006*"}, d2 = {"Lru/ok/android/externcalls/sdk/api/delegate/InternalParamsDto;", "", "platform", "", ApiProtocol.PARAM_SDK_VERSION, ApiProtocol.PARAM_CLIENT_APP_KEY, ApiProtocol.PARAM_DEVICE_ID, ApiProtocol.PARAM_PROTOCOL_VERSION, "", ApiProtocol.PARAM_DOMAIN_ID, ApiProtocol.PARAM_ONLY_ADMIN_CAN_RECORD, "", "isWaitForAdminEnabled", "hexCapability", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZLjava/lang/String;)V", "getPlatform", "()Ljava/lang/String;", "getSdkVersion", "getClientAppKey", "getDeviceId", "getProtocolVersion", "()I", "getDomainId", "getOnlyAdminCanRecord", "()Z", "getHexCapability", "toJson", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class InternalParamsDto {
    private final String clientAppKey;
    private final String deviceId;
    private final String domainId;
    private final String hexCapability;
    private final boolean isWaitForAdminEnabled;
    private final boolean onlyAdminCanRecord;
    private final String platform;
    private final int protocolVersion;
    private final String sdkVersion;

    public InternalParamsDto(String str, String str2, String str3, String str4, int i, String str5, boolean z, boolean z2, String str6) {
        this.platform = str;
        this.sdkVersion = str2;
        this.clientAppKey = str3;
        this.deviceId = str4;
        this.protocolVersion = i;
        this.domainId = str5;
        this.onlyAdminCanRecord = z;
        this.isWaitForAdminEnabled = z2;
        this.hexCapability = str6;
    }

    public static /* synthetic */ InternalParamsDto copy$default(InternalParamsDto internalParamsDto, String str, String str2, String str3, String str4, int i, String str5, boolean z, boolean z2, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = internalParamsDto.platform;
        }
        if ((i2 & 2) != 0) {
            str2 = internalParamsDto.sdkVersion;
        }
        if ((i2 & 4) != 0) {
            str3 = internalParamsDto.clientAppKey;
        }
        if ((i2 & 8) != 0) {
            str4 = internalParamsDto.deviceId;
        }
        if ((i2 & 16) != 0) {
            i = internalParamsDto.protocolVersion;
        }
        if ((i2 & 32) != 0) {
            str5 = internalParamsDto.domainId;
        }
        if ((i2 & 64) != 0) {
            z = internalParamsDto.onlyAdminCanRecord;
        }
        if ((i2 & np0.m) != 0) {
            z2 = internalParamsDto.isWaitForAdminEnabled;
        }
        if ((i2 & np0.n) != 0) {
            str6 = internalParamsDto.hexCapability;
        }
        boolean z3 = z2;
        String str7 = str6;
        String str8 = str5;
        boolean z4 = z;
        int i3 = i;
        String str9 = str3;
        return internalParamsDto.copy(str, str2, str9, str4, i3, str8, z4, z3, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getClientAppKey() {
        return this.clientAppKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getProtocolVersion() {
        return this.protocolVersion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDomainId() {
        return this.domainId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getOnlyAdminCanRecord() {
        return this.onlyAdminCanRecord;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsWaitForAdminEnabled() {
        return this.isWaitForAdminEnabled;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getHexCapability() {
        return this.hexCapability;
    }

    public final InternalParamsDto copy(String platform, String sdkVersion, String clientAppKey, String deviceId, int protocolVersion, String domainId, boolean onlyAdminCanRecord, boolean isWaitForAdminEnabled, String hexCapability) {
        return new InternalParamsDto(platform, sdkVersion, clientAppKey, deviceId, protocolVersion, domainId, onlyAdminCanRecord, isWaitForAdminEnabled, hexCapability);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalParamsDto)) {
            return false;
        }
        InternalParamsDto internalParamsDto = (InternalParamsDto) other;
        return cqk.d(this.platform, internalParamsDto.platform) && cqk.d(this.sdkVersion, internalParamsDto.sdkVersion) && cqk.d(this.clientAppKey, internalParamsDto.clientAppKey) && cqk.d(this.deviceId, internalParamsDto.deviceId) && this.protocolVersion == internalParamsDto.protocolVersion && cqk.d(this.domainId, internalParamsDto.domainId) && this.onlyAdminCanRecord == internalParamsDto.onlyAdminCanRecord && this.isWaitForAdminEnabled == internalParamsDto.isWaitForAdminEnabled && cqk.d(this.hexCapability, internalParamsDto.hexCapability);
    }

    public final String getClientAppKey() {
        return this.clientAppKey;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDomainId() {
        return this.domainId;
    }

    public final String getHexCapability() {
        return this.hexCapability;
    }

    public final boolean getOnlyAdminCanRecord() {
        return this.onlyAdminCanRecord;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final int getProtocolVersion() {
        return this.protocolVersion;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public int hashCode() {
        int iD = zo5.d(this.platform.hashCode() * 31, 31, this.sdkVersion);
        String str = this.clientAppKey;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceId;
        int iC = zo5.c(this.protocolVersion, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.domainId;
        return this.hexCapability.hashCode() + nbh.n(nbh.n((iC + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.onlyAdminCanRecord), 31, this.isWaitForAdminEnabled);
    }

    public final boolean isWaitForAdminEnabled() {
        return this.isWaitForAdminEnabled;
    }

    public final String toJson() {
        return new JSONObject().put("platform", this.platform).put(ApiProtocol.PARAM_SDK_VERSION, this.sdkVersion).putOpt(ApiProtocol.PARAM_CLIENT_APP_KEY, this.clientAppKey).putOpt(ApiProtocol.PARAM_DEVICE_ID, this.deviceId).put(ApiProtocol.PARAM_PROTOCOL_VERSION, this.protocolVersion).putOpt(ApiProtocol.PARAM_DOMAIN_ID, this.domainId).put(ApiProtocol.PARAM_ONLY_ADMIN_CAN_RECORD, this.onlyAdminCanRecord).put(ApiProtocol.PARAM_WAIT_FOR_ADMIN, this.isWaitForAdminEnabled).put(ApiProtocol.PARAM_CAPABILITIES, this.hexCapability).toString();
    }

    public String toString() {
        String str = this.platform;
        String str2 = this.sdkVersion;
        String str3 = this.clientAppKey;
        String str4 = this.deviceId;
        int i = this.protocolVersion;
        String str5 = this.domainId;
        boolean z = this.onlyAdminCanRecord;
        boolean z2 = this.isWaitForAdminEnabled;
        String str6 = this.hexCapability;
        StringBuilder sbQ = qv1.q("InternalParamsDto(platform=", str, ", sdkVersion=", str2, ", clientAppKey=");
        nbh.G(sbQ, str3, ", deviceId=", str4, ", protocolVersion=");
        sbQ.append(i);
        sbQ.append(", domainId=");
        sbQ.append(str5);
        sbQ.append(", onlyAdminCanRecord=");
        qt4.B(", isWaitForAdminEnabled=", ", hexCapability=", sbQ, z, z2);
        return zo5.w(sbQ, str6, ")");
    }
}
