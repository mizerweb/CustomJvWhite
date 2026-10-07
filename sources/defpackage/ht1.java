package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.ui.call.CallScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class ht1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public int g;
    public final /* synthetic */ Object h;
    public Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht1(List list, lq4 lq4Var, pm2 pm2Var, int i) {
        super(2, lq4Var);
        this.e = 4;
        this.i = list;
        this.h = pm2Var;
        this.g = i;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x006e A[RETURN] */
    private final Object l(Object obj) {
        vxf vxfVar = (vxf) this.i;
        int i = this.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i == 0) {
            ch3.d0(obj);
            String str = (String) this.h;
            this.f = 1;
            obj = yab.K0(((n0c) ((xhh) vxfVar.i.getValue())).b(), new dtd(str, vxfVar, null, 27), this);
            if (obj != hu4Var) {
            }
            return hu4Var;
        }
        if (i != 1) {
            if (i == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            if (i == 3) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        String str2 = (String) obj;
        pzf pzfVar = vxfVar.r;
        if (str2 == null) {
            this.f = 2;
            if (pzfVar.emit(cyf.a, this) == hu4Var) {
                return hu4Var;
            }
            return sbiVar;
        }
        byf byfVar = new byf(str2, this.g);
        this.f = 3;
        if (pzfVar.emit(byfVar, this) == hu4Var) {
            return hu4Var;
        }
        return sbiVar;
    }

    private final Object n(Object obj) {
        int i;
        List list;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.h;
        int i2 = this.g;
        if (i2 == 0) {
            ch3.d0(obj);
            uii uiiVar = (uii) this.i;
            int i3 = ((lx2) uiiVar.b) == lx2.b ? 1 : 0;
            hu4 hu4Var = hu4.a;
            if (i3 != 0) {
                jah jahVar = (jah) uiiVar.d;
                this.f = i3;
                this.g = 1;
                l9h l9hVar = jahVar.l;
                d9h d9hVarC = jahVar.c();
                l9hVar.getClass();
                obj = d9hVarC.f(linkedHashSet, this);
                if (obj != hu4Var) {
                    i = i3;
                    list = (List) obj;
                }
            } else {
                g85 g85Var = (g85) uiiVar.e;
                this.f = i3;
                this.g = 2;
                l9h l9hVar2 = (l9h) g85Var.c;
                xde xdeVar = (xde) g85Var.e;
                l9hVar2.getClass();
                obj = xdeVar.f(linkedHashSet, this);
                if (obj != hu4Var) {
                    i = i3;
                    list = (List) obj;
                }
            }
            return hu4Var;
        }
        if (i2 == 1) {
            i = this.f;
            ch3.d0(obj);
            list = (List) obj;
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f;
            ch3.d0(obj);
            list = (List) obj;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new kah((p8h) it.next(), i == 0));
        }
        return arrayList;
    }

    private final Object o(Object obj) {
        ioj iojVar = (ioj) this.i;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            jq6 jq6Var = (jq6) iojVar.x.getValue();
            int i2 = this.g;
            Intent intent = (Intent) this.h;
            this.f = 1;
            obj = yab.K0(((n0c) ((xhh) jq6Var.a.getValue())).b(), new qc5(intent, i2, jq6Var, null, 13), this);
            hu4 hu4Var = hu4.a;
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
        a8j.x(iojVar.C1, new fr6((Uri[]) obj));
        return sbi.a;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new ht1((kt1) this.i, this.g, (Bundle) obj2, lq4Var, 0);
            case 1:
                return new ht1((CallOpponentsListWidget) this.i, this.g, (Bundle) obj2, lq4Var, 1);
            case 2:
                return new ht1((CallScreen) this.i, this.g, (Bundle) obj2, lq4Var, 2);
            case 3:
                return new ht1((h02) this.i, this.g, (Bundle) obj2, lq4Var, 3);
            case 4:
                return new ht1((List) this.i, lq4Var, (pm2) obj2, this.g);
            case 5:
                return new ht1((l63) this.i, this.g, (Bundle) obj2, lq4Var, 5);
            case 6:
                return new ht1(this.g, (rl3) this.i, (Set) obj2, lq4Var, 6);
            case 7:
                return new ht1((pk3) this.i, (rl3) obj2, this.g, lq4Var, 7);
            case 8:
                return new ht1((g85) this.i, (String) obj2, this.g, lq4Var, 8);
            case 9:
                return new ht1(this.g, (y85) this.i, (kgl) obj2, lq4Var, 9);
            case 10:
                ht1 ht1Var = new ht1(this.g, lq4Var, (y85) obj2);
                ht1Var.i = obj;
                return ht1Var;
            case 11:
                return new ht1((p26) this.i, (String) obj2, this.g, lq4Var, 11);
            case 12:
                return new ht1((Intent) this.i, (bl6) obj2, this.g, lq4Var, 12);
            case 13:
                ht1 ht1Var2 = new ht1((njd) this.i, (zt6) obj2, lq4Var, 13);
                ht1Var2.g = ((Number) obj).intValue();
                return ht1Var2;
            case 14:
                return new ht1((d67) this.i, this.g, (String) obj2, lq4Var, 14);
            case 15:
                return new ht1((x02) this.i, (t84) obj2, this.g, lq4Var, 15);
            case 16:
                return new ht1((vxf) this.i, (String) obj2, this.g, lq4Var, 16);
            case 17:
                return new ht1(this.g, (ubg) this.i, (tg8) obj2, lq4Var, 17);
            case 18:
                return new ht1((uii) this.i, (LinkedHashSet) obj2, lq4Var, 18);
            case 19:
                return new ht1((ioj) this.i, this.g, (Intent) obj2, lq4Var, 19);
            default:
                return new ht1((cpj) obj2, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((ht1) create(Integer.valueOf(((Number) obj).intValue()), (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((ht1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0281  */
    /* JADX WARN: Code duplicated, block: B:98:0x0284  */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0481, code lost:
    
        if (defpackage.yab.K0(r2, r3, r32) == r1) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x071c, code lost:
    
        if (r0 == r3) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0733, code lost:
    
        if (r1 == r3) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0761, code lost:
    
        if (r1.i(r12, r13, r32) == r3) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        if (r0 == r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x07b1, code lost:
    
        if (r1.a(r13, r32) == r3) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0811, code lost:
    
        if (r7.h(r1, defpackage.r1f.a, r8, r32) == r3) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0ba0, code lost:
    
        if (r1.k(r2, r32) == r0) goto L487;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 3290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ht1(int i, Object obj, Object obj2, lq4 lq4Var, int i2) {
        super(2, lq4Var);
        this.e = i2;
        this.g = i;
        this.i = obj;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht1(cpj cpjVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 20;
        this.h = cpjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ht1(Object obj, int i, Object obj2, lq4 lq4Var, int i2) {
        super(2, lq4Var);
        this.e = i2;
        this.i = obj;
        this.g = i;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ht1(Object obj, Object obj2, int i, lq4 lq4Var, int i2) {
        super(2, lq4Var);
        this.e = i2;
        this.i = obj;
        this.h = obj2;
        this.g = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ht1(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht1(int i, lq4 lq4Var, y85 y85Var) {
        super(2, lq4Var);
        this.e = 10;
        this.h = y85Var;
        this.g = i;
    }
}
