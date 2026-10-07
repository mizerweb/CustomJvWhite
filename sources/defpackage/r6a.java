package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.location.LocationManager;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import com.vk.push.common.clientid.ClientId;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.a;
import one.me.sdk.media.transformer.MediaTransformException;
import ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException;

/* JADX INFO: loaded from: classes3.dex */
public final class r6a implements x76, yp, mo, dq, cv1, gqb, gsb, fbf, w76, rg4 {
    public static final fok d = new fok(3);
    public static r6a e;
    public Object a;
    public Object b;
    public Object c;

    public r6a(int i) {
        switch (i) {
            case 10:
                this.a = new g8b();
                this.b = new HashMap();
                break;
            case 19:
                this.a = new ConcurrentHashMap();
                this.b = new ConcurrentLinkedDeque();
                this.c = new ReentrantLock();
                break;
            default:
                this.a = new HashMap();
                this.b = new HashMap();
                this.c = d;
                break;
        }
    }

    public static r6a B(Context context) {
        if (e == null) {
            Context applicationContext = context.getApplicationContext();
            LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
            r6a r6aVar = new r6a();
            r6aVar.b = new c8h();
            r6aVar.c = applicationContext;
            r6aVar.a = locationManager;
            e = r6aVar;
        }
        return e;
    }

    public static k84 t(d0c d0cVar, n6a n6aVar, t26 t26Var) {
        k84 k84Var = new k84(t26Var, new t26[0]);
        prk prkVar = (prk) d0cVar.b;
        int i = 2;
        if (prkVar instanceof sx9) {
            sx9 sx9Var = (sx9) prkVar;
            if (sx9Var.h) {
                n6aVar.e = 0;
                k84Var.g = 0;
            } else {
                if (sx9Var.i && Build.VERSION.SDK_INT >= 31) {
                    i = 1;
                }
                n6aVar.e = i;
                k84Var.g = i;
            }
        } else if (prkVar instanceof rx9) {
            rx9 rx9Var = (rx9) prkVar;
            if (rx9Var.j) {
                n6aVar.e = 0;
                k84Var.g = 0;
            } else {
                if (rx9Var.k && Build.VERSION.SDK_INT >= 31) {
                    i = 1;
                }
                n6aVar.e = i;
                k84Var.g = i;
            }
        } else {
            if (!(prkVar instanceof qx9)) {
                ore.o();
                return null;
            }
            if (!((Boolean) ((ny8) d0cVar.d).getValue()).booleanValue()) {
                n6aVar.e = 2;
                k84Var.g = 2;
            } else if (((qx9) prkVar).a) {
                k84Var.e = true;
                k84Var.f = true;
            }
        }
        return k84Var.a();
    }

