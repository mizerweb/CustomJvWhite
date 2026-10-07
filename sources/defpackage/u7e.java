package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import ru.ok.tamtam.messages.reactions.MessageReactionsUpdateException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u7e implements an7 {
    public static final ps0 d = new ps0(23);
    public final Object a;
    public final Object b;
    public Object c;

    public u7e(o02 o02Var) {
        this.a = o02Var;
        this.b = new Object();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object A(sfa sfaVar, kja kjaVar, nq4 nq4Var) {
        q7e q7eVar;
        kja kjaVar2;
        je9 je9Var = je9.d;
        if (nq4Var instanceof q7e) {
            q7eVar = (q7e) nq4Var;
            int i = q7eVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                q7eVar.h = i - Integer.MIN_VALUE;
            } else {
                q7eVar = new q7e(this, nq4Var);
            }
        } else {
            q7eVar = new q7e(this, nq4Var);
        }
        q7e q7eVar2 = q7eVar;
        Object obj = q7eVar2.f;
        hu4 hu4Var = hu4.a;
        int i2 = q7eVar2.h;
        if (i2 == 0) {
            ch3.d0(obj);
            j44 j44VarE = e();
            long j = sfaVar.b;
            long jF = ((s7f) c()).f();
            q7eVar2.d = sfaVar;
            q7eVar2.e = kjaVar;
            q7eVar2.h = 1;
            if (j44VarE.h(j, kjaVar, jF, q7eVar2) == hu4Var) {
                return hu4Var;
            }
            kjaVar2 = kjaVar;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kjaVar2 = q7eVar2.e;
            sfaVar = q7eVar2.d;
            ch3.d0(obj);
        }
        if (cqk.d(kjaVar2, sfaVar.E)) {
            String strG = g();
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, strG, nbh.s(sfaVar.b, "updateMessage: #", " no update needed"), null);
            }
        } else {
            String strG2 = g();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, strG2, zo5.j(sfaVar.b, "updateMessage: #"), null);
            }
            h(sfaVar);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public Object B(sfa sfaVar, z5e z5eVar, nq4 nq4Var) {
        s7e s7eVar;
        int i;
        List list;
        sfa sfaVar2 = sfaVar;
        z5e z5eVar2 = z5eVar;
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.d;
        if (nq4Var instanceof s7e) {
            s7eVar = (s7e) nq4Var;
            int i2 = s7eVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s7eVar.g = i2 - Integer.MIN_VALUE;
            } else {
                s7eVar = new s7e(this, nq4Var);
            }
        } else {
            s7eVar = new s7e(this, nq4Var);
        }
        s7e s7eVar2 = s7eVar;
        Object obj = s7eVar2.e;
        hu4 hu4Var = hu4.a;
        int i3 = s7eVar2.g;
        if (i3 == 0) {
            ch3.d0(obj);
            if (sfaVar2.j == wja.DELETED) {
                return sbiVar;
            }
            kja kjaVar = sfaVar2.E;
            int i4 = kjaVar != null ? kjaVar.b : 0;
            z5e z5eVar3 = kjaVar != null ? kjaVar.c : null;
            ArrayList arrayList = (kjaVar == null || (list = kjaVar.a) == null) ? new ArrayList() : new ArrayList(list);
            String strG = g();
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                String strZ1 = ww3.z1(arrayList, null, null, null, null, 63);
                StringBuilder sb = new StringBuilder("updateMessageYourReaction: totalCount=");
                sb.append(i4);
                sb.append(", yourReaction=");
                sb.append(z5eVar3);
                sb.append(", [");
                a4cVar.c(je9Var, strG, zo5.w(sb, strZ1, "]"), null);
            }
            if (cqk.d(z5eVar3, z5eVar2)) {
                String strG2 = g();
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, strG2, "updateMessageYourReaction: cancel your reaction", null);
                }
                xr8.h(arrayList, z5eVar3);
                int i5 = i4 - 1;
                i = i5 < 0 ? 0 : i5;
                z5eVar2 = null;
            } else {
                String strG3 = g();
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, strG3, "updateMessageYourReaction: add new reaction", null);
                }
                if (z5eVar3 != null) {
                    xr8.h(arrayList, z5eVar3);
                    i4--;
                }
                xr8.f(arrayList, z5eVar2);
                i = i4 + 1;
            }
            bx3.Y0(arrayList, d);
            kja kjaVar2 = new kja(arrayList, i, z5eVar2);
            String strG4 = g();
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, strG4, "updateMessageYourReaction: " + kjaVar2, null);
            }
            j44 j44VarE = e();
            long j = sfaVar2.b;
            long jF = ((s7f) c()).f();
            s7eVar2.d = sfaVar2;
            s7eVar2.g = 1;
            if (j44VarE.h(j, kjaVar2, jF, s7eVar2) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sfaVar2 = s7eVar2.d;
            ch3.d0(obj);
        }
        h(sfaVar2);
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0157 A[Catch: all -> 0x003c, CancellationException -> 0x01a7, TryCatch #2 {CancellationException -> 0x01a7, all -> 0x003c, blocks: (B:13:0x0037, B:59:0x014c, B:60:0x0151, B:62:0x0157, B:64:0x016d, B:65:0x0173, B:68:0x017c, B:70:0x0182, B:55:0x0126), top: B:76:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:79:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0151 A[SYNTHETIC] */
    public Object C(rt2 rt2Var, l8b l8bVar, nq4 nq4Var) {
        t7e t7eVar;
        l8b l8bVar2;
        List list;
        l8b l8bVar3;
        List<sfa> list2;
        Object[] objArr;
        Object[] objArr2;
        int i;
        String strG;
        a4c a4cVar;
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.d;
        if (nq4Var instanceof t7e) {
            t7eVar = (t7e) nq4Var;
            int i2 = t7eVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t7eVar.i = i2 - Integer.MIN_VALUE;
            } else {
                t7eVar = new t7e(this, nq4Var);
            }
        } else {
            t7eVar = new t7e(this, nq4Var);
        }
        Object objA = t7eVar.g;
        hu4 hu4Var = hu4.a;
        int i3 = t7eVar.i;
        try {
            if (i3 == 0) {
                ch3.d0(objA);
                String strG2 = g();
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, strG2, "updateMessages for " + rt2Var, null);
                }
                j44 j44VarE = e();
                ArrayList arrayListA = bpk.a(l8bVar);
                l8bVar2 = l8bVar;
                t7eVar.d = l8bVar2;
                t7eVar.i = 1;
                objA = j44VarE.a(rt2Var, arrayListA, t7eVar);
                if (objA != hu4Var) {
                }
                return hu4Var;
            }
            if (i3 == 1) {
                l8b l8bVar4 = t7eVar.d;
                ch3.d0(objA);
                l8bVar2 = l8bVar4;
            } else {
                if (i3 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l8bVar3 = t7eVar.f;
                list2 = t7eVar.e;
                ch3.d0(objA);
            }
            i = 0;
            for (sfa sfaVar : list2) {
                if (!cqk.d(sfaVar.E, (kja) l8bVar3.f(sfaVar.b))) {
                    i++;
                    h(sfaVar);
                }
            }
            strG = g();
            a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, strG, "updateMessages: " + i, null);
            }
            return sbiVar;
            List list3 = (List) objA;
            if (!list3.isEmpty()) {
                lja ljaVar = (lja) ((ny8) this.b).getValue();
                ljaVar.getClass();
                l8b l8bVar5 = new l8b(l8bVar2.e);
                long[] jArr = l8bVar2.b;
                Object[] objArr3 = l8bVar2.c;
                long[] jArr2 = l8bVar2.a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr2[i4];
                        long[] jArr3 = jArr2;
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    objArr2 = objArr3;
                                    long j2 = jArr[i8];
                                    hja hjaVar = (hja) objArr2[i8];
                                    l8bVar5.i(j2, hjaVar != null ? ljaVar.d(hjaVar) : null);
                                } else {
                                    objArr2 = objArr3;
                                }
                                j >>= i5;
                                i7++;
                                objArr3 = objArr2;
                                i5 = i5;
                                list3 = list3;
                            }
                            list = list3;
                            objArr = objArr3;
                            if (i6 != i5) {
                                break;
                            }
                        } else {
                            list = list3;
                            objArr = objArr3;
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                        jArr2 = jArr3;
                        objArr3 = objArr;
                        list3 = list;
                    }
                } else {
                    list = list3;
                }
                j44 j44VarE2 = e();
                long jF = ((s7f) c()).f();
                t7eVar.d = null;
                t7eVar.e = list;
                t7eVar.f = l8bVar5;
                t7eVar.i = 2;
                if (j44VarE2.d(l8bVar5, jF, t7eVar) != hu4Var) {
                    l8bVar3 = l8bVar5;
                    list2 = list;
                    i = 0;
                    while (r2.hasNext()) {
                        if (!cqk.d(sfaVar.E, (kja) l8bVar3.f(sfaVar.b))) {
                            i++;
                            h(sfaVar);
                        }
                    }
                    strG = g();
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4cVar.c(je9Var, strG, "updateMessages: " + i, null);
                    }
                }
                return hu4Var;
            }
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V(g(), "fail to updateMessage", new MessageReactionsUpdateException(th));
            return sbiVar;
        }
    }

    public void a() {
    }

    public void b() {
        synchronized (this.b) {
            try {
                pwi pwiVar = (pwi) this.c;
                if (pwiVar != null) {
                    ((o02) this.a).r(pwiVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public et3 c() {
        return (et3) ((ny8) this.c).getValue();
    }

    public Surface d() {
        throw new UnsupportedOperationException();
    }

    public j44 e() {
        return (j44) ((ny8) this.a).getValue();
    }

    public abstract int f();

    public abstract String g();

    public abstract void h(sfa sfaVar);

    public void i(Bitmap bitmap, oc7 oc7Var, lf4 lf4Var) {
        throw new UnsupportedOperationException();
    }

    public void j(int i, long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.an7
    public void k() {
        ((o02) this.a).q(new if5(3, this), true);
    }

    public void l(oc7 oc7Var) {
        throw new UnsupportedOperationException();
    }

    public abstract void m();

    public void n() {
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object o(long j, z5e z5eVar, nq4 nq4Var) {
        l7e l7eVar;
        sfa sfaVar;
        List list;
        je9 je9Var = je9.d;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof l7e) {
            l7eVar = (l7e) nq4Var;
            int i = l7eVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                l7eVar.i = i - Integer.MIN_VALUE;
            } else {
                l7eVar = new l7e(this, nq4Var);
            }
        } else {
            l7eVar = new l7e(this, nq4Var);
        }
        l7e l7eVar2 = l7eVar;
        Object objB = l7eVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = l7eVar2.i;
        if (i2 != 0) {
            if (i2 == 1) {
                j = l7eVar2.d;
                z5eVar = l7eVar2.e;
                ch3.d0(objB);
            } else {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sfaVar = l7eVar2.f;
                ch3.d0(objB);
            }
            h(sfaVar);
            return sbiVar;
        }
        ch3.d0(objB);
        String strG = g();
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, strG, zo5.j(j, "rollbackForAdd "), null);
        }
        j44 j44VarE = e();
        l7eVar2.e = z5eVar;
        l7eVar2.d = j;
        l7eVar2.i = 1;
        objB = j44VarE.b(j, l7eVar2);
        if (objB != hu4Var) {
        }
        return hu4Var;
        sfa sfaVar2 = (sfa) objB;
        if (sfaVar2 == null || sfaVar2.j == wja.DELETED) {
            return sbiVar;
        }
        kja kjaVar = sfaVar2.E;
        int i3 = kjaVar != null ? kjaVar.b : 0;
        z5e z5eVar2 = kjaVar != null ? kjaVar.c : null;
        ArrayList arrayList = (kjaVar == null || (list = kjaVar.a) == null) ? new ArrayList() : new ArrayList(list);
        if (z5eVar2 == null) {
            xr8.f(arrayList, z5eVar);
            i3++;
        } else {
            gm0.Y(g(), "rollback fail, no reaction");
            z5eVar = z5eVar2;
        }
        bx3.Y0(arrayList, d);
        kja kjaVar2 = new kja(arrayList, i3, z5eVar);
        String strG2 = g();
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, strG2, "updateMessageYourReaction: " + kjaVar2, null);
        }
        j44 j44VarE2 = e();
        long j2 = sfaVar2.b;
        long jF = ((s7f) c()).f();
        l7eVar2.e = null;
        l7eVar2.f = sfaVar2;
        l7eVar2.d = j;
        l7eVar2.i = 2;
        if (j44VarE2.h(j2, kjaVar2, jF, l7eVar2) != hu4Var) {
            sfaVar = sfaVar2;
            h(sfaVar);
            return sbiVar;
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public Object p(long j, dja djaVar, nq4 nq4Var) {
        m7e m7eVar;
        dja djaVar2;
        sfa sfaVar;
        List list;
        long j2 = j;
        je9 je9Var = je9.d;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof m7e) {
            m7eVar = (m7e) nq4Var;
            int i = m7eVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                m7eVar.i = i - Integer.MIN_VALUE;
            } else {
                m7eVar = new m7e(this, nq4Var);
            }
        } else {
            m7eVar = new m7e(this, nq4Var);
        }
        m7e m7eVar2 = m7eVar;
        Object objB = m7eVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = m7eVar2.i;
        if (i2 != 0) {
            if (i2 == 1) {
                j2 = m7eVar2.d;
                djaVar2 = m7eVar2.e;
                ch3.d0(objB);
            } else {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sfaVar = m7eVar2.f;
                ch3.d0(objB);
            }
            h(sfaVar);
            return sbiVar;
        }
        ch3.d0(objB);
        String strG = g();
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, strG, zo5.j(j2, "rollbackForRemove "), null);
        }
        j44 j44VarE = e();
        djaVar2 = djaVar;
        m7eVar2.e = djaVar2;
        m7eVar2.d = j2;
        m7eVar2.i = 1;
        objB = j44VarE.b(j2, m7eVar2);
        if (objB != hu4Var) {
        }
        return hu4Var;
        sfa sfaVar2 = (sfa) objB;
        if (sfaVar2 == null || sfaVar2.j == wja.DELETED) {
            return sbiVar;
        }
        kja kjaVar = sfaVar2.E;
        int i3 = kjaVar != null ? kjaVar.b : 0;
        z5e z5eVar = kjaVar != null ? kjaVar.c : null;
        ArrayList arrayList = (kjaVar == null || (list = kjaVar.a) == null) ? new ArrayList() : new ArrayList(list);
        if (z5eVar != null && cqk.d(z5eVar.b.a.toString(), djaVar2.b) && z5eVar.a.a == djaVar2.a.a) {
            xr8.h(arrayList, z5eVar);
            int i4 = i3 - 1;
            z5eVar = null;
            i3 = i4 < 0 ? 0 : i4;
        } else {
            gm0.Y(g(), "rollback fail, no reaction");
        }
        bx3.Y0(arrayList, d);
        kja kjaVar2 = new kja(arrayList, i3, z5eVar);
        String strG2 = g();
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, strG2, "updateMessageYourReaction: " + kjaVar2, null);
        }
        j44 j44VarE2 = e();
        long j3 = sfaVar2.b;
        long jF = ((s7f) c()).f();
        m7eVar2.e = null;
        m7eVar2.f = sfaVar2;
        m7eVar2.d = j2;
        m7eVar2.i = 2;
        if (j44VarE2.h(j3, kjaVar2, jF, m7eVar2) != hu4Var) {
            sfaVar = sfaVar2;
            h(sfaVar);
            return sbiVar;
        }
        return hu4Var;
    }

    public void q(oc7 oc7Var, boolean z) {
    }

    public void r(g7b g7bVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void s(md5 md5Var);

    public abstract void t();

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object u(long j, z5e z5eVar, nq4 nq4Var) {
        n7e n7eVar;
        sfa sfaVar;
        List list;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof n7e) {
            n7eVar = (n7e) nq4Var;
            int i = n7eVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                n7eVar.i = i - Integer.MIN_VALUE;
            } else {
                n7eVar = new n7e(this, nq4Var);
            }
        } else {
            n7eVar = new n7e(this, nq4Var);
        }
        n7e n7eVar2 = n7eVar;
        Object objF = n7eVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = n7eVar2.i;
        if (i2 == 0) {
            ch3.d0(objF);
            j44 j44VarE = e();
            n7eVar2.e = z5eVar;
            n7eVar2.d = j;
            n7eVar2.i = 1;
            objF = j44VarE.f(j, n7eVar2);
            if (objF != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            j = n7eVar2.d;
            z5eVar = n7eVar2.e;
            ch3.d0(objF);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sfaVar = n7eVar2.f;
            ch3.d0(objF);
        }
        h(sfaVar);
        return sbiVar;
        sfa sfaVar2 = (sfa) objF;
        if (sfaVar2 == null || sfaVar2.j == wja.DELETED) {
            return sbiVar;
        }
        kja kjaVar = sfaVar2.E;
        int i3 = kjaVar != null ? kjaVar.b : 0;
        z5e z5eVar2 = kjaVar != null ? kjaVar.c : null;
        ArrayList arrayList = (kjaVar == null || (list = kjaVar.a) == null) ? new ArrayList() : new ArrayList(list);
        if (z5eVar2 != null && cqk.d(z5eVar2.b, z5eVar.b) && z5eVar2.a == z5eVar.a) {
            xr8.h(arrayList, z5eVar2);
            int i4 = i3 - 1;
            i3 = i4 >= 0 ? i4 : 0;
            z5eVar2 = null;
        } else {
            gm0.Y(g(), "rollback fail, no reaction");
        }
        bx3.Y0(arrayList, d);
        kja kjaVar2 = new kja(arrayList, i3, z5eVar2);
        String strG = g();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, strG, "updateMessageYourReaction: " + kjaVar2, null);
            }
        }
        j44 j44VarE2 = e();
        long j2 = sfaVar2.b;
        long jF = ((s7f) c()).f();
        n7eVar2.e = null;
        n7eVar2.f = sfaVar2;
        n7eVar2.d = j;
        n7eVar2.i = 2;
        if (j44VarE2.h(j2, kjaVar2, jF, n7eVar2) != hu4Var) {
            sfaVar = sfaVar2;
            h(sfaVar);
            return sbiVar;
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public Object v(rt2 rt2Var, long j, int i, ArrayList arrayList, nq4 nq4Var) {
        r7e r7eVar;
        int i2;
        long j2;
        ArrayList arrayList2;
        sfa sfaVar;
        je9 je9Var = je9.d;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof r7e) {
            r7eVar = (r7e) nq4Var;
            int i3 = r7eVar.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r7eVar.j = i3 - Integer.MIN_VALUE;
            } else {
                r7eVar = new r7e(this, nq4Var);
            }
        } else {
            r7eVar = new r7e(this, nq4Var);
        }
        r7e r7eVar2 = r7eVar;
        Object objE = r7eVar2.h;
        hu4 hu4Var = hu4.a;
        int i4 = r7eVar2.j;
        if (i4 != 0) {
            if (i4 == 1) {
                i2 = r7eVar2.g;
                j2 = r7eVar2.f;
                arrayList2 = r7eVar2.d;
                ch3.d0(objE);
            } else {
                if (i4 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sfaVar = r7eVar2.e;
                ch3.d0(objE);
            }
            h(sfaVar);
            return sbiVar;
        }
        ch3.d0(objE);
        j44 j44VarE = e();
        r7eVar2.d = arrayList;
        r7eVar2.f = j;
        r7eVar2.g = i;
        r7eVar2.j = 1;
        objE = j44VarE.e(j, rt2Var, r7eVar2);
        if (objE != hu4Var) {
            i2 = i;
            j2 = j;
            arrayList2 = arrayList;
        }
        return hu4Var;
        sfa sfaVar2 = (sfa) objE;
        if (sfaVar2 != null && sfaVar2.j != wja.DELETED) {
            kja kjaVar = sfaVar2.E;
            kja kjaVar2 = new kja(arrayList2, i2, kjaVar != null ? kjaVar.c : null);
            if (!kjaVar2.equals(kjaVar)) {
                String strG = g();
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, strG, zo5.j(j2, "updateMessage: #"), null);
                }
                j44 j44VarE2 = e();
                long jF = ((s7f) c()).f();
                r7eVar2.d = null;
                r7eVar2.e = sfaVar2;
                r7eVar2.f = j2;
                r7eVar2.g = i2;
                r7eVar2.j = 2;
                if (j44VarE2.h(j2, kjaVar2, jF, r7eVar2) != hu4Var) {
                    sfaVar = sfaVar2;
                    h(sfaVar);
                    return sbiVar;
                }
                return hu4Var;
            }
            long j3 = j2;
            String strG2 = g();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, strG2, nbh.s(j3, "updateMessage: #", " no update needed"), null);
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object w(rt2 rt2Var, long j, hja hjaVar, nq4 nq4Var) {
        o7e o7eVar;
        if (nq4Var instanceof o7e) {
            o7eVar = (o7e) nq4Var;
            int i = o7eVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                o7eVar.h = i - Integer.MIN_VALUE;
            } else {
                o7eVar = new o7e(this, nq4Var);
            }
        } else {
            o7eVar = new o7e(this, nq4Var);
        }
        Object objE = o7eVar.f;
        int i2 = o7eVar.h;
        sbi sbiVar = sbi.a;
        Object obj = hu4.a;
        if (i2 == 0) {
            ch3.d0(objE);
            j44 j44VarE = e();
            o7eVar.d = hjaVar;
            o7eVar.e = j;
            o7eVar.h = 1;
            objE = j44VarE.e(j, rt2Var, o7eVar);
            if (objE != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objE);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = o7eVar.e;
        hjaVar = o7eVar.d;
        ch3.d0(objE);
        sfa sfaVar = (sfa) objE;
        if (sfaVar != null && sfaVar.j != wja.DELETED) {
            kja kjaVarD = ((lja) ((ny8) this.b).getValue()).d(hjaVar);
            o7eVar.d = null;
            o7eVar.e = j;
            o7eVar.h = 2;
            if (A(sfaVar, kjaVarD, o7eVar) == obj) {
                return obj;
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object x(rt2 rt2Var, long j, kja kjaVar, nq4 nq4Var) {
        p7e p7eVar;
        if (nq4Var instanceof p7e) {
            p7eVar = (p7e) nq4Var;
            int i = p7eVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                p7eVar.h = i - Integer.MIN_VALUE;
            } else {
                p7eVar = new p7e(this, nq4Var);
            }
        } else {
            p7eVar = new p7e(this, nq4Var);
        }
        Object objE = p7eVar.f;
        int i2 = p7eVar.h;
        sbi sbiVar = sbi.a;
        Object obj = hu4.a;
        if (i2 == 0) {
            ch3.d0(objE);
            j44 j44VarE = e();
            p7eVar.d = kjaVar;
            p7eVar.e = j;
            p7eVar.h = 1;
            objE = j44VarE.e(j, rt2Var, p7eVar);
            if (objE != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objE);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = p7eVar.e;
        kjaVar = p7eVar.d;
        ch3.d0(objE);
        sfa sfaVar = (sfa) objE;
        if (sfaVar != null && sfaVar.j != wja.DELETED) {
            p7eVar.d = null;
            p7eVar.e = j;
            p7eVar.h = 2;
            if (A(sfaVar, kjaVar, p7eVar) == obj) {
                return obj;
            }
        }
        return sbiVar;
    }

    public u7e(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }
}
