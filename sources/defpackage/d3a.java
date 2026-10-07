package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media3.session.MediaSessionService;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import one.me.android.media.service.OneMeMediaSessionService;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes.dex */
public class d3a {
    public static final wmf E = new wmf(1);
    public static final pah F = rx8.S(new v25(4));
    public boolean A;
    public final c98 B;
    public final c98 C;
    public final Bundle D;
    public final Object a = new Object();
    public final Uri b;
    public final a3a c;
    public final z2a d;
    public final f2a e;
    public final OneMeMediaSessionService f;
    public final t4a g;
    public final o3a h;
    public final String i;
    public final xnf j;
    public final k2a k;
    public final Handler l;
    public final xx0 m;
    public final y2a n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public final c98 r;
    public c4d s;
    public j4d t;
    public PendingIntent u;
    public b3a v;
    public w4 w;
    public y3a x;
    public boolean y;
    public final long z;

    /* JADX WARN: Type inference failed for: r15v3, types: [y2a] */
    public d3a(k2a k2aVar, OneMeMediaSessionService oneMeMediaSessionService, String str, bg6 bg6Var, c98 c98Var, c98 c98Var2, c98 c98Var3, f2a f2aVar, Bundle bundle, Bundle bundle2, xx0 xx0Var, boolean z, boolean z2) {
        lvb.r0("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.3] [" + vqi.a + "]");
        this.k = k2aVar;
        this.f = oneMeMediaSessionService;
        this.i = str;
        this.u = null;
        this.B = c98Var;
        this.C = c98Var2;
        this.r = c98Var3;
        this.e = f2aVar;
        this.D = bundle2;
        this.m = xx0Var;
        this.p = z;
        this.q = z2;
        t4a t4aVar = new t4a(this);
        this.g = t4aVar;
        this.o = new Handler(Looper.getMainLooper());
        Looper looper = bg6Var.u;
        Handler handler = new Handler(looper);
        this.l = handler;
        this.s = c4d.H;
        this.c = new a3a(this, looper);
        this.d = new z2a(this, looper);
        Uri uriBuild = new Uri.Builder().scheme(d3a.class.getName()).appendPath(str).appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.b = uriBuild;
        o3a o3aVar = new o3a(this, uriBuild, handler, bundle, z, c98Var, c98Var2, g2a.e, g2a.f, bundle2);
        this.h = o3aVar;
        this.j = new xnf(Process.myUid(), 1009003300, 8, oneMeMediaSessionService.getPackageName(), t4aVar, bundle, ((q2a) o3aVar.m.b).c.b);
        j4d j4dVar = new j4d(bg6Var);
        this.t = j4dVar;
        vqi.d0(handler, new o90(this, 14, j4dVar));
        this.z = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
        final int i = 0;
        this.n = new Runnable(this) { // from class: y2a
            public final /* synthetic */ d3a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                d3a d3aVar = this.b;
                switch (i2) {
                    case 0:
                        d3a.a(d3aVar);
                        break;
                    default:
                        d3aVar.u();
                        break;
                }
            }
        };
        final int i2 = 1;
        vqi.d0(handler, new Runnable(this) { // from class: y2a
            public final /* synthetic */ d3a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                d3a d3aVar = this.b;
                switch (i3) {
                    case 0:
                        d3a.a(d3aVar);
                        break;
                    default:
                        d3aVar.u();
                        break;
                }
            }
        });
    }

    public static void a(d3a d3aVar) {
        synchronized (d3aVar.a) {
            try {
                if (d3aVar.y) {
                    return;
                }
                umf umfVarN = d3aVar.t.N();
                if (!d3aVar.c.hasMessages(1) && gm0.d(umfVarN, d3aVar.s.c)) {
                    gvb gvbVar = d3aVar.g.d;
                    c98 c98VarX = gvbVar.x();
                    for (int i = 0; i < c98VarX.size(); i++) {
                        i2a i2aVar = (i2a) c98VarX.get(i);
                        gvbVar.G(i2aVar);
                        d3aVar.c(i2aVar, new x2a(umfVarN, gvbVar.N(i2aVar, 16), gvbVar.N(i2aVar, 17), i2aVar));
                    }
                    try {
                        d3aVar.h.i.f(0, umfVarN, true, true, 0);
                    } catch (RemoteException e) {
                        lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
                    }
                }
                d3aVar.u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean k(i2a i2aVar) {
        return i2aVar != null && Objects.equals(i2aVar.a.a.a, "com.android.systemui");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    public final boolean b(KeyEvent keyEvent, boolean z, boolean z2) {
        xc4 xc4Var;
        i2a i2aVarE = this.k.a.e();
        i2aVarE.getClass();
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z) {
            keyCode = 87;
        }
        if (keyCode == 79) {
            if (!this.t.z()) {
                xc4Var = new xc4(this, i2aVarE, 5);
            } else {
                xc4Var = new xc4(this, i2aVarE, 6);
            }
        } else if (keyCode == 126) {
            xc4Var = new xc4(this, i2aVarE, 7);
        } else if (keyCode == 127) {
            xc4Var = new xc4(this, i2aVarE, 8);
        } else if (keyCode == 272) {
            xc4Var = new xc4(this, i2aVarE, 9);
        } else if (keyCode != 273) {
            switch (keyCode) {
                case 85:
                    if (!this.t.z()) {
                        xc4Var = new xc4(this, i2aVarE, 6);
                    } else {
                        xc4Var = new xc4(this, i2aVarE, 5);
                    }
                    break;
                case 86:
                    xc4Var = new xc4(this, i2aVarE, 4);
                    break;
                case 87:
                    xc4Var = new xc4(this, i2aVarE, 9);
                    break;
                case 88:
                    xc4Var = new xc4(this, i2aVarE, 1);
                    break;
                case 89:
                    xc4Var = new xc4(this, i2aVarE, 3);
                    break;
                case 90:
                    xc4Var = new xc4(this, i2aVarE, 2);
                    break;
                default:
                    return false;
            }
        } else {
            xc4Var = new xc4(this, i2aVarE, 1);
        }
        vqi.d0(this.l, new j0a(this, z2, i2aVarE, xc4Var));
        return true;
    }

    public final void c(i2a i2aVar, c3a c3aVar) {
        int iB;
        t4a t4aVar = this.g;
        try {
            xhf xhfVarI = t4aVar.d.I(i2aVar);
            if (xhfVarI != null) {
                iB = xhfVarI.b();
            } else if (!h(i2aVar)) {
                return;
            } else {
                iB = 0;
            }
            h2a h2aVar = i2aVar.d;
            if (h2aVar != null) {
                c3aVar.a(h2aVar, iB);
            }
        } catch (DeadObjectException unused) {
            t4aVar.d.S(i2aVar);
        } catch (RemoteException e) {
            lvb.H0("MediaSessionImpl", "Exception in " + i2aVar, e);
        }
    }

    public final void d(c3a c3aVar) {
        c98 c98VarX = this.g.d.x();
        for (int i = 0; i < c98VarX.size(); i++) {
            c((i2a) c98VarX.get(i), c3aVar);
        }
        try {
            c3aVar.a(this.h.i, 0);
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final i2a e() {
        c98 c98VarX = this.g.d.x();
        for (int i = 0; i < c98VarX.size(); i++) {
            i2a i2aVar = (i2a) c98VarX.get(i);
            if (i(i2aVar)) {
                return i2aVar;
            }
        }
        return null;
    }

    public final void f(h3d h3dVar) {
        this.c.a(false, false);
        d(new gve(h3dVar));
        try {
            m3a m3aVar = this.h.i;
            ok5 ok5Var = this.s.s;
            m3aVar.j();
        } catch (RemoteException e) {
            lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final void g(i2a i2aVar, boolean z) {
        if (p()) {
            boolean z2 = this.t.c(16) && this.t.U() != null;
            boolean z3 = this.t.c(31) || this.t.c(20);
            i2a i2aVarT = t(i2aVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            lvb.b0(!false);
            sparseBooleanArray.append(1, true);
            lvb.b0(true);
            h3d h3dVar = new h3d(new cx6(sparseBooleanArray));
            if (!z2 && z3) {
                e88 e88VarH = this.e.h(this.k, i2aVarT);
                e88VarH.b(new ng7(e88VarH, 0, new ch(this, i2aVarT, z, h3dVar)), new gc0(2, this));
            } else {
                if (!z2) {
                    lvb.G0("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                vqi.L(this.t);
                if (z) {
                    q(i2aVarT);
                }
            }
        }
    }

    public final boolean h(i2a i2aVar) {
        return this.g.d.M(i2aVar) || this.h.f.M(i2aVar);
    }

    public final boolean i(i2a i2aVar) {
        return Objects.equals(i2aVar.a.a.a, this.f.getPackageName()) && i2aVar.b != 0 && new Bundle(i2aVar.e).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.y;
        }
        return z;
    }

    public final e89 l(i2a i2aVar, List list) {
        return this.e.l(this.k, t(i2aVar), list);
    }

    public final g2a m(i2a i2aVar) {
        c98 c98VarN;
        boolean z = this.A;
        c98 c98VarN2 = null;
        o3a o3aVar = this.h;
        if (z && k(i2aVar)) {
            o3aVar.getClass();
            fmf fmfVar = g2a.e;
            fmf fmfVar2 = o3aVar.x;
            fmfVar2.getClass();
            h3d h3dVar = o3aVar.y;
            h3dVar.getClass();
            if (o3aVar.w.isEmpty()) {
                c98 c98Var = o3aVar.v;
                c98VarN2 = c98Var == null ? null : c98.n(c98Var);
                c98VarN = null;
            } else {
                c98 c98Var2 = o3aVar.w;
                c98VarN = c98Var2 == null ? null : c98.n(c98Var2);
            }
            return new g2a(fmfVar2, h3dVar, c98VarN2, c98VarN);
        }
        this.e.getClass();
        h3d h3dVar2 = g2a.f;
        fmf fmfVar3 = g2a.e;
        g2a g2aVar = new g2a(fmfVar3, h3dVar2, null, null);
        if (i(i2aVar)) {
            this.A = true;
            k2a k2aVar = this.k;
            c98 c98Var3 = k2aVar.a.C;
            if (c98Var3.isEmpty()) {
                o3aVar.v = k2aVar.a.B;
            } else {
                o3aVar.w = c98Var3;
                o3aVar.L();
            }
            boolean z2 = o3aVar.y.a(17) != h3dVar2.a(17);
            o3aVar.x = fmfVar3;
            o3aVar.y = h3dVar2;
            if (!o3aVar.w.isEmpty()) {
                o3aVar.L();
            }
            d3a d3aVar = o3aVar.g;
            if (z2) {
                vqi.d0(d3aVar.l, new su6(o3aVar, 22, d3aVar.t));
                return g2aVar;
            }
            o3aVar.M(d3aVar.t);
        }
        return g2aVar;
    }

    public final h88 n(i2a i2aVar) {
        t(i2aVar);
        this.e.getClass();
        return rx8.J(new wmf(-6));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean o(i2a i2aVar, Intent intent) {
        boolean z;
        o3a o3aVar;
        int i = i2aVar.b;
        Bundle extras = intent.getExtras();
        d86 d86Var = null;
        KeyEvent keyEvent = (extras == null || !extras.containsKey("android.intent.extra.KEY_EVENT")) ? null : (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
        ComponentName component = intent.getComponent();
        if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON")) {
            OneMeMediaSessionService oneMeMediaSessionService = this.f;
            if ((component == null || Objects.equals(component.getPackageName(), oneMeMediaSessionService.getPackageName())) && keyEvent != null) {
                v();
                this.e.getClass();
                if (keyEvent.getAction() != 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 272 && keyCode != 273) {
                        switch (keyCode) {
                        }
                    }
                    return true;
                }
                int keyCode2 = keyEvent.getKeyCode();
                boolean zHasSystemFeature = oneMeMediaSessionService.getPackageManager().hasSystemFeature("android.software.leanback");
                z2a z2aVar = this.d;
                if (keyCode2 == 79 || keyCode2 == 85) {
                    if (!zHasSystemFeature && i == 0 && keyEvent.getRepeatCount() == 0) {
                        d86 d86Var2 = z2aVar.a;
                        if (d86Var2 == null) {
                            d86 d86Var3 = new d86(z2aVar, i2aVar, keyEvent, 13);
                            z2aVar.a = d86Var3;
                            z2aVar.postDelayed(d86Var3, ViewConfiguration.getDoubleTapTimeout());
                            return true;
                        }
                        if (d86Var2 != null) {
                            z2aVar.removeCallbacks(d86Var2);
                            z2aVar.a = null;
                        }
                        z = true;
                    } else {
                        d86 d86Var4 = z2aVar.a;
                        if (d86Var4 != null) {
                            z2aVar.removeCallbacks(d86Var4);
                            d86 d86Var5 = z2aVar.a;
                            z2aVar.a = null;
                            d86Var = d86Var5;
                        }
                        if (d86Var != null) {
                            vqi.d0(z2aVar, d86Var);
                        }
                    }
                    if (!this.A) {
                        boolean booleanExtra = intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
                        if (keyEvent.getRepeatCount() <= 0 || b(keyEvent, z, booleanExtra)) {
                            return true;
                        }
                    } else {
                        o3aVar = this.h;
                        if ((keyCode2 != 85 || keyCode2 == 79) && z) {
                            o3aVar.y();
                            return true;
                        }
                        if (i != 0) {
                            ((mu9) ((qg7) o3aVar.m.c).b).a.dispatchMediaButtonEvent(keyEvent);
                            return true;
                        }
                    }
                } else {
                    d86 d86Var6 = z2aVar.a;
                    if (d86Var6 != null) {
                        z2aVar.removeCallbacks(d86Var6);
                        d86 d86Var7 = z2aVar.a;
                        z2aVar.a = null;
                        d86Var = d86Var7;
                    }
                    if (d86Var != null) {
                        vqi.d0(z2aVar, d86Var);
                    }
                }
                z = false;
                if (!this.A) {
                    boolean booleanExtra2 = intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
                    if (keyEvent.getRepeatCount() <= 0) {
                    }
                    return true;
                }
                o3aVar = this.h;
                if (keyCode2 != 85) {
                    o3aVar.y();
                    return true;
                }
                o3aVar.y();
                return true;
                if (i != 0) {
                    ((mu9) ((qg7) o3aVar.m.c).b).a.dispatchMediaButtonEvent(keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean p() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            mof mofVarR = mof.r();
            this.o.post(new su6(this, 20, mofVarR));
            try {
                return ((Boolean) mofVarR.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e) {
                qr7.w(e);
                return false;
            }
        }
        w4 w4Var = this.w;
        if (w4Var != null) {
            MediaSessionService mediaSessionService = (MediaSessionService) w4Var.a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 31 && i < 33) {
                int i2 = MediaSessionService.g;
                if (!mediaSessionService.b().k) {
                    return mediaSessionService.g(this.k, true);
                }
            }
        }
        return true;
    }

    public final void q(i2a i2aVar) {
        t(i2aVar);
        this.e.getClass();
    }

    public final mof r(i2a i2aVar, List list, int i, long j) {
        return vqi.o0(this.e.l(this.k, t(i2aVar), list), new i75(i, j));
    }

    public final void s() {
        lvb.r0("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.3] [" + vqi.a + "] [" + sz9.b() + "]");
        synchronized (this.a) {
            try {
                if (this.y) {
                    return;
                }
                this.y = true;
                z2a z2aVar = this.d;
                d86 d86Var = z2aVar.a;
                if (d86Var != null) {
                    z2aVar.removeCallbacks(d86Var);
                    z2aVar.a = null;
                }
                this.l.removeCallbacksAndMessages(null);
                try {
                    vqi.d0(this.l, new w2a(this, 0));
                } catch (Exception e) {
                    lvb.H0("MediaSessionImpl", "Exception thrown while closing", e);
                }
                o3a o3aVar = this.h;
                ComponentName componentName = o3aVar.o;
                d3a d3aVar = o3aVar.g;
                v2a v2aVar = o3aVar.m;
                int i = Build.VERSION.SDK_INT;
                if (i < 31) {
                    if (componentName == null) {
                        ((q2a) v2aVar.b).a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", d3aVar.b);
                        intent.setComponent(componentName);
                        ((q2a) v2aVar.b).a.setMediaButtonReceiver(PendingIntent.getBroadcast(d3aVar.f, 0, intent, o3a.z));
                    }
                }
                cg cgVar = o3aVar.n;
                if (cgVar != null) {
                    d3aVar.f.unregisterReceiver(cgVar);
                }
                dg dgVar = o3aVar.l;
                if (dgVar != null) {
                    dgVar.b();
                }
                q2a q2aVar = (q2a) v2aVar.b;
                MediaSession mediaSession = q2aVar.a;
                q2aVar.f.kill();
                if (i == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e2) {
                        lvb.H0("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e2);
                    }
                }
                mediaSession.setCallback(null);
                q2aVar.b.c.clear();
                mediaSession.release();
                t4a t4aVar = this.g;
                Set set = t4aVar.e;
                gvb gvbVar = t4aVar.d;
                for (i2a i2aVar : gvbVar.x()) {
                    gvbVar.S(i2aVar);
                    h2a h2aVar = i2aVar.d;
                    if (h2aVar != null) {
                        h2aVar.onDisconnected();
                    }
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    h2a h2aVar2 = ((i2a) it.next()).d;
                    if (h2aVar2 != null) {
                        h2aVar2.onDisconnected();
                    }
                }
                set.clear();
                t4aVar.c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final i2a t(i2a i2aVar) {
        if (!this.A || !k(i2aVar)) {
            return i2aVar;
        }
        i2a i2aVarE = e();
        i2aVarE.getClass();
        return i2aVarE;
    }

    public final void u() {
        Handler handler = this.l;
        y2a y2aVar = this.n;
        handler.removeCallbacks(y2aVar);
        if (this.q) {
            long j = this.z;
            if (j > 0) {
                if (this.t.h0() || this.t.g0()) {
                    handler.postDelayed(y2aVar, j);
                }
            }
        }
    }

    public final void v() {
        if (Looper.myLooper() == this.l.getLooper()) {
            return;
        }
        ore.k("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
