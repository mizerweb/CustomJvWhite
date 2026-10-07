package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EdgeEffect;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import javax.net.ssl.SSLSocket;
import kotlin.KotlinNothingValueException;
import net.jpountz.lz4.LZ4Factory;
import one.me.sdk.arch.Widget;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class rx8 {
    public static volatile LZ4Factory a;
    public static final int[] b = new int[0];
    public static final long[] c = new long[0];
    public static final Object[] d = new Object[0];
    public static final c5b e = new c5b("COMPLETING_ALREADY", 1);
    public static final c5b f = new c5b("COMPLETING_WAITING_CHILDREN", 1);
    public static final c5b g = new c5b("COMPLETING_RETRY", 1);
    public static final c5b h = new c5b("TOO_LATE_TO_CANCEL", 1);
    public static final c5b i = new c5b("SEALED", 1);
    public static final g66 j = new g66(false);
    public static final g66 k = new g66(true);
    public static final eg8 l = new eg8("");
    public static final eg8 m = new eg8(new String[0]);
    public static final do6 n;
    public static final do6[] o;
    public static final /* synthetic */ int p = 0;

    static {
        do6 do6Var = new do6("CLIENT_TELEMETRY", 1L);
        n = do6Var;
        o = new do6[]{do6Var};
    }

    public static final byte[] A(adb adbVar) throws IOException {
        if (Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = (NetworkRequest) adbVar.a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArrC = fyg.c(networkRequest);
                int[] iArrB = fyg.b(networkRequest);
                objectOutputStream.writeInt(iArrC.length);
                for (int i2 : iArrC) {
                    objectOutputStream.writeInt(i2);
                }
                objectOutputStream.writeInt(iArrB.length);
                for (int i3 : iArrB) {
                    objectOutputStream.writeInt(i3);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    n(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                n(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    public static y6a B(String str) {
        Matcher matcher = y6a.c.matcher(str);
        if (!matcher.lookingAt()) {
            c.o(qv1.g('\"', "No subtype found for: \"", str));
            return null;
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        strGroup.toLowerCase(locale);
        matcher.group(2).toLowerCase(locale);
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = y6a.d.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"').toString());
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (z5h.K0(strGroup3, "'", false) && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = strGroup3.substring(1, strGroup3.length() - 1);
                }
                arrayList.add(strGroup2);
                arrayList.add(strGroup3);
                iEnd = matcher2.end();
            }
        }
        return new y6a(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static final br4 C(hve hveVar) {
        lve lveVarA = hveVar.a.a();
        if (lveVarA != null) {
            return lveVarA.a;
        }
        return null;
    }

    public static final jg5 D(vt4 vt4Var) {
        tt4 tt4VarX0 = vt4Var.x0(khb.f);
        jg5 jg5Var = tt4VarX0 instanceof jg5 ? (jg5) tt4VarX0 : null;
        return jg5Var == null ? pa5.a : jg5Var;
    }

    public static float E(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return wx5.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Object F(Future future) {
        lvb.c0(future.isDone(), "Future was expected to be done: %s", future);
        return vd7.C(future);
    }

    public static LZ4Factory G() {
        if (a == null) {
            synchronized (rx8.class) {
                try {
                    if (a == null) {
                        a = LZ4Factory.fastestInstance();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a;
    }

    public static final gcf H(Object obj) {
        if (obj != sb8.a) {
            return (gcf) obj;
        }
        ore.k("Does not contain segment");
        return null;
    }

    public static final br4 I(hve hveVar) {
        lve lveVar = (lve) ww3.C1(hveVar.a.a);
        if (lveVar != null) {
            return lveVar.a;
        }
        return null;
    }

    public static h88 J(Object obj) {
        return obj == null ? h88.b : new h88(obj);
    }

    public static final rn0 K(int i2) {
        if (i2 == 0) {
            return rn0.a;
        }
        if (i2 == 1) {
            return rn0.b;
        }
        ore.p(c0a.k(i2, "Could not convert ", " to BackoffPolicy"));
        return null;
    }

    public static final int L(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 == 3) {
            return 4;
        }
        if (i2 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i2 == 5) {
            return 6;
        }
        ore.p(c0a.k(i2, "Could not convert ", " to NetworkType"));
        return 0;
    }

    public static final yic M(int i2) {
        if (i2 == 0) {
            return yic.a;
        }
        if (i2 == 1) {
            return yic.b;
        }
        ore.p(c0a.k(i2, "Could not convert ", " to OutOfQuotaPolicy"));
        return null;
    }

    public static final kyj N(int i2) {
        if (i2 == 0) {
            return kyj.a;
        }
        if (i2 == 1) {
            return kyj.b;
        }
        if (i2 == 2) {
            return kyj.c;
        }
        if (i2 == 3) {
            return kyj.d;
        }
        if (i2 == 4) {
            return kyj.e;
        }
        if (i2 == 5) {
            return kyj.f;
        }
        ore.p(c0a.k(i2, "Could not convert ", " to State"));
        return null;
    }

    public static final boolean O(Object obj) {
        return obj == sb8.a;
    }

    public static ny8 P(int i2, af7 af7Var) {
        ku6 ku6Var = ku6.p;
        int i3 = ty8.$EnumSwitchMapping$0[qt4.D(i2)];
        if (i3 == 1) {
            return new ifh(af7Var);
        }
        if (i3 == 2) {
            oye oyeVar = new oye();
            oyeVar.a = af7Var;
            oyeVar.b = ku6Var;
            return oyeVar;
        }
        if (i3 != 3) {
            ore.o();
            return null;
        }
        fdi fdiVar = new fdi();
        fdiVar.a = af7Var;
        fdiVar.b = ku6Var;
        return fdiVar;
    }

    public static ifh Q(af7 af7Var) {
        return new ifh(af7Var);
    }

    public static Object R(File file) throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        ObjectInputStream objectInputStream;
        if (!w(file)) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                objectInputStream = new ObjectInputStream(fileInputStream);
                try {
                    Object object = objectInputStream.readObject();
                    o(fileInputStream, objectInputStream);
                    return object;
                } catch (Throwable th2) {
                    th = th2;
                    o(fileInputStream, objectInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
            }
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            objectInputStream = null;
        }
    }

    public static pah S(pah pahVar) {
        if ((pahVar instanceof uah) || (pahVar instanceof tah)) {
            return pahVar;
        }
        return pahVar instanceof Serializable ? new tah(pahVar) : new uah(pahVar);
    }

    public static final int T(int i2) {
        int iD = qt4.D(i2);
        if (iD == 0) {
            return 0;
        }
        int i3 = 1;
        if (iD != 1) {
            i3 = 2;
            if (iD != 2) {
                i3 = 3;
                if (iD != 3) {
                    i3 = 4;
                    if (iD != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && i2 == 6) {
                            return 5;
                        }
                        c.f(c0a.x(i2), " to int", "Could not convert ");
                        return 0;
                    }
                }
            }
        }
        return i3;
    }

    public static final long U(si9 si9Var) {
        h4e h4eVar = i4e.a;
        if (si9Var.isEmpty()) {
            qr7.y(si9Var, "Cannot get random in empty range: ");
            return 0L;
        }
        if (si9Var.d() < BuildConfig.MAX_TIME_TO_UPLOAD) {
            return i4e.b.h(si9Var.c(), si9Var.d() + 1);
        }
        if (si9Var.c() <= Long.MIN_VALUE) {
            return i4e.b.f();
        }
        return i4e.b.h(si9Var.c() - 1, si9Var.d()) + 1;
    }

    public static float V(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return wx5.c(edgeEffect, f2, f3);
        }
        vx5.a(edgeEffect, f2, f3);
        return f2;
    }

    public static final int W(yic yicVar) {
        int i2 = tzj.$EnumSwitchMapping$3[yicVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return 1;
            }
            ore.o();
        }
        return 0;
    }

    public static final m8b X(m8b m8bVar, m8b m8bVar2) {
        if (m8bVar2.i()) {
            return m8bVar;
        }
        if (m8bVar.i()) {
            return m8bVar2;
        }
        m8b m8bVar3 = new m8b(m8bVar.d + m8bVar2.d);
        m8bVar3.b(m8bVar);
        m8bVar3.b(m8bVar2);
        return m8bVar3;
    }

    public static final void Y(m8b m8bVar, vza vzaVar) {
        m8b m8bVar2 = new m8b();
        long[] jArr = m8bVar.b;
        long[] jArr2 = m8bVar.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            long j3 = jArr[(i2 << 3) + i4];
                            if (!((Boolean) vzaVar.invoke(Long.valueOf(j3))).booleanValue()) {
                                m8bVar2.a(j3);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        m8bVar.o(m8bVar2);
    }

    public static final byte[] Z(Set set) throws IOException {
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    jg4 jg4Var = (jg4) it.next();
                    objectOutputStream.writeUTF(jg4Var.a().toString());
                    objectOutputStream.writeBoolean(jg4Var.b());
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    n(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                n(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    public static Drawable a(Context context, int i2, float f2, boolean z) {
        return z ? new sz0(context, i2, f2, true) : new ColorDrawable(i2);
    }

    public static final int a0(kyj kyjVar) {
        switch (tzj.$EnumSwitchMapping$0[kyjVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                ore.o();
                return 0;
        }
    }

    public static final m8b b(m8b m8bVar) {
        m8b m8bVar2 = new m8b(m8bVar.d);
        m8bVar2.b(m8bVar);
        return m8bVar2;
    }

    public static boolean b0(File file, Object obj) throws Throwable {
        ObjectOutputStream objectOutputStream;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream2);
                try {
                    objectOutputStream.writeObject(obj);
                    o(fileOutputStream2, objectOutputStream);
                    return true;
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        gm0.V("rx8", "Failed to store object to file", e);
                        o(fileOutputStream, objectOutputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        o(fileOutputStream, objectOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    o(fileOutputStream, objectOutputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                objectOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream = null;
            }
        } catch (Exception e4) {
            e = e4;
            objectOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            objectOutputStream = null;
        }
    }

    public static final bx5 c(int i2) {
        if (i2 == 0) {
            return bx5.a;
        }
        if (i2 == 1) {
            return bx5.b;
        }
        if (i2 == 2) {
            return bx5.c;
        }
        if (i2 == 3) {
            return bx5.d;
        }
        if (i2 == 4) {
            return bx5.e;
        }
        bx5 bx5Var = bx5.f;
        if (i2 != 5) {
            gm0.r("OneMeDynamicFont", zo5.h(i2, "unknown font size mode "), new IllegalStateException(zo5.h(i2, "unknown font size mode ")));
        }
        return bx5Var;
    }

    public static void c0(String str, af7 af7Var) {
        obc obcVar = new obc(af7Var);
        obcVar.setDaemon(true);
        obcVar.setName(str);
        obcVar.start();
    }

    public static final void d(m8b m8bVar, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m8bVar.a(((Number) it.next()).longValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004b A[LOOP:0: B:5:0x0012->B:15:0x004b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x004e A[EDGE_INSN: B:18:0x004e->B:16:0x004e BREAK  A[LOOP:0: B:5:0x0012->B:15:0x004b], SYNTHETIC] */
    public static final pw d0(m8b m8bVar) {
        pw pwVar = new pw(m8bVar.d);
        long[] jArr = m8bVar.b;
        long[] jArr2 = m8bVar.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            pwVar.add(Long.valueOf(jArr[(i2 << 3) + i4]));
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return pwVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047 A[LOOP:0: B:5:0x0012->B:15:0x0047, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x004a A[EDGE_INSN: B:18:0x004a->B:16:0x004a BREAK  A[LOOP:0: B:5:0x0012->B:15:0x0047], SYNTHETIC] */
    public static final m8b e(m8b m8bVar) {
        m8b m8bVar2 = new m8b(m8bVar.d);
        long[] jArr = m8bVar.b;
        long[] jArr2 = m8bVar.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            m8bVar2.a(jArr[(i2 << 3) + i4]);
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return m8bVar2;
    }

    public static final long e0(long j2) {
        boolean zN = ew5.n(j2);
        if (zN) {
            return ew5.g(ew5.p(j2, qe7.P(999999L, lw5.NANOSECONDS)));
        }
        if (!zN) {
            return 0L;
        }
        ore.o();
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void f(nq4 nq4Var) {
        kg5 kg5Var;
        if (nq4Var instanceof kg5) {
            kg5Var = (kg5) nq4Var;
            int i2 = kg5Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kg5Var.e = i2 - Integer.MIN_VALUE;
            } else {
                kg5Var = new kg5(nq4Var);
            }
        } else {
            kg5Var = new kg5(nq4Var);
        }
        Object obj = kg5Var.d;
        int i3 = kg5Var.e;
        if (i3 == 0) {
            ch3.d0(obj);
            kg5Var.e = 1;
            ek2 ek2Var = new ek2(1, p90.B(kg5Var));
            ek2Var.u();
            if (ek2Var.s() == hu4.a) {
                return;
            }
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            ch3.d0(obj);
        }
        throw new KotlinNothingValueException();
    }

    public static final List f0(m8b m8bVar) {
        return Collections.unmodifiableList(i0(m8bVar));
    }

    public static final int g(rn0 rn0Var) {
        int i2 = tzj.$EnumSwitchMapping$1[rn0Var.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return 1;
            }
            ore.o();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0044 A[DONT_INVERT, PHI: r5
  0x0044: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x001e, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0046 A[LOOP:0: B:5:0x0010->B:15:0x0046, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0049 A[EDGE_INSN: B:18:0x0049->B:16:0x0049 BREAK  A[LOOP:0: B:5:0x0010->B:15:0x0046], SYNTHETIC] */
    public static final long[] g0(m8b m8bVar) {
        long[] jArr = new long[m8bVar.d];
        long[] jArr2 = m8bVar.b;
        long[] jArr3 = m8bVar.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j2 = jArr3[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128) {
                            jArr[i3] = jArr2[(i2 << 3) + i5];
                            i3++;
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return jArr;
    }

    public static final int h(int i2, int i3, int[] iArr) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final m8b h0(long[] jArr) {
        m8b m8bVar = new m8b(jArr.length);
        for (long j2 : jArr) {
            m8bVar.a(j2);
        }
        return m8bVar;
    }

    public static final int i(int i2, long j2, long[] jArr) {
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004b A[LOOP:0: B:5:0x0012->B:15:0x004b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x004e A[EDGE_INSN: B:18:0x004e->B:16:0x004e BREAK  A[LOOP:0: B:5:0x0012->B:15:0x004b], SYNTHETIC] */
    public static final ArrayList i0(m8b m8bVar) {
        ArrayList arrayList = new ArrayList(m8bVar.d);
        long[] jArr = m8bVar.b;
        long[] jArr2 = m8bVar.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            arrayList.add(Long.valueOf(jArr[(i2 << 3) + i4]));
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return arrayList;
    }

    public static final String j(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static final m8b j0(Collection collection) {
        m8b m8bVar = new m8b(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m8bVar.a(((Number) it.next()).longValue());
        }
        return m8bVar;
    }

    public static final LinkedHashSet k(byte[] bArr) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i2 = objectInputStream.readInt();
                    for (int i3 = 0; i3 < i2; i3++) {
                        linkedHashSet.add(new jg4(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean()));
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        n(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                n(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static final adb k0(byte[] bArr) throws IOException {
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new adb(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i2 = objectInputStream.readInt();
                int[] iArr = new int[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = objectInputStream.readInt();
                }
                int i4 = objectInputStream.readInt();
                int[] iArr2 = new int[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    iArr2[i5] = objectInputStream.readInt();
                }
                adb adbVarA = nwk.a(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return adbVarA;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    n(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                n(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static final void l(View view) {
        Iterator it = g4m.c(view).iterator();
        while (true) {
            thf thfVar = (thf) it;
            if (!thfVar.hasNext()) {
                return;
            }
            View view2 = (View) thfVar.next();
            pbd pbdVar = (pbd) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (pbdVar == null) {
                pbdVar = new pbd();
                view2.setTag(R.id.pooling_container_listener_holder_tag, pbdVar);
            }
            pbdVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0049 A[LOOP:0: B:5:0x0010->B:15:0x0049, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x004c A[EDGE_INSN: B:19:0x004c->B:16:0x004c BREAK  A[LOOP:0: B:5:0x0010->B:15:0x0049], SYNTHETIC] */
    public static final Set l0(m8b m8bVar) {
        pw pwVar = new pw(0);
        long[] jArr = m8bVar.b;
        long[] jArr2 = m8bVar.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            pwVar.add(Long.valueOf(jArr[(i2 << 3) + i4]));
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return Collections.unmodifiableSet(pwVar);
    }

    public static final Object m0(Object obj) {
        qc8 qc8Var;
        rc8 rc8Var = obj instanceof rc8 ? (rc8) obj : null;
        return (rc8Var == null || (qc8Var = rc8Var.a) == null) ? obj : qc8Var;
    }

    public static final void n(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                gm0.b(th, th2);
            }
        }
    }

    public static final void n0(gdi gdiVar) {
        gdiVar.d(677, new ko7(6));
        gdiVar.d(1016, new ko7(7));
        gdiVar.d(1003, new gj5(19));
        gdiVar.d(950, new ko7(8));
        gdiVar.d(982, new ko7(9));
        gdiVar.d(1017, new wk5(1, new w4(20, false)));
        gdiVar.d(1018, new ko7(10));
    }

    public static void o(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e2) {
                    gm0.n("rx8", "Failed to close output stream: " + e2.getMessage());
                }
            }
        }
    }

    public static final void o0(gdi gdiVar) {
        gdiVar.d(869, new zc9(23));
        gdiVar.d(877, new zc9(24));
        gdiVar.d(899, new zc9(25));
        gdiVar.d(876, new ci3(9));
        gdiVar.d(901, new jld(12));
        gdiVar.d(885, new zc9(26));
        gdiVar.d(908, new g(18));
        gdiVar.d(909, new g(19));
        gdiVar.d(910, new g(20));
        gdiVar.d(911, new g(21));
        gdiVar.d(912, new g(22));
        gdiVar.d(913, new g(23));
        gdiVar.d(914, new mh(15));
        gdiVar.d(915, new g(24));
        gdiVar.d(887, new g(25));
        gdiVar.d(916, new g(26));
        gdiVar.d(878, new mh(18));
        gdiVar.d(883, new mh(19));
        gdiVar.d(891, new mh(20));
        gdiVar.d(917, new mh(21));
        gdiVar.d(207, new mh(22));
        gdiVar.d(918, new mh(23));
        gdiVar.d(919, new mh(24));
        gdiVar.d(886, new mh(25));
        gdiVar.d(920, new mh(5));
        gdiVar.d(206, new mh(6));
        gdiVar.d(897, new g(15));
        gdiVar.d(895, new mh(7));
        gdiVar.d(870, new mh(8));
        gdiVar.d(921, new mh(9));
        gdiVar.d(888, new mh(10));
        gdiVar.d(889, new mh(11));
        gdiVar.d(884, new mh(12));
        gdiVar.d(890, new mh(13));
        gdiVar.d(892, new mh(14));
        gdiVar.d(880, new f(2));
        gdiVar.d(879, new f(3));
        gdiVar.d(881, new f(4));
        gdiVar.d(900, new f(5));
        gdiVar.d(882, new f(6));
        gdiVar.d(893, new g(16));
        gdiVar.d(894, new g(17));
        gdiVar.d(896, new mh(16));
        gdiVar.d(898, new mh(17));
        gdiVar.b(4, new f(1));
    }

    public static boolean p(String str) {
        HashMap map = gr4.c;
        cr4 cr4Var = (cr4) map.get(str);
        if (cr4Var == null) {
            return false;
        }
        cr4Var.a.a();
        map.remove(str);
        return true;
    }

    public static long q(int i2, int i3) {
        return (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047 A[LOOP:0: B:5:0x0012->B:15:0x0047, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x004a A[EDGE_INSN: B:18:0x004a->B:16:0x004a BREAK  A[LOOP:0: B:5:0x0012->B:15:0x0047], SYNTHETIC] */
    public static final m8b r(m8b m8bVar) {
        m8b m8bVar2 = new m8b(m8bVar.d);
        long[] jArr = m8bVar.b;
        long[] jArr2 = m8bVar.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            m8bVar2.a(jArr[(i2 << 3) + i4]);
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return m8bVar2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047 A[LOOP:0: B:5:0x0012->B:15:0x0047, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x004a A[EDGE_INSN: B:18:0x004a->B:16:0x004a BREAK  A[LOOP:0: B:5:0x0012->B:15:0x0047], SYNTHETIC] */
    public static final m8b s(m8b m8bVar) {
        m8b m8bVar2 = new m8b(m8bVar.d);
        long[] jArr = m8bVar.b;
        long[] jArr2 = m8bVar.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr2[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            m8bVar2.a(jArr[(i2 << 3) + i4]);
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return m8bVar2;
    }

    public static final Object t(long j2, lq4 lq4Var) {
        if (j2 > 0) {
            ek2 ek2Var = new ek2(1, p90.B(lq4Var));
            ek2Var.u();
            if (j2 < BuildConfig.MAX_TIME_TO_UPLOAD) {
                D(ek2Var.e).P(j2, ek2Var);
            }
            Object objS = ek2Var.s();
            if (objS == hu4.a) {
                return objS;
            }
        }
        return sbi.a;
    }

    public static final Object u(long j2, lq4 lq4Var) {
        Object objT = t(e0(j2), lq4Var);
        return objT == hu4.a ? objT : sbi.a;
    }

    public static String v(SSLSocket sSLSocket, String str) {
        try {
            Certificate[] peerCertificates = sSLSocket.getSession().getPeerCertificates();
            StringBuilder sb = new StringBuilder("host=" + str + ", certificates(" + peerCertificates.length + ")=\n");
            int length = peerCertificates.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                sb.append("#" + i3 + " " + peerCertificates[i2] + "\n");
                i2++;
                i3++;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "failed to retrieve certificates, host=".concat(str);
        }
    }

    public static boolean w(File file) {
        try {
            return file.exists() && file.canRead();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean x(String str) {
        return !ch3.r(str) && w(new File(str));
    }

    public static final Widget y(hve hveVar, t3f t3fVar, Widget widget) {
        Widget widgetFindWidget$arch;
        Iterator it = hveVar.a.iterator();
        while (true) {
            y1 y1Var = (y1) it;
            widgetFindWidget$arch = null;
            if (!y1Var.hasNext()) {
                break;
            }
            br4 br4Var = ((lve) y1Var.next()).a;
            Widget widget2 = br4Var instanceof Widget ? (Widget) br4Var : null;
            widgetFindWidget$arch = widget2 != null ? widget2.findWidget$arch(t3fVar, widget) : null;
            if (widgetFindWidget$arch != null && widgetFindWidget$arch != widget) {
                break;
            }
        }
        return widgetFindWidget$arch;
    }

    public static gr4 z(Bundle bundle) {
        String string;
        Bundle bundle2;
        gr4 gr4Var;
        if (bundle == null || (string = bundle.getString("ControllerChangeHandler.className")) == null || (bundle2 = bundle.getBundle("ControllerChangeHandler.savedState")) == null || (gr4Var = (gr4) rml.d(string)) == null) {
            return null;
        }
        gr4Var.h(bundle2);
        return gr4Var;
    }

    public abstract List m(String str, List list);
}
