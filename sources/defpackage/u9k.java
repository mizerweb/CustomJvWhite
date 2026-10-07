package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.core.domain.usecase.CheckHostsAvailabilityUseCase;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class u9k implements h4k {
    public final gu4 a;
    public final CheckHostsAvailabilityUseCase b;
    public final Logger c;

    public u9k(dq4 dq4Var, CheckHostsAvailabilityUseCase checkHostsAvailabilityUseCase, Logger logger) {
        this.a = dq4Var;
        this.b = checkHostsAvailabilityUseCase;
        this.c = logger.createLogger(this);
    }

    @Override // defpackage.h4k
    public final ljh a() throws IllegalAccessException, InvocationTargetException {
        Logger.DefaultImpls.info$default(this.c, "Check push availability", null, 2, null);
        gu4 gu4Var = this.a;
        f6g f6gVar = new f6g(gu4Var, 1, this);
        ljh ljhVar = new ljh();
        f6gVar.invoke(new fjh(ljhVar));
        xt4 xt4Var = (xt4) gu4Var.k().x0(xt4.b);
        Executor executorB = xt4Var != null ? ch3.b(xt4Var) : null;
        if (executorB == null) {
            ljhVar.a(new n3j(gu4Var), null);
            return ljhVar;
        }
        ljhVar.a(new o3j(gu4Var), executorB);
        return ljhVar;
    }
}
