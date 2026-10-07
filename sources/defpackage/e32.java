package defpackage;

import ru.ok.android.externcalls.sdk.rate.loss.LossHintConfig;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v40 e32[], still in use, count: 1, list:
  (r0v40 e32[]) from 0x0226: CONSTRUCTOR (r0v40 e32[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class e32 {
    /* JADX INFO: Fake field, exist only in values array */
    RTT(RttRateHintConfig.RTT),
    /* JADX INFO: Fake field, exist only in values array */
    ScreenShareFreezeCount("ss_freeze_count"),
    /* JADX INFO: Fake field, exist only in values array */
    ScreenShareFreezeDuration("ss_total_freezes_duration"),
    /* JADX INFO: Fake field, exist only in values array */
    CpuUsagePercentTotal("cpu_usage_percent_total"),
    /* JADX INFO: Fake field, exist only in values array */
    CpuScoreMax("cpu_score_max"),
    /* JADX INFO: Fake field, exist only in values array */
    CpuScoreAvg("cpu_score_avg"),
    /* JADX INFO: Fake field, exist only in values array */
    CpuHardwareConcurrency("cpu_hardware_concurrency"),
    /* JADX INFO: Fake field, exist only in values array */
    MemoryUsageMbMax("memory_usage_mb_max"),
    /* JADX INFO: Fake field, exist only in values array */
    MemoryUsageMbAvg("memory_usage_mb_avg"),
    /* JADX INFO: Fake field, exist only in values array */
    BatteryLevelChange("battery_level_change"),
    /* JADX INFO: Fake field, exist only in values array */
    InsertedAudioSamplesForDeceleration("inserted_audio_samples_for_deceleration"),
    /* JADX INFO: Fake field, exist only in values array */
    RemovedAudioSamplesForAcceleration("removed_audio_samples_for_acceleration"),
    /* JADX INFO: Fake field, exist only in values array */
    ConcealedAudioSamples("concealed_audio_samples"),
    /* JADX INFO: Fake field, exist only in values array */
    JitterAudio("jitter_audio"),
    /* JADX INFO: Fake field, exist only in values array */
    ConcealedSilentAudioSamples("concealed_silent_audio_samples"),
    /* JADX INFO: Fake field, exist only in values array */
    ConcealmentAudioAverageSize("concealment_audio_avg_size"),
    /* JADX INFO: Fake field, exist only in values array */
    TotalAudioEnergy("total_audio_energy"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioLossIn("in_audio_loss"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioLoss(LossHintConfig.AUDIO_LOSS),
    /* JADX INFO: Fake field, exist only in values array */
    AudioBytesSent("audio_bytes_sent"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioLevel("audio_level"),
    /* JADX INFO: Fake field, exist only in values array */
    VideoNackSent("nack_sent"),
    /* JADX INFO: Fake field, exist only in values array */
    VideoPliSent("pli_sent"),
    /* JADX INFO: Fake field, exist only in values array */
    VideoFirSent("fir_sent"),
    /* JADX INFO: Fake field, exist only in values array */
    VideoFramesDecoded("frames_decoded"),
    /* JADX INFO: Fake field, exist only in values array */
    VideoFramesDropped("frames_dropped"),
    /* JADX INFO: Fake field, exist only in values array */
    VideoJitter("jitter_video"),
    /* JADX INFO: Fake field, exist only in values array */
    VideoInterframeDelayVariance("interframe_delay_variance"),
    /* JADX INFO: Fake field, exist only in values array */
    VideoFreezeCount("freeze_count"),
    /* JADX INFO: Fake field, exist only in values array */
    VideoTotalFreezesDuration("total_freezes_duration"),
    /* JADX INFO: Fake field, exist only in values array */
    VideoLossIn("in_video_loss"),
    /* JADX INFO: Fake field, exist only in values array */
    VideoLoss(LossHintConfig.VIDEO_LOSS),
    /* JADX INFO: Fake field, exist only in values array */
    VideoNackReceived("nack_received"),
    /* JADX INFO: Fake field, exist only in values array */
    VideoPliReceived("pli_received"),
    /* JADX INFO: Fake field, exist only in values array */
    VideoFirReceived("fir_received"),
    /* JADX INFO: Fake field, exist only in values array */
    VideoAdaptationChanges("adaptation_changes"),
    /* JADX INFO: Fake field, exist only in values array */
    VideoFramesEncoded("frames_encoded"),
    /* JADX INFO: Fake field, exist only in values array */
    VideoBrEncode("br_encode"),
    /* JADX INFO: Fake field, exist only in values array */
    VideoBrTransmit("br_transmit"),
    /* JADX INFO: Fake field, exist only in values array */
    VideoBrRetransmit("br_retransmit");

    public static final /* synthetic */ ma6 c;
    public final String a;

    static {
        c = new ma6(e32VarArr);
    }

    public e32(String str) {
        super(str, i);
        this.a = str;
    }

    public static e32 valueOf(String str) {
        return (e32) Enum.valueOf(e32.class, str);
    }

    public static e32[] values() {
        return (e32[]) b.clone();
    }
}
