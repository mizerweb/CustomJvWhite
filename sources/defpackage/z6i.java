package defpackage;

import java.util.concurrent.CancellationException;
import ru.ok.tamtam.errors.TamErrorException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class z6i extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public pk8 f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ b7i i;
    public final /* synthetic */ CharSequence j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6i(b7i b7iVar, CharSequence charSequence, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = b7iVar;
        this.j = charSequence;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        CharSequence charSequence = this.j;
        b7i b7iVar = this.i;
        switch (i) {
            case 0:
                z6i z6iVar = new z6i(b7iVar, charSequence, lq4Var, 0);
                z6iVar.h = obj;
                return z6iVar;
            default:
                z6i z6iVar2 = new z6i(b7iVar, charSequence, lq4Var, 1);
                z6iVar2.h = obj;
                return z6iVar2;
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
        return ((z6i) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        pk8 pk8Var;
        Object objD;
        pk8 pk8Var2;
        Throwable th;
        Object poeVar;
        tnh tnhVar;
        ok8 ok8Var;
        pk8 pk8Var3;
        Object objD2;
        Object poeVar2;
        tnh tnhVar2;
        switch (this.e) {
            case 0:
                sbi sbiVar = sbi.a;
                hu4 hu4Var = hu4.a;
                int i = this.g;
                if (i == 0) {
                    ch3.d0(obj);
                    b7i b7iVar = this.i;
                    pk8Var = b7iVar.g;
                    if (pk8Var == null) {
                        String str = b7iVar.h;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            a4c.f(a4cVar, je9.g, str, "Create add email step: Can't finish add because current navData is null", null, null, 8);
                        }
                    } else {
                        a8j.x(b7iVar.u, new l7i(true));
                        b7i b7iVar2 = this.i;
                        CharSequence charSequence = this.j;
                        try {
                            pvb pvbVar = (pvb) b7iVar2.k.getValue();
                            vsb vsbVar = new vsb(b7iVar2.f, charSequence.toString());
                            this.h = null;
                            this.f = pk8Var;
                            this.g = 1;
                            objD = pvbVar.D(vsbVar, this);
                            if (objD == hu4Var) {
                                return hu4Var;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            pk8Var2 = pk8Var;
                            pk8Var = pk8Var2;
                            poeVar = new poe(th);
                        }
                    }
                    return sbiVar;
                }
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pk8Var2 = this.f;
                try {
                    ch3.d0(obj);
                    pk8Var = pk8Var2;
                    objD = obj;
                } catch (Throwable th3) {
                    th = th3;
                    pk8Var = pk8Var2;
                    poeVar = new poe(th);
                }
                poeVar = (oe0) objD;
                CharSequence charSequence2 = this.j;
                b7i b7iVar3 = this.i;
                if (!(poeVar instanceof poe)) {
                    oe0 oe0Var = (oe0) poeVar;
                    ok8 ok8Var2 = pk8Var.c;
                    if (ok8Var2 != null) {
                        ok8Var = new ok8(oe0Var.d, oe0Var.e, charSequence2.toString(), ok8Var2.b);
                    } else {
                        ok8Var = new ok8(oe0Var.d, 2, oe0Var.e, charSequence2.toString(), null);
                    }
                    a8j.x(b7iVar3.v, new r7i(oe0Var.c, pk8.a(pk8Var, null, null, ok8Var, 27)));
                }
                b7i b7iVar4 = this.i;
                Throwable thA = roe.a(poeVar);
                if (thA != null) {
                    mjg mjgVar = b7iVar4.o;
                    ic6 ic6Var = b7iVar4.u;
                    gm0.V(b7iVar4.h, "Add email step: can't add email", thA);
                    if (thA instanceof CancellationException) {
                        throw thA;
                    }
                    if (thA instanceof TamErrorException) {
                        r8i r8iVar = (r8i) mjgVar.getValue();
                        yhh yhhVar = ((TamErrorException) thA).a;
                        if (vzl.d(yhhVar)) {
                            mjgVar.j(null, new r8i(r8iVar.a, r8iVar.b, v8i.a(r8iVar.c, vzl.a(yhhVar))));
                            a8j.x(ic6Var, new l7i(false));
                        } else {
                            a8j.x(ic6Var, new k7i(0, 6, vzl.a(yhhVar)));
                        }
                    } else {
                        Object obj2 = zhh.a;
                        if (obj2.equals(obj2)) {
                            tnhVar = new tnh(R.string.common_error_base_retry);
                        } else if (obj2.equals(aih.a)) {
                            tnhVar = new tnh(R.string.common_network_error);
                        } else {
                            if (!obj2.equals(bih.a)) {
                                ore.o();
                                return null;
                            }
                            tnhVar = new tnh(R.string.common_service_error);
                        }
                        a8j.x(ic6Var, new k7i(0, 6, tnhVar));
                    }
                }
                return sbiVar;
            default:
                sbi sbiVar2 = sbi.a;
                hu4 hu4Var2 = hu4.a;
                int i2 = this.g;
                if (i2 == 0) {
                    ch3.d0(obj);
                    b7i b7iVar5 = this.i;
                    pk8 pk8Var4 = b7iVar5.g;
                    if (pk8Var4 == null) {
                        String str2 = b7iVar5.h;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            a4c.f(a4cVar2, je9.g, str2, "Create hint step: Can't finish creation because current navData is null", null, null, 8);
                        }
                    } else {
                        CharSequence charSequence3 = this.j;
                        if (charSequence3 == null || charSequence3.length() == 0) {
                            int iOrdinal = this.i.c.ordinal();
                            if (iOrdinal == 0) {
                                b7i b7iVar6 = this.i;
                                a8j.x(b7iVar6.v, new o7i(b7iVar6.f, pk8.a(pk8Var4, null, null, null, 29)));
                            } else if (iOrdinal == 1) {
                                this.i.B(null);
                            } else {
                                if (iOrdinal != 2) {
                                    ore.o();
                                    return null;
                                }
                                this.i.C(null);
                            }
                        } else {
                            a8j.x(this.i.u, new l7i(true));
                            b7i b7iVar7 = this.i;
                            CharSequence charSequence4 = this.j;
                            try {
                                pvb pvbVar2 = (pvb) b7iVar7.k.getValue();
                                String str3 = b7iVar7.f;
                                String string = charSequence4.toString();
                                vsb vsbVar2 = new vsb(kfc.z, 17);
                                vsbVar2.h("trackId", str3);
                                vsbVar2.h("hint", string);
                                this.h = null;
                                this.f = pk8Var4;
                                this.g = 1;
                                objD2 = pvbVar2.D(vsbVar2, this);
                                if (objD2 == hu4Var2) {
                                    return hu4Var2;
                                }
                                pk8Var3 = pk8Var4;
                            } catch (Throwable th4) {
                                th = th4;
                                pk8Var3 = pk8Var4;
                                poeVar2 = new poe(th);
                            }
                        }
                    }
                    return sbiVar2;
                }
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pk8Var3 = this.f;
                try {
                    ch3.d0(obj);
                    objD2 = obj;
                } catch (Throwable th5) {
                    th = th5;
                    poeVar2 = new poe(th);
                }
                poeVar2 = (kih) objD2;
                b7i b7iVar8 = this.i;
                CharSequence charSequence5 = this.j;
                if (!(poeVar2 instanceof poe)) {
                    int iOrdinal2 = b7iVar8.c.ordinal();
                    if (iOrdinal2 == 0) {
                        a8j.x(b7iVar8.v, new o7i(b7iVar8.f, pk8.a(pk8Var3, null, charSequence5.toString(), null, 29)));
                    } else if (iOrdinal2 == 1) {
                        b7iVar8.B(pk8.a(pk8Var3, null, charSequence5.toString(), null, 29));
                    } else {
                        if (iOrdinal2 != 2) {
                            ore.o();
                            return null;
                        }
                        b7iVar8.C(pk8.a(pk8Var3, null, charSequence5.toString(), null, 29));
                    }
                }
                b7i b7iVar9 = this.i;
                Throwable thA2 = roe.a(poeVar2);
                if (thA2 != null) {
                    mjg mjgVar2 = b7iVar9.o;
                    ic6 ic6Var2 = b7iVar9.u;
                    gm0.V(b7iVar9.h, "Create hint step: can't create hint", thA2);
                    if (thA2 instanceof CancellationException) {
                        throw thA2;
                    }
                    if (thA2 instanceof TamErrorException) {
                        t8i t8iVar = (t8i) mjgVar2.getValue();
                        yhh yhhVar2 = ((TamErrorException) thA2).a;
                        if (vzl.d(yhhVar2)) {
                            mjgVar2.j(null, new t8i(t8iVar.a, t8iVar.b, v8i.a(t8iVar.c, vzl.a(yhhVar2))));
                            a8j.x(ic6Var2, new l7i(false));
                        } else {
                            a8j.x(ic6Var2, new k7i(0, 6, vzl.a(yhhVar2)));
                        }
                    } else {
                        Object obj3 = zhh.a;
                        if (obj3.equals(obj3)) {
                            tnhVar2 = new tnh(R.string.common_error_base_retry);
                        } else if (obj3.equals(aih.a)) {
                            tnhVar2 = new tnh(R.string.common_network_error);
                        } else {
                            if (!obj3.equals(bih.a)) {
                                ore.o();
                                return null;
                            }
                            tnhVar2 = new tnh(R.string.common_service_error);
                        }
                        a8j.x(ic6Var2, new k7i(0, 6, tnhVar2));
                    }
                }
                return sbiVar2;
        }
    }
}
