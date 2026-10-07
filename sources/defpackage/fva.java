package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class fva {
    public static final /* synthetic */ zv8[] v;
    public final ita a;
    public final xt4 b;
    public final gu4 c;
    public final gjg d;
    public final gjg e;
    public final rea f;
    public final lh9 g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final cm7 k;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final mjg s;
    public final nr2 t;
    public final a6f u;
    public final String l = fva.class.getName();
    public final p3c p = qyj.S();
    public final AtomicReference q = new AtomicReference(null);
    public final AtomicReference r = new AtomicReference(null);

    static {
        z8b z8bVar = new z8b(fva.class, "scrollClickJob", "getScrollClickJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        v = new zv8[]{z8bVar};
    }

    public fva(ita itaVar, xt4 xt4Var, dq4 dq4Var, r8e r8eVar, r8e r8eVar2, rea reaVar, lh9 lh9Var, boolean z, boolean z2, ny8 ny8Var, int i, cm7 cm7Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = itaVar;
        this.b = xt4Var;
        this.c = dq4Var;
        this.d = r8eVar;
        this.e = r8eVar2;
        this.f = reaVar;
        this.g = lh9Var;
        this.h = z;
        this.i = z2;
        this.j = i;
        this.k = cm7Var;
        this.m = ny8Var;
        this.n = ny8Var2;
        this.o = ny8Var3;
        rt2 rt2Var = (rt2) r8eVar.a.getValue();
        j6f j6fVar = j6f.f;
        mjg mjgVarA = p90.a(rt2Var != null ? j6f.a(j6fVar, rt2Var.b.m, rt2Var.O(), rt2Var.U(), null, false, 24) : j6fVar);
        this.s = mjgVarA;
        r8e r8eVar3 = new r8e(mjgVarA);
        ghb ghbVar = ew5.b;
        this.t = tre.G0(r8eVar3, qe7.P(60L, lw5.MILLISECONDS));
        this.u = new a6f();
    }

    public static /* synthetic */ Object d(fva fvaVar, long j, i5f i5fVar, boolean z, mdh mdhVar, int i) {
        if ((i & 2) != 0) {
            i5fVar = i5f.a;
        }
        i5f i5fVar2 = i5fVar;
        if ((i & 4) != 0) {
            z = false;
        }
        return fvaVar.c(j, i5fVar2, z, mdhVar);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    public static void e(fva fvaVar, final long j, long j2, int i, int i2) {
        i5f i5fVar = i5f.b;
        long j3 = (i2 & 2) != 0 ? 0L : j2;
        if ((i2 & 4) != 0) {
            i5fVar = i5f.a;
        }
        int i3 = (i2 & 8) != 0 ? 4 : i;
        gjg gjgVar = fvaVar.e;
        boolean z = false;
        if (i3 == 1) {
            int iD = ((opa) gjgVar.getValue()).d(j);
            if (iD < 0) {
                iD = Math.abs(iD) - 1;
            }
            if (iD >= 0) {
                z = true;
            }
        } else if (((opa) gjgVar.getValue()).d(j) >= 0) {
            z = true;
        }
        String str = fvaVar.l;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, qt4.k(j3, ", lastMsgTime:", qt4.u(j, "loadIfNeedAndScrollToMessageByTime: is message with time=", " loaded=", z)), null);
            }
        }
        AtomicReference atomicReference = fvaVar.q;
        if (!z) {
            final i5f i5fVar2 = i5fVar;
            final int i4 = i3;
            final int i5 = 1;
            atomicReference.updateAndGet(new UnaryOperator() { // from class: zua
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    switch (i5) {
                        case 0:
                            break;
                    }
                    return new bva(i4, false, false, i5fVar2, 0L, j, 0, 86);
                }
            });
            fvaVar.g.invoke(new Long(j));
            return;
        }
        if (j3 == 0) {
            atomicReference.updateAndGet(new g23(5));
            fvaVar.r.set(null);
            a6f.j(fvaVar.u, j, i5fVar, 0L, 12);
            return;
        }
        long j4 = j3;
        final i5f i5fVar3 = i5fVar;
        if (j4 >= j) {
            atomicReference.updateAndGet(new g23(5));
            fvaVar.r.set(null);
            a6f.j(fvaVar.u, j4, i5fVar3, 0L, 12);
            return;
        }
        final int i6 = 0;
        final int i7 = i3;
        atomicReference.updateAndGet(new UnaryOperator() { // from class: zua
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i6) {
                    case 0:
                        break;
                }
                return new bva(i7, false, false, i5fVar3, 0L, j, 0, 86);
            }
        });
        rt2 rt2Var = (rt2) fvaVar.d.getValue();
        if (rt2Var != null) {
            fvaVar.a((opa) fvaVar.e.getValue(), rt2Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x026b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0138  */
    /* JADX WARN: Code duplicated, block: B:75:0x019c  */
    public final void a(opa opaVar, rt2 rt2Var) {
        List listS;
        Object obj;
        Long lValueOf;
        Object obj2;
        Object obj3;
        i5f i5fVar;
        long j;
        Object next;
        i5f i5fVar2 = i5f.a;
        i5f i5fVar3 = i5f.b;
        je9 je9Var = je9.d;
        bva bvaVar = (bva) this.q.get();
        if (bvaVar == null) {
            return;
        }
        this.r.set(null);
        String str = this.l;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "Process scroll work: " + bvaVar, null);
        }
        long j2 = bvaVar.e;
        long j3 = bvaVar.f;
        List list = opaVar.a;
        rt2Var.getClass();
        if ((rt2Var instanceof s04) && j3 == 1) {
            Iterator it = opaVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                MessageModel messageModel = (MessageModel) next;
                if (!messageModel.r() && !messageModel.w()) {
                    break;
                }
            }
            MessageModel messageModel2 = (MessageModel) next;
            if (messageModel2 != null) {
                a6f.e(this.u, messageModel2.c, i5fVar2, false, false, bvaVar.g, 52);
                this.q.updateAndGet(new g23(5));
                String str2 = this.l;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, "Process scroll work special case (scroll to first comment): " + bvaVar + ", finished", null);
                    return;
                }
                return;
            }
            if (opaVar.c || opaVar.b) {
                return;
            }
            this.q.updateAndGet(new g23(5));
            String str3 = this.l;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str3, "Process scroll work special case (no comments, clear work): " + bvaVar + ", finished", null);
                return;
            }
            return;
        }
        List list2 = opaVar.a;
        Long l = (Long) rt2Var.b.e.get(Long.valueOf(((s7f) ((et3) this.n.getValue())).t()));
        if (!this.h || !rt2Var.F0()) {
            vg4 vg4VarW = rt2Var.w();
            if (this.i && vg4VarW != null && !vg4VarW.E() && (listS = vg4VarW.s()) != null && !listS.isEmpty()) {
                if (list2.isEmpty() && !opaVar.c) {
                    if (l == null || ((MessageModel) ww3.r1(list2)).c > l.longValue()) {
                        a6f a6fVar = this.u;
                        a6fVar.getClass();
                        a6f.e(a6fVar, Long.MIN_VALUE, i5fVar3, false, false, 0, 124);
                        this.q.updateAndGet(new g23(5));
                        String str4 = this.l;
                        a4c a4cVar4 = gm0.f;
                        if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                            a4cVar4.c(je9Var, str4, "Process scroll work special case (scroll to top): " + bvaVar + ", finished", null);
                            return;
                        }
                        return;
                    }
                }
            }
        } else if (list2.isEmpty()) {
        }
        if (j2 != 0) {
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i5fVar = i5fVar2;
                    i = -1;
                    j = -1;
                    break;
                } else {
                    MessageModel messageModel3 = (MessageModel) list.get(i);
                    i5fVar = i5fVar2;
                    if (messageModel3.a == j2) {
                        j = messageModel3.c;
                        break;
                    } else {
                        i++;
                        i5fVar2 = i5fVar;
                    }
                }
            }
            int i2 = i;
            if (j != -1) {
                int i3 = bvaVar.a;
                ((f9b) this.u.b).setValue(new x5f(j, false, !bvaVar.c, (i3 == 2 || i3 == 3) ? i5fVar3 : i5fVar, bvaVar.b, i2, j2, bvaVar.g));
                this.q.updateAndGet(new g23(5));
                String str5 = this.l;
                a4c a4cVar5 = gm0.f;
                if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                    a4cVar5.c(je9Var, str5, "Process scroll work: " + bvaVar + ", finished", null);
                    return;
                }
                return;
            }
            return;
        }
        if (j3 != -1) {
            if (bvaVar.a == 1 && rt2Var.O()) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    Object next2 = it2.next();
                    if (((MessageModel) next2).c > j3) {
                        obj3 = next2;
                        break;
                    }
                }
                MessageModel messageModel4 = (MessageModel) obj3;
                if (messageModel4 != null) {
                    lValueOf = Long.valueOf(messageModel4.c);
                } else {
                    lValueOf = null;
                }
            } else if (bvaVar.a == 4) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    Object next3 = it3.next();
                    MessageModel messageModel5 = (MessageModel) next3;
                    if (j3 == 0 || messageModel5.c == j3) {
                        obj2 = next3;
                        break;
                    }
                }
                MessageModel messageModel6 = (MessageModel) obj2;
                if (messageModel6 != null) {
                    lValueOf = Long.valueOf(messageModel6.c);
                } else {
                    lValueOf = null;
                }
            } else {
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next4 = it4.next();
                    if (((MessageModel) next4).c >= j3) {
                        obj = next4;
                        break;
                    }
                }
                MessageModel messageModel7 = (MessageModel) obj;
                if (messageModel7 != null) {
                    lValueOf = Long.valueOf(messageModel7.c);
                } else {
                    lValueOf = null;
                }
            }
            if (lValueOf == null || lValueOf.longValue() == -1) {
                return;
            }
            a6f.e(this.u, lValueOf.longValue(), ((bvaVar.a != 2 || rt2Var.b.m <= 0) && bvaVar.d != i5fVar3) ? i5fVar2 : i5fVar3, bvaVar.b, !bvaVar.c, bvaVar.g, 48);
            this.q.updateAndGet(new g23(5));
            String str6 = this.l;
            a4c a4cVar6 = gm0.f;
            if (a4cVar6 != null && a4cVar6.b(je9Var)) {
                a4cVar6.c(je9Var, str6, "Process scroll work: " + bvaVar + ", finished", null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(rt2 rt2Var, nq4 nq4Var) {
        cva cvaVar;
        je9 je9Var = je9.d;
        if (nq4Var instanceof cva) {
            cvaVar = (cva) nq4Var;
            int i = cvaVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                cvaVar.g = i - Integer.MIN_VALUE;
            } else {
                cvaVar = new cva(this, nq4Var);
            }
        } else {
            cvaVar = new cva(this, nq4Var);
        }
        Object objF = cvaVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = cvaVar.g;
        if (i2 == 0) {
            ch3.d0(objF);
            ita itaVar = this.a;
            if (itaVar.d == 0) {
                long j = itaVar.c;
                if (j != 0) {
                    ava avaVar = new ava(j, 0, 6, false);
                    String str = this.l;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "getMessageAnchor: loadMark=".concat(vd7.K(new Long(j))), null);
                    }
                    return avaVar;
                }
                if (sol.e(itaVar.b)) {
                    ava avaVar2 = new ava(1L, 0, 4, false);
                    String str2 = this.l;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str2, "getMessageAnchor: delayed: currentTime=".concat(vd7.K(new Long(1L))), null);
                    }
                    return avaVar2;
                }
                rt2Var.getClass();
                if (rt2Var instanceof s04) {
                    return new ava(this.j, 1L, false);
                }
                nx2 nx2Var = rt2Var.b;
                if ((nx2Var.W <= 0 && nx2Var.X == 0) || rt2Var.O()) {
                    long jC = pll.c(rt2Var);
                    ava avaVar3 = new ava(jC, 0, 4, true);
                    String str3 = this.l;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        a4cVar3.c(je9Var, str3, "getMessageAnchor: chatReadMark=".concat(vd7.K(new Long(jC))), null);
                    }
                    return avaVar3;
                }
                nx2 nx2Var2 = rt2Var.b;
                long j2 = nx2Var2.W;
                int i3 = nx2Var2.X;
                if (j2 == 0 && i3 == 1) {
                    i3 = 0;
                }
                ava avaVar4 = new ava(i3, j2, false);
                String str4 = this.l;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                    a4cVar4.c(je9Var, str4, nbh.r(i3, "getMessageAnchor: restore last position=", vd7.K(new Long(j2)), " with offset="), null);
                }
                return avaVar4;
            }
            j44 j44Var = (j44) this.m.getValue();
            long j3 = this.a.d;
            cvaVar.d = rt2Var;
            cvaVar.g = 1;
            objF = j44Var.f(j3, cvaVar);
            if (objF == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rt2Var = cvaVar.d;
            ch3.d0(objF);
        }
        sfa sfaVar = (sfa) objF;
        if (sfaVar != null) {
            long jY = sfaVar.y();
            ava avaVar5 = new ava(jY, 0, 6, false);
            String str5 = this.l;
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                a4cVar5.c(je9Var, str5, "getMessageAnchor: loadMessageIdMark=".concat(vd7.K(new Long(jY))), null);
            }
            return avaVar5;
        }
        long jC2 = pll.c(rt2Var);
        ava avaVar6 = new ava(jC2, 0, 6, false);
        String str6 = this.l;
        a4c a4cVar6 = gm0.f;
        if (a4cVar6 != null && a4cVar6.b(je9Var)) {
            StringBuilder sbB = nbh.B(this.a.d, "getMessageAnchor: Fallback on chatReadMark=", vd7.K(new Long(jC2)), " \n                                    |cause of loadMessageId=");
            sbB.append(" doesn't exists");
            a4cVar6.c(je9Var, str6, s5h.y0(sbB.toString()), null);
        }
        return avaVar6;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object c(long j, i5f i5fVar, boolean z, nq4 nq4Var) {
        dva dvaVar;
        final i5f i5fVar2;
        final long j2 = j;
        final boolean z2 = z;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof dva) {
            dvaVar = (dva) nq4Var;
            int i = dvaVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                dvaVar.i = i - Integer.MIN_VALUE;
            } else {
                dvaVar = new dva(this, nq4Var);
            }
        } else {
            dvaVar = new dva(this, nq4Var);
        }
        Object objF = dvaVar.g;
        hu4 hu4Var = hu4.a;
        int i2 = dvaVar.i;
        if (i2 == 0) {
            ch3.d0(objF);
            MessageModel messageModelH = ((opa) this.e.getValue()).h(j2);
            String str = this.l;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, qv1.k("loadIfNeedAndScrollToMessage=", messageModelH != null ? messageModelH.x() : null), null);
                }
            }
            if (messageModelH != null) {
                this.q.updateAndGet(new g23(5));
                this.r.set(null);
                a6f a6fVar = this.u;
                long j3 = messageModelH.c;
                if (z2) {
                    a6f.i(a6fVar, j3, i5fVar, 0, 12);
                    return sbiVar;
                }
                a6f.j(a6fVar, j3, i5fVar, 0L, 12);
                return sbiVar;
            }
            j44 j44Var = (j44) this.m.getValue();
            i5fVar2 = i5fVar;
            dvaVar.e = i5fVar2;
            dvaVar.d = j2;
            dvaVar.f = z2;
            dvaVar.i = 1;
            objF = j44Var.f(j2, dvaVar);
            if (objF == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = dvaVar.f;
            long j4 = dvaVar.d;
            i5f i5fVar3 = dvaVar.e;
            ch3.d0(objF);
            z2 = z3;
            j2 = j4;
            i5fVar2 = i5fVar3;
        }
        sfa sfaVar = (sfa) objF;
        if (sfaVar != null) {
            this.q.updateAndGet(new UnaryOperator() { // from class: yua
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new bva(4, false, z2, i5fVar2, j2, 0L, 0, 98);
                }
            });
            this.g.invoke(new Long(sfaVar.y()));
            return sbiVar;
        }
        String str2 = this.l;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            je9 je9Var2 = je9.f;
            if (a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str2, zo5.j(j2, "Trying to scroll for non-existing messageId="), null);
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object f(rt2 rt2Var, opa opaVar, nq4 nq4Var) {
        eva evaVar;
        rt2 rt2Var2 = rt2Var;
        opa opaVar2 = opaVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof eva) {
            evaVar = (eva) nq4Var;
            int i = evaVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                evaVar.h = i - Integer.MIN_VALUE;
            } else {
                evaVar = new eva(this, nq4Var);
            }
        } else {
            evaVar = new eva(this, nq4Var);
        }
        Object obj = evaVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = evaVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            int size = opaVar2.a.size();
            evaVar.d = rt2Var2;
            evaVar.e = opaVar2;
            evaVar.h = 1;
            mjg mjgVar = this.s;
            mjgVar.j(null, j6f.a((j6f) mjgVar.getValue(), rt2Var2.b.m, ((j6f) this.s.getValue()).b, rt2Var2.U(), null, size > 0, 8));
            String str = this.l;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Update scroll btn, state=" + this.s.getValue() + ", hasMessages:" + (size != 0), null);
                }
            }
            String str2 = rt2Var2.b.k0;
            if (str2 != null && str2.length() != 0 && size != 0) {
                yab.i0(this.c, null, 0, new wz6(rt2Var2, this, (lq4) null, 19), 3);
            }
            if (sbiVar == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            opa opaVar3 = evaVar.e;
            rt2 rt2Var3 = evaVar.d;
            ch3.d0(obj);
            opaVar2 = opaVar3;
            rt2Var2 = rt2Var3;
        }
        a(opaVar2, rt2Var2);
        return sbiVar;
    }

    public final void g(sgg sggVar) {
        this.p.B(this, v[0], sggVar);
    }
}
