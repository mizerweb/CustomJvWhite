package one.me.pinbars.pinnedmessage;

import defpackage.a0b;
import defpackage.a4c;
import defpackage.ag3;
import defpackage.ch3;
import defpackage.dq4;
import defpackage.e9i;
import defpackage.fda;
import defpackage.fz6;
import defpackage.gjg;
import defpackage.gm0;
import defpackage.gu4;
import defpackage.hu4;
import defpackage.j3;
import defpackage.je9;
import defpackage.jz;
import defpackage.l0d;
import defpackage.lq4;
import defpackage.m0d;
import defpackage.mjg;
import defpackage.n0c;
import defpackage.nq4;
import defpackage.ny8;
import defpackage.ore;
import defpackage.p90;
import defpackage.q0d;
import defpackage.q24;
import defpackage.q8e;
import defpackage.r0d;
import defpackage.rea;
import defpackage.rt2;
import defpackage.sbi;
import defpackage.sfa;
import defpackage.sgg;
import defpackage.sua;
import defpackage.t0d;
import defpackage.tnh;
import defpackage.u0d;
import defpackage.u5c;
import defpackage.v0d;
import defpackage.w0d;
import defpackage.wf0;
import defpackage.xhh;
import defpackage.xn3;
import defpackage.xnh;
import java.util.concurrent.CancellationException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public final gjg a;
    public final xhh b;
    public final ag3 c;
    public final gu4 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public sgg l;
    public final mjg m = p90.a(null);
    public final String n = b.class.getName();

    public b(gjg gjgVar, xhh xhhVar, ny8 ny8Var, ag3 ag3Var, ny8 ny8Var2, dq4 dq4Var, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, u0d u0dVar, ny8 ny8Var6, ny8 ny8Var7) {
        this.a = gjgVar;
        this.b = xhhVar;
        this.c = ag3Var;
        this.d = dq4Var;
        this.e = ny8Var2;
        this.f = ny8Var;
        this.g = ny8Var3;
        this.h = ny8Var4;
        this.i = ny8Var5;
        this.j = ny8Var6;
        this.k = ny8Var7;
        int i = 0;
        e9i.j0(new j3(e9i.T(new fz6(new fz6(e9i.m0(e9i.H(new jz(gjgVar, 13), new wf0(19)), new jz(new q0d(new q8e(u0dVar.e), this, i), 13)), new l0d(this, (lq4) null, i)), new rea(2, this, b.class, "updatePinnedMessage", "updatePinnedMessage(Lru/ok/tamtam/chats/Chat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 11), 3), ((n0c) xhhVar).a()), 14, new a(this, null)), dq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(b bVar, t0d t0dVar, rt2 rt2Var, nq4 nq4Var) {
        m0d m0dVar;
        if (nq4Var instanceof m0d) {
            m0dVar = (m0d) nq4Var;
            int i = m0dVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                m0dVar.h = i - Integer.MIN_VALUE;
            } else {
                m0dVar = new m0d(bVar, nq4Var);
            }
        } else {
            m0dVar = new m0d(bVar, nq4Var);
        }
        Object objF = m0dVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = m0dVar.h;
        if (i2 == 0) {
            ch3.d0(objF);
            fda fdaVar = rt2Var.e;
            if (fdaVar != null && fdaVar.a.a == t0dVar.b) {
                return Boolean.TRUE;
            }
            if (t0dVar.b == 0 || rt2Var.b.M == 0) {
                return Boolean.FALSE;
            }
            sua suaVar = (sua) bVar.j.getValue();
            long j = t0dVar.b;
            m0dVar.d = t0dVar;
            m0dVar.e = rt2Var;
            m0dVar.h = 1;
            objF = suaVar.f(j, m0dVar);
            if (objF == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rt2Var = m0dVar.e;
            t0dVar = m0dVar.d;
            ch3.d0(objF);
        }
        sfa sfaVar = (sfa) objF;
        if (sfaVar != null) {
            return Boolean.valueOf(sfaVar.b == rt2Var.b.M);
        }
        String str = bVar.n;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "no message for #" + t0dVar.b + ", chat=" + rt2Var + " ", null);
            }
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x012e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0136  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01dd  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011a, code lost:
    
        if (r0 == r6) goto L71;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0136, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(one.me.pinbars.pinnedmessage.b r20, defpackage.rt2 r21, defpackage.lq4 r22) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.pinbars.pinnedmessage.b.b(one.me.pinbars.pinnedmessage.b, rt2, lq4):java.lang.Object");
    }

    public final mjg c() {
        return this.m;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:60:0x010f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0133  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public final Object d(q24 q24Var, nq4 nq4Var) {
        r0d r0dVar;
        q24 q24Var2;
        rt2 rt2Var;
        String str;
        a4c a4cVar;
        rt2 rt2Var2;
        sfa sfaVar;
        rt2 rt2Var3;
        sfa sfaVar2;
        a0b a0bVar;
        CharSequence charSequenceI0;
        q24 q24Var3 = q24Var;
        je9 je9Var = je9.f;
        sbi sbiVar = sbi.a;
        Object w0dVar = v0d.a;
        if (nq4Var instanceof r0d) {
            r0dVar = (r0d) nq4Var;
            int i = r0dVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                r0dVar.i = i - Integer.MIN_VALUE;
            } else {
                r0dVar = new r0d(this, nq4Var);
            }
        } else {
            r0dVar = new r0d(this, nq4Var);
        }
        r0d r0dVar2 = r0dVar;
        Object objI = r0dVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = r0dVar2.i;
        try {
            try {
                if (i2 == 0) {
                    ch3.d0(objI);
                    xn3 xn3Var = (xn3) this.k.getValue();
                    long j = q24Var3.a;
                    r0dVar2.d = q24Var3;
                    r0dVar2.i = 1;
                    objI = xn3Var.i(j, r0dVar2);
                    if (objI != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i2 == 1) {
                    q24Var3 = r0dVar2.d;
                    ch3.d0(objI);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sfaVar2 = r0dVar2.f;
                        rt2Var3 = r0dVar2.e;
                        try {
                            ch3.d0(objI);
                        } catch (Throwable th) {
                            th = th;
                            gm0.V(this.n, "comments: fail to fetch missed contacts", th);
                        }
                        charSequenceI0 = rt2Var3.I0(ru.ok.tamtam.messages.a.a((ru.ok.tamtam.messages.a) this.h.getValue(), sfaVar2));
                        mjg mjgVar = this.m;
                        if (charSequenceI0 != null && charSequenceI0.length() != 0) {
                            w0dVar = new w0d(sfaVar2.a, new tnh(R.string.oneme_channel_pinned_message_title), new xnh(charSequenceI0), false, u5c.b);
                        }
                        mjgVar.getClass();
                        mjgVar.j(null, w0dVar);
                        return sbiVar;
                    }
                    rt2Var = r0dVar2.e;
                    q24Var2 = r0dVar2.d;
                    try {
                        ch3.d0(objI);
                    } catch (Throwable unused) {
                        str = this.n;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            a4cVar.c(je9Var, str, "comments: fail to select post for " + q24Var2, null);
                        }
                        objI = null;
                    }
                    rt2Var2 = rt2Var;
                    sfaVar = (sfa) objI;
                    if (sfaVar == null) {
                        mjg mjgVar2 = this.m;
                        mjgVar2.getClass();
                        mjgVar2.j(null, w0dVar);
                        return sbiVar;
                    }
                    try {
                        a0bVar = (a0b) this.i.getValue();
                        r0dVar2.d = null;
                        r0dVar2.e = rt2Var2;
                        r0dVar2.f = sfaVar;
                        r0dVar2.i = 3;
                        if (a0b.p(a0bVar, sfaVar, r0dVar2) != hu4Var) {
                            rt2Var3 = rt2Var2;
                            sfaVar2 = sfaVar;
                            charSequenceI0 = rt2Var3.I0(ru.ok.tamtam.messages.a.a((ru.ok.tamtam.messages.a) this.h.getValue(), sfaVar2));
                            mjg mjgVar3 = this.m;
                            if (charSequenceI0 != null) {
                                w0dVar = new w0d(sfaVar2.a, new tnh(R.string.oneme_channel_pinned_message_title), new xnh(charSequenceI0), false, u5c.b);
                            }
                            mjgVar3.getClass();
                            mjgVar3.j(null, w0dVar);
                            return sbiVar;
                        }
                        return hu4Var;
                    } catch (Throwable th2) {
                        th = th2;
                        rt2Var3 = rt2Var2;
                        sfaVar2 = sfaVar;
                        gm0.V(this.n, "comments: fail to fetch missed contacts", th);
                    }
                }
                rt2 rt2Var4 = (rt2) objI;
                if (rt2Var4 == null) {
                    String str2 = this.n;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str2, "comments: parent chat not found for " + q24Var3, null);
                    }
                    mjg mjgVar4 = this.m;
                    mjgVar4.getClass();
                    mjgVar4.j(null, w0dVar);
                    return sbiVar;
                }
                try {
                    sua suaVar = (sua) this.j.getValue();
                    long j2 = rt2Var4.a;
                    long j3 = q24Var3.b;
                    r0dVar2.d = q24Var3;
                    r0dVar2.e = rt2Var4;
                    r0dVar2.f = null;
                    r0dVar2.i = 2;
                    Object objP = suaVar.p(j2, j3, r0dVar2);
                    if (objP != hu4Var) {
                        objI = objP;
                        rt2Var = rt2Var4;
                        rt2Var2 = rt2Var;
                        sfaVar = (sfa) objI;
                        if (sfaVar == null) {
                            mjg mjgVar5 = this.m;
                            mjgVar5.getClass();
                            mjgVar5.j(null, w0dVar);
                            return sbiVar;
                        }
                        a0bVar = (a0b) this.i.getValue();
                        r0dVar2.d = null;
                        r0dVar2.e = rt2Var2;
                        r0dVar2.f = sfaVar;
                        r0dVar2.i = 3;
                        if (a0b.p(a0bVar, sfaVar, r0dVar2) != hu4Var) {
                            rt2Var3 = rt2Var2;
                            sfaVar2 = sfaVar;
                            charSequenceI0 = rt2Var3.I0(ru.ok.tamtam.messages.a.a((ru.ok.tamtam.messages.a) this.h.getValue(), sfaVar2));
                            mjg mjgVar6 = this.m;
                            if (charSequenceI0 != null) {
                                w0dVar = new w0d(sfaVar2.a, new tnh(R.string.oneme_channel_pinned_message_title), new xnh(charSequenceI0), false, u5c.b);
                            }
                            mjgVar6.getClass();
                            mjgVar6.j(null, w0dVar);
                            return sbiVar;
                        }
                    }
                } catch (Throwable unused2) {
                    q24Var2 = q24Var3;
                    rt2Var = rt2Var4;
                    str = this.n;
                    a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "comments: fail to select post for " + q24Var2, null);
                    }
                    objI = null;
                }
                return hu4Var;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
