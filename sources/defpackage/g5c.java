package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.ok.tamtam.android.notifications.FailToCreateMissingChannelsException;
import ru.ok.tamtam.android.services.RootNotificationService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class g5c {
    public final Context a;
    public final ha9 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final String h;
    public final ifh i = new ifh(new ap9(6, this));
    public final String j;
    public final String k;
    public final ny8 l;
    public final String m;

    public g5c(String str, String str2, Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ha9 ha9Var) {
        this.a = context;
        this.b = ha9Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var;
        this.f = ny8Var4;
        this.g = ny8Var5;
        this.h = zo5.p(getClass().getName(), "#", String.valueOf(ha9Var.a));
        c();
        this.j = str;
        this.k = str2;
        this.l = ny8Var6;
        this.m = g5c.class.getName();
    }

    public static void b(g5c g5cVar, int i) {
        g5cVar.a(i, g5cVar.l().h);
    }

    public static umb k(g5c g5cVar) {
        umb umbVar = (umb) g5cVar.i.getValue();
        g5cVar.c();
        return umbVar;
    }

    public static void n(g5c g5cVar, qlb qlbVar, Intent intent, Intent intent2, int i, String str, int i2) {
        g5cVar.getClass();
        qlbVar.g = p90.p(g5cVar.a, i, intent);
        qlbVar.G.deleteIntent = PendingIntent.getService(g5cVar.a, i, intent2, p90.U(intent2, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728));
        Notification notificationA = qlbVar.a();
        g5cVar.l().d();
        k(g5cVar).a(str, i, notificationA);
        String str2 = g5cVar.h;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.c;
        if (a4cVar.b(je9Var)) {
            StringBuilder sbR = c0a.r(i, "notify: tag=", str, ",id=", ",");
            sbR.append(notificationA);
            a4cVar.c(je9Var, str2, sbR.toString(), null);
        }
    }

    public final void a(int i, String str) {
        String str2 = this.h;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, zo5.i(i, "cancel: id=", ", tag=", str), null);
            }
        }
        k(this).b.cancel(str, i);
    }

    public final void c() {
        Object poeVar;
        try {
            ((hlb) this.f.getValue()).g();
            poeVar = sbi.a;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            ((t1c) ((ed6) this.g.getValue())).a(new FailToCreateMissingChannelsException(thA));
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00af  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(qlb qlbVar, d83 d83Var, nq4 nq4Var) {
        e5c e5cVar;
        int iIntValue;
        Object objI;
        qlb qlbVar2;
        int i;
        rt2 rt2Var;
        boolean zR0;
        String str;
        a4c a4cVar;
        jlb jlbVarI;
        String str2;
        a4c a4cVar2;
        jlb jlbVarG;
        String str3;
        a4c a4cVar3;
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.c;
        if (nq4Var instanceof e5c) {
            e5cVar = (e5c) nq4Var;
            int i2 = e5cVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e5cVar.i = i2 - Integer.MIN_VALUE;
            } else {
                e5cVar = new e5c(this, nq4Var);
            }
        } else {
            e5cVar = new e5c(this, nq4Var);
        }
        Object objE = e5cVar.g;
        Object obj = hu4.a;
        int i3 = e5cVar.i;
        if (i3 == 0) {
            ch3.d0(objE);
            gm0.U(this.m, "extendChatNotification step 1");
            if (!d83Var.f.isEmpty() && !d83Var.b()) {
                e5cVar.d = qlbVar;
                e5cVar.e = d83Var;
                e5cVar.i = 1;
                if (e(qlbVar, d83Var, e5cVar) != obj) {
                }
                return obj;
            }
            return sbiVar;
        }
        if (i3 == 1) {
            d83Var = e5cVar.e;
            qlbVar = e5cVar.d;
            ch3.d0(objE);
        } else {
            if (i3 == 2) {
                d83 d83Var2 = e5cVar.e;
                qlb qlbVar3 = e5cVar.d;
                ch3.d0(objE);
                d83Var = d83Var2;
                qlbVar = qlbVar3;
                iIntValue = ((Number) objE).intValue();
                xn3 xn3Var = (xn3) this.l.getValue();
                long j = d83Var.c;
                e5cVar.d = qlbVar;
                e5cVar.e = d83Var;
                e5cVar.f = iIntValue;
                e5cVar.i = 3;
                objI = xn3Var.i(j, e5cVar);
                if (objI != obj) {
                    qlbVar2 = qlbVar;
                    i = iIntValue;
                    objE = objI;
                }
                return obj;
            }
            if (i3 != 3) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = e5cVar.f;
            d83Var = e5cVar.e;
            qlbVar2 = e5cVar.d;
            ch3.d0(objE);
        }
        rt2Var = (rt2) objE;
        if (rt2Var != null) {
            zR0 = rt2Var.r0();
        } else {
            zR0 = false;
        }
        str = this.m;
        a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, zo5.s("extendChatNotification messagingEnabled = ", zR0), null);
        }
        if (zR0) {
            jlbVarG = g(d83Var, i, R.drawable.icon_send);
            str3 = this.m;
            a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str3, "extendChatNotification directReplyAction = " + jlbVarG, null);
            }
            qlbVar2.b.add(jlbVarG.a());
        }
        jlbVarI = i(d83Var, i);
        str2 = this.m;
        a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "extendChatNotification markAsReadAction = " + jlbVarI, null);
        }
        qlbVar2.b.add(jlbVarI.a());
        return sbiVar;
        if (d83Var.k) {
            v4c v4cVarL = l();
            long j2 = d83Var.c;
            e5cVar.d = qlbVar;
            e5cVar.e = d83Var;
            e5cVar.i = 2;
            objE = v4cVarL.e(j2, e5cVar);
            if (objE != obj) {
                iIntValue = ((Number) objE).intValue();
                xn3 xn3Var2 = (xn3) this.l.getValue();
                long j3 = d83Var.c;
                e5cVar.d = qlbVar;
                e5cVar.e = d83Var;
                e5cVar.f = iIntValue;
                e5cVar.i = 3;
                objI = xn3Var2.i(j3, e5cVar);
                if (objI != obj) {
                    qlbVar2 = qlbVar;
                    i = iIntValue;
                    objE = objI;
                    rt2Var = (rt2) objE;
                    if (rt2Var != null) {
                        zR0 = rt2Var.r0();
                    } else {
                        zR0 = false;
                    }
                    str = this.m;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4cVar.c(je9Var, str, zo5.s("extendChatNotification messagingEnabled = ", zR0), null);
                    }
                    if (zR0) {
                        jlbVarG = g(d83Var, i, R.drawable.icon_send);
                        str3 = this.m;
                        a4cVar3 = gm0.f;
                        if (a4cVar3 != null) {
                            a4cVar3.c(je9Var, str3, "extendChatNotification directReplyAction = " + jlbVarG, null);
                        }
                        qlbVar2.b.add(jlbVarG.a());
                    }
                    jlbVarI = i(d83Var, i);
                    str2 = this.m;
                    a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        a4cVar2.c(je9Var, str2, "extendChatNotification markAsReadAction = " + jlbVarI, null);
                    }
                    qlbVar2.b.add(jlbVarI.a());
                }
            }
            return obj;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    /* JADX WARN: Code duplicated, block: B:45:0x0106  */
    /* JADX WARN: Code duplicated, block: B:48:0x0119  */
    /* JADX WARN: Code duplicated, block: B:51:0x0123  */
    /* JADX WARN: Code duplicated, block: B:53:0x012b A[LOOP:1: B:52:0x0129->B:53:0x012b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0146  */
    /* JADX WARN: Code duplicated, block: B:62:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0123, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r14v10, types: [int] */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v9 */
    public final Object e(qlb qlbVar, d83 d83Var, nq4 nq4Var) {
        f5c f5cVar;
        qlb qlbVar2;
        ?? r12;
        int iIntValue;
        ArrayList<klb> arrayList;
        ArrayList arrayList2;
        Bundle bundle;
        ArrayList<? extends Parcelable> arrayList3;
        IconCompat iconCompatA;
        Bundle bundle2;
        Icon iconG;
        Notification.Action.Builder builderA;
        Bundle bundle3;
        bie[] bieVarArr;
        int i;
        if (nq4Var instanceof f5c) {
            f5cVar = (f5c) nq4Var;
            int i2 = f5cVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f5cVar.i = i2 - Integer.MIN_VALUE;
            } else {
                f5cVar = new f5c(this, nq4Var);
            }
        } else {
            f5cVar = new f5c(this, nq4Var);
        }
        Object objI = f5cVar.g;
        int i3 = f5cVar.i;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i3 == 0) {
            ch3.d0(objI);
            if (d83Var.b()) {
                return sbiVar;
            }
            xn3 xn3Var = (xn3) this.l.getValue();
            long j = d83Var.c;
            f5cVar.d = qlbVar;
            f5cVar.e = d83Var;
            f5cVar.i = 1;
            objI = xn3Var.i(j, f5cVar);
            if (objI != hu4Var) {
            }
            return hu4Var;
        }
        if (i3 == 1) {
            d83Var = f5cVar.e;
            qlbVar = f5cVar.d;
            ch3.d0(objI);
        } else {
            if (i3 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = f5cVar.f;
            d83Var = f5cVar.e;
            qlbVar2 = f5cVar.d;
            ch3.d0(objI);
            r12 = i4;
        }
        iIntValue = ((Number) objI).intValue();
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
        if (r12 != 0) {
            jlb jlbVarG = g(d83Var, iIntValue, R.drawable.baseline_reply_white_48);
            ww6 ww6Var = new ww6();
            ww6Var.n();
            ww6Var.m();
            ww6Var.j(jlbVarG);
            arrayList.add(jlbVarG.a());
        }
        arrayList.add(i(d83Var, iIntValue).a());
        qlbVar2.getClass();
        bundle = new Bundle();
        if (!arrayList.isEmpty()) {
            arrayList3 = new ArrayList<>(arrayList.size());
            for (klb klbVar : arrayList) {
                iconCompatA = klbVar.a();
                boolean z = klbVar.d;
                bundle2 = klbVar.a;
                if (iconCompatA == null) {
                    iconG = null;
                } else {
                    iconG = iconCompatA.g(null);
                }
                builderA = gmb.a(iconG, klbVar.h, klbVar.i);
                if (bundle2 != null) {
                    bundle3 = new Bundle(bundle2);
                } else {
                    bundle3 = new Bundle();
                }
                bundle3.putBoolean("android.support.allowGeneratedReplies", z);
                hmb.a(builderA, z);
                if (Build.VERSION.SDK_INT >= 31) {
                    imb.a(builderA, false);
                }
                fmb.a(builderA, bundle3);
                bieVarArr = klbVar.c;
                if (bieVarArr != null) {
                    for (RemoteInput remoteInput : bie.a(bieVarArr)) {
                        fmb.b(builderA, remoteInput);
                    }
                }
                arrayList3.add(fmb.c(builderA));
            }
            bundle.putParcelableArrayList("actions", arrayList3);
        }
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("pages", (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
        }
        qlbVar2.b().putBundle("android.wearable.EXTENSIONS", bundle);
        return sbiVar;
        rt2 rt2Var = (rt2) objI;
        ?? R0 = rt2Var != null ? rt2Var.r0() : 0;
        v4c v4cVarL = l();
        long j2 = d83Var.c;
        f5cVar.d = qlbVar;
        f5cVar.e = d83Var;
        f5cVar.f = R0;
        f5cVar.i = 2;
        Object objE = v4cVarL.e(j2, f5cVar);
        if (objE != hu4Var) {
            qlbVar2 = qlbVar;
            r12 = R0;
            objI = objE;
            iIntValue = ((Number) objI).intValue();
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            if (r12 != 0) {
                jlb jlbVarG2 = g(d83Var, iIntValue, R.drawable.baseline_reply_white_48);
                ww6 ww6Var2 = new ww6();
                ww6Var2.n();
                ww6Var2.m();
                ww6Var2.j(jlbVarG2);
                arrayList.add(jlbVarG2.a());
            }
            arrayList.add(i(d83Var, iIntValue).a());
            qlbVar2.getClass();
            bundle = new Bundle();
            if (!arrayList.isEmpty()) {
                arrayList3 = new ArrayList<>(arrayList.size());
                while (r13.hasNext()) {
                    iconCompatA = klbVar.a();
                    boolean z2 = klbVar.d;
                    bundle2 = klbVar.a;
                    if (iconCompatA == null) {
                        iconG = null;
                    } else {
                        iconG = iconCompatA.g(null);
                    }
                    builderA = gmb.a(iconG, klbVar.h, klbVar.i);
                    if (bundle2 != null) {
                        bundle3 = new Bundle(bundle2);
                    } else {
                        bundle3 = new Bundle();
                    }
                    bundle3.putBoolean("android.support.allowGeneratedReplies", z2);
                    hmb.a(builderA, z2);
                    if (Build.VERSION.SDK_INT >= 31) {
                        imb.a(builderA, false);
                    }
                    fmb.a(builderA, bundle3);
                    bieVarArr = klbVar.c;
                    if (bieVarArr != null) {
                        while (i < r6) {
                            fmb.b(builderA, remoteInput);
                        }
                    }
                    arrayList3.add(fmb.c(builderA));
                }
                bundle.putParcelableArrayList("actions", arrayList3);
            }
            if (!arrayList2.isEmpty()) {
                bundle.putParcelableArray("pages", (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            qlbVar2.b().putBundle("android.wearable.EXTENSIONS", bundle);
            return sbiVar;
        }
        return hu4Var;
    }

    public final List f(String str) {
        Object poeVar;
        try {
            StatusBarNotification[] activeNotifications = k(this).b.getActiveNotifications();
            poeVar = activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (roe.a(poeVar) != null) {
            poeVar = r66.a;
        }
        List list = (List) poeVar;
        if (str == null || str.length() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (str.equals(((StatusBarNotification) obj).getTag())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final jlb g(d83 d83Var, int i, int i2) {
        int i3 = RootNotificationService.b;
        long j = d83Var.a;
        String str = d83Var.b;
        long j2 = d83Var.c;
        long j3 = d83Var.l;
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) RootNotificationService.class);
        intent.setAction("ru.ok.tamtam.action.DIRECT_REPLY");
        intent.putExtra("ru.ok.tamtam.extra.CHAT_SERVER_ID", j2);
        intent.putExtra("ru.ok.tamtam.extra.PUSH_ID", j);
        intent.putExtra("ru.ok.tamtam.extra.EVENT_KEY", str);
        intent.putExtra("ru.ok.tamtam.extra.MESSAGE_SERVER_ID", j3);
        intent.putExtra("ru.ok.tamtam.extra.LOCAL_ACCOUNT_ID", this.b.a);
        PendingIntent service = PendingIntent.getService(context, i, intent, p90.U(intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728));
        String string = context.getString(R.string.tt_reply);
        wwf wwfVar = new wwf();
        wwfVar.c(string);
        bie bieVarA = wwfVar.a();
        jlb jlbVar = new jlb(i2, service, string);
        jlbVar.f = new ArrayList();
        jlbVar.f.add(bieVarA);
        jlbVar.g = 1;
        jlbVar.h = false;
        return jlbVar;
    }

    public final Intent h(boolean z) {
        Intent intentM = m(kk9.k(kk9.b, z));
        if (z) {
            intentM.putExtra("push_action", "push_action_open_chats");
        }
        return intentM;
    }

    public final jlb i(d83 d83Var, int i) {
        int i2 = RootNotificationService.b;
        long j = d83Var.a;
        String str = d83Var.b;
        long j2 = d83Var.c;
        long j3 = d83Var.m;
        long j4 = d83Var.l;
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) RootNotificationService.class);
        intent.setAction("ru.ok.tamtam.action.MARK_AS_READ");
        intent.putExtra("ru.ok.tamtam.extra.CHAT_SERVER_ID", j2);
        intent.putExtra("ru.ok.tamtam.extra.MARK", j3);
        intent.putExtra("ru.ok.tamtam.extra.PUSH_ID", j);
        intent.putExtra("ru.ok.tamtam.extra.EVENT_KEY", str);
        intent.putExtra("ru.ok.tamtam.extra.MESSAGE_SERVER_ID", j4);
        intent.putExtra("ru.ok.tamtam.extra.LOCAL_ACCOUNT_ID", this.b.a);
        jlb jlbVar = new jlb(R.drawable.baseline_done_all_white_48, PendingIntent.getService(context, i, intent, p90.U(intent, 201326592)), context.getString(R.string.tt_mark_as_read));
        jlbVar.g = 2;
        jlbVar.h = false;
        return jlbVar;
    }

    public final qlb j(String str, boolean z) {
        boolean z2;
        String strJ;
        Uri uri;
        c();
        qlb qlbVar = new qlb(this.a, str);
        l().getClass();
        Notification notification = qlbVar.G;
        notification.icon = R.drawable.ic_notification;
        qlbVar.y = pq3.j.e(l().a).m().h().a;
        int i = 0;
        qlbVar.f(16, false);
        qlbVar.e = qlb.c(l().a.getString(R.string.oneme_app_name));
        qlbVar.A = str;
        qlbVar.v = z;
        nni nniVar = ((zed) this.c.getValue()).c;
        ny8 ny8Var = this.d;
        if (((gue) ny8Var.getValue()).e()) {
            z2 = nniVar.d.getBoolean("app.notification.in.app.vibrate", true);
            strJ = nniVar.d.getBoolean("app.notification.in.app.sound", true) ? nniVar.j("app.notification.ringtone") : null;
        } else {
            z2 = nniVar.d.getBoolean("app.notification.vibrate", true);
            strJ = nniVar.j("app.notification.ringtone");
        }
        boolean z3 = nniVar.d.getBoolean("app.notification.important.priority", true) && !((gue) ny8Var.getValue()).e();
        int i2 = nniVar.d.getInt("app.notification.led.color", nniVar.f());
        if (z2) {
            i = 2;
        } else {
            notification.vibrate = new long[0];
        }
        if (strJ == null || "_NONE_".equals(strJ)) {
            qlbVar.h(null);
        } else {
            if ("DEFAULT".equals(strJ)) {
                l().getClass();
                uri = Settings.System.DEFAULT_NOTIFICATION_URI;
            } else {
                uri = Uri.parse(strJ);
            }
            qlbVar.h(uri);
        }
        qlbVar.e(i);
        if (i2 != 0) {
            notification.ledARGB = i2;
            notification.ledOnMS = 1000;
            notification.ledOffMS = 1000;
            notification.flags = (notification.flags & (-2)) | 1;
        }
        if (z3) {
            qlbVar.k = 2;
        }
        return qlbVar;
    }

    public final v4c l() {
        return (v4c) this.e.getValue();
    }

    public final Intent m(i65 i65Var) {
        kk9.b.getClass();
        return kk9.p(i65Var, this.a, this.j, this.k, this.b);
    }

    public final void o() {
        try {
            boolean zK = ((hlb) this.f.getValue()).k();
            String str = this.h;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "recreateActiveCallChannelIfNeeded: created=" + zK, null);
            }
        } catch (SecurityException e) {
            gm0.V(this.h, "recreateActiveCallChannelIfNeeded", e);
        } catch (Throwable th) {
            gm0.V(this.h, "recreateActiveCallChannelIfNeeded", new lmb(th));
        }
    }

    public final void p() {
        try {
            boolean zL = ((hlb) this.f.getValue()).l();
            String str = this.h;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "recreateIncomingChannelsIfNeeded: created=" + zL, null);
            }
        } catch (SecurityException e) {
            gm0.V(this.h, "recreateIncomingChannelsIfNeeded", e);
        } catch (Throwable th) {
            gm0.V(this.h, "recreateIncomingChannelsIfNeeded", new lmb(th));
        }
    }
}
