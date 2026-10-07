package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class sv2 extends aq implements qih, btc {
    public final long f;
    public final int g;
    public final String h;

    public sv2(int i, long j, long j2) {
        super(j);
        this.f = j2;
        this.g = i;
        this.h = sv2.class.getName();
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        o().c(new tv2(this.a, this.f));
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
        o().c(new yq0(yhhVar));
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.ChatComplain chatComplain = new Tasks.ChatComplain();
        chatComplain.requestId = this.a;
        chatComplain.chatId = this.f;
        int i = this.g;
        chatComplain.complaint = i == 0 ? "" : tt2.b(i);
        return sia.toByteArray(chatComplain);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_CHAT_COMPLAIN;
    }

    @Override // defpackage.btc
    public final atc j() {
        kx2 kx2Var;
        rt2 rt2VarN = p().N(this.f);
        return (rt2VarN == null || (kx2Var = rt2VarN.b.c) == kx2.d || kx2Var == kx2.e) ? atc.c : atc.a;
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    @Override // defpackage.aq
    public final Object m() {
        rt2 rt2VarN = p().N(this.f);
        kfc kfcVar = null;
        if (rt2VarN == null) {
            gm0.n(this.h, "chat is null");
            return null;
        }
        long j = rt2VarN.b.a;
        vsb vsbVar = new vsb(kfcVar, 28);
        vsbVar.f(j, ApiProtocol.PARAM_CHAT_ID);
        int i = this.g;
        if (i != 0) {
            vsbVar.h("complaint", tt2.b(i));
        }
        return vsbVar;
    }
}
