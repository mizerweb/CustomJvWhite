package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.GestureDetector;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class ed7 implements gf6, sah, d15, iee, jg7, lw0 {
    public static final eu6 e = new eu6(12);
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    public ed7(String str, String[] strArr) {
        String string;
        this.a = 10;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.d = string;
        this.c = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (!(length <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        int i = 2;
        while (i <= 7 && !Log.isLoggable((String) this.c, i)) {
            i++;
        }
        this.b = i;
    }

    public static ed7 C(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        float f2;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = jx3.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new ed7((Shader) null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayH = xzl.h(resources, theme, attributeSetAsAttributeSet, g3e.d);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayH.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayH.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayH.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayH.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayH.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayH.getFloat(4, 0.0f) : 0.0f;
        int i2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayH.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayH.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayH.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayH.getColor(1, 0) : 0;
        int i3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayH.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayH.getFloat(5, 0.0f) : 0.0f;
        typedArrayH.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f5;
            if (next2 == 1) {
                f2 = f6;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f6;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals(DatabaseHelper.ITEM_COLUMN_NAME)) {
                TypedArray typedArrayH2 = xzl.h(resources, theme, attributeSetAsAttributeSet, g3e.e);
                boolean zHasValue = typedArrayH2.hasValue(0);
                boolean zHasValue2 = typedArrayH2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayH2.getColor(0, 0);
                float f11 = typedArrayH2.getFloat(1, 0.0f);
                typedArrayH2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f5 = f;
            f6 = f2;
        }
        xp9 xp9Var = arrayList2.size() > 0 ? new xp9(arrayList2, arrayList) : null;
        if (xp9Var == null) {
            xp9Var = z ? new xp9(color, color2, color3) : new xp9(color, color3);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                int[] iArr = (int[]) xp9Var.b;
                float[] fArr = (float[]) xp9Var.c;
                if (i3 != 1) {
                    tileMode2 = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f3, f4, f, f2, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f7, f8, (int[]) xp9Var.b, (float[]) xp9Var.c);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = (int[]) xp9Var.b;
            float[] fArr2 = (float[]) xp9Var.c;
            if (i3 != 1) {
                tileMode = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f10, iArr2, fArr2, tileMode);
        }
        return new ed7(radialGradient, (ColorStateList) null, 0);
    }

    public static final ed7 G(fka fkaVar) {
        return njl.a(fkaVar);
    }

    public static ed7 S(char c) {
        return new ed7(new zo7(27, new dt2(c, 0)));
    }

    public hj0 A() {
        if ("".isEmpty()) {
            return new hj0((String) this.c, ((Long) this.d).longValue(), this.b);
        }
        ore.k("Missing required properties:".concat(""));
        return null;
    }

    public a28 B() {
        return new a28(this.b, new s18(0, (r18[]) ((ArrayList) this.c).toArray(new r18[0])), (flh) this.d, 1);
    }

    public void D(qg4 qg4Var) {
        for (b5a b5aVar : (CopyOnWriteArrayList) this.d) {
            vqi.d0(b5aVar.a, new su6(qg4Var, 27, b5aVar.b));
        }
    }

    public void E(int i, b87 b87Var, int i2, Object obj, long j) {
        D(new fv9(this, 12, new uz9(1, i, b87Var, i2, obj, vqi.p0(j), -9223372036854775807L)));
    }

    public void F(ov ovVar) {
        Object obj;
        for (Object[] objArr = (Object[]) this.c; objArr != null; objArr = objArr[4]) {
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (ovVar.test(obj)) {
                    return;
                }
            }
        }
    }

    public Object H(int i) {
        SparseArray sparseArray = (SparseArray) this.c;
        if (this.b == -1) {
            this.b = 0;
        }
        while (true) {
            int i2 = this.b;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.b--;
        }
        while (this.b < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.b + 1)) {
            this.b++;
        }
        return sparseArray.valueAt(this.b);
    }

    public int I() {
        return this.b;
    }

    public Shader J() {
        return (Shader) this.c;
    }

    public void K(String str, String str2) {
        ((ArrayList) this.c).add(new r18(str, str2));
    }

    public boolean L() {
        return ((Shader) this.c) != null;
    }

    public boolean M() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void N(t99 t99Var, int i, int i2, b87 b87Var, int i3, Object obj, long j, long j2) {
        D(new a5a(this, t99Var, new uz9(i, i2, b87Var, i3, obj, vqi.p0(j), vqi.p0(j2)), 1));
    }

    public void O(t99 t99Var, int i, int i2, b87 b87Var, int i3, Object obj, long j, long j2) {
        D(new a5a(this, t99Var, new uz9(i, i2, b87Var, i3, obj, vqi.p0(j), vqi.p0(j2)), 0));
    }

    public void P(t99 t99Var, int i, int i2, b87 b87Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        D(new zj1(this, t99Var, new uz9(i, i2, b87Var, i3, obj, vqi.p0(j), vqi.p0(j2)), iOException, z, 4));
    }

    public void Q(t99 t99Var, int i, IOException iOException, boolean z) {
        P(t99Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public void R(t99 t99Var, int i, int i2, b87 b87Var, int i3, Object obj, long j, long j2, int i4) {
        D(new e75(this, t99Var, new uz9(i, i2, b87Var, i3, obj, vqi.p0(j), vqi.p0(j2)), i4));
    }

    public List T(CharSequence charSequence) {
        charSequence.getClass();
        zo7 zo7Var = (zo7) this.d;
        zo7Var.getClass();
        hfg hfgVar = new hfg(zo7Var, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (hfgVar.hasNext()) {
            arrayList.add((String) hfgVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void U(int i) {
        this.b = i;
    }

    public long V() {
        long j = 0;
        for (sq3 sq3Var : (ArrayList) this.d) {
            long j2 = sq3Var.b;
            if (j2 != sq3Var.c || !sq3Var.d) {
                j2 = 0;
            }
            j += j2;
        }
        return j;
    }

    public void W(int i, long j, long j2) {
        uz9 uz9Var = new uz9(1, i, null, 3, null, vqi.p0(j), vqi.p0(j2));
        x4a x4aVar = (x4a) this.c;
        x4aVar.getClass();
        D(new oo(this, x4aVar, uz9Var, 15));
    }

    public boolean X() {
        return L() || this.b != 0;
    }

    public void Y(String str, do6 do6Var) {
        int i = this.b + 1;
        Object[] objArr = (Object[]) this.c;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.c = Arrays.copyOf(objArr, j8f.g(length, i2));
        }
        Object[] objArr2 = (Object[]) this.c;
        int i3 = this.b;
        int i4 = i3 + i3;
        objArr2[i4] = str;
        objArr2[i4 + 1] = do6Var;
        this.b = i3 + 1;
    }

    @Override // defpackage.jg7
    public void a(Object obj) {
        List list = (List) obj;
        d3a d3aVar = ((o3a) this.d).g;
        Handler handler = d3aVar.l;
        i2a i2aVar = (i2a) this.c;
        vqi.d0(handler, new su6(d3aVar, i2aVar, new c86(this, this.b, list, i2aVar, 3)));
    }

    @Override // defpackage.d15
    public void b(lhb lhbVar) {
        ab5 ab5Var = (ab5) this.d;
        ab5Var.getClass();
        ab5Var.a = lhbVar;
    }

    @Override // defpackage.d15
    public void c() {
        ((ab5) this.d).getClass();
    }

    @Override // defpackage.d15
    public void d(boolean z) {
        ((ab5) this.d).b = z;
    }

    @Override // defpackage.lw0
    public kw0 e(kj6 kj6Var, long j) {
        long j2;
        long position = kj6Var.getPosition();
        int iMin = (int) Math.min(112800L, kj6Var.getLength() - position);
        nmc nmcVar = (nmc) this.d;
        nmcVar.K(iMin);
        kj6Var.u(0, nmcVar.a, iMin);
        int i = nmcVar.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (true) {
            if (nmcVar.a() < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArr = nmcVar.a;
            int i2 = nmcVar.b;
            while (true) {
                if (i2 >= i) {
                    j2 = -9223372036854775807L;
                    break;
                }
                j2 = -9223372036854775807L;
                if (bArr[i2] == 71) {
                    break;
                }
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long jD = rzl.d(nmcVar, i2, this.b);
            if (jD != j2) {
                long jB = ((dth) this.c).b(jD);
                if (jB > j) {
                    return j5 == j2 ? new kw0(-1, jB, position) : new kw0(0, -9223372036854775807L, position + j4);
                }
                j5 = jB;
                if (100000 + j5 > j) {
                    return new kw0(0, -9223372036854775807L, position + ((long) i2));
                }
                j4 = i2;
            }
            nmcVar.N(i3);
            j3 = i3;
        }
        return j5 != j2 ? new kw0(-2, j5, position + j3) : kw0.d;
    }

    @Override // defpackage.gf6
    public Map f(byte[] bArr) {
        return ((MediaDrm) this.d).queryKeyStatus(bArr);
    }

    @Override // defpackage.gf6
    public ff6 g() {
        MediaDrm.ProvisionRequest provisionRequest = ((MediaDrm) this.d).getProvisionRequest();
        return new ff6(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // defpackage.sah
    public Object get() {
        rg0 rg0Var = (rg0) this.d;
        tvj.a("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        int i = rg0Var.d;
        int i2 = rg0Var.c;
        int iE = nwk.e(156000, i, 2, i2, 48000);
        tw5 tw5Var = new tw5();
        tw5Var.b = -1;
        tw5Var.a = (String) this.c;
        tw5Var.b = Integer.valueOf(this.b);
        tw5Var.c = msh.a;
        tw5Var.g = Integer.valueOf(i);
        tw5Var.e = Integer.valueOf(rg0Var.b);
        tw5Var.f = Integer.valueOf(i2);
        tw5Var.d = Integer.valueOf(iE);
        return tw5Var.i();
    }

    @Override // defpackage.gf6
    public byte[] h() {
        return ((MediaDrm) this.d).openSession();
    }

    @Override // defpackage.lw0
    public void i() {
        nmc nmcVar = (nmc) this.d;
        byte[] bArr = vqi.b;
        nmcVar.getClass();
        nmcVar.L(bArr.length, bArr);
    }

    @Override // defpackage.gf6
    public void j(byte[] bArr, byte[] bArr2) {
        ((MediaDrm) this.d).restoreKeys(bArr, bArr2);
    }

    @Override // defpackage.gf6
    public void k(final ks9 ks9Var) {
        ((MediaDrm) this.d).setOnEventListener(new MediaDrm.OnEventListener(this) { // from class: dd7
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                jf jfVar = ((ea5) ks9Var.b).x;
                jfVar.getClass();
                jfVar.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // defpackage.gf6
    public void l(byte[] bArr) throws DeniedByServerException {
        ((MediaDrm) this.d).provideProvisionResponse(bArr);
    }

    @Override // defpackage.gf6
    public int m() {
        return 2;
    }

    @Override // defpackage.gf6
    public void n(byte[] bArr, z3d z3dVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                MediaDrm mediaDrm = (MediaDrm) this.d;
                LogSessionId logSessionIdA = z3dVar.a();
                LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                    return;
                }
                MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                playbackComponent.getClass();
                f82.g(playbackComponent).setLogSessionId(logSessionIdA);
            } catch (UnsupportedOperationException unused2) {
                lvb.G0("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // defpackage.d15
    public e15 o(aa9 aa9Var, k15 k15Var, ljf ljfVar, int i, int[] iArr, rg6 rg6Var, int i2, long j, boolean z, ArrayList arrayList, w3d w3dVar, v1i v1iVar, z3d z3dVar) {
        u25 u25VarA = ((s25) this.c).a();
        if (v1iVar != null) {
            u25VarA.w(v1iVar);
        }
        return new n95((ab5) this.d, aa9Var, k15Var, ljfVar, i, iArr, rg6Var, i2, u25VarA, j, this.b, z, arrayList, w3dVar);
    }

    @Override // defpackage.jg7
    public void onFailure(Throwable th) {
    }

    @Override // defpackage.d15
    public b87 p(b87 b87Var) {
        ab5 ab5Var = (ab5) this.d;
        if (!ab5Var.b || !ab5Var.a.a(b87Var)) {
            return b87Var;
        }
        a87 a87VarA = b87Var.a();
        String str = b87Var.k;
        a87VarA.m = uya.n("application/x-media3-cues");
        a87VarA.K = ab5Var.a.n(b87Var);
        StringBuilder sb = new StringBuilder();
        sb.append(b87Var.n);
        sb.append(str != null ? " ".concat(str) : "");
        a87VarA.j = sb.toString();
        a87VarA.r = BuildConfig.MAX_TIME_TO_UPLOAD;
        return new b87(a87VarA);
    }

    public void q(Object obj) {
        int i = this.b;
        if (i == 4) {
            Object[] objArr = new Object[5];
            ((Object[]) this.d)[4] = objArr;
            this.d = objArr;
            i = 0;
        }
        ((Object[]) this.d)[i] = obj;
        this.b = i + 1;
    }

    @Override // defpackage.gf6
    public cd7 r(byte[] bArr) {
        UUID uuid = (UUID) this.c;
        if (Build.VERSION.SDK_INT < 27 && Objects.equals(uuid, f71.c)) {
            uuid = f71.b;
        }
        return new cd7(uuid, bArr);
    }

    @Override // defpackage.gf6
    public synchronized void release() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            ((MediaDrm) this.d).release();
        }
    }

    public void s(int i, sq3 sq3Var) {
        long j = sq3Var.b;
        ArrayList<sq3> arrayList = (ArrayList) this.d;
        for (sq3 sq3Var2 : arrayList) {
            long j2 = sq3Var2.a;
            long j3 = sq3Var2.b;
            long j4 = (j2 + j3) - 1;
            long j5 = sq3Var.a;
            if (j2 > j5 || j5 > j4) {
                long j6 = (j2 + j3) - 1;
                long j7 = (j5 + j) - 1;
                if (j2 > j7 || j7 > j6) {
                }
            }
            StringBuilder sbS = qt4.s(j5, "Chunks intersect (", "-");
            sbS.append(j);
            qt4.z(j2, "), (", "-", sbS);
            ore.k(c0a.m(j3, ")", sbS));
            return;
        }
        arrayList.add(i, sq3Var);
    }

    @Override // defpackage.gf6
    public boolean t(byte[] bArr, String str) throws Throwable {
        boolean zEquals;
        MediaDrm mediaDrm = (MediaDrm) this.d;
        UUID uuid = (UUID) this.c;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            if (uuid.equals(f71.d)) {
                String propertyString = mediaDrm.getPropertyString("version");
                zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                zEquals = uuid.equals(f71.c);
            }
            if (zEquals) {
                return mediaDrm.requiresSecureDecoder(str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto((i >= 27 || !Objects.equals(uuid, f71.c)) ? uuid : f71.b, bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    boolean z = !uuid.equals(f71.c);
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    return z;
                } catch (Throwable th) {
                    th = th;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (MediaCryptoException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public String toString() {
        switch (this.a) {
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                StringBuilder sbC = nbh.C("(");
                for (sq3 sq3Var : (ArrayList) this.d) {
                    if (sbC.length() > 1) {
                        sbC.append(",");
                    }
                    sbC.append(sq3Var.a);
                    sbC.append("-");
                    sbC.append((sq3Var.a + sq3Var.b) - 1);
                }
                sbC.append(")");
                return sbC.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iee
    public boolean u(UnsatisfiedLinkError unsatisfiedLinkError, rcg[] rcgVarArr) {
        int i;
        mf mfVar = (mf) this.d;
        Context context = (Context) this.c;
        String str = context.getApplicationInfo().sourceDir;
        if (new File(str).exists() && mfVar.w(str)) {
            for (int i2 = 0; i2 < rcgVarArr.length; i2++) {
                Object[] objArr = rcgVarArr[i2];
                if (objArr instanceof hee) {
                    rcgVarArr[i2] = ((hee) objArr).a(context);
                }
            }
            return true;
        }
        int i3 = this.b;
        synchronized (mfVar) {
            i = mfVar.b;
        }
        if (i3 == i) {
            return false;
        }
        Log.w("soloader.recovery.DetectDataAppMove", "Context was updated (perhaps by another thread)");
        return true;
    }

    public void v(int i, int i2) {
        Bitmap[] bitmapArr = (Bitmap[]) this.d;
        int i3 = (i2 << 16) + i;
        boolean z = this.b != i3;
        this.b = i3;
        for (int i4 = 0; i4 < uy0.z; i4++) {
            if (z || bitmapArr[i4] == null) {
                Bitmap bitmap = bitmapArr[i4];
                if (bitmap != null) {
                    ((ScheduledExecutorService) cqk.e.j.a.getValue()).execute(new qy0(bitmap, 0));
                }
                bitmapArr[i4] = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            }
            p88[] p88VarArr = (p88[]) this.c;
            if (p88VarArr[i4] == null) {
                p88 p88Var = new p88();
                p88Var.a = new byte[i2 * i * 2];
                p88VarArr[i4] = p88Var;
            }
        }
    }

    @Override // defpackage.gf6
    public void w(byte[] bArr) {
        ((MediaDrm) this.d).closeSession(bArr);
    }

    @Override // defpackage.gf6
    public byte[] x(byte[] bArr, byte[] bArr2) {
        if (f71.c.equals((UUID) this.c) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(vqi.s(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray(ApiProtocol.PARAM_KEYS);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e2) {
                lvb.l0("ClearKeyUtil", "Failed to adjust response data: ".concat(vqi.s(bArr2)), e2);
            }
        }
        return ((MediaDrm) this.d).provideKeyResponse(bArr, bArr2);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad A[LOOP:2: B:27:0x008e->B:35:0x00ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ff  */
    @Override // defpackage.gf6
    public ef6 y(byte[] bArr, List list, int i, HashMap map) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        int i2;
        vu5 vu5Var;
        vu5 vu5Var2;
        a9m a9mVarC;
        int i3;
        byte[] bArr3;
        byte[] bArrD;
        a9m a9mVarC2;
        UUID uuid = (UUID) this.c;
        vu5 vu5Var3 = null;
        if (list != null) {
            if (!f71.d.equals(uuid)) {
                vu5Var = (vu5) list.get(0);
            } else if (Build.VERSION.SDK_INT < 28 || list.size() <= 1) {
                i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        vu5Var = (vu5) list.get(0);
                        break;
                    }
                    vu5Var2 = (vu5) list.get(i2);
                    byte[] bArr4 = vu5Var2.e;
                    bArr4.getClass();
                    a9mVarC = iml.c(bArr4);
                    if (a9mVarC == null) {
                        i3 = -1;
                    } else {
                        i3 = a9mVarC.b;
                    }
                    if (i3 == 1) {
                        vu5Var = vu5Var2;
                        break;
                    }
                    i2++;
                }
            } else {
                vu5 vu5Var4 = (vu5) list.get(0);
                int i4 = 0;
                int length = 0;
                while (true) {
                    if (i4 < list.size()) {
                        vu5 vu5Var5 = (vu5) list.get(i4);
                        byte[] bArr5 = vu5Var5.e;
                        bArr5.getClass();
                        if (Objects.equals(vu5Var5.d, vu5Var4.d) && Objects.equals(vu5Var5.c, vu5Var4.c) && iml.c(bArr5) != null) {
                            length += bArr5.length;
                            i4++;
                        } else {
                            i2 = 0;
                            while (true) {
                                if (i2 < list.size()) {
                                    vu5Var = (vu5) list.get(0);
                                    break;
                                }
                                vu5Var2 = (vu5) list.get(i2);
                                byte[] bArr6 = vu5Var2.e;
                                bArr6.getClass();
                                a9mVarC = iml.c(bArr6);
                                if (a9mVarC == null) {
                                    i3 = -1;
                                } else {
                                    i3 = a9mVarC.b;
                                }
                                if (i3 == 1) {
                                    vu5Var = vu5Var2;
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else {
                        byte[] bArr7 = new byte[length];
                        int i5 = 0;
                        for (int i6 = 0; i6 < list.size(); i6++) {
                            byte[] bArr8 = ((vu5) list.get(i6)).e;
                            bArr8.getClass();
                            int length2 = bArr8.length;
                            System.arraycopy(bArr8, 0, bArr7, i5, length2);
                            i5 += length2;
                        }
                        vu5Var = new vu5(vu5Var4.b, vu5Var4.c, vu5Var4.d, bArr7);
                    }
                }
            }
            byte[] bArrB = vu5Var.e;
            bArrB.getClass();
            UUID uuid2 = f71.e;
            if (uuid2.equals(uuid)) {
                byte[] bArrD2 = iml.d(uuid, bArrB);
                if (bArrD2 != null) {
                    bArrB = bArrD2;
                }
                nmc nmcVar = new nmc(bArrB);
                int iO = nmcVar.o();
                short sQ = nmcVar.q();
                short sQ2 = nmcVar.q();
                if (sQ == 1 && sQ2 == 1) {
                    short sQ3 = nmcVar.q();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String strY = nmcVar.y(sQ3, charset);
                    if (!strY.contains("<LA_URL>")) {
                        int iIndexOf = strY.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            lvb.G0("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str2 = strY.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strY.substring(iIndexOf);
                        int i7 = iO + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i7);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i7);
                        byteBufferAllocate.putShort(sQ);
                        byteBufferAllocate.putShort(sQ2);
                        byteBufferAllocate.putShort((short) (str2.length() * 2));
                        byteBufferAllocate.put(str2.getBytes(charset));
                        bArrB = byteBufferAllocate.array();
                    }
                } else {
                    lvb.r0("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArrB = iml.b(uuid2, null, bArrB);
            }
            if (Build.VERSION.SDK_INT < 27 && Objects.equals(uuid, f71.c) && (a9mVarC2 = iml.c(bArrB)) != null) {
                bArrB = iml.b(f71.b, (UUID[]) a9mVarC2.e, (byte[]) a9mVarC2.d);
            }
            if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                String str3 = Build.MODEL;
                if (("AFTB".equals(str3) || "AFTS".equals(str3) || "AFTM".equals(str3) || "AFTT".equals(str3)) && (bArrD = iml.d(uuid, bArrB)) != null) {
                    bArr3 = bArrD;
                } else {
                    bArr3 = bArrB;
                }
            } else {
                bArr3 = bArrB;
            }
            str = vu5Var.d;
            bArr2 = bArr3;
            vu5Var3 = vu5Var;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = ((MediaDrm) this.d).getKeyRequest(bArr, bArr2, str, i, map);
        byte[] data = keyRequest.getData();
        if (f71.c.equals(uuid) && Build.VERSION.SDK_INT < 27) {
            data = vqi.s(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            defaultUrl = "";
        } else if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
            String propertyString = ((MediaDrm) this.d).getPropertyString("version");
            if (Objects.equals(propertyString, "1.2") || Objects.equals(propertyString, "aidl-1")) {
                defaultUrl = "";
            }
        }
        if (TextUtils.isEmpty(defaultUrl) && vu5Var3 != null) {
            String str4 = vu5Var3.c;
            if (!TextUtils.isEmpty(str4)) {
                defaultUrl = str4;
            }
        }
        keyRequest.getRequestType();
        return new ef6(data, defaultUrl);
    }

    public void z(flh flhVar) {
        this.d = flhVar;
    }

    public /* synthetic */ ed7(int i, boolean z) {
        this.a = i;
    }

    public ed7(lr6 lr6Var, int i) {
        this.a = 20;
        this.c = lr6Var;
        this.b = i;
        this.d = new ArrayList();
    }

    public ed7(Context context) {
        this.a = 8;
        this.d = new GestureDetector(context, new pi9(9, this));
    }

    public ed7(int i, u8b u8bVar, LinkedHashSet linkedHashSet) {
        this.a = 15;
        this.b = i;
        this.c = u8bVar;
        this.d = linkedHashSet;
    }

    public ed7(String str, int i, xb0 xb0Var, rg0 rg0Var) {
        this.a = 2;
        this.c = str;
        this.b = i;
        this.d = rg0Var;
    }

    public ed7(Context context, mf mfVar) {
        int i;
        this.a = 7;
        this.c = context;
        this.d = mfVar;
        synchronized (mfVar) {
            i = mfVar.b;
        }
        this.b = i;
    }

    public ed7(int i) {
        this.a = i;
        switch (i) {
            case 4:
                int i2 = uy0.z;
                this.c = new p88[i2];
                this.d = new Bitmap[i2];
                break;
            case 9:
                this.b = 200;
                this.c = new ArrayList();
                break;
            case 14:
                this.c = xb0.c;
                n4j n4jVar = n4j.e;
                this.d = n4j.e;
                this.b = -1;
                break;
            case 21:
                this.c = new Object[8];
                this.b = 0;
                break;
            default:
                Object[] objArr = new Object[5];
                this.c = objArr;
                this.d = objArr;
                break;
        }
    }

    public ed7(ahc ahcVar) {
        this.a = 17;
        this.c = new SparseArray();
        this.d = ahcVar;
        this.b = -1;
    }

    public ed7(Shader shader, ColorStateList colorStateList, int i) {
        this.a = 5;
        this.c = shader;
        this.d = colorStateList;
        this.b = i;
    }

    public ed7(int i, dth dthVar) {
        this.a = 19;
        this.b = i;
        this.c = dthVar;
        this.d = new nmc();
    }

    public ed7(s25 s25Var) {
        this.a = 6;
        this.d = new ab5();
        this.c = s25Var;
        this.b = 1;
    }

    public ed7(UUID uuid) {
        this.a = 0;
        uuid.getClass();
        UUID uuid2 = f71.b;
        lvb.O("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.c = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(f71.c)) ? uuid : uuid2);
        this.d = mediaDrm;
        this.b = 1;
        if (f71.d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public ed7(zo7 zo7Var) {
        this.a = 18;
        at2 at2Var = at2.f;
        this.d = zo7Var;
        this.c = at2Var;
        this.b = Integer.MAX_VALUE;
    }

    public ed7(CopyOnWriteArrayList copyOnWriteArrayList, int i, x4a x4aVar) {
        this.a = 13;
        this.d = copyOnWriteArrayList;
        this.b = i;
        this.c = x4aVar;
    }

    public ed7(b87 b87Var, int i, String str) {
        this.a = 11;
        this.c = b87Var;
        this.b = i;
        this.d = str;
    }

    public ed7(o3a o3aVar, i2a i2aVar, int i) {
        this.a = 12;
        this.d = o3aVar;
        this.c = i2aVar;
        this.b = i;
    }
}
