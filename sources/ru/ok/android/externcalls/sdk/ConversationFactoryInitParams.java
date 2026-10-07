package ru.ok.android.externcalls.sdk;

import android.content.Context;
import defpackage.j95;
import defpackage.y3e;
import kotlin.Metadata;
import org.webrtc.NativeLibraryLoader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams;", "", "context", "Landroid/content/Context;", "peerConnection", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "sharedSettingsLifeTime", "", "<init>", "(Landroid/content/Context;Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;Ljava/lang/Long;)V", "getContext", "()Landroid/content/Context;", "getPeerConnection", "()Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "getSharedSettingsLifeTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "Builder", "PeerConnection", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConversationFactoryInitParams {
    private final Context context;
    private final PeerConnection peerConnection;
    private final Long sharedSettingsLifeTime;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0015\u0010\f\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$Builder;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "peerConnection", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "sharedSettingsLifeTime", "", "Ljava/lang/Long;", "setPeerConnection", "setSharedSettingsStorageEnabled", "lifeTime", "(Ljava/lang/Long;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$Builder;", "build", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder {
        private final Context context;
        private PeerConnection peerConnection;
        private Long sharedSettingsLifeTime;

        public Builder(Context context) {
            this.context = context;
        }

        public final ConversationFactoryInitParams build() {
            Context context = this.context;
            PeerConnection peerConnectionBuild = this.peerConnection;
            if (peerConnectionBuild == null) {
                peerConnectionBuild = new PeerConnection.Builder().build();
            }
            return new ConversationFactoryInitParams(context, peerConnectionBuild, this.sharedSettingsLifeTime, null);
        }

        public final Builder setPeerConnection(PeerConnection peerConnection) {
            this.peerConnection = peerConnection;
            return this;
        }

        public final Builder setSharedSettingsStorageEnabled(Long lifeTime) {
            this.sharedSettingsLifeTime = lifeTime;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0001#Bc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u000b\u0010\u001fR\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\f\u0010\u001fR\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\r\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u000e\u0010\u001fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "", "", "bonusFieldTrials", "", "rttMultCapMs", "udpMarker", "tcpMarker", "Lorg/webrtc/NativeLibraryLoader;", "libraryLoader", "", "isEarlyAudioPlayoutEnabled", "isEarlyAudioRecordingEnabled", "isAudioPipelineOffOnMuteEnabled", "isSimulcastEnabled", "Ly3e;", "logger", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lorg/webrtc/NativeLibraryLoader;ZZZZLy3e;)V", "Ljava/lang/String;", "getBonusFieldTrials", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getRttMultCapMs", "()Ljava/lang/Integer;", "getUdpMarker", "getTcpMarker", "Lorg/webrtc/NativeLibraryLoader;", "getLibraryLoader", "()Lorg/webrtc/NativeLibraryLoader;", "Z", "()Z", "Ly3e;", "getLogger", "()Ly3e;", "Builder", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PeerConnection {
        private final String bonusFieldTrials;
        private final boolean isAudioPipelineOffOnMuteEnabled;
        private final boolean isEarlyAudioPlayoutEnabled;
        private final boolean isEarlyAudioRecordingEnabled;
        private final boolean isSimulcastEnabled;
        private final NativeLibraryLoader libraryLoader;
        private final y3e logger;
        private final Integer rttMultCapMs;
        private final String tcpMarker;
        private final String udpMarker;

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001a\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u000fJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000fJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u000fJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001f\u0010\u000fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u0010-\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u0010.\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010+¨\u0006/"}, d2 = {"Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "", "<init>", "()V", "Ly3e;", "log", "setLogger", "(Ly3e;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "Lorg/webrtc/NativeLibraryLoader;", "libraryLoader", "setNativeLibraryLoader", "(Lorg/webrtc/NativeLibraryLoader;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "", "isEnabled", "setSimulcastEnabled", "(Z)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "", "rttMultCapMs", "setRttMultCapMs", "(Ljava/lang/Integer;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "", "bonusFieldTrials", "setBonusFieldTrials", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection$Builder;", "marker", "setUdpMarker", "setTcpMarker", "setEarlyAudioPlayoutEnabled", "setEarlyAudioRecordingEnabled", "setAudioPipelineOffOnMuteEnabled", "isDisabled", "setSharedSocketDisabledForICE", "Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "build", "()Lru/ok/android/externcalls/sdk/ConversationFactoryInitParams$PeerConnection;", "Ljava/lang/String;", "Ljava/lang/Integer;", "Lorg/webrtc/NativeLibraryLoader;", "udpMarker", "tcpMarker", "logger", "Ly3e;", "isEarlyAudioPlayoutEnabled", "Z", "isEarlyAudioRecordingEnabled", "isAudioPipelineOffOnMuteEnabled", "isSimulcastEnabled", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder {
            private String bonusFieldTrials;
            private boolean isSimulcastEnabled;
            private NativeLibraryLoader libraryLoader;
            private y3e logger;
            private Integer rttMultCapMs;
            private String tcpMarker;
            private String udpMarker;
            private boolean isEarlyAudioPlayoutEnabled = true;
            private boolean isEarlyAudioRecordingEnabled = true;
            private boolean isAudioPipelineOffOnMuteEnabled = true;

            public final PeerConnection build() {
                return new PeerConnection(this.bonusFieldTrials, this.rttMultCapMs, this.udpMarker, this.tcpMarker, this.libraryLoader, this.isEarlyAudioPlayoutEnabled, this.isEarlyAudioRecordingEnabled, this.isAudioPipelineOffOnMuteEnabled, this.isSimulcastEnabled, this.logger);
            }

            public final Builder setAudioPipelineOffOnMuteEnabled(boolean isEnabled) {
                this.isAudioPipelineOffOnMuteEnabled = isEnabled;
                return this;
            }

            public final Builder setBonusFieldTrials(String bonusFieldTrials) {
                this.bonusFieldTrials = bonusFieldTrials;
                return this;
            }

            public final Builder setEarlyAudioPlayoutEnabled(boolean isEnabled) {
                this.isEarlyAudioPlayoutEnabled = isEnabled;
                return this;
            }

            public final Builder setEarlyAudioRecordingEnabled(boolean isEnabled) {
                this.isEarlyAudioRecordingEnabled = isEnabled;
                return this;
            }

            public final Builder setLogger(y3e log) {
                this.logger = log;
                return this;
            }

            public final Builder setNativeLibraryLoader(NativeLibraryLoader libraryLoader) {
                this.libraryLoader = libraryLoader;
                return this;
            }

            public final Builder setRttMultCapMs(Integer rttMultCapMs) {
                this.rttMultCapMs = rttMultCapMs;
                return this;
            }

            public final Builder setSharedSocketDisabledForICE(boolean isDisabled) {
                return this;
            }

            public final Builder setSimulcastEnabled(boolean isEnabled) {
                this.isSimulcastEnabled = isEnabled;
                return this;
            }

            public final Builder setTcpMarker(String marker) {
                this.tcpMarker = marker;
                return this;
            }

            public final Builder setUdpMarker(String marker) {
                this.udpMarker = marker;
                return this;
            }
        }

        public PeerConnection(String str, Integer num, String str2, String str3, NativeLibraryLoader nativeLibraryLoader, boolean z, boolean z2, boolean z3, boolean z4, y3e y3eVar) {
            this.bonusFieldTrials = str;
            this.rttMultCapMs = num;
            this.udpMarker = str2;
            this.tcpMarker = str3;
            this.libraryLoader = nativeLibraryLoader;
            this.isEarlyAudioPlayoutEnabled = z;
            this.isEarlyAudioRecordingEnabled = z2;
            this.isAudioPipelineOffOnMuteEnabled = z3;
            this.isSimulcastEnabled = z4;
            this.logger = y3eVar;
        }

        public final String getBonusFieldTrials() {
            return this.bonusFieldTrials;
        }

        public final NativeLibraryLoader getLibraryLoader() {
            return this.libraryLoader;
        }

        public final y3e getLogger() {
            return this.logger;
        }

        public final Integer getRttMultCapMs() {
            return this.rttMultCapMs;
        }

        public final String getTcpMarker() {
            return this.tcpMarker;
        }

        public final String getUdpMarker() {
            return this.udpMarker;
        }

        /* JADX INFO: renamed from: isAudioPipelineOffOnMuteEnabled, reason: from getter */
        public final boolean getIsAudioPipelineOffOnMuteEnabled() {
            return this.isAudioPipelineOffOnMuteEnabled;
        }

        /* JADX INFO: renamed from: isEarlyAudioPlayoutEnabled, reason: from getter */
        public final boolean getIsEarlyAudioPlayoutEnabled() {
            return this.isEarlyAudioPlayoutEnabled;
        }

        /* JADX INFO: renamed from: isEarlyAudioRecordingEnabled, reason: from getter */
        public final boolean getIsEarlyAudioRecordingEnabled() {
            return this.isEarlyAudioRecordingEnabled;
        }

        /* JADX INFO: renamed from: isSimulcastEnabled, reason: from getter */
        public final boolean getIsSimulcastEnabled() {
            return this.isSimulcastEnabled;
        }
    }

    private ConversationFactoryInitParams(Context context, PeerConnection peerConnection, Long l) {
        this.context = context;
        this.peerConnection = peerConnection;
        this.sharedSettingsLifeTime = l;
    }

    public final Context getContext() {
        return this.context;
    }

    public final PeerConnection getPeerConnection() {
        return this.peerConnection;
    }

    public final Long getSharedSettingsLifeTime() {
        return this.sharedSettingsLifeTime;
    }

    public /* synthetic */ ConversationFactoryInitParams(Context context, PeerConnection peerConnection, Long l, j95 j95Var) {
        this(context, peerConnection, l);
    }
}
