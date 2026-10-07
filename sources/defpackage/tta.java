package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tta implements rta {
    public final long a;
    public final long b;
    public final /* synthetic */ hua c;

    public tta(hua huaVar, long j, long j2) {
        this.c = huaVar;
        this.a = j;
        this.b = j2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // defpackage.rta
    public final Object a(lq4 lq4Var) {
        sta staVar;
        int iB;
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.d;
        if (lq4Var instanceof sta) {
            staVar = (sta) lq4Var;
            int i = staVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                staVar.f = i - Integer.MIN_VALUE;
            } else {
                staVar = new sta(this, lq4Var);
            }
        } else {
            staVar = new sta(this, lq4Var);
        }
        Object obj = staVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = staVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            long j = this.b;
            String str = this.c.e;
            if (j != -1) {
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    long j2 = this.b;
                    long j3 = this.a;
                    StringBuilder sbS = qt4.s(j2, "Process cancel intent. Remove posted msg:", ", chatId:");
                    sbS.append(j3);
                    a4cVar.c(je9Var, str, sbS.toString(), null);
                }
                k8b k8bVar = (k8b) this.c.q.get(new Long(this.a));
                if (k8bVar != null && (iB = k8bVar.b(this.b)) >= 0) {
                    k8bVar.e--;
                    long[] jArr = k8bVar.a;
                    int i3 = k8bVar.d;
                    int i4 = iB >> 3;
                    int i5 = (iB & 7) << 3;
                    long j4 = ((~(255 << i5)) & jArr[i4]) | (254 << i5);
                    jArr[i4] = j4;
                    jArr[(((iB - 7) & i3) + (i3 & 7)) >> 3] = j4;
                }
            } else {
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str, zo5.j(this.a, "Process cancel intent. Remove all posted messages, chatId:"), null);
                }
                this.c.q.remove(new Long(this.a));
            }
            k8b k8bVar2 = (k8b) this.c.q.get(new Long(this.a));
            if (k8bVar2 != null && k8bVar2.e != 0) {
                return sbiVar;
            }
            String str2 = this.c.e;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str2, zo5.j(this.a, "Process cancel intent. Don't have postedMessages after remove, try clear notifs for chat, chatId:"), null);
            }
            t83 t83VarL = this.c.l();
            long j5 = this.a;
            staVar.f = 1;
            if (t83VarL.c(j5, staVar) != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        hua huaVar = this.c;
        staVar.f = 2;
        return huaVar.u(staVar) == hu4Var ? hu4Var : sbiVar;
    }
}
