package defpackage;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class g4c extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ h4c h;
    public final /* synthetic */ File i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4c(h4c h4cVar, File file, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = h4cVar;
        this.i = file;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        File file = this.i;
        h4c h4cVar = this.h;
        switch (i) {
            case 0:
                g4c g4cVar = new g4c(h4cVar, file, lq4Var, 0);
                g4cVar.g = obj;
                return g4cVar;
            default:
                g4c g4cVar2 = new g4c(h4cVar, file, lq4Var, 1);
                g4cVar2.g = obj;
                return g4cVar2;
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
        return ((g4c) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        lq4 lq4Var = null;
        switch (this.e) {
            case 0:
                gu4 gu4Var = (gu4) this.g;
                hu4 hu4Var = hu4.a;
                int i = this.f;
                if (i == 0) {
                    ch3.d0(obj);
                    hze hzeVar = (hze) this.h.p.getValue();
                    File file = this.i;
                    this.g = gu4Var;
                    this.f = 1;
                    hzeVar.getClass();
                    obj = yab.K0(lvb.x0(zhb.b, hzeVar.b), new d97(file, hzeVar, lq4Var, 26), this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                if (((Uri) obj) == null) {
                    gm0.n(gu4Var.getClass().getName(), "Can't save origianl image to galary");
                }
                return sbi.a;
            default:
                gu4 gu4Var2 = (gu4) this.g;
                hu4 hu4Var2 = hu4.a;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    k0f k0fVar = (k0f) this.h.o.getValue();
                    File file2 = this.i;
                    this.g = gu4Var2;
                    this.f = 1;
                    obj = k0fVar.a(file2, this);
                    if (obj == hu4Var2) {
                        return hu4Var2;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                if (((Uri) obj) == null) {
                    String name = gu4Var2.getClass().getName();
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4c.f(a4cVar, je9.g, name, "Can't save video", null, null, 8);
                    }
                }
                return sbi.a;
        }
    }
}
