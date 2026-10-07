package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import one.me.sdk.database.OneMeRoomDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class l34 implements j44 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public l34(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
    }

    public static Object n(l34 l34Var, q24 q24Var, gda gdaVar, long j, tl7 tl7Var) {
        return ((j35) l34Var.b.getValue()).b(new f24(l34Var, q24Var, gdaVar, j, (Long) null, (lq4) null), tl7Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:19:0x0075 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0076 -> B:21:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object A(java.util.List r7, defpackage.nq4 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.j34
            if (r0 == 0) goto L13
            r0 = r8
            j34 r0 = (defpackage.j34) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            j34 r0 = new j34
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.i
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L33
            int r7 = r0.h
            int r1 = r0.g
            java.util.Collection r3 = r0.f
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r4 = r0.e
            java.util.Collection r5 = r0.d
            java.util.Collection r5 = (java.util.Collection) r5
            defpackage.ch3.d0(r8)
            goto L77
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            r6 = 0
            return r6
        L3a:
            defpackage.ch3.d0(r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.yw3.W0(r7, r1)
            r8.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
            r1 = 0
            r4 = r7
            r3 = r8
            r7 = r1
        L52:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L7e
            java.lang.Object r8 = r4.next()
            uy3 r8 = (defpackage.uy3) r8
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5
            r0.d = r5
            r0.e = r4
            r0.f = r5
            r0.g = r1
            r0.h = r7
            r0.k = r2
            java.lang.Object r8 = r6.z(r8, r0)
            hu4 r5 = defpackage.hu4.a
            if (r8 != r5) goto L76
            return r5
        L76:
            r5 = r3
        L77:
            ky3 r8 = (defpackage.ky3) r8
            r3.add(r8)
            r3 = r5
            goto L52
        L7e:
            java.util.List r3 = (java.util.List) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l34.A(java.util.List, nq4):java.lang.Object");
    }

    public final Object B(long j, long j2, mdh mdhVar) {
        List list = xfa.b;
        g24 g24VarM = m();
        Object objI = ch3.I(mdhVar, g24VarM.a, false, true, new v14(j2, g24VarM, j));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    public final Object C(q24 q24Var, final List list, final wja wjaVar, final boolean z, nq4 nq4Var) {
        final g24 g24VarM = m();
        g24VarM.getClass();
        final long j = q24Var.a;
        final long j2 = q24Var.b;
        final String strX = nbh.x(")", nbh.C("UPDATE comments SET status = ?, status_in_process = ? WHERE parent_chat_server_id = ? AND parent_message_server_id = ? AND id in ("), list);
        Object objI = ch3.I(nq4Var, g24VarM.a, false, true, new cf7() { // from class: r14
            @Override // defpackage.cf7
            public final Object invoke(Object obj) throws Exception {
                g24 g24Var = g24VarM;
                wja wjaVar2 = wjaVar;
                boolean z2 = z;
                long j3 = j;
                long j4 = j2;
                List list2 = list;
                vxe vxeVarO0 = ((qxe) obj).O0(strX);
                try {
                    g24Var.a().getClass();
                    vxeVarO0.c(1, wjaVar2.a);
                    vxeVarO0.c(2, z2 ? 1L : 0L);
                    vxeVarO0.c(3, j3);
                    vxeVarO0.c(4, j4);
                    Iterator it = list2.iterator();
                    int i = 5;
                    while (it.hasNext()) {
                        vxeVarO0.c(i, ((Number) it.next()).longValue());
                        i++;
                    }
                    vxeVarO0.M0();
                    return sbi.a;
                } finally {
                    vxeVarO0.close();
                }
            }
        });
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    public final Object D(long j, xfa xfaVar, nq4 nq4Var) {
        Object objH = m().h(j, xfaVar, nq4Var);
        return objH == hu4.a ? objH : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // defpackage.j44
    public final Object a(rt2 rt2Var, ArrayList arrayList, lq4 lq4Var) {
        h34 h34Var;
        l34 l34Var = this;
        if (lq4Var instanceof h34) {
            h34Var = (h34) lq4Var;
            int i = h34Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                h34Var.g = i - Integer.MIN_VALUE;
            } else {
                h34Var = new h34(l34Var, (nq4) lq4Var);
            }
        } else {
            h34Var = new h34(l34Var, (nq4) lq4Var);
        }
        Object objI = h34Var.e;
        int i2 = h34Var.g;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objI);
            if (!(rt2Var instanceof s04)) {
                ore.e(rt2Var, "regular chat in comments context ");
                return null;
            }
            g24 g24VarM = l34Var.m();
            q24 q24Var = ((s04) rt2Var).r;
            long j = q24Var.a;
            long j2 = q24Var.b;
            h34Var.d = l34Var;
            h34Var.g = 1;
            g24VarM.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM comments  WHERE parent_chat_server_id = ? AND  parent_message_server_id = ? AND  status != ?  AND  server_id in (");
            vd7.b(sb, arrayList.size());
            sb.append(")");
            objI = ch3.I(h34Var, g24VarM.a, true, false, new kh3(sb.toString(), j, j2, g24VarM, wja.DELETED, arrayList));
            if (objI != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objI);
                return objI;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        l34Var = h34Var.d;
        ch3.d0(objI);
        h34Var.d = null;
        h34Var.g = 2;
        Object objA = l34Var.A((List) objI, h34Var);
        return objA == hu4Var ? hu4Var : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r11 == r5) goto L23;
     */
    @Override // defpackage.j44
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r9, defpackage.nq4 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.f34
            if (r0 == 0) goto L13
            r0 = r11
            f34 r0 = (defpackage.f34) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            f34 r0 = new f34
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.e
            int r1 = r0.g
            r2 = 0
            r3 = 2
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.ch3.d0(r11)
            goto L60
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            return r2
        L31:
            long r9 = r0.d
            defpackage.ch3.d0(r11)
            goto L51
        L37:
            defpackage.ch3.d0(r11)
            g24 r11 = r8.m()
            r0.d = r9
            r0.g = r4
            rre r1 = r11.a
            k14 r6 = new k14
            r7 = 0
            r6.<init>(r9, r11, r7)
            java.lang.Object r11 = defpackage.ch3.I(r0, r1, r4, r7, r6)
            if (r11 != r5) goto L51
            goto L5f
        L51:
            uy3 r11 = (defpackage.uy3) r11
            if (r11 == 0) goto L63
            r0.d = r9
            r0.g = r3
            java.lang.Object r11 = r8.z(r11, r0)
            if (r11 != r5) goto L60
        L5f:
            return r5
        L60:
            ky3 r11 = (defpackage.ky3) r11
            return r11
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l34.b(long, nq4):java.lang.Object");
    }

    @Override // defpackage.j44
    public final void c(Map map) {
        gm0.Y(l34.class.getName(), "updateMessageStatsBlocking: unexpected usage in comments context");
    }

    @Override // defpackage.j44
    public final Object d(l8b l8bVar, long j, t7e t7eVar) {
        g24 g24VarM = m();
        k35 k35Var = (k35) this.c.getValue();
        g24VarM.getClass();
        Object objI = ch3.I(t7eVar, (OneMeRoomDatabase) k35Var.a.getValue(), false, true, new o6e(2, l8bVar, j));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    @Override // defpackage.j44
    public final Object e(long j, rt2 rt2Var, nq4 nq4Var) {
        if (rt2Var instanceof s04) {
            return p(((s04) rt2Var).r, j, nq4Var);
        }
        throw new IllegalArgumentException(("regular chat in comments context " + rt2Var + ", commentServerId=" + j).toString());
    }

    @Override // defpackage.j44
    public final Object f(long j, lq4 lq4Var) {
        return r(j, lq4Var);
    }

    @Override // defpackage.j44
    public final Object g(Map map, rka rkaVar) {
        gm0.Y(l34.class.getName(), "updateMessageStats: unexpected usage in comments context");
        return sbi.a;
    }

    @Override // defpackage.j44
    public final Object h(long j, kja kjaVar, long j2, nq4 nq4Var) {
        g24 g24VarM = m();
        Object objI = ch3.I(nq4Var, g24VarM.a, false, true, new m14(g24VarM, kjaVar, j2, j, 2));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.j44
    public final Object i(long[] jArr, lq4 lq4Var) {
        g34 g34Var;
        if (lq4Var instanceof g34) {
            g34Var = (g34) lq4Var;
            int i = g34Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                g34Var.g = i - Integer.MIN_VALUE;
            } else {
                g34Var = new g34(this, (nq4) lq4Var);
            }
        } else {
            g34Var = new g34(this, (nq4) lq4Var);
        }
        Object objI = g34Var.e;
        int i2 = g34Var.g;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objI);
            g24 g24VarM = m();
            g34Var.d = this;
            g34Var.g = 1;
            g24VarM.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM comments WHERE id IN (");
            vd7.b(sb, jArr.length);
            sb.append(")");
            objI = ch3.I(g34Var, g24VarM.a, true, false, new os1(sb.toString(), jArr, g24VarM, 5));
            if (objI != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objI);
                return objI;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = g34Var.d;
        ch3.d0(objI);
        g34Var.d = null;
        g34Var.g = 2;
        Object objA = this.A((List) objI, g34Var);
        return objA == hu4Var ? hu4Var : objA;
    }

    @Override // defpackage.j44
    public final Object j(Collection collection, nq4 nq4Var) {
        return t(collection, nq4Var);
    }

    @Override // defpackage.j44
    public final Object k(rt2 rt2Var, Collection collection, mdh mdhVar) {
        if (!(rt2Var instanceof s04)) {
            ore.e(rt2Var, "regular chat in comments context ");
            return null;
        }
        g24 g24VarM = m();
        q24 q24Var = ((s04) rt2Var).r;
        long j = q24Var.a;
        long j2 = q24Var.b;
        g24VarM.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT server_id FROM comments WHERE parent_chat_server_id = ? AND parent_message_server_id = ? AND id in (");
        vd7.b(sb, collection.size());
        sb.append(")");
        return ch3.I(mdhVar, g24VarM.a, true, false, new m14(sb.toString(), j, j2, collection, 1));
    }

    public final void l(long j) {
        ((Number) ch3.G(m().a, false, true, new aa2(j, 6))).intValue();
    }

    public final g24 m() {
        return (g24) this.a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r1 == r7) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(defpackage.q24 r20, long r21, defpackage.nq4 r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r23
            boolean r2 = r1 instanceof defpackage.x24
            if (r2 == 0) goto L17
            r2 = r1
            x24 r2 = (defpackage.x24) r2
            int r3 = r2.g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.g = r3
            goto L1c
        L17:
            x24 r2 = new x24
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.e
            int r3 = r2.g
            r4 = 2
            r5 = 1
            r6 = 0
            hu4 r7 = defpackage.hu4.a
            if (r3 == 0) goto L3b
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2f
            defpackage.ch3.d0(r1)
            goto L78
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r0)
            return r6
        L35:
            long r8 = r2.d
            defpackage.ch3.d0(r1)
            goto L69
        L3b:
            defpackage.ch3.d0(r1)
            g24 r1 = r0.m()
            r8 = r21
            r2.d = r8
            r2.g = r5
            r1.getClass()
            long r11 = r20.a()
            long r13 = r20.b()
            rre r3 = r1.a
            s14 r10 = new s14
            r18 = 2
            r17 = r1
            r15 = r8
            r10.<init>(r11, r13, r15, r17, r18)
            r1 = 0
            java.lang.Object r1 = defpackage.ch3.I(r2, r3, r5, r1, r10)
            if (r1 != r7) goto L67
            goto L77
        L67:
            r8 = r21
        L69:
            uy3 r1 = (defpackage.uy3) r1
            if (r1 == 0) goto L7b
            r2.d = r8
            r2.g = r4
            java.lang.Object r1 = r0.z(r1, r2)
            if (r1 != r7) goto L78
        L77:
            return r7
        L78:
            ky3 r1 = (defpackage.ky3) r1
            return r1
        L7b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l34.o(q24, long, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r10 == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(defpackage.q24 r7, long r8, defpackage.nq4 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.y24
            if (r0 == 0) goto L13
            r0 = r10
            y24 r0 = (defpackage.y24) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            y24 r0 = new y24
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.e
            int r1 = r0.g
            r2 = 2
            r3 = 1
            r4 = 0
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.ch3.d0(r10)
            goto L58
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            return r4
        L31:
            long r8 = r0.d
            defpackage.ch3.d0(r10)
            goto L49
        L37:
            defpackage.ch3.d0(r10)
            g24 r10 = r6.m()
            r0.d = r8
            r0.g = r3
            java.lang.Object r10 = r10.e(r7, r8, r0)
            if (r10 != r5) goto L49
            goto L57
        L49:
            uy3 r10 = (defpackage.uy3) r10
            if (r10 == 0) goto L5b
            r0.d = r8
            r0.g = r2
            java.lang.Object r10 = r6.z(r10, r0)
            if (r10 != r5) goto L58
        L57:
            return r5
        L58:
            ky3 r10 = (defpackage.ky3) r10
            return r10
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l34.p(q24, long, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object q(q24 q24Var, long[] jArr, nq4 nq4Var) {
        z24 z24Var;
        l34 l34Var = this;
        if (nq4Var instanceof z24) {
            z24Var = (z24) nq4Var;
            int i = z24Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                z24Var.g = i - Integer.MIN_VALUE;
            } else {
                z24Var = new z24(l34Var, nq4Var);
            }
        } else {
            z24Var = new z24(l34Var, nq4Var);
        }
        Object objI = z24Var.e;
        int i2 = z24Var.g;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objI);
            g24 g24VarM = l34Var.m();
            long j = q24Var.a;
            long j2 = q24Var.b;
            z24Var.d = l34Var;
            z24Var.g = 1;
            g24VarM.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM comments WHERE parent_chat_server_id = ? AND parent_message_server_id = ? AND server_id in (");
            vd7.b(sb, jArr.length);
            sb.append(")");
            objI = ch3.I(z24Var, g24VarM.a, true, false, new moa(sb.toString(), j, j2, jArr, g24VarM, 2));
            if (objI != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objI);
                return objI;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        l34Var = z24Var.d;
        ch3.d0(objI);
        z24Var.d = null;
        z24Var.g = 2;
        Object objA = l34Var.A((List) objI, z24Var);
        return objA == hu4Var ? hu4Var : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r10 == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(long r8, defpackage.lq4 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.a34
            if (r0 == 0) goto L13
            r0 = r10
            a34 r0 = (defpackage.a34) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            a34 r0 = new a34
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.e
            int r1 = r0.g
            r2 = 0
            r3 = 2
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.ch3.d0(r10)
            goto L60
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            return r2
        L31:
            long r8 = r0.d
            defpackage.ch3.d0(r10)
            goto L51
        L37:
            defpackage.ch3.d0(r10)
            g24 r10 = r7.m()
            r0.d = r8
            r0.g = r4
            rre r1 = r10.a
            k14 r6 = new k14
            r6.<init>(r8, r10, r4)
            r10 = 0
            java.lang.Object r10 = defpackage.ch3.I(r0, r1, r4, r10, r6)
            if (r10 != r5) goto L51
            goto L5f
        L51:
            uy3 r10 = (defpackage.uy3) r10
            if (r10 == 0) goto L63
            r0.d = r8
            r0.g = r3
            java.lang.Object r10 = r7.z(r10, r0)
            if (r10 != r5) goto L60
        L5f:
            return r5
        L60:
            ky3 r10 = (defpackage.ky3) r10
            return r10
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l34.r(long, lq4):java.lang.Object");
    }

    public final ky3 s(long j) {
        g24 g24VarM = m();
        uy3 uy3Var = (uy3) ch3.G(g24VarM.a, true, false, new k14(j, g24VarM, 2));
        if (uy3Var == null) {
            return null;
        }
        jy3 jy3VarB = dnl.b(uy3Var);
        long j2 = uy3Var.t;
        if (j2 > 0) {
            jy3VarB.q = s(j2);
        }
        return jy3VarB.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(Collection collection, nq4 nq4Var) {
        b34 b34Var;
        if (nq4Var instanceof b34) {
            b34Var = (b34) nq4Var;
            int i = b34Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                b34Var.g = i - Integer.MIN_VALUE;
            } else {
                b34Var = new b34(this, nq4Var);
            }
        } else {
            b34Var = new b34(this, nq4Var);
        }
        Object objI = b34Var.e;
        int i2 = b34Var.g;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objI);
            g24 g24VarM = m();
            b34Var.d = this;
            b34Var.g = 1;
            g24VarM.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM comments WHERE id IN (");
            vd7.b(sb, collection.size());
            sb.append(")");
            objI = ch3.I(b34Var, g24VarM.a, true, false, new os1(sb.toString(), collection, g24VarM, 4));
            if (objI != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objI);
                return objI;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = b34Var.d;
        ch3.d0(objI);
        b34Var.d = null;
        b34Var.g = 2;
        Object objA = this.A((List) objI, b34Var);
        return objA == hu4Var ? hu4Var : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r2 == r8) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(defpackage.q24 r18, defpackage.nq4 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof defpackage.c34
            if (r3 == 0) goto L19
            r3 = r2
            c34 r3 = (defpackage.c34) r3
            int r4 = r3.f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f = r4
            goto L1e
        L19:
            c34 r3 = new c34
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.d
            int r4 = r3.f
            r5 = 2
            r6 = 0
            r7 = 1
            hu4 r8 = defpackage.hu4.a
            if (r4 == 0) goto L3b
            if (r4 == r7) goto L37
            if (r4 != r5) goto L31
            defpackage.ch3.d0(r2)
            goto L6e
        L31:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r0)
            return r6
        L37:
            defpackage.ch3.d0(r2)
            goto L5b
        L3b:
            defpackage.ch3.d0(r2)
            g24 r14 = r0.m()
            long r10 = r1.a
            long r12 = r1.b
            r3.f = r7
            rre r1 = r14.a
            j14 r9 = new j14
            r16 = 0
            wja r15 = defpackage.wja.DELETED
            r9.<init>(r10, r12, r14, r15, r16)
            r2 = 0
            java.lang.Object r2 = defpackage.ch3.I(r3, r1, r7, r2, r9)
            if (r2 != r8) goto L5b
            goto L6d
        L5b:
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = defpackage.ww3.t1(r2)
            uy3 r1 = (defpackage.uy3) r1
            if (r1 == 0) goto L71
            r3.f = r5
            java.lang.Object r2 = r0.z(r1, r3)
            if (r2 != r8) goto L6e
        L6d:
            return r8
        L6e:
            ky3 r2 = (defpackage.ky3) r2
            return r2
        L71:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l34.u(q24, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0107 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    public final Object v(q24 q24Var, final long j, final long j2, int i, boolean z, nq4 nq4Var) {
        d34 d34Var;
        Object obj;
        long j3;
        long j4;
        int i2;
        boolean z2;
        List list;
        Object objA;
        final int i3 = i;
        if (nq4Var instanceof d34) {
            d34Var = (d34) nq4Var;
            int i4 = d34Var.j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                d34Var.j = i4 - Integer.MIN_VALUE;
            } else {
                d34Var = new d34(this, nq4Var);
            }
        } else {
            d34Var = new d34(this, nq4Var);
        }
        d34 d34Var2 = d34Var;
        Object objI = d34Var2.h;
        int i5 = d34Var2.j;
        Object obj2 = hu4.a;
        if (i5 == 0) {
            ch3.d0(objI);
            final wja wjaVar = wja.DELETED;
            if (z) {
                final g24 g24VarM = m();
                d34Var2.d = j;
                d34Var2.e = j2;
                d34Var2.f = i3;
                d34Var2.g = z;
                d34Var2.j = 1;
                g24VarM.getClass();
                final long j5 = q24Var.a;
                final long j6 = q24Var.b;
                final int i6 = 1;
                objI = ch3.I(d34Var2, g24VarM.a, true, false, new cf7() { // from class: l14
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj3) throws Exception {
                        int i7 = i6;
                        int i8 = i3;
                        wja wjaVar2 = wjaVar;
                        g24 g24Var = g24VarM;
                        long j7 = j2;
                        long j8 = j;
                        long j9 = j6;
                        long j10 = j5;
                        switch (i7) {
                            case 0:
                                vxe vxeVarO0 = ((qxe) obj3).O0("SELECT * FROM comments WHERE parent_chat_server_id = ? AND parent_message_server_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? ORDER BY time ASC, time_local ASC LIMIT ?");
                                try {
                                    vxeVarO0.c(1, j10);
                                    vxeVarO0.c(2, j9);
                                    vxeVarO0.c(3, j8);
                                    vxeVarO0.c(4, j7);
                                    g24Var.a().getClass();
                                    vxeVarO0.c(5, wjaVar2.a);
                                    vxeVarO0.c(6, i8);
                                    int iE = qyj.E(vxeVarO0, "id");
                                    int iE2 = qyj.E(vxeVarO0, "server_id");
                                    int iE3 = qyj.E(vxeVarO0, "time");
                                    int iE4 = qyj.E(vxeVarO0, "update_time");
                                    int iE5 = qyj.E(vxeVarO0, "sender");
                                    int iE6 = qyj.E(vxeVarO0, "cid");
                                    int iE7 = qyj.E(vxeVarO0, "text");
                                    int iE8 = qyj.E(vxeVarO0, "delivery_status");
                                    int iE9 = qyj.E(vxeVarO0, "status");
                                    int iE10 = qyj.E(vxeVarO0, "status_in_process");
                                    int iE11 = qyj.E(vxeVarO0, "time_local");
                                    int iE12 = qyj.E(vxeVarO0, "error");
                                    int iE13 = qyj.E(vxeVarO0, "localized_error");
                                    int iE14 = qyj.E(vxeVarO0, "attaches");
                                    int iE15 = qyj.E(vxeVarO0, "media_type");
                                    int iE16 = qyj.E(vxeVarO0, "message_type");
                                    int iE17 = qyj.E(vxeVarO0, "detect_share");
                                    int iE18 = qyj.E(vxeVarO0, "msg_link_type");
                                    int iE19 = qyj.E(vxeVarO0, "msg_link_id");
                                    int iE20 = qyj.E(vxeVarO0, "inserted_from_msg_link");
                                    int iE21 = qyj.E(vxeVarO0, "msg_link_out_chat_id");
                                    int iE22 = qyj.E(vxeVarO0, "msg_link_out_post_id");
                                    int iE23 = qyj.E(vxeVarO0, "msg_link_out_msg_id");
                                    int iE24 = qyj.E(vxeVarO0, "options");
                                    int iE25 = qyj.E(vxeVarO0, "elements");
                                    int iE26 = qyj.E(vxeVarO0, "reactions");
                                    int iE27 = qyj.E(vxeVarO0, "reactions_update_time");
                                    int iE28 = qyj.E(vxeVarO0, "parent_chat_server_id");
                                    int iE29 = qyj.E(vxeVarO0, "parent_message_server_id");
                                    ArrayList arrayList = new ArrayList();
                                    while (vxeVarO0.M0()) {
                                        long j11 = vxeVarO0.getLong(iE);
                                        long j12 = vxeVarO0.getLong(iE2);
                                        long j13 = vxeVarO0.getLong(iE3);
                                        long j14 = vxeVarO0.getLong(iE4);
                                        long j15 = vxeVarO0.getLong(iE5);
                                        long j16 = vxeVarO0.getLong(iE6);
                                        String strB0 = vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7);
                                        int i9 = (int) vxeVarO0.getLong(iE8);
                                        g24Var.a().getClass();
                                        xfa xfaVarB = dwa.b(i9);
                                        int i10 = (int) vxeVarO0.getLong(iE9);
                                        g24Var.a().getClass();
                                        wja wjaVarD = dwa.d(i10);
                                        boolean z3 = ((int) vxeVarO0.getLong(iE10)) != 0;
                                        long j17 = vxeVarO0.getLong(iE11);
                                        String strB1 = vxeVarO0.isNull(iE12) ? null : vxeVarO0.B0(iE12);
                                        String strB2 = vxeVarO0.isNull(iE13) ? null : vxeVarO0.B0(iE13);
                                        byte[] blob = vxeVarO0.isNull(iE14) ? null : vxeVarO0.getBlob(iE14);
                                        g24Var.a().getClass();
                                        c46 c46VarA = dwa.a(blob);
                                        int i11 = iE15;
                                        int i12 = iE3;
                                        int i13 = (int) vxeVarO0.getLong(i11);
                                        int i14 = iE16;
                                        int i15 = (int) vxeVarO0.getLong(i14);
                                        g24Var.a().getClass();
                                        int iE30 = dwa.e(i15);
                                        iE16 = i14;
                                        int i16 = iE17;
                                        boolean z4 = ((int) vxeVarO0.getLong(i16)) != 0;
                                        int i17 = iE4;
                                        int i18 = iE18;
                                        int i19 = (int) vxeVarO0.getLong(i18);
                                        int i20 = iE19;
                                        long j18 = vxeVarO0.getLong(i20);
                                        int i21 = iE20;
                                        boolean z5 = ((int) vxeVarO0.getLong(i21)) != 0;
                                        int i22 = iE21;
                                        long j19 = vxeVarO0.getLong(i22);
                                        int i23 = iE22;
                                        long j20 = vxeVarO0.getLong(i23);
                                        iE20 = i21;
                                        int i24 = iE23;
                                        long j21 = vxeVarO0.getLong(i24);
                                        iE23 = i24;
                                        iE21 = i22;
                                        iE22 = i23;
                                        int i25 = iE24;
                                        int i26 = (int) vxeVarO0.getLong(i25);
                                        int i27 = iE25;
                                        byte[] blob2 = vxeVarO0.getBlob(i27);
                                        g24Var.a().getClass();
                                        List listC = dwa.c(blob2);
                                        iE24 = i25;
                                        iE26 = iE26;
                                        kja kjaVarF = g24Var.a().f(vxeVarO0.isNull(iE26) ? null : vxeVarO0.getBlob(iE26));
                                        int i28 = iE27;
                                        long j22 = vxeVarO0.getLong(i28);
                                        int i29 = iE28;
                                        int i30 = iE6;
                                        int i31 = iE29;
                                        int i32 = iE5;
                                        arrayList.add(new uy3(j11, new q24(vxeVarO0.getLong(i29), vxeVarO0.getLong(i31)), j12, j13, j14, j15, j16, strB0, xfaVarB, wjaVarD, z3, j17, strB1, strB2, c46VarA, i13, iE30, z4, i19, j18, z5, j19, j20, j21, i26, listC, kjaVarF, j22));
                                        iE3 = i12;
                                        iE4 = i17;
                                        iE17 = i16;
                                        iE18 = i18;
                                        iE19 = i20;
                                        iE25 = i27;
                                        iE27 = i28;
                                        iE5 = i32;
                                        iE = iE;
                                        iE15 = i11;
                                        iE6 = i30;
                                        iE29 = i31;
                                        iE28 = i29;
                                        iE2 = iE2;
                                        break;
                                    }
                                    return arrayList;
                                } finally {
                                    vxeVarO0.close();
                                }
                            default:
                                vxe vxeVarO1 = ((qxe) obj3).O0("SELECT * FROM comments WHERE parent_chat_server_id = ? AND parent_message_server_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? ORDER BY time DESC, time_local DESC LIMIT ?");
                                try {
                                    vxeVarO1.c(1, j10);
                                    vxeVarO1.c(2, j9);
                                    vxeVarO1.c(3, j8);
                                    vxeVarO1.c(4, j7);
                                    g24Var.a().getClass();
                                    vxeVarO1.c(5, wjaVar2.a);
                                    vxeVarO1.c(6, i8);
                                    int iE31 = qyj.E(vxeVarO1, "id");
                                    int iE32 = qyj.E(vxeVarO1, "server_id");
                                    int iE33 = qyj.E(vxeVarO1, "time");
                                    int iE34 = qyj.E(vxeVarO1, "update_time");
                                    int iE35 = qyj.E(vxeVarO1, "sender");
                                    int iE36 = qyj.E(vxeVarO1, "cid");
                                    int iE37 = qyj.E(vxeVarO1, "text");
                                    int iE38 = qyj.E(vxeVarO1, "delivery_status");
                                    int iE39 = qyj.E(vxeVarO1, "status");
                                    int iE40 = qyj.E(vxeVarO1, "status_in_process");
                                    int iE41 = qyj.E(vxeVarO1, "time_local");
                                    int iE42 = qyj.E(vxeVarO1, "error");
                                    int iE43 = qyj.E(vxeVarO1, "localized_error");
                                    int iE44 = qyj.E(vxeVarO1, "attaches");
                                    int iE45 = qyj.E(vxeVarO1, "media_type");
                                    int iE46 = qyj.E(vxeVarO1, "message_type");
                                    int iE47 = qyj.E(vxeVarO1, "detect_share");
                                    int iE48 = qyj.E(vxeVarO1, "msg_link_type");
                                    int iE49 = qyj.E(vxeVarO1, "msg_link_id");
                                    int iE50 = qyj.E(vxeVarO1, "inserted_from_msg_link");
                                    int iE51 = qyj.E(vxeVarO1, "msg_link_out_chat_id");
                                    int iE52 = qyj.E(vxeVarO1, "msg_link_out_post_id");
                                    int iE53 = qyj.E(vxeVarO1, "msg_link_out_msg_id");
                                    int iE54 = qyj.E(vxeVarO1, "options");
                                    int iE55 = qyj.E(vxeVarO1, "elements");
                                    int iE56 = qyj.E(vxeVarO1, "reactions");
                                    int iE57 = qyj.E(vxeVarO1, "reactions_update_time");
                                    int iE58 = qyj.E(vxeVarO1, "parent_chat_server_id");
                                    int iE59 = qyj.E(vxeVarO1, "parent_message_server_id");
                                    ArrayList arrayList2 = new ArrayList();
                                    while (vxeVarO1.M0()) {
                                        long j23 = vxeVarO1.getLong(iE31);
                                        long j24 = vxeVarO1.getLong(iE32);
                                        long j25 = vxeVarO1.getLong(iE33);
                                        long j26 = vxeVarO1.getLong(iE34);
                                        long j27 = vxeVarO1.getLong(iE35);
                                        long j28 = vxeVarO1.getLong(iE36);
                                        String strB3 = vxeVarO1.isNull(iE37) ? null : vxeVarO1.B0(iE37);
                                        int i33 = (int) vxeVarO1.getLong(iE38);
                                        g24Var.a().getClass();
                                        xfa xfaVarB2 = dwa.b(i33);
                                        int i34 = (int) vxeVarO1.getLong(iE39);
                                        g24Var.a().getClass();
                                        wja wjaVarD2 = dwa.d(i34);
                                        boolean z6 = ((int) vxeVarO1.getLong(iE40)) != 0;
                                        long j29 = vxeVarO1.getLong(iE41);
                                        String strB4 = vxeVarO1.isNull(iE42) ? null : vxeVarO1.B0(iE42);
                                        String strB5 = vxeVarO1.isNull(iE43) ? null : vxeVarO1.B0(iE43);
                                        byte[] blob3 = vxeVarO1.isNull(iE44) ? null : vxeVarO1.getBlob(iE44);
                                        g24Var.a().getClass();
                                        c46 c46VarA2 = dwa.a(blob3);
                                        int i35 = iE45;
                                        int i36 = iE33;
                                        int i37 = (int) vxeVarO1.getLong(i35);
                                        int i38 = iE46;
                                        int i39 = (int) vxeVarO1.getLong(i38);
                                        g24Var.a().getClass();
                                        int iE60 = dwa.e(i39);
                                        int i40 = iE47;
                                        boolean z7 = ((int) vxeVarO1.getLong(i40)) != 0;
                                        int i41 = iE48;
                                        int i42 = iE34;
                                        int i43 = (int) vxeVarO1.getLong(i41);
                                        int i44 = iE49;
                                        long j30 = vxeVarO1.getLong(i44);
                                        int i45 = iE50;
                                        boolean z8 = ((int) vxeVarO1.getLong(i45)) != 0;
                                        int i46 = iE51;
                                        long j31 = vxeVarO1.getLong(i46);
                                        int i47 = iE52;
                                        long j32 = vxeVarO1.getLong(i47);
                                        int i48 = iE53;
                                        long j33 = vxeVarO1.getLong(i48);
                                        iE53 = i48;
                                        int i49 = iE54;
                                        int i50 = (int) vxeVarO1.getLong(i49);
                                        int i51 = iE55;
                                        byte[] blob4 = vxeVarO1.getBlob(i51);
                                        g24Var.a().getClass();
                                        List listC2 = dwa.c(blob4);
                                        int i52 = iE56;
                                        kja kjaVarF2 = g24Var.a().f(vxeVarO1.isNull(i52) ? null : vxeVarO1.getBlob(i52));
                                        int i53 = iE57;
                                        long j34 = vxeVarO1.getLong(i53);
                                        int i54 = iE58;
                                        int i55 = iE36;
                                        int i56 = iE59;
                                        int i57 = iE35;
                                        arrayList2.add(new uy3(j23, new q24(vxeVarO1.getLong(i54), vxeVarO1.getLong(i56)), j24, j25, j26, j27, j28, strB3, xfaVarB2, wjaVarD2, z6, j29, strB4, strB5, c46VarA2, i37, iE60, z7, i43, j30, z8, j31, j32, j33, i50, listC2, kjaVarF2, j34));
                                        iE33 = i36;
                                        iE45 = i35;
                                        iE46 = i38;
                                        iE34 = i42;
                                        iE47 = i40;
                                        iE48 = i41;
                                        iE50 = i45;
                                        iE51 = i46;
                                        iE52 = i47;
                                        iE54 = i49;
                                        iE49 = i44;
                                        iE55 = i51;
                                        iE57 = i53;
                                        iE35 = i57;
                                        iE31 = iE31;
                                        iE56 = i52;
                                        iE36 = i55;
                                        iE59 = i56;
                                        iE58 = i54;
                                        iE32 = iE32;
                                        break;
                                    }
                                    return arrayList2;
                                } finally {
                                    vxeVarO1.close();
                                }
                        }
                    }
                });
                obj = obj2;
                if (objI != obj) {
                    j3 = j;
                    j4 = j2;
                    z2 = z;
                    list = (List) objI;
                    d34Var2.d = j3;
                    d34Var2.e = j4;
                    d34Var2.f = i3;
                    d34Var2.g = z2;
                    d34Var2.j = 3;
                    objA = A(list, d34Var2);
                    if (objA == obj) {
                        return objA;
                    }
                }
            } else {
                final g24 g24VarM2 = m();
                d34Var2.d = j;
                d34Var2.e = j2;
                d34Var2.f = i3;
                d34Var2.g = z;
                d34Var2.j = 2;
                g24VarM2.getClass();
                final long j7 = q24Var.a;
                final long j8 = q24Var.b;
                final int i7 = 0;
                objI = ch3.I(d34Var2, g24VarM2.a, true, false, new cf7() { // from class: l14
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj3) throws Exception {
                        int i8 = i7;
                        int i9 = i3;
                        wja wjaVar2 = wjaVar;
                        g24 g24Var = g24VarM2;
                        long j9 = j2;
                        long j10 = j;
                        long j11 = j8;
                        long j12 = j7;
                        switch (i8) {
                            case 0:
                                vxe vxeVarO0 = ((qxe) obj3).O0("SELECT * FROM comments WHERE parent_chat_server_id = ? AND parent_message_server_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? ORDER BY time ASC, time_local ASC LIMIT ?");
                                try {
                                    vxeVarO0.c(1, j12);
                                    vxeVarO0.c(2, j11);
                                    vxeVarO0.c(3, j10);
                                    vxeVarO0.c(4, j9);
                                    g24Var.a().getClass();
                                    vxeVarO0.c(5, wjaVar2.a);
                                    vxeVarO0.c(6, i9);
                                    int iE = qyj.E(vxeVarO0, "id");
                                    int iE2 = qyj.E(vxeVarO0, "server_id");
                                    int iE3 = qyj.E(vxeVarO0, "time");
                                    int iE4 = qyj.E(vxeVarO0, "update_time");
                                    int iE5 = qyj.E(vxeVarO0, "sender");
                                    int iE6 = qyj.E(vxeVarO0, "cid");
                                    int iE7 = qyj.E(vxeVarO0, "text");
                                    int iE8 = qyj.E(vxeVarO0, "delivery_status");
                                    int iE9 = qyj.E(vxeVarO0, "status");
                                    int iE10 = qyj.E(vxeVarO0, "status_in_process");
                                    int iE11 = qyj.E(vxeVarO0, "time_local");
                                    int iE12 = qyj.E(vxeVarO0, "error");
                                    int iE13 = qyj.E(vxeVarO0, "localized_error");
                                    int iE14 = qyj.E(vxeVarO0, "attaches");
                                    int iE15 = qyj.E(vxeVarO0, "media_type");
                                    int iE16 = qyj.E(vxeVarO0, "message_type");
                                    int iE17 = qyj.E(vxeVarO0, "detect_share");
                                    int iE18 = qyj.E(vxeVarO0, "msg_link_type");
                                    int iE19 = qyj.E(vxeVarO0, "msg_link_id");
                                    int iE20 = qyj.E(vxeVarO0, "inserted_from_msg_link");
                                    int iE21 = qyj.E(vxeVarO0, "msg_link_out_chat_id");
                                    int iE22 = qyj.E(vxeVarO0, "msg_link_out_post_id");
                                    int iE23 = qyj.E(vxeVarO0, "msg_link_out_msg_id");
                                    int iE24 = qyj.E(vxeVarO0, "options");
                                    int iE25 = qyj.E(vxeVarO0, "elements");
                                    int iE26 = qyj.E(vxeVarO0, "reactions");
                                    int iE27 = qyj.E(vxeVarO0, "reactions_update_time");
                                    int iE28 = qyj.E(vxeVarO0, "parent_chat_server_id");
                                    int iE29 = qyj.E(vxeVarO0, "parent_message_server_id");
                                    ArrayList arrayList = new ArrayList();
                                    while (vxeVarO0.M0()) {
                                        long j13 = vxeVarO0.getLong(iE);
                                        long j14 = vxeVarO0.getLong(iE2);
                                        long j15 = vxeVarO0.getLong(iE3);
                                        long j16 = vxeVarO0.getLong(iE4);
                                        long j17 = vxeVarO0.getLong(iE5);
                                        long j18 = vxeVarO0.getLong(iE6);
                                        String strB0 = vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7);
                                        int i10 = (int) vxeVarO0.getLong(iE8);
                                        g24Var.a().getClass();
                                        xfa xfaVarB = dwa.b(i10);
                                        int i11 = (int) vxeVarO0.getLong(iE9);
                                        g24Var.a().getClass();
                                        wja wjaVarD = dwa.d(i11);
                                        boolean z3 = ((int) vxeVarO0.getLong(iE10)) != 0;
                                        long j19 = vxeVarO0.getLong(iE11);
                                        String strB1 = vxeVarO0.isNull(iE12) ? null : vxeVarO0.B0(iE12);
                                        String strB2 = vxeVarO0.isNull(iE13) ? null : vxeVarO0.B0(iE13);
                                        byte[] blob = vxeVarO0.isNull(iE14) ? null : vxeVarO0.getBlob(iE14);
                                        g24Var.a().getClass();
                                        c46 c46VarA = dwa.a(blob);
                                        int i12 = iE15;
                                        int i13 = iE3;
                                        int i14 = (int) vxeVarO0.getLong(i12);
                                        int i15 = iE16;
                                        int i16 = (int) vxeVarO0.getLong(i15);
                                        g24Var.a().getClass();
                                        int iE30 = dwa.e(i16);
                                        iE16 = i15;
                                        int i17 = iE17;
                                        boolean z4 = ((int) vxeVarO0.getLong(i17)) != 0;
                                        int i18 = iE4;
                                        int i19 = iE18;
                                        int i110 = (int) vxeVarO0.getLong(i19);
                                        int i20 = iE19;
                                        long j110 = vxeVarO0.getLong(i20);
                                        int i21 = iE20;
                                        boolean z5 = ((int) vxeVarO0.getLong(i21)) != 0;
                                        int i22 = iE21;
                                        long j111 = vxeVarO0.getLong(i22);
                                        int i23 = iE22;
                                        long j20 = vxeVarO0.getLong(i23);
                                        iE20 = i21;
                                        int i24 = iE23;
                                        long j21 = vxeVarO0.getLong(i24);
                                        iE23 = i24;
                                        iE21 = i22;
                                        iE22 = i23;
                                        int i25 = iE24;
                                        int i26 = (int) vxeVarO0.getLong(i25);
                                        int i27 = iE25;
                                        byte[] blob2 = vxeVarO0.getBlob(i27);
                                        g24Var.a().getClass();
                                        List listC = dwa.c(blob2);
                                        iE24 = i25;
                                        iE26 = iE26;
                                        kja kjaVarF = g24Var.a().f(vxeVarO0.isNull(iE26) ? null : vxeVarO0.getBlob(iE26));
                                        int i28 = iE27;
                                        long j22 = vxeVarO0.getLong(i28);
                                        int i29 = iE28;
                                        int i30 = iE6;
                                        int i31 = iE29;
                                        int i32 = iE5;
                                        arrayList.add(new uy3(j13, new q24(vxeVarO0.getLong(i29), vxeVarO0.getLong(i31)), j14, j15, j16, j17, j18, strB0, xfaVarB, wjaVarD, z3, j19, strB1, strB2, c46VarA, i14, iE30, z4, i110, j110, z5, j111, j20, j21, i26, listC, kjaVarF, j22));
                                        iE3 = i13;
                                        iE4 = i18;
                                        iE17 = i17;
                                        iE18 = i19;
                                        iE19 = i20;
                                        iE25 = i27;
                                        iE27 = i28;
                                        iE5 = i32;
                                        iE = iE;
                                        iE15 = i12;
                                        iE6 = i30;
                                        iE29 = i31;
                                        iE28 = i29;
                                        iE2 = iE2;
                                        break;
                                    }
                                    return arrayList;
                                } finally {
                                    vxeVarO0.close();
                                }
                            default:
                                vxe vxeVarO1 = ((qxe) obj3).O0("SELECT * FROM comments WHERE parent_chat_server_id = ? AND parent_message_server_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? ORDER BY time DESC, time_local DESC LIMIT ?");
                                try {
                                    vxeVarO1.c(1, j12);
                                    vxeVarO1.c(2, j11);
                                    vxeVarO1.c(3, j10);
                                    vxeVarO1.c(4, j9);
                                    g24Var.a().getClass();
                                    vxeVarO1.c(5, wjaVar2.a);
                                    vxeVarO1.c(6, i9);
                                    int iE31 = qyj.E(vxeVarO1, "id");
                                    int iE32 = qyj.E(vxeVarO1, "server_id");
                                    int iE33 = qyj.E(vxeVarO1, "time");
                                    int iE34 = qyj.E(vxeVarO1, "update_time");
                                    int iE35 = qyj.E(vxeVarO1, "sender");
                                    int iE36 = qyj.E(vxeVarO1, "cid");
                                    int iE37 = qyj.E(vxeVarO1, "text");
                                    int iE38 = qyj.E(vxeVarO1, "delivery_status");
                                    int iE39 = qyj.E(vxeVarO1, "status");
                                    int iE40 = qyj.E(vxeVarO1, "status_in_process");
                                    int iE41 = qyj.E(vxeVarO1, "time_local");
                                    int iE42 = qyj.E(vxeVarO1, "error");
                                    int iE43 = qyj.E(vxeVarO1, "localized_error");
                                    int iE44 = qyj.E(vxeVarO1, "attaches");
                                    int iE45 = qyj.E(vxeVarO1, "media_type");
                                    int iE46 = qyj.E(vxeVarO1, "message_type");
                                    int iE47 = qyj.E(vxeVarO1, "detect_share");
                                    int iE48 = qyj.E(vxeVarO1, "msg_link_type");
                                    int iE49 = qyj.E(vxeVarO1, "msg_link_id");
                                    int iE50 = qyj.E(vxeVarO1, "inserted_from_msg_link");
                                    int iE51 = qyj.E(vxeVarO1, "msg_link_out_chat_id");
                                    int iE52 = qyj.E(vxeVarO1, "msg_link_out_post_id");
                                    int iE53 = qyj.E(vxeVarO1, "msg_link_out_msg_id");
                                    int iE54 = qyj.E(vxeVarO1, "options");
                                    int iE55 = qyj.E(vxeVarO1, "elements");
                                    int iE56 = qyj.E(vxeVarO1, "reactions");
                                    int iE57 = qyj.E(vxeVarO1, "reactions_update_time");
                                    int iE58 = qyj.E(vxeVarO1, "parent_chat_server_id");
                                    int iE59 = qyj.E(vxeVarO1, "parent_message_server_id");
                                    ArrayList arrayList2 = new ArrayList();
                                    while (vxeVarO1.M0()) {
                                        long j23 = vxeVarO1.getLong(iE31);
                                        long j24 = vxeVarO1.getLong(iE32);
                                        long j25 = vxeVarO1.getLong(iE33);
                                        long j26 = vxeVarO1.getLong(iE34);
                                        long j27 = vxeVarO1.getLong(iE35);
                                        long j28 = vxeVarO1.getLong(iE36);
                                        String strB3 = vxeVarO1.isNull(iE37) ? null : vxeVarO1.B0(iE37);
                                        int i33 = (int) vxeVarO1.getLong(iE38);
                                        g24Var.a().getClass();
                                        xfa xfaVarB2 = dwa.b(i33);
                                        int i34 = (int) vxeVarO1.getLong(iE39);
                                        g24Var.a().getClass();
                                        wja wjaVarD2 = dwa.d(i34);
                                        boolean z6 = ((int) vxeVarO1.getLong(iE40)) != 0;
                                        long j29 = vxeVarO1.getLong(iE41);
                                        String strB4 = vxeVarO1.isNull(iE42) ? null : vxeVarO1.B0(iE42);
                                        String strB5 = vxeVarO1.isNull(iE43) ? null : vxeVarO1.B0(iE43);
                                        byte[] blob3 = vxeVarO1.isNull(iE44) ? null : vxeVarO1.getBlob(iE44);
                                        g24Var.a().getClass();
                                        c46 c46VarA2 = dwa.a(blob3);
                                        int i35 = iE45;
                                        int i36 = iE33;
                                        int i37 = (int) vxeVarO1.getLong(i35);
                                        int i38 = iE46;
                                        int i39 = (int) vxeVarO1.getLong(i38);
                                        g24Var.a().getClass();
                                        int iE60 = dwa.e(i39);
                                        int i40 = iE47;
                                        boolean z7 = ((int) vxeVarO1.getLong(i40)) != 0;
                                        int i41 = iE48;
                                        int i42 = iE34;
                                        int i43 = (int) vxeVarO1.getLong(i41);
                                        int i44 = iE49;
                                        long j30 = vxeVarO1.getLong(i44);
                                        int i45 = iE50;
                                        boolean z8 = ((int) vxeVarO1.getLong(i45)) != 0;
                                        int i46 = iE51;
                                        long j31 = vxeVarO1.getLong(i46);
                                        int i47 = iE52;
                                        long j32 = vxeVarO1.getLong(i47);
                                        int i48 = iE53;
                                        long j33 = vxeVarO1.getLong(i48);
                                        iE53 = i48;
                                        int i49 = iE54;
                                        int i50 = (int) vxeVarO1.getLong(i49);
                                        int i51 = iE55;
                                        byte[] blob4 = vxeVarO1.getBlob(i51);
                                        g24Var.a().getClass();
                                        List listC2 = dwa.c(blob4);
                                        int i52 = iE56;
                                        kja kjaVarF2 = g24Var.a().f(vxeVarO1.isNull(i52) ? null : vxeVarO1.getBlob(i52));
                                        int i53 = iE57;
                                        long j34 = vxeVarO1.getLong(i53);
                                        int i54 = iE58;
                                        int i55 = iE36;
                                        int i56 = iE59;
                                        int i57 = iE35;
                                        arrayList2.add(new uy3(j23, new q24(vxeVarO1.getLong(i54), vxeVarO1.getLong(i56)), j24, j25, j26, j27, j28, strB3, xfaVarB2, wjaVarD2, z6, j29, strB4, strB5, c46VarA2, i37, iE60, z7, i43, j30, z8, j31, j32, j33, i50, listC2, kjaVarF2, j34));
                                        iE33 = i36;
                                        iE45 = i35;
                                        iE46 = i38;
                                        iE34 = i42;
                                        iE47 = i40;
                                        iE48 = i41;
                                        iE50 = i45;
                                        iE51 = i46;
                                        iE52 = i47;
                                        iE54 = i49;
                                        iE49 = i44;
                                        iE55 = i51;
                                        iE57 = i53;
                                        iE35 = i57;
                                        iE31 = iE31;
                                        iE56 = i52;
                                        iE36 = i55;
                                        iE59 = i56;
                                        iE58 = i54;
                                        iE32 = iE32;
                                        break;
                                    }
                                    return arrayList2;
                                } finally {
                                    vxeVarO1.close();
                                }
                        }
                    }
                });
                obj = obj2;
                if (objI != obj) {
                    j3 = j;
                    j4 = j2;
                    i2 = i;
                    z2 = z;
                    list = (List) objI;
                    i3 = i2;
                    d34Var2.d = j3;
                    d34Var2.e = j4;
                    d34Var2.f = i3;
                    d34Var2.g = z2;
                    d34Var2.j = 3;
                    objA = A(list, d34Var2);
                    if (objA == obj) {
                        return objA;
                    }
                }
            }
        } else if (i5 == 1) {
            z2 = d34Var2.g;
            int i8 = d34Var2.f;
            j4 = d34Var2.e;
            j3 = d34Var2.d;
            ch3.d0(objI);
            i3 = i8;
            obj = obj2;
            list = (List) objI;
            d34Var2.d = j3;
            d34Var2.e = j4;
            d34Var2.f = i3;
            d34Var2.g = z2;
            d34Var2.j = 3;
            objA = A(list, d34Var2);
            if (objA == obj) {
                return objA;
            }
        } else {
            if (i5 != 2) {
                if (i5 == 3) {
                    ch3.d0(objI);
                    return objI;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = d34Var2.g;
            i2 = d34Var2.f;
            j4 = d34Var2.e;
            j3 = d34Var2.d;
            ch3.d0(objI);
            obj = obj2;
            list = (List) objI;
            i3 = i2;
            d34Var2.d = j3;
            d34Var2.e = j4;
            d34Var2.f = i3;
            d34Var2.g = z2;
            d34Var2.j = 3;
            objA = A(list, d34Var2);
            if (objA == obj) {
                return objA;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r2 == r8) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(defpackage.q24 r18, defpackage.nq4 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof defpackage.e34
            if (r3 == 0) goto L19
            r3 = r2
            e34 r3 = (defpackage.e34) r3
            int r4 = r3.f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f = r4
            goto L1e
        L19:
            e34 r3 = new e34
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.d
            int r4 = r3.f
            r5 = 2
            r6 = 0
            r7 = 1
            hu4 r8 = defpackage.hu4.a
            if (r4 == 0) goto L3b
            if (r4 == r7) goto L37
            if (r4 != r5) goto L31
            defpackage.ch3.d0(r2)
            goto L6e
        L31:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r0)
            return r6
        L37:
            defpackage.ch3.d0(r2)
            goto L5b
        L3b:
            defpackage.ch3.d0(r2)
            g24 r14 = r0.m()
            long r10 = r1.a
            long r12 = r1.b
            r3.f = r7
            rre r1 = r14.a
            j14 r9 = new j14
            r16 = 1
            wja r15 = defpackage.wja.DELETED
            r9.<init>(r10, r12, r14, r15, r16)
            r2 = 0
            java.lang.Object r2 = defpackage.ch3.I(r3, r1, r7, r2, r9)
            if (r2 != r8) goto L5b
            goto L6d
        L5b:
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = defpackage.ww3.t1(r2)
            uy3 r1 = (defpackage.uy3) r1
            if (r1 == 0) goto L71
            r3.f = r5
            java.lang.Object r2 = r0.z(r1, r3)
            if (r2 != r8) goto L6e
        L6d:
            return r8
        L6e:
            ky3 r2 = (defpackage.ky3) r2
            return r2
        L71:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l34.w(q24, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object x(q24 q24Var, List list, nq4 nq4Var) {
        i34 i34Var;
        l34 l34Var = this;
        if (nq4Var instanceof i34) {
            i34Var = (i34) nq4Var;
            int i = i34Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                i34Var.g = i - Integer.MIN_VALUE;
            } else {
                i34Var = new i34(l34Var, nq4Var);
            }
        } else {
            i34Var = new i34(l34Var, nq4Var);
        }
        Object objI = i34Var.e;
        int i2 = i34Var.g;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objI);
            g24 g24VarM = l34Var.m();
            long j = q24Var.a;
            long j2 = q24Var.b;
            i34Var.d = l34Var;
            i34Var.g = 1;
            g24VarM.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM comments WHERE  parent_chat_server_id = ? AND parent_message_server_id = ? AND msg_link_type = 1 AND msg_link_id IN (");
            int size = list.size();
            vd7.b(sb, size);
            sb.append(") AND status != ");
            sb.append("?");
            objI = ch3.I(i34Var, g24VarM.a, true, false, new o14(sb.toString(), j, j2, list, size, g24VarM, wja.DELETED));
            if (objI != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objI);
                return objI;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        l34Var = i34Var.d;
        ch3.d0(objI);
        i34Var.d = null;
        i34Var.g = 2;
        Object objA = l34Var.A((List) objI, i34Var);
        return objA == hu4Var ? hu4Var : objA;
    }

    public final Object y(q24 q24Var, final List list, nq4 nq4Var) {
        final g24 g24VarM = m();
        final long j = q24Var.a;
        final long j2 = q24Var.b;
        g24VarM.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE comments SET text = NULL, elements = ?, attaches = NULL, status = ?, media_type = 0  WHERE parent_chat_server_id = ? AND parent_message_server_id = ? AND id IN (");
        final String strX = nbh.x(") ", sb, list);
        rre rreVar = g24VarM.a;
        final r66 r66Var = r66.a;
        final wja wjaVar = wja.DELETED;
        Object objI = ch3.I(nq4Var, rreVar, false, true, new cf7() { // from class: y14
            @Override // defpackage.cf7
            public final Object invoke(Object obj) throws Exception {
                g24 g24Var = g24VarM;
                List list2 = r66Var;
                wja wjaVar2 = wjaVar;
                long j3 = j;
                long j4 = j2;
                List list3 = list;
                vxe vxeVarO0 = ((qxe) obj).O0(strX);
                try {
                    g24Var.a().getClass();
                    vxeVarO0.d(1, dga.b(list2));
                    g24Var.a().getClass();
                    vxeVarO0.c(2, wjaVar2.a);
                    vxeVarO0.c(3, j3);
                    vxeVarO0.c(4, j4);
                    Iterator it = list3.iterator();
                    int i = 5;
                    while (it.hasNext()) {
                        vxeVarO0.c(i, ((Number) it.next()).longValue());
                        i++;
                    }
                    vxeVarO0.M0();
                    return sbi.a;
                } finally {
                    vxeVarO0.close();
                }
            }
        });
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(uy3 uy3Var, nq4 nq4Var) {
        k34 k34Var;
        jy3 jy3VarB;
        jy3 jy3Var;
        jy3 jy3Var2;
        if (nq4Var instanceof k34) {
            k34Var = (k34) nq4Var;
            int i = k34Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                k34Var.h = i - Integer.MIN_VALUE;
            } else {
                k34Var = new k34(this, nq4Var);
            }
        } else {
            k34Var = new k34(this, nq4Var);
        }
        Object obj = k34Var.f;
        int i2 = k34Var.h;
        if (i2 == 0) {
            ch3.d0(obj);
            jy3VarB = dnl.b(uy3Var);
            long j = uy3Var.t;
            if (j > 0) {
                k34Var.d = jy3VarB;
                k34Var.e = jy3VarB;
                k34Var.h = 1;
                Object objR = r(j, k34Var);
                Object obj2 = hu4.a;
                if (objR == obj2) {
                    return obj2;
                }
                jy3Var = jy3VarB;
                obj = objR;
                jy3Var2 = jy3Var;
            }
            return jy3VarB.a();
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jy3Var2 = k34Var.e;
        jy3Var = k34Var.d;
        ch3.d0(obj);
        jy3Var2.q = (ky3) obj;
        jy3VarB = jy3Var;
        return jy3VarB.a();
    }
}
