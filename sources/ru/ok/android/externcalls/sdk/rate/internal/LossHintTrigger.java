package ru.ok.android.externcalls.sdk.rate.internal;

import defpackage.j95;
import defpackage.y3e;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.net.internal.monitor.NetworkStat;
import ru.ok.android.externcalls.sdk.rate.RateHint;
import ru.ok.android.externcalls.sdk.rate.loss.LossHintConfig;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0018\u00010\u0012R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0018\u00010\u0012R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/internal/LossHintTrigger;", "Lru/ok/android/externcalls/sdk/rate/internal/HintTrigger;", "Ly3e;", "log", "Lru/ok/android/externcalls/sdk/rate/loss/LossHintConfig;", "config", "Lru/ok/android/externcalls/sdk/rate/internal/RateHintCollection;", "collection", "<init>", "(Ly3e;Lru/ok/android/externcalls/sdk/rate/loss/LossHintConfig;Lru/ok/android/externcalls/sdk/rate/internal/RateHintCollection;)V", "Lru/ok/android/externcalls/sdk/net/internal/monitor/NetworkStat;", "stat", "Lsbi;", "onNetworkStat", "(Lru/ok/android/externcalls/sdk/net/internal/monitor/NetworkStat;)V", "Ly3e;", "Lru/ok/android/externcalls/sdk/rate/loss/LossHintConfig;", "Lru/ok/android/externcalls/sdk/rate/internal/RateHintCollection;", "Lru/ok/android/externcalls/sdk/rate/internal/LossHintTrigger$LossReporter;", "audioReporter", "Lru/ok/android/externcalls/sdk/rate/internal/LossHintTrigger$LossReporter;", "videoReporter", "Companion", "LossReporter", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LossHintTrigger implements HintTrigger {
    private static final String AUDIO_LOSS_HINT_REASON = "audioloss";
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "RateManager";
    private static final String VIDEO_LOSS_HINT_REASON = "videoloss";
    private final LossReporter audioReporter;
    private final RateHintCollection collection;
    private final LossHintConfig config;
    private final y3e log;
    private final LossReporter videoReporter;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R$\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/internal/LossHintTrigger$LossReporter;", "", "", "maxLoss", "", "lossCount", "", "hintKey", "<init>", "(Lru/ok/android/externcalls/sdk/rate/internal/LossHintTrigger;JILjava/lang/String;)V", "", "loss", "Lsbi;", "onNewLoss", "(F)V", "J", "getMaxLoss", "()J", "I", "getLossCount", "()I", "Ljava/lang/String;", "getHintKey", "()Ljava/lang/String;", "lossDetectionCount", "", SdkMetricStatEvent.VALUE_KEY, "wasReported", "Z", "getWasReported", "()Z", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class LossReporter {
        private final String hintKey;
        private final int lossCount;
        private int lossDetectionCount;
        private final long maxLoss;
        private boolean wasReported;

        public LossReporter(long j, int i, String str) {
            this.maxLoss = j;
            this.lossCount = i;
            this.hintKey = str;
        }

        public final String getHintKey() {
            return this.hintKey;
        }

        public final int getLossCount() {
            return this.lossCount;
        }

        public final long getMaxLoss() {
            return this.maxLoss;
        }

        public final boolean getWasReported() {
            return this.wasReported;
        }

        public final void onNewLoss(float loss) {
            float f = this.maxLoss / 100.0f;
            LossHintTrigger.this.log.log("RateManager", "measured " + this.hintKey + ": " + loss);
            if (loss >= f) {
                this.lossDetectionCount++;
            } else {
                this.lossDetectionCount = 0;
            }
            if (this.lossDetectionCount >= this.lossCount) {
                LossHintTrigger.this.collection.addRateHint(new RateHint(this.hintKey + "_" + this.maxLoss));
                this.wasReported = true;
            }
        }
    }

    public LossHintTrigger(y3e y3eVar, LossHintConfig lossHintConfig, RateHintCollection rateHintCollection) {
        LossHintTrigger lossHintTrigger;
        LossReporter lossReporter;
        LossHintTrigger lossHintTrigger2;
        this.log = y3eVar;
        this.config = lossHintConfig;
        this.collection = rateHintCollection;
        Long audioLoss = lossHintConfig.getAudioLoss();
        LossReporter lossReporter2 = null;
        if (audioLoss != null) {
            lossHintTrigger = this;
            lossReporter = lossHintTrigger.new LossReporter(audioLoss.longValue(), lossHintConfig.getAudioLossCount(), AUDIO_LOSS_HINT_REASON);
        } else {
            lossHintTrigger = this;
            lossReporter = null;
        }
        lossHintTrigger.audioReporter = lossReporter;
        Long videoLoss = lossHintConfig.getVideoLoss();
        if (videoLoss != null) {
            lossHintTrigger2 = lossHintTrigger;
            lossReporter2 = lossHintTrigger2.new LossReporter(videoLoss.longValue(), lossHintConfig.getVideoLossCount(), VIDEO_LOSS_HINT_REASON);
        } else {
            lossHintTrigger2 = lossHintTrigger;
        }
        lossHintTrigger2.videoReporter = lossReporter2;
    }

    @Override // ru.ok.android.externcalls.sdk.rate.internal.HintTrigger
    public void onNetworkStat(NetworkStat stat) {
        Float videoLoss;
        Float audioLoss;
        LossReporter lossReporter = this.audioReporter;
        if (lossReporter != null && !lossReporter.getWasReported() && (audioLoss = stat.getAudioLoss()) != null) {
            this.audioReporter.onNewLoss(audioLoss.floatValue());
        }
        LossReporter lossReporter2 = this.videoReporter;
        if (lossReporter2 == null || lossReporter2.getWasReported() || (videoLoss = stat.getVideoLoss()) == null) {
            return;
        }
        this.videoReporter.onNewLoss(videoLoss.floatValue());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/internal/LossHintTrigger$Companion;", "", "<init>", "()V", "AUDIO_LOSS_HINT_REASON", "", "VIDEO_LOSS_HINT_REASON", "LOG_TAG", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }
}
