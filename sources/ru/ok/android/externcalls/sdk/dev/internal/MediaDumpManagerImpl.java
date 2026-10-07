package ru.ok.android.externcalls.sdk.dev.internal;

import defpackage.c0a;
import defpackage.kql;
import defpackage.mb;
import defpackage.o01;
import defpackage.o91;
import defpackage.q4g;
import defpackage.t81;
import defpackage.ww3;
import defpackage.yw3;
import defpackage.zzf;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.DumpCallback;
import org.webrtc.DumpSource;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeDumpCallback;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ok/android/externcalls/sdk/dev/internal/MediaDumpManagerImpl;", "Lru/ok/android/externcalls/sdk/dev/MediaDumpManager;", "Lo91;", "call", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lo91;Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "", ClientCookie.PATH_ATTR, "Lsbi;", "setLocalAudioDumpLocation", "(Ljava/lang/String;)V", "", "durationSeconds", "", MediaStreamTrack.AUDIO_TRACK_KIND, MediaStreamTrack.VIDEO_TRACK_KIND, "Lru/ok/android/externcalls/sdk/dev/MediaDumpManager$RemoteMediaDumpRequestListener;", "listener", "requestMediaDump", "(IZZLru/ok/android/externcalls/sdk/dev/MediaDumpManager$RemoteMediaDumpRequestListener;)V", "", "Lru/ok/android/externcalls/sdk/dev/MediaDumpManager$Source;", "sources", "Lru/ok/android/externcalls/sdk/dev/MediaDumpManager$LocalAudioDumpRecordListener;", "recordAudioDump", "(ILjava/util/Set;Lru/ok/android/externcalls/sdk/dev/MediaDumpManager$LocalAudioDumpRecordListener;)Ljava/lang/String;", "cancelAudioDumpRecord", "()V", "Lo91;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "dumpLocation", "Ljava/lang/String;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MediaDumpManagerImpl implements MediaDumpManager {
    private final o91 call;
    private String dumpLocation;
    private final SignalingProvider signalingProvider;

    public MediaDumpManagerImpl(o91 o91Var, SignalingProvider signalingProvider) {
        this.call = o91Var;
        this.signalingProvider = signalingProvider;
    }

    public static final void requestMediaDump$lambda$0(MediaDumpManager.RemoteMediaDumpRequestListener remoteMediaDumpRequestListener, JSONObject jSONObject) {
        if ("response".equals(jSONObject.optString("type")) && "collect-debug-dump".equals(jSONObject.optString("response")) && remoteMediaDumpRequestListener != null) {
            remoteMediaDumpRequestListener.onRequestSent();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.dev.MediaDumpManager
    public void cancelAudioDumpRecord() {
        o91 o91Var = this.call;
        zzf zzfVar = o91Var.e0;
        if (zzfVar == null) {
            return;
        }
        zzfVar.a(new o01(1, o91Var), new t81(0));
    }

    @Override // ru.ok.android.externcalls.sdk.dev.MediaDumpManager
    public String recordAudioDump(final int durationSeconds, Set<? extends MediaDumpManager.Source> sources, final MediaDumpManager.LocalAudioDumpRecordListener listener) {
        String str = this.dumpLocation;
        Set setX1 = null;
        if (str == null) {
            return null;
        }
        File file = new File(new File(str), c0a.l(durationSeconds, "calldump_", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(Calendar.getInstance().getTime()), "_", "s"));
        try {
            if (file.exists() || file.mkdirs()) {
                final o91 o91Var = this.call;
                final String absolutePath = file.getAbsolutePath();
                if (sources != null) {
                    ArrayList arrayList = new ArrayList(yw3.W0(sources, 10));
                    Iterator<T> it = sources.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((MediaDumpManager.Source) it.next()).getWebrtcDumpSource());
                    }
                    setX1 = ww3.X1(arrayList);
                }
                final Set set = setX1;
                final NativeDumpCallback nativeDumpCallback = new NativeDumpCallback(new DumpCallback() { // from class: ru.ok.android.externcalls.sdk.dev.internal.MediaDumpManagerImpl$recordAudioDump$1$2
                    @Override // org.webrtc.DumpCallback
                    public void onComplete(String dumpFolderPath) {
                        MediaDumpManager.LocalAudioDumpRecordListener localAudioDumpRecordListener = listener;
                        if (localAudioDumpRecordListener != null) {
                            localAudioDumpRecordListener.onRecordCompleted(dumpFolderPath);
                        }
                    }

                    @Override // org.webrtc.DumpCallback
                    public void onStarted(String dumpFolderPath) {
                        MediaDumpManager.LocalAudioDumpRecordListener localAudioDumpRecordListener = listener;
                        if (localAudioDumpRecordListener != null) {
                            localAudioDumpRecordListener.onRecordStarted(dumpFolderPath);
                        }
                    }
                });
                zzf zzfVar = o91Var.e0;
                if (zzfVar != null) {
                    zzfVar.a(new Consumer() { // from class: z81
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            String str2 = absolutePath;
                            int i = durationSeconds;
                            Set<DumpSource> set2 = set;
                            NativeDumpCallback nativeDumpCallback2 = nativeDumpCallback;
                            PeerConnectionFactory peerConnectionFactory = (PeerConnectionFactory) obj;
                            o91 o91Var2 = o91Var;
                            o91Var2.getClass();
                            try {
                                peerConnectionFactory.submitDumpRequest(str2, (int) TimeUnit.SECONDS.toMillis(i), set2, nativeDumpCallback2);
                            } catch (Throwable th) {
                                o91Var2.N.logException("OKRTCCall", "Error starting local audio dump", th);
                            }
                        }
                    }, new t81(0));
                }
            }
        } catch (Throwable unused) {
        }
        return file.getAbsolutePath();
    }

    @Override // ru.ok.android.externcalls.sdk.dev.MediaDumpManager
    public void requestMediaDump(int durationSeconds, boolean z, boolean z2, MediaDumpManager.RemoteMediaDumpRequestListener listener) throws JSONException {
        q4g signaling = this.signalingProvider.getSignaling();
        if (signaling == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(MediaStreamTrack.AUDIO_TRACK_KIND, z);
        jSONObject.put(MediaStreamTrack.VIDEO_TRACK_KIND, z2);
        jSONObject.put("duration", durationSeconds);
        signaling.j(kql.b(jSONObject, "collect-debug-dump"), new mb(5, listener));
    }

    @Override // ru.ok.android.externcalls.sdk.dev.MediaDumpManager
    public void setLocalAudioDumpLocation(String str) {
        this.dumpLocation = str;
    }
}
