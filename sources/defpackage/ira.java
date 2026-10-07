package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ira extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ jsa f;
    public final /* synthetic */ c39 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ira(jsa jsaVar, c39 c39Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = jsaVar;
        this.g = c39Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        c39 c39Var = this.g;
        jsa jsaVar = this.f;
        switch (i) {
            case 0:
                return new ira(jsaVar, c39Var, lq4Var, 0);
            default:
                return new ira(jsaVar, c39Var, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((ira) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((ira) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        final c39 c39Var = this.g;
        final jsa jsaVar = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                final int i2 = 0;
                jsaVar.e.k(c39Var.a, true, false, false, new af7() { // from class: hra
                    @Override // defpackage.af7
                    public final Object invoke() {
                        ic6 ic6Var;
                        String strConcat;
                        int i3 = i2;
                        sbi sbiVar2 = sbi.a;
                        c39 c39Var2 = c39Var;
                        jsa jsaVar2 = jsaVar;
                        switch (i3) {
                            case 0:
                                ic6Var = jsaVar2.G2;
                                wpa wpaVar = wpa.b;
                                String str = c39Var2.a;
                                wpaVar.getClass();
                                strConcat = ":call-join-preview?link=".concat(str);
                                break;
                            default:
                                ic6Var = jsaVar2.G2;
                                wpa wpaVar2 = wpa.b;
                                String str2 = c39Var2.a;
                                wpaVar2.getClass();
                                strConcat = ":call-join-preview?link=".concat(str2);
                                break;
                        }
                        bc1.q(strConcat, ic6Var);
                        return sbiVar2;
                    }
                });
                break;
            default:
                ch3.d0(obj);
                final int i3 = 1;
                jsaVar.e.k(c39Var.a, true, false, false, new af7() { // from class: hra
                    @Override // defpackage.af7
                    public final Object invoke() {
                        ic6 ic6Var;
                        String strConcat;
                        int i4 = i3;
                        sbi sbiVar2 = sbi.a;
                        c39 c39Var2 = c39Var;
                        jsa jsaVar2 = jsaVar;
                        switch (i4) {
                            case 0:
                                ic6Var = jsaVar2.G2;
                                wpa wpaVar = wpa.b;
                                String str = c39Var2.a;
                                wpaVar.getClass();
                                strConcat = ":call-join-preview?link=".concat(str);
                                break;
                            default:
                                ic6Var = jsaVar2.G2;
                                wpa wpaVar2 = wpa.b;
                                String str2 = c39Var2.a;
                                wpaVar2.getClass();
                                strConcat = ":call-join-preview?link=".concat(str2);
                                break;
                        }
                        bc1.q(strConcat, ic6Var);
                        return sbiVar2;
                    }
                });
                break;
        }
        return sbiVar;
    }
}
