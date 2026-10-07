package ru.ok.android.externcalls.sdk.audio;

import android.content.Context;
import android.os.Build;
import defpackage.af7;
import defpackage.c;
import defpackage.cf7;
import defpackage.cqk;
import defpackage.la6;
import defpackage.ma6;
import defpackage.ore;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.ok.android.externcalls.sdk.audio.internal.DefaultAudioDeviceSelector;
import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.externcalls.sdk.audio.internal.stubs.LoggerStub;
import ru.ok.android.externcalls.sdk.audio.internal.stubs.VideoTrackerStub;
import ru.ok.android.externcalls.sdk.audio.internal.tracer.TracerLiteFacade;
import ru.ok.android.externcalls.sdk.audio.internal.tracer.TracerLogger;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001:\b23456789J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\tJA\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\u0015JA\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u001a2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b\u001b\u0010\u001cJK\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b \u0010!J9\u0010\"\u001a\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b\"\u0010#J7\u0010%\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00040\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000fH'¢\u0006\u0004\b%\u0010&J7\u0010'\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00040\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000fH'¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u0004H'¢\u0006\u0004\b(\u0010\u0015R\u0014\u0010+\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00160,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006:À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/CallsAudioManager;", "", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;", "listener", "Lsbi;", "setOnAudioDeviceChangeListener", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceListChangeListener;", "addOnAudioDeviceListChangeListener", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceListChangeListener;)V", "removeOnAudioDeviceListChangeListener", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "state", "Lkotlin/Function0;", "onComplete", "Lkotlin/Function1;", "", "onError", "changeStateAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;Laf7;Lcf7;)V", "notifyBluetoothPermissionGranted", "()V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "audioDevice", "setAudioDeviceAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "setAudioDeviceTypeAsync", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;Laf7;Lcf7;)V", "", "enabled", "byVideoTurnedOn", "setSpeakerEnabledAsync", "(ZZLaf7;Lcf7;)V", "releaseAsync", "(Laf7;Lcf7;)V", "onSuccess", "hasWiredHeadsetAsync", "(Lcf7;Lcf7;)V", "hasBluetoothHeadsetAsync", "requestAudioFocusAsync", "getCurrentDevice", "()Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "currentDevice", "", "getAvailableAudioDevices", "()Ljava/util/List;", "availableAudioDevices", "isHeadsetConnected", "()Z", "AudioDeviceInfoChangedEvent", "AudioDeviceType", "Builder", "DisabledAudioDeviceUsagePolicy", "OnAudioDeviceInfoChangeListener", "OnAudioDeviceListChangeListener", "OnMuteListener", "State", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CallsAudioManager {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceInfoChangedEvent;", "", "oldDevice", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "newDevice", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;)V", "getNewDevice", "()Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "getOldDevice", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AudioDeviceInfoChangedEvent {
        private final CallsAudioDeviceInfo newDevice;
        private final CallsAudioDeviceInfo oldDevice;

        public AudioDeviceInfoChangedEvent(CallsAudioDeviceInfo callsAudioDeviceInfo, CallsAudioDeviceInfo callsAudioDeviceInfo2) {
            this.oldDevice = callsAudioDeviceInfo;
            this.newDevice = callsAudioDeviceInfo2;
        }

        public static /* synthetic */ AudioDeviceInfoChangedEvent copy$default(AudioDeviceInfoChangedEvent audioDeviceInfoChangedEvent, CallsAudioDeviceInfo callsAudioDeviceInfo, CallsAudioDeviceInfo callsAudioDeviceInfo2, int i, Object obj) {
            if ((i & 1) != 0) {
                callsAudioDeviceInfo = audioDeviceInfoChangedEvent.oldDevice;
            }
            if ((i & 2) != 0) {
                callsAudioDeviceInfo2 = audioDeviceInfoChangedEvent.newDevice;
            }
            return audioDeviceInfoChangedEvent.copy(callsAudioDeviceInfo, callsAudioDeviceInfo2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CallsAudioDeviceInfo getOldDevice() {
            return this.oldDevice;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CallsAudioDeviceInfo getNewDevice() {
            return this.newDevice;
        }

        public final AudioDeviceInfoChangedEvent copy(CallsAudioDeviceInfo oldDevice, CallsAudioDeviceInfo newDevice) {
            return new AudioDeviceInfoChangedEvent(oldDevice, newDevice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioDeviceInfoChangedEvent)) {
                return false;
            }
            AudioDeviceInfoChangedEvent audioDeviceInfoChangedEvent = (AudioDeviceInfoChangedEvent) other;
            return cqk.d(this.oldDevice, audioDeviceInfoChangedEvent.oldDevice) && cqk.d(this.newDevice, audioDeviceInfoChangedEvent.newDevice);
        }

        public final CallsAudioDeviceInfo getNewDevice() {
            return this.newDevice;
        }

        public final CallsAudioDeviceInfo getOldDevice() {
            return this.oldDevice;
        }

        public int hashCode() {
            return this.newDevice.hashCode() + (this.oldDevice.hashCode() * 31);
        }

        public String toString() {
            return "AudioDeviceInfoChangedEvent(oldDevice=" + this.oldDevice + ", newDevice=" + this.newDevice + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u001f\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0007\"\u00020\u0000¢\u0006\u0002\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "", "(Ljava/lang/String;I)V", "isHeadsetDevice", "", "oneOf", "devices", "", "([Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;)Z", "BLUETOOTH", "WIRED_HEADSET", "EARPIECE", "SPEAKER_PHONE", "NONE", "BLUETOOTH_INTENT", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum AudioDeviceType {
        BLUETOOTH,
        WIRED_HEADSET,
        EARPIECE,
        SPEAKER_PHONE,
        NONE,
        BLUETOOTH_INTENT;

        private static final /* synthetic */ la6 $ENTRIES = new ma6(values());

        public static la6 getEntries() {
            return $ENTRIES;
        }

        public final boolean isHeadsetDevice() {
            return oneOf(WIRED_HEADSET, BLUETOOTH);
        }

        public final boolean oneOf(AudioDeviceType... devices) {
            return a.N0(devices, this);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\bJ\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$Builder;", "", "()V", "awaitDeviceChangeConfirmationV3", "", "context", "Landroid/content/Context;", "disabledAudioDeviceUsagePolicy", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$DisabledAudioDeviceUsagePolicy;", "logger", "Lru/ok/android/externcalls/sdk/audio/Logger;", "onMuteListener", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;", "proximityTracker", "Lru/ok/android/externcalls/sdk/audio/ProximityTracker;", "trackProximityWhenSpeakerEnabled", "videoTracker", "Lru/ok/android/externcalls/sdk/audio/VideoTracker;", "build", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager;", "setAwaitDeviceChangeConfirmationEnabled", "isEnabled", "setContext", "setDisabledAudioDeviceUsagePolicy", "handler", "setLogger", "setOnMuteListener", "setProximityTracker", "setTrackProximityWhenSpeakerEnabled", "track", "setVideoTracker", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private boolean awaitDeviceChangeConfirmationV3;
        private Context context;
        private DisabledAudioDeviceUsagePolicy disabledAudioDeviceUsagePolicy;
        private OnMuteListener onMuteListener;
        private boolean trackProximityWhenSpeakerEnabled;
        private ProximityTracker proximityTracker = ProximityTracker.INSTANCE.getNOOP$calls_audiomanager_release();
        private VideoTracker videoTracker = new VideoTrackerStub();
        private Logger logger = new LoggerStub();

        public final CallsAudioManager build() {
            Context context = this.context;
            if (context == null) {
                ore.p("Context must not be null");
                return null;
            }
            DefaultAudioDeviceSelector defaultAudioDeviceSelector = new DefaultAudioDeviceSelector(this.logger);
            TracerLiteFacade tracerLiteFacade = new TracerLiteFacade(context);
            if (Build.VERSION.SDK_INT < 31) {
                return new CallsAudioManagerV2Impl(context, this.proximityTracker, this.trackProximityWhenSpeakerEnabled, this.videoTracker, defaultAudioDeviceSelector, this.onMuteListener, new TracerLogger(tracerLiteFacade, this.logger), this.awaitDeviceChangeConfirmationV3);
            }
            ProximityTracker proximityTracker = this.proximityTracker;
            boolean z = this.trackProximityWhenSpeakerEnabled;
            VideoTracker videoTracker = this.videoTracker;
            DisabledAudioDeviceUsagePolicy disabledAudioDeviceUsagePolicy = this.disabledAudioDeviceUsagePolicy;
            if (disabledAudioDeviceUsagePolicy == null) {
                disabledAudioDeviceUsagePolicy = new DisabledAudioDeviceUsagePolicy() { // from class: ru.ok.android.externcalls.sdk.audio.CallsAudioManager$Builder$build$1
                };
            }
            return new CallsAudioManagerV3Impl(context, proximityTracker, z, videoTracker, defaultAudioDeviceSelector, disabledAudioDeviceUsagePolicy, this.onMuteListener, new TracerLogger(tracerLiteFacade, this.logger), this.awaitDeviceChangeConfirmationV3);
        }

        public final Builder setAwaitDeviceChangeConfirmationEnabled(boolean isEnabled) {
            this.awaitDeviceChangeConfirmationV3 = isEnabled;
            return this;
        }

        public final Builder setContext(Context context) {
            this.context = context;
            return this;
        }

        public final Builder setDisabledAudioDeviceUsagePolicy(DisabledAudioDeviceUsagePolicy handler) {
            this.disabledAudioDeviceUsagePolicy = handler;
            return this;
        }

        public final Builder setLogger(Logger logger) {
            this.logger = logger;
            return this;
        }

        public final Builder setOnMuteListener(OnMuteListener onMuteListener) {
            this.onMuteListener = onMuteListener;
            return this;
        }

        public final Builder setProximityTracker(ProximityTracker proximityTracker) {
            if (proximityTracker == null) {
                proximityTracker = ProximityTracker.INSTANCE.getNOOP$calls_audiomanager_release();
            }
            this.proximityTracker = proximityTracker;
            return this;
        }

        public final Builder setTrackProximityWhenSpeakerEnabled(boolean track) {
            this.trackProximityWhenSpeakerEnabled = track;
            return this;
        }

        public final Builder setVideoTracker(VideoTracker videoTracker) {
            this.videoTracker = videoTracker;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$DisabledAudioDeviceUsagePolicy;", "", "isAvailableForAutoSelect", "", "deviceType", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface DisabledAudioDeviceUsagePolicy {
        default boolean isAvailableForAutoSelect(AudioDeviceType deviceType) {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceInfoChangeListener;", "", "Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceInfoChangedEvent;", "event", "Lsbi;", "onAudioDeviceChanged", "(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceInfoChangedEvent;)V", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnAudioDeviceInfoChangeListener {
        void onAudioDeviceChanged(AudioDeviceInfoChangedEvent event);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnAudioDeviceListChangeListener;", "", "", "Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;", "devices", "Lsbi;", "onAudioDeviceListChanged", "(Ljava/util/Collection;)V", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnAudioDeviceListChangeListener {
        void onAudioDeviceListChanged(Collection<CallsAudioDeviceInfo> devices);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$OnMuteListener;", "", "", "mute", "Lsbi;", "onMute", "(Z)V", "onMutedForever", "()V", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnMuteListener {
        void onMute(boolean mute);

        void onMutedForever();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$State;", "", "(Ljava/lang/String;I)V", "IDLE", "DIALING", "RINGING", "CONVERSATION", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum State {
        IDLE,
        DIALING,
        RINGING,
        CONVERSATION;

        private static final /* synthetic */ la6 $ENTRIES = new ma6(values());

        public static la6 getEntries() {
            return $ENTRIES;
        }
    }

    static /* synthetic */ void changeStateAsync$default(CallsAudioManager callsAudioManager, State state, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: changeStateAsync");
            return;
        }
        if ((i & 2) != 0) {
            af7Var = null;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        callsAudioManager.changeStateAsync(state, af7Var, cf7Var);
    }

    static /* synthetic */ void releaseAsync$default(CallsAudioManager callsAudioManager, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: releaseAsync");
            return;
        }
        if ((i & 1) != 0) {
            af7Var = null;
        }
        if ((i & 2) != 0) {
            cf7Var = null;
        }
        callsAudioManager.releaseAsync(af7Var, cf7Var);
    }

    static /* synthetic */ void setAudioDeviceAsync$default(CallsAudioManager callsAudioManager, CallsAudioDeviceInfo callsAudioDeviceInfo, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: setAudioDeviceAsync");
            return;
        }
        if ((i & 2) != 0) {
            af7Var = null;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        callsAudioManager.setAudioDeviceAsync(callsAudioDeviceInfo, af7Var, cf7Var);
    }

    static /* synthetic */ void setAudioDeviceTypeAsync$default(CallsAudioManager callsAudioManager, AudioDeviceType audioDeviceType, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: setAudioDeviceTypeAsync");
            return;
        }
        if ((i & 2) != 0) {
            af7Var = null;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        callsAudioManager.setAudioDeviceTypeAsync(audioDeviceType, af7Var, cf7Var);
    }

    static /* synthetic */ void setSpeakerEnabledAsync$default(CallsAudioManager callsAudioManager, boolean z, boolean z2, af7 af7Var, cf7 cf7Var, int i, Object obj) {
        if (obj != null) {
            c.i("Super calls with default arguments not supported in this target, function: setSpeakerEnabledAsync");
            return;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            af7Var = null;
        }
        if ((i & 8) != 0) {
            cf7Var = null;
        }
        callsAudioManager.setSpeakerEnabledAsync(z, z2, af7Var, cf7Var);
    }

    void addOnAudioDeviceListChangeListener(OnAudioDeviceListChangeListener listener);

    void changeStateAsync(State state, af7 onComplete, cf7 onError);

    List<CallsAudioDeviceInfo> getAvailableAudioDevices();

    CallsAudioDeviceInfo getCurrentDevice();

    void hasBluetoothHeadsetAsync(cf7 onSuccess, cf7 onError);

    void hasWiredHeadsetAsync(cf7 onSuccess, cf7 onError);

    boolean isHeadsetConnected();

    void notifyBluetoothPermissionGranted();

    void releaseAsync(af7 onComplete, cf7 onError);

    void removeOnAudioDeviceListChangeListener(OnAudioDeviceListChangeListener listener);

    void requestAudioFocusAsync();

    void setAudioDeviceAsync(CallsAudioDeviceInfo audioDevice, af7 onComplete, cf7 onError);

    void setAudioDeviceTypeAsync(AudioDeviceType audioDevice, af7 onComplete, cf7 onError);

    void setOnAudioDeviceChangeListener(OnAudioDeviceInfoChangeListener listener);

    void setSpeakerEnabledAsync(boolean enabled, boolean byVideoTurnedOn, af7 onComplete, cf7 onError);
}
