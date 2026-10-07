package ru.ok.android.externcalls.sdk.urlsharing.external;

import defpackage.cqk;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingInfo;", "", MLFeatureConfigProviderBase.URL_KEY, "", "initiatorId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "<init>", "(Ljava/lang/String;Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "getUrl", "()Ljava/lang/String;", "getInitiatorId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class UrlSharingInfo {
    private final ParticipantId initiatorId;
    private final String url;

    public UrlSharingInfo(String str, ParticipantId participantId) {
        this.url = str;
        this.initiatorId = participantId;
    }

    public static /* synthetic */ UrlSharingInfo copy$default(UrlSharingInfo urlSharingInfo, String str, ParticipantId participantId, int i, Object obj) {
        if ((i & 1) != 0) {
            str = urlSharingInfo.url;
        }
        if ((i & 2) != 0) {
            participantId = urlSharingInfo.initiatorId;
        }
        return urlSharingInfo.copy(str, participantId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ParticipantId getInitiatorId() {
        return this.initiatorId;
    }

    public final UrlSharingInfo copy(String str, ParticipantId initiatorId) {
        return new UrlSharingInfo(str, initiatorId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UrlSharingInfo)) {
            return false;
        }
        UrlSharingInfo urlSharingInfo = (UrlSharingInfo) other;
        return cqk.d(this.url, urlSharingInfo.url) && cqk.d(this.initiatorId, urlSharingInfo.initiatorId);
    }

    public final ParticipantId getInitiatorId() {
        return this.initiatorId;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        ParticipantId participantId = this.initiatorId;
        return iHashCode + (participantId == null ? 0 : participantId.hashCode());
    }

    public String toString() {
        return "UrlSharingInfo(url=" + this.url + ", initiatorId=" + this.initiatorId + ")";
    }
}
