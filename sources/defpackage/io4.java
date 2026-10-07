package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class io4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public long f;
    public int g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ io4(Object obj, long j, long j2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.k = obj;
        this.h = j;
        this.i = j2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                return new io4((no4) obj2, this.h, this.i, lq4Var, 0);
            default:
                return new io4((vvg) obj2, this.h, this.i, lq4Var, 1);
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
        }
        return ((io4) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x0069, please report this as an issue */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        no4 no4Var;
        long j;
        String str;
        a4c a4cVar;
        je9 je9Var;
        Object obj2;
        vvg vvgVar;
        long j2;
        String str2;
        a4c a4cVar2;
        je9 je9Var2;
        switch (this.e) {
            case 0:
                hu4 hu4Var = hu4.a;
                int i = this.g;
                try {
                    if (i != 0) {
                        if (i != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = this.f;
                        no4Var = (no4) this.j;
                        try {
                            ch3.d0(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            str = no4Var.g;
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, zo5.j(j, "changeLastShowingUnknownContactBar fail for #"), th);
                                }
                            }
                        }
                        break;
                    } else {
                        ch3.d0(obj);
                        no4 no4Var2 = (no4) this.k;
                        long j3 = this.h;
                        try {
                            ho4 ho4Var = new ho4(this.i);
                            this.j = no4Var2;
                            this.f = j3;
                            this.g = 1;
                            if (no4Var2.b(j3, ho4Var, this) == hu4Var) {
                                return hu4Var;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            no4Var = no4Var2;
                            j = j3;
                            str = no4Var.g;
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, zo5.j(j, "changeLastShowingUnknownContactBar fail for #"), th);
                                }
                            }
                        }
                        break;
                    }
                    return sbi.a;
                } catch (CancellationException e) {
                    throw e;
                }
            default:
                hu4 hu4Var2 = hu4.a;
                int i2 = this.g;
                try {
                    if (i2 != 0) {
                        if (i2 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2 = this.f;
                        vvgVar = (vvg) this.j;
                        try {
                            ch3.d0(obj);
                        } catch (Throwable th4) {
                            obj2 = th4;
                            str2 = vvgVar.g;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                je9Var2 = je9.f;
                                if (a4cVar2.b(je9Var2)) {
                                    a4cVar2.c(je9Var2, str2, "reactToStoryWithSticker story=" + j2 + " failed with " + obj2, null);
                                }
                            }
                        }
                        break;
                    } else {
                        ch3.d0(obj);
                        vvg vvgVar2 = (vvg) this.k;
                        long j4 = this.h;
                        long j5 = this.i;
                        try {
                            aj5 aj5Var = (aj5) vvgVar2.i.getValue();
                            azg azgVar = vvgVar2.d;
                            j1h j1hVar = new j1h(j5);
                            this.j = vvgVar2;
                            this.f = j4;
                            this.g = 1;
                            if (aj5Var.p(azgVar, j4, j1hVar, this) == hu4Var2) {
                                return hu4Var2;
                            }
                        } catch (Throwable th5) {
                            obj2 = th5;
                            vvgVar = vvgVar2;
                            j2 = j4;
                            str2 = vvgVar.g;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                je9Var2 = je9.f;
                                if (a4cVar2.b(je9Var2)) {
                                    a4cVar2.c(je9Var2, str2, "reactToStoryWithSticker story=" + j2 + " failed with " + obj2, null);
                                }
                            }
                        }
                        break;
                    }
                    return sbi.a;
                } catch (CancellationException e2) {
                    throw e2;
                }
        }
    }
}
