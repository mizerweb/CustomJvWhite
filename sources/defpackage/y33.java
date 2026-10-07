package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class y33 extends mdh implements vf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Throwable f;
    public /* synthetic */ long g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y33(Object obj, lq4 lq4Var, int i) {
        super(4, lq4Var);
        this.e = i;
        this.h = obj;
    }

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Object obj5 = this.h;
        Throwable th = (Throwable) obj2;
        long jLongValue = ((Number) obj3).longValue();
        lq4 lq4Var = (lq4) obj4;
        switch (i) {
            case 0:
                y33 y33Var = new y33((c30) obj5, lq4Var, 0);
                y33Var.f = th;
                y33Var.g = jLongValue;
                return y33Var.invokeSuspend(sbiVar);
            default:
                y33 y33Var2 = new y33((n5j) obj5, lq4Var, 1);
                y33Var2.f = th;
                y33Var2.g = jLongValue;
                return y33Var2.invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        switch (this.e) {
            case 0:
                je9 je9Var = je9.g;
                Throwable th = this.f;
                long j = this.g;
                ch3.d0(obj);
                if ((th instanceof TamErrorException) && p90.C(((TamErrorException) th).a.b) && j <= 2) {
                    String str = ((c30) this.h).b;
                    String strH = x05.h("request failed with ", ". Retrying", th);
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4c.f(a4cVar, je9Var, str, strH, null, null, 8);
                    }
                    z = true;
                } else {
                    String str2 = ((c30) this.h).b;
                    String strH2 = x05.h("request failed with ", ". Couldn't recover", th);
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        a4c.f(a4cVar2, je9Var, str2, strH2, null, null, 8);
                    }
                }
                return Boolean.valueOf(z);
            default:
                je9 je9Var2 = je9.g;
                Throwable th2 = this.f;
                long j2 = this.g;
                ch3.d0(obj);
                if ((th2 instanceof TamErrorException) && p90.C(((TamErrorException) th2).a.b) && j2 <= 2) {
                    String str3 = ((n5j) this.h).f;
                    String strH3 = x05.h("Fetch video. Request failed with ", ". Retrying", th2);
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null) {
                        a4c.f(a4cVar3, je9Var2, str3, strH3, null, null, 8);
                    }
                    z = true;
                } else {
                    String str4 = ((n5j) this.h).f;
                    String strH4 = x05.h("Fetch video. Request failed with ", ". Couldn't recover", th2);
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null) {
                        a4c.f(a4cVar4, je9Var2, str4, strH4, null, null, 8);
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
