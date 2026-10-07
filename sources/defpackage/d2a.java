package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d2a implements umc {
    public final y3e a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;

    public d2a(vog vogVar, y3e y3eVar, ipc ipcVar, vn7 vn7Var) {
        this.b = vogVar;
        this.a = y3eVar;
        this.d = ipcVar;
        this.c = new Handler(Looper.getMainLooper());
        this.e = vn7Var;
    }

    public abstract void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack);

    public abstract void c(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack);

    public abstract void d();

    public abstract void e(yt1 yt1Var, String str);

    public abstract void f();

    public abstract MediaSource g();

    public abstract MediaStreamTrack h(String str, MediaSource mediaSource);

    public String i() {
        return getClass().getSimpleName();
    }

    public abstract void j(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr);

    public void k() {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.e;
        y3e y3eVar = this.a;
        if (mediaStreamTrack != null) {
            y3eVar.log(i(), this + ": An attempt to create track, while got one, ignore");
            return;
        }
        if (((MediaSource) this.d) != null) {
            y3eVar.log(i(), this + ": An attempt to create source, while got one, ignore");
            return;
        }
        MediaSource mediaSourceG = g();
        this.d = mediaSourceG;
        MediaStreamTrack mediaStreamTrackH = h((String) this.b, mediaSourceG);
        this.e = mediaStreamTrackH;
        b((MediaStream) this.c, mediaStreamTrackH);
    }

    public void l() {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.e;
        if (mediaStreamTrack != null) {
            c((MediaStream) this.c, mediaStreamTrack);
        }
        MediaStreamTrack mediaStreamTrack2 = (MediaStreamTrack) this.e;
        y3e y3eVar = this.a;
        if (mediaStreamTrack2 != null) {
            mediaStreamTrack2.dispose();
            y3eVar.log(i(), this + ": " + uza.b(mediaStreamTrack2) + " was disposed");
        }
        this.e = null;
        MediaSource mediaSource = (MediaSource) this.d;
        if (mediaSource != null) {
            mediaSource.dispose();
            y3eVar.log(i(), this + ": " + uza.b(mediaSource) + " was disposed");
        }
        this.d = null;
    }

    public void m(boolean z) {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.e;
        if (mediaStreamTrack != null) {
            mediaStreamTrack.setEnabled(z);
        }
    }

    public abstract void n(String str, x52 x52Var, List list);

    public void o(RtpSender rtpSender) {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.e;
        if (rtpSender == null || mediaStreamTrack == null || rtpSender.track() == mediaStreamTrack) {
            return;
        }
        this.a.log(i(), this + ": bind " + uza.b(mediaStreamTrack) + " with " + uza.b(rtpSender));
        rtpSender.setTrack(mediaStreamTrack, false);
    }

    public d2a(String str, MediaStream mediaStream, y3e y3eVar) {
        str.getClass();
        y3eVar.getClass();
        this.b = str;
        this.c = mediaStream;
        this.a = y3eVar;
    }
}
