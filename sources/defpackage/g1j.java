package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Trace;
import android.util.Base64;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraUnavailableException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$NoAvailableCameraException;
import one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$PreviewRenderException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class g1j implements zce {
    public static final /* synthetic */ zv8[] P;
    public static final int Q;
    public volatile boolean A;
    public volatile float B;
    public volatile float C;
    public final mjg D;
    public final r8e E;
    public volatile fee F;
    public final mjg G;
    public final r8e H;
    public float I;
    public ValueAnimator J;
    public wf2 K;
    public final AtomicBoolean L;
    public final p3c M;
    public final j1j N;
    public final euc O;
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public jce e;
    public iid f;
    public final ifh g;
    public final String h = g1j.class.getName();
    public final dq4 i;
    public final wme j;
    public final ny8 k;
    public final ny8 l;
    public final ki1 m;
    public igd n;
    public xxi o;
    public dee p;
    public bui q;
    public o09 r;
    public final mjg s;
    public final AtomicInteger t;
    public volatile long u;
    public final mjg v;
    public final mjg w;
    public volatile File x;
    public final mjg y;
    public final r8e z;

    static {
        z8b z8bVar = new z8b(g1j.class, "savePlaceholderJob", "getSavePlaceholderJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        P = new zv8[]{z8bVar};
        Q = gm0.K(38.0f * yl5.d().getDisplayMetrics().density);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x01bc  */
    public g1j(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, a2c a2cVar, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        pi0 pi0Var;
        Object poeVar;
        b99 b99VarH;
        t1k t1kVar;
        this.a = ny8Var;
        this.b = ny8Var3;
        this.c = ny8Var2;
        this.d = ny8Var4;
        this.g = new ifh(new vbi(10, a2cVar));
        lk9 lk9VarC = ((n0c) u()).c();
        nah nahVarA = wk8.a();
        lk9VarC.getClass();
        dq4 dq4VarA = cqk.a(lvb.x0(lk9VarC, nahVarA));
        this.i = dq4VarA;
        this.j = new wme(new oe3(ny8Var4, ny8Var, 5));
        this.k = ny8Var6;
        this.l = ny8Var7;
        this.m = new ki1(ny8Var4);
        Object obj = null;
        this.s = p90.a(new w0j(new Size(0, 0), null, null));
        this.t = new AtomicInteger(0);
        this.v = p90.a(Float.valueOf(0.0f));
        this.w = p90.a(0L);
        yab.i0(dq4VarA, ((n0c) u()).b(), 0, new hpf(this, false ? 1 : 0, 20), 2);
        mjg mjgVarA = p90.a(null);
        this.y = mjgVarA;
        this.z = new r8e(mjgVarA);
        float fC = 1.0f;
        this.C = 1.0f;
        mjg mjgVarA2 = p90.a(new wxi(false, false));
        this.D = mjgVarA2;
        this.E = new r8e(mjgVarA2);
        mjg mjgVarA3 = p90.a(Boolean.FALSE);
        this.G = mjgVarA3;
        this.H = new r8e(mjgVarA3);
        nf2 nf2VarT = t();
        if (nf2VarT != null && (b99VarH = ((ja) nf2VarT).b.H()) != null && (t1kVar = (t1k) b99VarH.d()) != null) {
            fC = t1kVar.c();
        }
        this.I = fC;
        this.L = new AtomicBoolean(false);
        this.M = qyj.S();
        String str = (String) ((e5d) ny8Var5.getValue()).Q1.a(e5d.S6[145]).i();
        j1j j1jVar = j1j.e;
        if (str != null && str.length() != 0) {
            try {
                poeVar = new JSONObject(str);
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            JSONObject jSONObject = (JSONObject) (poeVar instanceof poe ? null : poeVar);
            if (jSONObject != null) {
                j1jVar = new j1j(jSONObject.optLong("duration", 60L), jSONObject.optString("quality", "480"), jSONObject.optInt("min_frame_rate", 30), jSONObject.optInt("max_frame_rate", 30));
            }
        }
        this.N = j1jVar;
        String str2 = j1jVar.b;
        for (Object obj2 : y0e.l) {
            if (r5h.L0(((y0e) obj2).a, str2, false)) {
                obj = obj2;
                break;
            }
        }
        y0e y0eVar = (y0e) obj;
        y0eVar = y0eVar == null ? y0e.P_480 : y0eVar;
        Range rangeCreate = Range.create(Integer.valueOf(j1jVar.c), Integer.valueOf(j1jVar.d));
        switch (str2) {
            case "480":
                pi0Var = pi0.e;
                break;
            case "720":
                pi0Var = pi0.f;
                break;
            case "1080":
                pi0Var = pi0.g;
                break;
            case "2160":
                pi0Var = pi0.h;
                break;
            default:
                pi0Var = pi0.e;
                break;
        }
        this.O = new euc(rangeCreate, y0eVar, pi0Var, 19);
    }

    public static final Uri n(g1j g1jVar, Bitmap bitmap) {
        g1jVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            bitmap.recycle();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return Uri.parse("data:" + sya.IMAGE_JPEG + ";base64," + Base64.encodeToString(byteArray, 2));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(byteArrayOutputStream, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Serializable o(xzi xziVar, g1j g1jVar, File file, nq4 nq4Var) {
        d1j d1jVar;
        a4c a4cVar;
        boolean zB;
        je9 je9Var = je9.f;
        if (nq4Var instanceof d1j) {
            d1jVar = (d1j) nq4Var;
            int i = d1jVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                d1jVar.h = i - Integer.MIN_VALUE;
            } else {
                d1jVar = new d1j(nq4Var);
            }
        } else {
            d1jVar = new d1j(nq4Var);
        }
        Object objB = d1jVar.g;
        hu4 hu4Var = hu4.a;
        int i2 = d1jVar.h;
        try {
            if (i2 == 0) {
                ch3.d0(objB);
                d1jVar.d = xziVar;
                d1jVar.e = g1jVar;
                d1jVar.f = file;
                d1jVar.h = 1;
                objB = xziVar.b(d1jVar);
                if (objB == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                file = d1jVar.f;
                g1jVar = d1jVar.e;
                xziVar = d1jVar.d;
                try {
                    ch3.d0(objB);
                } catch (Throwable th) {
                    xziVar.g();
                    throw th;
                }
            }
            List list = (List) objB;
            ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(u1m.b((Uri) it.next()).getAbsolutePath());
            }
            String str = g1jVar.h;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.d;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str, "VideoMessage Recording. Fragment finalization complete for " + file.getName() + ", " + arrayList.size() + " path(s)", null);
                }
            }
            xziVar.g();
            return arrayList;
        } catch (CancellationException e) {
            String str2 = g1jVar.h;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                if (zB) {
                    a4cVar.c(je9Var, str2, "VideoMessage Recording. Fragment finalization cancelled for " + file.getName(), null);
                }
            }
            throw e;
        } finally {
            String str3 = g1jVar.h;
            a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str3, "VideoMessage Recording. Fragment finalization failed for " + file.getName(), th);
            }
        }
    }

    public final void A(float f, float f2) {
        if (f != this.B) {
            yab.i0(this.i, ((n0c) u()).a(), 0, new e1j(this, f, null), 2);
        }
        this.B = f;
        this.C = f2;
    }

    public final void B(File file) {
        fee feeVarP;
        xzi xziVarW = w();
        dee deeVar = this.p;
        if (deeVar != null) {
            o02 o02Var = new o02((Context) this.a.getValue(), deeVar, new rj5(file).K());
            o02Var.b = true;
            o02.t(o02Var);
            feeVarP = o02Var.p((ExecutorService) this.g.getValue(), new ro7(this, 5, xziVarW));
        } else {
            feeVarP = null;
        }
        this.F = feeVarP;
    }

    @Override // defpackage.zce
    public final boolean a() {
        return this.F != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.zce
    public final Object b(long j, lq4 lq4Var) {
        z0j z0jVar;
        if (lq4Var instanceof z0j) {
            z0jVar = (z0j) lq4Var;
            int i = z0jVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                z0jVar.f = i - Integer.MIN_VALUE;
            } else {
                z0jVar = new z0j(this, (nq4) lq4Var);
            }
        } else {
            z0jVar = new z0j(this, (nq4) lq4Var);
        }
        Object objL0 = z0jVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = z0jVar.f;
        if (i2 == 0) {
            ch3.d0(objL0);
            this.u = 0L;
            mjg mjgVar = this.w;
            Long l = new Long(0L);
            mjgVar.getClass();
            mjgVar.j(null, l);
            mjg mjgVar2 = this.v;
            Float f = new Float(0.0f);
            mjgVar2.getClass();
            mjgVar2.j(null, f);
            aug augVar = new aug(this, j, null, 5);
            z0jVar.f = 1;
            objL0 = lvb.L0(8000L, augVar, z0jVar);
            if (objL0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objL0);
        }
        if (((sbi) objL0) != null) {
            return sbi.a;
        }
        throw new VideoMessageRecordDelegate$PreviewRenderException();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // defpackage.zce
    public final Object c(yce yceVar, lq4 lq4Var) {
        c1j c1jVar;
        File file;
        yce yceVar2;
        Object objK0;
        if (lq4Var instanceof c1j) {
            c1jVar = (c1j) lq4Var;
            int i = c1jVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1jVar.h = i - Integer.MIN_VALUE;
            } else {
                c1jVar = new c1j(this, (nq4) lq4Var);
            }
        } else {
            c1jVar = new c1j(this, (nq4) lq4Var);
        }
        c1j c1jVar2 = c1jVar;
        Object obj = c1jVar2.f;
        hu4 hu4Var = hu4.a;
        int i2 = c1jVar2.h;
        lq4 lq4Var2 = null;
        if (i2 == 0) {
            ch3.d0(obj);
            xzi xziVarW = w();
            this.j.a();
            file = this.x;
            if (file != null) {
                xt4 xt4VarB = ((n0c) u()).b();
                p7g p7gVar = new p7g(xziVarW, this, file, lq4Var2, 22);
                yceVar2 = yceVar;
                c1jVar2.d = yceVar2;
                c1jVar2.e = file;
                c1jVar2.h = 1;
                objK0 = yab.K0(xt4VarB, p7gVar, c1jVar2);
                if (objK0 == hu4Var) {
                    return hu4Var;
                }
            }
            return null;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        File file2 = c1jVar2.e;
        yce yceVar3 = c1jVar2.d;
        ch3.d0(obj);
        objK0 = obj;
        yceVar2 = yceVar3;
        file = file2;
        List list = (List) objK0;
        String str = ((w0j) this.s.getValue()).b;
        if (str != null) {
            Size size = ((w0j) this.s.getValue()).a;
            xce xceVar = (xce) yceVar2;
            long j = (long) ((this.C - this.B) * xceVar.a);
            String str2 = this.h;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, c0a.o("VideoMessage Recording. VideoMessageMedia(path=", file.getPath(), ") is prepared successfully"), null);
                }
            }
            String path = file.getPath();
            byte[] bArr = xceVar.b;
            int width = size.getWidth();
            int height = size.getHeight();
            a70 a70Var = new a70(1);
            a70Var.a = (y0e) this.O.c;
            a70Var.b = this.B;
            a70Var.c = this.C;
            a70Var.d = list;
            return new lzi(path, width, height, j, bArr, str, new fvi(a70Var));
        }
        return null;
    }

    @Override // defpackage.zce
    public final void d() {
        String str = this.h;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "VideoMessage Recording. Stop", null);
            }
        }
        this.A = false;
        fee feeVar = this.F;
        if (feeVar != null) {
            feeVar.close();
        }
        wf2 wf2Var = this.K;
        if (wf2Var != null) {
            wf2Var.b();
        }
    }

    @Override // defpackage.zce
    public final float e() {
        return this.B;
    }

    @Override // defpackage.zce
    public final void f() {
        String str = this.h;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "VideoMessage Recording. Pause", null);
            }
        }
        this.A = true;
        fee feeVar = this.F;
        if (feeVar != null) {
            feeVar.close();
        }
        wf2 wf2Var = this.K;
        if (wf2Var != null) {
            wf2Var.b();
        }
        mjg mjgVar = this.y;
        txi txiVar = txi.a;
        mjgVar.getClass();
        mjgVar.j(null, txiVar);
    }

    @Override // defpackage.zce
    public final boolean g() {
        return ((wsc) this.c.getValue()).c(wsc.r);
    }

    @Override // defpackage.zce
    public final String h() {
        File file = this.x;
        if (file != null) {
            return file.getPath();
        }
        return null;
    }

    @Override // defpackage.zce
    public final void i(jce jceVar) {
        this.e = jceVar;
    }

    @Override // defpackage.zce
    public final int j() {
        return this.t.getAndSet(0);
    }

    @Override // defpackage.zce
    public final mjg k() {
        return this.w;
    }

    @Override // defpackage.zce
    public final void l() {
        String str = this.h;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "VideoMessage Recording. Resume", null);
            }
        }
        this.A = false;
        B(s(String.valueOf(System.currentTimeMillis())));
        wf2 wf2Var = this.K;
        if (wf2Var != null) {
            wf2Var.e();
        }
    }

    @Override // defpackage.zce
    public final float m() {
        return this.C;
    }

    public final void p(g19 g19Var, fh2 fh2Var) {
        iid iidVar = this.f;
        if (iidVar != null) {
            iidVar.a.y();
        }
        o09 o09VarA = null;
        try {
            igd igdVar = this.n;
            if (igdVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            bui buiVar = this.q;
            if (buiVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            xxi xxiVar = this.o;
            if (xxiVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Rational rational = new Rational(1, 1);
            int iM = igdVar.m();
            b9j b9jVar = new b9j();
            b9jVar.a = 1;
            b9jVar.b = rational;
            b9jVar.c = iM;
            b9jVar.d = 0;
            iid iidVar2 = this.f;
            if (iidVar2 != null) {
                imi imiVar = new imi();
                imiVar.a(igdVar);
                imiVar.a(buiVar);
                imiVar.a = b9jVar;
                imiVar.c.add(xxiVar);
                o09VarA = iidVar2.a(g19Var, fh2Var, imiVar.b());
            }
            this.r = o09VarA;
        } catch (Throwable th) {
            x0j x0jVar = new x0j("VideoMessage Recording. Fail to bindCameraToLifecycle", th);
            gm0.V(this.h, x0jVar.getMessage(), x0jVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x01a1 A[Catch: Exception -> 0x003e, ExecutionException -> 0x0041, CancellationException -> 0x026d, TryCatch #2 {CancellationException -> 0x026d, ExecutionException -> 0x0041, Exception -> 0x003e, blocks: (B:13:0x0039, B:64:0x017e, B:66:0x01a1, B:68:0x01b3, B:70:0x01bd, B:72:0x01c3, B:74:0x01cd, B:77:0x01d6, B:80:0x01dd, B:81:0x01ec, B:82:0x01ee, B:84:0x0200, B:86:0x0204, B:87:0x0208, B:88:0x020d, B:22:0x0050, B:54:0x00d5, B:60:0x00f7, B:57:0x00e0, B:59:0x00e6, B:25:0x0058, B:28:0x0062, B:34:0x007c, B:36:0x0080, B:38:0x0086, B:41:0x0094, B:40:0x0090, B:42:0x0099, B:43:0x009e, B:31:0x0067, B:33:0x006d, B:44:0x009f, B:50:0x00b9, B:47:0x00a4, B:49:0x00aa), top: B:108:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01b3 A[Catch: Exception -> 0x003e, ExecutionException -> 0x0041, CancellationException -> 0x026d, TryCatch #2 {CancellationException -> 0x026d, ExecutionException -> 0x0041, Exception -> 0x003e, blocks: (B:13:0x0039, B:64:0x017e, B:66:0x01a1, B:68:0x01b3, B:70:0x01bd, B:72:0x01c3, B:74:0x01cd, B:77:0x01d6, B:80:0x01dd, B:81:0x01ec, B:82:0x01ee, B:84:0x0200, B:86:0x0204, B:87:0x0208, B:88:0x020d, B:22:0x0050, B:54:0x00d5, B:60:0x00f7, B:57:0x00e0, B:59:0x00e6, B:25:0x0058, B:28:0x0062, B:34:0x007c, B:36:0x0080, B:38:0x0086, B:41:0x0094, B:40:0x0090, B:42:0x0099, B:43:0x009e, B:31:0x0067, B:33:0x006d, B:44:0x009f, B:50:0x00b9, B:47:0x00a4, B:49:0x00aa), top: B:108:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0204 A[Catch: Exception -> 0x003e, ExecutionException -> 0x0041, CancellationException -> 0x026d, TryCatch #2 {CancellationException -> 0x026d, ExecutionException -> 0x0041, Exception -> 0x003e, blocks: (B:13:0x0039, B:64:0x017e, B:66:0x01a1, B:68:0x01b3, B:70:0x01bd, B:72:0x01c3, B:74:0x01cd, B:77:0x01d6, B:80:0x01dd, B:81:0x01ec, B:82:0x01ee, B:84:0x0200, B:86:0x0204, B:87:0x0208, B:88:0x020d, B:22:0x0050, B:54:0x00d5, B:60:0x00f7, B:57:0x00e0, B:59:0x00e6, B:25:0x0058, B:28:0x0062, B:34:0x007c, B:36:0x0080, B:38:0x0086, B:41:0x0094, B:40:0x0090, B:42:0x0099, B:43:0x009e, B:31:0x0067, B:33:0x006d, B:44:0x009f, B:50:0x00b9, B:47:0x00a4, B:49:0x00aa), top: B:108:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0208 A[Catch: Exception -> 0x003e, ExecutionException -> 0x0041, CancellationException -> 0x026d, TryCatch #2 {CancellationException -> 0x026d, ExecutionException -> 0x0041, Exception -> 0x003e, blocks: (B:13:0x0039, B:64:0x017e, B:66:0x01a1, B:68:0x01b3, B:70:0x01bd, B:72:0x01c3, B:74:0x01cd, B:77:0x01d6, B:80:0x01dd, B:81:0x01ec, B:82:0x01ee, B:84:0x0200, B:86:0x0204, B:87:0x0208, B:88:0x020d, B:22:0x0050, B:54:0x00d5, B:60:0x00f7, B:57:0x00e0, B:59:0x00e6, B:25:0x0058, B:28:0x0062, B:34:0x007c, B:36:0x0080, B:38:0x0086, B:41:0x0094, B:40:0x0090, B:42:0x0099, B:43:0x009e, B:31:0x0067, B:33:0x006d, B:44:0x009f, B:50:0x00b9, B:47:0x00a4, B:49:0x00aa), top: B:108:0x002b }] */
    public final Object q(Size size, hgd hgdVar, nq4 nq4Var) {
        y0j y0jVar;
        Size size2;
        g1j g1jVar;
        fh2 fh2VarV;
        hgd hgdVar2;
        Size size3;
        mjg mjgVar;
        Object value;
        wf2 wf2Var;
        wf2 wf2Var2;
        nf2 nf2VarT;
        boolean z;
        boolean zM;
        nf2 nf2VarT2;
        b99 b99VarU;
        Integer num;
        je9 je9Var = je9.d;
        if (nq4Var instanceof y0j) {
            y0jVar = (y0j) nq4Var;
            int i = y0jVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                y0jVar.i = i - Integer.MIN_VALUE;
            } else {
                y0jVar = new y0j(this, nq4Var);
            }
        } else {
            y0jVar = new y0j(this, nq4Var);
        }
        Object objZ = y0jVar.g;
        hu4 hu4Var = hu4.a;
        int i2 = y0jVar.i;
        try {
            if (i2 == 0) {
                ch3.d0(objZ);
                boolean z2 = this.L.get();
                String str = this.h;
                if (!z2) {
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "VideoMessage Recording. Start binding camera preview with size=" + size, null);
                    }
                    r();
                    this.K = new wf2();
                    y0jVar.d = size;
                    y0jVar.e = hgdVar;
                    y0jVar.f = this;
                    y0jVar.i = 1;
                    objZ = z(y0jVar);
                    if (objZ != hu4Var) {
                        size2 = size;
                        g1jVar = this;
                    }
                    return hu4Var;
                }
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str, "VideoMessage Recording. Resume camera preview with size=" + size, null);
                }
                wf2 wf2Var3 = this.K;
                if (wf2Var3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                nf2 nf2VarT3 = t();
                if (nf2VarT3 == null || (fh2VarV = ((r97) nf2VarT3).a.B()) == null) {
                    fh2VarV = v();
                }
                p(wf2Var3, fh2VarV);
                mjgVar = this.s;
                do {
                    value = mjgVar.getValue();
                } while (!mjgVar.h(value, w0j.a((w0j) value, size, null, null, 6)));
                wf2Var = this.K;
                if (wf2Var != null) {
                    wf2Var.e();
                }
                return sbi.a;
            }
            if (i2 == 1) {
                g1jVar = y0jVar.f;
                hgdVar = y0jVar.e;
                size2 = y0jVar.d;
                ch3.d0(objZ);
            } else {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hgdVar2 = y0jVar.e;
                size3 = y0jVar.d;
                ch3.d0(objZ);
            }
            r48 r48Var = new r48(2);
            r48Var.c();
            this.O.getClass();
            r48Var.b.m(n68.u0, fx5.d);
            igd igdVarB = r48Var.b();
            igdVarB.K(hgdVar2);
            this.n = igdVarB;
            wf2Var2 = this.K;
            if (wf2Var2 != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            p(wf2Var2, v());
            mjg mjgVar2 = this.D;
            nf2VarT = t();
            z = false;
            if (nf2VarT != null) {
                zM = ((ja) nf2VarT).b.m();
            } else {
                zM = false;
            }
            nf2VarT2 = t();
            if (nf2VarT2 != null && (b99VarU = ((ja) nf2VarT2).b.u()) != null && (num = (Integer) b99VarU.d()) != null && num.intValue() == 1) {
                z = true;
            }
            wxi wxiVar = new wxi(zM, z);
            mjgVar2.getClass();
            mjgVar2.j(null, wxiVar);
            this.L.set(true);
            size = size3;
            mjgVar = this.s;
            do {
                value = mjgVar.getValue();
            } while (!mjgVar.h(value, w0j.a((w0j) value, size, null, null, 6)));
            wf2Var = this.K;
            if (wf2Var != null) {
                wf2Var.e();
            }
            return sbi.a;
            g1jVar.f = (iid) objZ;
            String str2 = this.h;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str2, "VideoMessage Recording. BindPreview, use " + this.O, null);
            }
            bn9 bn9Var = new bn9();
            bn9Var.e = (ExecutorService) this.g.getValue();
            pi0 pi0Var = (pi0) this.O.d;
            bn9Var.d(m1e.a(pi0Var, new mh0(pi0Var, 1)));
            bn9Var.e(((y0e) this.O.c).e);
            bn9Var.b();
            bn9Var.c();
            bn9Var.f = new v1j((y0e) this.O.c);
            dee deeVarA = bn9Var.a();
            this.p = deeVarA;
            r48 r48Var2 = new r48(deeVarA);
            r48Var2.b.m(v68.y0, 2);
            r48Var2.b.m(cmi.b1, (Range) this.O.b);
            this.q = new bui(new cui(dhc.a(r48Var2.b)));
            euc eucVar = this.O;
            y0jVar.d = size2;
            y0jVar.e = hgdVar;
            y0jVar.f = null;
            y0jVar.i = 2;
            if (y(eucVar, size2, y0jVar) != hu4Var) {
                hgdVar2 = hgdVar;
                size3 = size2;
                r48 r48Var3 = new r48(2);
                r48Var3.c();
                this.O.getClass();
                r48Var3.b.m(n68.u0, fx5.d);
                igd igdVarB2 = r48Var3.b();
                igdVarB2.K(hgdVar2);
                this.n = igdVarB2;
                wf2Var2 = this.K;
                if (wf2Var2 != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                p(wf2Var2, v());
                mjg mjgVar3 = this.D;
                nf2VarT = t();
                z = false;
                if (nf2VarT != null) {
                    zM = ((ja) nf2VarT).b.m();
                } else {
                    zM = false;
                }
                nf2VarT2 = t();
                if (nf2VarT2 != null) {
                    z = true;
                }
                wxi wxiVar2 = new wxi(zM, z);
                mjgVar3.getClass();
                mjgVar3.j(null, wxiVar2);
                this.L.set(true);
                size = size3;
                mjgVar = this.s;
                do {
                    value = mjgVar.getValue();
                } while (!mjgVar.h(value, w0j.a((w0j) value, size, null, null, 6)));
                wf2Var = this.K;
                if (wf2Var != null) {
                    wf2Var.e();
                }
                return sbi.a;
            }
            return hu4Var;
        } catch (CancellationException e) {
            throw e;
        } catch (ExecutionException e2) {
            Throwable x0jVar = new x0j(qv1.k("VideoMessage Recording. Initialize exception happened during bindPreview because of ", e2.getLocalizedMessage()), e2);
            gm0.V(this.h, x0jVar.getMessage(), x0jVar);
            Throwable cause = x0jVar.getCause();
            boolean z3 = (cause != null ? cause.getCause() : null) instanceof CameraUnavailableException;
            jce jceVar = this.e;
            if (z3) {
                if (jceVar != null) {
                    jceVar.Q(new VideoMessageRecordDelegate$NoAvailableCameraException());
                }
            } else if (jceVar != null) {
                if (cause != null) {
                    x0jVar = cause;
                }
                jceVar.Q(x0jVar);
            }
        } catch (Exception e3) {
            x0j x0jVar2 = new x0j(qv1.k("VideoMessage Recording. Unknown exception ", e3.getLocalizedMessage()), e3);
            gm0.V(this.h, x0jVar2.getMessage(), x0jVar2);
            jce jceVar2 = this.e;
            if (jceVar2 != null) {
                jceVar2.Q(x0jVar2);
            }
        }
    }

    public final void r() {
        if (!((Context) this.a.getValue()).getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            throw new VideoMessageRecordDelegate$NoAvailableCameraException();
        }
    }

    public final File s(String str) {
        ju6 ju6Var = (ju6) ((rs6) this.b.getValue());
        ju6Var.getClass();
        File fileT = ju6Var.t(str + ".mp4");
        xzi xziVarW = w();
        yab.i0(xziVarW.c, null, 0, new b2f(xziVarW, Uri.fromFile(fileT), (lq4) null, 9), 3);
        return fileT;
    }

    public final nf2 t() {
        o09 o09Var = this.r;
        if (o09Var != null) {
            return o09Var.a();
        }
        return null;
    }

    public final xhh u() {
        return (xhh) this.d.getValue();
    }

    public final fh2 v() {
        zxi zxiVar = (zxi) this.k.getValue();
        iid iidVar = this.f;
        if (iidVar == null) {
            ore.p("Required value was null.");
            return null;
        }
        fh2 fh2Var = fh2.b;
        boolean zX = x(iidVar, fh2Var);
        fh2 fh2Var2 = fh2.c;
        boolean zX2 = x(iidVar, fh2Var2);
        if (zX && zxiVar.a) {
            return fh2Var;
        }
        if (zX2) {
            zxiVar.a = false;
            return fh2Var2;
        }
        if (!zX) {
            throw new VideoMessageRecordDelegate$NoAvailableCameraException();
        }
        zxiVar.a = true;
        return fh2Var;
    }

    public final xzi w() {
        return (xzi) this.j.getValue();
    }

    public final boolean x(iid iidVar, fh2 fh2Var) {
        boolean z;
        try {
            tw5 tw5Var = iidVar.a;
            cqk.f("CX:hasCamera");
            try {
                fh2Var.c(((ri2) tw5Var.d).a.c());
                z = true;
            } catch (IllegalArgumentException unused) {
                z = false;
            } finally {
                Trace.endSection();
            }
            return z;
        } catch (CameraInfoUnavailableException e) {
            x0j x0jVar = new x0j("VideoMessage Recording. The phone doesn't have " + fh2Var, e);
            gm0.V(this.h, x0jVar.getMessage(), x0jVar);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(euc eucVar, Size size, nq4 nq4Var) {
        a1j a1jVar;
        t0j t0jVar;
        t0j t0jVar2;
        if (nq4Var instanceof a1j) {
            a1jVar = (a1j) nq4Var;
            int i = a1jVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                a1jVar.h = i - Integer.MIN_VALUE;
            } else {
                a1jVar = new a1j(this, nq4Var);
            }
        } else {
            a1jVar = new a1j(this, nq4Var);
        }
        Object obj = a1jVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = a1jVar.h;
        lq4 lq4Var = null;
        int i3 = 1;
        if (i2 == 0) {
            ch3.d0(obj);
            eucVar.getClass();
            t0j t0jVar3 = new t0j(size);
            xt4 xt4VarB = ((n0c) u()).b();
            hpf hpfVar = new hpf(size, lq4Var, 21);
            a1jVar.d = t0jVar3;
            a1jVar.e = t0jVar3;
            a1jVar.h = 1;
            Object objK0 = yab.K0(xt4VarB, hpfVar, a1jVar);
            if (objK0 == hu4Var) {
                return hu4Var;
            }
            t0jVar = t0jVar3;
            obj = objK0;
            t0jVar2 = t0jVar;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t0jVar2 = a1jVar.e;
            t0jVar = a1jVar.d;
            ch3.d0(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            ore.p("Required value was null.");
            return null;
        }
        String str = t0jVar2.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, c0a.o("setStencil, ", axl.b(bitmap), ", recycle_after_consume=true"), null);
            }
        }
        t0j.g(t0jVar2, new j0i(t0jVar2, 11, bitmap), new o0j(i3), 2);
        t0jVar.f.add(new u0j(this));
        this.o = new xxi(t0jVar.e, t0jVar, new qk5(7));
        return sbi.a;
    }

    public final Object z(y0j y0jVar) {
        ek2 ek2Var = new ek2(1, p90.B(y0jVar));
        ek2Var.u();
        iid iidVar = iid.b;
        ny8 ny8Var = this.a;
        bp2 bp2VarB = rkl.b((Context) ny8Var.getValue());
        bp2VarB.b(new b1j(ek2Var, bp2VarB, this, 0), np4.o((Context) ny8Var.getValue()));
        return ek2Var.s();
    }
}
