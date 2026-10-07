package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class no4 {
    public final bi4 a;
    public final wmi b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final String g = no4.class.getName();

    public no4(bi4 bi4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, wmi wmiVar) {
        this.a = bi4Var;
        this.b = wmiVar;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
        bi4Var.k = this;
    }

    public final vg4 a(long j) {
        bi4 bi4Var = this.a;
        vg4 vg4VarE = bi4Var.e(j);
        return vg4VarE != null ? vg4VarE : bi4Var.f(j, false);
    }

    public final Object b(long j, cf7 cf7Var, nq4 nq4Var) {
        return qyj.V(((n0c) ((xhh) this.e.getValue())).b(), new k01(this, j, cf7Var, 4), nq4Var);
    }

    public final void c(long j, long j2) {
        yab.i0(this.b, ((n0c) ((xhh) this.e.getValue())).b(), 0, new io4(this, j, j2, null, 0), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
    
        if (r11 == r2) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(long r8, defpackage.ii4 r10, defpackage.nq4 r11) {
        /*
            r7 = this;
            je9 r0 = defpackage.je9.f
            boolean r1 = r11 instanceof defpackage.jo4
            if (r1 == 0) goto L15
            r1 = r11
            jo4 r1 = (defpackage.jo4) r1
            int r2 = r1.h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.h = r2
            goto L1a
        L15:
            jo4 r1 = new jo4
            r1.<init>(r7, r11)
        L1a:
            java.lang.Object r11 = r1.f
            hu4 r2 = defpackage.hu4.a
            int r3 = r1.h
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L3c
            if (r3 == r6) goto L34
            if (r3 != r5) goto L2e
            defpackage.ch3.d0(r11)
            goto Lb4
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            return r4
        L34:
            long r8 = r1.d
            ii4 r10 = r1.e
            defpackage.ch3.d0(r11)
            goto L4c
        L3c:
            defpackage.ch3.d0(r11)
            r1.e = r10
            r1.d = r8
            r1.h = r6
            java.lang.Object r11 = r7.i(r8)
            if (r11 != r2) goto L4c
            goto Lb3
        L4c:
            vg4 r11 = (defpackage.vg4) r11
            if (r11 != 0) goto L79
            java.lang.String r7 = r7.g
            a4c r11 = defpackage.gm0.f
            if (r11 != 0) goto L57
            goto L76
        L57:
            boolean r1 = r11.b(r0)
            if (r1 == 0) goto L76
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "changeStatus fail, no contact in cache for id #"
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = " "
            r1.append(r8)
            r1.append(r10)
            java.lang.String r8 = r1.toString()
            r11.c(r0, r7, r8, r4)
        L76:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L79:
            boolean r3 = r11.C()
            if (r3 == 0) goto La0
            java.lang.String r7 = r7.g
            a4c r8 = defpackage.gm0.f
            if (r8 != 0) goto L86
            goto L9d
        L86:
            boolean r9 = r8.b(r0)
            if (r9 == 0) goto L9d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "changeStatus: deleted account not supported #"
            r9.<init>(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.c(r0, r7, r9, r4)
        L9d:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        La0:
            j22 r11 = new j22
            r0 = 24
            r11.<init>(r0, r10)
            r1.e = r4
            r1.d = r8
            r1.h = r5
            java.lang.Object r11 = r7.b(r8, r11, r1)
            if (r11 != r2) goto Lb4
        Lb3:
            return r2
        Lb4:
            if (r11 == 0) goto Lb7
            goto Lb8
        Lb7:
            r6 = 0
        Lb8:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no4.d(long, ii4, nq4):java.lang.Object");
    }

    public final Object e(long j, ji4 ji4Var, ii4 ii4Var, nq4 nq4Var) {
        Object objB = b(j, new w14(ji4Var, 7, ii4Var), nq4Var);
        return objB == hu4.a ? objB : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final Object f(long j, nq4 nq4Var) {
        ko4 ko4Var;
        if (nq4Var instanceof ko4) {
            ko4Var = (ko4) nq4Var;
            int i = ko4Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ko4Var.g = i - Integer.MIN_VALUE;
            } else {
                ko4Var = new ko4(this, nq4Var);
            }
        } else {
            ko4Var = new ko4(this, nq4Var);
        }
        Object obj = ko4Var.e;
        hu4 hu4Var = hu4.a;
        int i2 = ko4Var.g;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                i9 i9Var = i9.z;
                ko4Var.d = j;
                ko4Var.g = 1;
                Object objB = b(j, i9Var, ko4Var);
                this = objB;
                if (objB == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = ko4Var.d;
                ch3.d0(obj);
                this = this;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String str = this.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.j(j, "clearContactsLastSearchClickTimeAsync fail #"), th);
                }
            }
        }
        return sbi.a;
    }

    public final vg4 g(long j) {
        return vg4.b(j, ((zed) this.d.getValue()).a.r(), (p4c) this.c.getValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(nq4 nq4Var) {
        lo4 lo4Var;
        if (nq4Var instanceof lo4) {
            lo4Var = (lo4) nq4Var;
            int i = lo4Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                lo4Var.f = i - Integer.MIN_VALUE;
            } else {
                lo4Var = new lo4(this, nq4Var);
            }
        } else {
            lo4Var = new lo4(this, nq4Var);
        }
        Object obj = lo4Var.d;
        int i2 = lo4Var.f;
        if (i2 != 0) {
            if (i2 == 1) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        pe3 pe3Var = new pe3(16, this);
        lo4Var.f = 1;
        Object objV = qyj.V(k66.a, pe3Var, lo4Var);
        hu4 hu4Var = hu4.a;
        return objV == hu4Var ? hu4Var : objV;
    }

    public final Object i(long j) {
        Object poeVar;
        bi4 bi4Var = this.a;
        vg4 vg4VarE = bi4Var.e(j);
        if (vg4VarE != null) {
            return vg4VarE;
        }
        try {
            poeVar = bi4Var.d(j, false);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            return null;
        }
        return poeVar;
    }

    public final r8e j(long j) {
        return new r8e((f9b) this.f.computeIfAbsent(Long.valueOf(j), new mm(6, new lh3(this, j, 2))));
    }

    public final Integer k() {
        Set set = bi4.m;
        bi4 bi4Var = this.a;
        int i = 0;
        vg4 vg4VarF = bi4Var.f(bi4Var.g.a.t(), false);
        Collection<vg4> collectionValues = bi4Var.a.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            for (vg4 vg4Var : collectionValues) {
                try {
                    if (vg4Var != vg4VarF && set.contains(vg4Var.a.b.k)) {
                        i++;
                    }
                } catch (Throwable th) {
                    qr7.o(th);
                    return null;
                }
            }
        }
        return new Integer(i);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x019d  */
    /* JADX WARN: Code duplicated, block: B:68:0x01df  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x021e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0226  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object l(long j, nq4 nq4Var, List list) {
        mo4 mo4Var;
        ufe ufeVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        sbi sbiVar;
        int i;
        ji4 ji4Var;
        Object objM;
        ufe ufeVar2;
        List list2;
        vfe vfeVar;
        Object obj;
        vfe vfeVar2;
        vfe vfeVar3;
        ArrayList arrayList3;
        List list3;
        long j2;
        int i2;
        ufe ufeVar3;
        vfe vfeVar4;
        int i3;
        long j3;
        ufe ufeVar4;
        ufe ufeVar5;
        ArrayList arrayList4;
        String str;
        a4c a4cVar;
        je9 je9Var;
        long j4;
        long jMax;
        String str2;
        a4c a4cVar2;
        je9 je9Var2;
        long j5 = j;
        ji4 ji4Var2 = ji4.a;
        sbi sbiVar2 = sbi.a;
        if (nq4Var instanceof mo4) {
            mo4Var = (mo4) nq4Var;
            int i4 = mo4Var.n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mo4Var.n = i4 - Integer.MIN_VALUE;
            } else {
                mo4Var = new mo4(this, nq4Var);
            }
        } else {
            mo4Var = new mo4(this, nq4Var);
        }
        Object objM2 = mo4Var.l;
        Object obj2 = hu4.a;
        int i5 = mo4Var.n;
        Object obj3 = null;
        if (i5 == 0) {
            ch3.d0(objM2);
            boolean zIsEmpty = list.isEmpty();
            String str3 = this.g;
            if (zIsEmpty) {
                gm0.x(str3, "onLogin ignored, contactInfos are empty", null);
                return sbiVar2;
            }
            gm0.n(str3, "onLogin start");
            ufeVar = new ufe();
            arrayList = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            arrayList2 = new ArrayList();
            vfe vfeVar5 = new vfe();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                pj4 pj4Var = (pj4) it.next();
                if (j5 != -1) {
                    obj = obj3;
                    vfeVar2 = vfeVar5;
                    if (pj4Var.a == j5) {
                        obj3 = obj;
                        vfeVar5 = vfeVar2;
                    }
                } else {
                    obj = obj3;
                    vfeVar2 = vfeVar5;
                }
                int i6 = pj4Var.h;
                int i7 = i6 == 0 ? -1 : go4.$EnumSwitchMapping$0[qt4.D(i6)];
                if (i7 != -1) {
                    if (i7 == 1) {
                        arrayList2.add(pj4Var);
                    } else {
                        if (i7 != 2) {
                            ore.o();
                            return obj;
                        }
                        arrayList5.add(pj4Var);
                    }
                    vfeVar3 = vfeVar2;
                } else {
                    arrayList.add(pj4Var);
                    vfeVar3 = vfeVar2;
                    vfeVar3.a = Math.max(vfeVar3.a, pj4Var.b);
                }
                arrayList5 = arrayList5;
                sbiVar2 = sbiVar2;
                ji4Var2 = ji4Var2;
                vfeVar5 = vfeVar3;
                obj3 = null;
            }
            ji4 ji4Var3 = ji4Var2;
            sbiVar = sbiVar2;
            vfe vfeVar6 = vfeVar5;
            ArrayList arrayList6 = arrayList5;
            i = ufeVar.a;
            mo4Var.e = ufeVar;
            mo4Var.f = arrayList;
            mo4Var.g = arrayList6;
            mo4Var.h = arrayList2;
            mo4Var.i = vfeVar6;
            mo4Var.j = ufeVar;
            mo4Var.d = j5;
            mo4Var.k = i;
            mo4Var.n = 1;
            ji4Var = ji4Var3;
            objM = m(arrayList, ji4Var, mo4Var);
            if (objM != obj2) {
                ufeVar2 = ufeVar;
                list2 = arrayList6;
                vfeVar = vfeVar6;
            }
            return obj2;
        }
        if (i5 == 1) {
            int i8 = mo4Var.k;
            long j6 = mo4Var.d;
            ufe ufeVar6 = mo4Var.j;
            vfeVar = mo4Var.i;
            ArrayList arrayList7 = mo4Var.h;
            list2 = mo4Var.g;
            arrayList = mo4Var.f;
            ufeVar2 = mo4Var.e;
            ch3.d0(objM2);
            sbiVar = sbiVar2;
            ji4Var = ji4Var2;
            i = i8;
            ufeVar = ufeVar6;
            j5 = j6;
            arrayList2 = arrayList7;
            objM = objM2;
        } else {
            if (i5 == 2) {
                i2 = mo4Var.k;
                long j7 = mo4Var.d;
                ufeVar3 = mo4Var.j;
                vfe vfeVar7 = mo4Var.i;
                list3 = mo4Var.h;
                arrayList3 = mo4Var.f;
                ufe ufeVar7 = mo4Var.e;
                ch3.d0(objM2);
                sbiVar = sbiVar2;
                ufeVar2 = ufeVar7;
                ji4Var = ji4Var2;
                vfeVar4 = vfeVar7;
                j2 = j7;
                ufeVar3.a = ((Number) objM2).intValue() + i2;
                i3 = ufeVar2.a;
                mo4Var.e = ufeVar2;
                mo4Var.f = arrayList3;
                mo4Var.g = null;
                mo4Var.h = null;
                mo4Var.i = vfeVar4;
                mo4Var.j = ufeVar2;
                mo4Var.d = j2;
                mo4Var.k = i3;
                mo4Var.n = 3;
                objM2 = m(list3, ji4Var, mo4Var);
                if (objM2 != obj2) {
                    j3 = j2;
                    ufeVar4 = ufeVar2;
                    ufeVar5 = ufeVar4;
                    arrayList4 = arrayList3;
                }
                return obj2;
            }
            if (i5 != 3) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = mo4Var.k;
            j3 = mo4Var.d;
            ufeVar4 = mo4Var.j;
            vfeVar4 = mo4Var.i;
            arrayList4 = mo4Var.f;
            ufeVar5 = mo4Var.e;
            ch3.d0(objM2);
            sbiVar = sbiVar2;
        }
        ufeVar4.a = ((Number) objM2).intValue() + i3;
        if (!arrayList4.isEmpty() && (arrayList4.size() > 1 || ((pj4) arrayList4.get(0)).a != j3)) {
            j4 = ((zed) this.d.getValue()).a.j();
            jMax = Math.max(j4, vfeVar4.a);
            str2 = this.g;
            a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9Var2 = je9.e;
                if (a4cVar2.b(je9Var2)) {
                    long j8 = vfeVar4.a;
                    StringBuilder sbS = qt4.s(j4, "currentLastSync=", "|maxInUserContacts=");
                    sbS.append(j8);
                    a4cVar2.c(je9Var2, str2, qt4.k(jMax, "|newSync=", sbS), null);
                }
            }
            xb9 xb9Var = ((zed) this.d.getValue()).a;
            xb9Var.i.B(xb9Var, s7f.j0[1], Long.valueOf(jMax));
        }
        str = this.g;
        a4cVar = gm0.f;
        if (a4cVar != null) {
            je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(ufeVar5.a, "onLogin finished: count "), null);
            }
        }
        return sbiVar;
        ufeVar.a = ((Number) objM).intValue() + i;
        int i9 = ufeVar2.a;
        ji4 ji4Var4 = ji4.b;
        mo4Var.e = ufeVar2;
        mo4Var.f = arrayList;
        mo4Var.g = null;
        mo4Var.h = arrayList2;
        mo4Var.i = vfeVar;
        mo4Var.j = ufeVar2;
        mo4Var.d = j5;
        mo4Var.k = i9;
        mo4Var.n = 2;
        Object objM3 = m(list2, ji4Var4, mo4Var);
        if (objM3 != obj2) {
            arrayList3 = arrayList;
            list3 = arrayList2;
            j2 = j5;
            i2 = i9;
            objM2 = objM3;
            ufeVar3 = ufeVar2;
            vfeVar4 = vfeVar;
            ufeVar3.a = ((Number) objM2).intValue() + i2;
            i3 = ufeVar2.a;
            mo4Var.e = ufeVar2;
            mo4Var.f = arrayList3;
            mo4Var.g = null;
            mo4Var.h = null;
            mo4Var.i = vfeVar4;
            mo4Var.j = ufeVar2;
            mo4Var.d = j2;
            mo4Var.k = i3;
            mo4Var.n = 3;
            objM2 = m(list3, ji4Var, mo4Var);
            if (objM2 != obj2) {
                j3 = j2;
                ufeVar4 = ufeVar2;
                ufeVar5 = ufeVar4;
                arrayList4 = arrayList3;
                ufeVar4.a = ((Number) objM2).intValue() + i3;
                if (!arrayList4.isEmpty()) {
                    j4 = ((zed) this.d.getValue()).a.j();
                    jMax = Math.max(j4, vfeVar4.a);
                    str2 = this.g;
                    a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9Var2 = je9.e;
                        if (a4cVar2.b(je9Var2)) {
                            long j9 = vfeVar4.a;
                            StringBuilder sbS2 = qt4.s(j4, "currentLastSync=", "|maxInUserContacts=");
                            sbS2.append(j9);
                            a4cVar2.c(je9Var2, str2, qt4.k(jMax, "|newSync=", sbS2), null);
                        }
                    }
                    xb9 xb9Var2 = ((zed) this.d.getValue()).a;
                    xb9Var2.i.B(xb9Var2, s7f.j0[1], Long.valueOf(jMax));
                }
                str = this.g;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.h(ufeVar5.a, "onLogin finished: count "), null);
                    }
                }
                return sbiVar;
            }
        }
        return obj2;
    }

    public final Object m(List list, ji4 ji4Var, nq4 nq4Var) {
        return qyj.V(((n0c) ((xhh) this.e.getValue())).b(), new z5(this, list, ji4Var, 2), nq4Var);
    }
}
