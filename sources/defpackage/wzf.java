package defpackage;

import org.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wzf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzf b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ wzf(zzf zzfVar, boolean z, int i) {
        this.a = i;
        this.b = zzfVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = this.c;
        zzf zzfVar = this.b;
        switch (i) {
            case 0:
                JavaAudioDeviceModule javaAudioDeviceModule = zzfVar.j;
                if (javaAudioDeviceModule != null) {
                    javaAudioDeviceModule.setNoiseSuppressorEnabled(z);
                }
                break;
            case 1:
                JavaAudioDeviceModule javaAudioDeviceModule2 = zzfVar.j;
                if (javaAudioDeviceModule2 != null) {
                    javaAudioDeviceModule2.setMicrophoneMute(z);
                }
                break;
            default:
                JavaAudioDeviceModule javaAudioDeviceModule3 = zzfVar.j;
                if (javaAudioDeviceModule3 != null) {
                    javaAudioDeviceModule3.setSpeakerMute(z);
                }
                break;
        }
    }
}
