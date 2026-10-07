package defpackage;

import java.util.Collections;
import java.util.Iterator;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class n93 extends aq implements qih, btc {
    public final long f;
    public final boolean g;

    public n93(long j, long j2, boolean z) {
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
        o93 o93Var = (o93) kihVar;
        if (o93Var.c != null) {
            p().Z(this.f, uw2.d);
            p().c0(Collections.singletonList(o93Var.c));
        }
    }

    @Override // defpackage.btc
    public final void d() {
        p().Z(this.f, uw2.d);
        v().d(this.a);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        if (!p90.C(yhhVar.b)) {
            d();
        }
        o().c(new yq0(this.a, yhhVar));
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.ChatPinSetVisibility chatPinSetVisibility = new Tasks.ChatPinSetVisibility();
        chatPinSetVisibility.requestId = this.a;
        chatPinSetVisibility.chatServerId = this.f;
        chatPinSetVisibility.show = this.g;
        return sia.toByteArray(chatPinSetVisibility);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_CHAT_PIN_SET_VISIBILITY;
    }

    @Override // defpackage.btc
    public final atc j() {
        okh okhVarV = v();
        ctc ctcVar = ctc.TYPE_CHAT_PIN_SET_VISIBILITY;
        long j = this.a;
        Iterator it = okhVarV.h(j, ctcVar).iterator();
        while (it.hasNext()) {
            n93 n93Var = (n93) ((tjh) it.next()).f;
            if (n93Var.f == this.f && n93Var.a > j) {
                return atc.c;
            }
        }
        return atc.a;
    }

    @Override // defpackage.aq
    public final Object m() {
        wy2 wy2Var = new wy2((kfc) null, 11);
        wy2Var.f(this.f, ApiProtocol.PARAM_CHAT_ID);
        wy2Var.a("show", this.g);
        return wy2Var;
    }
}
