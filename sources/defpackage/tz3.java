package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class tz3 implements spa {
    public static final /* synthetic */ zv8[] k;
    public final q24 a;
    public final d0c b;
    public final c7k c;
    public final gu4 d;
    public final String e = tz3.class.getName();
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ex8 j;

    static {
        z8b z8bVar = new z8b(tz3.class, "commentedPostJob", "getCommentedPostJob()Lkotlinx/coroutines/Deferred;");
        zfe.a.getClass();
        k = new zv8[]{z8bVar};
    }

    public tz3(q24 q24Var, d0c d0cVar, c7k c7kVar, dq4 dq4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = q24Var;
        this.b = d0cVar;
        this.c = c7kVar;
        this.d = dq4Var;
        this.f = ny8Var;
        this.g = ny8Var2;
        this.h = ny8Var3;
        this.i = ny8Var4;
        ex8 ex8Var = new ex8(12);
        this.j = ex8Var;
        ex8Var.B(this, k[0], yab.h(dq4Var, null, 0, new nz3(this, null, 0), 3));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Serializable b(tz3 tz3Var, nq4 nq4Var) {
        rz3 rz3Var;
        rt2 rt2Var;
        sfa sfaVar;
        rt2 rt2Var2;
        String str;
        a4c a4cVar;
        MessageModel messageModel;
        String str2;
        a4c a4cVar2;
        je9 je9Var = je9.f;
        if (nq4Var instanceof rz3) {
            rz3Var = (rz3) nq4Var;
            int i = rz3Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                rz3Var.g = i - Integer.MIN_VALUE;
            } else {
                rz3Var = new rz3(tz3Var, nq4Var);
            }
        } else {
            rz3Var = new rz3(tz3Var, nq4Var);
        }
        rz3 rz3Var2 = rz3Var;
        Object objI = rz3Var2.e;
        hu4 hu4Var = hu4.a;
        int i2 = rz3Var2.g;
        if (i2 == 0) {
            ch3.d0(objI);
            xn3 xn3Var = (xn3) tz3Var.f.getValue();
            long j = tz3Var.a.a;
            rz3Var2.g = 1;
            objI = xn3Var.i(j, rz3Var2);
            if (objI != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            ch3.d0(objI);
        } else {
            if (i2 == 2) {
                rt2Var = rz3Var2.d;
                ch3.d0(objI);
                sfaVar = (sfa) objI;
                if (sfaVar != null) {
                    rz3Var2.d = rt2Var;
                    rz3Var2.g = 3;
                    objI = tz3Var.c(rt2Var, rz3Var2, sfaVar);
                    if (objI != hu4Var) {
                        rt2Var2 = rt2Var;
                    }
                    return hu4Var;
                }
                str = tz3Var.e;
                a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "local message not found for " + tz3Var.a, null);
                    return null;
                }
                return null;
            }
            if (i2 != 3) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rt2Var2 = rz3Var2.d;
            ch3.d0(objI);
        }
        messageModel = (MessageModel) objI;
        if (messageModel == null) {
            return new ylc(new Long(rt2Var2.a), messageModel);
        }
        str2 = tz3Var.e;
        a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "message model is null for " + tz3Var.a, null);
        }
        return null;
        rt2 rt2Var3 = (rt2) objI;
        if (rt2Var3 != null) {
            sua suaVar = (sua) tz3Var.g.getValue();
            long j2 = rt2Var3.a;
            long j3 = tz3Var.a.b;
            rz3Var2.d = rt2Var3;
            rz3Var2.g = 2;
            Object objP = suaVar.p(j2, j3, rz3Var2);
            if (objP != hu4Var) {
                rt2Var = rt2Var3;
                objI = objP;
                sfaVar = (sfa) objI;
                if (sfaVar != null) {
                    str = tz3Var.e;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4cVar.c(je9Var, str, "local message not found for " + tz3Var.a, null);
                        return null;
                    }
                } else {
                    rz3Var2.d = rt2Var;
                    rz3Var2.g = 3;
                    objI = tz3Var.c(rt2Var, rz3Var2, sfaVar);
                    if (objI != hu4Var) {
                        rt2Var2 = rt2Var;
                        messageModel = (MessageModel) objI;
                        if (messageModel == null) {
                            return new ylc(new Long(rt2Var2.a), messageModel);
                        }
                        str2 = tz3Var.e;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            a4cVar2.c(je9Var, str2, "message model is null for " + tz3Var.a, null);
                        }
                    }
                }
            }
            return hu4Var;
        }
        String str3 = tz3Var.e;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, str3, "local chat not found for " + tz3Var.a, null);
            return null;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x007f, please report this as an issue */
    @Override // defpackage.spa
    public final Object a(rt2 rt2Var, opa opaVar, lq4 lq4Var) {
        oz3 oz3Var;
        ylc ylcVar;
        String str;
        a4c a4cVar;
        je9 je9Var;
        r66 r66Var = r66.a;
        if (lq4Var instanceof oz3) {
            oz3Var = (oz3) lq4Var;
            int i = oz3Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                oz3Var.f = i - Integer.MIN_VALUE;
            } else {
                oz3Var = new oz3(this, (nq4) lq4Var);
            }
        } else {
            oz3Var = new oz3(this, (nq4) lq4Var);
        }
        Object objZ0 = oz3Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = oz3Var.f;
        try {
            if (i2 == 0) {
                ch3.d0(objZ0);
                if (!opaVar.b || opaVar.a.size() != 1 || ((MessageModel) ww3.r1(opaVar.a)).b != -1) {
                    xf5 xf5Var = (xf5) this.j.m(this, k[0]);
                    if (xf5Var != null) {
                        oz3Var.f = 1;
                        objZ0 = xf5Var.z0(oz3Var);
                        if (objZ0 == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        ylcVar = null;
                    }
                    if (ylcVar == null) {
                        return Collections.singletonList((MessageModel) ylcVar.b);
                    }
                    str = this.e;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "commented post not found by " + this.a, null);
                        }
                    }
                }
                return r66Var;
            }
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objZ0);
            ylcVar = (ylc) objZ0;
            if (ylcVar == null) {
                return Collections.singletonList((MessageModel) ylcVar.b);
            }
            str = this.e;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "commented post not found by " + this.a, null);
                }
            }
            return r66Var;
        } catch (CancellationException unused) {
            vd7.q(oz3Var.getContext());
            gm0.Y(this.e, "job cancelled");
            return r66Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r14 == r11) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.rt2 r13, defpackage.nq4 r14, defpackage.sfa r15) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.sz3
            if (r0 == 0) goto L14
            r0 = r14
            sz3 r0 = (defpackage.sz3) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.h = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            sz3 r0 = new sz3
            r0.<init>(r12, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f
            int r0 = r7.h
            r9 = 2
            r1 = 1
            r10 = 0
            hu4 r11 = defpackage.hu4.a
            if (r0 == 0) goto L3b
            if (r0 == r1) goto L33
            if (r0 != r9) goto L2d
            defpackage.ch3.d0(r14)
            goto L7d
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r12)
            return r10
        L33:
            rt2 r13 = r7.e
            sfa r15 = r7.d
            defpackage.ch3.d0(r14)
            goto L5e
        L3b:
            defpackage.ch3.d0(r14)
            ny8 r14 = r12.h
            java.lang.Object r14 = r14.getValue()
            l0c r14 = (defpackage.l0c) r14
            r7.d = r15
            r7.e = r13
            r7.h = r1
            r4 = 0
            c7k r5 = r12.c
            r6 = 0
            r8 = 20
            r3 = r13
            r1 = r14
            r2 = r15
            java.lang.Object r14 = defpackage.l0c.l(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r14 != r11) goto L5c
            goto L7c
        L5c:
            r15 = r2
            r13 = r3
        L5e:
            one.me.messages.list.loader.MessageModel r14 = (one.me.messages.list.loader.MessageModel) r14
            long r0 = r15.a
            r15 = -2097153(0xffffffffffdfffff, float:NaN)
            one.me.messages.list.loader.MessageModel r14 = one.me.messages.list.loader.MessageModel.q(r14, r10, r0, r15)
            java.util.List r14 = java.util.Collections.singletonList(r14)
            r7.d = r10
            r7.e = r10
            r7.h = r9
            d0c r12 = r12.b
            r15 = 0
            java.lang.Object r14 = r12.j(r13, r15, r14, r7)
            if (r14 != r11) goto L7d
        L7c:
            return r11
        L7d:
            one.me.messages.list.loader.MessageModel r14 = (one.me.messages.list.loader.MessageModel) r14
            if (r14 == 0) goto L89
            r12 = 0
            r15 = -2
            one.me.messages.list.loader.MessageModel r12 = one.me.messages.list.loader.MessageModel.q(r14, r10, r12, r15)
            return r12
        L89:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz3.c(rt2, nq4, sfa):java.lang.Object");
    }
}
