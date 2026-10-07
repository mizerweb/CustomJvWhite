package defpackage;

import one.me.sdk.exception.ProtocolException;
import ru.ok.tamtam.errors.ProtoStateException;

/* JADX INFO: loaded from: classes3.dex */
public final class eg9 {
    public final rg9 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public eg9(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, rg9 rg9Var) {
        this.a = rg9Var;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
    }

    public final void a(yhh yhhVar, int i) {
        je9 je9Var = je9.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "eg9", "onLoginFail_" + i + ": " + yhhVar, null);
        }
        if ("login.blocked".equals(yhhVar.b) || "login.flood".equals(yhhVar.b) || "login.token".equals(yhhVar.b)) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "eg9", "onLoginFail_" + i + ": very bad login " + yhhVar, null);
            }
            rg9 rg9Var = this.a;
            mg9 mg9Var = mg9.LOGIN_BACK_BLOCKED;
            rg9 rg9Var2 = rg9.i;
            rg9Var.D(mg9Var, null);
            xb9 xb9Var = (xb9) ((et3) this.b.getValue());
            xb9Var.r0.B(xb9Var, xb9.g1[6], yhhVar.b);
            ((svb) this.c.getValue()).d(true);
            return;
        }
        if ("session.sequence".equals(yhhVar.b)) {
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, "eg9", "onLoginFail_" + i + ": skip " + yhhVar, null);
                return;
            }
            return;
        }
        if ("session.state".equals(yhhVar.b)) {
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, "eg9", "onLoginFail_" + i + ": skip " + yhhVar, null);
                return;
            }
            return;
        }
        if (yhhVar instanceof thh) {
            return;
        }
        if ("proto.state".equals(yhhVar.b)) {
            ProtocolException protocolException = new ProtocolException(new ProtoStateException(yhhVar));
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                a4cVar5.c(je9Var, "eg9", "onLoginFail_" + i + ": " + yhhVar, protocolException);
            }
        }
        this.a.D(mg9.LOGIN_RESTART, yhhVar.b);
        ((mih) this.d.getValue()).h();
    }
}
