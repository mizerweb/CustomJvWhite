package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.webrtc.EglBase;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class szf implements tb9, o8b {
    public final EglBase.Context a;
    public final or1 b;
    public final zzf c;
    public final fwg d;
    public final p8b e;
    public final Context f;
    public final String g;
    public final String h;
    public final String i;
    public final Integer j;
    public final CidLogger k;
    public final boolean l;
    public final xt1 m;
    public volatile sb9 o;
    public volatile VideoSink p;
    public final lb9 q;
    public final nue r;
    public final esh s;
    public final or1 t;
    public final ufk u;
    public ufk w;
    public final CopyOnWriteArraySet n = new CopyOnWriteArraySet();
    public eg2 v = null;

    public szf(rzf rzfVar) {
        CidLogger cidLogger = rzfVar.e;
        this.k = cidLogger;
        this.c = rzfVar.a;
        this.d = rzfVar.b;
        this.j = rzfVar.i;
        this.f = rzfVar.d;
        this.e = rzfVar.c;
        this.a = rzfVar.k;
        this.l = rzfVar.j;
        this.m = rzfVar.f;
        this.b = rzfVar.g;
        this.q = rzfVar.l;
        this.r = rzfVar.n;
        this.h = "ARDAMSv0";
        this.i = "ARDAMSa0";
        this.g = "ARDAMS";
        cidLogger.log("SlmsSource", "local media stream id = ARDAMS local video track id = ARDAMSv0 local audio track id = ARDAMSa0");
        this.s = rzfVar.m;
        this.t = rzfVar.o;
        this.u = rzfVar.h;
    }

    public final n11 a(PeerConnectionFactory peerConnectionFactory) {
        boolean z = this.o == null;
        if (z) {
            rb9 rb9Var = new rb9();
            rb9Var.o = false;
            rb9Var.s = null;
            rb9Var.t = false;
            rb9Var.u = false;
            rb9Var.v = false;
            rb9Var.a = peerConnectionFactory;
            rb9Var.c = this.c.a;
            rb9Var.b = this.d;
            rb9Var.e = this.g;
            rb9Var.f = this.h;
            rb9Var.g = this.i;
            rb9Var.d = this.f.getApplicationContext();
            rb9Var.h = this.k;
            rb9Var.i = this.a;
            rb9Var.k = true;
            rb9Var.j = this.b;
            rb9Var.p = this.l;
            xt1 xt1Var = this.m;
            rb9Var.l = xt1Var.o;
            lb9 lb9Var = this.q;
            rb9Var.q = lb9Var;
            rb9Var.m = this.r;
            rb9Var.s = this.j;
            v88 v88Var = xt1Var.r;
            rb9Var.t = v88Var.a;
            rb9Var.o = v88Var.f;
            rb9Var.n = this.s;
            rb9Var.r = this.u;
            rb9Var.v = v88Var.A;
            rb9Var.u = v88Var.O;
            if (rb9Var.a == null) {
                ore.k("peerConnectionFactory is null");
                return null;
            }
            if (lb9Var == null) {
                ore.k("mediaPermissionProvider is null");
                return null;
            }
            if (rb9Var.b == null) {
                ore.k("videoCaptureFactory is null");
                return null;
            }
            if (TextUtils.isEmpty(rb9Var.e)) {
                ore.k("mediaStreamId is null or empty");
                return null;
            }
            if (TextUtils.isEmpty(rb9Var.f)) {
                ore.k("videoTrackId is null or empty");
                return null;
            }
            if (TextUtils.isEmpty(rb9Var.g)) {
                ore.k("audioTrackId is null or empty");
                return null;
            }
            if (rb9Var.h == null) {
                ore.k("log is null");
                return null;
            }
            if (rb9Var.j == null) {
                ore.k("screenshareChecker is null");
                return null;
            }
            if (rb9Var.i == null) {
                ore.k("eglContext is null");
                return null;
            }
            if (rb9Var.m == null) {
                ore.k("rotationProvider is null");
                return null;
            }
            if (rb9Var.n == null) {
                ore.k("timeProvider is null");
                return null;
            }
            if (rb9Var.r == null) {
                ore.k("screenCaptureStateListener is null");
                return null;
            }
            this.o = new sb9(rb9Var);
            this.o.x = this.w;
            this.o.c.add(this);
            if (this.v != null) {
                this.o.k(this.v);
            }
            VideoSink videoSink = this.p;
            if (videoSink != null) {
                this.o.j(videoSink);
            }
            this.o.d(this.e);
            or1 or1Var = this.t;
            if (or1Var != null) {
                sb9 sb9Var = this.o;
                sb9Var.getClass();
                or1Var.a.j.c = new qb9(sb9Var);
            }
        }
        return new n11(this.o, z, 12);
    }

    @Override // defpackage.tb9
    public final void b(sb9 sb9Var) {
        this.k.log("SlmsSource", "onLocalMediaStreamChanged");
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((tb9) it.next()).b(sb9Var);
        }
    }

    public final int c() {
        sb9 sb9Var = this.o;
        if (sb9Var != null) {
            kd2 kd2Var = sb9Var.r;
            if (kd2Var != null && kd2Var.k) {
                MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) sb9Var.y.e;
                if (mediaStreamTrack != null ? mediaStreamTrack.enabled() : false) {
                    return kd2Var.i ? 1 : 2;
                }
            }
            b4f b4fVar = sb9Var.t;
            if (b4fVar != null && b4fVar.d) {
                MediaStreamTrack mediaStreamTrack2 = (MediaStreamTrack) sb9Var.z.e;
                if (mediaStreamTrack2 != null ? mediaStreamTrack2.enabled() : false) {
                    return 3;
                }
            }
        }
        return 0;
    }

    public final void d(boolean z) {
        sb9 sb9Var = this.o;
        if (sb9Var != null) {
            gb0 gb0Var = sb9Var.j;
            MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) gb0Var.e;
            if ((mediaStreamTrack != null ? mediaStreamTrack.enabled() : false) != z) {
                sb9Var.n.log("OKRTCLmsAdapter", zo5.s("setAudioShareTrackEnabled, enabled=", z));
                gb0Var.m(z);
            }
        }
    }

    @Override // defpackage.o8b
    public final void l(p8b p8bVar) {
        this.k.log("SlmsSource", "onMediaSettingsChanged, " + p8bVar);
        this.c.a(new y81(this, 3, p8bVar), new o01(15, this));
    }
}
