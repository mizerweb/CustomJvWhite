package defpackage;

import java.util.List;
import java.util.ListIterator;
import one.me.android.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class gk9 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ MainActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk9(MainActivity mainActivity, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = mainActivity;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        MainActivity mainActivity = this.f;
        switch (i) {
            case 0:
                return new gk9(mainActivity, lq4Var, 0);
            default:
                return new gk9(mainActivity, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((gk9) create((bg9) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((gk9) create(Integer.valueOf(((Number) obj).intValue()), (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                oa8 oa8Var = (oa8) this.f.z.getAccessor().c(330);
                je9 je9Var = je9.d;
                gm0.n(oa8Var.k, "init()");
                if (((svb) oa8Var.d.getValue()).b()) {
                    b5d b5dVar = ((g5d) ((gjf) oa8Var.f.getValue())).a.y0;
                    zv8[] zv8VarArr = e5d.S6;
                    boolean zBooleanValue = ((Boolean) b5dVar.a(zv8VarArr[75]).i()).booleanValue();
                    xb9 xb9Var = (xb9) ((et3) oa8Var.g.getValue());
                    boolean zBooleanValue2 = ((Boolean) xb9Var.y0.m(xb9Var, xb9.g1[15])).booleanValue();
                    ((wxb) oa8Var.e.getValue()).getClass();
                    if (zBooleanValue || ((oqg) oa8Var.h.getValue()).e()) {
                        long jLongValue = ((Number) ((g5d) ((gjf) oa8Var.f.getValue())).a.x0.a(zv8VarArr[74]).i()).longValue();
                        ia8 ia8Var = new ia8(zBooleanValue, s3m.b(oa8Var.a), (et3) oa8Var.g.getValue(), oa8Var.a, oa8Var.b, oa8Var.c);
                        c79 c79VarW = yab.w();
                        int i = 0;
                        for (Object obj2 : fa8.k) {
                            int i2 = i + 1;
                            if (i < 0) {
                                xw3.V0();
                                throw null;
                            }
                            fa8 fa8Var = (fa8) obj2;
                            if (((1 & jLongValue) << i) != 0) {
                                c79VarW.add(fa8Var);
                            }
                            i = i2;
                        }
                        c79 c79VarJ = yab.j(c79VarW);
                        if (c79VarJ.isEmpty()) {
                            gm0.n(oa8Var.k, "InAppReviewManagersInitializer init() conditions.isEmpty");
                        } else {
                            ListIterator listIterator = c79VarJ.listIterator(0);
                            while (true) {
                                b79 b79Var = (b79) listIterator;
                                if (b79Var.hasNext()) {
                                    ia8Var.h.put((fa8) b79Var.next(), new ga8());
                                } else if (((oqg) oa8Var.h.getValue()).e()) {
                                    na8 na8Var = (na8) oa8Var.i.getValue();
                                    ma8 ma8Var = (ma8) oa8Var.j.getValue();
                                    na8Var.getClass();
                                    na8.b = ma8Var;
                                } else {
                                    String str = oa8Var.k;
                                    a4c a4cVar = gm0.f;
                                    if (a4cVar != null && a4cVar.b(je9Var)) {
                                        a4cVar.c(je9Var, str, zo5.s("InAppReviewManagersInitializer init() storeServicesInfo.areServicesAvailable:", ((svb) oa8Var.d.getValue()).b()), null);
                                    }
                                }
                            }
                        }
                        oa8Var.l = ia8Var;
                    } else {
                        String str2 = oa8Var.k;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            ((wxb) oa8Var.e.getValue()).getClass();
                            boolean zE = ((oqg) oa8Var.h.getValue()).e();
                            StringBuilder sbB = zo5.B("InAppReviewManagersInitializer init() builds.isMarketBuild:true, isInAppReviewEnabledNotFromMarketBuild:", zBooleanValue2, ", isFakeInAppReviewEnabled:", zBooleanValue, ", storeServicesInfo.areServicesAvailable:");
                            sbB.append(zE);
                            a4cVar2.c(je9Var, str2, sbB.toString(), null);
                        }
                    }
                } else {
                    String str3 = oa8Var.k;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        a4cVar3.c(je9Var, str3, zo5.s("InAppReviewManagersInitializer init() InAppReviewComponent.authStorage.isAuthorized:", ((svb) oa8Var.d.getValue()).b()), null);
                    }
                }
                int iOrdinal = this.f.a.d.ordinal();
                if (iOrdinal == 3) {
                    this.f.y();
                } else if (iOrdinal == 4) {
                    this.f.y();
                    MainActivity mainActivity = this.f;
                    ((na8) mainActivity.z.getAccessor().c(332)).getClass();
                    ma8 ma8Var2 = na8.b;
                    if (ma8Var2 != null) {
                        ma8Var2.d(new g3(17, mainActivity));
                    }
                }
                ia8 ia8VarE = this.f.z.e();
                if (ia8VarE != null) {
                    List list = ia8.l;
                    ia8VarE.e(null);
                }
                return sbi.a;
            default:
                ch3.d0(obj);
                MainActivity mainActivity2 = this.f;
                mainActivity2.F.b(mainActivity2);
                return sbi.a;
        }
    }
}
