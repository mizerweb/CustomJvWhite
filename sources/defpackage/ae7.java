package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.media.AudioManager;
import android.media.Spatializer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.google.firebase.messaging.FirebaseMessaging;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes2.dex */
public final class ae7 implements ux0, xoc, lj6 {
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;

    public ae7(Context context, ve5 ve5Var, Boolean bool) {
        AudioManager audioManagerQ = context == null ? null : p90.q(context);
        int i = 0;
        if (audioManagerQ == null || (bool != null && bool.booleanValue())) {
            this.b = null;
            this.a = false;
            this.c = null;
            this.d = null;
            return;
        }
        Spatializer spatializer = audioManagerQ.getSpatializer();
        this.b = spatializer;
        this.a = spatializer.getImmersiveAudioLevel() != 0;
        qe5 qe5Var = new qe5(ve5Var);
        this.d = qe5Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        Handler handler = new Handler(looperMyLooper);
        this.c = handler;
        spatializer.addOnSpatializerStateChangedListener(new gc0(i, handler), qe5Var);
    }

    @Override // defpackage.lj6
    public void D() {
        SparseArray sparseArray = (SparseArray) this.c;
        ((lj6) this.b).D();
        if (this.a) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((i8h) sparseArray.valueAt(i)).i = true;
            }
        }
    }

    @Override // defpackage.lj6
    public kyh G(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.c;
        lj6 lj6Var = (lj6) this.b;
        if (i2 != 3) {
            this.a = true;
            return lj6Var.G(i, i2);
        }
        i8h i8hVar = (i8h) sparseArray.get(i);
        if (i8hVar != null) {
            return i8hVar;
        }
        i8h i8hVar2 = new i8h(lj6Var.G(i, i2), (b8h) this.d);
        sparseArray.put(i, i8hVar2);
        return i8hVar2;
    }

    public void a(Canvas canvas, ui uiVar) {
        int i = uiVar.a;
        int i2 = uiVar.b;
        canvas.drawRect(i, i2, i + uiVar.c, i2 + uiVar.d, (Paint) this.d);
    }

    public vv9 b(UUID uuid, ef6 ef6Var) throws MediaDrmCallbackException {
        String str;
        String str2 = ef6Var.b;
        if (this.a || TextUtils.isEmpty(str2)) {
            str2 = (String) this.c;
        }
        if (TextUtils.isEmpty(str2)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            lvb.W(uri, "The uri must be set.");
            throw new MediaDrmCallbackException(new a35(uri, 0L, 1, null, map, 0L, -1L, null, 0, null), uri, lhe.g, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map2 = new HashMap();
        UUID uuid2 = f71.e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = f71.c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map2.put(HTTP.CONTENT_TYPE, str);
        if (uuid2.equals(uuid)) {
            map2.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.d)) {
            map2.putAll((HashMap) this.d);
        }
        return dtl.a(((eb5) this.b).a(), str2, ef6Var.a, map2);
    }

    public vv9 c(ff6 ff6Var) {
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), ff6Var.a, "\"}".getBytes(charset)};
        long length = 0;
        for (int i = 0; i < 3; i++) {
            length += (long) bArr[i].length;
        }
        int i2 = (int) length;
        lvb.N(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i2));
        byte[] bArr2 = new byte[i2];
        int length2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            byte[] bArr3 = bArr[i3];
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr3.length;
        }
        u25 u25VarA = ((eb5) this.b).a();
        String str = ff6Var.b;
        String string = a7a.i.toString();
        String strValueOf = String.valueOf(i2);
        oc9.n(HTTP.CONTENT_LEN, strValueOf);
        return dtl.a(u25VarA, str, bArr2, lhe.i(2, new Object[]{HTTP.CONTENT_TYPE, string, HTTP.CONTENT_LEN, strValueOf}, null));
    }

    @Override // defpackage.ux0
    public synchronized void clear() {
        try {
            au3.E((g95) this.d);
            this.d = null;
            int size = ((SparseArray) this.c).size();
            int i = 0;
            while (true) {
                SparseArray sparseArray = (SparseArray) this.c;
                if (i < size) {
                    au3.E((au3) sparseArray.valueAt(i));
                    i++;
                } else {
                    sparseArray.clear();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ux0
    public synchronized au3 d() {
        return ldf.i(au3.A((g95) this.d));
    }

    @Override // defpackage.ux0
    public synchronized void e(int i, au3 au3Var) {
        g95 g95VarY;
        p(i);
        try {
            g95VarY = au3.Y(CloseableStaticBitmap.of(au3Var, s98.d, 0));
            if (g95VarY != null) {
                try {
                    au3.E((g95) this.d);
                    ljf ljfVar = (ljf) this.b;
                    this.d = ((nj9) ((ru4) ljfVar.c)).f(new bj((ek) ljfVar.b, i), g95VarY, (c7k) ljfVar.d);
                } catch (Throwable th) {
                    th = th;
                    au3.E(g95VarY);
                    throw th;
                }
            }
            au3.E(g95VarY);
        } catch (Throwable th2) {
            th = th2;
            g95VarY = null;
        }
    }

    public synchronized boolean f() {
        boolean z;
        boolean zBooleanValue;
        try {
            synchronized (this) {
                try {
                    if (!this.a) {
                        Boolean boolM = m();
                        this.c = boolM;
                        if (boolM == null) {
                            ((gc6) ((q7h) this.b)).a(new eu6(6));
                        }
                        this.a = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zBooleanValue;
        } catch (Throwable th2) {
            throw th2;
        }
        Boolean bool = (Boolean) this.c;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            ov6 ov6Var = ((FirebaseMessaging) this.d).a;
            ov6Var.a();
            i25 i25Var = (i25) ov6Var.g.get();
            synchronized (i25Var) {
                z = i25Var.a;
            }
            zBooleanValue = z;
        }
        return zBooleanValue;
    }

    @Override // defpackage.ux0
    public synchronized void g(int i, au3 au3Var) {
        g95 g95VarY;
        try {
            try {
                g95VarY = au3.Y(CloseableStaticBitmap.of(au3Var, s98.d, 0));
                if (g95VarY == null) {
                    au3.E(g95VarY);
                    return;
                }
                try {
                    ljf ljfVar = (ljf) this.b;
                    g95 g95VarF = ((nj9) ((ru4) ljfVar.c)).f(new bj((ek) ljfVar.b, i), g95VarY, (c7k) ljfVar.d);
                    if (au3.W(g95VarF)) {
                        au3.E((au3) ((SparseArray) this.c).get(i));
                        ((SparseArray) this.c).put(i, g95VarF);
                        pj6.e(ae7.class, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i), (SparseArray) this.c);
                    }
                    g95VarY.close();
                } catch (Throwable th) {
                    th = th;
                    au3.E(g95VarY);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                g95VarY = null;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public boolean h(ui uiVar) {
        si siVar = (si) this.b;
        return uiVar.a == 0 && uiVar.b == 0 && uiVar.c == siVar.d.width() && uiVar.d == siVar.d.height();
    }

    @Override // defpackage.ux0
    public synchronized au3 i() {
        if (!this.a) {
            return null;
        }
        return ldf.i(((ljf) this.b).A());
    }

    public boolean j(int i) {
        if (i != 0) {
            ui[] uiVarArr = ((si) this.b).g;
            ui uiVar = uiVarArr[i];
            ui uiVar2 = uiVarArr[i - 1];
            if ((uiVar.e != 2 || !h(uiVar)) && (uiVar2.f != 2 || !h(uiVar2))) {
                return false;
            }
        }
        return true;
    }

    public boolean k() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0032 A[RETURN] */
    public woc l() {
        woc wocVar = (woc) this.b;
        if (wocVar != null) {
            int i = yoc.$EnumSwitchMapping$0[qt4.D(wocVar.b)];
            if (i != 1) {
                if (i != 2) {
                    ore.o();
                    return null;
                }
                if (!(((ef) this.d) instanceof bf)) {
                    return wocVar;
                }
            } else if (((gpb) this.c).a && this.a) {
                return wocVar;
            }
        }
        return null;
    }

    public Boolean m() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        ov6 ov6Var = ((FirebaseMessaging) this.d).a;
        ov6Var.a();
        Context context = ov6Var.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), np0.m)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public void n() {
        qe5 qe5Var;
        Handler handler = (Handler) this.c;
        Spatializer spatializer = (Spatializer) this.b;
        if (spatializer == null || (qe5Var = (qe5) this.d) == null || handler == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(qe5Var);
        handler.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.ux0
    public synchronized boolean o(int i) {
        boolean zContainsKey;
        ljf ljfVar = (ljf) this.b;
        ru4 ru4Var = (ru4) ljfVar.c;
        bj bjVar = new bj((ek) ljfVar.b, i);
        nj9 nj9Var = (nj9) ru4Var;
        synchronized (nj9Var) {
            hle hleVar = nj9Var.b;
            synchronized (hleVar) {
                zContainsKey = ((LinkedHashMap) hleVar.d).containsKey(bjVar);
            }
        }
        return zContainsKey;
    }

    public synchronized void p(int i) {
        au3 au3Var = (au3) ((SparseArray) this.c).get(i);
        if (au3Var != null) {
            ((SparseArray) this.c).delete(i);
            au3Var.close();
            pj6.e(ae7.class, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i), (SparseArray) this.c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    public void q(Bitmap bitmap, int i) {
        int i2;
        ft0 ft0Var = (ft0) this.c;
        si siVar = (si) this.b;
        boolean z = this.a;
        if (z) {
            Canvas canvas = new Canvas(bitmap);
            cj cjVar = siVar.c;
            fj fjVarH = cjVar.h(i);
            ui uiVarE = cjVar.e(i);
            ui uiVarE2 = i != 0 ? cjVar.e(i - 1) : null;
            try {
                if (fjVarH.getWidth() > 0 && fjVarH.getHeight() > 0) {
                    if (cjVar.d()) {
                        siVar.h(canvas, fjVarH, uiVarE, uiVarE2);
                    } else {
                        siVar.g(canvas, fjVarH, uiVarE, uiVarE2);
                    }
                    return;
                }
                return;
            } finally {
                fjVarH.dispose();
            }
        }
        Canvas canvas2 = new Canvas(bitmap);
        int i3 = 0;
        canvas2.drawColor(0, PorterDuff.Mode.SRC);
        if (j(i)) {
            i3 = i;
        } else {
            for (int i4 = i - 1; i4 >= 0; i4--) {
                ui uiVar = siVar.g[i4];
                int i5 = uiVar.f;
                if (i5 == 1) {
                    i2 = 1;
                } else if (i5 != 2) {
                    i2 = i5 == 3 ? 3 : 4;
                } else if (h(uiVar)) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                int iD = qt4.D(i2);
                if (iD == 0) {
                    ui uiVar2 = siVar.g[i4];
                    au3 au3VarX = ((ux0) ((ri) ft0Var.a).b).x(i4);
                    if (au3VarX != null) {
                        try {
                            canvas2.drawBitmap((Bitmap) au3VarX.K(), 0.0f, 0.0f, (Paint) null);
                            if (uiVar2.f == 2) {
                                a(canvas2, uiVar2);
                            }
                            i3 = i4 + 1;
                            if (!z) {
                                au3VarX.close();
                                break;
                            }
                            break;
                        } catch (Throwable th) {
                            if (!z) {
                                au3VarX.close();
                            }
                            throw th;
                        }
                    }
                    if (j(i4)) {
                        i3 = i4;
                        break;
                    }
                } else if (iD == 1) {
                    i3 = i4 + 1;
                    break;
                } else {
                    if (iD == 3) {
                        i3 = i4;
                        break;
                    }
                }
            }
        }
        while (i3 < i) {
            ui uiVar3 = siVar.g[i3];
            int i6 = uiVar3.f;
            if (i6 != 3) {
                if (uiVar3.e == 2) {
                    a(canvas2, uiVar3);
                }
                siVar.d(canvas2, i3);
                if (i6 == 2) {
                    a(canvas2, uiVar3);
                }
            }
            i3++;
        }
        ui uiVar4 = siVar.g[i];
        if (uiVar4.e == 2) {
            a(canvas2, uiVar4);
        }
        siVar.d(canvas2, i);
    }

    @Override // defpackage.lj6
    public void r(xbf xbfVar) {
        ((lj6) this.b).r(xbfVar);
    }

    @Override // defpackage.ux0
    public synchronized au3 x(int i) {
        ljf ljfVar;
        ljfVar = (ljf) this.b;
        return ldf.i(((nj9) ((ru4) ljfVar.c)).get(new bj((ek) ljfVar.b, i)));
    }

    public ae7(ljf ljfVar, boolean z) {
        this.b = ljfVar;
        this.a = z;
        this.c = new SparseArray();
    }

    public ae7(lj6 lj6Var, b8h b8hVar) {
        this.b = lj6Var;
        this.d = b8hVar;
        this.c = new SparseArray();
    }

    public ae7(si siVar, boolean z, ft0 ft0Var) {
        this.b = siVar;
        this.c = ft0Var;
        this.a = z;
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public ae7(String str, boolean z, eb5 eb5Var) {
        lvb.R((z && TextUtils.isEmpty(str)) ? false : true);
        this.b = eb5Var;
        this.c = str;
        this.a = z;
        this.d = new HashMap();
    }

    public ae7(FirebaseMessaging firebaseMessaging, q7h q7hVar) {
        this.d = firebaseMessaging;
        this.b = q7hVar;
    }

    public ae7(woc wocVar, gpb gpbVar, ef efVar, boolean z) {
        gpbVar.getClass();
        efVar.getClass();
        this.b = wocVar;
        this.c = gpbVar;
        this.d = efVar;
        this.a = z;
    }
}
