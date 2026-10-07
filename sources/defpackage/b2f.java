package defpackage;

import android.app.Activity;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import one.me.calls.impl.service.VoIpCallService;

/* JADX INFO: loaded from: classes3.dex */
public final class b2f extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.g = obj2;
        this.i = obj3;
        this.j = obj4;
        this.k = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object l(wfe wfeVar, zgi zgiVar, String str, nq4 nq4Var) {
        tgi tgiVar;
        Object poeVar;
        wfe wfeVar2;
        vfi vfiVar;
        if (nq4Var instanceof tgi) {
            tgiVar = (tgi) nq4Var;
            int i = tgiVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                tgiVar.h = i - Integer.MIN_VALUE;
            } else {
                tgiVar = new tgi(nq4Var);
            }
        } else {
            tgiVar = new tgi(nq4Var);
        }
        tgi tgiVar2 = tgiVar;
        Object objB = tgiVar2.g;
        int i2 = tgiVar2.h;
        hu4 hu4Var = hu4.a;
        if (i2 != 0) {
            if (i2 == 1) {
                zgiVar = tgiVar2.e;
                wfeVar = tgiVar2.d;
                ch3.d0(objB);
            } else {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vfiVar = tgiVar2.f;
                wfeVar2 = tgiVar2.d;
                ch3.d0(objB);
            }
            wfeVar2.a = vfiVar;
            return sbi.a;
        }
        ch3.d0(objB);
        ahi ahiVar = ((vfi) wfeVar.a).a;
        try {
            poeVar = Long.valueOf(new File(str).lastModified());
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = 0L;
        }
        ahi ahiVar2 = new ahi(ahiVar.a, ((Number) poeVar).longValue(), ahiVar.c, ahiVar.d);
        ufi ufiVarB = ((vfi) wfeVar.a).b();
        ufiVarB.a = ahiVar2;
        vfi vfiVar2 = new vfi(ufiVarB);
        tgiVar2.d = wfeVar;
        tgiVar2.e = zgiVar;
        tgiVar2.f = null;
        tgiVar2.h = 1;
        objB = zgi.b(zgiVar, vfiVar2, tgiVar2);
        if (objB == hu4Var) {
            return hu4Var;
        }
        vfi vfiVar3 = (vfi) objB;
        tgiVar2.d = wfeVar;
        tgiVar2.e = null;
        tgiVar2.f = vfiVar3;
        tgiVar2.h = 2;
        if (zgiVar.j(vfiVar3, tgiVar2) == hu4Var) {
            return hu4Var;
        }
        wfeVar2 = wfeVar;
        vfiVar = vfiVar3;
        wfeVar2.a = vfiVar;
        return sbi.a;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.k;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                b2f b2fVar = new b2f((c2f) obj3, (Long) obj2, this.i, lq4Var);
                b2fVar.g = obj;
                return b2fVar;
            case 1:
                b2f b2fVar2 = new b2f((bpf) obj3, (Uri) obj2, lq4Var, 1);
                b2fVar2.g = obj;
                return b2fVar2;
            case 2:
                return new b2f((ArrayList) this.g, (fc4) this.i, (wbg) obj3, (ubg) obj2, lq4Var);
            case 3:
                b2f b2fVar3 = new b2f((b7i) obj3, (String) obj2, lq4Var, 3);
                b2fVar3.i = obj;
                return b2fVar3;
            case 4:
                b2f b2fVar4 = new b2f((p8i) obj3, (String) obj2, lq4Var, 4);
                b2fVar4.i = obj;
                return b2fVar4;
            case 5:
                b2f b2fVar5 = new b2f(5, lq4Var, (wfe) this.h, (zgi) this.i, (zui) obj3, (wze) obj2);
                b2fVar5.g = obj;
                return b2fVar5;
            case 6:
                b2f b2fVar6 = new b2f((cii) this.i, (gka) obj3, (xui) obj2, lq4Var);
                b2fVar6.g = obj;
                return b2fVar6;
            case 7:
                b2f b2fVar7 = new b2f(7, lq4Var, (mvi) this.h, (wui) this.i, (d1e) obj3, (f4c) obj2);
                b2fVar7.g = obj;
                return b2fVar7;
            case 8:
                return new b2f((mvi) this.h, (wui) this.g, (d1e) this.i, (f4c) obj3, (xui) obj2, lq4Var, 8);
            case 9:
                return new b2f((xzi) obj3, (Uri) obj2, lq4Var, 9);
            case 10:
                return new b2f((VoIpCallService) this.h, (y02) this.g, (be1) this.i, (dz4) obj3, (x02) obj2, lq4Var, 10);
            case 11:
                return new b2f((ioj) this.h, (String) this.g, (byte[]) this.i, (String) obj3, (String) obj2, lq4Var, 11);
            default:
                b2f b2fVar8 = new b2f((Activity) obj3, (qhk) obj2, lq4Var, 12);
                b2fVar8.g = obj;
                return b2fVar8;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((b2f) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((b2f) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((b2f) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((b2f) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((b2f) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((b2f) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((b2f) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((b2f) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((b2f) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((b2f) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((b2f) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((b2f) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((b2f) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:333:0x07b7 A[PHI: r2
  0x07b7: PHI (r2v6 ufe) = (r2v4 ufe), (r2v5 ufe), (r2v10 ufe) binds: [B:332:0x07b2, B:345:0x082b, B:325:0x0780] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:335:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:338:0x07e2 A[PHI: r2
  0x07e2: PHI (r2v5 ufe) = (r2v6 ufe), (r2v8 ufe) binds: [B:336:0x07df, B:327:0x078d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:341:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:343:0x07fc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:345:0x082b -> B:333:0x07b7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 2148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b2f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2f(c2f c2fVar, Long l, Object obj, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.j = c2fVar;
        this.k = l;
        this.i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2f(cii ciiVar, gka gkaVar, xui xuiVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 6;
        this.i = ciiVar;
        this.j = gkaVar;
        this.k = xuiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2f(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.j = obj;
        this.k = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2f(int i, lq4 lq4Var, Object obj, Object obj2, Object obj3, Object obj4) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
        this.k = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2f(ArrayList arrayList, fc4 fc4Var, wbg wbgVar, ubg ubgVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 2;
        this.g = arrayList;
        this.i = fc4Var;
        this.j = wbgVar;
        this.k = ubgVar;
    }
}
