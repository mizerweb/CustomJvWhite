package defpackage;

import java.util.Arrays;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class qmd extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ rmd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qmd(rmd rmdVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = rmdVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        rmd rmdVar = this.h;
        switch (i) {
            case 0:
                qmd qmdVar = new qmd(rmdVar, lq4Var, 0);
                qmdVar.g = obj;
                return qmdVar;
            default:
                qmd qmdVar2 = new qmd(rmdVar, lq4Var, 1);
                qmdVar2.g = obj;
                return qmdVar2;
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
        return ((qmd) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object poeVar;
        Object poeVar2;
        tnh tnhVar;
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                hu4 hu4Var = hu4.a;
                int i2 = this.f;
                try {
                    if (i2 == 0) {
                        ch3.d0(obj);
                        a8j.x(this.h.i, new l7i(true));
                        pvb pvbVar = (pvb) this.h.e.getValue();
                        h3b h3bVar = new h3b();
                        this.g = null;
                        this.f = 1;
                        obj = pvbVar.D(h3bVar, this);
                        if (obj == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        if (i2 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    poeVar = (cje) obj;
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Throwable thA = roe.a(poeVar);
                rmd rmdVar = this.h;
                if (thA != null) {
                    String str = rmdVar.c;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4c.f(a4cVar, je9.g, str, "Can't get info about profile deletion", null, null, 8);
                    }
                    a8j.x(this.h.i, new k7i(0, 6, vzl.b(thA)));
                } else {
                    a8j.x(rmdVar.i, new l7i(false));
                    ch3.d0(poeVar);
                    int iA = tca.a(((cje) poeVar).c, (et3) this.h.d.getValue());
                    mjg mjgVar = this.h.g;
                    pmd pmdVar = new pmd(new rnh(R.plurals.oneme_settings_twofa_delete_user_days_left_description, iA, a.n1(Arrays.copyOf(new Object[]{new Integer(iA)}, 1))));
                    mjgVar.getClass();
                    mjgVar.j(null, pmdVar);
                }
                return sbiVar;
            default:
                hu4 hu4Var2 = hu4.a;
                int i3 = this.f;
                try {
                    if (i3 == 0) {
                        ch3.d0(obj);
                        pvb pvbVar2 = (pvb) this.h.e.getValue();
                        h3b h3bVar2 = new h3b(false, 0);
                        this.g = null;
                        this.f = 1;
                        obj = pvbVar2.D(h3bVar2, this);
                        if (obj == hu4Var2) {
                            return hu4Var2;
                        }
                    } else {
                        if (i3 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    poeVar2 = (bje) obj;
                    break;
                } catch (Throwable th2) {
                    poeVar2 = new poe(th2);
                }
                Throwable thA2 = roe.a(poeVar2);
                if (thA2 != null) {
                    String str2 = this.h.c;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        a4c.f(a4cVar2, je9.g, str2, "Can't cancel profile deletion", null, null, 8);
                    }
                    a8j.x(this.h.i, new k7i(0, 6, vzl.b(thA2)));
                } else {
                    ch3.d0(poeVar2);
                    long j = ((bje) poeVar2).c;
                    ic6 ic6Var = this.h.i;
                    if (j == 0) {
                        a8j.x(ic6Var, new k7i(R.drawable.icon_check_round_fill, 4, new tnh(R.string.oneme_settings_twofa_delete_user_undo_delete_success)));
                        a8j.x(this.h.j, rt3.b);
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
        }
    }
}
