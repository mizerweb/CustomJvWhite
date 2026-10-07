package defpackage;

import android.graphics.Matrix;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class p3j extends d2a implements SurfaceTextureHelper.FrameGeometryAdjuster {
    public final PeerConnectionFactory f;
    public final boolean g;
    public final yki h;
    public SurfaceTextureHelper i;
    public phf j;
    public final exi k;
    public volatile Size l;
    public volatile float m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3j(PeerConnectionFactory peerConnectionFactory, String str, MediaStream mediaStream, Integer num, boolean z, boolean z2, yki ykiVar, CidLogger cidLogger) {
        super(str, mediaStream, cidLogger);
        peerConnectionFactory.getClass();
        str.getClass();
        cidLogger.getClass();
        this.f = peerConnectionFactory;
        this.g = z2;
        this.h = ykiVar;
        this.k = new exi(z, num != null ? num.intValue() : 960, new ysj(1, this, p3j.class, "logBufferTransform", "logBufferTransform(Ljava/lang/String;)V", 0, 4));
        this.l = new Size(960, 540);
        this.m = 1.0f;
    }

    @Override // org.webrtc.SurfaceTextureHelper.FrameGeometryAdjuster
    public final SurfaceTextureHelper.FrameGeometry adjustFrameGeometry(Matrix matrix, int i, int i2) {
        dxi dxiVar;
        jtc jtcVar;
        Integer num;
        Integer num2;
        Integer num3;
        matrix.getClass();
        exi exiVar = this.k;
        exiVar.getClass();
        if (i == 0 || i2 == 0) {
            exiVar.b.invoke("Wrong frame size: " + i + "x" + i2);
            dxiVar = cxi.a;
        } else {
            jtcVar = exiVar.e;
            Integer num4 = exiVar.d;
            int iIntValue = exiVar.c;
            if (num4 != null) {
                iIntValue = num4.intValue();
            }
            if (jtcVar == null || (num = exiVar.f) == null || num.intValue() != i || (num2 = exiVar.g) == null || num2.intValue() != i2 || (num3 = exiVar.h) == null || num3.intValue() != iIntValue) {
                dxiVar = jtcVar;
                jtc jtcVarA = exiVar.a(i, i2);
                exiVar.e = jtcVarA;
                exiVar.f = Integer.valueOf(i);
                exiVar.g = Integer.valueOf(i2);
                exiVar.h = Integer.valueOf(iIntValue);
                ysj ysjVar = exiVar.b;
                int i3 = jtcVarA.e;
                int i4 = jtcVarA.f;
                StringBuilder sbP = qv1.p("get new transform ", i, "x", i2, " -> ");
                sbP.append(i3);
                sbP.append("x");
                sbP.append(i4);
                ysjVar.invoke(sbP.toString());
                dxiVar = jtcVarA;
            }
        }
        dxiVar = jtcVar;
        return dxiVar.a(matrix, i, i2);
    }

    @Override // defpackage.d2a
    public final void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
        videoTrack.setContentHint(this.g ? VideoTrack.ContentHint.TEXT : VideoTrack.ContentHint.NONE);
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
        SurfaceTextureHelper surfaceTextureHelper = this.i;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
        }
        this.i = null;
    }

    @Override // defpackage.d2a
    public final MediaSource g() {
        VideoSource videoSourceCreateVideoSource = this.f.createVideoSource(this.g);
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

    @Override // defpackage.d2a
    public final String i() {
        return "VideoRecord";
    }

    @Override // defpackage.d2a
    public final void l() {
        super.l();
        this.j = null;
    }

    public final void p() {
        VideoSource videoSource = (VideoSource) ((MediaSource) this.d);
        if (videoSource == null) {
            this.a.log("VideoRecord", "No source while trying to update video format");
            return;
        }
        Size sizeB = this.k.b(this.l.width, this.l.height);
        if (sizeB == null) {
            sizeB = new Size(960, 540);
        }
        this.a.log("VideoRecord", qt4.l("Apply output format adaptation: size= ", sizeB.width, sizeB.height, "x"));
        videoSource.adaptOutputFormat(sizeB.width, sizeB.height, gm0.K(this.m * 24.0f));
    }

    public final String toString() {
        return qv1.m("OkSdkVideoRecord(isScreenCast=", ")", this.g);
    }
}
