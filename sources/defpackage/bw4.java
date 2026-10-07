package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.stats.LogController$AnalyticsDebugException;

/* JADX INFO: loaded from: classes.dex */
public final class bw4 extends aq implements qih, btc {
    public final kp f;
    public final String g;

    public bw4(long j, kp kpVar) {
        super(j);
        this.f = kpVar;
        this.g = bw4.class.getName();
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        gm0.n(this.g, "onSuccess: logEntry=" + this.f);
    }

    @Override // defpackage.btc
    public final void d() {
        v().d(this.a);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        StringBuilder sb = new StringBuilder("onFail: logEntry=");
        kp kpVar = this.f;
        sb.append(kpVar);
        gm0.n(this.g, sb.toString());
        String str = yhhVar.b;
        if (p90.C(str)) {
            return;
        }
        d();
        LogController$AnalyticsDebugException logController$AnalyticsDebugException = new LogController$AnalyticsDebugException("Could not send crit event " + kpVar + ".\nError: " + str + ".\nMessage: " + yhhVar.c, null);
        bq bqVar = this.e;
        ((t1c) ((ed6) (bqVar != null ? bqVar : null).v.getValue())).a(logController$AnalyticsDebugException);
    }

    @Override // defpackage.btc
    public final byte[] g() throws IOException {
        Tasks.CritLog critLog = new Tasks.CritLog();
        critLog.requestId = this.a;
        kp kpVar = this.f;
        critLog.time = kpVar.a;
        critLog.userId = kpVar.b;
        critLog.sessionId = kpVar.c;
        critLog.type = kpVar.d;
        critLog.event = kpVar.e;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ch3.Y(kpVar.f, byteArrayOutputStream);
        critLog.params = byteArrayOutputStream.toByteArray();
        return sia.toByteArray(critLog);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_STAT_CRIT_EVENT;
    }

    @Override // defpackage.btc
    public final atc j() {
        return atc.a;
    }

    @Override // defpackage.btc
    public final int l() {
        return 10;
    }

    @Override // defpackage.aq
    public final Object m() {
        return new rd9(Collections.singletonList(this.f));
    }
}
