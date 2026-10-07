package defpackage;

import android.text.SpannableStringBuilder;
import com.vk.push.core.analytics.BaseAnalyticsSender;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import one.me.android.initialization.AccountInitializer;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class i26 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i26(Object obj, lq4 lq4Var, bw0 bw0Var) {
        super(2, lq4Var);
        this.e = 14;
        this.g = obj;
        this.h = bw0Var;
    }

    private final Object l(Object obj) {
        ai1 ai1Var = (ai1) this.h;
        b95 b95Var = ai1Var.d;
        njd njdVar = (njd) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            rh1 rh1Var = new rh1(njdVar, ai1Var);
            dz4 dz4Var = (dz4) ((x02) b95Var.i.a.getValue()).z().getValue();
            if (dz4Var.f && !(dz4Var.q instanceof mi6) && !((x02) b95Var.i.a.getValue()).n()) {
                njdVar.c(yg1.c);
            }
            ai1Var.c.f(rh1Var);
            z2 z2Var = new z2(ai1Var, 10, rh1Var);
            this.g = null;
            this.f = 1;
            Object objB = np4.b(njdVar, z2Var, this);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object n(Object obj) {
        Object value;
        LinkedHashMap linkedHashMap;
        kh1 kh1Var = (kh1) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            long jLongValue = ((paj) kh1Var).b.longValue();
            this.f = 1;
            Object objT = rx8.t(jLongValue, this);
            hu4 hu4Var = hu4.a;
            if (objT == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        mjg mjgVar = ((ai1) this.h).f;
        do {
            value = mjgVar.getValue();
            linkedHashMap = new LinkedHashMap((Map) value);
            linkedHashMap.remove(Integer.valueOf(kh1Var.getPriority()));
        } while (!mjgVar.h(value, wm9.X0(linkedHashMap)));
        return sbi.a;
    }

    private final Object o(Object obj) {
        Object value;
        Object value2;
        List list = (List) this.g;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            ofb ofbVar = ((kl1) this.h).h;
            this.g = list;
            this.f = 1;
            obj = ofbVar.c(list, this);
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
        List list2 = (List) obj;
        int iP0 = wm9.P0(yw3.W0(list2, 10));
        if (iP0 < 16) {
            iP0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
        for (Object obj2 : list2) {
            linkedHashMap.put(new Long(((yw7) obj2).a), obj2);
        }
        kl1 kl1Var = (kl1) this.h;
        if (kl1Var.c == yl1.ALL) {
            mjg mjgVar = kl1Var.w;
            do {
                value2 = mjgVar.getValue();
                ((Boolean) value2).getClass();
            } while (!mjgVar.h(value2, Boolean.valueOf(linkedHashMap.isEmpty())));
        }
        mjg mjgVar2 = ((kl1) this.h).u;
        do {
            value = mjgVar2.getValue();
        } while (!mjgVar2.h(value, new qlc(linkedHashMap)));
        kl1 kl1Var2 = (kl1) this.h;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                int size = linkedHashMap.size();
                int size2 = list.size();
                yl1 yl1Var = kl1Var2.c;
                StringBuilder sbP = qv1.p("newPath: loaded ", size, " groups from ", size2, " items for type=");
                sbP.append(yl1Var);
                a4cVar.c(je9Var, "CallHistoryPageViewModel", sbP.toString(), null);
            }
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    private final Object p(Object obj) {
        Object objK0;
        int i = this.f;
        sbi sbiVar = sbi.a;
        if (i == 0) {
            ch3.d0(obj);
            pfb pfbVar = ((vl1) this.g).c;
            ArrayList arrayList = (ArrayList) this.h;
            this.f = 1;
            int i2 = pfbVar.a;
            hu4 hu4Var = hu4.a;
            switch (i2) {
                case 0:
                    objK0 = yab.K0(((n0c) ((xhh) pfbVar.b.getValue())).b(), new awa(arrayList, pfbVar, (lq4) null, 7), this);
                    if (objK0 != hu4Var) {
                        objK0 = sbiVar;
                    }
                    break;
                default:
                    objK0 = yab.K0(((n0c) ((xhh) pfbVar.c.getValue())).b(), new qz9(arrayList, pfbVar, null, 14), this);
                    if (objK0 != hu4Var) {
                        objK0 = sbiVar;
                    }
                    break;
            }
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbiVar;
    }

    private final Object q(Object obj) {
        Object objK0;
        vq1 vq1Var;
        Object value;
        tj0 tj0VarA;
        tnh tnhVar;
        SpannableStringBuilder spannableStringBuilder;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            vq1 vq1Var2 = (vq1) this.h;
            pfb pfbVar = vq1Var2.f;
            this.g = vq1Var2;
            this.f = 1;
            switch (pfbVar.a) {
                case 0:
                    objK0 = yab.K0(((n0c) ((xhh) pfbVar.b.getValue())).b(), new c37(pfbVar, null, 11), this);
                    break;
                default:
                    objK0 = yab.K0(((n0c) ((xhh) pfbVar.c.getValue())).b(), new c37(pfbVar, null, 12), this);
                    break;
            }
            if (objK0 == hu4Var) {
                return hu4Var;
            }
            vq1Var = vq1Var2;
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vq1Var = (vq1) this.g;
            ch3.d0(obj);
            objK0 = obj;
        }
        vq1Var.i = (Long) objK0;
        vq1 vq1Var3 = (vq1) this.h;
        co1 co1Var = vq1Var3.e;
        mjg mjgVar = vq1Var3.j;
        do {
            value = mjgVar.getValue();
            tj0VarA = co1Var.a(null, Long.MIN_VALUE);
            tnhVar = new tnh(R.string.call_history_info_creating);
            spannableStringBuilder = new SpannableStringBuilder(" ");
            spannableStringBuilder.setSpan(new FitFontImageSpan((da9) co1Var.b.getValue(), null, false, false, 14, null), 0, 1, 17);
        } while (!mjgVar.h(value, lq1.a((lq1) value, tj0VarA, null, null, new iq1(new xnh(spannableStringBuilder)), tnhVar, r66.a, null, false, null, null, 1805)));
        return sbi.a;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new i26((p26) obj2, lq4Var, 0);
            case 1:
                return new i26((y) obj2, lq4Var, 1);
            case 2:
                return new i26((AccountInitializer) this.g, (List) obj2, lq4Var, 2);
            case 3:
                return new i26((be) obj2, lq4Var, 3);
            case 4:
                i26 i26Var = new i26((je) obj2, lq4Var, 4);
                i26Var.g = obj;
                return i26Var;
            case 5:
                return new i26((je) this.g, (String) obj2, lq4Var, 5);
            case 6:
                return new i26((i50) this.g, (p5e) obj2, lq4Var, 6);
            case 7:
                return new i26((ny8) this.g, (g90) obj2, lq4Var, 7);
            case 8:
                i26 i26Var2 = new i26((dg0) obj2, lq4Var, 8);
                i26Var2.g = obj;
                return i26Var2;
            case 9:
                return new i26((pl0) this.g, (String) obj2, lq4Var, 9);
            case 10:
                return new i26((in0) this.g, (String) obj2, lq4Var, 10);
            case 11:
                return new i26((BaseAnalyticsSender) obj2, lq4Var, 11);
            case 12:
                return new i26((yp0) this.g, (yq0) obj2, lq4Var, 12);
            case 13:
                i26 i26Var3 = new i26((kq0) obj2, lq4Var, 13);
                i26Var3.g = obj;
                return i26Var3;
            case 14:
                return new i26(this.g, lq4Var, (bw0) obj2);
            case 15:
                return new i26((fz0) this.g, (so4) obj2, lq4Var, 15);
            case 16:
                return new i26((fz0) this.g, (bk4) obj2, lq4Var, 16);
            case 17:
                return new i26((fz0) this.g, (yq0) obj2, lq4Var, 17);
            case 18:
                return new i26((b11) this.g, (c11) obj2, lq4Var, 18);
            case 19:
                return new i26((w11) this.g, (Long) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new i26((c51) obj2, lq4Var, 20);
            case 21:
                return new i26((ya1) this.g, (pw) obj2, lq4Var, 21);
            case 22:
                return new i26((pe1) this.g, (rt2) obj2, lq4Var, 22);
            case 23:
                return new i26((r6a) obj2, lq4Var, 23);
            case 24:
                i26 i26Var4 = new i26((ai1) obj2, lq4Var, 24);
                i26Var4.g = obj;
                return i26Var4;
            case 25:
                return new i26((kh1) this.g, (ai1) obj2, lq4Var, 25);
            case 26:
                i26 i26Var5 = new i26((kl1) obj2, lq4Var, 26);
                i26Var5.g = obj;
                return i26Var5;
            case 27:
                return new i26((vl1) this.g, (ArrayList) obj2, lq4Var, 27);
            case 28:
                return new i26((vq1) obj2, lq4Var, 28);
            default:
                return new i26((kt1) this.g, (fu1) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((i26) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((i26) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((i26) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((i26) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((i26) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((i26) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:205:0x0410 A[PHI: r2
  0x0410: PHI (r2v61 h41) = (r2v59 h41), (r2v60 h41), (r2v65 h41) binds: [B:204:0x0405, B:211:0x0431, B:201:0x03ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:208:0x041b A[PHI: r2 r4
  0x041b: PHI (r2v60 h41) = (r2v61 h41), (r2v63 h41) binds: [B:206:0x0418, B:203:0x03fb] A[DONT_GENERATE, DONT_INLINE]
  0x041b: PHI (r4v19 java.lang.Object) = (r4v25 java.lang.Object), (r4v26 java.lang.Object) binds: [B:206:0x0418, B:203:0x03fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:210:0x0423  */
    /* JADX WARN: Code duplicated, block: B:348:0x06ef  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:211:0x0431 -> B:205:0x0410). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x014d -> B:78:0x0151). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 2342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i26.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i26(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i26(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }
}
