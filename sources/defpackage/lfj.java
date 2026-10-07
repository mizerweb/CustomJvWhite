package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lfj extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ sfj h;
    public final /* synthetic */ ifj i;
    public final /* synthetic */ sdj j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfj(sfj sfjVar, sdj sdjVar, ifj ifjVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = sfjVar;
        this.j = sdjVar;
        this.i = ifjVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        sdj sdjVar = this.j;
        ifj ifjVar = this.i;
        sfj sfjVar = this.h;
        switch (i) {
            case 0:
                lfj lfjVar = new lfj(sfjVar, sdjVar, ifjVar, lq4Var);
                lfjVar.g = obj;
                return lfjVar;
            default:
                lfj lfjVar2 = new lfj(sfjVar, ifjVar, sdjVar, lq4Var);
                lfjVar2.g = obj;
                return lfjVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((lfj) create((String) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((lfj) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        sdj sdjVar = this.j;
        hu4 hu4Var = hu4.a;
        sfj sfjVar = this.h;
        switch (i) {
            case 0:
                String str = (String) this.g;
                int i2 = this.f;
                ifj ifjVar = this.i;
                if (i2 == 0) {
                    ch3.d0(obj);
                    qs8 qs8Var = sfjVar.a;
                    String str2 = sdjVar.b;
                    m8h m8hVar = n8h.Companion;
                    vdj vdjVar = new vdj(str2, str);
                    qs8Var.getClass();
                    String strB = qs8Var.b(vdj.Companion.serializer(), vdjVar);
                    p41 p41Var = sfjVar.h;
                    fs8 fs8Var = new fs8(ifjVar.a, strB, false);
                    this.g = null;
                    this.f = 1;
                    if (p41Var.a(this, fs8Var) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                sfj.f(sfjVar, ifjVar.a);
                return sbiVar;
            default:
                Throwable th = (Throwable) this.g;
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                ms8 ms8VarG = sfj.g(th);
                l44 l44VarH = sfjVar.h();
                p41 p41Var2 = sfjVar.h;
                String str3 = sdjVar.b;
                this.g = null;
                this.f = 1;
                return l44VarH.a(p41Var2, ms8VarG, this.i, str3, this) == hu4Var ? hu4Var : sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfj(sfj sfjVar, ifj ifjVar, sdj sdjVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = sfjVar;
        this.i = ifjVar;
        this.j = sdjVar;
    }
}
