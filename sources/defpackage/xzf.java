package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xzf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzf b;

    public /* synthetic */ xzf(zzf zzfVar, int i) {
        this.a = i;
        this.b = zzfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 0;
        zzf zzfVar = this.b;
        switch (i) {
            case 0:
                JavaAudioDeviceModule javaAudioDeviceModule = zzfVar.j;
                if (javaAudioDeviceModule != null) {
                    javaAudioDeviceModule.setReadyToPlay();
                }
                break;
            case 1:
                zzfVar.b.log("SharedPeerConnectionFac", "releaseInternal");
                zzfVar.f = true;
                ArrayList arrayList = zzfVar.g;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    try {
                        ((j3k) obj).b.accept(new IllegalStateException("Factory was released before creation"));
                    } catch (Throwable th) {
                        zzfVar.b.reportException("SharedPeerConnectionFac", "Error in withFactory onError callback", th);
                    }
                }
                zzfVar.g.clear();
                PeerConnectionFactory peerConnectionFactory = zzfVar.d;
                if (peerConnectionFactory != null) {
                    ug5 ug5Var = zzfVar.m;
                    if (ug5Var != null) {
                        ug5Var.b(zzfVar.n);
                    }
                    peerConnectionFactory.dispose();
                    zzfVar.b.log("SharedPeerConnectionFac", uza.b(peerConnectionFactory).concat(" was disposed."));
                    zzfVar.d = null;
                }
                vx8 vx8Var = zzfVar.p;
                if (vx8Var != null) {
                    oo5.a(vx8Var);
                }
                tw5 tw5Var = zzfVar.k;
                if (tw5Var != null) {
                    ((ko5) tw5Var.e).dispose();
                    zzfVar.k = null;
                }
                JavaAudioDeviceModule javaAudioDeviceModule2 = zzfVar.j;
                if (javaAudioDeviceModule2 != null) {
                    javaAudioDeviceModule2.release();
                    zzfVar.j = null;
                }
                ewj ewjVar = zzfVar.q;
                b1k b1kVar = zzfVar.i;
                if (ewjVar != null && b1kVar != null) {
                    ((CopyOnWriteArraySet) b1kVar.b).remove(new n3k(0L, ewjVar));
                    break;
                }
                break;
            default:
                JavaAudioDeviceModule javaAudioDeviceModule3 = zzfVar.j;
                if (javaAudioDeviceModule3 != null) {
                    javaAudioDeviceModule3.restartAudioRecording(false);
                }
                break;
        }
    }
}
