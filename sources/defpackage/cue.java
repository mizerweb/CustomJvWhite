package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class cue {
    public final String a = cue.class.getName();
    public final dq4 b;

    public cue(xhh xhhVar, yt4 yt4Var) {
        xt4 xt4VarR0 = ((n0c) xhhVar).b().R0(2, "cloud-pushes");
        xt4VarR0.getClass();
        this.b = cqk.a(lvb.x0(xt4VarR0, yt4Var));
    }

    public final void a() {
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.c;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onDeletedMessages()", null);
            }
        }
        r7 r7Var = r7.a;
        Iterator it = r7.c().entrySet().iterator();
        while (it.hasNext()) {
            kzd kzdVarE = new wtc(((y6) ((Map.Entry) it.next()).getValue()).a).e();
            String str2 = kzdVarE.j;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.d;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, "onDeletedMessages", null);
                }
            }
            kzdVarE.c().a().f(false, true);
            ((ae9) kzdVarE.b.getValue()).g("FCM_ON_DELETED_MESSAGES", s66.a);
        }
    }
}
