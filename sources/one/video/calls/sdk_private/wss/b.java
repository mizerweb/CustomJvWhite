package one.video.calls.sdk_private.wss;

import defpackage.ch;
import defpackage.mtj;
import defpackage.otj;
import defpackage.pne;
import defpackage.w5g;
import defpackage.y5g;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends otj {
    public final /* synthetic */ w5g a;

    public b(w5g w5gVar) {
        this.a = w5gVar;
    }

    public final void onClosed(mtj mtjVar, int i, String str) {
        mtjVar.getClass();
        str.getClass();
        ch chVar = (ch) this.a;
        chVar.getClass();
        ((y5g) chVar.c).a(str);
    }

    public final void onFailure(mtj mtjVar, Throwable th, pne pneVar) {
        mtjVar.getClass();
        th.getClass();
        ((ch) this.a).onFailure(th);
    }

    public final void onMessage(mtj mtjVar, String str) {
        mtjVar.getClass();
        str.getClass();
        ch chVar = (ch) this.a;
        chVar.getClass();
        ((y5g) chVar.c).b(str);
    }

    public final void onOpen(mtj mtjVar, pne pneVar) {
        mtjVar.getClass();
        pneVar.getClass();
        ch chVar = (ch) this.a;
        chVar.b = true;
        y5g y5gVar = (y5g) chVar.c;
        y5g.access$resetReconnectContext(y5gVar);
        y5g.access$resetReconnectDelay(y5gVar);
        y5g.access$handleSocketOpen(y5gVar);
    }
}
