package defpackage;

import one.me.webapp.settings.WebAppSettingsScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class xoj extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ WebAppSettingsScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xoj(lq4 lq4Var, WebAppSettingsScreen webAppSettingsScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = webAppSettingsScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        WebAppSettingsScreen webAppSettingsScreen = this.g;
        switch (i) {
            case 0:
                xoj xojVar = new xoj(lq4Var, webAppSettingsScreen, 0);
                xojVar.f = obj;
                return xojVar;
            case 1:
                xoj xojVar2 = new xoj(lq4Var, webAppSettingsScreen, 1);
                xojVar2.f = obj;
                return xojVar2;
            default:
                xoj xojVar3 = new xoj(lq4Var, webAppSettingsScreen, 2);
                xojVar3.f = obj;
                return xojVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((xoj) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((xoj) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((xoj) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        WebAppSettingsScreen webAppSettingsScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                bpj bpjVar = (bpj) obj2;
                webAppSettingsScreen.i.H(bpjVar.b);
                ((rcc) webAppSettingsScreen.g.m(webAppSettingsScreen, WebAppSettingsScreen.j[2])).setTitle(bpjVar.a);
                return sbiVar;
            case 1:
                ch3.d0(obj);
                zoj zojVar = (zoj) obj2;
                if (zojVar == null) {
                    zv8[] zv8VarArr = WebAppSettingsScreen.j;
                    ore.o();
                    return null;
                }
                yfj yfjVar = webAppSettingsScreen.h;
                if (yfjVar == null) {
                    return sbiVar;
                }
                yfjVar.h(zojVar.b, zojVar.a, null);
                return sbiVar;
            default:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                zv8[] zv8VarArr2 = WebAppSettingsScreen.j;
                if (rbbVar instanceof rt3) {
                    webAppSettingsScreen.getRouter().D();
                } else if (rbbVar instanceof i65) {
                    qkj.b.e((i65) rbbVar);
                } else if (rbbVar instanceof apj) {
                    webAppSettingsScreen.getRouter().D();
                    qkj.b.e(((apj) rbbVar).b);
                }
                return sbiVar;
        }
    }
}
