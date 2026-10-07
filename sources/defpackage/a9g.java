package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a9g extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ m9g h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9g(m9g m9gVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = m9gVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        m9g m9gVar = this.h;
        switch (i) {
            case 0:
                a9g a9gVar = new a9g(m9gVar, lq4Var, 0);
                a9gVar.g = obj;
                return a9gVar;
            default:
                a9g a9gVar2 = new a9g(m9gVar, lq4Var, 1);
                a9gVar2.g = obj;
                return a9gVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((a9g) create((z8g) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((a9g) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF;
        int i = this.e;
        int i2 = 2;
        hu4 hu4Var = hu4.a;
        m9g m9gVar = this.h;
        sbi sbiVar = sbi.a;
        int i3 = 1;
        lq4 lq4Var = null;
        switch (i) {
            case 0:
                int i4 = this.f;
                if (i4 != 0) {
                    if (i4 == 1 || i4 == 2) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                z8g z8gVar = (z8g) this.g;
                if (z8gVar instanceof x8g) {
                    x8g x8gVar = (x8g) z8gVar;
                    this.f = 1;
                    fjg fjgVar = (fjg) m9gVar.f.getValue();
                    if (fjgVar instanceof e25) {
                        objF = sbiVar;
                    } else if (!(fjgVar instanceof g8e)) {
                        if (cqk.d(fjgVar, uai.a)) {
                            objF = m9gVar.f(this);
                            if (objF != hu4Var) {
                            }
                        } else if (fjgVar instanceof ru6) {
                            ore.k("Can't read in final state.");
                            return null;
                        }
                        objF = sbiVar;
                    } else if (fjgVar != x8gVar.a || (objF = m9gVar.f(this)) != hu4Var) {
                        objF = sbiVar;
                    }
                    if (objF == hu4Var) {
                        return hu4Var;
                    }
                } else if (z8gVar instanceof y8g) {
                    this.f = 2;
                    if (m9g.b(m9gVar, (y8g) z8gVar, this) == hu4Var) {
                        return hu4Var;
                    }
                }
                return sbiVar;
            default:
                mjg mjgVar = m9gVar.f;
                int i5 = this.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                yx6 yx6Var = (yx6) this.g;
                fjg fjgVar2 = (fjg) mjgVar.getValue();
                if (!(fjgVar2 instanceof e25)) {
                    m9gVar.h.D(new x8g(fjgVar2));
                }
                j8g j8gVar = new j8g(fjgVar2, lq4Var, i2);
                this.f = 1;
                e9i.M(yx6Var);
                mjgVar.collect(new so5(new sfe(), new jde(yx6Var, 15), j8gVar, i3), this);
                return hu4Var;
        }
    }
}
