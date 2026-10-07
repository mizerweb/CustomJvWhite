package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cre extends mdh implements cf7 {
    public int e;
    public final /* synthetic */ hre f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cre(hre hreVar, long j, lq4 lq4Var) {
        super(1, lq4Var);
        this.f = hreVar;
        this.g = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new cre(this.f, this.g, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((cre) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1 A[RETURN] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objI;
        Object objI2;
        int i = this.e;
        long j = this.g;
        hre hreVar = this.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i == 0) {
            ch3.d0(obj);
            wna wnaVar = (wna) hreVar.c.getValue();
            this.e = 1;
            Object objI3 = ch3.I(this, ((toa) wnaVar).a, false, true, new aa2(j, 12));
            if (objI3 != hu4Var) {
                objI3 = sbiVar;
            }
            if (objI3 != hu4Var) {
            }
            return hu4Var;
        }
        if (i == 1) {
            ch3.d0(obj);
        } else {
            if (i == 2) {
                ch3.d0(obj);
                gh3 gh3VarE = hreVar.e();
                this.e = 3;
                objI = ch3.I(this, ((ph3) gh3VarE).a, false, true, new aa2(j, 2));
                if (objI != hu4Var) {
                    objI = sbiVar;
                }
                if (objI != hu4Var) {
                }
                return hu4Var;
            }
            if (i != 3) {
                if (i == 4) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        p0f p0fVarG = hreVar.g();
        this.e = 4;
        objI2 = ch3.I(this, p0fVarG.a, false, true, new aa2(j, 17));
        if (objI2 != hu4Var) {
            objI2 = sbiVar;
        }
        if (objI2 != hu4Var) {
            return hu4Var;
        }
        return sbiVar;
        gh3 gh3VarE2 = hreVar.e();
        this.e = 2;
        Object objI4 = ch3.I(this, ((ph3) gh3VarE2).a, false, true, new aa2(j, 1));
        if (objI4 != hu4Var) {
            objI4 = sbiVar;
        }
        if (objI4 != hu4Var) {
            gh3 gh3VarE3 = hreVar.e();
            this.e = 3;
            objI = ch3.I(this, ((ph3) gh3VarE3).a, false, true, new aa2(j, 2));
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            if (objI != hu4Var) {
                p0f p0fVarG2 = hreVar.g();
                this.e = 4;
                objI2 = ch3.I(this, p0fVarG2.a, false, true, new aa2(j, 17));
                if (objI2 != hu4Var) {
                    objI2 = sbiVar;
                }
                if (objI2 != hu4Var) {
                    return sbiVar;
                }
            }
        }
        return hu4Var;
    }
}
