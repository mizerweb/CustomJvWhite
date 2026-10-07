package defpackage;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zb0 extends AudioManager.AudioRecordingCallback {
    public final /* synthetic */ ac0 a;

    public zb0(ac0 ac0Var) {
        this.a = ac0Var;
    }

    @Override // android.media.AudioManager.AudioRecordingCallback
    public final void onRecordingConfigChanged(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) it.next();
            int clientAudioSessionId = audioRecordingConfiguration.getClientAudioSessionId();
            ac0 ac0Var = this.a;
            if (clientAudioSessionId == ac0Var.a.getAudioSessionId()) {
                ac0Var.c(io.f(audioRecordingConfiguration));
                return;
            }
        }
    }
}
