package defpackage;

import java.util.Collections;
import java.util.Map;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class z2j extends aq implements qih, btc {
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final boolean n;
    public final ns5 o;
    public final String p;
    public final ifh q;

    public z2j(long j, long j2, long j3, long j4, long j5, String str, boolean z, boolean z2, String str2, boolean z3, ns5 ns5Var) {
        super(j);
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = j5;
        this.j = str;
        this.k = z;
        this.l = z2;
        this.m = str2;
        this.n = z3;
        this.o = ns5Var;
        this.p = z2j.class.getName();
        this.q = new ifh(new vbi(11, this));
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        a3j a3jVar = (a3j) kihVar;
        if (this.k) {
            Map map = a3jVar.c;
            if (map.size() == 1 && map.containsKey("EXTERNAL")) {
                return;
            }
            String str = this.j;
            if (str == null) {
                str = "";
            }
            pjh pjhVar = new pjh(this.i, str, this.f, 0L, 0L, 0L, w3m.a(a3jVar.c), true, false, 0L, "", 0, false, !this.l, this.o, a3jVar.f);
            bq bqVar = this.e;
            if (bqVar == null) {
                bqVar = null;
            }
            ((wp6) bqVar.N.getValue()).b(pjhVar);
        }
    }

    @Override // defpackage.btc
    public final void d() {
        v().d(this.a);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        sfa sfaVarL = r().l(this.i);
        if (sfaVarL == null || sfaVarL.j == wja.DELETED) {
            o().c(new yq0(this.a, yhhVar));
            d();
            return;
        }
        if ("attachment.token.expired".equals(yhhVar.b)) {
            String str = this.p;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, str, "videoPlayCmd failed with token expired, retry videoPlayCmd", null, null, 8);
            }
            if (this.n) {
                o().c(new yq0(this.a, yhhVar));
            } else {
                b3j b3jVar = (b3j) this.q.getValue();
                synchronized (b3jVar) {
                    if (b3jVar.b != -1) {
                        gm0.Y(b3j.class.getName(), "Early return in retry cuz of msgGetRequestId != -1L");
                    } else {
                        b3jVar.a.o().d(b3jVar);
                        pvb pvbVarN = b3jVar.a.n();
                        z2j z2jVar = b3jVar.a;
                        b3jVar.b = pvbVarN.y(z2jVar.g, Collections.singletonList(Long.valueOf(z2jVar.h)));
                    }
                }
            }
        } else if ("video.not.found".equals(yhhVar.b)) {
            String str2 = this.p;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                a4c.f(a4cVar2, je9.g, str2, "videoPlayCmd failed, set attach status to ERROR", null, null, 8);
            }
            r().n(this.i, this.j, new dzh(12));
            o().c(new kfi(sfaVarL.h, sfaVarL.a, false));
        }
        if (p90.C(yhhVar.b)) {
            return;
        }
        d();
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.VideoPlay videoPlay = new Tasks.VideoPlay();
        videoPlay.requestId = this.a;
        videoPlay.videoId = this.f;
        videoPlay.chatServerId = this.g;
        videoPlay.messageServerId = this.h;
        videoPlay.messageId = this.i;
        String str = this.j;
        if (str != null) {
            videoPlay.attachLocalId = str;
        }
        videoPlay.startDownload = this.k;
        videoPlay.saveToGallery = this.l;
        videoPlay.token = this.m;
        videoPlay.place = this.o.a;
        return sia.toByteArray(videoPlay);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_VIDEO_PLAY;
    }

    @Override // defpackage.btc
    public final atc j() {
        sfa sfaVarL;
        long j = this.i;
        return (j <= 0 || !((sfaVarL = r().l(j)) == null || sfaVarL.j == wja.DELETED)) ? atc.a : atc.c;
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    @Override // defpackage.aq
    public final Object m() {
        return new lrg(this.f, this.g, this.h, this.m);
    }
}
