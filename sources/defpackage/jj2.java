package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;
import com.my.tracker.campaign.CampaignService;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chatscreen.ChatScreen;
import org.apache.http.conn.params.ConnManagerParams;
import org.webrtc.VideoTrack;
import org.webrtc.VpxDecoderWrapper;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.tracer.minidump.Minidump;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jj2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jj2(n3 n3Var, cv4 cv4Var) {
        this.a = 10;
        this.b = cv4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((CampaignService) obj).stopSelf();
                return;
            case 1:
                hjd hjdVar = (hjd) ((js8) ((ad2) obj).b).a;
                if (hjdVar != null) {
                    tvj.a("ProcessingRequest", "onCaptureStarted: request ID = " + hjdVar.a);
                    hjdVar.g.b();
                    return;
                }
                return;
            case 2:
                ((CarouselLayoutManager) obj).x0();
                return;
            case 3:
                ou7 ou7Var = ChatScreen.L1;
                ((ChatScreen) obj).g2().i(true);
                return;
            case 4:
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) obj;
                zv8[] zv8VarArr = ChatsListSearchScreen.F;
                chatsListSearchScreen.u1();
                chatsListSearchScreen.v1(false);
                return;
            case 5:
                d74 d74Var = (d74) obj;
                Runnable runnable = d74Var.b;
                if (runnable != null) {
                    runnable.run();
                    d74Var.b = null;
                    return;
                }
                return;
            case 6:
                i74.a((i74) obj);
                return;
            case 7:
                ((fs4) obj).b().e(false);
                return;
            case 8:
                ((ConversationFactory) obj).lambda$requestServerTime$18();
                return;
            case 9:
                int andSet = ((AtomicInteger) ((n3) obj).g).getAndSet(0);
                swh swhVar = swh.a;
                Object obj2 = swh.c().get(gm0.c);
                if ((obj2 instanceof fv4 ? (fv4) obj2 : null) == null) {
                    try {
                        Minidump minidump = Minidump.c;
                        break;
                    } catch (Throwable unused) {
                    }
                }
                swh.b().a(andSet);
                return;
            case 10:
                j85.z(Collections.singletonList((cv4) obj));
                return;
            case 11:
                ldc ldcVar = (ldc) ((gz4) obj).c.a;
                ldcVar.k.x(ldcVar, ldcVar.A(ldcVar.z()));
                return;
            case 12:
                ((VpxDecoderWrapper) obj).close();
                return;
            case 13:
                r75 r75Var = (r75) obj;
                r75Var.y(r75Var.t(), 1028, new hs4(20));
                r75Var.f.d();
                return;
            case 14:
                b85 b85Var = (b85) obj;
                if (b85Var.a0 >= 300000) {
                    ((lt9) b85Var.n.b).r2 = true;
                    b85Var.a0 = 0L;
                    return;
                }
                return;
            case 15:
                da5 da5Var = (da5) obj;
                if (da5Var.c) {
                    return;
                }
                xu5 xu5Var = da5Var.b;
                if (xu5Var != null) {
                    xu5Var.f(da5Var.a);
                }
                da5Var.d.n.remove(da5Var);
                da5Var.c = true;
                return;
            case 16:
                ((ca5) obj).f(null);
                return;
            case 17:
                ed5 ed5Var = (ed5) obj;
                synchronized (ed5Var.f) {
                    ed5Var.a.log("DefaultRemoteVideoTracks", ed5Var + ": remove remote video renderers");
                    for (Map.Entry entry : ed5Var.f.entrySet()) {
                        if (((x52) entry.getKey()).a == v4j.a) {
                            VideoTrack videoTrack = (VideoTrack) ed5Var.g.get((String) ed5Var.i.get(entry.getKey()));
                            for (z3j z3jVar : (List) entry.getValue()) {
                                z3jVar.a = null;
                                if (videoTrack != null) {
                                    try {
                                        videoTrack.removeSink(z3jVar);
                                    } catch (Exception unused2) {
                                    }
                                }
                            }
                        }
                    }
                    ed5Var.f.clear();
                    ed5Var.g.clear();
                    break;
                }
                return;
            case 18:
                ((vd5) obj).a(null);
                return;
            case 19:
                ((r72) obj).d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((cch) obj).close();
                return;
            case 21:
                fe5 fe5Var = (fe5) obj;
                fe5Var.j = true;
                fe5Var.a();
                return;
            case 22:
                ((nf5) obj).h.O();
                return;
            case 23:
                ((swi) obj).v();
                return;
            case 24:
                ((rf5) obj).h.d();
                return;
            case 25:
                ei5.setSelectionEnd$lambda$0((ei5) obj);
                return;
            case 26:
                ws5 ws5Var = (ws5) obj;
                gs5 gs5Var = ws5Var.r;
                if (gs5Var != null) {
                    fs5 fs5Var = gs5Var.k;
                    if (fs5Var != null && !fs5Var.k) {
                        fs5Var.k = true;
                        fs5Var.g.sendEmptyMessage(4);
                    }
                    gs5Var.d.a();
                    for (ks0 ks0Var : (ks0[]) gs5Var.e.a) {
                        lvb.b0(ks0Var.h == 0);
                        ks0Var.q();
                    }
                }
                ws5Var.r = null;
                return;
            case 27:
                zv5 zv5Var = (zv5) obj;
                zv5Var.f = true;
                zv5Var.a();
                return;
            case 28:
                aw5 aw5Var = (aw5) ((g85) obj).d;
                if (aw5Var != null) {
                    Iterator it = aw5Var.values().iterator();
                    while (it.hasNext()) {
                        ((zbh) it.next()).c();
                    }
                    return;
                }
                return;
            default:
                ((g36) obj).invalidate();
                return;
        }
    }

    public /* synthetic */ jj2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ jj2(gz4 gz4Var, long j) {
        this.a = 11;
        this.b = gz4Var;
    }

    public /* synthetic */ jj2(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
    }
}
