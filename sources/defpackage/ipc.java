package defpackage;

import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ipc implements tve, RtpReceiver.Observer {
    public final /* synthetic */ qpc a;

    public /* synthetic */ ipc(qpc qpcVar) {
        this.a = qpcVar;
    }

    @Override // defpackage.tve
    public void d(pve pveVar, yve yveVar) {
        this.a.w.log("PeerConnectionClient", "ChangeSimulcastCommand response = " + ((fr2) yveVar));
    }

    @Override // org.webrtc.RtpReceiver.Observer
    public void onFirstPacketReceived(MediaStreamTrack.MediaType mediaType) {
        MediaStreamTrack.MediaType mediaType2 = MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO;
        qpc qpcVar = this.a;
        if (mediaType == mediaType2) {
            zzf zzfVar = qpcVar.s;
            zzfVar.a.execute(new xzf(zzfVar, 0));
        }
        qpcVar.r.post(new dpc(qpcVar, 5));
    }
}
