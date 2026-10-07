package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class g93 extends aq implements qih, btc {
    public final long f;
    public final boolean g;

    public g93(long j, long j2, boolean z) {
        super(j);
        this.f = j2;
        this.g = z;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        st2 st2Var = ((h93) kihVar).c;
        if (st2Var != null) {
            p().c0(Collections.singletonList(st2Var));
        }
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
        Tasks.ChatPersonalConfig chatPersonalConfig = new Tasks.ChatPersonalConfig();
        chatPersonalConfig.requestId = this.a;
        chatPersonalConfig.chatId = this.f;
        chatPersonalConfig.hideNonContactBar = this.g;
        return sia.toByteArray(chatPersonalConfig);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_CHAT_PERSONAL_CONFIG;
    }

    @Override // defpackage.btc
    public final atc j() {
        return atc.a;
    }

    @Override // defpackage.aq
    public final Object m() {
        wy2 wy2Var = new wy2(kfc.J1, 10);
        wy2Var.f(this.f, ApiProtocol.PARAM_CHAT_ID);
        wy2Var.a("hideNonContactBar", this.g);
        return wy2Var;
    }
}
