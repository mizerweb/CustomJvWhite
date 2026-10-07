package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import one.me.android.media.service.OneMeMediaSessionService;

/* JADX INFO: loaded from: classes.dex */
public final class o3a extends o2a {
    public static final int z;
    public final gvb f;
    public final d3a g;
    public final t3a h;
    public final m3a i;
    public final m2a j;
    public final boolean k;
    public final dg l;
    public final v2a m;
    public final cg n;
    public final ComponentName o;
    public k3a p;
    public final boolean q;
    public volatile long r;
    public uj6 s;
    public int t;
    public final Bundle u;
    public c98 v;
    public c98 w;
    public fmf x;
    public h3d y;

    static {
        z = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0052  */
    public o3a(d3a d3aVar, Uri uri, Handler handler, Bundle bundle, boolean z2, c98 c98Var, c98 c98Var2, fmf fmfVar, h3d h3dVar, Bundle bundle2) {
        boolean z3;
        ComponentName componentName;
        ComponentName componentNameH;
        PendingIntent foregroundService;
        this.g = d3aVar;
        this.q = z2;
        this.v = c98Var;
        this.w = c98Var2;
        this.x = fmfVar;
        this.y = h3dVar;
        this.u = new Bundle(bundle2);
        OneMeMediaSessionService oneMeMediaSessionService = d3aVar.f;
        this.h = t3a.m(oneMeMediaSessionService);
        this.i = new m3a(this);
        gvb gvbVar = new gvb(d3aVar);
        this.f = gvbVar;
        this.r = 300000L;
        int i = 1;
        this.j = new m2a(i, d3aVar.l.getLooper(), gvbVar);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 33) {
            z3 = false;
        } else {
            String str = vqi.a;
            if (oneMeMediaSessionService.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                z3 = false;
            } else {
                String str2 = Build.MANUFACTURER;
                if (str2.equals("Google") || str2.equals("motorola") || str2.equals("vivo") || str2.equals("Sony") || str2.equals("Nothing") || str2.equals("unknown")) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
        }
        this.k = z3;
        if (!c98Var2.isEmpty()) {
            K();
        }
        PackageManager packageManager = oneMeMediaSessionService.getPackageManager();
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(oneMeMediaSessionService.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else {
            if (!listQueryBroadcastReceivers.isEmpty()) {
                qr7.g(listQueryBroadcastReceivers.size(), "Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found ");
                throw null;
            }
            componentName = null;
        }
        this.o = componentName;
        if (componentName == null || i2 < 31) {
            componentNameH = H(oneMeMediaSessionService, "androidx.media3.session.MediaLibraryService");
            componentNameH = componentNameH == null ? H(oneMeMediaSessionService, "androidx.media3.session.MediaSessionService") : componentNameH;
            if (componentNameH == null || componentNameH.equals(componentName)) {
                i = 0;
            }
        } else {
            i = 0;
            componentNameH = componentName;
        }
        Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON", uri);
        if (componentNameH == null) {
            cg cgVar = new cg(5, this);
            this.n = cgVar;
            IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
            String scheme = uri.getScheme();
            String str3 = vqi.a;
            intentFilter.addDataScheme(scheme);
            if (i2 < 33) {
                oneMeMediaSessionService.registerReceiver(cgVar, intentFilter);
            } else {
                oneMeMediaSessionService.registerReceiver(cgVar, intentFilter, 4);
            }
            intent2.setPackage(oneMeMediaSessionService.getPackageName());
            foregroundService = PendingIntent.getBroadcast(oneMeMediaSessionService, 0, intent2, z);
            componentNameH = new ComponentName(oneMeMediaSessionService, (Class<?>) OneMeMediaSessionService.class);
        } else {
            intent2.setComponent(componentNameH);
            foregroundService = i != 0 ? PendingIntent.getForegroundService(oneMeMediaSessionService, 0, intent2, z) : PendingIntent.getBroadcast(oneMeMediaSessionService, 0, intent2, z);
            this.n = null;
        }
        v2a v2aVar = new v2a(oneMeMediaSessionService, TextUtils.join(".", new String[]{"androidx.media3.session.id", d3aVar.i}), i2 >= 31 ? null : componentNameH, i2 < 31 ? foregroundService : null, bundle);
        this.m = v2aVar;
        if (i2 >= 31 && componentName != null) {
            zrk.b(v2aVar, componentName);
        }
        PendingIntent pendingIntent = d3aVar.u;
        if (pendingIntent != null) {
            ((q2a) v2aVar.b).a.setSessionActivity(pendingIntent);
        }
        v2aVar.N(this, handler);
        this.l = z3 ? new dg(oneMeMediaSessionService, new e6(22, this)) : null;
    }

    public static void C(v2a v2aVar, ArrayList arrayList) {
        if (arrayList != null) {
            v2aVar.getClass();
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t2a t2aVar = (t2a) it.next();
                if (hashSet.contains(Long.valueOf(t2aVar.c()))) {
                    lvb.l0("MediaSessionCompat", "Found duplicate queue id: " + t2aVar.c(), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(t2aVar.c()));
            }
        }
        q2a q2aVar = (q2a) v2aVar.b;
        MediaSession mediaSession = q2aVar.a;
        q2aVar.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((t2a) it2.next()).d());
        }
        mediaSession.setQueue(arrayList2);
    }

