package defpackage;

import org.webrtc.PeerConnection;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v8 gdc[], still in use, count: 1, list:
  (r0v8 gdc[]) from 0x00b8: CONSTRUCTOR (r0v8 gdc[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class gdc {
    /* JADX INFO: Fake field, exist only in values array */
    DISCARD_REASON_REUSE_NOT_IMPLEMENTED(1),
    /* JADX INFO: Fake field, exist only in values array */
    DISCARD_REASON_WORKAROUND(2),
    /* JADX INFO: Fake field, exist only in values array */
    DISCARD_REASON_APP_OVERRIDE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DISCARD_REASON_MIME_TYPE_CHANGED(8),
    /* JADX INFO: Fake field, exist only in values array */
    DISCARD_REASON_OPERATING_RATE_CHANGED(16),
    /* JADX INFO: Fake field, exist only in values array */
    DISCARD_REASON_INITIALIZATION_DATA_CHANGED(32),
    /* JADX INFO: Fake field, exist only in values array */
    DISCARD_REASON_MAX_INPUT_SIZE_EXCEEDED(64),
    /* JADX INFO: Fake field, exist only in values array */
    DISCARD_REASON_DRM_SESSION_CHANGED(np0.m),
    /* JADX INFO: Fake field, exist only in values array */
    DISCARD_REASON_VIDEO_MAX_RESOLUTION_EXCEEDED(np0.n),
    /* JADX INFO: Fake field, exist only in values array */
    DISCARD_REASON_VIDEO_RESOLUTION_CHANGED(np0.o),
    /* JADX INFO: Fake field, exist only in values array */
    DISCARD_REASON_VIDEO_ROTATION_CHANGED(1024),
    /* JADX INFO: Fake field, exist only in values array */
    DISCARD_REASON_VIDEO_COLOR_INFO_CHANGED(np0.q),
    /* JADX INFO: Fake field, exist only in values array */
    DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED(np0.r),
    /* JADX INFO: Fake field, exist only in values array */
    DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED(8192),
    /* JADX INFO: Fake field, exist only in values array */
    DISCARD_REASON_AUDIO_ENCODING_CHANGED(16384),
    /* JADX INFO: Fake field, exist only in values array */
    DISCARD_REASON_AUDIO_BYPASS_POSSIBLE(PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS);

    public static final /* synthetic */ ma6 c;
    public final int a;

    static {
        c = new ma6(gdcVarArr);
    }

    public gdc(int i) {
        super(str, i);
        this.a = i;
    }

    public static gdc valueOf(String str) {
        return (gdc) Enum.valueOf(gdc.class, str);
    }

    public static gdc[] values() {
        return (gdc[]) b.clone();
    }
}
