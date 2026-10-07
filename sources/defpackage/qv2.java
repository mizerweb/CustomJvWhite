package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class qv2 extends aq implements qih, btc {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public qv2(long j, long j2, long j3, long j4, boolean z) {
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
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        ((js3) bqVar.P.getValue()).a(this.f, this.h, false);
    }

    @Override // defpackage.btc
    public final void d() {
        v().d(this.a);
        r().r(this.f, this.h, wja.ACTIVE);
        qw2 qw2VarP = p();
        long j = this.f;
        qw2VarP.I(j);
        o().c(new wo3((Collection) Collections.singletonList(Long.valueOf(j)), true, false, (mg5) null, (cid) null, (Set) null, 124));
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        if (yhhVar instanceof thh) {
            return;
        }
        d();
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.ChatClear chatClear = new Tasks.ChatClear();
        chatClear.requestId = this.a;
        chatClear.chatId = this.f;
        chatClear.chatServerId = this.g;
        chatClear.lastEventTime = this.h;
        chatClear.forAll = this.i;
        return sia.toByteArray(chatClear);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_CHAT_CLEAR;
    }

    @Override // defpackage.btc
    public final atc j() {
        kx2 kx2Var;
        rt2 rt2VarN = p().N(this.f);
        return (rt2VarN == null || !((kx2Var = rt2VarN.b.c) == kx2.d || kx2Var == kx2.e)) ? atc.a : atc.c;
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    @Override // defpackage.aq
    public final Object m() {
        vsb vsbVar = new vsb((kfc) null, 27);
        vsbVar.f(this.g, ApiProtocol.PARAM_CHAT_ID);
        vsbVar.f(this.h, "lastEventTime");
        vsbVar.a("forAll", this.i);
        return vsbVar;
    }
}
