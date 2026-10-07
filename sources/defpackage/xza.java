package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes.dex */
public final class xza extends mdh implements qf7 {
    public pw e;
    public m8b f;
    public a0b g;
    public Iterator h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ List m;
    public final /* synthetic */ a0b n;
    public final /* synthetic */ long o;
    public final /* synthetic */ Long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xza(List list, a0b a0bVar, long j, Long l, lq4 lq4Var) {
        super(2, lq4Var);
        this.m = list;
        this.n = a0bVar;
        this.o = j;
        this.p = l;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        xza xzaVar = new xza(this.m, this.n, this.o, this.p, lq4Var);
        xzaVar.l = obj;
        return xzaVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((xza) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:116:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x00a8 A[EDGE_INSN: B:129:0x00a8->B:34:0x00a8 BREAK  A[LOOP:3: B:23:0x0064->B:33:0x00a3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3 A[Catch: all -> 0x01d8, LOOP:3: B:23:0x0064->B:33:0x00a3, LOOP_END, TryCatch #3 {, blocks: (B:20:0x0059, B:23:0x0064, B:25:0x0077, B:27:0x0083, B:29:0x008d, B:30:0x009a, B:33:0x00a3, B:34:0x00a8), top: B:118:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x010e  */
    /* JADX WARN: Code duplicated, block: B:64:0x011e A[Catch: all -> 0x01d5, TRY_LEAVE, TryCatch #2 {, blocks: (B:61:0x0111, B:62:0x0118, B:64:0x011e), top: B:116:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0162  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a5 A[LOOP:0: B:81:0x015c->B:89:0x01a5, LOOP_END] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        pw pwVar;
        Object objK0;
        a0b a0bVar;
        m8b m8bVar;
        hw hwVar;
        List list;
        List list2;
        m8b m8bVar2;
        a0b a0bVar2;
        Iterator it;
        int i2;
        m8b m8bVar3;
        a0b a0bVar3;
        Object objK;
        gu4 gu4Var = (gu4) this.l;
        hu4 hu4Var = hu4.a;
        int i3 = this.k;
        lq4 lq4Var = null;
        if (i3 != 0) {
            if (i3 == 1) {
                i = this.i;
                pwVar = this.e;
                try {
                    ch3.d0(obj);
                    objK0 = obj;
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof CancellationException) {
                        a0bVar = this.n;
                        synchronized (a0bVar) {
                            m8bVar = a0bVar.h;
                            hwVar = new hw(pwVar);
                            while (hwVar.hasNext()) {
                                m8bVar.n(((Number) hwVar.next()).longValue());
                            }
                            if (!(th instanceof TimeoutCancellationException)) {
                                throw th;
                            }
                        }
                    } else {
                        a0bVar = this.n;
                        synchronized (a0bVar) {
                            m8bVar = a0bVar.h;
                            hwVar = new hw(pwVar);
                            while (hwVar.hasNext()) {
                                m8bVar.n(((Number) hwVar.next()).longValue());
                            }
                            if (!(th instanceof TimeoutCancellationException)) {
                                throw th;
                            }
                        }
                    }
                    list = null;
                }
            } else {
                if (i3 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = this.j;
                int i4 = this.i;
                it = this.h;
                a0b a0bVar4 = this.g;
                m8b m8bVar4 = this.f;
                ch3.d0(obj);
                i = i4;
                m8bVar2 = m8bVar4;
                a0bVar2 = a0bVar4;
            }
            while (it.hasNext()) {
                ylc ylcVar = (ylc) it.next();
                long[] jArr = (long[]) ylcVar.a;
                ylc ylcVar2 = (ylc) ylcVar.b;
                this.l = null;
                this.e = null;
                this.f = m8bVar2;
                this.g = a0bVar2;
                this.h = it;
                this.i = i;
                this.j = i2;
                this.k = 2;
                a0bVar2.getClass();
                m8bVar3 = m8bVar2;
                a0bVar3 = a0bVar2;
                objK = cqk.k(new gv7(13, null, ylcVar2, a0bVar3, m8bVar3, jArr), this);
                if (objK != hu4.a) {
                    objK = sbi.a;
                }
                if (objK == hu4Var) {
                    return hu4Var;
                }
                a0bVar2 = a0bVar3;
                m8bVar2 = m8bVar3;
            }
            return m8bVar2;
        }
        ch3.d0(obj);
        if (this.m.isEmpty()) {
            return ui9.a;
        }
        pw pwVar2 = new pw(this.m);
        a0b a0bVar5 = this.n;
        synchronized (a0bVar5) {
            m8b m8bVar5 = a0bVar5.h;
            long[] jArr2 = m8bVar5.b;
            long[] jArr3 = m8bVar5.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j = jArr3[i5];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i5 != length) {
                            break;
                            break;
                        }
                        i5++;
                    } else {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j & 255) < 128) {
                                pwVar2.remove(Long.valueOf(jArr2[(i5 << 3) + i7]));
                            }
                            j >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                        if (i5 != length) {
                            break;
                        }
                        i5++;
                    }
                }
            }
            rx8.d(a0bVar5.h, pwVar2);
        }
        if (pwVar2.isEmpty()) {
            List list3 = this.m;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "MissedContactsController", c0a.o("requestContacts: idsForRequest skipped! missedIds=[", ww3.z1(list3, null, null, null, null, 63), "]"), null);
                }
            }
            return ui9.a;
        }
        i = 100;
        try {
            long j2 = this.o;
            t20 t20Var = new t20(pwVar2, this.n, this.p, lq4Var, 25);
            this.l = gu4Var;
            this.e = pwVar2;
            this.i = 100;
            this.k = 1;
            objK0 = lvb.K0(j2, t20Var, this);
            if (objK0 != hu4Var) {
                pwVar = pwVar2;
            }
        } catch (Throwable th2) {
            th = th2;
            pwVar = pwVar2;
            if ((th instanceof CancellationException) || (th instanceof TamErrorException)) {
                a0bVar = this.n;
                synchronized (a0bVar) {
                    m8bVar = a0bVar.h;
                    hwVar = new hw(pwVar);
                    while (hwVar.hasNext()) {
                        m8bVar.n(((Number) hwVar.next()).longValue());
                    }
                }
                if (!(th instanceof TimeoutCancellationException)) {
                    throw th;
                }
            }
            list = null;
        }
        return hu4Var;
        list = (List) objK0;
        if (!cqk.x(gu4Var) || (list2 = list) == null || list2.isEmpty() || !this.n.h()) {
            a0b a0bVar6 = this.n;
            synchronized (a0bVar6) {
                m8b m8bVar6 = a0bVar6.h;
                hw hwVar2 = new hw(pwVar);
                while (hwVar2.hasNext()) {
                    m8bVar6.n(((Number) hwVar2.next()).longValue());
                }
            }
            return rx8.j0(pwVar);
        }
        m8bVar2 = new m8b();
        a0bVar2 = this.n;
        it = list.iterator();
        i2 = 0;
        while (it.hasNext()) {
            ylc ylcVar3 = (ylc) it.next();
            long[] jArr4 = (long[]) ylcVar3.a;
            ylc ylcVar4 = (ylc) ylcVar3.b;
            this.l = null;
            this.e = null;
            this.f = m8bVar2;
            this.g = a0bVar2;
            this.h = it;
            this.i = i;
            this.j = i2;
            this.k = 2;
            a0bVar2.getClass();
            m8bVar3 = m8bVar2;
            a0bVar3 = a0bVar2;
            objK = cqk.k(new gv7(13, null, ylcVar4, a0bVar3, m8bVar3, jArr4), this);
            if (objK != hu4.a) {
                objK = sbi.a;
            }
            if (objK == hu4Var) {
                return hu4Var;
            }
            a0bVar2 = a0bVar3;
            m8bVar2 = m8bVar3;
        }
        return m8bVar2;
    }
}
