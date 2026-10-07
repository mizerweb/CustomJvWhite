package defpackage;

import java.util.Arrays;
import java.util.Locale;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class gd9 extends aq implements btc, qih {
    public final long f;
    public final long g;
    public final String h;

    public gd9(long j, long j2, long j3) {
        super(j);
        this.f = j2;
        this.g = j3;
        this.h = gd9.class.getName();
    }

    @Override // defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        hd9 hd9Var = (hd9) kihVar;
        rt2 rt2VarK = p().K(this.f);
        if (rt2VarK != null) {
            long jD = r().d(rt2VarK.a, hd9Var.c, t().a.t(), null);
            if (jD != 0) {
                o().c(new kfi(rt2VarK.a, jD, false));
                return;
            }
            String str = this.h;
            String str2 = String.format(Locale.ENGLISH, "Can't insert message: response = %s", Arrays.copyOf(new Object[]{hd9Var}, 1));
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, str, str2, null, null, 8);
            }
        }
    }

    @Override // defpackage.btc
    public final void d() {
        String str = this.h;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            a4c.f(a4cVar, je9.g, str, "onMaxFailCount", null, null, 8);
        }
        v().d(this.a);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        o().c(new yq0(this.a, yhhVar));
        if (p90.C(yhhVar.b)) {
            return;
        }
        d();
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.LocationStop locationStop = new Tasks.LocationStop();
        locationStop.requestId = this.a;
        locationStop.chatId = this.f;
        locationStop.messageId = this.g;
        return sia.toByteArray(locationStop);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_LOCATION_STOP;
    }

    @Override // defpackage.btc
    public final atc j() {
        sfa sfaVarF;
        long j = this.f;
        StringBuilder sbS = qt4.s(j, "onPreExecute: serverChatId = ", ", serverMessageId = ");
        long j2 = this.g;
        sbS.append(j2);
        gm0.n(this.h, sbS.toString());
        rt2 rt2VarK = p().K(j);
        return (rt2VarK == null || (sfaVarF = r().f(rt2VarK.a, j2)) == null || sfaVarF.j == wja.DELETED) ? atc.c : atc.a;
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    @Override // defpackage.aq
    public final Object m() {
        wy2 wy2Var = new wy2((kfc) null, 29);
        wy2Var.f(this.f, ApiProtocol.PARAM_CHAT_ID);
        wy2Var.f(this.g, "messageId");
        return wy2Var;
    }
}
