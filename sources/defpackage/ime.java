package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ime implements hme {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    @Override // defpackage.hme
    public final synchronized void a(v78 v78Var, String str, boolean z) {
        if (pj6.a.h(2)) {
            Long l = (Long) this.b.remove(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            pj6.g("time %d: onRequestSuccess: {requestId: %s, elapsedTime: %d ms}", Long.valueOf(jUptimeMillis), str, Long.valueOf(ku6.j(jUptimeMillis, l)));
        }
    }

    @Override // defpackage.hme
    public final synchronized void b(String str, String str2) {
        if (pj6.a.h(2)) {
            Pair pairCreate = Pair.create(str, str2);
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.a.put(pairCreate, Long.valueOf(jUptimeMillis));
            pj6.g("time %d: onProducerStart: {requestId: %s, producer: %s}", Long.valueOf(jUptimeMillis), str, str2);
        }
    }

    @Override // defpackage.hme
    public final boolean c(String str) {
        return pj6.a.h(2);
    }

    @Override // defpackage.hme
    public final synchronized void d(String str, String str2, Map map) {
        if (pj6.a.h(2)) {
            Long l = (Long) this.a.remove(Pair.create(str, str2));
            long jUptimeMillis = SystemClock.uptimeMillis();
            pj6.h("RequestLoggingListener", "time %d: onProducerFinishWithSuccess: {requestId: %s, producer: %s, elapsedTime: %d ms, extraMap: %s}", Long.valueOf(jUptimeMillis), str, str2, Long.valueOf(ku6.j(jUptimeMillis, l)), map);
        }
    }

    @Override // defpackage.hme
    public final synchronized void e(String str, String str2, Throwable th, Map map) {
        if (pj6.a.h(5)) {
            Long l = (Long) this.a.remove(Pair.create(str, str2));
            long jUptimeMillis = SystemClock.uptimeMillis();
            Object[] objArr = {Long.valueOf(jUptimeMillis), str, str2, Long.valueOf(ku6.j(jUptimeMillis, l)), map, th.toString()};
            if (pj6.a.h(5)) {
                pj6.a.w("RequestLoggingListener", String.format(null, "time %d: onProducerFinishWithFailure: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s, throwable: %s}", objArr), th);
            }
        }
    }

    @Override // defpackage.hme
    public final synchronized void f(v78 v78Var, Object obj, String str, boolean z) {
        if (pj6.a.h(2)) {
            Long lValueOf = Long.valueOf(SystemClock.uptimeMillis());
            Boolean boolValueOf = Boolean.valueOf(z);
            if (pj6.a.h(2)) {
                pj6.a.v("RequestLoggingListener", String.format(null, "time %d: onRequestSubmit: {requestId: %s, callerContext: %s, isPrefetch: %b}", lValueOf, str, obj, boolValueOf));
            }
            this.b.put(str, Long.valueOf(SystemClock.uptimeMillis()));
        }
    }

    @Override // defpackage.hme
    public final synchronized void g(v78 v78Var, String str, Throwable th, boolean z) {
        if (pj6.a.h(5)) {
            Long l = (Long) this.b.remove(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            pj6.l("RequestLoggingListener", "time %d: onRequestFailure: {requestId: %s, elapsedTime: %d ms, throwable: %s}", Long.valueOf(jUptimeMillis), str, Long.valueOf(ku6.j(jUptimeMillis, l)), th.toString());
        }
    }

    @Override // defpackage.hme
    public final synchronized void h(String str, String str2) {
        if (pj6.a.h(2)) {
            Long l = (Long) this.a.remove(Pair.create(str, str2));
            long jUptimeMillis = SystemClock.uptimeMillis();
            pj6.h("RequestLoggingListener", "time %d: onProducerFinishWithCancellation: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s}", Long.valueOf(jUptimeMillis), str, str2, Long.valueOf(ku6.j(jUptimeMillis, l)), null);
        }
    }

    @Override // defpackage.hme
    public final synchronized void i(String str, String str2, boolean z) {
        if (pj6.a.h(2)) {
            Long l = (Long) this.a.remove(Pair.create(str, str2));
            long jUptimeMillis = SystemClock.uptimeMillis();
            pj6.h("RequestLoggingListener", "time %d: onUltimateProducerReached: {requestId: %s, producer: %s, elapsedTime: %d ms, success: %b}", Long.valueOf(jUptimeMillis), str, str2, Long.valueOf(ku6.j(jUptimeMillis, l)), Boolean.valueOf(z));
        }
    }

    @Override // defpackage.hme
    public final synchronized void j(String str) {
        if (pj6.a.h(2)) {
            Long l = (Long) this.a.get(Pair.create(str, "NetworkFetchProducer"));
            pj6.h("RequestLoggingListener", "time %d: onProducerEvent: {requestId: %s, stage: %s, eventName: %s; elapsedTime: %d ms}", Long.valueOf(SystemClock.uptimeMillis()), str, "NetworkFetchProducer", "intermediate_result", Long.valueOf(ku6.j(SystemClock.uptimeMillis(), l)));
        }
    }

    @Override // defpackage.hme
    public final synchronized void k(String str) {
        if (pj6.a.h(2)) {
            Long l = (Long) this.b.remove(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            pj6.g("time %d: onRequestCancellation: {requestId: %s, elapsedTime: %d ms}", Long.valueOf(jUptimeMillis), str, Long.valueOf(ku6.j(jUptimeMillis, l)));
        }
    }
}
