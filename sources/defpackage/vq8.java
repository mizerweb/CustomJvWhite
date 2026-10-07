package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class vq8 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public vq8(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object a(long j, long j2, List list, tq8 tq8Var, nq4 nq4Var) {
        uq8 uq8Var;
        tq8 tq8Var2;
        e73 e73Var;
        long j3;
        int i;
        long j4;
        int i2;
        Object obj;
        List list2;
        xn3 xn3Var;
        List listSingletonList;
        List list3;
        Object poeVar;
        p63 p63Var = p63.JOIN_REQUEST;
        if (nq4Var instanceof uq8) {
            uq8Var = (uq8) nq4Var;
            int i3 = uq8Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uq8Var.l = i3 - Integer.MIN_VALUE;
            } else {
                uq8Var = new uq8(this, nq4Var);
            }
        } else {
            uq8Var = new uq8(this, nq4Var);
        }
        uq8 uq8Var2 = uq8Var;
        Object obj2 = uq8Var2.j;
        hu4 hu4Var = hu4.a;
        int i4 = uq8Var2.l;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    int i5 = uq8Var2.i;
                    int i6 = uq8Var2.h;
                    long j5 = uq8Var2.e;
                    j4 = uq8Var2.d;
                    tq8 tq8Var3 = uq8Var2.g;
                    List list4 = uq8Var2.f;
                    try {
                        ch3.d0(obj2);
                        obj = obj2;
                        list2 = list4;
                        j3 = j5;
                        i2 = i6;
                        i = i5;
                        tq8Var2 = tq8Var3;
                        xn3Var = (xn3) this.b.getValue();
                        listSingletonList = Collections.singletonList(((f73) obj).c);
                        uq8Var2.f = list2;
                        uq8Var2.g = tq8Var2;
                        uq8Var2.d = j4;
                        uq8Var2.e = j3;
                        uq8Var2.h = i2;
                        uq8Var2.i = i;
                        uq8Var2.l = 2;
                        if (xn3Var.w(listSingletonList, uq8Var2) != hu4Var) {
                            list3 = list2;
                            ((z8a) this.c.getValue()).a(new w8a(j4, p63Var, list3));
                            poeVar = sbi.a;
                        }
                        return hu4Var;
                    } catch (Throwable th) {
                        th = th;
                        tq8Var2 = tq8Var3;
                        poeVar = new poe(th);
                    }
                } else {
                    if (i4 != 2) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j6 = uq8Var2.d;
                    tq8 tq8Var4 = uq8Var2.g;
                    list3 = uq8Var2.f;
                    try {
                        ch3.d0(obj2);
                        j4 = j6;
                        tq8Var2 = tq8Var4;
                        ((z8a) this.c.getValue()).a(new w8a(j4, p63Var, list3));
                        poeVar = sbi.a;
                    } catch (Throwable th2) {
                        th = th2;
                        tq8Var2 = tq8Var4;
                        poeVar = new poe(th);
                    }
                }
                poeVar = new poe(th);
            } else {
                ch3.d0(obj2);
                try {
                    int iOrdinal = tq8Var.ordinal();
                    if (iOrdinal == 0) {
                        e73Var = e73.ADD;
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        e73Var = e73.REMOVE;
                    }
                    e73 e73Var2 = e73Var;
                    pvb pvbVar = (pvb) this.a.getValue();
                    wy2 wy2Var = new wy2(j2, e73Var2, list, p63Var, 0);
                    uq8Var2.f = list;
                    tq8Var2 = tq8Var;
                    try {
                        uq8Var2.g = tq8Var2;
                        uq8Var2.d = j;
                        j3 = j2;
                        uq8Var2.e = j3;
                        i = 0;
                        uq8Var2.h = 0;
                        uq8Var2.i = 0;
                        uq8Var2.l = 1;
                        Object objD = pvbVar.D(wy2Var, uq8Var2);
                        if (objD != hu4Var) {
                            j4 = j;
                            i2 = 0;
                            obj = objD;
                            list2 = list;
                            xn3Var = (xn3) this.b.getValue();
                            listSingletonList = Collections.singletonList(((f73) obj).c);
                            uq8Var2.f = list2;
                            uq8Var2.g = tq8Var2;
                            uq8Var2.d = j4;
                            uq8Var2.e = j3;
                            uq8Var2.h = i2;
                            uq8Var2.i = i;
                            uq8Var2.l = 2;
                            if (xn3Var.w(listSingletonList, uq8Var2) != hu4Var) {
                                list3 = list2;
                                ((z8a) this.c.getValue()).a(new w8a(j4, p63Var, list3));
                                poeVar = sbi.a;
                            }
                        }
                        return hu4Var;
                    } catch (Throwable th3) {
                        th = th3;
                        poeVar = new poe(th);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    tq8Var2 = tq8Var;
                    poeVar = new poe(th);
                }
            }
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                String name = vq8.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, c0a.o("Failed to ", tq8Var2.name().toLowerCase(Locale.ROOT), " join request"), thA);
                    }
                }
            }
            return poeVar;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
