package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes.dex */
public final class th5 {
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;
    public List e;
    public Object f;
    public Object g;
    public Object h;

    public static final void a(th5 th5Var, qxe qxeVar) throws Throwable {
        Object poeVar;
        pic picVar = (pic) th5Var.d;
        f(qxeVar);
        l35 l35Var = (l35) th5Var.c;
        if (l35Var.g == 3) {
            n1g.u(qxeVar, "PRAGMA journal_mode = WAL");
        } else {
            n1g.u(qxeVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (l35Var.g == 3) {
            n1g.u(qxeVar, "PRAGMA synchronous = NORMAL");
        } else {
            n1g.u(qxeVar, "PRAGMA synchronous = FULL");
        }
        vxe vxeVarO0 = qxeVar.O0("PRAGMA user_version");
        try {
            vxeVarO0.M0();
            int i = (int) vxeVarO0.getLong(0);
            p90.f(vxeVarO0, null);
            int i2 = picVar.a;
            if (i != i2) {
                n1g.u(qxeVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        th5Var.j(qxeVar);
                    } else {
                        th5Var.k(qxeVar, i, i2);
                    }
                    n1g.u(qxeVar, "PRAGMA user_version = " + i2);
                    poeVar = sbi.a;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                if (!(poeVar instanceof poe)) {
                    n1g.u(qxeVar, "END TRANSACTION");
                }
                Throwable thA = roe.a(poeVar);
                if (thA != null) {
                    n1g.u(qxeVar, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            th5Var.l(qxeVar);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                p90.f(vxeVarO0, th2);
                throw th3;
            }
        }
    }

    public static void f(qxe qxeVar) {
        vxe vxeVarO0 = qxeVar.O0("PRAGMA busy_timeout");
        try {
            vxeVarO0.M0();
            long j = vxeVarO0.getLong(0);
            p90.f(vxeVarO0, null);
            if (j < CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS) {
                n1g.u(qxeVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p90.f(vxeVarO0, th);
                throw th2;
            }
        }
    }

    public void b(uh5 uh5Var, int i, ArrayList arrayList, rwe rweVar) {
        zvj zvjVar = uh5Var.d;
        rwe rweVar2 = zvjVar.c;
        uh5 uh5Var2 = zvjVar.i;
        uh5 uh5Var3 = zvjVar.h;
        if (rweVar2 == null) {
            ig4 ig4Var = (ig4) this.c;
            if (zvjVar == ig4Var.d || zvjVar == ig4Var.e) {
                return;
            }
            if (rweVar == null) {
                rweVar = new rwe(zvjVar);
                arrayList.add(rweVar);
            }
            zvjVar.c = rweVar;
            rweVar.a(zvjVar);
            for (qh5 qh5Var : uh5Var3.k) {
                if (qh5Var instanceof uh5) {
                    b((uh5) qh5Var, i, arrayList, rweVar);
                }
            }
            for (qh5 qh5Var2 : uh5Var2.k) {
                if (qh5Var2 instanceof uh5) {
                    b((uh5) qh5Var2, i, arrayList, rweVar);
                }
            }
            if (i == 1 && (zvjVar instanceof bti)) {
                for (qh5 qh5Var3 : ((bti) zvjVar).k.k) {
                    if (qh5Var3 instanceof uh5) {
                        b((uh5) qh5Var3, i, arrayList, rweVar);
                    }
                }
            }
            Iterator it = uh5Var3.l.iterator();
            while (it.hasNext()) {
                b((uh5) it.next(), i, arrayList, rweVar);
            }
            Iterator it2 = uh5Var2.l.iterator();
            while (it2.hasNext()) {
                b((uh5) it2.next(), i, arrayList, rweVar);
            }
            if (i == 1 && (zvjVar instanceof bti)) {
                Iterator it3 = ((bti) zvjVar).k.l.iterator();
                while (it3.hasNext()) {
                    b((uh5) it3.next(), i, arrayList, rweVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:102:0x01be  */
    /* JADX WARN: Code duplicated, block: B:105:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:114:0x021a  */
    /* JADX WARN: Code duplicated, block: B:123:0x025d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0303  */
    /* JADX WARN: Code duplicated, block: B:149:0x0315  */
    /* JADX WARN: Code duplicated, block: B:150:0x0328  */
    /* JADX WARN: Code duplicated, block: B:156:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0226 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0268 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x000a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a4 A[ADDED_TO_REGION] */
    public void c(ig4 ig4Var) {
        int i;
        int iO;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f;
        int i16;
        int i17;
        ArrayList<hg4> arrayList = ig4Var.p0;
        int[] iArr = ig4Var.o0;
        for (hg4 hg4Var : arrayList) {
            int[] iArr2 = hg4Var.o0;
            of4[] of4VarArr = hg4Var.P;
            of4 of4Var = hg4Var.K;
            of4 of4Var2 = hg4Var.I;
            of4 of4Var3 = hg4Var.J;
            of4 of4Var4 = hg4Var.H;
            int i18 = iArr2[0];
            int i19 = iArr2[1];
            if (hg4Var.f0 == 8) {
                hg4Var.a = true;
            } else {
                float f2 = hg4Var.w;
                if (f2 < 1.0f && i18 == 3) {
                    hg4Var.r = 2;
                }
                float f3 = hg4Var.z;
                if (f3 < 1.0f && i19 == 3) {
                    hg4Var.s = 2;
                }
                if (hg4Var.V > 0.0f) {
                    if (i18 == 3 && (i19 == 2 || i19 == 1)) {
                        hg4Var.r = 3;
                    } else if (i19 == 3 && (i18 == 2 || i18 == 1)) {
                        hg4Var.s = 3;
                    } else if (i18 == 3 && i19 == 3) {
                        if (hg4Var.r == 0) {
                            hg4Var.r = 3;
                        }
                        if (hg4Var.s == 0) {
                            hg4Var.s = 3;
                        }
                    }
                }
                if (i18 == 3 && hg4Var.r == 1 && (of4Var4.f == null || of4Var3.f == null)) {
                    i18 = 2;
                }
                if (i19 == 3 && hg4Var.s == 1 && (of4Var2.f == null || of4Var.f == null)) {
                    i19 = 2;
                }
                cz7 cz7Var = hg4Var.d;
                cz7Var.d = i18;
                int i20 = hg4Var.r;
                cz7Var.a = i20;
                bti btiVar = hg4Var.e;
                btiVar.d = i19;
                int i21 = hg4Var.s;
                btiVar.a = i21;
                if (i18 == 4 || i18 == 1) {
                    if (i19 == 4) {
                        if (i19 != 1) {
                            i5 = 2;
                            if (i19 != 2) {
                                if (i18 != 3) {
                                    i6 = i19;
                                    i7 = 1;
                                } else if (i19 == i5 && i19 != 1) {
                                    i6 = i19;
                                    i8 = 3;
                                    i7 = 1;
                                    if (i6 != i8) {
                                        i9 = i6;
                                        i10 = i5;
                                        i11 = 1;
                                        i12 = i18;
                                    } else if (i18 == i5 && i18 != i7) {
                                        i13 = i8;
                                        i9 = i6;
                                        i10 = i5;
                                        i11 = 1;
                                        i12 = i18;
                                        if (i12 != i13 && i9 == i13) {
                                            if (i20 == i11 || i21 == i11) {
                                                h(i10, 0, i10, 0, hg4Var);
                                                hg4Var.d.e.m = hg4Var.o();
                                                hg4Var.e.e.m = hg4Var.i();
                                            } else if (i21 == 2 && i20 == 2 && iArr[0] == i7 && iArr[i11] == i7) {
                                                h(i7, (int) ((f2 * ig4Var.o()) + 0.5f), i7, (int) ((f3 * ig4Var.i()) + 0.5f), hg4Var);
                                                hg4Var.d.e.d(hg4Var.o());
                                                hg4Var.e.e.d(hg4Var.i());
                                                hg4Var.a = true;
                                            }
                                        }
                                    } else if (i21 == i8) {
                                        if (i18 == i5) {
                                            h(i5, 0, i5, 0, hg4Var);
                                        }
                                        int iO2 = hg4Var.o();
                                        f = hg4Var.V;
                                        if (hg4Var.W == -1) {
                                            f = 1.0f / f;
                                        }
                                        h(i7, iO2, i7, (int) ((iO2 * f) + 0.5f), hg4Var);
                                        hg4Var.d.e.d(hg4Var.o());
                                        hg4Var.e.e.d(hg4Var.i());
                                        hg4Var.a = true;
                                    } else {
                                        i9 = i6;
                                        i7 = i7;
                                        i14 = i5;
                                        if (i21 == 1) {
                                            h(i18, 0, i14, 0, hg4Var);
                                            hg4Var.e.e.m = hg4Var.i();
                                        } else {
                                            i12 = i18;
                                            if (i21 == 2) {
                                                i15 = iArr[1];
                                                if (i15 != i7 || i15 == 4) {
                                                    h(i12, hg4Var.o(), i7, (int) ((f3 * ig4Var.i()) + 0.5f), hg4Var);
                                                    hg4Var.d.e.d(hg4Var.o());
                                                    hg4Var.e.e.d(hg4Var.i());
                                                    hg4Var.a = true;
                                                } else {
                                                    i10 = i14;
                                                    i11 = 1;
                                                }
                                            } else if (of4VarArr[2].f != null || of4VarArr[3].f == null) {
                                                h(i14, 0, i9, 0, hg4Var);
                                                hg4Var.d.e.d(hg4Var.o());
                                                hg4Var.e.e.d(hg4Var.i());
                                                hg4Var.a = true;
                                            } else {
                                                i10 = i14;
                                                i11 = 1;
                                            }
                                        }
                                    }
                                    i13 = 3;
                                    if (i12 != i13) {
                                    }
                                } else if (i20 == 3) {
                                    if (i19 == i5) {
                                        h(i5, 0, i5, 0, hg4Var);
                                    }
                                    int i22 = hg4Var.i();
                                    h(1, (int) ((i22 * hg4Var.V) + 0.5f), 1, i22, hg4Var);
                                    hg4Var.d.e.d(hg4Var.o());
                                    hg4Var.e.e.d(hg4Var.i());
                                    hg4Var.a = true;
                                } else {
                                    i16 = i5;
                                    if (i20 == 1) {
                                        h(i16, 0, i19, 0, hg4Var);
                                        hg4Var.d.e.m = hg4Var.o();
                                    } else {
                                        i5 = i16;
                                        if (i20 == 2) {
                                            i17 = iArr[0];
                                            if (i17 != 1 || i17 == 4) {
                                                h(1, (int) ((f2 * ig4Var.o()) + 0.5f), i19, hg4Var.i(), hg4Var);
                                                hg4Var.d.e.d(hg4Var.o());
                                                hg4Var.e.e.d(hg4Var.i());
                                                hg4Var.a = true;
                                            } else {
                                                i7 = 1;
                                                i6 = i19;
                                            }
                                        } else {
                                            i7 = 1;
                                            i6 = i19;
                                            if (of4VarArr[0].f != null || of4VarArr[1].f == null) {
                                                h(i5, 0, i6, 0, hg4Var);
                                                hg4Var.d.e.d(hg4Var.o());
                                                hg4Var.e.e.d(hg4Var.i());
                                                hg4Var.a = true;
                                            }
                                        }
                                    }
                                }
                                i8 = 3;
                                if (i6 != i8) {
                                    if (i18 == i5) {
                                    }
                                    if (i21 == i8) {
                                        if (i18 == i5) {
                                            h(i5, 0, i5, 0, hg4Var);
                                        }
                                        int iO3 = hg4Var.o();
                                        f = hg4Var.V;
                                        if (hg4Var.W == -1) {
                                            f = 1.0f / f;
                                        }
                                        h(i7, iO3, i7, (int) ((iO3 * f) + 0.5f), hg4Var);
                                        hg4Var.d.e.d(hg4Var.o());
                                        hg4Var.e.e.d(hg4Var.i());
                                        hg4Var.a = true;
                                    } else {
                                        i9 = i6;
                                        i7 = i7;
                                        i14 = i5;
                                        if (i21 == 1) {
                                            h(i18, 0, i14, 0, hg4Var);
                                            hg4Var.e.e.m = hg4Var.i();
                                        } else {
                                            i12 = i18;
                                            if (i21 == 2) {
                                                i15 = iArr[1];
                                                if (i15 != i7) {
                                                }
                                                h(i12, hg4Var.o(), i7, (int) ((f3 * ig4Var.i()) + 0.5f), hg4Var);
                                                hg4Var.d.e.d(hg4Var.o());
                                                hg4Var.e.e.d(hg4Var.i());
                                                hg4Var.a = true;
                                            } else {
                                                if (of4VarArr[2].f != null) {
                                                }
                                                h(i14, 0, i9, 0, hg4Var);
                                                hg4Var.d.e.d(hg4Var.o());
                                                hg4Var.e.e.d(hg4Var.i());
                                                hg4Var.a = true;
                                            }
                                        }
                                    }
                                } else {
                                    i9 = i6;
                                    i10 = i5;
                                    i11 = 1;
                                    i12 = i18;
                                }
                                i13 = 3;
                                if (i12 != i13) {
                                }
                            }
                        } else {
                            i = 1;
                        }
                        iO = hg4Var.o();
                        if (i18 == 4) {
                            iO = (ig4Var.o() - of4Var4.g) - of4Var3.g;
                            i18 = i;
                        }
                        i2 = hg4Var.i();
                        if (i19 == 4) {
                            i3 = (ig4Var.i() - of4Var2.g) - of4Var.g;
                            i4 = i;
                        } else {
                            i3 = i2;
                            i4 = i19;
                        }
                        h(i18, iO, i4, i3, hg4Var);
                        hg4Var.d.e.d(hg4Var.o());
                        hg4Var.e.e.d(hg4Var.i());
                        hg4Var.a = true;
                    }
                    i = 1;
                    iO = hg4Var.o();
                    if (i18 == 4) {
                        iO = (ig4Var.o() - of4Var4.g) - of4Var3.g;
                        i18 = i;
                    }
                    i2 = hg4Var.i();
                    if (i19 == 4) {
                        i3 = (ig4Var.i() - of4Var2.g) - of4Var.g;
                        i4 = i;
                    } else {
                        i3 = i2;
                        i4 = i19;
                    }
                    h(i18, iO, i4, i3, hg4Var);
                    hg4Var.d.e.d(hg4Var.o());
                    hg4Var.e.e.d(hg4Var.i());
                    hg4Var.a = true;
                } else {
                    i5 = 2;
                    if (i18 == 2) {
                        if (i19 == 4) {
                            if (i19 != 1) {
                                i5 = 2;
                                if (i19 != 2) {
                                }
                            } else {
                                i = 1;
                            }
                            iO = hg4Var.o();
                            if (i18 == 4) {
                                iO = (ig4Var.o() - of4Var4.g) - of4Var3.g;
                                i18 = i;
                            }
                            i2 = hg4Var.i();
                            if (i19 == 4) {
                                i3 = (ig4Var.i() - of4Var2.g) - of4Var.g;
                                i4 = i;
                            } else {
                                i3 = i2;
                                i4 = i19;
                            }
                            h(i18, iO, i4, i3, hg4Var);
                            hg4Var.d.e.d(hg4Var.o());
                            hg4Var.e.e.d(hg4Var.i());
                            hg4Var.a = true;
                        }
                        i = 1;
                        iO = hg4Var.o();
                        if (i18 == 4) {
                            iO = (ig4Var.o() - of4Var4.g) - of4Var3.g;
                            i18 = i;
                        }
                        i2 = hg4Var.i();
                        if (i19 == 4) {
                            i3 = (ig4Var.i() - of4Var2.g) - of4Var.g;
                            i4 = i;
                        } else {
                            i3 = i2;
                            i4 = i19;
                        }
                        h(i18, iO, i4, i3, hg4Var);
                        hg4Var.d.e.d(hg4Var.o());
                        hg4Var.e.e.d(hg4Var.i());
                        hg4Var.a = true;
                    }
                    if (i18 != 3) {
                        if (i19 == i5) {
                        }
                        if (i20 == 3) {
                            if (i19 == i5) {
                                h(i5, 0, i5, 0, hg4Var);
                            }
                            int i23 = hg4Var.i();
                            h(1, (int) ((i23 * hg4Var.V) + 0.5f), 1, i23, hg4Var);
                            hg4Var.d.e.d(hg4Var.o());
                            hg4Var.e.e.d(hg4Var.i());
                            hg4Var.a = true;
                        } else {
                            i16 = i5;
                            if (i20 == 1) {
                                h(i16, 0, i19, 0, hg4Var);
                                hg4Var.d.e.m = hg4Var.o();
                            } else {
                                i5 = i16;
                                if (i20 == 2) {
                                    i17 = iArr[0];
                                    if (i17 != 1) {
                                    }
                                    h(1, (int) ((f2 * ig4Var.o()) + 0.5f), i19, hg4Var.i(), hg4Var);
                                    hg4Var.d.e.d(hg4Var.o());
                                    hg4Var.e.e.d(hg4Var.i());
                                    hg4Var.a = true;
                                } else {
                                    i7 = 1;
                                    i6 = i19;
                                    if (of4VarArr[0].f != null) {
                                    }
                                    h(i5, 0, i6, 0, hg4Var);
                                    hg4Var.d.e.d(hg4Var.o());
                                    hg4Var.e.e.d(hg4Var.i());
                                    hg4Var.a = true;
                                }
                            }
                        }
                    } else {
                        i6 = i19;
                        i7 = 1;
                    }
                    i8 = 3;
                    if (i6 != i8) {
                        if (i18 == i5) {
                        }
                        if (i21 == i8) {
                            if (i18 == i5) {
                                h(i5, 0, i5, 0, hg4Var);
                            }
                            int iO4 = hg4Var.o();
                            f = hg4Var.V;
                            if (hg4Var.W == -1) {
                                f = 1.0f / f;
                            }
                            h(i7, iO4, i7, (int) ((iO4 * f) + 0.5f), hg4Var);
                            hg4Var.d.e.d(hg4Var.o());
                            hg4Var.e.e.d(hg4Var.i());
                            hg4Var.a = true;
                        } else {
                            i9 = i6;
                            i7 = i7;
                            i14 = i5;
                            if (i21 == 1) {
                                h(i18, 0, i14, 0, hg4Var);
                                hg4Var.e.e.m = hg4Var.i();
                            } else {
                                i12 = i18;
                                if (i21 == 2) {
                                    i15 = iArr[1];
                                    if (i15 != i7) {
                                    }
                                    h(i12, hg4Var.o(), i7, (int) ((f3 * ig4Var.i()) + 0.5f), hg4Var);
                                    hg4Var.d.e.d(hg4Var.o());
                                    hg4Var.e.e.d(hg4Var.i());
                                    hg4Var.a = true;
                                } else {
                                    if (of4VarArr[2].f != null) {
                                    }
                                    h(i14, 0, i9, 0, hg4Var);
                                    hg4Var.d.e.d(hg4Var.o());
                                    hg4Var.e.e.d(hg4Var.i());
                                    hg4Var.a = true;
                                }
                            }
                        }
                    } else {
                        i9 = i6;
                        i10 = i5;
                        i11 = 1;
                        i12 = i18;
                    }
                    i13 = 3;
                    if (i12 != i13) {
                    }
                }
            }
        }
    }

    public void d() {
        ig4 ig4Var = (ig4) this.c;
        ArrayList arrayList = (ArrayList) this.f;
        ArrayList<zvj> arrayList2 = (ArrayList) this.e;
        arrayList2.clear();
        ig4 ig4Var2 = (ig4) this.d;
        ig4Var2.d.f();
        ig4Var2.e.f();
        arrayList2.add(ig4Var2.d);
        arrayList2.add(ig4Var2.e);
        HashSet hashSet = null;
        for (hg4 hg4Var : ig4Var2.p0) {
            if (hg4Var instanceof or7) {
                arrayList2.add(new pr7((or7) hg4Var));
            } else {
                if (hg4Var.v()) {
                    if (hg4Var.b == null) {
                        hg4Var.b = new wo2(hg4Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(hg4Var.b);
                } else {
                    arrayList2.add(hg4Var.d);
                }
                if (hg4Var.w()) {
                    if (hg4Var.c == null) {
                        hg4Var.c = new wo2(hg4Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(hg4Var.c);
                } else {
                    arrayList2.add(hg4Var.e);
                }
                if (hg4Var instanceof tp0) {
                    arrayList2.add(new xu7(hg4Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((zvj) it.next()).f();
        }
        for (zvj zvjVar : arrayList2) {
            if (zvjVar.b != ig4Var2) {
                zvjVar.d();
            }
        }
        arrayList.clear();
        g(ig4Var.d, 0, arrayList);
        g(ig4Var.e, 1, arrayList);
        this.a = false;
    }

    public int e(ig4 ig4Var, int i) {
        ArrayList arrayList = (ArrayList) this.f;
        int size = arrayList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, ((rwe) arrayList.get(i2)).b(ig4Var, i));
        }
        return (int) jMax;
    }

    public void g(zvj zvjVar, int i, ArrayList arrayList) {
        uh5 uh5Var = zvjVar.h;
        uh5 uh5Var2 = zvjVar.i;
        for (qh5 qh5Var : uh5Var.k) {
            if (qh5Var instanceof uh5) {
                b((uh5) qh5Var, i, arrayList, null);
            } else if (qh5Var instanceof zvj) {
                b(((zvj) qh5Var).h, i, arrayList, null);
            }
        }
        for (qh5 qh5Var2 : uh5Var2.k) {
            if (qh5Var2 instanceof uh5) {
                b((uh5) qh5Var2, i, arrayList, null);
            } else if (qh5Var2 instanceof zvj) {
                b(((zvj) qh5Var2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (qh5 qh5Var3 : ((bti) zvjVar).k.k) {
                if (qh5Var3 instanceof uh5) {
                    b((uh5) qh5Var3, i, arrayList, null);
                }
            }
        }
    }

    public void h(int i, int i2, int i3, int i4, hg4 hg4Var) {
        mt0 mt0Var = (mt0) this.h;
        mt0Var.a = i;
        mt0Var.b = i3;
        mt0Var.c = i2;
        mt0Var.d = i4;
        ((vf4) this.g).b(hg4Var, mt0Var);
        hg4Var.K(mt0Var.e);
        hg4Var.H(mt0Var.f);
        hg4Var.E = mt0Var.h;
        int i5 = mt0Var.g;
        hg4Var.Z = i5;
        hg4Var.E = i5 > 0;
    }

    public void i() {
        th5 th5Var;
        gt0 gt0Var;
        for (hg4 hg4Var : ((ig4) this.c).p0) {
            if (!hg4Var.a) {
                int[] iArr = hg4Var.o0;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = hg4Var.r;
                int i4 = hg4Var.s;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                xl5 xl5Var = hg4Var.d.e;
                boolean z3 = xl5Var.j;
                xl5 xl5Var2 = hg4Var.e.e;
                boolean z4 = xl5Var2.j;
                boolean z5 = z2;
                if (z3 && z4) {
                    th5Var = this;
                    th5Var.h(1, xl5Var.g, 1, xl5Var2.g, hg4Var);
                    hg4Var.a = true;
                } else if (z3 && z) {
                    th5Var = this;
                    th5Var.h(1, xl5Var.g, 2, xl5Var2.g, hg4Var);
                    bti btiVar = hg4Var.e;
                    if (i2 == 3) {
                        btiVar.e.m = hg4Var.i();
                    } else {
                        btiVar.e.d(hg4Var.i());
                        hg4Var.a = true;
                    }
                } else {
                    th5Var = this;
                    if (z4 && z5) {
                        th5Var.h(2, xl5Var.g, 1, xl5Var2.g, hg4Var);
                        cz7 cz7Var = hg4Var.d;
                        if (i == 3) {
                            cz7Var.e.m = hg4Var.o();
                        } else {
                            cz7Var.e.d(hg4Var.o());
                            hg4Var.a = true;
                        }
                    }
                }
                if (hg4Var.a && (gt0Var = hg4Var.e.l) != null) {
                    gt0Var.d(hg4Var.Z);
                }
                this = th5Var;
            }
        }
    }

    public void j(qxe qxeVar) {
        pic picVar = (pic) this.d;
        vxe vxeVarO0 = qxeVar.O0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (vxeVarO0.M0() && vxeVarO0.getLong(0) == 0) {
                z = true;
            }
            p90.f(vxeVarO0, null);
            picVar.a(qxeVar);
            if (!z) {
                pse pseVarV = picVar.v(qxeVar);
                if (!pseVarV.b) {
                    qr7.z(pseVarV.a, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            n1g.u(qxeVar, fol.a((String) picVar.b));
            picVar.r();
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((qre) it.next()).getClass();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p90.f(vxeVarO0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    public void k(qxe qxeVar, int i, int i2) {
        boolean z;
        pic picVar = (pic) this.d;
        l35 l35Var = (l35) this.c;
        List listW = tre.W(l35Var.d, i, i2);
        if (listW != null) {
            picVar.u(qxeVar);
            Iterator it = listW.iterator();
            while (it.hasNext()) {
                ((zxa) it.next()).b(qxeVar);
            }
            pse pseVarV = picVar.v(qxeVar);
            if (!pseVarV.b) {
                qr7.z(pseVarV.a, "Migration didn't properly handle: ");
                return;
            }
            picVar.t();
            n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            n1g.u(qxeVar, fol.a((String) picVar.b));
            return;
        }
        if (i <= i2 || !l35Var.l) {
            Set set = l35Var.m;
            if (!l35Var.k || (set != null && set.contains(Integer.valueOf(i)))) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (z) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (l35Var.p) {
            vxe vxeVarO0 = qxeVar.O0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                c79 c79VarW = yab.w();
                while (vxeVarO0.M0()) {
                    String strB0 = vxeVarO0.B0(0);
                    if (!z5h.K0(strB0, "sqlite_", false) && !strB0.equals("android_metadata")) {
                        c79VarW.add(new ylc(strB0, Boolean.valueOf(cqk.d(vxeVarO0.B0(1), "view"))));
                    }
                }
                c79 c79VarJ = yab.j(c79VarW);
                p90.f(vxeVarO0, null);
                ListIterator listIterator = c79VarJ.listIterator(0);
                while (true) {
                    b79 b79Var = (b79) listIterator;
                    if (!b79Var.hasNext()) {
                        break;
                    }
                    ylc ylcVar = (ylc) b79Var.next();
                    String str = (String) ylcVar.a;
                    if (((Boolean) ylcVar.b).booleanValue()) {
                        n1g.u(qxeVar, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        n1g.u(qxeVar, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p90.f(vxeVarO0, th);
                    throw th2;
                }
            }
        } else {
            picVar.c(qxeVar);
        }
        for (qre qreVar : this.e) {
            qreVar.getClass();
            if (qxeVar instanceof abh) {
                qreVar.a(((abh) qxeVar).a);
            }
        }
        picVar.a(qxeVar);
    }

    public void l(qxe qxeVar) throws Throwable {
        Object poeVar;
        pic picVar = (pic) this.d;
        vxe vxeVarO0 = qxeVar.O0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z = vxeVarO0.M0() && vxeVarO0.getLong(0) != 0;
            p90.f(vxeVarO0, null);
            if (z) {
                vxe vxeVarO1 = qxeVar.O0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strB0 = vxeVarO1.M0() ? vxeVarO1.B0(0) : null;
                    p90.f(vxeVarO1, null);
                    if (!((String) picVar.b).equals(strB0) && !((String) picVar.c).equals(strB0)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) picVar.b) + ", found: " + strB0).toString());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p90.f(vxeVarO1, th);
                        throw th2;
                    }
                }
            } else {
                n1g.u(qxeVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    pse pseVarV = picVar.v(qxeVar);
                    if (!pseVarV.b) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + pseVarV.a).toString());
                    }
                    picVar.t();
                    n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    n1g.u(qxeVar, fol.a((String) picVar.b));
                    poeVar = sbi.a;
                    if (!(poeVar instanceof poe)) {
                        n1g.u(qxeVar, "END TRANSACTION");
                    }
                    Throwable thA = roe.a(poeVar);
                    if (thA != null) {
                        n1g.u(qxeVar, "ROLLBACK TRANSACTION");
                        throw thA;
                    }
                } catch (Throwable th3) {
                    poeVar = new poe(th3);
                }
            }
            picVar.s(qxeVar);
            for (qre qreVar : this.e) {
                qreVar.getClass();
                if (qxeVar instanceof abh) {
                    qreVar.b(((abh) qxeVar).a);
                }
            }
            this.a = true;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                p90.f(vxeVarO0, th4);
                throw th5;
            }
        }
    }
}
