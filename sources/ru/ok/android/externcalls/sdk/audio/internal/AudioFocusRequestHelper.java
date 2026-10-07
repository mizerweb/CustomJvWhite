package ru.ok.android.externcalls.sdk.audio.internal;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import defpackage.af7;
import defpackage.j95;
import defpackage.n80;
import defpackage.np0;
import defpackage.sbi;
import defpackage.ux8;
import defpackage.v80;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.Logger;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ!\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0007¢\u0006\u0004\b!\u0010\u001aJ\u000f\u0010\"\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\"\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper;", "", "Landroid/media/AudioManager;", "audioManager", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;", "onMuteListener", "Landroid/os/Handler;", "mainThreadHandler", "workerThreadHandler", "Lkotlin/Function0;", "", "isDestroyed", "Lru/ok/android/externcalls/sdk/audio/Logger;", "logger", "Lsbi;", "onFocusLost", "onFocusGained", "<init>", "(Landroid/media/AudioManager;Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;Landroid/os/Handler;Landroid/os/Handler;Laf7;Lru/ok/android/externcalls/sdk/audio/Logger;Laf7;Laf7;)V", "T", "context", "", "requestResult", "handleAudioFocusRequestResult", "(Ljava/lang/Object;I)Ljava/lang/Object;", "mute", "()V", "muteForever", "unmute", "focusGained", "forever", "handleFocusUpdate", "(ZZ)V", "requestFocus", "releaseFocus", "Landroid/media/AudioManager;", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;", "Landroid/os/Handler;", "Laf7;", "Lru/ok/android/externcalls/sdk/audio/Logger;", "Landroid/media/AudioFocusRequest;", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioFocusListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "isFocusGained", "Z", "Companion", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AudioFocusRequestHelper {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final long RE_REQUEST_FOCUS_DELAY_MILLIS = 2000;

    @Deprecated
    public static final String TAG = "AudioFocusRequestHelper";
    private AudioManager.OnAudioFocusChangeListener audioFocusListener;
    private AudioFocusRequest audioFocusRequest;
    private final AudioManager audioManager;
    private final af7 isDestroyed;
    private boolean isFocusGained;
    private final Logger logger;
    private final Handler mainThreadHandler;
    private final af7 onFocusGained;
    private final af7 onFocusLost;
    private final CallsAudioManager.OnMuteListener onMuteListener;
    private final Handler workerThreadHandler;

    public /* synthetic */ AudioFocusRequestHelper(AudioManager audioManager, CallsAudioManager.OnMuteListener onMuteListener, Handler handler, Handler handler2, af7 af7Var, Logger logger, af7 af7Var2, af7 af7Var3, int i, j95 j95Var) {
        this(audioManager, onMuteListener, handler, handler2, af7Var, logger, (i & 64) != 0 ? AnonymousClass1.INSTANCE : af7Var2, (i & np0.m) != 0 ? AnonymousClass2.INSTANCE : af7Var3);
    }

    private final <T> T handleAudioFocusRequestResult(T context, int requestResult) {
        try {
            if (requestResult == 1) {
                handleFocusUpdate$default(this, true, false, 2, null);
                this.logger.d(TAG, "Audio focus request granted");
                return context;
            }
            this.workerThreadHandler.postDelayed(new v80(this, 3), 2000L);
            this.logger.d(TAG, "Audio focus request failed");
            handleFocusUpdate$default(this, false, false, 2, null);
            return null;
        } catch (Throwable th) {
            this.logger.e(TAG, "Audio focus request failed with error", th);
            handleFocusUpdate$default(this, false, false, 2, null);
            return null;
        }
    }

    private final void handleFocusUpdate(boolean focusGained, boolean forever) {
        if (this.isFocusGained == focusGained) {
            this.logger.d(TAG, "Focus state didn't change, ignore update to " + focusGained);
            return;
        }
        this.isFocusGained = focusGained;
        if (focusGained) {
            this.onFocusGained.invoke();
            unmute();
            return;
        }
        this.onFocusLost.invoke();
        if (forever) {
            muteForever();
        } else {
            mute();
        }
    }

    public static /* synthetic */ void handleFocusUpdate$default(AudioFocusRequestHelper audioFocusRequestHelper, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        audioFocusRequestHelper.handleFocusUpdate(z, z2);
    }

    private final void mute() {
        if (((Boolean) this.isDestroyed.invoke()).booleanValue()) {
            return;
        }
        this.mainThreadHandler.post(new v80(this, 1));
    }

    public static final void mute$lambda$4(AudioFocusRequestHelper audioFocusRequestHelper) {
        CallsAudioManager.OnMuteListener onMuteListener = audioFocusRequestHelper.onMuteListener;
        if (onMuteListener != null) {
            try {
                onMuteListener.onMute(true);
            } catch (Throwable th) {
                audioFocusRequestHelper.logger.e(TAG, "Error raise mute event", th);
            }
        }
    }

    private final void muteForever() {
        if (((Boolean) this.isDestroyed.invoke()).booleanValue()) {
            return;
        }
        this.mainThreadHandler.post(new v80(this, 0));
    }

    public static final void muteForever$lambda$6(AudioFocusRequestHelper audioFocusRequestHelper) {
        CallsAudioManager.OnMuteListener onMuteListener = audioFocusRequestHelper.onMuteListener;
        if (onMuteListener != null) {
            try {
                onMuteListener.onMutedForever();
            } catch (Throwable th) {
                audioFocusRequestHelper.logger.e(TAG, "Error raise mute forever event", th);
            }
        }
    }

    public static final void requestFocus$lambda$0(AudioFocusRequestHelper audioFocusRequestHelper, int i) {
        String strValueOf;
        Logger logger = audioFocusRequestHelper.logger;
        if (i == -3) {
            strValueOf = "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
        } else if (i == -2) {
            strValueOf = "AUDIOFOCUS_LOSS_TRANSIENT";
        } else if (i != -1) {
            strValueOf = i != 1 ? String.valueOf(i) : "AUDIOFOCUS_GAIN";
        } else {
            strValueOf = "AUDIOFOCUS_LOSS";
        }
        logger.d(TAG, strValueOf);
        if (i == -3 || i == -2) {
            handleFocusUpdate$default(audioFocusRequestHelper, false, false, 2, null);
            return;
        }
        if (i == -1) {
            audioFocusRequestHelper.handleFocusUpdate(false, true);
            return;
        }
        if (i == 1) {
            handleFocusUpdate$default(audioFocusRequestHelper, true, false, 2, null);
            return;
        }
        audioFocusRequestHelper.logger.e(TAG, "Unexpected audio focus change " + i);
    }

    private final void unmute() {
        if (((Boolean) this.isDestroyed.invoke()).booleanValue()) {
            return;
        }
        this.mainThreadHandler.post(new v80(this, 2));
    }

    public static final void unmute$lambda$8(AudioFocusRequestHelper audioFocusRequestHelper) {
        CallsAudioManager.OnMuteListener onMuteListener = audioFocusRequestHelper.onMuteListener;
        if (onMuteListener != null) {
            try {
                onMuteListener.onMute(false);
            } catch (Throwable th) {
                audioFocusRequestHelper.logger.e(TAG, "Error raise unmute event", th);
            }
        }
    }

    public final void releaseFocus() {
        this.logger.d(TAG, "Release audio focus");
        try {
            AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
            if (audioFocusRequest != null) {
                this.audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } catch (Throwable th) {
            this.logger.e(TAG, "Error while releasing audio focus request", th);
        }
        this.audioFocusRequest = null;
        this.audioFocusListener = null;
        this.isFocusGained = false;
    }

    public final void requestFocus() {
        boolean z = this.isFocusGained;
        Logger logger = this.logger;
        if (z) {
            logger.d(TAG, "Focus is already gained, ignore request");
            return;
        }
        logger.d(TAG, "Request audio focus. O+=true");
        releaseFocus();
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(2).setAcceptsDelayedFocusGain(false).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setOnAudioFocusChangeListener(new n80(1, this), this.workerThreadHandler).build();
        this.audioFocusRequest = (AudioFocusRequest) handleAudioFocusRequestResult(audioFocusRequestBuild, this.audioManager.requestAudioFocus(audioFocusRequestBuild));
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/AudioFocusRequestHelper$Companion;", "", "()V", "RE_REQUEST_FOCUS_DELAY_MILLIS", "", "TAG", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper$1 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsbi;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends ux8 implements af7 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.af7
        public /* bridge */ /* synthetic */ Object invoke() {
            m93invoke();
            return sbi.a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m93invoke() {
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper$2 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsbi;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass2 extends ux8 implements af7 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.af7
        public /* bridge */ /* synthetic */ Object invoke() {
            m94invoke();
            return sbi.a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m94invoke() {
        }
    }

    public AudioFocusRequestHelper(AudioManager audioManager, CallsAudioManager.OnMuteListener onMuteListener, Handler handler, Handler handler2, af7 af7Var, Logger logger, af7 af7Var2, af7 af7Var3) {
        this.audioManager = audioManager;
        this.onMuteListener = onMuteListener;
        this.mainThreadHandler = handler;
        this.workerThreadHandler = handler2;
        this.isDestroyed = af7Var;
        this.logger = logger;
        this.onFocusLost = af7Var2;
        this.onFocusGained = af7Var3;
    }
}
