package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.common.component.TopicComponent;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class phk implements TopicComponent {
    public final gu4 a;
    public final rai b;
    public final n6k c;
    public final Logger d;

    public phk(dq4 dq4Var, rai raiVar, n6k n6kVar, Logger logger) {
        this.a = dq4Var;
        this.b = raiVar;
        this.c = n6kVar;
        this.d = logger.createLogger("TopicComponent");
    }

    @Override // com.vk.push.common.component.TopicComponent
    public final ljh subscribeToTopic(String str) {
        Logger.DefaultImpls.info$default(this.d, "Subscribe To Topic ".concat(str), null, 2, null);
        gu4 gu4Var = this.a;
        ghk ghkVar = new ghk(gu4Var, this, str, 0);
        ljh ljhVar = new ljh();
        ghkVar.invoke(new fjh(ljhVar));
        xt4 xt4Var = (xt4) gu4Var.k().x0(xt4.b);
        Executor executorB = xt4Var != null ? ch3.b(xt4Var) : null;
        if (executorB == null) {
            ljhVar.a(new n6k(gu4Var), null);
            return ljhVar;
        }
        ljhVar.a(new oki(gu4Var), executorB);
        return ljhVar;
    }

    @Override // com.vk.push.common.component.TopicComponent
    public final ljh unsubscribeFromTopic(String str) {
        Logger.DefaultImpls.info$default(this.d, "Unsubscribe From Topic ".concat(str), null, 2, null);
        gu4 gu4Var = this.a;
        ghk ghkVar = new ghk(gu4Var, this, str, 1);
        ljh ljhVar = new ljh();
        ghkVar.invoke(new fjh(ljhVar));
        xt4 xt4Var = (xt4) gu4Var.k().x0(xt4.b);
        Executor executorB = xt4Var != null ? ch3.b(xt4Var) : null;
        if (executorB == null) {
            ljhVar.a(new yki(gu4Var), null);
            return ljhVar;
        }
        ljhVar.a(new zfh(gu4Var), executorB);
        return ljhVar;
    }
}
