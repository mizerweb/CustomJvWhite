package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nhj extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public String f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ shj i;
    public final /* synthetic */ phj j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nhj(shj shjVar, phj phjVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = shjVar;
        this.j = phjVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        phj phjVar = this.j;
        shj shjVar = this.i;
        switch (i) {
            case 0:
                nhj nhjVar = new nhj(shjVar, phjVar, lq4Var, 0);
                nhjVar.h = obj;
                return nhjVar;
            default:
                nhj nhjVar2 = new nhj(shjVar, phjVar, lq4Var, 1);
                nhjVar2.h = obj;
                return nhjVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        chj chjVar = (chj) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((nhj) create(chjVar, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        shj shjVar = this.i;
        String str = "WebAppDownloadFile";
        hu4 hu4Var = hu4.a;
        phj phjVar = this.j;
        switch (i) {
            case 0:
                chj chjVar = (chj) this.h;
                int i2 = this.g;
                if (i2 == 0) {
                    ch3.d0(obj);
                    if (mhj.$EnumSwitchMapping$0[chjVar.ordinal()] != 1) {
                        return sbiVar;
                    }
                    gm0.n("DownloadFromWebApp", "processDownloadFile complete");
                    vhj vhjVar = new vhj(shjVar.a, chjVar.a);
                    p41 p41Var = phjVar.e;
                    qs8 qs8Var = phjVar.a;
                    qs8Var.getClass();
                    fs8 fs8Var = new fs8("WebAppDownloadFile", qs8Var.b(vhj.Companion.serializer(), vhjVar), false);
                    this.h = null;
                    this.f = "WebAppDownloadFile";
                    this.g = 1;
                    if (p41Var.a(this, fs8Var) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = this.f;
                    ch3.d0(obj);
                }
                String str2 = str;
                jdj jdjVar = phjVar.f;
                if (jdjVar == null) {
                    return sbiVar;
                }
                fgj.a((fgj) phjVar.b.getValue(), str2, jdjVar.a, jdjVar.b, true, 0, null, null, 240);
                return sbiVar;
            default:
                chj chjVar2 = (chj) this.h;
                int i3 = this.g;
                if (i3 == 0) {
                    ch3.d0(obj);
                    vhj vhjVar2 = new vhj(shjVar.a, chjVar2.a);
                    p41 p41Var2 = phjVar.e;
                    qs8 qs8Var2 = phjVar.a;
                    qs8Var2.getClass();
                    fs8 fs8Var2 = new fs8("WebAppDownloadFile", qs8Var2.b(vhj.Companion.serializer(), vhjVar2), false);
                    this.h = null;
                    this.f = "WebAppDownloadFile";
                    this.g = 1;
                    if (p41Var2.a(this, fs8Var2) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = this.f;
                    ch3.d0(obj);
                }
                String str3 = str;
                jdj jdjVar2 = phjVar.f;
                if (jdjVar2 == null) {
                    return sbiVar;
                }
                fgj.a((fgj) phjVar.b.getValue(), str3, jdjVar2.a, jdjVar2.b, true, 0, null, null, 240);
                return sbiVar;
        }
    }
}
