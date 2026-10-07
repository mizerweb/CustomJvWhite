package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tra extends mdh implements qf7 {
    public q24 e;
    public s04 f;
    public rt2 g;
    public List h;
    public int i;
    public final /* synthetic */ jsa j;
    public final /* synthetic */ long k;
    public final /* synthetic */ List l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tra(jsa jsaVar, long j, List list, boolean z, boolean z2, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = jsaVar;
        this.k = j;
        this.l = list;
        this.m = z;
        this.n = z2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new tra(this.j, this.k, this.l, this.m, this.n, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((tra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:49:0x0101  */
    /* JADX WARN: Code duplicated, block: B:59:0x0117  */
    /* JADX WARN: Code duplicated, block: B:61:0x011f  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f6 A[SYNTHETIC] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        s04 s04Var;
        Object objI;
        q24 q24Var;
        Object objA;
        s04 s04Var2;
        rt2 rt2Var;
        List list;
        Object objK;
        List list2;
        Iterator it;
        Object next;
        Long l;
        long jLongValue;
        boolean z;
        String str;
        a4c a4cVar;
        je9 je9Var;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        int i = this.i;
        if (i == 0) {
            ch3.d0(obj);
            jsa jsaVar = this.j;
            q24 q24Var2 = jsaVar.c.i;
            if (q24Var2 != null) {
                Object value = jsaVar.w2.a.getValue();
                s04Var = value instanceof s04 ? (s04) value : null;
                if (s04Var != null) {
                    xn3 xn3Var = this.j.l;
                    long j = q24Var2.a;
                    this.e = q24Var2;
                    this.f = s04Var;
                    this.i = 1;
                    objI = xn3Var.i(j, this);
                    if (objI != hu4Var) {
                        q24Var = q24Var2;
                    }
                    return hu4Var;
                }
            }
            return sbiVar;
        }
        if (i == 1) {
            s04Var = this.f;
            q24 q24Var3 = this.e;
            ch3.d0(obj);
            q24Var = q24Var3;
            objI = obj;
        } else {
            if (i == 2) {
                rt2Var = this.g;
                s04 s04Var3 = this.f;
                q24 q24Var4 = this.e;
                ch3.d0(obj);
                q24Var = q24Var4;
                s04Var2 = s04Var3;
                objA = obj;
                list = (List) objA;
                jsa jsaVar2 = this.j;
                zv8[] zv8VarArr = jsa.Z2;
                this.e = q24Var;
                this.f = null;
                this.g = rt2Var;
                this.h = list;
                this.i = 3;
                objK = jsaVar2.a0().k(s04Var2, list, this);
                if (objK != hu4Var) {
                    list2 = list;
                }
                return hu4Var;
            }
            if (i != 3) {
                if (i != 4) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list3 = this.h;
                ch3.d0(obj);
                return sbiVar;
            }
            List list4 = this.h;
            rt2 rt2Var2 = this.g;
            q24 q24Var5 = this.e;
            ch3.d0(obj);
            list2 = list4;
            rt2Var = rt2Var2;
            q24Var = q24Var5;
            objK = obj;
        }
        it = ((Iterable) objK).iterator();
        do {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Number) next).longValue() == 0);
        l = (Long) next;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        z = this.m;
        if ((!z || this.n) && jLongValue == 0) {
            str = this.j.v;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "admin delete skipped: triggerCommentServerId is 0", null);
                    return sbiVar;
                }
            }
        } else {
            boolean z2 = this.n;
            long j2 = this.k;
            luk yqaVar = z2 ? new yqa(q24Var, list2, j2, z, jLongValue, rt2Var.a, rt2Var.A()) : new xqa(q24Var, list2, j2, z, jLongValue);
            jsa jsaVar3 = this.j;
            zv8[] zv8VarArr2 = jsa.Z2;
            hqc hqcVar = (hqc) jsaVar3.X2.getValue();
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = 4;
            if (hqcVar.b(yqaVar, this) == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
        rt2 rt2Var3 = (rt2) objI;
        if (rt2Var3 != null) {
            jsa jsaVar4 = this.j;
            zv8[] zv8VarArr3 = jsa.Z2;
            hy3 hy3VarW = jsaVar4.W();
            lc lcVar = new lc(q24Var, this.k, this.l, this.m);
            this.e = q24Var;
            this.f = s04Var;
            this.g = rt2Var3;
            this.i = 2;
            objA = hy3VarW.a(lcVar, this);
            if (objA != hu4Var) {
                s04Var2 = s04Var;
                rt2Var = rt2Var3;
                list = (List) objA;
                jsa jsaVar5 = this.j;
                zv8[] zv8VarArr4 = jsa.Z2;
                this.e = q24Var;
                this.f = null;
                this.g = rt2Var;
                this.h = list;
                this.i = 3;
                objK = jsaVar5.a0().k(s04Var2, list, this);
                if (objK != hu4Var) {
                    list2 = list;
                    it = ((Iterable) objK).iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((Number) next).longValue() == 0);
                    l = (Long) next;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    z = this.m;
                    if (z) {
                        str = this.j.v;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "admin delete skipped: triggerCommentServerId is 0", null);
                                return sbiVar;
                            }
                        }
                    } else {
                        str = this.j.v;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "admin delete skipped: triggerCommentServerId is 0", null);
                                return sbiVar;
                            }
                        }
                    }
                }
            }
            return hu4Var;
        }
        return sbiVar;
    }
}
