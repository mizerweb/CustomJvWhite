package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.IPCInteractor;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.push.OnDeleteMessagesResult;

/* JADX INFO: loaded from: classes3.dex */
public final class kdk implements IPCInteractor {
    public final euc a;
    public final l4k b;
    public final y3k c;
    public final g7k d;
    public final CrashReporterRepository e;
    public final AnalyticsSender f;
    public final Logger g;
    public final dq4 h = cqk.a(ao5.b);

    public kdk(euc eucVar, l4k l4kVar, y3k y3kVar, g7k g7kVar, CrashReporterRepository crashReporterRepository, AnalyticsSender analyticsSender, Logger logger) {
        this.a = eucVar;
        this.b = l4kVar;
        this.c = y3kVar;
        this.d = g7kVar;
        this.e = crashReporterRepository;
        this.f = analyticsSender;
        this.g = logger.createLogger("ClientServiceInteractor");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Enum a(kdk kdkVar, nq4 nq4Var) {
        y9k y9kVar;
        if (nq4Var instanceof y9k) {
            y9kVar = (y9k) nq4Var;
            int i = y9kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                y9kVar.f = i - Integer.MIN_VALUE;
            } else {
                y9kVar = new y9k(kdkVar, nq4Var);
            }
        } else {
            y9kVar = new y9k(kdkVar, nq4Var);
        }
        Object obj = y9kVar.d;
        int i2 = y9kVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            l4k l4kVar = kdkVar.b;
            y9kVar.f = 1;
            Object objE = l4kVar.e(y9kVar);
            hu4 hu4Var = hu4.a;
            if (objE == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return OnDeleteMessagesResult.OK;
    }

    @Override // com.vk.push.core.IPCInteractor
    public final void onDestroy() {
        Logger.DefaultImpls.info$default(this.g, "Destroying", null, 2, null);
        cqk.g(this.h);
    }
}
