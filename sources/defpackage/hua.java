package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tamtam.android.services.RootNotificationService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class hua {
    public static final /* synthetic */ zv8[] s;
    public final Context a;
    public final wo6 b;
    public final i5d c;
    public final l7f d;
    public final String e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public Integer m;
    public final wmi n;
    public final AtomicReference o;
    public final p3c p;
    public final ConcurrentHashMap q;
    public final p41 r;

    static {
        z8b z8bVar = new z8b(hua.class, "selfPersonJob", "getSelfPersonJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        s = new zv8[]{z8bVar};
    }

    public hua(Context context, wo6 wo6Var, i5d i5dVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, l7f l7fVar, xhh xhhVar, wmi wmiVar, eh9 eh9Var, ha9 ha9Var) {
        this.a = context;
        this.b = wo6Var;
        this.c = i5dVar;
        this.d = l7fVar;
        this.e = zo5.p(hua.class.getName(), "#", String.valueOf(ha9Var.a));
        this.f = ny8Var;
        this.g = ny8Var2;
        this.h = ny8Var3;
        this.i = ny8Var4;
        this.j = ny8Var5;
        this.k = ny8Var7;
        this.l = ny8Var8;
        this.n = wmiVar;
        String string = context.getString(R.string.tt_you);
        htc htcVar = new htc();
        htcVar.a = string;
        htcVar.b = null;
        htcVar.c = null;
        htcVar.d = false;
        this.o = new AtomicReference(htcVar);
        this.p = qyj.S();
        this.q = new ConcurrentHashMap(25);
        p41 p41VarB = yab.b(0, 0, new ik4(18, this), 3);
        this.r = p41VarB;
        fz6 fz6Var = new fz6(new j3(new tz(8, e9i.p(e9i.I(((s7f) ((et3) l7fVar.a.getValue())).u()))), 27, this), new nta(this, xhhVar, ny8Var6, ny8Var3, null), 3);
        zhb zhbVar = zhb.b;
        tre.m0(fz6Var, cqk.D(wmiVar, zhbVar));
        new fh9(wmiVar, eh9Var, new vy6(eh9Var, this, null, 1));
        tre.m0(new fz6(e9i.q0(p41VarB), ota.a, 3), cqk.D(wmiVar, zhbVar));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:44:0x0157  */
    /* JADX WARN: Code duplicated, block: B:46:0x0160  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00a5 -> B:23:0x00b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0127 -> B:40:0x0137). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0129 -> B:40:0x0137). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x012f -> B:40:0x0137). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0157 -> B:45:0x015e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.hua r24, java.util.Map r25, defpackage.nq4 r26) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hua.a(hua, java.util.Map, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (r10.u(r0) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.hua r10, defpackage.kmb r11, defpackage.nq4 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.bua
            if (r0 == 0) goto L13
            r0 = r12
            bua r0 = (defpackage.bua) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            bua r0 = new bua
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.e
            hu4 r1 = defpackage.hu4.a
            int r2 = r0.g
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            defpackage.ch3.d0(r12)
            goto L8a
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r10)
            return r3
        L34:
            defpackage.ch3.d0(r12)
            goto L7f
        L38:
            kmb r11 = r0.d
            defpackage.ch3.d0(r12)
            goto L6c
        L3e:
            defpackage.ch3.d0(r12)
            java.lang.String r12 = r10.e
            a4c r2 = defpackage.gm0.f
            if (r2 != 0) goto L48
            goto L61
        L48:
            je9 r7 = defpackage.je9.d
            boolean r8 = r2.b(r7)
            if (r8 == 0) goto L61
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "show: "
            r8.<init>(r9)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            r2.c(r7, r12, r8, r3)
        L61:
            r0.d = r11
            r0.g = r6
            java.lang.Object r12 = r10.r(r11, r0)
            if (r12 != r1) goto L6c
            goto L89
        L6c:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L7f
            r0.d = r3
            r0.g = r5
            java.lang.Object r11 = r10.t(r11, r0)
            if (r11 != r1) goto L7f
            goto L89
        L7f:
            r0.d = r3
            r0.g = r4
            java.lang.Object r10 = r10.u(r0)
            if (r10 != r1) goto L8a
        L89:
            return r1
        L8a:
            sbi r10 = defpackage.sbi.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hua.b(hua, kmb, nq4):java.lang.Object");
    }

    public static htc c(tia tiaVar) {
        String str = tiaVar.f;
        long j = tiaVar.g;
        if (j == 0) {
            j = tiaVar.c;
        }
        String strValueOf = String.valueOf(j);
        Bitmap bitmap = tiaVar.h;
        IconCompat iconCompatB = bitmap != null ? IconCompat.b(bitmap) : null;
        htc htcVar = new htc();
        htcVar.a = str;
        htcVar.b = iconCompatB;
        htcVar.c = strValueOf;
        htcVar.d = false;
        return htcVar;
    }

    public static ilb h(tia tiaVar) {
        return new ilb(tiaVar.c);
    }

    public final Object d(Integer num, t45 t45Var) {
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "cancelAll; events.isEmpty=" + this.r.F() + ", groupNotificationId=" + num, null);
            }
        }
        Object objA = this.r.a(t45Var, new pta(this, num, 0));
        return objA == hu4.a ? objA : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        if (r14.c(r12, r1) == r2) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(long r12, defpackage.nq4 r14) {
        /*
            r11 = this;
            sbi r0 = defpackage.sbi.a
            boolean r1 = r14 instanceof defpackage.yta
            if (r1 == 0) goto L15
            r1 = r14
            yta r1 = (defpackage.yta) r1
            int r2 = r1.g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.g = r2
            goto L1a
        L15:
            yta r1 = new yta
            r1.<init>(r11, r14)
        L1a:
            java.lang.Object r14 = r1.e
            hu4 r2 = defpackage.hu4.a
            int r3 = r1.g
            r4 = 0
            r5 = 1
            r6 = 2
            if (r3 == 0) goto L42
            if (r3 == r5) goto L3c
            if (r3 == r6) goto L36
            r11 = 3
            if (r3 != r11) goto L30
            defpackage.ch3.d0(r14)
            return r0
        L30:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r11)
            return r4
        L36:
            long r12 = r1.d
            defpackage.ch3.d0(r14)
            goto L90
        L3c:
            long r12 = r1.d
            defpackage.ch3.d0(r14)
            goto L74
        L42:
            defpackage.ch3.d0(r14)
            java.lang.String r14 = r11.e
            a4c r3 = defpackage.gm0.f
            if (r3 != 0) goto L4c
            goto L65
        L4c:
            je9 r7 = defpackage.je9.d
            boolean r8 = r3.b(r7)
            if (r8 == 0) goto L65
            p41 r8 = r11.r
            boolean r8 = r8.F()
            java.lang.String r9 = "cancelServerChatId #"
            java.lang.String r10 = "; events.isEmpty="
            java.lang.String r8 = defpackage.bc1.l(r12, r9, r10, r8)
            r3.c(r7, r14, r8, r4)
        L65:
            v4c r14 = r11.m()
            r1.d = r12
            r1.g = r5
            java.lang.Object r14 = r14.e(r12, r1)
            if (r14 != r2) goto L74
            goto L8f
        L74:
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            g5c r3 = r11.n()
            defpackage.g5c.b(r3, r14)
            t83 r14 = r11.l()
            r1.d = r12
            r1.g = r6
            java.lang.Object r14 = r14.c(r12, r1)
            if (r14 != r2) goto L90
        L8f:
            return r2
        L90:
            java.util.concurrent.ConcurrentHashMap r11 = r11.q
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r12)
            r11.remove(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hua.e(long, nq4):java.lang.Object");
    }

    public final Object f(m8b m8bVar, t45 t45Var) {
        sbi sbiVar = sbi.a;
        if (m8bVar.i()) {
            gm0.Y(hua.class.getName(), "Early return in cancelServerChatIds cuz of serverChatIds.isEmpty()");
            return sbiVar;
        }
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "cancelServerChatIds: " + m8bVar + "; events.isEmpty=" + this.r.F(), null);
            }
        }
        Object objA = this.r.a(t45Var, new pta(this, m8bVar, 1));
        return objA == hu4.a ? objA : sbiVar;
    }

    public final String g(boolean z) {
        boolean zE = ((gue) this.f.getValue()).e();
        ny8 ny8Var = this.j;
        if (zE) {
            hlb hlbVar = (hlb) ny8Var.getValue();
            hlbVar.c.getClass();
            if (hlbVar.h("ru.oneme.app.inapp.2") == null) {
                hlbVar.f(hlbVar.e());
            }
            return "ru.oneme.app.inapp.2";
        }
        if (z) {
            hlb hlbVar2 = (hlb) ny8Var.getValue();
            hlbVar2.c.getClass();
            if (hlbVar2.h("ru.oneme.app.dialogs") == null) {
                hlbVar2.f(hlbVar2.d());
            }
            return "ru.oneme.app.dialogs";
        }
        hlb hlbVar3 = (hlb) ny8Var.getValue();
        hlbVar3.c.getClass();
        if (hlbVar3.h("ru.oneme.app.chats") == null) {
            hlbVar3.f(hlbVar3.c());
        }
        return "ru.oneme.app.chats";
    }

    public final qlb i(String str) {
        qlb qlbVar = new qlb(this.a, str);
        m().getClass();
        qlbVar.G.icon = R.drawable.ic_notification;
        qlbVar.y = pq3.j.e(m().a).m().h().a;
        qlbVar.w = "msg";
        qlbVar.f(16, true);
        return qlbVar;
    }

    public final boolean j(tia tiaVar, k8b k8bVar, String str) {
        je9 je9Var = je9.c;
        bo6 bo6Var = tiaVar.l;
        if (bo6Var == bo6.MESSAGE_EDITED || bo6Var == bo6.CHAT_MESSAGE_EDITED || bo6Var == bo6.CHANNEL_MESSAGE_EDITED || tiaVar.j > tiaVar.i) {
            long jC = k8bVar.c(tiaVar.e);
            if (jC < tiaVar.j) {
                String str2 = this.e;
                a4c a4cVar = gm0.f;
                if (a4cVar == null || !a4cVar.b(je9Var)) {
                    return true;
                }
                long j = tiaVar.e;
                long j2 = tiaVar.j;
                StringBuilder sbT = qt4.t(j, "notif for #", " in ", str);
                qt4.z(jC, " outdated: ", " < ", sbT);
                sbT.append(j2);
                a4cVar.c(je9Var, str2, sbT.toString(), null);
                return true;
            }
        }
        String str3 = this.e;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 == null || !a4cVar2.b(je9Var)) {
            return false;
        }
        a4cVar2.c(je9Var, str3, "notif for #" + tiaVar + " already shown in " + str, null);
        return false;
    }

    public final l8b k() {
        Notification notification;
        Bundle bundle;
        Bundle bundle2;
        long j;
        List<StatusBarNotification> listF = n().f(m().h);
        if (listF.isEmpty()) {
            return ki9.a;
        }
        l8b l8bVar = new l8b(listF.size());
        for (StatusBarNotification statusBarNotification : listF) {
            if (statusBarNotification != null && (notification = statusBarNotification.getNotification()) != null && (bundle = notification.extras) != null && (bundle2 = bundle.getBundle("oneme.messages")) != null) {
                for (String str : bundle2.keySet()) {
                    int i = 0;
                    long jLongValue = 0;
                    if (z5h.K0(str, "oneme.messages.chat.", false)) {
                        String strJ0 = z5h.J0(str, "oneme.messages.chat.", "");
                        byte[] bArr = uqi.a;
                        try {
                            j = Long.parseLong(strJ0);
                        } catch (NumberFormatException unused) {
                            j = 0;
                        }
                    } else {
                        j = 0;
                    }
                    if (j != 0) {
                        long[] longArray = bundle2.getLongArray(str);
                        long[] longArray2 = bundle2.getLongArray("oneme.messages.edit_times.chat." + j);
                        if (longArray2 == null) {
                            longArray2 = new long[0];
                        }
                        if (longArray != null && longArray.length != 0) {
                            Object objF = l8bVar.f(j);
                            if (objF == null) {
                                objF = new k8b(longArray.length);
                                l8bVar.l(j, objF);
                            }
                            k8b k8bVar = (k8b) objF;
                            int length = longArray.length;
                            int i2 = 0;
                            while (i < length) {
                                long j2 = longArray[i];
                                int i3 = i2 + 1;
                                Long lValueOf = (i2 < 0 || i2 >= longArray2.length) ? null : Long.valueOf(longArray2[i2]);
                                if (lValueOf != null) {
                                    jLongValue = lValueOf.longValue();
                                }
                                k8bVar.g(j2, jLongValue);
                                i++;
                                i2 = i3;
                                jLongValue = 0;
                            }
                        }
                    }
                }
            }
        }
        return l8bVar;
    }

    public final t83 l() {
        return (t83) this.g.getValue();
    }

    public final v4c m() {
        return (v4c) this.h.getValue();
    }

    public final g5c n() {
        return (g5c) this.i.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(Integer num, lq4 lq4Var) {
        aua auaVar;
        if (lq4Var instanceof aua) {
            auaVar = (aua) lq4Var;
            int i = auaVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                auaVar.f = i - Integer.MIN_VALUE;
            } else {
                auaVar = new aua(this, lq4Var);
            }
        } else {
            auaVar = new aua(this, lq4Var);
        }
        Object obj = auaVar.d;
        int i2 = auaVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            n().a(num != null ? num.intValue() : m().d(), m().i);
            t83 t83VarL = l();
            auaVar.f = 1;
            Object objD = t83VarL.d(auaVar);
            hu4 hu4Var = hu4.a;
            if (objD == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        this.q.clear();
        return sbi.a;
    }

    public final Object p(t45 t45Var) {
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("notifyAllChats; events.isEmpty=", this.r.F()), null);
            }
        }
        Object objA = this.r.a(t45Var, new vta(this));
        return objA == hu4.a ? objA : sbi.a;
    }

    public final Object q(m8b m8bVar, l8b l8bVar, nq4 nq4Var) {
        Object objA;
        sbi sbiVar = sbi.a;
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "notifyServerChatIds " + m8bVar + "; events.isEmpty=" + this.r.F(), null);
            }
        }
        return (m8bVar.j() && (objA = this.r.a(nq4Var, new xta(this, m8bVar, l8bVar))) == hu4.a) ? objA : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x033d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0369  */
    /* JADX WARN: Code duplicated, block: B:108:0x037e  */
    /* JADX WARN: Code duplicated, block: B:112:0x038e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:119:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:121:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:124:0x03de  */
    /* JADX WARN: Code duplicated, block: B:127:0x042a  */
    /* JADX WARN: Code duplicated, block: B:128:0x042d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0440  */
    /* JADX WARN: Code duplicated, block: B:134:0x0468  */
    /* JADX WARN: Code duplicated, block: B:135:0x046a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0484  */
    /* JADX WARN: Code duplicated, block: B:141:0x049c A[LOOP:0: B:139:0x0496->B:141:0x049c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:147:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:157:0x050a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0522 A[LOOP:4: B:158:0x051c->B:160:0x0522, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:161:0x0545  */
    /* JADX WARN: Code duplicated, block: B:164:0x0558  */
    /* JADX WARN: Code duplicated, block: B:169:0x0576 A[LOOP:6: B:167:0x0570->B:169:0x0576, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x05c1 A[LOOP:5: B:171:0x05bb->B:173:0x05c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:56:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x021d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0220  */
    /* JADX WARN: Code duplicated, block: B:64:0x0234  */
    /* JADX WARN: Code duplicated, block: B:66:0x023e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0245  */
    /* JADX WARN: Code duplicated, block: B:71:0x0251  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:89:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:92:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:93:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:96:0x031c A[LOOP:2: B:94:0x0316->B:96:0x031c, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [hua] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v47, types: [hua] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v9, types: [hua] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v17, types: [hua, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v8, types: [hua] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x042d -> B:129:0x0436). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x05fb -> B:177:0x0645). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x0633 -> B:177:0x0645). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x02e1 -> B:54:0x01d6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object r(defpackage.kmb r47, defpackage.nq4 r48) {
        /*
            Method dump skipped, instruction units count: 1729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hua.r(kmb, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final Object s(kmb kmbVar, d83 d83Var, List list, boolean z, int i, long j, l8b l8bVar, String str, nq4 nq4Var) {
        dua duaVar;
        dua duaVar2;
        hu4 hu4Var;
        int i2;
        long j2;
        d83 d83Var2;
        String str2;
        qlb qlbVar;
        htc htcVar;
        htc htcVarC;
        int i3;
        int i4;
        Throwable th;
        Long l;
        Intent intentM;
        je9 je9Var = je9.d;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof dua) {
            duaVar = (dua) nq4Var;
            int i5 = duaVar.k;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                duaVar.k = i5 - Integer.MIN_VALUE;
            } else {
                duaVar = new dua(this, nq4Var);
            }
        } else {
            duaVar = new dua(this, nq4Var);
        }
        Object obj = duaVar.i;
        hu4 hu4Var2 = hu4.a;
        int i6 = duaVar.k;
        if (i6 == 0) {
            ch3.d0(obj);
            if (list.isEmpty()) {
                return sbiVar;
            }
            String str3 = d83Var.d;
            e83 e83Var = d83Var.e;
            e83 e83Var2 = e83.a;
            String strG = g(e83Var == e83Var2);
            String str4 = this.e;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                long j3 = d83Var.c;
                StringBuilder sbA = zo5.A("showBundledForChat: channelId = ", strG, ", alert = ", ", chatServerId = ", z);
                sbA.append(j3);
                a4cVar.c(je9Var, str4, sbA.toString(), null);
            }
            qlb qlbVarI = i(strG);
            qlbVarI.s = kmbVar.e;
            qlbVarI.g(d83Var.h);
            qlbVarI.G.when = d83Var.m;
            qlbVarI.C = String.valueOf(d83Var.c);
            qlbVarI.u = String.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD - d83Var.m);
            if (d83Var.k) {
                Bundle bundle = new Bundle();
                htc htcVar2 = (htc) this.o.get();
                dmb dmbVar = new dmb(htcVar2);
                e83 e83Var3 = d83Var.e;
                if (e83Var3 != e83Var2 && e83Var3 != e83.d) {
                    dmbVar.h = d83Var.d;
                    dmbVar.i = Boolean.TRUE;
                }
                long[] jArr = new long[list.size()];
                long[] jArr2 = new long[list.size()];
                Iterator it = list.iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        xw3.V0();
                        throw null;
                    }
                    tia tiaVar = (tia) next;
                    Iterator it2 = it;
                    int i9 = i7;
                    if (!tiaVar.o || tiaVar.c == 0) {
                        long j4 = tiaVar.g;
                        Bitmap bitmap = tiaVar.h;
                        if (j4 == 0) {
                            j4 = tiaVar.c;
                        }
                        Object objF = l8bVar.f(j4);
                        if (objF == null) {
                            htc htcVarC2 = c(tiaVar);
                            l8bVar.l(j4, htcVarC2);
                            objF = htcVarC2;
                        }
                        htc htcVarA = (htc) objF;
                        htcVar = htcVar2;
                        if (htcVarA.b == null && bitmap != null) {
                            r70 r70VarA = htcVarA.a();
                            r70VarA.c = IconCompat.b(bitmap);
                            htcVarA = r70VarA.a();
                            l8bVar.i(j4, htcVarA);
                        }
                        htc htcVar3 = htcVarA;
                        if (cqk.d(htcVarA.a, tiaVar.f)) {
                            htcVarC = htcVar3;
                        } else {
                            htcVarC = c(tiaVar);
                            l8bVar.i(j4, htcVarC);
                        }
                    } else {
                        htcVarC = htcVar2;
                        htcVar = htcVarC;
                    }
                    dua duaVar3 = duaVar;
                    hu4 hu4Var3 = hu4Var2;
                    cmb cmbVar = new cmb(tiaVar.k.b, tiaVar.i, htcVarC);
                    if (tiaVar.m != null) {
                        String str5 = this.e;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            th = null;
                            a4cVar2.c(je9Var, str5, c0a.o("setData ", tiaVar.m.b(), "}"), null);
                        } else {
                            th = null;
                        }
                        String str6 = this.e;
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null) {
                            je9 je9Var2 = je9.e;
                            if (a4cVar3.b(je9Var2)) {
                                a4cVar3.c(je9Var2, str6, "setupBundledMessagingTextStyle: usePushImageFix logic", th);
                            }
                        }
                        cmb cmbVar2 = new cmb("", tiaVar.i, htcVarC);
                        String strB = tiaVar.m.b();
                        Uri uriC = tiaVar.m.c();
                        cmbVar2.e = strB;
                        cmbVar2.f = uriC;
                        ArrayList arrayList = dmbVar.e;
                        arrayList.add(cmbVar2);
                        i4 = 25;
                        if (arrayList.size() > 25) {
                            i3 = 0;
                            arrayList.remove(0);
                        } else {
                            i3 = 0;
                        }
                    } else {
                        hu4Var3 = hu4Var3;
                        i3 = 0;
                        i4 = 25;
                    }
                    ArrayList arrayList2 = dmbVar.e;
                    arrayList2.add(cmbVar);
                    if (arrayList2.size() > i4) {
                        arrayList2.remove(i3);
                    }
                    jArr[i9] = tiaVar.e;
                    jArr2[i9] = tiaVar.j;
                    it = it2;
                    i7 = i8;
                    htcVar2 = htcVar;
                    duaVar = duaVar3;
                    hu4Var2 = hu4Var3;
                }
                duaVar2 = duaVar;
                hu4Var = hu4Var2;
                bundle.putLongArray("oneme.messages.chat." + d83Var.c, jArr);
                bundle.putLongArray("oneme.messages.edit_times.chat." + d83Var.c, jArr2);
                qlbVarI.i(dmbVar);
                if (!bundle.isEmpty()) {
                    qlbVarI.b().putBundle("oneme.messages", bundle);
                }
            } else {
                duaVar2 = duaVar;
                hu4Var = hu4Var2;
                String strQ = woh.q(R.plurals.tt_new_messages, d83Var.i, this.a);
                qlbVarI.e = qlb.c(str3);
                qlbVarI.d(strQ);
                olb olbVar = new olb();
                olbVar.e = qlb.c(strQ);
                olbVar.b = qlb.c(str3);
                qlbVarI.i(olbVar);
            }
            if (!z) {
                qlbVarI.D = 1;
            }
            g5c g5cVarN = n();
            dua duaVar4 = duaVar2;
            duaVar4.d = d83Var;
            duaVar4.e = str;
            duaVar4.f = qlbVarI;
            i2 = i;
            duaVar4.g = i2;
            j2 = j;
            duaVar4.h = j2;
            duaVar4.k = 1;
            hu4 hu4Var4 = hu4Var;
            if (g5cVarN.d(qlbVarI, d83Var, duaVar4) == hu4Var4) {
                return hu4Var4;
            }
            d83Var2 = d83Var;
            str2 = str;
            qlbVar = qlbVarI;
        } else {
            if (i6 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j5 = duaVar.h;
            int i10 = duaVar.g;
            qlbVar = duaVar.f;
            String str7 = duaVar.e;
            d83Var2 = duaVar.d;
            ch3.d0(obj);
            sbiVar = sbiVar;
            str2 = str7;
            j2 = j5;
            i2 = i10;
        }
        g5c g5cVarN2 = n();
        final long j6 = d83Var2.a;
        String str8 = d83Var2.b;
        final long j7 = d83Var2.c;
        Iterator it3 = d83Var2.f.iterator();
        while (true) {
            if (!it3.hasNext()) {
                l = null;
                break;
            }
            Long l2 = ((tia) it3.next()).d;
            if (l2 != null) {
                l = l2;
                break;
            }
        }
        final long j8 = d83Var2.l;
        final String str9 = d83Var2.n;
        final long j9 = d83Var2.o;
        final String str10 = str2;
        vyd vydVar = new vyd(j6, str8, j7, l, j8, str9, j9, d83Var2.e, str10);
        final Long l3 = new Long(j2);
        g5cVarN2.getClass();
        if (l != null) {
            long jLongValue = l.longValue();
            kk9.b.getClass();
            intentM = g5cVarN2.m(kk9.j(jLongValue, l3, null, str10));
        } else {
            kk9.b.getClass();
            intentM = g5cVarN2.m(qbb.g(new cf7() { // from class: jk9
                @Override // defpackage.cf7
                public final Object invoke(Object obj2) {
                    n65 n65Var = (n65) obj2;
                    n65Var.a = ":chats";
                    n65Var.d(Long.valueOf(j7), "id");
                    n65Var.d("server", "type");
                    n65Var.d(Long.valueOf(j6), "push_id");
                    n65Var.d(str9, "push_type");
                    n65Var.d(Long.valueOf(j9), "created_time");
                    n65Var.d(Long.valueOf(j8), "message_server_id");
                    n65Var.d(Long.valueOf(l3.longValue()), "load_mark");
                    String str11 = str10;
                    if (str11 != null) {
                        n65Var.d(str11, "push_link");
                    }
                    return sbi.a;
                }
            }));
        }
        intentM.putExtra("push_action", "push_action_open_chat");
        intentM.putExtra("push_info", vydVar);
        n().getClass();
        g5c g5cVarN3 = n();
        long j10 = d83Var2.a;
        String str11 = d83Var2.b;
        long j11 = d83Var2.c;
        long j12 = d83Var2.m;
        long j13 = d83Var2.l;
        g5cVarN3.getClass();
        int i11 = RootNotificationService.b;
        Context context = g5cVarN3.a;
        ha9 ha9Var = g5cVarN3.b;
        Intent intent = new Intent(context, (Class<?>) RootNotificationService.class);
        intent.setAction("ru.ok.tamtam.action.NOTIF_CANCEL_BUNDLED");
        intent.putExtra("ru.ok.tamtam.extra.CHAT_SERVER_ID", j11);
        intent.putExtra("ru.ok.tamtam.extra.MARK", j12);
        intent.putExtra("ru.ok.tamtam.extra.PUSH_ID", j10);
        intent.putExtra("ru.ok.tamtam.extra.EVENT_KEY", str11);
        intent.putExtra("ru.ok.tamtam.extra.MESSAGE_SERVER_ID", j13);
        intent.putExtra("ru.ok.tamtam.extra.LOCAL_ACCOUNT_ID", ha9Var.a);
        g5c.n(n(), qlbVar, intentM, intent, i2, m().h, 32);
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object t(kmb kmbVar, nq4 nq4Var) {
        eua euaVar;
        Object next;
        String channelId;
        Notification notification;
        emb embVar;
        emb embVar2;
        Object next2;
        qlb qlbVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof eua) {
            euaVar = (eua) nq4Var;
            int i = euaVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                euaVar.h = i - Integer.MIN_VALUE;
            } else {
                euaVar = new eua(this, nq4Var);
            }
        } else {
            euaVar = new eua(this, nq4Var);
        }
        Object obj = euaVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = euaVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            if (kmbVar.a.isEmpty()) {
                gm0.Y(this.e, "showGroupSummary: skip update, no notifications!");
                return sbiVar;
            }
            boolean z = kmbVar.f;
            if (z && kmbVar.c <= 0) {
                g5c.b(n(), kmbVar.d);
                gm0.m(this.e, "showGroupSummary: skip update, no total count, %s", kmbVar);
                return sbiVar;
            }
            if (z) {
                int i3 = kmbVar.c;
                Integer num = this.m;
                if (num != null && i3 == num.intValue()) {
                    g5c g5cVarN = n();
                    int iD = m().d();
                    List listF = g5cVarN.f(m().i);
                    if (!(listF instanceof Collection) || !listF.isEmpty()) {
                        Iterator it = listF.iterator();
                        while (it.hasNext()) {
                            if (((StatusBarNotification) it.next()).getId() == iD) {
                                gm0.n(this.e, "showGroupSummary: skip update, same count");
                                return sbiVar;
                            }
                        }
                    }
                }
            }
            if (kmbVar.a.isEmpty()) {
                g5c.b(n(), kmbVar.d);
                gm0.Y(this.e, "showGroupSummary: skip update, no notifications!");
                return sbiVar;
            }
            String str = this.e;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.h(kmbVar.c, "showGroupSummary: total="), null);
                }
            }
            if (kmbVar.a.isEmpty()) {
                g5c g5cVarN2 = n();
                int iD2 = m().d();
                Iterator it2 = g5cVarN2.f(null).iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((StatusBarNotification) next).getId() != iD2);
                StatusBarNotification statusBarNotification = (StatusBarNotification) next;
                channelId = (statusBarNotification == null || (notification = statusBarNotification.getNotification()) == null) ? null : notification.getChannelId();
            } else {
                channelId = g(((d83) ww3.q1(kmbVar.a.values())).e == e83.a);
            }
            if (channelId == null) {
                return sbiVar;
            }
            String strQ = woh.q(R.plurals.tt_new_messages, kmbVar.c, this.a);
            String string = m().a.getString(R.string.oneme_app_name);
            List listT1 = ww3.T1(kmbVar.a.values());
            if (((Boolean) this.c.i()).booleanValue()) {
                if (kmbVar.a.size() <= 1 || "samsung".equalsIgnoreCase(Build.MANUFACTURER)) {
                    gm0.x(this.e, "showGroupSummary: use BigTextStyle", null);
                    olb olbVar = new olb();
                    olbVar.e = qlb.c(strQ);
                    if (listT1.size() == 1) {
                        String str2 = ((d83) ww3.r1(listT1)).d;
                        if (!r5h.X0(str2)) {
                            string = str2;
                        }
                    }
                    olbVar.b = qlb.c(string);
                    embVar = olbVar;
                } else {
                    String str3 = this.e;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.e;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str3, "showGroupSummary: use InboxStyle", null);
                        }
                    }
                    wlb wlbVar = new wlb();
                    wlbVar.e(string);
                    wlbVar.f(strQ);
                    int iMin = Math.min(listT1.size(), 6);
                    Iterator it3 = listT1.iterator();
                    int i4 = 0;
                    while (it3.hasNext()) {
                        tia tiaVar = (tia) ww3.t1(((d83) it3.next()).f);
                        if (tiaVar != null) {
                            i4++;
                            wlbVar.d(tiaVar.k.b);
                        }
                        if (i4 == iMin) {
                            break;
                        }
                    }
                    embVar = wlbVar;
                    if (i4 < listT1.size()) {
                        wlbVar.d("…");
                        embVar = wlbVar;
                    }
                }
                embVar2 = embVar;
            } else {
                wlb wlbVar2 = new wlb();
                wlbVar2.f(strQ);
                embVar2 = wlbVar2;
            }
            qlb qlbVarI = i(channelId);
            qlbVarI.i(embVar2);
            qlbVarI.s = kmbVar.e;
            qlbVarI.t = true;
            qlbVarI.B = 1;
            qlbVarI.f(16, false);
            Iterator it4 = kmbVar.a.values().iterator();
            if (it4.hasNext()) {
                next2 = it4.next();
                if (it4.hasNext()) {
                    long j = ((d83) next2).m;
                    do {
                        Object next3 = it4.next();
                        long j2 = ((d83) next3).m;
                        if (j < j2) {
                            next2 = next3;
                            j = j2;
                        }
                    } while (it4.hasNext());
                }
            } else {
                next2 = null;
            }
            d83 d83Var = (d83) next2;
            qlbVarI.u = d83Var != null ? String.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD - d83Var.m) : null;
            qlbVarI.D = 2;
            v4c v4cVarM = m();
            euaVar.d = kmbVar;
            euaVar.e = qlbVarI;
            euaVar.h = 1;
            Object objG = v4cVarM.g(euaVar);
            if (objG == hu4Var) {
                return hu4Var;
            }
            qlbVar = qlbVarI;
            obj = objG;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qlb qlbVar2 = euaVar.e;
            kmb kmbVar2 = euaVar.d;
            ch3.d0(obj);
            qlbVar = qlbVar2;
            kmbVar = kmbVar2;
        }
        String str4 = (String) obj;
        if (str4 != null) {
            qlbVar.getClass();
            qlbVar.o = qlb.c(str4);
        }
        g5c g5cVarN3 = n();
        Intent intentH = n().h(true);
        g5c g5cVarN4 = n();
        g5cVarN4.getClass();
        int i5 = RootNotificationService.b;
        Context context = g5cVarN4.a;
        ha9 ha9Var = g5cVarN4.b;
        Intent intent = new Intent(context, (Class<?>) RootNotificationService.class);
        intent.setAction("ru.ok.tamtam.action.NOTIF_CANCEL");
        intent.putExtra("ru.ok.tamtam.extra.LOCAL_ACCOUNT_ID", ha9Var.a);
        g5c.n(g5cVarN3, qlbVar, intentH, intent, kmbVar.d, m().i, 48);
        this.m = new Integer(kmbVar.c);
        return sbiVar;
    }

    public final Object u(nq4 nq4Var) {
        Object objO;
        je9 je9Var = je9.d;
        sbi sbiVar = sbi.a;
        List listF = n().f(m().i);
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, zo5.h(listF.size(), "tryToHideGroupNotification, groupsCount: "), null);
        }
        if (!listF.isEmpty()) {
            List listF2 = n().f(m().h);
            String str2 = this.e;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, zo5.h(listF2.size(), "tryToHideGroupNotification, messageNotificationsCount: "), null);
            }
            if (listF2.isEmpty() && (objO = o(null, nq4Var)) == hu4.a) {
                return objO;
            }
        }
        return sbiVar;
    }
}
