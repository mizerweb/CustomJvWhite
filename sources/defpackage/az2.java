package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class az2 extends aq implements qih, btc {
    public final long f;
    public final long g;
    public final String h;

    public az2(long j, long j2, long j3) {
        super(j);
        this.f = j2;
        this.g = j3;
        this.h = az2.class.getName();
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        o().c(new wo3((Collection) Collections.singletonList(Long.valueOf(this.f)), true, false, (mg5) null, (cid) null, (Set) null, 124));
    }

    @Override // defpackage.btc
    public final void d() {
        long j = this.a;
        gm0.s(this.h, "onMaxFailCount: remove task, requestId = %d", Long.valueOf(j));
        v().d(j);
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
        Tasks.ChatHide chatHide = new Tasks.ChatHide();
        chatHide.requestId = this.a;
        chatHide.chatId = this.f;
        chatHide.chatServerId = this.g;
        return sia.toByteArray(chatHide);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_CHAT_HIDE;
    }

    @Override // defpackage.btc
    public final atc j() {
        return p().N(this.f) != null ? atc.a : atc.c;
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    @Override // defpackage.aq
    public final Object m() {
        wy2 wy2Var = new wy2((kfc) null, 1);
        wy2Var.f(this.g, ApiProtocol.PARAM_CHAT_ID);
        return wy2Var;
    }
}
