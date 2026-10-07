package androidx.media3.session;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.session.MediaSessionService;
import defpackage.a98;
import defpackage.bg6;
import defpackage.bsk;
import defpackage.c;
import defpackage.c98;
import defpackage.cqk;
import defpackage.d3a;
import defpackage.dc5;
import defpackage.ec5;
import defpackage.ghe;
import defpackage.hu9;
import defpackage.i2a;
import defpackage.iu9;
import defpackage.k2a;
import defpackage.k36;
import defpackage.lvb;
import defpackage.m0a;
import defpackage.mw;
import defpackage.o90;
import defpackage.p3a;
import defpackage.pah;
import defpackage.q2a;
import defpackage.qf4;
import defpackage.sc2;
import defpackage.su6;
import defpackage.u2a;
import defpackage.vf6;
import defpackage.vqi;
import defpackage.wrk;
import defpackage.x3a;
import defpackage.y28;
import defpackage.y3a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaSessionService extends Service {
    public static final /* synthetic */ int g = 0;
    public x3a c;
    public m0a d;
    public qf4 e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final mw f = new mw(0);

    public final void a(k2a k2aVar) {
        k2a k2aVar2;
        boolean z = true;
        lvb.O("session is already released", !k2aVar.a.j());
        synchronized (this.a) {
            k2aVar2 = (k2a) this.f.get(k2aVar.a.i);
            if (k2aVar2 != null && k2aVar2 != k2aVar) {
                z = false;
            }
            lvb.O("Session ID should be unique", z);
            this.f.put(k2aVar.a.i, k2aVar);
        }
        if (k2aVar2 == null) {
            vqi.d0(this.b, new o90(this, 16, k2aVar));
        }
    }

    public final m0a b() {
        if (this.d == null) {
            lvb.W(getBaseContext(), "Accessing service context before onCreate()");
            Context applicationContext = getApplicationContext();
            dc5 dc5Var = new dc5();
            dc5Var.c = applicationContext;
            dc5Var.d = new c(21);
            pah pahVar = ec5.h;
            dc5Var.b = R.string.default_notification_channel_name;
            lvb.b0(!dc5Var.a);
            ec5 ec5Var = new ec5(dc5Var);
            dc5Var.a = true;
            if (this.e == null) {
                this.e = new qf4(this);
            }
            this.d = new m0a(this, ec5Var, this.e);
        }
        return this.d;
    }

    public final ArrayList c() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.f.values());
        }
        return arrayList;
    }

    public final boolean d(k2a k2aVar) {
        boolean zContainsKey;
        synchronized (this.a) {
            zContainsKey = this.f.containsKey(k2aVar.a.i);
        }
        return zContainsKey;
    }

    public abstract k2a e(i2a i2aVar);

    public final void f(final k2a k2aVar, final boolean z) {
        c98 c98VarR;
        final m0a m0aVarB = b();
        if (!m0aVarB.a.d(k2aVar) || !m0aVarB.d(k2aVar)) {
            wrk.c(m0aVarB.a, true);
            m0aVarB.k = false;
            if (m0aVarB.j != null) {
                m0aVarB.c.b.cancel(null, 1001);
                m0aVarB.i++;
                m0aVarB.j = null;
                return;
            }
            return;
        }
        int i = m0aVarB.i + 1;
        m0aVarB.i = i;
        iu9 iu9VarB = m0aVarB.b(k2aVar);
        iu9VarB.getClass();
        iu9VarB.U();
        hu9 hu9Var = iu9VarB.d;
        if (hu9Var.isConnected()) {
            c98VarR = hu9Var.R();
        } else {
            a98 a98Var = c98.b;
            c98VarR = ghe.e;
        }
        final c98 c98Var = c98VarR;
        final vf6 vf6Var = new vf6(m0aVarB, i, k2aVar);
        vqi.d0(new Handler(((bg6) k2aVar.a()).u), new Runnable() { // from class: i0a
            @Override // java.lang.Runnable
            public final void run() {
                int i2;
                i0a i0aVar;
                ec5 ec5Var;
                qlb qlbVar;
                d3a d3aVar;
                int i3;
                m0a m0aVar = m0aVarB;
                ec5 ec5Var2 = m0aVar.h;
                qf4 qf4Var = m0aVar.b;
                Context context = ec5Var2.a;
                NotificationManager notificationManager = ec5Var2.c;
                if (notificationManager.getNotificationChannel("default_channel_id") == null) {
                    jrl.a(notificationManager, context.getString(ec5Var2.b));
                }
                k2a k2aVar2 = k2aVar;
                l3d l3dVarA = k2aVar2.a();
                d3a d3aVar2 = k2aVar2.a;
                qlb qlbVar2 = new qlb(context, "default_channel_id");
                u5a u5aVar = new u5a(k2aVar2);
                bg6 bg6Var = (bg6) l3dVarA;
                bg6Var.I0();
                h3d h3dVar = bg6Var.T;
                boolean zK0 = vqi.k0(l3dVarA, d3aVar2.p);
                ghe gheVarJ = by3.j(c98Var, true, true);
                boolean zC = by3.c(2, gheVarJ);
                boolean zC2 = by3.c(3, gheVarJ);
                z88 z88Var = new z88(4);
                if (zC) {
                    z88Var.c((by3) gheVarJ.get(0));
                    i2 = 1;
                } else {
                    if (h3dVar.a.a(7, 6)) {
                        ay3 ay3Var = new ay3(57413);
                        ay3Var.f(6);
                        ay3Var.b(context.getString(R.string.media3_controls_seek_to_previous_description));
                        z88Var.c(ay3Var.a());
                    }
                    i2 = 0;
                }
                if (h3dVar.a(1)) {
                    if (zK0) {
                        ay3 ay3Var2 = new ay3(57399);
                        ay3Var2.f(1);
                        ay3Var2.b(context.getString(R.string.media3_controls_play_description));
                        z88Var.c(ay3Var2.a());
                    } else {
                        ay3 ay3Var3 = new ay3(57396);
                        ay3Var3.f(1);
                        ay3Var3.b(context.getString(R.string.media3_controls_pause_description));
                        z88Var.c(ay3Var3.a());
                    }
                }
                if (zC2) {
                    z88Var.c((by3) gheVarJ.get(i2));
                    i2++;
                } else if (h3dVar.a.a(9, 8)) {
                    ay3 ay3Var4 = new ay3(57412);
                    ay3Var4.f(8);
                    ay3Var4.b(context.getString(R.string.media3_controls_seek_to_next_description));
                    z88Var.c(ay3Var4.a());
                }
                while (i2 < gheVarJ.d) {
                    z88Var.c((by3) gheVarJ.get(i2));
                    i2++;
                }
                ghe gheVarH = z88Var.h();
                int[] iArrCopyOf = new int[3];
                int[] iArr = new int[3];
                Arrays.fill(iArrCopyOf, -1);
                Arrays.fill(iArr, -1);
                int i4 = 0;
                boolean z2 = false;
                while (i4 < gheVarH.d) {
                    by3 by3Var = (by3) gheVarH.get(i4);
                    emf emfVar = by3Var.a;
                    int i5 = by3Var.b;
                    Context context2 = context;
                    CharSequence charSequence = by3Var.f;
                    ghe gheVar = gheVarH;
                    int i6 = by3Var.d;
                    int[] iArr2 = iArr;
                    x88 x88Var = by3Var.h;
                    int i7 = i4;
                    ArrayList arrayList = qlbVar2.b;
                    if (emfVar != null) {
                        MediaSessionService mediaSessionService = (MediaSessionService) qf4Var.c;
                        lvb.R(emfVar.a == 0);
                        PorterDuff.Mode mode = IconCompat.k;
                        IconCompat iconCompatC = IconCompat.c(mediaSessionService.getResources(), mediaSessionService.getPackageName(), i6);
                        String str = emfVar.b;
                        Bundle bundle = emfVar.c;
                        Intent intent = new Intent("androidx.media3.session.CUSTOM_NOTIFICATION_ACTION");
                        intent.setData(d3aVar2.b);
                        intent.setComponent(new ComponentName(mediaSessionService, mediaSessionService.getClass()));
                        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION", str);
                        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS", bundle);
                        int i8 = qf4Var.b + 1;
                        qf4Var.b = i8;
                        arrayList.add(new klb(iconCompatC, charSequence, PendingIntent.getService(mediaSessionService, i8, intent, 201326592)));
                    } else {
                        lvb.b0(i5 != -1);
                        PorterDuff.Mode mode2 = IconCompat.k;
                        context2.getClass();
                        IconCompat iconCompatC2 = IconCompat.c(context2.getResources(), context2.getPackageName(), i6);
                        long j = i5;
                        MediaSessionService mediaSessionService2 = (MediaSessionService) qf4Var.c;
                        if (j == 8 || j == 9) {
                            i3 = 87;
                        } else if (j == 6 || j == 7) {
                            i3 = 88;
                        } else if (j == 3) {
                            i3 = 86;
                        } else if (j == 12) {
                            i3 = 90;
                        } else if (j == 11) {
                            i3 = 89;
                        } else {
                            i3 = j == 1 ? 85 : 0;
                        }
                        Intent intentK = qf4Var.k(k2aVar2, i3);
                        arrayList.add(new klb(iconCompatC2, charSequence, (j != 1 || ((bg6) k2aVar2.a()).z()) ? PendingIntent.getService(mediaSessionService2, i3, intentK, 67108864) : brl.b(mediaSessionService2, i3, intentK)));
                    }
                    int i9 = by3Var.g.getInt("androidx.media3.session.command.COMPACT_VIEW_INDEX", -1);
                    if (i9 >= 0 && i9 < 3) {
                        iArrCopyOf[i9] = i7;
                        z2 = true;
                    } else if (x88Var.b(0) == 2) {
                        iArr2[0] = i7;
                    } else if (x88Var.b(0) == 1) {
                        iArr2[1] = i7;
                    } else if (x88Var.b(0) == 3) {
                        iArr2[2] = i7;
                    }
                    i4 = i7 + 1;
                    context = context2;
                    gheVarH = gheVar;
                    iArr = iArr2;
                    m0aVar = m0aVar;
                    ec5Var2 = ec5Var2;
                    qlbVar2 = qlbVar2;
                    d3aVar2 = d3aVar2;
                }
                m0a m0aVar2 = m0aVar;
                ec5 ec5Var3 = ec5Var2;
                d3a d3aVar3 = d3aVar2;
                qlb qlbVar3 = qlbVar2;
                int[] iArr3 = iArr;
                if (!z2) {
                    int i10 = 0;
                    int i11 = 0;
                    for (int i12 = 3; i10 < i12; i12 = 3) {
                        int i13 = iArr3[i10];
                        if (i13 != -1) {
                            iArrCopyOf[i11] = i13;
                            i11++;
                        }
                        i10++;
                    }
                }
                for (int i14 = 0; i14 < 3; i14++) {
                    if (iArrCopyOf[i14] == -1) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i14);
                        break;
                    }
                }
                u5aVar.d(iArrCopyOf);
                bg6 bg6Var2 = (bg6) l3dVarA;
                if (bg6Var2.c(18)) {
                    bg6Var2.I0();
                    b0a b0aVar = bg6Var2.U;
                    qlbVar = qlbVar3;
                    qlbVar.e = qlb.c(b0aVar.a);
                    qlbVar.d(b0aVar.b);
                    d3aVar = d3aVar3;
                    xx0 xx0Var = d3aVar.m;
                    ec5Var = ec5Var3;
                    if (ec5Var.g == null || !xx0Var.equals(ec5Var.f)) {
                        ec5Var.f = xx0Var;
                        ec5Var.g = new v2a(11, new mf(xx0Var, ((Integer) ec5.h.get()).intValue(), 9));
                    }
                    e89 e89VarO = ec5Var.g.o(b0aVar);
                    if (e89VarO == null) {
                        i0aVar = this;
                    } else {
                        ch chVar = ec5Var.d;
                        if (chVar != null) {
                            chVar.j();
                        }
                        if (e89VarO.isDone()) {
                            try {
                                qlbVar.g((Bitmap) rx8.F(e89VarO));
                            } catch (CancellationException | ExecutionException e) {
                                lvb.G0("NotificationProvider", "Failed to load bitmap: " + e.getMessage());
                            }
                            i0aVar = this;
                        } else {
                            i0aVar = this;
                            ch chVar2 = new ch(qlbVar, 3, vf6Var);
                            ec5Var.d = chVar2;
                            Handler handler = d3aVar.l;
                            Objects.requireNonNull(handler);
                            e89VarO.b(new ng7(e89VarO, 0, chVar2), new cc5(0, handler));
                        }
                    }
                } else {
                    i0aVar = this;
                    ec5Var = ec5Var3;
                    qlbVar = qlbVar3;
                    d3aVar = d3aVar3;
                }
                long jCurrentTimeMillis = (!bg6Var2.i0() || bg6Var2.f() || bg6Var2.e0() || bg6Var2.Z().a != 1.0f) ? -9223372036854775807L : System.currentTimeMillis() - bg6Var2.E();
                boolean z3 = jCurrentTimeMillis != -9223372036854775807L;
                if (!z3) {
                    jCurrentTimeMillis = 0;
                }
                Notification notification = qlbVar.G;
                notification.when = jCurrentTimeMillis;
                qlbVar.l = z3;
                qlbVar.m = z3;
                if (Build.VERSION.SDK_INT >= 31) {
                    krl.a(qlbVar);
                }
                qlbVar.g = d3aVar.u;
                notification.deleteIntent = PendingIntent.getService((MediaSessionService) qf4Var.c, 86, qf4Var.k(k2aVar2, 86).putExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", true), 67108864);
                qlbVar.f(8, true);
                notification.icon = ec5Var.e;
                qlbVar.i(u5aVar);
                qlbVar.z = 1;
                qlbVar.f(2, false);
                qlbVar.s = "media3_group_key";
                m0aVar2.e.execute(new j0a(0, m0aVar2, k2aVar2, new ex8(qlbVar.a()), z));
            }
        });
    }

    public final boolean g(k2a k2aVar, boolean z) {
        try {
            f(k2aVar, b().c(z));
            return true;
        } catch (IllegalStateException e) {
            if (Build.VERSION.SDK_INT < 31 || !bsk.b(e)) {
                throw e;
            }
            lvb.l0("MSessionService", "Failed to start foreground", e);
            this.b.post(new k36(23, this));
            return false;
        }
    }

    public final void h(k2a k2aVar) {
        synchronized (this.a) {
            lvb.O("session not found", this.f.containsKey(k2aVar.a.i));
            this.f.remove(k2aVar.a.i);
        }
        vqi.d0(this.b, new su6(this, 24, k2aVar));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        String action;
        k2a k2aVarE;
        y3a y3aVar;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            x3a x3aVar = this.c;
            x3aVar.getClass();
            return x3aVar;
        }
        if (!action.equals("android.media.browse.MediaBrowserService") || (k2aVarE = e(new i2a(new p3a("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY))) == null) {
            return null;
        }
        a(k2aVarE);
        d3a d3aVar = k2aVarE.a;
        synchronized (d3aVar.a) {
            try {
                if (d3aVar.x == null) {
                    u2a u2aVar = ((q2a) d3aVar.h.m.b).c;
                    y3a y3aVar2 = new y3a(d3aVar);
                    y3aVar2.a(u2aVar);
                    d3aVar.x = y3aVar2;
                }
                y3aVar = d3aVar.x;
            } catch (Throwable th) {
                throw th;
            }
        }
        return y3aVar.onBind(new Intent("android.media.browse.MediaBrowserService"));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.c = new x3a(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        m0a m0aVar = this.d;
        if (m0aVar != null) {
            m0aVar.a();
        }
        x3a x3aVar = this.c;
        if (x3aVar != null) {
            x3aVar.c.clear();
            x3aVar.d.removeCallbacksAndMessages(null);
            Set set = x3aVar.e;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                cqk.l((y28) it.next());
            }
            set.clear();
            this.c = null;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        k2a k2aVarE;
        k2a k2aVar;
        if (intent != null) {
            if (this.e == null) {
                this.e = new qf4(this);
            }
            qf4 qf4Var = this.e;
            Uri data = intent.getData();
            if (data != null) {
                synchronized (k2a.b) {
                    try {
                        Iterator it = k2a.c.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                k2aVar = null;
                                break;
                            }
                            k2aVar = (k2a) it.next();
                            if (Objects.equals(k2aVar.a.b, data)) {
                                break;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                k2aVarE = k2aVar;
            } else {
                k2aVarE = null;
            }
            qf4Var.getClass();
            if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                if (k2aVarE == null) {
                    k2aVarE = e(new i2a(new p3a("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY));
                    if (k2aVarE != null) {
                        a(k2aVarE);
                    }
                }
                d3a d3aVar = k2aVarE.a;
                d3aVar.l.post(new su6(d3aVar, 23, intent));
                return 1;
            }
            if (k2aVarE != null && "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                Object obj = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION") : null;
                String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    Bundle extras2 = intent.getExtras();
                    Object obj2 = extras2 != null ? extras2.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS") : null;
                    Bundle bundle = obj2 instanceof Bundle ? (Bundle) obj2 : Bundle.EMPTY;
                    m0a m0aVarB = b();
                    iu9 iu9VarB = m0aVarB.b(k2aVarE);
                    if (iu9VarB != null) {
                        vqi.d0(new Handler(((bg6) k2aVarE.a()).u), new sc2(m0aVarB, k2aVarE, str, bundle, iu9VarB));
                    }
                }
            }
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        if (b().k) {
            ArrayList arrayListC = c();
            for (int i = 0; i < arrayListC.size(); i++) {
                if (((bg6) ((k2a) arrayListC.get(i)).a()).i0()) {
                    return;
                }
            }
        }
        b().a();
        ArrayList arrayListC2 = c();
        for (int i2 = 0; i2 < arrayListC2.size(); i2++) {
            ((bg6) ((k2a) arrayListC2.get(i2)).a()).n(false);
        }
        stopSelf();
    }
}
