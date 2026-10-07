package defpackage;

import java.util.Iterator;
import java.util.List;
import org.webrtc.AudioTrack;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.VideoTrack;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lpc implements sg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qpc b;

    public /* synthetic */ lpc(qpc qpcVar, int i) {
        this.a = i;
        this.b = qpcVar;
    }

    @Override // defpackage.sg4
    public final void accept(Object obj) {
        RtpTransceiver next;
        AudioTrack audioTrack;
        RtpTransceiver next2;
        VideoTrack videoTrack;
        switch (this.a) {
            case 0:
                qpc qpcVar = this.b;
                PeerConnection peerConnection = (PeerConnection) obj;
                qpcVar.w(peerConnection, false);
                qpcVar.m(peerConnection, false);
                break;
            default:
                qpc qpcVar2 = this.b;
                PeerConnection peerConnection2 = (PeerConnection) obj;
                qpcVar2.getClass();
                List<RtpTransceiver> transceivers = peerConnection2.getTransceivers();
                qpcVar2.N = null;
                qpcVar2.P = null;
                Iterator<RtpTransceiver> it = transceivers.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (next.getMid() != null && next.getMid().contains("s") && next.getMediaType() == MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO) {
                            qpcVar2.w.log("PeerConnectionClient", "audioShareTransceiver found");
                        }
                    } else {
                        next = null;
                    }
                }
                if (next != null) {
                    try {
                        next.setDirection(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY);
                    } catch (Exception e) {
                        qpcVar2.w.log("PeerConnectionClient", "audioShareTransceiver setDirection failed with error: " + e.getMessage());
                    }
                    sb9 sb9Var = qpcVar2.t.o;
                    if (sb9Var != null && (audioTrack = (AudioTrack) ((MediaStreamTrack) sb9Var.j.e)) != null) {
                        RtpSender sender = next.getSender();
                        qpcVar2.N = sender;
                        ewe eweVar = qpcVar2.o;
                        eweVar.getClass();
                        sender.getClass();
                        ((y3e) eweVar.c).log("RtpSenderHelper", "set audio bitrate range to 6000-48000, priority=1.0");
                        eweVar.f(sender, "audio-share", 6000, 48000, Double.valueOf(1.0d), true);
                        sender.setTrack(audioTrack, false);
                        qpcVar2.w.log("PeerConnectionClient", "audioShareTransceiver setTrack, trackId = " + audioTrack.id());
                    }
                }
                Iterator<RtpTransceiver> it2 = transceivers.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (next2.getMid() != null && next2.getMid().contains("s") && next2.getMediaType() == MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO) {
                            qpcVar2.w.log("PeerConnectionClient", "shareScreenTransceiver found");
                        }
                    } else {
                        next2 = null;
                    }
                }
                if (next2 != null) {
                    try {
                        next2.setDirection(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY);
                    } catch (Exception e2) {
                        qpcVar2.w.log("PeerConnectionClient", "shareScreenTransceiver setDirection failed with error: " + e2.getMessage());
                    }
                    sb9 sb9Var2 = qpcVar2.t.o;
                    if (sb9Var2 != null && (videoTrack = (VideoTrack) ((MediaStreamTrack) sb9Var2.z.e)) != null) {
                        ewe eweVar2 = qpcVar2.o;
                        RtpSender sender2 = next2.getSender();
                        eweVar2.getClass();
                        sender2.getClass();
                        eweVar2.f(sender2, "screen-share", 30000, 2048000, null, false);
                        qpcVar2.P = sender2;
                        sender2.setTrack(videoTrack, false);
                        qpcVar2.w.log("PeerConnectionClient", "shareScreenTransceiver setTrack, trackId = " + videoTrack.id());
                        try {
                            qpcVar2.n(peerConnection2, false, true, qpcVar2.P);
                        } catch (IllegalStateException e3) {
                            qpcVar2.w.log("PeerConnectionClient", "IllegalStateException, " + qpcVar2 + " ex=" + e3);
                        } catch (Exception e4) {
                            qpcVar2.w.log("PeerConnectionClient", "Exception, " + qpcVar2 + " ex=" + e4);
                        }
                    }
                }
                qpcVar2.x(peerConnection2);
                wbb wbbVar = wbb.b;
                if (!wbbVar.equals(qpcVar2.y.n)) {
                    peerConnection2.createAnswer(new npc(qpcVar2, 1), new MediaConstraints());
                } else {
                    qpcVar2.g(new xbb(wbbVar, "emulated error", null, qpcVar2.H.getRemoteDescription()));
                }
                break;
        }
    }
}
