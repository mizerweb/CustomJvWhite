package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gxe implements stb, bub {
    public final /* synthetic */ int a;
    public final /* synthetic */ lxe b;

    public /* synthetic */ gxe(lxe lxeVar, int i) {
        this.a = i;
        this.b = lxeVar;
    }

    @Override // defpackage.bub
    public void a(Object obj) {
        int i = this.a;
        lxe lxeVar = this.b;
        switch (i) {
            case 2:
                lxeVar.g.set((String) obj);
                gm0.n(lxeVar.f, "push token available!");
                break;
            default:
                go6 go6Var = (go6) obj;
                lxeVar.i.set(go6Var);
                String str = lxeVar.k;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "push available " + go6Var, null);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.stb
    public void onFailure(Throwable th) {
        int i = this.a;
        lxe lxeVar = this.b;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) ((e5d) lxeVar.b.getValue()).p().i()).booleanValue();
                String str = lxeVar.f;
                if (zBooleanValue) {
                    gm0.V(str, "fail in RuStorePushClient.getToken()", new mxe(th, "fail in RuStorePushClient.getToken()"));
                    break;
                } else {
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "fail in RuStorePushClient.getToken()", th);
                        }
                        break;
                    }
                }
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) ((e5d) lxeVar.b.getValue()).p().i()).booleanValue();
                String str2 = lxeVar.f;
                if (zBooleanValue2) {
                    gm0.V(str2, "fail in checkPushAvailabilityTask", new mxe(th, "fail in checkPushAvailabilityTask"));
                    break;
                } else {
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.f;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str2, "fail in checkPushAvailabilityTask", th);
                        }
                        break;
                    }
                }
                break;
        }
    }
}