    public void A(d0c d0cVar, n6a n6aVar, k84 k84Var) {
        String str;
        je9 je9Var = je9.d;
        je9 je9Var2 = je9.f;
        String str2 = (String) this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str2, "executeWithMainLooper", null);
        }
        String str3 = ((w5a) this.a).c;
        Handler handler = new Handler(Looper.getMainLooper());
        CountDownLatch countDownLatch = new CountDownLatch(1);
        q6a q6aVar = new q6a(n6aVar, this, countDownLatch, 1);
        final g2i g2iVarW = w(d0cVar.f((Context) this.c, n6aVar), d0cVar, q6aVar);
        boolean zPost = handler.post(new h82(this, g2iVarW, k84Var, str3, q6aVar, 5));
        final int i = 2;
        if (!zPost) {
            n6aVar.b(new MediaTransformException("Failed to start media transform on main loop", null, 2, null));
            final int i2 = 0;
            if (handler.post(new Runnable(this) { // from class: p6a
                public final /* synthetic */ r6a b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    g2i g2iVar = g2iVarW;
                    r6a r6aVar = this.b;
                    switch (i3) {
                        case 0:
                            r6aVar.s(g2iVar);
                            break;
                        case 1:
                            r6aVar.s(g2iVar);
                            break;
                        default:
                            r6aVar.r(g2iVar);
                            break;
                    }
                }
            })) {
                return;
            }
            String str4 = (String) this.b;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str4, "executeWithMainLooper, failed to cleanup transformer on main loop", null);
                return;
            }
            return;
        }
        w5a w5aVar = (w5a) this.a;
        final int i3 = 1;
        j6a j6aVar = new j6a(handler, g2iVarW, w5aVar.n, w5aVar.o, w5aVar.m);
        j6aVar.b();
        String str5 = (String) this.b;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, str5, "executeWithMainLooper, waiting for completion ...", null);
        }
        try {
            try {
                countDownLatch.await();
                String str6 = (String) this.b;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                    a4cVar4.c(je9Var, str6, "executeWithMainLooper, completed", null);
                }
                j6aVar.a();
                if (handler.post(new Runnable(this) { // from class: p6a
                    public final /* synthetic */ r6a b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i3;
                        g2i g2iVar = g2iVarW;
                        r6a r6aVar = this.b;
                        switch (i4) {
                            case 0:
                                r6aVar.s(g2iVar);
                                break;
                            case 1:
                                r6aVar.s(g2iVar);
                                break;
                            default:
                                r6aVar.r(g2iVar);
                                break;
                        }
                    }
                })) {
                    return;
                }
                str = (String) this.b;
                if (gm0.f == null) {
                    return;
                }
            } catch (InterruptedException e2) {
                n6aVar.b(new MediaTransformException("Waiting for media transform completion interrupted", e2));
                if (!handler.post(new Runnable(this) { // from class: p6a
                    public final /* synthetic */ r6a b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i;
                        g2i g2iVar = g2iVarW;
                        r6a r6aVar = this.b;
                        switch (i4) {
                            case 0:
                                r6aVar.s(g2iVar);
                                break;
                            case 1:
                                r6aVar.s(g2iVar);
                                break;
                            default:
                                r6aVar.r(g2iVar);
                                break;
                        }
                    }
                })) {
                    String str7 = (String) this.b;
                    a4c a4cVar5 = gm0.f;
                    if (a4cVar5 != null && a4cVar5.b(je9Var2)) {
                        a4cVar5.c(je9Var2, str7, "executeWithMainLooper, failed to abort media transformer on main loop", null);
                    }
                }
                j6aVar.a();
                if (handler.post(new Runnable(this) { // from class: p6a
                    public final /* synthetic */ r6a b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i3;
                        g2i g2iVar = g2iVarW;
                        r6a r6aVar = this.b;
                        switch (i4) {
                            case 0:
                                r6aVar.s(g2iVar);
                                break;
                            case 1:
                                r6aVar.s(g2iVar);
                                break;
                            default:
                                r6aVar.r(g2iVar);
                                break;
                        }
                    }
                })) {
                    return;
                }
                str = (String) this.b;
                if (gm0.f == null) {
                    return;
                }
            }
        } finally {
            j6aVar.a();
            if (!handler.post(new Runnable(this) { // from class: p6a
                public final /* synthetic */ r6a b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = i3;
                    g2i g2iVar = g2iVarW;
                    r6a r6aVar = this.b;
                    switch (i4) {
                        case 0:
                            r6aVar.s(g2iVar);
                            break;
                        case 1:
                            r6aVar.s(g2iVar);
                            break;
                        default:
                            r6aVar.r(g2iVar);
                            break;
                    }
                }
            })) {
                str = (String) this.b;
                a4c a4cVar6 = gm0.f;
                if (a4cVar6 != null && a4cVar6.b(je9Var2)) {
                    a4cVar6.c(je9Var2, str, "executeWithMainLooper, failed to cleanup transformer on main loop", null);
                }
            }
        }
    }

    public void C(vtb vtbVar) {
        try {
            bpl bplVar = (bpl) this.b;
            rnk rnkVar = new rnk(vtbVar);
            Parcel parcelL0 = bplVar.l0();
            duk.d(parcelL0, rnkVar);
            bplVar.m0(9, parcelL0);
        } catch (RemoteException e2) {
            f4a.d(e2);
        }
    }

    public boolean D() throws IOException {
        String strTrim;
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        if (((String) this.b) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.b = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.a).readLine();
                this.b = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.b = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    public SpannableStringBuilder E(String str, CharSequence charSequence) {
        ny8 ny8Var = (ny8) this.b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (charSequence != null && str != null) {
            for (caf cafVar : ((daf) ny8Var.getValue()).c(charSequence.toString(), ((daf) ny8Var.getValue()).d(charSequence.toString(), str))) {
                spannableStringBuilder.setSpan(new fqh(pq3.j.e((Context) this.c).m(), new u8h(5)), cafVar.a, cafVar.b, 17);
            }
        }
        return spannableStringBuilder;
    }

    public String F() {
        if (!D()) {
            qr7.d();
            return null;
        }
        String str = (String) this.b;
        this.b = null;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r22v0, types: [r6a] */
    /* JADX WARN: Type inference failed for: r8v14, types: [daf] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public ArrayList G(List list) {
        CharSequence charSequenceE;
        ny8 ny8Var = (ny8) this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            kah kahVar = (kah) next;
            if (kahVar.a.b != 1) {
                z = true;
            } else {
                lx2 lx2Var = (lx2) this.a;
                boolean z2 = kahVar.b;
                if (lx2Var == lx2.a) {
                    z = z2;
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p8h p8hVar = ((kah) it2.next()).a;
            String str = p8hVar.g;
            boolean z3 = (str == null || str.length() == 0 || str.length() != 1) ? false : true;
            ?? E = p8hVar.c;
            u9h u9hVar = null;
            if ((E == 0 || r5h.X0(E)) && (str == null || r5h.X0(str))) {
                E = 0;
            } else if (!z3 && ((daf) ny8Var.getValue()).g(E, str)) {
                E = E(str, E);
            }
            String str2 = p8hVar.g;
            boolean z4 = (str2 == null || str2.length() == 0 || str2.length() != 1) ? false : true;
            String str3 = p8hVar.c;
            String str4 = p8hVar.d;
            if ((str3 == null || r5h.X0(str3)) && (str2 == null || r5h.X0(str2))) {
                charSequenceE = str4;
                charSequenceE = null;
            } else if (z4) {
                if (str4 == null || str4.length() == 0) {
                    charSequenceE = str4;
                    charSequenceE = null;
                }
            } else if (str4 == null || str4.length() == 0) {
                charSequenceE = str4;
                charSequenceE = null;
            } else if (((daf) ny8Var.getValue()).g(str4, str2)) {
                charSequenceE = str4;
                charSequenceE = E(str2, str4);
            }
            if ((E != 0 && !r5h.X0(E)) || (charSequenceE != null && !r5h.X0(charSequenceE))) {
                long j = p8hVar.a;
                ?? J = E;
                if (E == 0) {
                    J = zo5.j(j, "id");
                }
                ?? r16 = J;
                CharSequence charSequence = charSequenceE == null ? "" : charSequenceE;
                String str5 = p8hVar.f;
                String str6 = str5 == null ? "" : str5;
                String str7 = p8hVar.g;
                u9hVar = new u9h(j, r16, str6, charSequence, str7 == null ? "" : str7, r66.a, p8hVar.b);
            }
            if (u9hVar != null) {
                arrayList2.add(u9hVar);
            }
        }
        return arrayList2;
    }

    public wm5 H(String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.c;
        reentrantLock.lock();
        try {
            wm5 wm5Var = (wm5) ((ConcurrentHashMap) this.a).remove(str);
            if (wm5Var == null) {
                return null;
            }
            ((ConcurrentLinkedDeque) this.b).remove(str);
            return wm5Var;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.gsb
    public void a(qp qpVar) {
        ((i18) this.c).f = qpVar;
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        obj.getClass();
        Long l = (Long) ((wfe) this.a).a;
        if (l != null) {
            cf7 cf7Var = (cf7) this.b;
            esh eshVar = (esh) this.c;
            long jLongValue = l.longValue();
            ((gsh) eshVar).getClass();
            cf7Var.invoke(Long.valueOf(SystemClock.elapsedRealtime() - jLongValue));
        }
    }

    @Override // defpackage.w76
    public void b() {
        ((r72) this.a).b(null);
    }

    @Override // defpackage.w76
    public void c(n76 n76Var) throws Exception {
        boolean z;
        qi0 qi0Var = (qi0) this.b;
        dee deeVar = (dee) this.c;
        if (deeVar.E != null) {
            try {
                deeVar.R(n76Var, qi0Var);
                n76Var.close();
                return;
            } catch (Throwable th) {
                try {
                    n76Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (deeVar.t) {
            tvj.a("Recorder", "Drop video data since recording is stopping.");
            n76Var.close();
            return;
        }
        n76 n76Var2 = deeVar.X;
        if (n76Var2 != null) {
            n76Var2.close();
            deeVar.X = null;
            z = true;
        } else {
            z = false;
        }
        if (!n76Var.H()) {
            if (z) {
                tvj.a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
            }
            tvj.a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
            m86 m86Var = deeVar.H;
            m86Var.h.execute(new a86(m86Var, 3));
            n76Var.close();
            return;
        }
        deeVar.X = n76Var;
        if (!deeVar.r() || !deeVar.Y.g()) {
            tvj.a("Recorder", "Received video keyframe. Starting muxer...");
            deeVar.J(qi0Var);
        } else if (z) {
            tvj.a("Recorder", "Replaced cached video keyframe with newer keyframe.");
        } else {
            tvj.a("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
        }
    }

    @Override // defpackage.fbf
    public void d(nmc nmcVar) {
        long jD;
        long j;
        ((dth) this.b).getClass();
        String str = vqi.a;
        dth dthVar = (dth) this.b;
        synchronized (dthVar) {
            try {
                long j2 = dthVar.c;
                jD = j2 != -9223372036854775807L ? j2 + dthVar.b : dthVar.d();
            } catch (Throwable th) {
                throw th;
            }
        }
        dth dthVar2 = (dth) this.b;
        synchronized (dthVar2) {
            j = dthVar2.b;
        }
        if (jD == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        b87 b87Var = (b87) this.a;
        if (j != b87Var.s) {
            a87 a87VarA = b87Var.a();
            a87VarA.r = j;
            b87 b87Var2 = new b87(a87VarA);
            this.a = b87Var2;
            ((kyh) this.c).g(b87Var2);
        }
        int iA = nmcVar.a();
        ((kyh) this.c).f(iA, nmcVar);
        ((kyh) this.c).a(jD, 1, iA, 0, null);
    }

    @Override // defpackage.fbf
    public void e(dth dthVar, lj6 lj6Var, m5i m5iVar) {
        this.b = dthVar;
        m5iVar.a();
        m5iVar.b();
        kyh kyhVarG = lj6Var.G(m5iVar.d, 5);
        this.c = kyhVarG;
        kyhVarG.g((b87) this.a);
    }

    @Override // defpackage.gqb
    public e89 f() {
        return f55.m(new oo6(16, this));
    }

    @Override // defpackage.cv1
    public PointF g() {
        ev1 ev1Var = ((hk6) this.a).i;
        ViewGroup.LayoutParams layoutParams = ev1Var != null ? ev1Var.getLayoutParams() : null;
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return layoutParams2 != null ? new PointF(layoutParams2.x, layoutParams2.y) : o7j.c((Context) this.c);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:3:0x0001, B:5:0x0017, B:10:0x0021, B:12:0x002f, B:15:0x0036, B:17:0x003f, B:21:0x0053, B:23:0x0059, B:11:0x002d), top: B:28:0x0001 }] */
    @Override // defpackage.yp
    public xp getSessionInfo() {
        List listM1;
        try {
            String string = ((s7f) ((et3) ((ny8) this.a).getValue())).d.getString("user.callSession", null);
            if (string == null) {
                listM1 = r66.a;
            } else {
                if (string.length() <= 0) {
                    string = null;
                }
                if (string != null) {
                    listM1 = r5h.m1(string, new String[]{","}, 6);
                } else {
                    listM1 = r66.a;
                }
            }
            if (!listM1.isEmpty()) {
                if (listM1.size() == 3) {
                    return new xp((String) listM1.get(0), (String) listM1.get(2));
                }
                if (listM1.size() == 2) {
                    return new xp((String) listM1.get(0), (String) listM1.get(1));
                }
            }
            return null;
        } catch (Throwable th) {
            gm0.l("OKConfigStoreTag", "Call session info cache error: ", th);
            return null;
        }
    }

    @Override // defpackage.x76
    public /* bridge */ /* synthetic */ x76 h(Class cls, zpb zpbVar) {
        ((HashMap) this.a).put(cls, zpbVar);
        ((HashMap) this.b).remove(cls);
        return this;
    }

    @Override // defpackage.w76
    public void i(EncodeException encodeException) {
        ((r72) this.a).d(encodeException);
    }

    @Override // defpackage.gqb
    public void j(eqb eqbVar) {
        synchronized (((HashMap) this.b)) {
            ((HashMap) this.b).remove(eqbVar);
            if (((HashMap) this.b).isEmpty()) {
                zjl.d().execute(new c99(this, 0));
            }
        }
    }

    @Override // defpackage.dq
    public cq k() throws Throwable {
        ny8 ny8Var = (ny8) this.a;
        String strO = ((s7f) ((et3) ny8Var.getValue())).o();
        if (strO == null || r5h.X0(strO)) {
            yab.A0(k66.a, new i26(this, (lq4) null, 23));
        }
        String strO2 = ((s7f) ((et3) ny8Var.getValue())).o();
        String str = (String) ((g5d) ((gjf) ((ny8) this.b).getValue())).a.u0.a(e5d.S6[70]).i();
        if (str == null) {
            str = "";
        }
        return new cq(strO2, str);
    }

    @Override // defpackage.gsb
    public void l() {
        ug5 ug5Var = (ug5) this.a;
        o64 o64VarC = new k64(1, new vs4(ug5Var, 4, new mp5(1, ug5Var))).c(i3f.b());
        j66 j66Var = new j66(0);
        o64VarC.a(j66Var);
        ((w74) ug5Var.d).a(j66Var);
        t6f t6fVar = t6f.c;
        ((mo) ug5Var.b).getClass();
        ug5Var.c(t6fVar.b("CGPGAGLGDIHBABABA"));
        ((wh5) this.b).e = true;
    }

    @Override // defpackage.w76
    public void m(s63 s63Var) {
        ((dee) this.c).I = s63Var;
    }

    @Override // defpackage.gqb
    public void n(Executor executor, eqb eqbVar) {
        synchronized (((HashMap) this.b)) {
            boolean zIsEmpty = ((HashMap) this.b).isEmpty();
            ((HashMap) this.b).put(eqbVar, executor);
            if (zIsEmpty) {
                zjl.d().execute(new c99(this, 1));
            } else {
                executor.execute(new su6(this, 10, eqbVar));
            }
        }
    }

    @Override // defpackage.cv1
    public void o(float f, float f2) {
        hk6 hk6Var = (hk6) this.a;
        ev1 ev1Var = hk6Var.i;
        WindowManager.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = ev1Var != null ? ev1Var.getLayoutParams() : null;
        WindowManager.LayoutParams layoutParams3 = layoutParams2 instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            layoutParams3.x = (int) f;
            layoutParams3.y = (int) f2;
            layoutParams = layoutParams3;
        }
        ev1 ev1Var2 = (ev1) this.b;
        gm0.n("FakePipController", "update call local pip");
        if (layoutParams == null) {
            gm0.n("FakePipController", "update call local pip was skip due to layout params are null");
            return;
        }
        try {
            WindowManager windowManagerC = hk6Var.c();
            if (windowManagerC != null) {
                windowManagerC.updateViewLayout(ev1Var2, layoutParams);
            }
        } catch (IllegalArgumentException e2) {
            gm0.V("FakePipController", "can't update call local pip", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(String str, nq4 nq4Var) {
        zfk zfkVar;
        if (nq4Var instanceof zfk) {
            zfkVar = (zfk) nq4Var;
            int i = zfkVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                zfkVar.f = i - Integer.MIN_VALUE;
            } else {
                zfkVar = new zfk(this, nq4Var);
            }
        } else {
            zfkVar = new zfk(this, nq4Var);
        }
        Object objK0 = zfkVar.d;
        int i2 = zfkVar.f;
        if (i2 == 0) {
            ch3.d0(objK0);
            ao5 ao5Var = ao5.a;
            lb5 lb5Var = lb5.c;
            fij fijVar = new fij(str, this, null, 8);
            zfkVar.f = 1;
            objK0 = yab.K0(lb5Var, fijVar, zfkVar);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        return ((roe) objK0).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(String str, ClientId clientId, nq4 nq4Var) {
        dgk dgkVar;
        if (nq4Var instanceof dgk) {
            dgkVar = (dgk) nq4Var;
            int i = dgkVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                dgkVar.f = i - Integer.MIN_VALUE;
            } else {
                dgkVar = new dgk(this, nq4Var);
            }
        } else {
            dgkVar = new dgk(this, nq4Var);
        }
        Object objK0 = dgkVar.d;
        int i2 = dgkVar.f;
        if (i2 == 0) {
            ch3.d0(objK0);
            ao5 ao5Var = ao5.a;
            lb5 lb5Var = lb5.c;
            jyf jyfVar = new jyf(str, clientId, this, null, 16);
            dgkVar.f = 1;
            objK0 = yab.K0(lb5Var, jyfVar, dgkVar);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        return ((roe) objK0).a;
    }

    public void r(g2i g2iVar) {
        String str = (String) this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Transformer.abortSafely, cancel transformer", null);
            }
        }
        try {
            g2iVar.c();
        } catch (Throwable th) {
            gm0.V((String) this.b, "Transformer.abortSafely, failed to cancel transformer", th);
        }
    }

    public void s(g2i g2iVar) {
        try {
            g2iVar.j();
            u89 u89Var = g2iVar.g;
            u89Var.g();
            CopyOnWriteArraySet copyOnWriteArraySet = u89Var.d;
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                t89.a((t89) it.next(), u89Var.c);
            }
            copyOnWriteArraySet.clear();
        } catch (Throwable th) {
            gm0.V((String) this.b, "Transformer.cleanupSafely, failed to cleanup transformer", th);
        }
    }

    @Override // defpackage.yp
    public void setSessionInfo(xp xpVar) {
        ny8 ny8Var = (ny8) this.a;
        if (xpVar == null) {
            ((s7f) ((et3) ny8Var.getValue())).A(r66.a);
        } else {
            ((s7f) ((et3) ny8Var.getValue())).A(a.Y0(new String[]{xpVar.a, xpVar.b}));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004c  */
    public ylc u(ArrayList arrayList) {
        String str = (String) this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(arrayList.size(), "createMediaInfos, uris="), null);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        yx9 yx9Var = new yx9((Context) this.c);
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            xx9 xx9VarA = yx9Var.a((Uri) arrayList.get(i));
            arrayList2.add(xx9VarA);
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                long j2 = xx9VarA.b;
                if (j2 == -9223372036854775807L) {
                    j = -9223372036854775807L;
                } else {
                    j += j2;
                }
            }
        }
        return new ylc(arrayList2, Long.valueOf(j));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:102:0x01de  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:107:0x0208  */
    /* JADX WARN: Code duplicated, block: B:114:0x0250  */
    /* JADX WARN: Code duplicated, block: B:125:0x026f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0288 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x010f  */
    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0161  */
    /* JADX WARN: Code duplicated, block: B:78:0x0167  */
    /* JADX WARN: Code duplicated, block: B:82:0x016e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0174  */
    /* JADX WARN: Code duplicated, block: B:87:0x017a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0182  */
    /* JADX WARN: Code duplicated, block: B:90:0x0197  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d2  */
    /* JADX WARN: Multi-variable type inference failed */
    public ArrayList v(d0c d0cVar, List list, long j) {
        ylc ylcVar;
        long jLongValue;
        long j2;
        ArrayList arrayList;
        int size;
        ArrayList arrayList2;
        int i;
        long j3;
        long j4;
        long j5;
        long j6;
        ry9 ry9Var;
        r26 r26Var;
        z88 z88Var;
        prk prkVar;
        tx9 tx9Var;
        int iF;
        Float f;
        int iJ;
        int iG;
        i36 i36Var;
        Bitmap bitmap;
        fy9 fy9Var;
        List list2;
        ghe gheVar;
        Uri uri;
        boolean z;
        jy9 jy9Var;
        gy9 gy9Var;
        r6a r6aVar = this;
        long jMin = j;
        String str = (String) r6aVar.b;
        a4c a4cVar = gm0.f;
        ArrayList arrayList3 = null;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.g(list.size(), jMin, "createOutputItems, totalDurationMcs=", ", inputInfos="), null);
            }
        }
        w5a w5aVar = (w5a) r6aVar.a;
        float f2 = w5aVar.e;
        float f3 = w5aVar.f;
        boolean z2 = yab.A(f2, 0.0f) && yab.A(w5aVar.f, 1.0f);
        long j7 = ((w5a) r6aVar.a).g;
        long j8 = -9223372036854775807L;
        boolean z3 = j7 > 0;
        if (jMin != -9223372036854775807L) {
            if (!z2 || z3) {
                long j9 = z2 ? 0L : (long) (jMin * f2);
                if (!z2) {
                    jMin = (long) (jMin * f3);
                }
                if (z3) {
                    jMin = Math.min(jMin, j7 + j9);
                }
                ylcVar = new ylc(Long.valueOf(j9), Long.valueOf(jMin));
            } else {
                ylcVar = new ylc(-9223372036854775807L, -9223372036854775807L);
            }
            jLongValue = ((Number) ylcVar.a).longValue();
            long jLongValue2 = ((Number) ylcVar.b).longValue();
            if (jMin != -9223372036854775807L) {
                j2 = 0;
            } else {
                j2 = -9223372036854775807L;
            }
            arrayList = new ArrayList();
            size = list.size();
            arrayList2 = arrayList3;
            i = 0;
            while (i < size) {
                if (j2 == j8) {
                    j4 = j8;
                    j3 = j4;
                } else if (i == 0) {
                    j3 = j8;
                    j4 = 0;
                } else {
                    j3 = j8;
                    j4 = j2 + ((xx9) list.get(i - 1)).b;
                }
                xx9 xx9Var = (xx9) list.get(i);
                if (j4 != j3 || jLongValue == j3 || jLongValue2 == j3) {
                    j5 = j4;
                } else {
                    j5 = j4;
                    if (j4 > jLongValue2 || j5 + xx9Var.b < jLongValue) {
                        gm0.Y(r6a.class.getName(), "Early return in createMediaItem cuz of offsetMcs > endMcs || offsetMcs + mediaInfo.durationMcs < startMcs");
                        j6 = jLongValue;
                        ry9Var = arrayList2;
                    }
                    if (ry9Var != 0) {
                        r26Var = new r26(ry9Var);
                        if (((w5a) r6aVar.a).h) {
                            r26Var.b = true;
                        }
                        z88Var = new z88(4);
                        prkVar = (prk) d0cVar.b;
                        if (!(prkVar instanceof qx9)) {
                            if (!(prkVar instanceof tx9)) {
                                ore.o();
                                return arrayList2;
                            }
                            tx9Var = (tx9) prkVar;
                            if (tx9Var.j() > 0) {
                                iJ = tx9Var.j() - (tx9Var.j() % 4);
                                iG = tx9Var.g() - (tx9Var.g() % 4);
                                z88Var.c(cgd.g(iJ, iG));
                                i36Var = (i36) d0cVar.h;
                                if (i36Var != null) {
                                    z88Var.c(i36Var);
                                }
                                bitmap = (Bitmap) d0cVar.c;
                                if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                                    wjg wjgVar = new wjg(ikc.a, ikc.b, Pair.create(Float.valueOf(iJ / bitmap.getWidth()), Float.valueOf(iG / bitmap.getHeight())));
                                    int i2 = ey0.g;
                                    z88Var.c(new gkc(c98.r(new ey0(bitmap, wjgVar))));
                                }
                            }
                            iF = tx9Var.f();
                            if (iF > 0 && ((f = (Float) ((ny8) d0cVar.f).getValue()) == null || iF < f.floatValue())) {
                                z88Var.c(new fc7(iF));
                            }
                        }
                        r26Var.f = new j36(r66.a, z88Var.h());
                        arrayList.add(new s26(r26Var));
                    }
                    i++;
                    r6aVar = this;
                    j2 = j5;
                    j8 = j3;
                    jLongValue = j6;
                }
                by9 by9Var = new by9();
                fy9Var = new fy9();
                list2 = Collections.EMPTY_LIST;
                gheVar = ghe.e;
                hy9 hy9Var = new hy9();
                ly9 ly9Var = ly9.d;
                uri = xx9Var.a;
                if (j4 != j3 || jLongValue == j3 || jLongValue2 == j3) {
                    j6 = jLongValue;
                } else {
                    j6 = jLongValue;
                    long j10 = j5 + xx9Var.b;
                    if (j5 < j6 || j10 > jLongValue2) {
                        by9 by9Var2 = new by9();
                        if (j5 < j6) {
                            by9Var2.b(j6 - j5);
                        }
                        if (j10 > jLongValue2) {
                            by9Var2.a(jLongValue2 - j5);
                        }
                        by9Var = new cy9(by9Var2).a();
                    }
                }
                if (fy9Var.b == null && fy9Var.a == null) {
                    z = false;
                } else {
                    z = true;
                }
                lvb.b0(z);
                if (uri != null) {
                    if (fy9Var.a != null) {
                        gy9Var = new gy9(fy9Var);
                    } else {
                        gy9Var = arrayList2;
                    }
                    jy9Var = new jy9(uri, null, gy9Var, null, list2, null, gheVar, -9223372036854775807L);
                } else {
                    jy9Var = arrayList2;
                }
                ry9Var = new ry9("", new dy9(by9Var), jy9Var, new iy9(hy9Var), b0a.K, ly9Var);
                if (ry9Var != 0) {
                    r26Var = new r26(ry9Var);
                    if (((w5a) r6aVar.a).h) {
                        r26Var.b = true;
                    }
                    z88Var = new z88(4);
                    prkVar = (prk) d0cVar.b;
                    if (!(prkVar instanceof qx9)) {
                        if (!(prkVar instanceof tx9)) {
                            ore.o();
                            return arrayList2;
                        }
                        tx9Var = (tx9) prkVar;
                        if (tx9Var.j() > 0) {
                            iJ = tx9Var.j() - (tx9Var.j() % 4);
                            iG = tx9Var.g() - (tx9Var.g() % 4);
                            z88Var.c(cgd.g(iJ, iG));
                            i36Var = (i36) d0cVar.h;
                            if (i36Var != null) {
                                z88Var.c(i36Var);
                            }
                            bitmap = (Bitmap) d0cVar.c;
                            if (bitmap != null) {
                                wjg wjgVar2 = new wjg(ikc.a, ikc.b, Pair.create(Float.valueOf(iJ / bitmap.getWidth()), Float.valueOf(iG / bitmap.getHeight())));
                                int i3 = ey0.g;
                                z88Var.c(new gkc(c98.r(new ey0(bitmap, wjgVar2))));
                            }
                        }
                        iF = tx9Var.f();
                        if (iF > 0) {
                            z88Var.c(new fc7(iF));
                        }
                    }
                    r26Var.f = new j36(r66.a, z88Var.h());
                    arrayList.add(new s26(r26Var));
                }
                i++;
                r6aVar = this;
                j2 = j5;
                j8 = j3;
                jLongValue = j6;
            }
            return arrayList;
        }
        ylcVar = new ylc(-9223372036854775807L, -9223372036854775807L);
        arrayList3 = null;
        jLongValue = ((Number) ylcVar.a).longValue();
        long jLongValue3 = ((Number) ylcVar.b).longValue();
        if (jMin != -9223372036854775807L) {
            j2 = 0;
        } else {
            j2 = -9223372036854775807L;
        }
        arrayList = new ArrayList();
        size = list.size();
        arrayList2 = arrayList3;
        i = 0;
        while (i < size) {
            if (j2 == j8) {
                j4 = j8;
                j3 = j4;
            } else if (i == 0) {
                j3 = j8;
                j4 = 0;
            } else {
                j3 = j8;
                j4 = j2 + ((xx9) list.get(i - 1)).b;
            }
            xx9 xx9Var2 = (xx9) list.get(i);
            if (j4 != j3) {
                j5 = j4;
                by9 by9Var3 = new by9();
                fy9Var = new fy9();
                list2 = Collections.EMPTY_LIST;
                gheVar = ghe.e;
                hy9 hy9Var2 = new hy9();
                ly9 ly9Var2 = ly9.d;
                uri = xx9Var2.a;
                if (j4 != j3) {
                    j6 = jLongValue;
                } else {
                    j6 = jLongValue;
                }
                if (fy9Var.b == null) {
                    z = true;
                } else {
                    z = true;
                }
                lvb.b0(z);
                if (uri != null) {
                    if (fy9Var.a != null) {
                        gy9Var = new gy9(fy9Var);
                    } else {
                        gy9Var = arrayList2;
                    }
                    jy9Var = new jy9(uri, null, gy9Var, null, list2, null, gheVar, -9223372036854775807L);
                } else {
                    jy9Var = arrayList2;
                }
                ry9Var = new ry9("", new dy9(by9Var3), jy9Var, new iy9(hy9Var2), b0a.K, ly9Var2);
            } else {
                j5 = j4;
                by9 by9Var4 = new by9();
                fy9Var = new fy9();
                list2 = Collections.EMPTY_LIST;
                gheVar = ghe.e;
                hy9 hy9Var3 = new hy9();
                ly9 ly9Var3 = ly9.d;
                uri = xx9Var2.a;
                if (j4 != j3) {
                    j6 = jLongValue;
                } else {
                    j6 = jLongValue;
                }
                if (fy9Var.b == null) {
                    z = true;
                } else {
                    z = true;
                }
                lvb.b0(z);
                if (uri != null) {
                    if (fy9Var.a != null) {
                        gy9Var = new gy9(fy9Var);
                    } else {
                        gy9Var = arrayList2;
                    }
                    jy9Var = new jy9(uri, null, gy9Var, null, list2, null, gheVar, -9223372036854775807L);
                } else {
                    jy9Var = arrayList2;
                }
                ry9Var = new ry9("", new dy9(by9Var4), jy9Var, new iy9(hy9Var3), b0a.K, ly9Var3);
            }
            if (ry9Var != 0) {
                r26Var = new r26(ry9Var);
                if (((w5a) r6aVar.a).h) {
                    r26Var.b = true;
                }
                z88Var = new z88(4);
                prkVar = (prk) d0cVar.b;
                if (!(prkVar instanceof qx9)) {
                    if (!(prkVar instanceof tx9)) {
                        ore.o();
                        return arrayList2;
                    }
                    tx9Var = (tx9) prkVar;
                    if (tx9Var.j() > 0) {
                        iJ = tx9Var.j() - (tx9Var.j() % 4);
                        iG = tx9Var.g() - (tx9Var.g() % 4);
                        z88Var.c(cgd.g(iJ, iG));
                        i36Var = (i36) d0cVar.h;
                        if (i36Var != null) {
                            z88Var.c(i36Var);
                        }
                        bitmap = (Bitmap) d0cVar.c;
                        if (bitmap != null) {
                            wjg wjgVar3 = new wjg(ikc.a, ikc.b, Pair.create(Float.valueOf(iJ / bitmap.getWidth()), Float.valueOf(iG / bitmap.getHeight())));
                            int i4 = ey0.g;
                            z88Var.c(new gkc(c98.r(new ey0(bitmap, wjgVar3))));
                        }
                    }
                    iF = tx9Var.f();
                    if (iF > 0) {
                        z88Var.c(new fc7(iF));
                    }
                }
                r26Var.f = new j36(r66.a, z88Var.h());
                arrayList.add(new s26(r26Var));
            }
            i++;
            r6aVar = this;
            j2 = j5;
            j8 = j3;
            jLongValue = j6;
        }
        return arrayList;
    }

    public g2i w(iu3 iu3Var, d0c d0cVar, q6a q6aVar) {
        d2i d2iVar = new d2i((Context) this.c);
        d2iVar.l = iu3Var;
        d2iVar.i.a(q6aVar);
        w5a w5aVar = (w5a) this.a;
        if (w5aVar.k) {
            d2iVar.m = new da8();
        } else if (w5aVar.l) {
            d2iVar.m = new ou7(26);
        }
        prk prkVar = (prk) d0cVar.b;
        if (prkVar instanceof qx9) {
            if (!((Boolean) ((ny8) d0cVar.d).getValue()).booleanValue()) {
                String strN = uya.n("video/avc");
                lvb.S(uya.m(strN), "Not a video MIME type: %s", strN);
                d2iVar.c = strN;
            }
        } else if (!(prkVar instanceof sx9)) {
            if (!(prkVar instanceof rx9)) {
                ore.o();
                return null;
            }
            String strN2 = uya.n("video/avc");
            lvb.S(uya.m(strN2), "Not a video MIME type: %s", strN2);
            d2iVar.c = strN2;
        }
        boolean z = prkVar instanceof qx9;
        if (!z) {
            if (!(prkVar instanceof tx9)) {
                ore.o();
                return null;
            }
            tx9 tx9Var = (tx9) prkVar;
            if (tx9Var.h() > 0) {
                int iH = tx9Var.h();
                lvb.R(iH > 0 || iH == -1);
                d2iVar.h = iH;
            }
        }
        if (!z) {
            if (!(prkVar instanceof tx9)) {
                ore.o();
                return null;
            }
            String strD = ((tx9) prkVar).d();
            if (strD != null) {
                String strN3 = uya.n(strD);
                lvb.S(uya.i(strN3), "Not an audio MIME type: %s", strN3);
                d2iVar.b = strN3;
            }
        }
        if (!z) {
            if (!(prkVar instanceof tx9)) {
                ore.o();
                return null;
            }
            tx9 tx9Var2 = (tx9) prkVar;
            if (tx9Var2.i() && tx9Var2.g() > tx9Var2.j()) {
                if (s2f.d(tx9Var2.j(), tx9Var2.g(), (String) ((ny8) d0cVar.e).getValue())) {
                    d2iVar.e = c98.r(0);
                }
            }
        }
        long j = w5aVar.p;
        if (j != -9223372036854775807L) {
            d2iVar.g = j;
        }
        return d2iVar.a();
    }

    public vve x(int i, byte[] bArr) throws RtcNotificationSerializeException {
        vn7 vn7Var = (vn7) this.a;
        if (i == 0) {
            throw new RtcNotificationSerializeException(new IllegalArgumentException("Illegal 'format' value: null"));
        }
        if (i != 2) {
            throw new RtcNotificationSerializeException(new UnsupportedOperationException("Only binary format is supported"));
        }
        try {
            fka fkaVarA = xia.a(bArr);
            try {
                int i2 = 0;
                switch (fkaVarA.D0()) {
                    case 1:
                        int iP0 = fkaVarA.P0();
                        HashMap map = new HashMap();
                        while (i2 < iP0) {
                            x52 x52VarM = kql.M(fkaVarA.S0());
                            int iD0 = fkaVarA.D0();
                            if (x52VarM != null) {
                                map.put(Integer.valueOf(iD0), x52VarM);
                            }
                            i2++;
                        }
                        ((ConcurrentHashMap) vn7Var.b).putAll(map);
                        h48 h48Var = new h48(map);
                        fkaVarA.close();
                        return h48Var;
                    case 2:
                        int iT0 = fkaVarA.t0();
                        ArrayList arrayList = new ArrayList();
                        while (i2 < iT0) {
                            yt1 yt1VarZ = vn7Var.z(fkaVarA.D0());
                            if (yt1VarZ != null) {
                                arrayList.add(yt1VarZ);
                            }
                            i2++;
                        }
                        m70 m70Var = new m70();
                        m70Var.a = arrayList;
                        fkaVarA.close();
                        return m70Var;
                    case 3:
                        yt1 yt1VarZ2 = vn7Var.z(fkaVarA.D0());
                        leg legVar = new leg();
                        if (yt1VarZ2 == null) {
                            throw new IllegalArgumentException("Illegal 'speaker' value: null");
                        }
                        legVar.a = yt1VarZ2;
                        fkaVarA.close();
                        return legVar;
                    case 4:
                        int iT1 = fkaVarA.t0();
                        ArrayList arrayList2 = new ArrayList();
                        while (i2 < iT1) {
                            yt1 yt1VarZ3 = vn7Var.z(fkaVarA.D0());
                            if (yt1VarZ3 != null) {
                                arrayList2.add(yt1VarZ3);
                            }
                            i2++;
                        }
                        qgg qggVar = new qgg();
                        qggVar.a = arrayList2;
                        fkaVarA.close();
                        return qggVar;
                    case 5:
                        m3j m3jVarA = ((n3j) this.c).a(fkaVarA);
                        fkaVarA.close();
                        return m3jVarA;
                    case 6:
                        int iP1 = fkaVarA.P0();
                        HashMap map2 = new HashMap();
                        while (i2 < iP1) {
                            map2.put(vn7Var.z(fkaVarA.D0()), Float.valueOf(fkaVarA.D0() / 100.0f));
                            i2++;
                        }
                        kdb kdbVar = new kdb(map2);
                        fkaVarA.close();
                        return kdbVar;
                    case 7:
                    default:
                        fkaVarA.close();
                        return null;
                    case 8:
                        fcj fcjVarP = ((h6f) this.b).p(fkaVarA);
                        fkaVarA.close();
                        return fcjVarP;
                }
            } catch (Throwable th) {
                try {
                    fkaVarA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            throw new RtcNotificationSerializeException(new IllegalArgumentException("Unable to decode notification body: ".concat(zu7.a(bArr)), th3));
        }
    }

    public void y(ghe gheVar, dn7 dn7Var) throws VideoFrameProcessingException, GlUtil$GlException {
        jj0 jj0Var = (jj0) this.a;
        if (((v30) this.b) == null) {
            try {
                v30 v30Var = new v30((Context) this.c, "shaders/vertex_shader_transformation_es2.glsl", "shaders/fragment_shader_alpha_scale_es2.glsl");
                this.b = v30Var;
                v30Var.y(tab.v());
                ((v30) this.b).A("uTexTransformationMatrix", tab.j());
            } catch (IOException e2) {
                throw new VideoFrameProcessingException(e2);
            }
        }
        int i = dn7Var.b;
        int i2 = dn7Var.d;
        int i3 = dn7Var.c;
        tab.r(i, i3, i2);
        jj0Var.j = new lag(i3, i2);
        tab.g();
        v30 v30Var2 = (v30) this.b;
        v30Var2.getClass();
        GLES20.glUseProgram(v30Var2.b);
        tab.e();
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        tab.e();
        for (int i4 = gheVar.d - 1; i4 >= 0; i4--) {
            bf5 bf5Var = (bf5) gheVar.get(i4);
            v30 v30Var3 = (v30) this.b;
            v30Var3.getClass();
            dn7 dn7Var2 = bf5Var.b.a;
            v30Var3.C(dn7Var2.a, 0, "uTexSampler");
            v30Var3.A("uTransformationMatrix", jj0Var.f(new lag(dn7Var2.c, dn7Var2.d), bf5Var.c));
            v30Var3.z("uAlphaScale", 1.0f);
            v30Var3.g();
            GLES20.glDrawArrays(5, 0, 4);
            tab.e();
        }
        GLES20.glDisable(3042);
        tab.e();
    }

    public m6a z() {
        m6a k6aVar;
        je9 je9Var = je9.d;
        n6a n6aVar = new n6a((w5a) this.a);
        String str = (String) this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "execute, " + n6aVar, null);
        }
        try {
            ylc ylcVarU = u(((w5a) this.a).b);
            List list = (List) ylcVarU.a;
            long jLongValue = ((Number) ylcVarU.b).longValue();
            ArrayList arrayList = n6aVar.c;
            arrayList.clear();
            arrayList.addAll(list);
            ArrayList arrayList2 = n6aVar.c;
            w5a w5aVar = (w5a) this.a;
            d0c d0cVar = new d0c(arrayList2, w5aVar.d, w5aVar.i, w5aVar.j);
            ArrayList arrayListV = v(d0cVar, list, jLongValue);
            kzi kziVar = new kzi(a.p1(new Integer[]{1, 2}));
            ((z88) kziVar.a).f(arrayListV);
            k84 k84VarT = t(d0cVar, n6aVar, new t26(kziVar));
            ifh ifhVar = ii5.c;
            try {
                if (!wrl.e(new nb(this, d0cVar, n6aVar, k84VarT, 3))) {
                    A(d0cVar, n6aVar, k84VarT);
                }
            } catch (MediaTransformException e2) {
                e = e2;
                this = this;
                gm0.V((String) this.b, "execute, failed to transform media", e);
                n6aVar.b(e);
            } catch (Throwable th) {
                th = th;
                this = this;
                gm0.V((String) this.b, "execute, failed to transform media", th);
                n6aVar.b(new MediaTransformException("Failed to transform media", th));
            }
        } catch (MediaTransformException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        nh6 nh6Var = (nh6) n6aVar.f.get();
        MediaTransformException mediaTransformException = (MediaTransformException) n6aVar.g.get();
        if (nh6Var == null || mediaTransformException != null) {
            long j = n6aVar.b;
            w5a w5aVar2 = n6aVar.a;
            if (mediaTransformException == null) {
                mediaTransformException = new MediaTransformException("Unknown media transform error occured", null, 2, null);
            }
            k6aVar = new k6a(j, jCurrentTimeMillis, w5aVar2, n6aVar, mediaTransformException, (y5a) n6aVar.h.get());
        } else {
            k6aVar = new l6a(n6aVar.b, jCurrentTimeMillis, nh6Var.a, n6aVar.a, n6aVar);
        }
        if (k6aVar instanceof l6a) {
            String str2 = (String) this.b;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "execute, completed with " + k6aVar, null);
            }
        } else {
            if (!(k6aVar instanceof k6a)) {
                ore.o();
                return null;
            }
            String str3 = (String) this.b;
            MediaTransformException mediaTransformException2 = ((k6a) k6aVar).f;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar3.b(je9Var2)) {
                    a4cVar3.c(je9Var2, str3, "execute, failed with " + k6aVar, mediaTransformException2);
                }
            }
            String str4 = (String) this.b;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, str4, "cleanup", null);
            }
            File file = new File(((w5a) this.a).c);
            if (file.isFile()) {
                file.delete();
            }
        }
        return k6aVar;
    }

    public /* synthetic */ r6a(boolean z, Object obj, Object obj2, Object obj3) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ r6a(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public r6a(String str) {
        a87 a87Var = new a87();
        a87Var.l = uya.n("video/mp2t");
        a87Var.m = uya.n(str);
        this.a = new b87(a87Var);
    }

    public r6a(fx0 fx0Var) {
        this.c = fx0Var;
    }

    public r6a(URL url, vg0 vg0Var, String str) {
        this.a = url;
        this.c = vg0Var;
        this.b = str;
    }

    public r6a(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.c = arrayDeque;
        this.a = bufferedReader;
    }
}
