package defpackage;

import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class v4f extends d2a {
    public final PeerConnectionFactory f;
    public SurfaceTextureHelper g;
    public final euc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4f(PeerConnectionFactory peerConnectionFactory, String str, MediaStream mediaStream, CidLogger cidLogger, ufk ufkVar, nue nueVar) {
        super(str, mediaStream, cidLogger);
        peerConnectionFactory.getClass();
        cidLogger.getClass();
        ufkVar.getClass();
        nueVar.getClass();
        this.f = peerConnectionFactory;
        this.h = new euc(nueVar, ufkVar);
    }

    @Override // defpackage.d2a
    public final void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
        if (mediaStream != null) {
            mediaStream.addTrack(videoTrack);
        }
    }

    @Override // defpackage.d2a
    public final void c(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
        videoTrack.getClass();
        if (mediaStream != null) {
            mediaStream.removeTrack(videoTrack);
        }
        SurfaceTextureHelper surfaceTextureHelper = this.g;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
        }
        this.g = null;
    }

    @Override // defpackage.d2a
    public final MediaSource g() {
        VideoSource videoSourceCreateVideoSource = this.f.createVideoSource(false);
        videoSourceCreateVideoSource.getClass();
        return videoSourceCreateVideoSource;
    }

    @Override // defpackage.d2a
    public final MediaStreamTrack h(String str, MediaSource mediaSource) {
        str.getClass();
        VideoTrack videoTrackCreateVideoTrack = this.f.createVideoTrack(str, (VideoSource) mediaSource);
        videoTrackCreateVideoTrack.getClass();
        return videoTrackCreateVideoTrack;
    }

    public final void p(int i, int i2, int i3) {
        int i4;
        wvi wviVar;
        int iK;
        if (i <= 0 || i2 <= 0 || i < i2 || i3 <= 0) {
            i4 = i3;
            wviVar = null;
        } else {
            int i5 = 320;
            if (i < 320) {
                iK = gm0.K((i2 / i) * 320.0f) / 16;
            } else {
                i5 = (i / 16) * 16;
                iK = i2 / 16;
            }
            int i6 = iK * 16;
            int i7 = i5;
            i4 = i3;
            wviVar = new wvi(i7, i6, i6, i7, i4);
        }
        if (wviVar == null) {
            return;
        }
        VideoSource videoSource = (VideoSource) ((MediaSource) this.d);
        if (videoSource != null) {
            int i8 = i4;
            videoSource.adaptOutputFormat(wviVar.a, wviVar.b, wviVar.c, wviVar.d, i8);
            i4 = i8;
        }
        String strI = i();
        StringBuilder sbP = qv1.p("Set screenshare dimensions to ", wviVar.a, " x ", wviVar.b, " by requested ");
        qt4.x(i, i2, " x ", " fps ", sbP);
        sbP.append(i4);
        this.a.log(strI, sbP.toString());
    }

    public final String toString() {
        return "OkSdkScreenShareRecord";
    }
}
