package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.MediaStream;
import org.webrtc.RtpReceiver;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* JADX INFO: loaded from: classes3.dex */
public final class ymc extends d2a {
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final HashMap i;
    public final ConcurrentHashMap j;
    public final ConcurrentHashMap k;
    public final ConcurrentHashMap l;

    public ymc(vog vogVar, y3e y3eVar, ipc ipcVar, vn7 vn7Var) {
        super(vogVar, y3eVar, ipcVar, vn7Var);
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new HashMap();
        this.j = new ConcurrentHashMap();
        this.k = new ConcurrentHashMap();
        this.l = new ConcurrentHashMap();
    }

    @Override // defpackage.umc
    public final void a(yt1 yt1Var, VideoFrame videoFrame) {
        xtj xtjVar = new xtj(4);
        xtjVar.b = yt1Var;
        xtjVar.c = v4j.b;
        List list = (List) this.j.get(xtjVar.p());
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((VideoSink) it.next()).onFrame(videoFrame);
            }
        }
    }

    @Override // defpackage.d2a
    public final void d() {
        uza.d();
        this.j.clear();
        this.i.clear();
    }

    @Override // defpackage.d2a
    public final void e(yt1 yt1Var, String str) {
        uza.d();
        HashMap map = this.i;
        Set set = (Set) map.get(yt1Var);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.j.remove((x52) it.next());
        }
        map.remove(yt1Var);
    }

    @Override // defpackage.d2a
    public final void f() {
        ((Handler) this.c).removeCallbacksAndMessages(null);
        vog vogVar = (vog) this.b;
        ((qpc) vogVar.a).j(new h7b(3, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d2a
    public final void j(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        vog vogVar = (vog) this.b;
        dd5 dd5Var = new dd5(1, mediaStreamArr, this, rtpReceiver);
        qpc qpcVar = (qpc) vogVar.a;
        qpcVar.j(new bjk(qpcVar, dd5Var, 0));
    }

    @Override // defpackage.d2a
    public final void n(String str, x52 x52Var, List list) {
        uza.d();
        HashMap map = this.i;
        ConcurrentHashMap concurrentHashMap = this.j;
        if (list == null) {
            concurrentHashMap.remove(x52Var);
            Set set = (Set) map.get(x52Var.b);
            if (set != null) {
                set.remove(x52Var);
                return;
            }
            return;
        }
        concurrentHashMap.put(x52Var, list);
        Set hashSet = (Set) map.get(x52Var.b);
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(x52Var.b, hashSet);
        }
        hashSet.add(x52Var);
    }
}
