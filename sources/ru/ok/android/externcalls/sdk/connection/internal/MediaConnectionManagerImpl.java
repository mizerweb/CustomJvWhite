package ru.ok.android.externcalls.sdk.connection.internal;

import android.os.Handler;
import android.os.Looper;
import defpackage.af7;
import defpackage.dwh;
import defpackage.j32;
import defpackage.j95;
import defpackage.la6;
import defpackage.ma6;
import defpackage.y3e;
import defpackage.zvh;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionManager;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionSettings;
import ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 G2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002HGB%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010\u0019J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010\u0019J\u001f\u0010'\u001a\u00020\r2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0017¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\rH\u0007¢\u0006\u0004\b-\u0010\u000fJ\u000f\u0010.\u001a\u00020\rH\u0007¢\u0006\u0004\b.\u0010\u000fJ\u000f\u0010/\u001a\u00020\rH\u0007¢\u0006\u0004\b/\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0016038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010:R\u0016\u0010>\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010E¨\u0006I"}, d2 = {"Lru/ok/android/externcalls/sdk/connection/internal/MediaConnectionManagerImpl;", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionManager;", "Lj32;", "Ldwh;", "Ly3e;", "log", "Lkotlin/Function0;", "", "isConversationEnded", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionSettings;", "settings", "<init>", "(Ly3e;Laf7;Lru/ok/android/externcalls/sdk/connection/MediaConnectionSettings;)V", "Lsbi;", "disconnectConfirmedCheck", "()V", "noDataCallbackTimeout", "reportNewStateIfNeeded", "Lru/ok/android/externcalls/sdk/connection/internal/MediaConnectionManagerImpl$State;", "newState", "reportNewState", "(Lru/ok/android/externcalls/sdk/connection/internal/MediaConnectionManagerImpl$State;)V", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener;", "listener", "reportStateToNewListener", "(Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener;)V", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener$ConnectedInfo;", "createConnectedInfo", "()Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener$ConnectedInfo;", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener$DisconnectedInfo;", "createDisconnectedInfo", "()Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener$DisconnectedInfo;", "shouldReport", "()Z", "addListener", "removeListener", "Lzvh;", "oldTopology", "newTopology", "onTopologyUpdated", "(Lzvh;Lzvh;)V", "", "timeSinceBytesReceivedMs", "onMediaDataReceived", "(J)V", "onIceConnected", "onIceDisconnected", "release", "Ly3e;", "Laf7;", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionSettings;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "isFirstConnection", "Z", "reportedState", "Lru/ok/android/externcalls/sdk/connection/internal/MediaConnectionManagerImpl$State;", "isDataConnected", "isIceConnected", "lastConnectedInfo", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener$ConnectedInfo;", "lastDisconnectedInfo", "Lru/ok/android/externcalls/sdk/connection/MediaConnectionListener$DisconnectedInfo;", "Ljava/lang/Runnable;", "disconnectRunnable", "Ljava/lang/Runnable;", "noDataRunnable", "Companion", "State", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MediaConnectionManagerImpl implements MediaConnectionManager, j32, dwh {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "MediaConnectionManager";
    private final Runnable disconnectRunnable;
    private final af7 isConversationEnded;
    private boolean isDataConnected;
    private boolean isIceConnected;
    private MediaConnectionListener.ConnectedInfo lastConnectedInfo;
    private MediaConnectionListener.DisconnectedInfo lastDisconnectedInfo;
    private final y3e log;
    private final Runnable noDataRunnable;
    private final MediaConnectionSettings settings;
    private final CopyOnWriteArrayList<MediaConnectionListener> listeners = new CopyOnWriteArrayList<>();
    private final Handler handler = new Handler(Looper.getMainLooper());
    private boolean isFirstConnection = true;
    private State reportedState = State.DISCONNECTED;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/connection/internal/MediaConnectionManagerImpl$State;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "CONNECTED", "DISCONNECTED", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum State {
        NONE,
        CONNECTED,
        DISCONNECTED;

        private static final /* synthetic */ la6 $ENTRIES = new ma6(values());

        public static la6 getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MediaConnectionManagerImpl(y3e y3eVar, af7 af7Var, MediaConnectionSettings mediaConnectionSettings) {
        this.log = y3eVar;
        this.isConversationEnded = af7Var;
        this.settings = mediaConnectionSettings;
        final int i = 1;
        final int i2 = 0;
        this.disconnectRunnable = new Runnable(this) { // from class: bu9
            public final /* synthetic */ MediaConnectionManagerImpl b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                MediaConnectionManagerImpl mediaConnectionManagerImpl = this.b;
                switch (i3) {
                    case 0:
                        mediaConnectionManagerImpl.disconnectConfirmedCheck();
                        break;
                    default:
                        mediaConnectionManagerImpl.noDataCallbackTimeout();
                        break;
                }
            }
        };
        this.noDataRunnable = new Runnable(this) { // from class: bu9
            public final /* synthetic */ MediaConnectionManagerImpl b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                MediaConnectionManagerImpl mediaConnectionManagerImpl = this.b;
                switch (i3) {
                    case 0:
                        mediaConnectionManagerImpl.disconnectConfirmedCheck();
                        break;
                    default:
                        mediaConnectionManagerImpl.noDataCallbackTimeout();
                        break;
                }
            }
        };
    }

    private final MediaConnectionListener.ConnectedInfo createConnectedInfo() {
        return new MediaConnectionListener.ConnectedInfo(this.isFirstConnection);
    }

    private final MediaConnectionListener.DisconnectedInfo createDisconnectedInfo() {
        return MediaConnectionListener.DisconnectedInfo.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnectConfirmedCheck() {
        this.log.log(LOG_TAG, "onIceDisconnected after timeout");
        this.isIceConnected = false;
        reportNewStateIfNeeded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void noDataCallbackTimeout() {
        this.log.log(LOG_TAG, "noDataCallbackTimeout after timeout");
        this.isDataConnected = false;
        reportNewStateIfNeeded();
    }

    private final void reportNewState(State newState) {
        if (shouldReport()) {
            int i = WhenMappings.$EnumSwitchMapping$0[newState.ordinal()];
            if (i == 1) {
                MediaConnectionListener.ConnectedInfo connectedInfoCreateConnectedInfo = createConnectedInfo();
                this.lastConnectedInfo = connectedInfoCreateConnectedInfo;
                Iterator<T> it = this.listeners.iterator();
                while (it.hasNext()) {
                    ((MediaConnectionListener) it.next()).onMediaConnected(connectedInfoCreateConnectedInfo);
                }
                return;
            }
            if (i != 2) {
                return;
            }
            MediaConnectionListener.DisconnectedInfo disconnectedInfoCreateDisconnectedInfo = createDisconnectedInfo();
            this.lastDisconnectedInfo = disconnectedInfoCreateDisconnectedInfo;
            Iterator<T> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                ((MediaConnectionListener) it2.next()).onMediaDisconnected(disconnectedInfoCreateDisconnectedInfo);
            }
        }
    }

    private final void reportNewStateIfNeeded() {
        State state;
        State state2 = this.reportedState;
        boolean z = this.isIceConnected;
        if (z || this.isDataConnected) {
            state = State.CONNECTED;
        } else {
            state = State.NONE;
            if (state2 != state) {
                state = State.DISCONNECTED;
            }
        }
        if (state2 != state) {
            this.log.log(LOG_TAG, "new state: " + state + " isIceConnected=" + z + " isDataConnected=" + this.isDataConnected);
            reportNewState(state);
            this.isFirstConnection = false;
            this.reportedState = state;
        }
    }

    private final void reportStateToNewListener(MediaConnectionListener listener) {
        MediaConnectionListener.DisconnectedInfo disconnectedInfo;
        if (shouldReport()) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.reportedState.ordinal()];
            if (i != 1) {
                if (i == 2 && (disconnectedInfo = this.lastDisconnectedInfo) != null) {
                    listener.onMediaDisconnected(disconnectedInfo);
                    return;
                }
                return;
            }
            MediaConnectionListener.ConnectedInfo connectedInfo = this.lastConnectedInfo;
            if (connectedInfo == null) {
                return;
            }
            listener.onMediaConnected(connectedInfo);
        }
    }

    private final boolean shouldReport() {
        return !((Boolean) this.isConversationEnded.invoke()).booleanValue();
    }

    @Override // ru.ok.android.externcalls.sdk.connection.MediaConnectionManager
    public void addListener(MediaConnectionListener listener) {
        this.listeners.add(listener);
        reportStateToNewListener(listener);
    }

    public final void onIceConnected() {
        this.log.log(LOG_TAG, "onIceConnected");
        this.isIceConnected = true;
        this.handler.removeCallbacks(this.disconnectRunnable);
        reportNewStateIfNeeded();
    }

    public final void onIceDisconnected() {
        this.log.log(LOG_TAG, "onIceDisconnected");
        this.handler.postDelayed(this.disconnectRunnable, this.settings.getNoIceConnectionReportTimeoutMs());
    }

    @Override // defpackage.j32
    public void onMediaDataReceived(long timeSinceBytesReceivedMs) {
        boolean z = this.isDataConnected;
        boolean z2 = timeSinceBytesReceivedMs < this.settings.getNoMediaReportTimeoutMs();
        this.isDataConnected = z2;
        if (z != z2) {
            this.log.log(LOG_TAG, "isDataConnected=" + z2 + " timeSinceBytesReceivedMs=" + timeSinceBytesReceivedMs);
        }
        reportNewStateIfNeeded();
        this.handler.removeCallbacks(this.noDataRunnable);
        this.handler.postDelayed(this.noDataRunnable, this.settings.getNoMediaReportTimeoutMs());
    }

    @Override // defpackage.dwh
    public void onTopologyUpdated(zvh oldTopology, zvh newTopology) {
        this.log.log(LOG_TAG, "topology changed: oldTopology=" + oldTopology + " newTopology=" + newTopology);
    }

    public final void release() {
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // ru.ok.android.externcalls.sdk.connection.MediaConnectionManager
    public void removeListener(MediaConnectionListener listener) {
        this.listeners.remove(listener);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/connection/internal/MediaConnectionManagerImpl$Companion;", "", "<init>", "()V", "LOG_TAG", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }
}
