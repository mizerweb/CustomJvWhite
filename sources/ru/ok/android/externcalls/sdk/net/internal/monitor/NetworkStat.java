package ru.ok.android.externcalls.sdk.net.internal.monitor;

import defpackage.cqk;
import defpackage.j95;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\bHÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ok/android/externcalls/sdk/net/internal/monitor/NetworkStat;", "", "rttMs", "", "audioLoss", "", "videoLoss", "activeCandidateType", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;)V", "getRttMs", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAudioLoss", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getVideoLoss", "getActiveCandidateType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;)Lru/ok/android/externcalls/sdk/net/internal/monitor/NetworkStat;", "equals", "", "other", "hashCode", "toString", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class NetworkStat {
    private final String activeCandidateType;
    private final Float audioLoss;
    private final Integer rttMs;
    private final Float videoLoss;

    public /* synthetic */ NetworkStat(Integer num, Float f, Float f2, String str, int i, j95 j95Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : f2, (i & 8) != 0 ? null : str);
    }

    public static /* synthetic */ NetworkStat copy$default(NetworkStat networkStat, Integer num, Float f, Float f2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = networkStat.rttMs;
        }
        if ((i & 2) != 0) {
            f = networkStat.audioLoss;
        }
        if ((i & 4) != 0) {
            f2 = networkStat.videoLoss;
        }
        if ((i & 8) != 0) {
            str = networkStat.activeCandidateType;
        }
        return networkStat.copy(num, f, f2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getRttMs() {
        return this.rttMs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getAudioLoss() {
        return this.audioLoss;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getVideoLoss() {
        return this.videoLoss;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getActiveCandidateType() {
        return this.activeCandidateType;
    }

    public final NetworkStat copy(Integer rttMs, Float audioLoss, Float videoLoss, String activeCandidateType) {
        return new NetworkStat(rttMs, audioLoss, videoLoss, activeCandidateType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkStat)) {
            return false;
        }
        NetworkStat networkStat = (NetworkStat) other;
        return cqk.d(this.rttMs, networkStat.rttMs) && cqk.d(this.audioLoss, networkStat.audioLoss) && cqk.d(this.videoLoss, networkStat.videoLoss) && cqk.d(this.activeCandidateType, networkStat.activeCandidateType);
    }

    public final String getActiveCandidateType() {
        return this.activeCandidateType;
    }

    public final Float getAudioLoss() {
        return this.audioLoss;
    }

    public final Integer getRttMs() {
        return this.rttMs;
    }

    public final Float getVideoLoss() {
        return this.videoLoss;
    }

    public int hashCode() {
        Integer num = this.rttMs;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f = this.audioLoss;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.videoLoss;
        int iHashCode3 = (iHashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str = this.activeCandidateType;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "NetworkStat(rttMs=" + this.rttMs + ", audioLoss=" + this.audioLoss + ", videoLoss=" + this.videoLoss + ", activeCandidateType=" + this.activeCandidateType + ")";
    }

    public NetworkStat(Integer num, Float f, Float f2, String str) {
        this.rttMs = num;
        this.audioLoss = f;
        this.videoLoss = f2;
        this.activeCandidateType = str;
    }

    public NetworkStat() {
        this(null, null, null, null, 15, null);
    }
}
