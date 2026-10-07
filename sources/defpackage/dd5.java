package defpackage;

import java.io.Serializable;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpReceiver;
import org.webrtc.VideoTrack;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dd5 implements sg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dd5(int i, Serializable serializable, Object obj, Object obj2) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = serializable;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0129  */
    @Override // defpackage.sg4
    public final void accept(Object obj) {
        String strConcat;
        switch (this.a) {
            case 0:
                ed5 ed5Var = (ed5) this.d;
                RtpReceiver rtpReceiver = (RtpReceiver) this.b;
                MediaStream[] mediaStreamArr = (MediaStream[]) this.c;
                y3e y3eVar = ed5Var.a;
                MediaStreamTrack mediaStreamTrackTrack = rtpReceiver.track();
                for (VideoTrack videoTrack : mediaStreamArr[0].videoTracks) {
                    String strId = videoTrack.id();
                    y3eVar.log("DefaultRemoteVideoTracks", "remote video track " + strId);
                    if (mediaStreamTrackTrack != null && strId.equals(mediaStreamTrackTrack.id())) {
                        y3eVar.log("DefaultRemoteVideoTracks", "add remote video track ".concat(strId));
                        if (strId.startsWith("video-")) {
                            String strSubstring = strId.substring(6);
                            if (strSubstring.startsWith("u") || strSubstring.startsWith("g")) {
                                strConcat = strId;
                            } else {
                                strConcat = "video-u".concat(strSubstring);
                            }
                        } else {
                            strConcat = strId;
                        }
                        ed5Var.g.put(strConcat, videoTrack);
                        videoTrack.setEnabled(true);
                        qpc qpcVar = ((ipc) ed5Var.d).a;
                        qpcVar.r.post(new i7b(qpcVar, 11, strId));
                    }
                }
                return;
            case 1:
                ymc ymcVar = (ymc) this.d;
                RtpReceiver rtpReceiver2 = (RtpReceiver) this.b;
                MediaStream[] mediaStreamArr2 = (MediaStream[]) this.c;
                synchronized (ymcVar) {
                    try {
                        MediaStreamTrack mediaStreamTrackTrack2 = rtpReceiver2.track();
                        for (VideoTrack videoTrack2 : mediaStreamArr2[0].videoTracks) {
                            String strId2 = videoTrack2.id();
                            ymcVar.a.log("ParticipantsAgnosticVideoTracks", "remote video track " + strId2);
                            if (mediaStreamTrackTrack2 != null && strId2.equals(mediaStreamTrackTrack2.id())) {
                                ymcVar.a.log("ParticipantsAgnosticVideoTracks", "add remote video track ".concat(strId2));
                                zmc zmcVar = new zmc(ymcVar.j, (vn7) ymcVar.e);
                                xmc xmcVar = new xmc(ymcVar, strId2);
                                ymcVar.g.add(zmcVar);
                                ymcVar.h.add(xmcVar);
                                ymcVar.f.add(videoTrack2);
                                if (videoTrack2.isDisposed()) {
                                    ymcVar.a.log("ParticipantsAgnosticVideoTracks", "error: video track is disposed");
                                } else {
                                    videoTrack2.addSink(zmcVar);
                                    videoTrack2.addSink(xmcVar);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                SessionRoomParticipantsDataProviderImpl.resolveInternalIdByExternal$lambda$0((cf7) this.d, (cf7) this.b, (ParticipantId) this.c, (yt1) obj);
                return;
        }
    }
}
