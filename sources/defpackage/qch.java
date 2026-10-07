package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class qch extends aq implements qih, btc {
    public final long f;
    public final long g;
    public final boolean h;

    public qch(long j, long j2, boolean z, long j3) {
        super(j);
        this.f = j2;
        this.g = j3;
        this.h = z;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
    }

    @Override // defpackage.btc
    public final void d() {
        v().d(this.a);
        qw2 qw2VarP = p();
        qw2VarP.getClass();
        hw2 hw2Var = new hw2(false, 0 == true ? 1 : 0);
        long j = this.f;
        qw2VarP.v(j, false, hw2Var);
        o().c(new wo3((Collection) Collections.singletonList(Long.valueOf(j)), false, false, (mg5) null, (cid) null, (Set) null, 124));
        o().c(new so4(Collections.singletonList(Long.valueOf(this.g))));
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
        Tasks.SuspendBot suspendBot = new Tasks.SuspendBot();
        suspendBot.requestId = this.a;
        suspendBot.chatId = this.f;
        suspendBot.botId = this.g;
        suspendBot.suspend = this.h;
        return sia.toByteArray(suspendBot);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_SUSPEND_BOT;
    }

    @Override // defpackage.btc
    public final atc j() {
        return atc.a;
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    @Override // defpackage.aq
    public final Object m() {
        lrg lrgVar = new lrg((kfc) null, 6);
        lrgVar.f(this.g, "botId");
        lrgVar.a(SdkMetricStatEvent.VALUE_KEY, this.h);
        return lrgVar;
    }
}
