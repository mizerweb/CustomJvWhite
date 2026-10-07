package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class ux2 extends aq implements qih, btc {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public ux2(long j, long j2, long j3, long j4, boolean z) {
        super(j);
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = z;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        qw2 qw2VarP = p();
        kx2 kx2Var = kx2.d;
        long j = this.f;
        qw2VarP.w(j, kx2Var);
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        ((js3) bqVar.P.getValue()).a(this.f, this.h, false);
        o().c(new pie(j));
    }

    @Override // defpackage.btc
    public final void d() {
        v().d(this.a);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        if (p90.C(yhhVar.b)) {
            return;
        }
        d();
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.ChatDelete chatDelete = new Tasks.ChatDelete();
        chatDelete.requestId = this.a;
        chatDelete.chatId = this.f;
        chatDelete.chatServerId = this.g;
        chatDelete.lastEventTime = this.h;
        chatDelete.forAll = this.i;
        return sia.toByteArray(chatDelete);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_CHAT_DELETE;
    }

    @Override // defpackage.btc
    public final atc j() {
        rt2 rt2VarN = p().N(this.f);
        if (rt2VarN == null || rt2VarN.b.c != kx2.d) {
            return atc.a;
        }
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        ((js3) bqVar.P.getValue()).a(this.f, this.h, false);
        return atc.c;
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    @Override // defpackage.aq
    public final Object m() {
        vsb vsbVar = new vsb((kfc) null, 29);
        vsbVar.f(this.g, ApiProtocol.PARAM_CHAT_ID);
        vsbVar.f(this.h, "lastEventTime");
        vsbVar.a("forAll", this.i);
        return vsbVar;
    }
}
