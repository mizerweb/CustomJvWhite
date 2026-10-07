package defpackage;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.graphics.Rect;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.Surface;
import android.view.ViewGroup;
import androidx.biometric.BiometricViewModel;
import androidx.fragment.app.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.externcalls.sdk.signaling.SignalingTransportBuilder;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class yfj implements vff, p4g {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public yfj(j22 j22Var) {
        this.a = j22Var;
        xva xvaVar = new xva(26, this);
        this.b = xvaVar;
        p4g p4gVarBuild = ((SignalingTransportBuilder) j22Var.b).build(new a6g(false, null, null, 0L));
        y5g y5gVar = p4gVarBuild instanceof y5g ? (y5g) p4gVarBuild : null;
        if (y5gVar != null) {
            y5gVar.setListener(xvaVar);
        }
        this.c = p4gVarBuild;
        this.f = new ReentrantLock();
    }

    public static yfj i(nt9 nt9Var, MediaFormat mediaFormat, b87 b87Var, MediaCrypto mediaCrypto, euc eucVar) {
        return new yfj(nt9Var, mediaFormat, b87Var, null, mediaCrypto, eucVar);
    }

    public static yfj j(nt9 nt9Var, MediaFormat mediaFormat, b87 b87Var, Surface surface, MediaCrypto mediaCrypto) {
        return new yfj(nt9Var, mediaFormat, b87Var, surface, mediaCrypto, null);
    }

    @Override // defpackage.vff
    public zoh a() {
        return new zoh(R.string.oneme_login_neuro_avatars_profile_title, R.string.oneme_login_neuro_avatars_profile_description, R.string.oneme_login_neuro_avatars_save_button);
    }

    @Override // defpackage.vff
    public void b(cef cefVar) {
        ((pzf) this.b).a(cefVar);
    }

    @Override // defpackage.vff
    public void c(eef eefVar) {
        teb tebVar = (teb) this.a;
        if (!(eefVar instanceof cef)) {
            tebVar.invoke();
            return;
        }
        Object value = ((r8e) this.f).a.getValue();
        y1d y1dVar = value instanceof y1d ? (y1d) value : null;
        if (y1dVar != null && ((cef) eefVar).c == y1dVar.b) {
            tebVar.invoke();
        } else {
            ((pvb) ((ny8) this.e).getValue()).B(null, null, null, ((cef) eefVar).c, 1);
            tebVar.invoke();
        }
    }

    @Override // defpackage.vff
    public r8e d() {
        return (r8e) this.f;
    }

    @Override // defpackage.p4g
    public void dispose() {
        ReentrantLock reentrantLock = (ReentrantLock) this.f;
        reentrantLock.lock();
        try {
            p4g p4gVar = (p4g) this.c;
            reentrantLock.unlock();
            if (p4gVar != null) {
                p4gVar.dispose();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.vff
    public void e(udb udbVar) {
        mjg mjgVar = (mjg) this.d;
        y1d y1dVar = new y1d(udbVar.b, udbVar.a, udbVar.c);
        mjgVar.getClass();
        mjgVar.j(null, y1dVar);
    }

    @Override // defpackage.vff
    public q8e f() {
        return (q8e) this.c;
    }

    public void g(String str, h50 h50Var, ViewGroup viewGroup) {
        xv3 xv3Var = (xv3) this.a;
        Object obj = null;
        CharSequence charSequenceB = ((h50Var instanceof e50) || (h50Var instanceof g50)) ? h50Var.c().b(viewGroup.getContext()) : null;
        g50 g50Var = h50Var instanceof g50 ? (g50) h50Var : null;
        float f = (g50Var != null ? g50Var.b : 0.0f) / 100.0f;
        b9b b9bVar = (b9b) this.c;
        if (charSequenceB == null) {
            wti wtiVar = (wti) b9bVar.d(str);
            if (wtiVar != null) {
                wtiVar.setVisibility(8);
            }
            zv8[] zv8VarArr = xv3.o;
            xv3Var.l(str, false, Float.valueOf(0.0f));
            return;
        }
        wti wtiVar2 = (wti) b9bVar.d(str);
        if (wtiVar2 == null) {
            u8b u8bVar = (u8b) this.b;
            Object[] objArr = u8bVar.a;
            int i = u8bVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj2 = objArr[i2];
                if (!((b9b) this.c).c((wti) obj2)) {
                    obj = obj2;
                    break;
                }
            }
            wti wtiVar3 = (wti) obj;
            if (wtiVar3 != null) {
                ((b9b) this.c).o(str, wtiVar3);
            } else {
                wtiVar3 = new wti(viewGroup.getContext());
                wtiVar3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                wtiVar3.setVisibility(8);
                wtiVar3.setDrawableEnabled(false);
                wtiVar3.setBackgroundEnabled(true);
                u8bVar.b(wtiVar3);
                viewGroup.addView(wtiVar3);
                ((b9b) this.c).o(str, wtiVar3);
                viewGroup.requestLayout();
            }
            wtiVar2 = wtiVar3;
        }
        wtiVar2.setContent(charSequenceB);
        wtiVar2.setVisibility(0);
        xv3Var.l(str, true, Float.valueOf(f));
    }

    public void h(cx0 cx0Var, String str, String str2) {
        String string = ((b) this.a).getString(R.string.cancel);
        boolean zB = zcl.b(15);
        if (str2 == null || str2.length() == 0) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str)) {
            ore.p("Title must be set and non-empty.");
            return;
        }
        if (TextUtils.isEmpty(string) && !zB) {
            ore.p("Negative text must be set and non-empty.");
            return;
        }
        if (!TextUtils.isEmpty(string) && zB) {
            ore.p("Negative text must not be set if device credential authentication is allowed.");
            return;
        }
        r6a r6aVar = new r6a(str, str2, string);
        ny8 ny8Var = (ny8) this.f;
        if (cx0Var == null) {
            ((dx0) ny8Var.getValue()).a(r6aVar, null);
            return;
        }
        dx0 dx0Var = (dx0) ny8Var.getValue();
        dx0Var.getClass();
        if (Build.VERSION.SDK_INT >= 30 || !zB) {
            dx0Var.a(r6aVar, cx0Var);
        } else {
            ore.p("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
    }

    public kam k(kam kamVar) {
        return kamVar.l(new sv(1), new eu6(15, this));
    }

    public void l(List list) {
        wti wtiVar;
        yv3 yv3Var = (yv3) this.d;
        if (yv3Var != null) {
            ArrayList arrayList = yv3Var.b;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String strK = ((yu3) it.next()).k();
                if (strK != null) {
                    arrayList2.add(strK);
                }
            }
            int i = 0;
            for (Object obj : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    xw3.V0();
                    throw null;
                }
                String str = (String) obj;
                Rect rect = (Rect) ww3.u1(i, list);
                if (rect != null && (wtiVar = (wti) ((b9b) this.c).d(str)) != null) {
                    int iK = gm0.K(yl5.d().getDisplayMetrics().density * 6.0f);
                    int i3 = rect.left + iK;
                    int i4 = rect.top + iK;
                    int measuredWidth = wtiVar.getMeasuredWidth() + i3;
                    int iD = zo5.D(6.0f, yl5.d().getDisplayMetrics().density, rect.width());
                    if (measuredWidth > iD) {
                        measuredWidth = iD;
                    }
                    int measuredHeight = wtiVar.getMeasuredHeight() + i4;
                    int iD2 = zo5.D(6.0f, yl5.d().getDisplayMetrics().density, rect.height());
                    if (measuredHeight > iD2) {
                        measuredHeight = iD2;
                    }
                    wtiVar.setOutlineProvider(new kw3(measuredWidth, measuredHeight));
                    wtiVar.setClipToOutline(true);
                    qyj.M(wtiVar, i3, i4, 0, 12);
                }
                i = i2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    public void m(int i, int i2) {
        b9b b9bVar = (b9b) this.c;
        Object[] objArr = b9bVar.b;
        Object[] objArr2 = b9bVar.c;
        long[] jArr = b9bVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j) < 128) {
                        int i6 = (i3 << 3) + i5;
                        Object obj = objArr[i6];
                        wti wtiVar = (wti) objArr2[i6];
                        if (wtiVar != null) {
                            wtiVar.measure(i, i2);
                        }
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    public void n(yv3 yv3Var, ViewGroup viewGroup, gjg gjgVar) {
        lw3 lw3Var;
        this.d = yv3Var;
        u8b u8bVar = (u8b) this.b;
        Object[] objArr = u8bVar.a;
        int i = u8bVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((wti) objArr[i2]).setVisibility(8);
        }
        b9b b9bVar = new b9b();
        ArrayList arrayList = yv3Var.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strK = ((yu3) it.next()).k();
            if (strK != null) {
                arrayList2.add(strK);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            b9bVar.k((String) it2.next(), null);
        }
        this.c = b9bVar;
        u8b u8bVar2 = yv3Var.d;
        Object[] objArr2 = u8bVar2.a;
        int i3 = u8bVar2.b;
        for (int i4 = 0; i4 < i3; i4++) {
            h50 h50Var = (h50) objArr2[i4];
            String strA = h50Var.a();
            if (strA != null) {
                g(strA, h50Var, viewGroup);
            }
        }
        this.e = new lw3(this, gjgVar, viewGroup);
        if (viewGroup.isAttachedToWindow() && (lw3Var = (lw3) this.e) != null) {
            lw3Var.onViewAttachedToWindow(viewGroup);
        }
        viewGroup.addOnAttachStateChangeListener((lw3) this.e);
    }

    public void o(ViewGroup viewGroup) throws IllegalAccessException, InvocationTargetException {
        u8b u8bVar = (u8b) this.b;
        viewGroup.removeOnAttachStateChangeListener((lw3) this.e);
        sgg sggVar = (sgg) this.f;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.f = null;
        ((b9b) this.c).g();
        Object[] objArr = u8bVar.a;
        int i = u8bVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            viewGroup.removeView((wti) objArr[i2]);
        }
        u8bVar.f();
    }

    public void p(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String strEncodeToString;
        boolean z;
        int i2;
        PackageInfo packageInfoD;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        ov6 ov6Var = (ov6) this.a;
        ov6Var.a();
        bundle.putString("gmp_app_id", ov6Var.c.b);
        q1j q1jVar = (q1j) this.b;
        synchronized (q1jVar) {
            try {
                if (q1jVar.a == 0 && (packageInfoD = q1jVar.d("com.google.android.gms")) != null) {
                    q1jVar.a = packageInfoD.versionCode;
                }
                i = q1jVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((q1j) this.b).b());
        q1j q1jVar2 = (q1j) this.b;
        synchronized (q1jVar2) {
            try {
                if (((String) q1jVar2.e) == null) {
                    q1jVar2.j();
                }
                str3 = (String) q1jVar2.e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("app_ver_name", str3);
        ov6 ov6Var2 = (ov6) this.a;
        ov6Var2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(ov6Var2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((vh0) gwl.a(((sv6) ((tv6) this.f)).e())).a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) gwl.a(((sv6) ((tv6) this.f)).c()));
        bundle.putString("cliv", "fcm-24.0.1");
        qu7 qu7Var = (qu7) ((xwd) this.e).get();
        xe5 xe5Var = (xe5) ((xwd) this.d).get();
        if (qu7Var == null || xe5Var == null) {
            return;
        }
        za5 za5Var = (za5) qu7Var;
        synchronized (za5Var) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            uik uikVar = (uik) za5Var.a.get();
            synchronized (uikVar) {
                z = uikVar.z(jCurrentTimeMillis);
            }
            if (z) {
                synchronized (uikVar) {
                    String strT = uikVar.t(System.currentTimeMillis());
                    ((SharedPreferences) uikVar.b).edit().putString("last-used-date", strT).commit();
                    uikVar.w(strT);
                }
                i2 = 3;
            } else {
                i2 = 1;
            }
        }
        if (i2 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(qt4.D(i2)));
            bundle.putString("Firebase-Client", xe5Var.a());
        }
    }

    public kam q(String str, String str2, Bundle bundle) {
        int i;
        try {
            p(str, str2, bundle);
            ove oveVar = (ove) this.c;
            jm5 jm5Var = jm5.d;
            jrc jrcVar = oveVar.c;
            if (jrcVar.E() < 12000000) {
                return jrcVar.F() != 0 ? oveVar.a(bundle).f(jm5Var, new h6f(oveVar, 15, bundle)) : gwl.d(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            a9m a9mVarL = a9m.l(oveVar.b);
            synchronized (a9mVarL) {
                i = a9mVarL.b;
                a9mVarL.b = i + 1;
            }
            return a9mVarL.m(new g3m(i, 1, bundle, 1)).l(jm5Var, l6m.s);
        } catch (InterruptedException | ExecutionException e) {
            return gwl.d(e);
        }
    }

    public void r(sql sqlVar) {
        this.e = sqlVar;
    }

    @Override // defpackage.p4g
    public void registerListener(o4g o4gVar) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f;
        reentrantLock.lock();
        try {
            this.d = o4gVar;
            p4g p4gVar = (p4g) this.c;
            if (p4gVar != null) {
                p4gVar.registerListener(o4gVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.p4g
    public void restart(String str, Long l) {
        str.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.f;
        reentrantLock.lock();
        try {
            p4g p4gVar = (p4g) this.c;
            reentrantLock.unlock();
            if (p4gVar != null) {
                p4gVar.restart(str, l);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void s(zsl zslVar) {
        this.d = zslVar;
    }

    @Override // defpackage.p4g
    public void send(String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f;
        reentrantLock.lock();
        try {
            p4g p4gVar = (p4g) this.c;
            reentrantLock.unlock();
            if (p4gVar != null) {
                p4gVar.send(str);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.p4g
    public void tryReconnectNow() {
        ReentrantLock reentrantLock = (ReentrantLock) this.f;
        reentrantLock.lock();
        try {
            p4g p4gVar = (p4g) this.c;
            reentrantLock.unlock();
            if (p4gVar != null) {
                p4gVar.tryReconnectNow();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.p4g
    public j4i type() {
        p4g p4gVar = (p4g) this.c;
        if (p4gVar != null) {
            return p4gVar.type();
        }
        return null;
    }

    @Override // defpackage.p4g
    public void updateActivityTimeout(long j) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f;
        reentrantLock.lock();
        try {
            this.e = Long.valueOf(j);
            p4g p4gVar = (p4g) this.c;
            if (p4gVar != null) {
                p4gVar.updateActivityTimeout(j);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public /* synthetic */ yfj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public yfj() {
    }

    public yfj(ar arVar, cf7 cf7Var, af7 af7Var) {
        this.a = arVar;
        this.b = cf7Var;
        this.c = af7Var;
        this.d = yfj.class.getName();
        final int i = 0;
        this.e = rx8.P(3, new af7(this) { // from class: wfj
            public final /* synthetic */ yfj b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                b8j b8jVarA;
                int i2 = i;
                yfj yfjVar = this.b;
                switch (i2) {
                    case 0:
                        return new xfj(yfjVar);
                    default:
                        b bVar = (b) yfjVar.a;
                        xfj xfjVar = (xfj) ((ny8) yfjVar.e).getValue();
                        dx0 dx0Var = new dx0();
                        if (bVar == null) {
                            ore.p("FragmentActivity must not be null.");
                        } else if (xfjVar != null) {
                            hb7 hb7VarP = bVar.p();
                            h8j h8jVarB = bVar.b();
                            f8j f8jVarK = bVar.k();
                            x7b x7bVarE = bVar.e();
                            LinkedHashMap linkedHashMap = h8jVarB.a;
                            sr3 sr3VarA = zfe.a(BiometricViewModel.class);
                            String strG = sr3VarA.g();
                            if (strG != null) {
                                String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strG);
                                b8j b8jVar = (b8j) linkedHashMap.get(strConcat);
                                if (!sr3VarA.i(b8jVar)) {
                                    x7b x7bVar = new x7b(x7bVarE);
                                    x7bVar.o(khb.n, strConcat);
                                    try {
                                        try {
                                            b8jVarA = f8jVarK.c(sr3VarA, x7bVar);
                                        } catch (AbstractMethodError unused) {
                                            b8jVarA = f8jVarK.a(sr3VarA.d());
                                        }
                                    } catch (AbstractMethodError unused2) {
                                        b8jVarA = f8jVarK.b(sr3VarA.d(), x7bVar);
                                    }
                                    b8jVar = b8jVarA;
                                    b8j b8jVar2 = (b8j) linkedHashMap.put(strConcat, b8jVar);
                                    if (b8jVar2 != null) {
                                        b8jVar2.a();
                                    }
                                    break;
                                } else if (f8jVarK instanceof d1f) {
                                    ((d1f) f8jVarK).e(b8jVar);
                                }
                                BiometricViewModel biometricViewModel = (BiometricViewModel) b8jVar;
                                dx0Var.a = hb7VarP;
                                if (biometricViewModel == null) {
                                    return dx0Var;
                                }
                                biometricViewModel.b = xfjVar;
                                return dx0Var;
                            }
                            ore.p("Local and anonymous classes can not be ViewModels");
                        } else {
                            ore.p("AuthenticationCallback must not be null.");
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.f = rx8.P(3, new af7(this) { // from class: wfj
            public final /* synthetic */ yfj b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                b8j b8jVarA;
                int i3 = i2;
                yfj yfjVar = this.b;
                switch (i3) {
                    case 0:
                        return new xfj(yfjVar);
                    default:
                        b bVar = (b) yfjVar.a;
                        xfj xfjVar = (xfj) ((ny8) yfjVar.e).getValue();
                        dx0 dx0Var = new dx0();
                        if (bVar == null) {
                            ore.p("FragmentActivity must not be null.");
                        } else if (xfjVar != null) {
                            hb7 hb7VarP = bVar.p();
                            h8j h8jVarB = bVar.b();
                            f8j f8jVarK = bVar.k();
                            x7b x7bVarE = bVar.e();
                            LinkedHashMap linkedHashMap = h8jVarB.a;
                            sr3 sr3VarA = zfe.a(BiometricViewModel.class);
                            String strG = sr3VarA.g();
                            if (strG != null) {
                                String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strG);
                                b8j b8jVar = (b8j) linkedHashMap.get(strConcat);
                                if (!sr3VarA.i(b8jVar)) {
                                    x7b x7bVar = new x7b(x7bVarE);
                                    x7bVar.o(khb.n, strConcat);
                                    try {
                                        try {
                                            b8jVarA = f8jVarK.c(sr3VarA, x7bVar);
                                        } catch (AbstractMethodError unused) {
                                            b8jVarA = f8jVarK.a(sr3VarA.d());
                                        }
                                    } catch (AbstractMethodError unused2) {
                                        b8jVarA = f8jVarK.b(sr3VarA.d(), x7bVar);
                                    }
                                    b8jVar = b8jVarA;
                                    b8j b8jVar2 = (b8j) linkedHashMap.put(strConcat, b8jVar);
                                    if (b8jVar2 != null) {
                                        b8jVar2.a();
                                    }
                                    break;
                                } else if (f8jVarK instanceof d1f) {
                                    ((d1f) f8jVarK).e(b8jVar);
                                }
                                BiometricViewModel biometricViewModel = (BiometricViewModel) b8jVar;
                                dx0Var.a = hb7VarP;
                                if (biometricViewModel == null) {
                                    return dx0Var;
                                }
                                biometricViewModel.b = xfjVar;
                                return dx0Var;
                            }
                            ore.p("Local and anonymous classes can not be ViewModels");
                        } else {
                            ore.p("AuthenticationCallback must not be null.");
                        }
                        return null;
                }
            }
        });
    }

    public yfj(xv3 xv3Var) {
        this.a = xv3Var;
        this.b = new u8b();
        this.c = new b9b();
    }
}
