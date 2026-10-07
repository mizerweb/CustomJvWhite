package defpackage;

import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class zp5 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ DownloadAttachesWorker g;
    public final /* synthetic */ e70 h;
    public final /* synthetic */ e70 i;
    public final /* synthetic */ sfa j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp5(DownloadAttachesWorker downloadAttachesWorker, e70 e70Var, e70 e70Var2, sfa sfaVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = downloadAttachesWorker;
        this.h = e70Var;
        this.i = e70Var2;
        this.j = sfaVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new zp5(this.g, this.h, this.i, this.j, lq4Var, 0);
            case 1:
                return new zp5(this.g, this.h, this.i, this.j, lq4Var, 1);
            case 2:
                return new zp5(this.g, this.h, this.i, this.j, lq4Var, 2);
            default:
                return new zp5(this.g, this.h, this.i, this.j, lq4Var, 3);
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
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((zp5) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                hu4 hu4Var = hu4.a;
                int i = this.f;
                if (i == 0) {
                    ch3.d0(obj);
                    this.g.I++;
                    DownloadAttachesWorker downloadAttachesWorker = this.g;
                    this.f = 1;
                    if (downloadAttachesWorker.n(this) != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                DownloadAttachesWorker downloadAttachesWorker2 = this.g;
                e70 e70Var = this.h;
                if (e70Var == null) {
                    e70Var = this.i;
                }
                sfa sfaVar = this.j;
                this.f = 2;
                Object objO = DownloadAttachesWorker.o(downloadAttachesWorker2, e70Var, sfaVar, this);
                if (objO != hu4Var) {
                    return objO;
                }
                return hu4Var;
            case 1:
                hu4 hu4Var2 = hu4.a;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.g.I++;
                    DownloadAttachesWorker downloadAttachesWorker3 = this.g;
                    this.f = 1;
                    if (downloadAttachesWorker3.n(this) != hu4Var2) {
                    }
                    return hu4Var2;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                DownloadAttachesWorker downloadAttachesWorker4 = this.g;
                e70 e70Var2 = this.h;
                e70 e70Var3 = this.i;
                sfa sfaVar2 = this.j;
                this.f = 2;
                Object objP = DownloadAttachesWorker.p(downloadAttachesWorker4, e70Var2, e70Var3, sfaVar2, this);
                if (objP != hu4Var2) {
                    return objP;
                }
                return hu4Var2;
            case 2:
                hu4 hu4Var3 = hu4.a;
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.g.I++;
                    DownloadAttachesWorker downloadAttachesWorker5 = this.g;
                    this.f = 1;
                    if (downloadAttachesWorker5.n(this) != hu4Var3) {
                    }
                    return hu4Var3;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                DownloadAttachesWorker downloadAttachesWorker6 = this.g;
                e70 e70Var4 = this.h;
                if (e70Var4 == null) {
                    e70Var4 = this.i;
                }
                sfa sfaVar3 = this.j;
                this.f = 2;
                Object objO2 = DownloadAttachesWorker.o(downloadAttachesWorker6, e70Var4, sfaVar3, this);
                if (objO2 != hu4Var3) {
                    return objO2;
                }
                return hu4Var3;
            default:
                hu4 hu4Var4 = hu4.a;
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    this.g.I++;
                    DownloadAttachesWorker downloadAttachesWorker7 = this.g;
                    this.f = 1;
                    if (downloadAttachesWorker7.n(this) != hu4Var4) {
                    }
                    return hu4Var4;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                DownloadAttachesWorker downloadAttachesWorker8 = this.g;
                e70 e70Var5 = this.h;
                e70 e70Var6 = this.i;
                sfa sfaVar4 = this.j;
                this.f = 2;
                Object objP2 = DownloadAttachesWorker.p(downloadAttachesWorker8, e70Var5, e70Var6, sfaVar4, this);
                if (objP2 != hu4Var4) {
                    return objP2;
                }
                return hu4Var4;
        }
    }
}