    public static ry9 D(String str, Uri uri, String str2, Bundle bundle) {
        by9 by9Var = new by9();
        a98 a98Var = c98.b;
        ghe gheVar = ghe.e;
        List list = Collections.EMPTY_LIST;
        ghe gheVar2 = ghe.e;
        hy9 hy9Var = new hy9();
        ly9 ly9Var = ly9.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        u50 u50Var = new u50();
        u50Var.a = uri;
        u50Var.c = str2;
        u50Var.b = bundle;
        return new ry9(str3, new dy9(by9Var), null, new iy9(hy9Var), b0a.K, new ly9(u50Var));
    }

    public static ComponentName H(OneMeMediaSessionService oneMeMediaSessionService, String str) {
        PackageManager packageManager = oneMeMediaSessionService.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(oneMeMediaSessionService.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    @Override // defpackage.o2a
    public final void A(long j) {
        if (j < 0) {
            return;
        }
        F(10, new g3a(this, j, 0), ((q2a) this.m.b).b(), true);
    }

    @Override // defpackage.o2a
    public final void B() {
        F(3, new f3a(this, 9), ((q2a) this.m.b).b(), true);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    public final x2d E(j4d j4dVar) {
        int i;
        int i2;
        long j;
        int i3;
        String message;
        int i4;
        long j2;
        PlaybackException playbackExceptionM = j4dVar.m();
        boolean z2 = j4dVar.c(16) && !j4dVar.e0();
        boolean z3 = playbackExceptionM != null || vqi.k0(j4dVar, this.q);
        if (playbackExceptionM != null) {
            i2 = 7;
        } else {
            u98 u98Var = mz8.a;
            if (j4dVar.m() != null) {
                i = 7;
            } else {
                int playbackState = j4dVar.getPlaybackState();
                if (playbackState == 1) {
                    i = 0;
                } else if (playbackState != 2) {
                    if (playbackState != 3) {
                        if (playbackState != 4) {
                            ore.p(zo5.h(playbackState, "Unrecognized State: "));
                            return null;
                        }
                        i = 1;
                    } else if (z3) {
                        i = 2;
                    } else {
                        i = 3;
                    }
                } else if (z3) {
                    i = 2;
                } else {
                    i = 6;
                }
            }
            i2 = i;
        }
        h3d h3dVarB = gm0.B(this.y, j4dVar.R());
        long j3 = 128;
        for (int i5 = 0; i5 < h3dVarB.a.a.size(); i5++) {
            int iB = h3dVarB.a.b(i5);
            if (iB == 1) {
                j2 = z3 ? 516L : 514L;
            } else if (iB == 2) {
                j2 = PlaybackStateCompat.ACTION_PREPARE;
            } else if (iB == 3) {
                j2 = 1;
            } else if (iB != 31) {
                switch (iB) {
                    case 5:
                        j2 = 256;
                        break;
                    case 6:
                    case 7:
                        j2 = 16;
                        break;
                    case 8:
                    case 9:
                        j2 = 32;
                        break;
                    case 10:
                        j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                        break;
                    case 11:
                        j2 = 8;
                        break;
                    case 12:
                        j2 = 64;
                        break;
                    case 13:
                        j2 = PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
                        break;
                    case 14:
                        j2 = 2621440;
                        break;
                    case 15:
                        j2 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                        break;
                    default:
                        j2 = 0;
                        break;
                }
            } else {
                j2 = 240640;
            }
            j3 |= j2;
        }
        if (!this.w.isEmpty() && by3.c(2, this.v)) {
            j3 &= -17;
        }
        if (!this.w.isEmpty() && by3.c(3, this.v)) {
            j3 &= -33;
        }
        if (!z2) {
            j3 &= -257;
        }
        long j4 = j3;
        int i6 = -1;
        if (j4dVar.c(17)) {
            int iF = j4dVar.F();
            u98 u98Var2 = mz8.a;
            j = iF == -1 ? -1L : iF;
        } else {
            j = -1;
        }
        float f = j4dVar.a0().a;
        float f2 = (j4dVar.h0() && z2) ? f : 0.0f;
        Bundle bundle = playbackExceptionM != null ? new Bundle(playbackExceptionM.c) : new Bundle();
        bundle.putAll(this.u);
        bundle.putFloat("EXO_SPEED", f);
        ry9 ry9VarV = j4dVar.V();
        if (ry9VarV != null) {
            String str = ry9VarV.a;
            if (!"".equals(str)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str);
            }
        }
        long jE = z2 ? j4dVar.e() : -1L;
        long jS = z2 ? j4dVar.S() : -1L;
        ArrayList arrayList = new ArrayList();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i7 = 0;
        while (i7 < this.v.size()) {
            by3 by3Var = (by3) this.v.get(i7);
            emf emfVar = by3Var.a;
            Uri uri = by3Var.e;
            int i8 = by3Var.c;
            Bundle bundle2 = by3Var.g;
            if (emfVar != null) {
                Bundle bundle3 = emfVar.c;
                String str2 = emfVar.b;
                if (by3Var.i && emfVar.a == 0) {
                    fmf fmfVar = this.x;
                    if ((emfVar != null && fmfVar.a.contains(emfVar)) || (((i4 = by3Var.b) != i6 && h3dVarB.a(i4)) || by3.n(str2))) {
                        boolean z4 = i8 != 0;
                        boolean z5 = uri != null;
                        if (z4 || z5 || !bundle2.isEmpty()) {
                            bundle3 = new Bundle(bundle3);
                        }
                        if (!bundle2.isEmpty()) {
                            bundle3.putAll(bundle2);
                        }
                        if (z4) {
                            bundle3.putInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", i8);
                        }
                        if (z5) {
                            uri.getClass();
                            bundle3.putString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT", uri.toString());
                        }
                        a9m a9mVar = new a9m(str2, by3Var.f, by3Var.d);
                        a9mVar.k(bundle3);
                        arrayList.add(a9mVar.b());
                    }
                }
            }
            i7++;
            i6 = -1;
        }
        if (playbackExceptionM != null) {
            u98 u98Var3 = mz8.a;
            int i9 = playbackExceptionM.a;
            if (i9 == -110) {
                i3 = 8;
            } else if (i9 == -109) {
                i3 = 11;
            } else if (i9 == -6) {
                i3 = 2;
            } else if (i9 == -2) {
                i3 = 1;
            } else if (i9 != 1) {
                switch (i9) {
                    case -107:
                        i3 = 9;
                        break;
                    case -106:
                        i3 = 7;
                        break;
                    case -105:
                        i3 = 6;
                        break;
                    case -104:
                        i3 = 5;
                        break;
                    case -103:
                        i3 = 4;
                        break;
                    case -102:
                        i3 = 3;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
            } else {
                i3 = 10;
            }
            message = playbackExceptionM.getMessage();
        } else {
            i3 = 0;
            message = null;
        }
        return new x2d(i2, jE, jS, f2, j4, i3, message, jElapsedRealtime, arrayList, j, bundle);
    }

    public final void F(final int i, final n3a n3aVar, final p3a p3aVar, final boolean z2) {
        d3a d3aVar = this.g;
        if (d3aVar.j()) {
            return;
        }
        if (p3aVar != null) {
            vqi.d0(d3aVar.l, new Runnable() { // from class: e3a
                @Override // java.lang.Runnable
                public final void run() {
                    n3a n3aVar2 = n3aVar;
                    o3a o3aVar = this.a;
                    d3a d3aVar2 = o3aVar.g;
                    if (d3aVar2.j()) {
                        return;
                    }
                    boolean zIsActive = ((q2a) o3aVar.m.b).a.isActive();
                    int i2 = i;
                    p3a p3aVar2 = p3aVar;
                    if (!zIsActive) {
                        StringBuilder sbY = zo5.y(i2, "Ignore incoming player command before initialization. command=", ", pid=");
                        sbY.append(p3aVar2.a.b);
                        lvb.G0("MediaSessionLegacyStub", sbY.toString());
                        return;
                    }
                    i2a i2aVarJ = o3aVar.J(p3aVar2);
                    if (!o3aVar.f.N(i2aVarJ, i2)) {
                        if (i2 != 1 || d3aVar2.t.z()) {
                            return;
                        }
                        lvb.G0("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                        return;
                    }
                    f2a f2aVar = d3aVar2.e;
                    d3aVar2.t(i2aVarJ);
                    f2aVar.getClass();
                    try {
                        n3aVar2.b(i2aVarJ);
                    } catch (RemoteException e) {
                        lvb.H0("MediaSessionLegacyStub", "Exception in " + i2aVarJ, e);
                    }
                    if (z2) {
                        new SparseBooleanArray().append(i2, true);
                        d3aVar2.q(i2aVarJ);
                    }
                }
            });
            return;
        }
        lvb.g0("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i);
    }

    public final void G(emf emfVar, int i, n3a n3aVar, p3a p3aVar) {
        Object objValueOf;
        if (p3aVar != null) {
            vqi.d0(this.g.l, new vk1(this, emfVar, i, p3aVar, n3aVar, 2));
            return;
        }
        StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        if (emfVar == null) {
            objValueOf = emfVar;
            objValueOf = Integer.valueOf(i);
        }
        objValueOf = emfVar;
        sb.append(objValueOf);
        lvb.g0("MediaSessionLegacyStub", sb.toString());
    }

    public final void I(ry9 ry9Var, boolean z2, boolean z3) {
        F(31, new x2a(this, ry9Var, z2, z3), ((q2a) this.m.b).b(), false);
    }

    public final i2a J(p3a p3aVar) {
        i2a i2aVarZ = this.f.z(p3aVar);
        if (i2aVarZ == null) {
            i2a i2aVar = new i2a(p3aVar, 0, 0, this.h.n(p3aVar), new l3a(p3aVar), Bundle.EMPTY);
            g2a g2aVarM = this.g.m(i2aVar);
            this.f.a(p3aVar, i2aVar, g2aVarM.a, g2aVarM.b);
            d3a d3aVar = this.g;
            if (!d3aVar.A || !d3a.k(i2aVar)) {
                d3aVar.e.getClass();
            }
            i2aVarZ = i2aVar;
        }
        m2a m2aVar = this.j;
        long j = this.r;
        m2aVar.removeMessages(1001, i2aVarZ);
        m2aVar.sendMessageDelayed(m2aVar.obtainMessage(1001, i2aVarZ), j);
        return i2aVarZ;
    }

    public final void K() {
        dg dgVar;
        this.v = by3.j(by3.g(this.w, this.x, this.y), true, true);
        boolean z2 = this.k;
        Bundle bundle = this.u;
        if (z2 && ((dgVar = this.l) == null || !dgVar.a())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", (this.v.isEmpty() || by3.c(2, this.v)) ? false : true);
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        } else {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !by3.c(2, this.v));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !by3.c(3, this.v));
        }
    }

    public final void L() {
        Bundle bundle = this.u;
        boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z3 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        K();
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z2 && bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z3) {
            return;
        }
        ((q2a) this.m.b).a.setExtras(bundle);
    }

    public final void M(j4d j4dVar) {
        vqi.d0(this.g.l, new o90(this, 15, j4dVar));
    }

    @Override // defpackage.o2a
    public final void b(uv9 uv9Var) {
        if (uv9Var != null) {
            F(20, new vf6(this, uv9Var, -1, 2), ((q2a) this.m.b).b(), false);
        }
    }

    @Override // defpackage.o2a
    public final void c(uv9 uv9Var, int i) {
        if (uv9Var != null) {
            if (i == -1 || i >= 0) {
                F(20, new vf6(this, uv9Var, i, 2), ((q2a) this.m.b).b(), false);
            }
        }
    }

    @Override // defpackage.o2a
    public final void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            resultReceiver.send(0, this.g.j.b());
        } else {
            emf emfVar = new emf(str, Bundle.EMPTY);
            G(emfVar, 0, new oo(this, emfVar, bundle, resultReceiver), ((q2a) this.m.b).b());
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    @Override // defpackage.o2a
    public final void e(String str, Bundle bundle) {
        boolean zBooleanValue;
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        emf emfVar = new emf(str, bundle);
        boolean zN = by3.n(str);
        v2a v2aVar = this.m;
        if (!zN) {
            G(emfVar, 0, new f3a(this, emfVar, bundle), ((q2a) v2aVar.b).b());
            return;
        }
        try {
            by3 by3VarD = by3.d(emfVar);
            int i = by3VarD.b;
            Object obj = by3VarD.j;
            if (!by3VarD.b()) {
                lvb.G0("MediaSessionLegacyStub", "Can't execute predefined custom command: ".concat(str));
                return;
            }
            emf emfVar2 = by3VarD.a;
            if (emfVar2 != null) {
                lvb.b0(emfVar2.a == 40010);
                obj.getClass();
                G(null, 40010, new f3a(this, (z4e) obj), ((q2a) v2aVar.b).b());
                return;
            }
            j4d j4dVar = this.g.t;
            if (i != 1) {
                zBooleanValue = false;
            } else if (obj != null) {
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else if (j4dVar.z()) {
                zBooleanValue = false;
            } else {
                zBooleanValue = true;
            }
            if (zBooleanValue) {
                F(1, new f3a(this, 7), ((q2a) v2aVar.b).b(), false);
            } else if (i != 31) {
                F(i, new fv9(this, 5, by3VarD), ((q2a) v2aVar.b).b(), true);
            } else {
                obj.getClass();
                I((ry9) obj, false, false);
            }
        } catch (RuntimeException e) {
            lvb.H0("MediaSessionLegacyStub", "Failed to convert predefined custom command: " + emfVar.b, e);
        }
    }

    @Override // defpackage.o2a
    public final void f() {
        F(12, new f3a(this, 12), ((q2a) this.m.b).b(), true);
    }

    @Override // defpackage.o2a
    public final boolean g(Intent intent) {
        p3a p3aVarB = ((q2a) this.m.b).b();
        p3aVarB.getClass();
        return this.g.o(new i2a(p3aVarB, 0, 0, false, null, Bundle.EMPTY), intent);
    }

    @Override // defpackage.o2a
    public final void h() {
        F(1, new f3a(this, 0), ((q2a) this.m.b).b(), true);
    }

    @Override // defpackage.o2a
    public final void i() {
        F(1, new f3a(this, 7), ((q2a) this.m.b).b(), false);
    }

    @Override // defpackage.o2a
    public final void j(String str, Bundle bundle) {
        I(D(str, null, null, bundle), true, true);
    }

    @Override // defpackage.o2a
    public final void k(String str, Bundle bundle) {
        I(D(null, null, str, bundle), true, true);
    }

    @Override // defpackage.o2a
    public final void l(Uri uri, Bundle bundle) {
        I(D(null, uri, null, bundle), true, true);
    }

    @Override // defpackage.o2a
    public final void m() {
        F(2, new f3a(this, 8), ((q2a) this.m.b).b(), true);
    }

    @Override // defpackage.o2a
    public final void n(String str, Bundle bundle) {
        I(D(str, null, null, bundle), true, false);
    }

    @Override // defpackage.o2a
    public final void o(String str, Bundle bundle) {
        I(D(null, null, str, bundle), true, false);
    }

    @Override // defpackage.o2a
    public final void p(Uri uri, Bundle bundle) {
        I(D(null, uri, null, bundle), true, false);
    }

    @Override // defpackage.o2a
    public final void q(uv9 uv9Var) {
        if (uv9Var == null) {
            return;
        }
        F(20, new fv9(this, 6, uv9Var), ((q2a) this.m.b).b(), true);
    }

    @Override // defpackage.o2a
    public final void r() {
        F(11, new f3a(this, 6), ((q2a) this.m.b).b(), true);
    }

    @Override // defpackage.o2a
    public final void s(long j) {
        F(5, new g3a(this, j, 1), ((q2a) this.m.b).b(), true);
    }

    @Override // defpackage.o2a
    public final void t(float f) {
        if (f <= 0.0f) {
            return;
        }
        F(13, new l75(this, f), ((q2a) this.m.b).b(), true);
    }

    @Override // defpackage.o2a
    public final void u(d5e d5eVar) {
        v(d5eVar);
    }

    @Override // defpackage.o2a
    public final void v(d5e d5eVar) {
        z4e z4eVarN = mz8.n(d5eVar);
        if (z4eVarN != null) {
            G(null, 40010, new f3a(this, z4eVarN), ((q2a) this.m.b).b());
            return;
        }
        lvb.G0("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + d5eVar);
    }

    @Override // defpackage.o2a
    public final void w(int i) {
        F(15, new h3a(this, i, 0), ((q2a) this.m.b).b(), true);
    }

    @Override // defpackage.o2a
    public final void x(int i) {
        F(14, new h3a(this, i, 1), ((q2a) this.m.b).b(), true);
    }

    @Override // defpackage.o2a
    public final void y() {
        boolean zC = this.g.t.c(9);
        v2a v2aVar = this.m;
        if (zC) {
            F(9, new f3a(this, 10), ((q2a) v2aVar.b).b(), true);
        } else {
            F(8, new f3a(this, 11), ((q2a) v2aVar.b).b(), true);
        }
    }

    @Override // defpackage.o2a
    public final void z() {
        boolean zC = this.g.t.c(7);
        v2a v2aVar = this.m;
        if (zC) {
            F(7, new f3a(this, 4), ((q2a) v2aVar.b).b(), true);
        } else {
            F(6, new f3a(this, 5), ((q2a) v2aVar.b).b(), true);
        }
    }
}
