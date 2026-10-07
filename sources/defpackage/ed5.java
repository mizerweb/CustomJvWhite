package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.MediaStream;
import org.webrtc.RtpReceiver;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class ed5 extends d2a {
    public static final v4j[] j = {v4j.a, v4j.b};
    public final ConcurrentHashMap f;
    public final HashMap g;
    public final ConcurrentHashMap h;
    public final ConcurrentHashMap i;

    public ed5(vog vogVar, y3e y3eVar, ipc ipcVar, vn7 vn7Var) {
        super(vogVar, y3eVar, ipcVar, vn7Var);
        this.f = new ConcurrentHashMap();
        this.g = new HashMap();
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
    }

    @Override // defpackage.umc
    public final void a(yt1 yt1Var, VideoFrame videoFrame) {
        xtj xtjVar = new xtj(4);
        xtjVar.b = yt1Var;
        xtjVar.c = v4j.b;
        List list = (List) this.f.get(xtjVar.p());
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((z3j) it.next()).a(videoFrame);
        }
    }

    @Override // defpackage.d2a
    public final void d() {
        vog vogVar = (vog) this.b;
        pg4 pg4Var = new pg4(1, this);
        qpc qpcVar = (qpc) vogVar.a;
        qpcVar.j(new bjk(qpcVar, pg4Var, 0));
    }

    @Override // defpackage.d2a
    public final void e(yt1 yt1Var, String str) {
        for (int i = 0; i < 2; i++) {
            v4j v4jVar = j[i];
            xtj xtjVar = new xtj(4);
            xtjVar.c = v4jVar;
            xtjVar.b = yt1Var;
            n(str, xtjVar.p(), null);
        }
    }

    @Override // defpackage.d2a
    public final void f() {
        ((Handler) this.c).removeCallbacksAndMessages(null);
        synchronized (this.f) {
            try {
                Iterator it = this.f.values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((z3j) it2.next()).a = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        vog vogVar = (vog) this.b;
        ((qpc) vogVar.a).j(new jj2(17, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d2a
    public final void j(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        vog vogVar = (vog) this.b;
        dd5 dd5Var = new dd5(0, mediaStreamArr, this, rtpReceiver);
        qpc qpcVar = (qpc) vogVar.a;
        qpcVar.j(new bjk(qpcVar, dd5Var, 0));
    }

    @Override // defpackage.d2a
    public final void n(final String str, final x52 x52Var, final List list) {
        vog vogVar = (vog) this.b;
        sg4 sg4Var = new sg4() { // from class: cd5
            @Override // defpackage.sg4
            public final void accept(Object obj) {
                this.a.p(str, x52Var, list);
            }
        };
        qpc qpcVar = (qpc) vogVar.a;
        qpcVar.j(new bjk(qpcVar, sg4Var, 0));
    }

    public final void p(String str, x52 x52Var, List list) {
        synchronized (this.f) {
            try {
                VideoTrack videoTrack = (VideoTrack) this.g.get(str);
                if (videoTrack == null) {
                    this.a.log("DefaultRemoteVideoTracks", "no " + x52Var + " track");
                    return;
                }
                List<z3j> list2 = (List) this.f.get(x52Var);
                if (list2 == null) {
                    this.a.log("DefaultRemoteVideoTracks", "no renderers for " + x52Var + " track");
                } else {
                    for (z3j z3jVar : list2) {
                        z3jVar.a = null;
                        try {
                            videoTrack.removeSink(z3jVar);
                        } catch (Exception unused) {
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        VideoSink videoSink = (VideoSink) it.next();
                        z3j z3jVar2 = new z3j();
                        z3jVar2.a = videoSink;
                        arrayList.add(z3jVar2);
                        if (x52Var.a == v4j.a && !videoTrack.isDisposed()) {
                            videoTrack.addSink(z3jVar2);
                        }
                    }
                }
                x52 x52Var2 = (x52) this.h.get(str);
                if (x52Var2 != null) {
                    this.h.remove(str);
                    this.i.remove(x52Var2);
                }
                this.h.put(str, x52Var);
                this.i.put(x52Var, str);
                this.f.put(x52Var, Collections.unmodifiableList(arrayList));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
