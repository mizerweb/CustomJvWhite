package defpackage;

import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pg4 implements sg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pg4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sg4
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Runnable) obj2).run();
                return;
            case 1:
                ed5 ed5Var = (ed5) obj2;
                synchronized (ed5Var.f) {
                    try {
                        for (String str : ed5Var.h.keySet()) {
                            ed5Var.p(str, (x52) ed5Var.h.get(str), null);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 2:
                ((PeerConnection) obj).removeIceCandidates((IceCandidate[]) obj2);
                return;
            case 3:
                ((PeerConnection) obj).getStats(new qyb(3, (jkg) obj2));
                return;
            case 4:
                ((cf7) obj2).invoke((yt1) obj);
                return;
            default:
                ((b8g) ((f8g) obj2)).a((yt1) obj);
                return;
        }
    }
}
