package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ftc {
    public final String a = ftc.class.getName();
    public final ny8 b;

    public ftc(ny8 ny8Var) {
        this.b = ny8Var;
    }

    public static wdg c(int i) {
        Object next;
        y1 y1Var = new y1(0, wdg.e);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
        } while (((wdg) next).a != i);
        wdg wdgVar = (wdg) next;
        return wdgVar == null ? wdg.TAKE_LAST : wdgVar;
    }

    public final Object a(String str, nq4 nq4Var) {
        sbi sbiVar = sbi.a;
        String str2 = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, "Deleting of metric -> ".concat(owh.a(str)), null);
            }
        }
        Object objI = ch3.I(nq4Var, ((sxa) this.b.getValue()).a, false, true, new qo1(str, 9));
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x020a  */
    /* JADX WARN: Code duplicated, block: B:114:0x021d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Serializable b(List list, nq4 nq4Var) {
        etc etcVar;
        hkg hkgVar;
        Object vdgVar;
        xdg xdgVar;
        int i;
        if (nq4Var instanceof etc) {
            etcVar = (etc) nq4Var;
            int i2 = etcVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                etcVar.f = i2 - Integer.MIN_VALUE;
            } else {
                etcVar = new etc(this, nq4Var);
            }
        } else {
            etcVar = new etc(this, nq4Var);
        }
        Object objI = etcVar.d;
        hu4 hu4Var = hu4.a;
        int i3 = etcVar.f;
        int i4 = 4;
        int i5 = 0;
        hkg hkgVar2 = null;
        int i6 = 1;
        if (i3 == 0) {
            ch3.d0(objI);
            sxa sxaVar = (sxa) this.b.getValue();
            etcVar.f = 1;
            sxaVar.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM metrics WHERE metricName IN (");
            objI = ch3.I(etcVar, sxaVar.a, true, false, new tj1(i4, sxaVar, nbh.x(")", sb, list), list));
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objI);
        }
        Iterable<txa> iterable = (Iterable) objI;
        ArrayList arrayList = new ArrayList(yw3.W0(iterable, 10));
        for (txa txaVar : iterable) {
            ekg ekgVar = txaVar.d;
            ikg[] ikgVarArr = ekgVar.a;
            if (ikgVarArr == null) {
                ikgVarArr = new ikg[i5];
            }
            Map map = ekgVar.b;
            if (map == null) {
                map = s66.a;
            }
            b9b b9bVar = new b9b(map.size());
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                fkg fkgVar = (fkg) entry.getValue();
                int i7 = fkgVar.a;
                Object objValueOf = "";
                if (i7 == i6) {
                    objValueOf = i7 == i6 ? (String) fkgVar.b : "";
                    i = i6;
                } else {
                    i = i6;
                    if (i7 == 2) {
                        objValueOf = Boolean.valueOf(i7 == 2 ? ((Boolean) fkgVar.b).booleanValue() : false);
                    } else if (i7 == 3) {
                        objValueOf = Integer.valueOf(i7 == 3 ? ((Integer) fkgVar.b).intValue() : 0);
                    } else if (i7 == i4) {
                        objValueOf = Long.valueOf(i7 == i4 ? ((Long) fkgVar.b).longValue() : 0L);
                    } else if (i7 == 5) {
                        objValueOf = Float.valueOf(i7 == 5 ? ((Float) fkgVar.b).floatValue() : 0.0f);
                    } else if (i7 == 6) {
                        objValueOf = Double.valueOf(i7 == 6 ? ((Double) fkgVar.b).doubleValue() : 0.0d);
                    } else if (i7 == 7) {
                        objValueOf = i7 == 7 ? (byte[]) fkgVar.b : sb8.i;
                    }
                }
                b9bVar.o(str, objValueOf);
                i6 = i;
            }
            int i8 = i6;
            u8b u8bVar = new u8b(ikgVarArr.length);
            int length = ikgVarArr.length;
            int i9 = 0;
            while (i9 < length) {
                ikg ikgVar = ikgVarArr[i9];
                int i10 = ikgVar.a;
                if (i10 == 5) {
                    xdgVar = new xdg((i10 == 5 ? (hkg) ikgVar.b : hkgVar2).a, (i10 == 5 ? (hkg) ikgVar.b : null).b, ikgVar.f, c((i10 == 5 ? (hkg) ikgVar.b : null).c));
                } else {
                    if (i10 == 6) {
                        vdgVar = new zdg(ikgVar.f);
                    } else if (i10 == 7) {
                        vdgVar = new vdg(ikgVar.f);
                    } else if (i10 == 8) {
                        vdgVar = new ydg(ikgVar.f);
                    } else if (i10 == 9) {
                        vdgVar = new udg(ikgVar.f);
                    } else {
                        if (ikgVar.c.length() > 0) {
                            String str2 = ikgVar.c;
                            if (str2.equals("start_metric")) {
                                vdgVar = new zdg(ikgVar.f);
                            } else if (str2.equals("gap")) {
                                vdgVar = new vdg(ikgVar.f);
                            } else {
                                xdgVar = new xdg(ikgVar.c, ikgVar.d, ikgVar.f, c(ikgVar.e));
                            }
                        } else {
                            String str3 = this.a;
                            a4c a4cVar = gm0.f;
                            if (a4cVar == null) {
                                hkgVar = null;
                            } else {
                                je9 je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    hkgVar = null;
                                    a4cVar.c(je9Var, str3, "Persisted span has no kind set, skipping", null);
                                } else {
                                    hkgVar = null;
                                }
                            }
                            vdgVar = hkgVar;
                        }
                        if (vdgVar != null) {
                            u8bVar.b(vdgVar);
                        }
                        i9++;
                        hkgVar2 = hkgVar;
                    }
                    hkgVar = null;
                    if (vdgVar != null) {
                        u8bVar.b(vdgVar);
                    }
                    i9++;
                    hkgVar2 = hkgVar;
                }
                vdgVar = xdgVar;
                hkgVar = null;
                if (vdgVar != null) {
                    u8bVar.b(vdgVar);
                }
                i9++;
                hkgVar2 = hkgVar;
            }
            hkg hkgVar3 = hkgVar2;
            long j = txaVar.c;
            aeg aegVar = (aeg) (u8bVar.i() ? hkgVar3 : u8bVar.a[u8bVar.b - 1]);
            if (j > (aegVar != null ? aegVar.a() : 0L)) {
                u8bVar.b(new vdg(txaVar.c));
            }
            String str4 = txaVar.b;
            String str5 = txaVar.a;
            long j2 = txaVar.e + 1;
            ghb ghbVar = ew5.b;
            arrayList.add(new pxa(str4, str5, j2, qe7.P(txaVar.c, lw5.MILLISECONDS), txaVar.f, u8bVar, b9bVar));
            i6 = i8;
            hkgVar2 = hkgVar3;
            i4 = 4;
            i5 = 0;
        }
        return arrayList;
    }
}
