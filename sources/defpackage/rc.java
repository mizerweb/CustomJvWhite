package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class rc {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public rc(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0108  */
    /* JADX WARN: Code duplicated, block: B:39:0x010c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    /* JADX WARN: Code duplicated, block: B:43:0x0121  */
    /* JADX WARN: Code duplicated, block: B:45:0x013a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x013c  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final Serializable a(long j, long j2, long j3, int i, nq4 nq4Var) {
        qc qcVar;
        poe poeVar;
        Throwable thA;
        String name;
        String strR;
        a4c a4cVar;
        long j4;
        int i2;
        long j5;
        Object obj;
        List list;
        rc rcVar;
        int i3;
        List list2;
        rc rcVar2;
        long j6;
        long j7 = j3;
        p63 p63Var = p63.ADMIN;
        e73 e73Var = e73.ADD;
        if (nq4Var instanceof qc) {
            qcVar = (qc) nq4Var;
            int i4 = qcVar.m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                qcVar.m = i4 - Integer.MIN_VALUE;
            } else {
                qcVar = new qc(this, nq4Var);
            }
        } else {
            qcVar = new qc(this, nq4Var);
        }
        qc qcVar2 = qcVar;
        Object obj2 = qcVar2.k;
        hu4 hu4Var = hu4.a;
        int i5 = qcVar2.m;
        try {
            if (i5 == 0) {
                ch3.d0(obj2);
                List listSingletonList = Collections.singletonList(new Long(j7));
                pvb pvbVar = (pvb) this.a.getValue();
                wy2 wy2Var = new wy2(j2, e73Var, listSingletonList, p63Var, i);
                qcVar2.i = this;
                qcVar2.j = listSingletonList;
                qcVar2.d = j;
                j4 = j2;
                qcVar2.e = j4;
                qcVar2.f = j7;
                i2 = i;
                qcVar2.g = i2;
                qcVar2.h = 0;
                qcVar2.m = 1;
                Object objD = pvbVar.D(wy2Var, qcVar2);
                if (objD != hu4Var) {
                    j5 = j;
                    obj = objD;
                    list = listSingletonList;
                    rcVar = this;
                    i3 = 0;
                }
                return hu4Var;
            }
            if (i5 == 1) {
                i3 = qcVar2.h;
                int i6 = qcVar2.g;
                long j8 = qcVar2.f;
                j4 = qcVar2.e;
                j5 = qcVar2.d;
                List list3 = qcVar2.j;
                rcVar = qcVar2.i;
                ch3.d0(obj2);
                i2 = i6;
                list = list3;
                j7 = j8;
                obj = obj2;
            } else {
                if (i5 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j6 = qcVar2.d;
                list2 = qcVar2.j;
                rcVar2 = qcVar2.i;
                ch3.d0(obj2);
            }
            ((t51) rcVar2.c.getValue()).c(new g73(0L, list2, p63Var, j6, e73Var));
            poeVar = null;
            thA = roe.a(poeVar);
            if (thA != null) {
                if (thA instanceof TamErrorException) {
                    return ((TamErrorException) thA).a;
                }
                name = rc.class.getName();
                strR = zo5.r("unknown error: ", thA);
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    a4c.f(a4cVar, je9.g, name, strR, null, null, 8);
                }
            }
            if (poeVar != null) {
                return null;
            }
            return poeVar;
            xn3 xn3Var = (xn3) rcVar.b.getValue();
            List listSingletonList2 = Collections.singletonList(((f73) obj).c);
            qcVar2.i = rcVar;
            List list4 = list;
            qcVar2.j = list4;
            qcVar2.d = j5;
            qcVar2.e = j4;
            qcVar2.f = j7;
            qcVar2.g = i2;
            qcVar2.h = i3;
            qcVar2.m = 2;
            if (xn3Var.w(listSingletonList2, qcVar2) != hu4Var) {
                list2 = list4;
                rcVar2 = rcVar;
                j6 = j5;
                ((t51) rcVar2.c.getValue()).c(new g73(0L, list2, p63Var, j6, e73Var));
                poeVar = null;
                thA = roe.a(poeVar);
                if (thA != null) {
                    if (thA instanceof TamErrorException) {
                        return ((TamErrorException) thA).a;
                    }
                    name = rc.class.getName();
                    strR = zo5.r("unknown error: ", thA);
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4c.f(a4cVar, je9.g, name, strR, null, null, 8);
                    }
                }
                if (poeVar != null) {
                    return null;
                }
                return poeVar;
            }
            return hu4Var;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
    }
}
