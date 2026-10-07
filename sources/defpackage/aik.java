package defpackage;

import com.vk.push.common.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class aik extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ hik g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aik(hik hikVar, String str, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = hikVar;
        this.h = str;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        String str = this.h;
        hik hikVar = this.g;
        switch (i) {
            case 0:
                return new aik(hikVar, str, lq4Var, 0);
            default:
                return new aik(hikVar, str, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        String str = this.h;
        hik hikVar = this.g;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                return new aik(hikVar, str, lq4Var, 0).invokeSuspend(sbiVar);
            default:
                return new aik(hikVar, str, lq4Var, 1).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object poeVar;
        Object poeVar2;
        int i = this.e;
        hu4 hu4Var = hu4.a;
        hik hikVar = this.g;
        String str = this.h;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                    } else {
                        if (i2 != 2) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                        poeVar = ((roe) obj).a;
                    }
                    return new roe(poeVar);
                }
                ch3.d0(obj);
                g7k g7kVar = hikVar.b;
                this.f = 1;
                obj = g7kVar.a(this);
                if (obj == hu4Var) {
                    return hu4Var;
                }
                String str2 = (String) obj;
                Logger logger = hikVar.d;
                if (str2 != null) {
                    Logger.DefaultImpls.info$default(logger, qv1.k("Start subscribe to topic ", str), null, 2, null);
                    kr6 kr6Var = hikVar.a;
                    this.f = 2;
                    poeVar = kr6Var.n(str2, str, this);
                    if (poeVar == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    Logger.DefaultImpls.warn$default(logger, "Unable to subscribe to topic, token is not exists. You need to get Push Token before use subscribeToTopic", null, 2, null);
                    poeVar = new poe(new Exception("Unable to subscribe to topic, token is not exists. You need to get Push Token before use subscribeToTopic"));
                }
                return new roe(poeVar);
            default:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                    } else {
                        if (i3 != 2) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                        poeVar2 = ((roe) obj).a;
                    }
                    return new roe(poeVar2);
                }
                ch3.d0(obj);
                g7k g7kVar2 = hikVar.b;
                this.f = 1;
                obj = g7kVar2.a(this);
                if (obj == hu4Var) {
                    return hu4Var;
                }
                String str3 = (String) obj;
                Logger logger2 = hikVar.d;
                if (str3 != null) {
                    Logger.DefaultImpls.info$default(logger2, qv1.k("Start unsubscribe from topic ", str), null, 2, null);
                    kr6 kr6Var2 = hikVar.a;
                    this.f = 2;
                    poeVar2 = kr6Var2.w(str3, str, this);
                    if (poeVar2 == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    Logger.DefaultImpls.warn$default(logger2, "Unable to unsubscribe from topic, token is not exists. You need to get Push Token before use unsubscribeFromTopic", null, 2, null);
                    poeVar2 = new poe(new Exception("Unable to unsubscribe from topic, token is not exists. You need to get Push Token before use unsubscribeFromTopic"));
                }
                return new roe(poeVar2);
        }
    }
}
