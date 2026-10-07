package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.vk.push.core.base.DelayedAction;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.contactlist.ContactListWidget;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public final class vq extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public long g;
    public Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq(long j, xd3 xd3Var, q87 q87Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 11;
        this.g = j;
        this.h = xd3Var;
        this.i = q87Var;
    }

    private final Object l(Object obj) {
        Set setX;
        long j = this.g;
        tm3 tm3Var = (tm3) this.i;
        mjg mjgVar = tm3Var.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            Set set = ((nm3) mjgVar.getValue()).a;
            if (set.isEmpty()) {
                setX = Collections.singleton(new Long(j));
            } else {
                setX = set.contains(new Long(j)) ? lof.X(set, new Long(j)) : lof.a0(set, new Long(j));
            }
            this.h = mjgVar;
            this.f = 1;
            obj = setX.isEmpty() ? new nm3() : tm3Var.c(setX, this);
            hu4 hu4Var = hu4.a;
            if (obj == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mjgVar = (mjg) this.h;
            ch3.d0(obj);
        }
        mjgVar.setValue(obj);
        return sbi.a;
    }

    private final Object n(Object obj) {
        mh4 mh4Var = (mh4) this.i;
        long j = this.g;
        gu4 gu4Var = (gu4) this.h;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            gm0.n(gu4Var.getClass().getName(), "block, id = " + j);
            no4 no4Var = (no4) mh4Var.a.getValue();
            this.h = null;
            this.f = 1;
            Object objD = no4Var.d(j, ii4.a, this);
            hu4 hu4Var = hu4.a;
            if (objD == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        pvb pvbVar = (pvb) mh4Var.e.getValue();
        pvb.t(pvbVar, new pm4(1, pvbVar.u().a.g(), this.g, null, null, null, null));
        qw2 qw2Var = (qw2) mh4Var.b.getValue();
        rt2 rt2VarQ = qw2Var.Q(j);
        if (rt2VarQ == null) {
            gm0.W("qw2", "UpdateDialogContact failed: chat is null", new Object[0]);
        } else {
            qw2Var.n(rt2VarQ.a);
        }
        ((whh) mh4Var.c.getValue()).f(c0a.s(j));
        ((t51) mh4Var.f.getValue()).c(new so4(j));
        return sbi.a;
    }

    private final Object o(Object obj) {
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            pzf pzfVar = ((ij4) this.h).c;
            long j = this.g;
            qfd qfdVar = (qfd) this.i;
            l8b l8bVar = ki9.a;
            l8b l8bVar2 = new l8b();
            l8bVar2.l(j, qfdVar);
            cj4 cj4Var = new cj4(l8bVar2);
            this.f = 1;
            Object objEmit = pzfVar.emit(cj4Var, this);
            hu4 hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    private final Object p(Object obj) {
        long j = this.g;
        ContactListWidget contactListWidget = (ContactListWidget) this.h;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            zv8[] zv8VarArr = ContactListWidget.o1;
            yk4 yk4VarT1 = contactListWidget.t1();
            this.f = 1;
            obj = yab.K0(((n0c) yk4VarT1.E()).a(), new tl1(yk4VarT1, j, null, 3), this);
            hu4 hu4Var = hu4.a;
            if (obj == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        List list = (List) (((List) obj).isEmpty() ? null : obj);
        if (list != null) {
            View view = (View) this.i;
            Long l = new Long(j);
            zv8[] zv8VarArr2 = ContactListWidget.o1;
            vv vvVar = contactListWidget.J;
            zv8 zv8Var = ContactListWidget.o1[3];
            vvVar.b(contactListWidget, l);
            opl.b(contactListWidget, 2).l(list).f(view).o(yl5.d().getDisplayMetrics().density * 12.0f).build().u(contactListWidget);
        }
        return sbi.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        if (r5 == r4) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object q(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x0118 A[RETURN] */
    private final Object r(Object obj) {
        sfa sfaVar;
        e70 e70VarK;
        gt4 gt4Var;
        Uri uri;
        ht4 ht4Var;
        gt4 gt4Var2;
        jt4 jt4Var = (jt4) this.i;
        yx6 yx6Var = (yx6) this.h;
        int i = this.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                ch3.d0(obj);
                sua suaVar = (sua) jt4Var.d.getValue();
                long j = this.g;
                this.h = yx6Var;
                this.f = 1;
                obj = suaVar.f(j, this);
                if (obj != hu4Var) {
                    sfaVar = (sfa) obj;
                    if (sfaVar != null) {
                        e70VarK = sfaVar.k(y60.c);
                        if (e70VarK == null && ((wd4) jt4Var.e.getValue()).h()) {
                            String str = e70VarK.u;
                            o60 o60Var = e70VarK.b;
                            String strB = o60Var != null ? o60Var.b(us0.e) : null;
                            if (str == null || str.length() == 0) {
                                str = strB;
                            }
                            if (str == null || str.length() == 0) {
                                gt4 gt4Var3 = new gt4((ynh) jt4Var.f.getValue());
                                this.h = null;
                                this.f = 3;
                                if (yx6Var.emit(gt4Var3, this) == hu4Var) {
                                }
                            } else {
                                this.h = yx6Var;
                                this.f = 4;
                                obj = lvb.L0(1000L, new qh4(jt4Var, str, null, 6), this);
                                if (obj != hu4Var) {
                                    uri = (Uri) obj;
                                    if (uri == null) {
                                        gt4Var2 = new gt4((ynh) jt4Var.f.getValue());
                                        this.h = null;
                                        this.f = 5;
                                        if (yx6Var.emit(gt4Var2, this) == hu4Var) {
                                        }
                                    } else {
                                        it3.a.A(new f92(jt4Var.a, 14, uri));
                                        if (it3.b()) {
                                            ht4Var = new ht4((ynh) jt4Var.g.getValue());
                                            this.h = null;
                                            this.f = 6;
                                            if (yx6Var.emit(ht4Var, this) == hu4Var) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            gt4Var = new gt4((ynh) jt4Var.f.getValue());
                            this.h = null;
                            this.f = 2;
                            if (yx6Var.emit(gt4Var, this) == hu4Var) {
                            }
                        }
                    }
                    return sbiVar;
                }
                return hu4Var;
            case 1:
                ch3.d0(obj);
                sfaVar = (sfa) obj;
                if (sfaVar != null) {
                    e70VarK = sfaVar.k(y60.c);
                    if (e70VarK == null) {
                    }
                    gt4Var = new gt4((ynh) jt4Var.f.getValue());
                    this.h = null;
                    this.f = 2;
                    if (yx6Var.emit(gt4Var, this) == hu4Var) {
                        return hu4Var;
                    }
                    break;
                }
                return sbiVar;
            case 2:
                ch3.d0(obj);
                return sbiVar;
            case 3:
                ch3.d0(obj);
                return sbiVar;
            case 4:
                ch3.d0(obj);
                uri = (Uri) obj;
                if (uri == null) {
                    gt4Var2 = new gt4((ynh) jt4Var.f.getValue());
                    this.h = null;
                    this.f = 5;
                    if (yx6Var.emit(gt4Var2, this) == hu4Var) {
                        return hu4Var;
                    }
                    return sbiVar;
                }
                it3.a.A(new f92(jt4Var.a, 14, uri));
                if (it3.b()) {
                    ht4Var = new ht4((ynh) jt4Var.g.getValue());
                    this.h = null;
                    this.f = 6;
                    if (yx6Var.emit(ht4Var, this) == hu4Var) {
                        return hu4Var;
                    }
                }
                return sbiVar;
            case 5:
                ch3.d0(obj);
                return sbiVar;
            case 6:
                ch3.d0(obj);
                return sbiVar;
            default:
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        if (r8 == r0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object s(java.lang.Object r45) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq.s(java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj) {
        gu4 gu4Var;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            gu4Var = (gu4) this.h;
            long j = this.g;
            this.h = gu4Var;
            this.f = 1;
            Object objT = rx8.t(j, this);
            hu4 hu4Var = hu4.a;
            if (objT == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gu4Var = (gu4) this.h;
            ch3.d0(obj);
        }
        cqk.m(gu4Var);
        if (cqk.x(gu4Var)) {
            ((DelayedAction) this.i).b.invoke();
        }
        return sbi.a;
    }

    private final Object u(Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        rt2 rt2Var = (rt2) this.h;
        lei leiVar = (lei) ((a47) this.i).b.getValue();
        long j = rt2Var.a;
        long j2 = this.g;
        long c = rt2Var.c.getC();
        this.f = 1;
        Comparable comparableA = leiVar.a(j, j2, c, (32 & 8) != 0 ? -1 : 0, (32 & 16) == 0, false, this);
        hu4 hu4Var = hu4.a;
        return comparableA == hu4Var ? hu4Var : comparableA;
    }

    private final Object v(Object obj) throws Exception {
        long j = this.g;
        gu4 gu4Var = (gu4) this.h;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            this.h = gu4Var;
            this.f = 1;
            Object objU = rx8.u(j, this);
            hu4 hu4Var = hu4.a;
            if (objU == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        if (cqk.x(gu4Var)) {
            ((sd7) this.i).c.invoke(new ew5(j));
        }
        return sbi.a;
    }

    private final Object w(Object obj) {
        long j = this.g;
        gu4 gu4Var = (gu4) this.h;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            this.h = gu4Var;
            this.f = 1;
            Object objU = rx8.u(j, this);
            hu4 hu4Var = hu4.a;
            if (objU == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        if (cqk.x(gu4Var)) {
            ((ud7) this.i).b.invoke(new ew5(j));
        }
        return sbi.a;
    }

    private final Object x(Object obj) {
        long jElapsedRealtime;
        rb8 rb8Var = (rb8) this.i;
        AtomicInteger atomicInteger = rb8Var.n;
        gu4 gu4Var = (gu4) this.h;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            jElapsedRealtime = SystemClock.elapsedRealtime();
            gm0.n(rb8.u, "prefetch " + atomicInteger.get() + ": start load real albums");
            ab8 ab8Var = new ab8(rb8Var, null);
            this.h = gu4Var;
            this.g = jElapsedRealtime;
            this.f = 1;
            obj = cqk.k(ab8Var, this);
            hu4 hu4Var = hu4.a;
            if (obj == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jElapsedRealtime = this.g;
            ch3.d0(obj);
        }
        List list = (List) obj;
        boolean zX = cqk.x(gu4Var);
        sbi sbiVar = sbi.a;
        if (!zX) {
            return sbiVar;
        }
        mjg mjgVar = rb8Var.l;
        ec6 ec6Var = new ec6(list);
        mjgVar.getClass();
        mjgVar.j(null, ec6Var);
        String str = rb8.u;
        StringBuilder sbX = zo5.x(atomicInteger.get(), SystemClock.elapsedRealtime() - jElapsedRealtime, "prefetch ", ": finish load real albums, time = ");
        sbX.append("ms");
        gm0.n(str, sbX.toString());
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                vq vqVar = new vq((xq) obj2, this.g, lq4Var, 0);
                vqVar.h = obj;
                return vqVar;
            case 1:
                return new vq(this.g, (hp0) obj2, lq4Var, 1);
            case 2:
                return new vq(this.h, lq4Var, (yt0) obj2, this.g, 2);
            case 3:
                return new vq((bw0) obj2, lq4Var, 3);
            case 4:
                return new vq((m01) this.h, (l01) obj2, this.g, lq4Var);
            case 5:
                return new vq((pe1) obj2, this.g, lq4Var, 5);
            case 6:
                return new vq((kl1) this.h, this.g, (Long) obj2, lq4Var, 6);
            case 7:
                return new vq((y92) obj2, this.g, lq4Var, 7);
            case 8:
                vq vqVar2 = new vq(this.g, (zm2) obj2, lq4Var, 8);
                vqVar2.h = obj;
                return vqVar2;
            case 9:
                vq vqVar3 = new vq((lv2) obj2, this.g, lq4Var, 9);
                vqVar3.h = obj;
                return vqVar3;
            case 10:
                return new vq((qw2) this.h, this.g, (rt2) obj2, lq4Var, 10);
            case 11:
                return new vq(this.g, (xd3) this.h, (q87) obj2, lq4Var);
            case 12:
                return new vq((wf3) obj2, this.g, lq4Var, 12);
            case 13:
                return new vq((ChatsListSearchScreen) this.h, this.g, (View) obj2, lq4Var, 13);
            case 14:
                return new vq((fk3) this.h, this.g, (gda) obj2, lq4Var, 14);
            case 15:
                return new vq((fk3) this.h, this.g, (y8f) obj2, lq4Var, 15);
            case 16:
                return new vq((ChatsListWidget) this.h, this.g, (View) obj2, lq4Var, 16);
            case 17:
                return new vq((tm3) obj2, this.g, lq4Var, 17);
            case 18:
                vq vqVar4 = new vq(this.g, (mh4) obj2, lq4Var, 18);
                vqVar4.h = obj;
                return vqVar4;
            case 19:
                return new vq((ij4) this.h, this.g, (qfd) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new vq((ContactListWidget) this.h, this.g, (View) obj2, lq4Var, 20);
            case 21:
                vq vqVar5 = new vq((nm4) obj2, this.g, lq4Var, 21);
                vqVar5.h = obj;
                return vqVar5;
            case 22:
                vq vqVar6 = new vq((jt4) obj2, this.g, lq4Var, 22);
                vqVar6.h = obj;
                return vqVar6;
            case 23:
                return new vq((cw4) obj2, lq4Var, 23);
            case 24:
                vq vqVar7 = new vq(this.g, (DelayedAction) obj2, lq4Var, 24);
                vqVar7.h = obj;
                return vqVar7;
            case 25:
                return new vq(this.h, lq4Var, (a47) obj2, this.g, 25);
            case 26:
                vq vqVar8 = new vq(this.g, (sd7) obj2, lq4Var, 26);
                vqVar8.h = obj;
                return vqVar8;
            case 27:
                vq vqVar9 = new vq(this.g, (ud7) obj2, lq4Var, 27);
                vqVar9.h = obj;
                return vqVar9;
            case 28:
                vq vqVar10 = new vq((rb8) obj2, lq4Var, 28);
                vqVar10.h = obj;
                return vqVar10;
            default:
                return new vq((vfe) this.h, (ae8) obj2, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((vq) create((tnd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((vq) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((vq) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:492:0x0c5a  */
    /* JADX WARN: Code duplicated, block: B:494:0x0c6d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v35, types: [int] */
    /* JADX WARN: Type inference failed for: r1v36, types: [y92] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:493:0x0c6b -> B:495:0x0c6f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 3258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vq(long j, Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = j;
        this.i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq(m01 m01Var, l01 l01Var, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 4;
        this.h = m01Var;
        this.i = l01Var;
        this.g = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq(vfe vfeVar, ae8 ae8Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 29;
        this.h = vfeVar;
        this.i = ae8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vq(Object obj, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.g = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vq(Object obj, long j, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.g = j;
        this.i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vq(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vq(Object obj, lq4 lq4Var, Object obj2, long j, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
        this.g = j;
    }
}
