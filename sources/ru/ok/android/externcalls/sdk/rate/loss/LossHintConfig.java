package ru.ok.android.externcalls.sdk.rate.loss;

import defpackage.cqk;
import defpackage.j95;
import defpackage.zo5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J:\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013¨\u0006 "}, d2 = {"Lru/ok/android/externcalls/sdk/rate/loss/LossHintConfig;", "", "audioLoss", "", "videoLoss", "audioLossCount", "", "videoLossCount", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;II)V", "getAudioLoss", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVideoLoss", "getAudioLossCount", "()I", "getVideoLossCount", "isNotEmpty", "", "()Z", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Long;II)Lru/ok/android/externcalls/sdk/rate/loss/LossHintConfig;", "equals", "other", "hashCode", "toString", "", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class LossHintConfig {
    public static final String AUDIO_LOSS = "audio_loss";
    public static final String VIDEO_LOSS = "video_loss";
    private final Long audioLoss;
    private final int audioLossCount;
    private final Long videoLoss;
    private final int videoLossCount;

    public /* synthetic */ LossHintConfig(Long l, Long l2, int i, int i2, int i3, j95 j95Var) {
        this((i3 & 1) != 0 ? null : l, (i3 & 2) != 0 ? null : l2, (i3 & 4) != 0 ? 1 : i, (i3 & 8) != 0 ? 1 : i2);
    }

    public static /* synthetic */ LossHintConfig copy$default(LossHintConfig lossHintConfig, Long l, Long l2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            l = lossHintConfig.audioLoss;
        }
        if ((i3 & 2) != 0) {
            l2 = lossHintConfig.videoLoss;
        }
        if ((i3 & 4) != 0) {
            i = lossHintConfig.audioLossCount;
        }
        if ((i3 & 8) != 0) {
            i2 = lossHintConfig.videoLossCount;
        }
        return lossHintConfig.copy(l, l2, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getAudioLoss() {
        return this.audioLoss;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getVideoLoss() {
        return this.videoLoss;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAudioLossCount() {
        return this.audioLossCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getVideoLossCount() {
        return this.videoLossCount;
    }

    public final LossHintConfig copy(Long audioLoss, Long videoLoss, int audioLossCount, int videoLossCount) {
        return new LossHintConfig(audioLoss, videoLoss, audioLossCount, videoLossCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LossHintConfig)) {
            return false;
        }
        LossHintConfig lossHintConfig = (LossHintConfig) other;
        return cqk.d(this.audioLoss, lossHintConfig.audioLoss) && cqk.d(this.videoLoss, lossHintConfig.videoLoss) && this.audioLossCount == lossHintConfig.audioLossCount && this.videoLossCount == lossHintConfig.videoLossCount;
    }

    public final Long getAudioLoss() {
        return this.audioLoss;
    }

    public final int getAudioLossCount() {
        return this.audioLossCount;
    }

    public final Long getVideoLoss() {
        return this.videoLoss;
    }

    public final int getVideoLossCount() {
        return this.videoLossCount;
    }

    public int hashCode() {
        Long l = this.audioLoss;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.videoLoss;
        return Integer.hashCode(this.videoLossCount) + zo5.c(this.audioLossCount, (iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31, 31);
    }

    public final boolean isNotEmpty() {
        return (this.audioLoss == null && this.videoLoss == null) ? false : true;
    }

    public String toString() {
        return "LossHintConfig(audioLoss=" + this.audioLoss + ", videoLoss=" + this.videoLoss + ", audioLossCount=" + this.audioLossCount + ", videoLossCount=" + this.videoLossCount + ")";
    }

    public LossHintConfig(Long l, Long l2, int i, int i2) {
        this.audioLoss = l;
        this.videoLoss = l2;
        this.audioLossCount = i;
        this.videoLossCount = i2;
    }

    public LossHintConfig() {
        this(null, null, 0, 0, 15, null);
    }
}
