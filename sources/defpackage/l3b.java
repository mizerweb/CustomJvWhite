package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class l3b extends aq implements qih, btc {
    public final long f;
    public final long g;
    public final long h;
    public final mg5 i;
    public long j;

    public l3b(long j, long j2, long j3, long j4, mg5 mg5Var) {
        super(j);
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = mg5Var;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        m3b m3bVar = (m3b) kihVar;
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        bqVar.i().b(this.f, this.g, this.h);
        bq bqVar2 = this.e;
        (bqVar2 != null ? bqVar2 : null).c().c0(Collections.singletonList(m3bVar.c));
    }

    @Override // defpackage.btc
    public final void d() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        bqVar.k().d(this.a);
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
        Tasks.MsgDeleteRange msgDeleteRange = new Tasks.MsgDeleteRange();
        msgDeleteRange.requestId = this.a;
        msgDeleteRange.chatId = this.f;
        msgDeleteRange.startTime = this.g;
        msgDeleteRange.endTime = this.h;
        msgDeleteRange.itemTypeId = this.i.a;
        return sia.toByteArray(msgDeleteRange);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_MSG_DELETE_RANGE;
    }

    @Override // defpackage.btc
    public final atc j() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        rt2 rt2VarN = bqVar.c().N(this.f);
        if (rt2VarN == null) {
            return atc.c;
        }
        this.j = rt2VarN.b.a;
        return atc.a;
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    @Override // defpackage.aq
    public final Object m() {
        long j = this.j;
        h3b h3bVar = new h3b(kfc.S1, 1);
        h3bVar.f(j, ApiProtocol.PARAM_CHAT_ID);
        h3bVar.f(this.g, "startTime");
        h3bVar.f(this.h, "endTime");
        h3bVar.h("itemType", this.i.name());
        return h3bVar;
    }
}
