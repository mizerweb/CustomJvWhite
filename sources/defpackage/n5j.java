package defpackage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class n5j {
    public final Context a;
    public final et3 b;
    public final pvb c;
    public final rs6 d;
    public final tui e;
    public final String f = n5j.class.getName();
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final k5j j;

    public n5j(Context context, ite iteVar, et3 et3Var, pvb pvbVar, rs6 rs6Var, tui tuiVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = context;
        this.b = et3Var;
        this.c = pvbVar;
        this.d = rs6Var;
        this.e = tuiVar;
        this.g = ny8Var;
        this.h = ny8Var2;
        this.i = ny8Var3;
        this.j = new k5j(this, iteVar);
    }

    public static int d(d70 d70Var, e70 e70Var) {
        if (cqk.A(e70Var)) {
            return 4;
        }
        return d70Var.b == 2 ? 2 : 1;
    }

    public static long f(d70 d70Var, e70 e70Var) {
        return cqk.A(e70Var) ? e70Var.j.a : d70Var.a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae A[Catch: Exception -> 0x002d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0028, B:40:0x00dd, B:36:0x00ae), top: B:51:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(e70 e70Var, long j, long j2, nq4 nq4Var) throws Exception {
        l5j l5jVar;
        Object du6Var;
        hu4 hu4Var;
        if (nq4Var instanceof l5j) {
            l5jVar = (l5j) nq4Var;
            int i = l5jVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                l5jVar.f = i - Integer.MIN_VALUE;
            } else {
                l5jVar = new l5j(this, nq4Var);
            }
        } else {
            l5jVar = new l5j(this, nq4Var);
        }
        Object objN = l5jVar.d;
        int i2 = l5jVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(objN);
                boolean zH = e70Var.h();
                boolean zA = cqk.A(e70Var);
                String str = this.f;
                if (zH || zA) {
                    String strE = e(e70Var);
                    if (strE != null && strE.length() != 0) {
                        du6Var = new dc9(this.a, strE);
                    } else if (zH) {
                        gm0.n(str, "Fetch video. Build fetcher: internal video");
                        d70 d70Var = e70Var.d;
                        du6Var = new rk8(this.c, d70Var.a, j, j2, d70Var.o);
                    } else if (zA) {
                        gm0.n(str, "Fetch video. Build fetcher: video file");
                        du6Var = new du6((e5d) this.i.getValue(), this.c, e70Var.j.a, j, j2);
                    } else {
                        gm0.Y(str, "Fetch video. Build fetcher: unknown type! null");
                    }
                    if (du6Var == null) {
                        gm0.n(str, "Fetch video. Fetcher is null");
                        return null;
                    }
                    j3 j3Var = new j3(e9i.J0(new bye(new p7g(du6Var, (lq4) null, 26)), qe7.P(30L, lw5.SECONDS)), 15, new y33(this, null, 1));
                    l5jVar.f = 1;
                    objN = e9i.N(j3Var, l5jVar);
                    hu4Var = hu4.a;
                    if (objN == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    gm0.Y(str, "Fetch video. Build fetcher: can't fetch because don't have video");
                }
                du6Var = null;
                if (du6Var == null) {
                    gm0.n(str, "Fetch video. Fetcher is null");
                    return null;
                }
                j3 j3Var2 = new j3(e9i.J0(new bye(new p7g(du6Var, (lq4) null, 26)), qe7.P(30L, lw5.SECONDS)), 15, new y33(this, null, 1));
                l5jVar.f = 1;
                objN = e9i.N(j3Var2, l5jVar);
                hu4Var = hu4.a;
                if (objN == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objN);
            }
            return (dp6) objN;
        } catch (Exception e) {
            if (!((e instanceof TamErrorException) && p90.C(((TamErrorException) e).a.b)) && (e instanceof CancellationException)) {
                throw e;
            }
            return null;
        }
    }

    public final void b(long j, String str, List list) {
        k5j k5jVar = this.j;
        k5jVar.getClass();
        if (list.isEmpty()) {
            gm0.Y(k5j.class.getName(), "Early return in prefetch because of empty messageIds");
        } else {
            yab.i0(k5jVar.a, null, 0, new f1j(k5jVar, j, str, list, null, 16), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x026a  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code duplicated, block: B:95:0x021c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x021e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0233 A[LOOP:3: B:97:0x022d->B:99:0x0233, LOOP_END] */
    public final Object c(e70 e70Var, long j, long j2, boolean z, nq4 nq4Var) throws Exception {
        m5j m5jVar;
        long j3;
        boolean z2;
        e70 e70Var2;
        long j4;
        d70 d70Var;
        rui w2bVar;
        Object next;
        Object next2;
        ArrayList arrayList;
        je9 je9Var = je9.d;
        if (nq4Var instanceof m5j) {
            m5jVar = (m5j) nq4Var;
            int i = m5jVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                m5jVar.j = i - Integer.MIN_VALUE;
            } else {
                m5jVar = new m5j(this, nq4Var);
            }
        } else {
            m5jVar = new m5j(this, nq4Var);
        }
        m5j m5jVar2 = m5jVar;
        Object objA = m5jVar2.h;
        Object obj = hu4.a;
        int i2 = m5jVar2.j;
        if (i2 == 0) {
            ch3.d0(objA);
            String str = this.f;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                j3 = j;
                StringBuilder sbS = qt4.s(j3, "Fetch video. Start fetch, getVideoContent chatServerId=", ", messageServerId=");
                sbS.append(j2);
                a4cVar.c(je9Var, str, sbS.toString(), null);
            } else {
                j3 = j;
            }
            d70 d70Var2 = cqk.A(e70Var) ? e70Var.j.d.d : e70Var.d;
            if (d70Var2.h && d70Var2.m > ((s7f) this.b).f()) {
                gm0.n(this.f, "Fetch video. Live stream not started");
                return null;
            }
            gm0.m(this.f, "Fetch video. Check local path, getVideoContent: local path = %s", e(e70Var));
            rui ruiVarA = this.e.a(e70Var.t);
            if (ruiVarA != null) {
                return ruiVarA;
            }
            m5jVar2.d = e70Var;
            m5jVar2.e = d70Var2;
            m5jVar2.f = j2;
            z2 = z;
            m5jVar2.g = z2;
            m5jVar2.j = 1;
            objA = a(e70Var, j3, j2, m5jVar2);
            if (objA == obj) {
                return obj;
            }
            e70Var2 = e70Var;
            j4 = j2;
            d70Var = d70Var2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = m5jVar2.g;
            j4 = m5jVar2.f;
            d70Var = m5jVar2.e;
            e70Var2 = m5jVar2.d;
            ch3.d0(objA);
            z2 = z3;
        }
        dp6 dp6Var = (dp6) objA;
        if (dp6Var != null) {
            List list = dp6Var.a;
            if (list.isEmpty()) {
                w2bVar = null;
            } else {
                b70 b70Var = d70Var.n;
                boolean z4 = b70Var != null && b70Var.e;
                List list2 = list;
                Iterator it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((cp6) next).a != 2);
                cp6 cp6Var = (cp6) next;
                if (cp6Var == null || z2) {
                    Iterator it2 = list2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (((cp6) next2).a != 1);
                    cp6 cp6Var2 = (cp6) next2;
                    if (cp6Var2 == null || z2) {
                        ArrayList<cp6> arrayList2 = new ArrayList();
                        for (Object obj2 : list2) {
                            if (((cp6) obj2).a == 3) {
                                arrayList2.add(obj2);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            arrayList2 = null;
                        }
                        if (arrayList2 != null && !arrayList2.isEmpty() && b70Var != null) {
                            float f = b70Var.b;
                            if (f > 0.0f) {
                                cp6 cp6Var3 = (cp6) ww3.r1(arrayList2);
                                String str2 = cp6Var3.b;
                                long j5 = cp6Var3.f;
                                v2b v2bVar = new v2b(cp6Var3.c, str2, cp6Var3.d, cp6Var3.e);
                                if (j4 > 0 || Math.abs(j5 - d70Var.c) <= 50) {
                                    w2bVar = new w2b(Collections.singletonList(v2bVar), d70Var.p, f(d70Var, e70Var2), d70Var.c, z4, d70Var.f, d70Var.g, d(d70Var, e70Var2), dp6Var.b);
                                } else {
                                    float f2 = j5;
                                    w2bVar = new c5i(v2bVar, (long) (b70Var.a * f2), (long) (f * f2), z4, d(d70Var, e70Var2));
                                }
                            } else if (arrayList2 != null) {
                                arrayList = new ArrayList(yw3.W0(arrayList2, 10));
                                for (cp6 cp6Var4 : arrayList2) {
                                    arrayList.add(new v2b(cp6Var4.c, cp6Var4.b, cp6Var4.d, cp6Var4.e));
                                }
                                w2bVar = new w2b(arrayList, d70Var.p, f(d70Var, e70Var2), d70Var.c, z4, d70Var.f, d70Var.g, d(d70Var, e70Var2), dp6Var.b);
                            } else {
                                w2bVar = null;
                            }
                        } else if (arrayList2 != null) {
                            arrayList = new ArrayList(yw3.W0(arrayList2, 10));
                            while (r1.hasNext()) {
                                arrayList.add(new v2b(cp6Var4.c, cp6Var4.b, cp6Var4.d, cp6Var4.e));
                            }
                            w2bVar = new w2b(arrayList, d70Var.p, f(d70Var, e70Var2), d70Var.c, z4, d70Var.f, d70Var.g, d(d70Var, e70Var2), dp6Var.b);
                        } else {
                            w2bVar = null;
                        }
                    } else {
                        w2bVar = new iy7(cp6Var2.b, d70Var.p, f(d70Var, e70Var2), d70Var.c, d70Var.m, d70Var.h, z4, d70Var.f, d70Var.g, d(d70Var, e70Var2), dp6Var.b);
                    }
                } else {
                    w2bVar = new y15(cp6Var.b, d70Var.p, f(d70Var, e70Var2), d70Var.c, d70Var.m, d70Var.h, z4, d70Var.f, d70Var.g, d(d70Var, e70Var2), dp6Var.b);
                }
            }
        } else {
            w2bVar = null;
        }
        if (w2bVar != null) {
            this.e.b(e70Var2.t, w2bVar);
        }
        String str3 = this.f;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str3, "Fetch video. Finish fetch, getVideoContent: processFetchResult for videoContent " + w2bVar, null);
        }
        return w2bVar;
    }

    public final String e(e70 e70Var) {
        long j;
        boolean zA = cqk.A(e70Var);
        boolean zH = e70Var.h();
        String str = e70Var.u;
        if (zH) {
            j = e70Var.d.a;
        } else {
            if (!zA) {
                str = "";
            }
            j = 0;
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        if (ku6.o(new File(str))) {
            return str;
        }
        if (j == 0) {
            return null;
        }
        boolean zI = e70Var.i();
        rs6 rs6Var = this.d;
        File fileU = zI ? ((ju6) rs6Var).u(j) : ((ju6) rs6Var).v(j);
        if (ku6.o(fileU)) {
            return fileU.getAbsolutePath();
        }
        return null;
    }
}
