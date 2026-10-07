package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.a;
import one.me.android.initialization.AccountInitializer;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
public abstract class np4 {
    public static final Object a = new Object();
    public static final ste b = new ste("HEAP_DUMP", 2);
    public static final c5b c = new c5b("NO_OWNER", 1);
    public static final c5b d = new c5b("NO_THREAD_ELEMENTS", 1);
    public static final dz e = new dz(15);
    public static final dz f = new dz(16);
    public static final dz g = new dz(17);
    public static boolean h;
    public static AnimatedFactoryV2Impl i;
    public static String j;
    public static cy5 k;
    public static Field l;
    public static Field m;

    public static final void A(vt4 vt4Var, Object obj) {
        if (obj == d) {
            return;
        }
        if (!(obj instanceof xqh)) {
            ((pqh) vt4Var.E(null, f)).b.set(obj);
            return;
        }
        xqh xqhVar = (xqh) obj;
        pqh[] pqhVarArr = xqhVar.c;
        int length = pqhVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            pqhVarArr[length].b.set(xqhVar.b[length]);
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void B(Drawable drawable, Drawable.Callback callback, x1i x1iVar) {
        if (drawable == 0) {
            return;
        }
        drawable.setCallback(callback);
        w1i w1iVar = drawable instanceof w1i ? (w1i) drawable : null;
        if (w1iVar != null) {
            w1iVar.f(x1iVar);
        }
    }

    public static final void C(TextView textView, boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFallbackLineSpacing(z);
        }
    }

    public static final void D(EditText editText, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            editText.setTextCursorDrawable(drawable);
            return;
        }
        try {
            if (l == null) {
                Field declaredField = TextView.class.getDeclaredField("mEditor");
                declaredField.setAccessible(true);
                l = declaredField;
            }
            Field field = l;
            Field field2 = null;
            if (field == null) {
                field = null;
            }
            if (field.get(editText) == null) {
                Method declaredMethod = editText.getClass().getDeclaredMethod("createEditorIfNeeded", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(editText, null);
            }
            if (l == null) {
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                declaredField2.setAccessible(true);
                l = declaredField2;
            }
            Field field3 = l;
            if (field3 == null) {
                field3 = null;
            }
            Object obj = field3.get(editText);
            if (obj == null) {
                return;
            }
            if (m == null) {
                Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
                declaredField3.setAccessible(true);
                m = declaredField3;
            }
            Field field4 = m;
            if (field4 != null) {
                field2 = field4;
            }
            field2.set(obj, new Drawable[]{drawable, drawable});
        } catch (Throwable unused) {
        }
    }

    public static void E(List list, ddd dddVar, int i2, int i3) {
        for (int size = list.size() - 1; size > i3; size--) {
            if (dddVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            list.remove(i4);
        }
    }

    public static final String F(String str) {
        int i2;
        int i3 = 0;
        int i4 = -1;
        if (r5h.L0(str, ":", false)) {
            InetAddress inetAddressJ = (z5h.K0(str, "[", false) && str.endsWith("]")) ? j(1, str.length() - 1, str) : j(0, str.length(), str);
            if (inetAddressJ != null) {
                byte[] address = inetAddressJ.getAddress();
                if (address.length != 16) {
                    if (address.length == 4) {
                        return inetAddressJ.getHostAddress();
                    }
                    c.e(qv1.g('\'', "Invalid IPv6 address: '", str));
                    return null;
                }
                int i5 = 0;
                int i6 = 0;
                while (i5 < address.length) {
                    int i7 = i5;
                    while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                        i7 += 2;
                    }
                    int i8 = i7 - i5;
                    if (i8 > i6 && i8 >= 4) {
                        i4 = i5;
                        i6 = i8;
                    }
                    i5 = i7 + 2;
                }
                l31 l31Var = new l31();
                while (i3 < address.length) {
                    if (i3 == i4) {
                        l31Var.t0(58);
                        i3 += i6;
                        if (i3 == 16) {
                            l31Var.t0(58);
                        }
                    } else {
                        if (i3 > 0) {
                            l31Var.t0(58);
                        }
                        byte b2 = address[i3];
                        byte[] bArr = uqi.a;
                        l31Var.u0(((b2 & 255) << 8) | (address[i3 + 1] & 255));
                        i3 += 2;
                    }
                }
                return l31Var.P();
            }
        } else {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.length() != 0) {
                    int length = lowerCase.length();
                    for (0; i2 < length; i2 + 1) {
                        char cCharAt = lowerCase.charAt(i2);
                        i2 = (cqk.i(cCharAt, 31) > 0 && cqk.i(cCharAt, 127) < 0 && r5h.U0(" #%/:?@[\\]", cCharAt, 0, 6) == -1) ? i2 + 1 : 0;
                    }
                    return lowerCase;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public static final u8b G(Collection collection) {
        u8b u8bVar = new u8b(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            u8bVar.b(it.next());
        }
        return u8bVar;
    }

    public static final FileOutputStream H(File file) {
        return new FileOutputStream(file, true);
    }

    public static final Object I(vt4 vt4Var, Object obj) {
        if (obj == null) {
            obj = vt4Var.E(0, e);
        }
        if (obj == 0) {
            return d;
        }
        if (obj instanceof Integer) {
            return vt4Var.E(new xqh(((Number) obj).intValue(), vt4Var), g);
        }
        pqh pqhVar = (pqh) obj;
        ThreadLocal threadLocal = pqhVar.b;
        Object obj2 = threadLocal.get();
        threadLocal.set(pqhVar.a);
        return obj2;
    }

    public static final void J(gdi gdiVar) {
        gdiVar.d(770, new fc1(20));
        gdiVar.d(774, new fc1(24));
        gdiVar.d(775, new fc1(15));
        gdiVar.b(3, new f(22));
        gdiVar.d(778, new cp0(17));
        gdiVar.d(779, new cp0(18));
        gdiVar.d(776, new cp0(19));
        gdiVar.d(771, new cp0(20));
        gdiVar.d(772, new cp0(21));
        gdiVar.d(777, new cp0(22));
        gdiVar.d(773, new fc1(14));
    }

    public static final void K(gdi gdiVar) {
        gdiVar.b(3, new gj5(8));
        gdiVar.d(1023, new mu2(15));
        gdiVar.d(1007, new mu2(16));
        gdiVar.d(1004, new mu2(17));
        gdiVar.d(1005, new mu2(18));
        gdiVar.d(1006, new mu2(19));
        gdiVar.d(665, new mu2(20));
        gdiVar.d(676, new l65(9));
        gdiVar.d(1024, new gj5(9));
        gdiVar.d(1025, new l65(10));
        gdiVar.d(1026, new l65(11));
        gdiVar.d(1027, new l65(12));
        gdiVar.d(1028, new gj5(10));
        gdiVar.d(1029, new gj5(11));
        gdiVar.d(1030, new gj5(12));
        gdiVar.d(1008, new gj5(13));
    }

    public static final void L(gdi gdiVar) {
        gdiVar.d(384, new g7f(26));
        gdiVar.d(387, new g7f(21));
        gdiVar.d(385, new g7f(22));
        gdiVar.d(386, new eaf(9));
        gdiVar.b(3, new y6f(27));
    }

    public static final void M(gdi gdiVar) {
        gdiVar.b(3, new m3i(1));
        gdiVar.d(391, new r1i(9));
        gdiVar.d(392, new r1i(10));
        gdiVar.d(393, new r1i(11));
        gdiVar.d(394, new r1i(12));
        gdiVar.d(395, new r1i(13));
        gdiVar.d(396, new r1i(14));
    }

    public static boolean a(Iterable iterable, ddd dddVar) {
        return q4m.a(iterable.iterator(), dddVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(njd njdVar, af7 af7Var, lq4 lq4Var) {
        ljd ljdVar;
        if (lq4Var instanceof ljd) {
            ljdVar = (ljd) lq4Var;
            int i2 = ljdVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ljdVar.f = i2 - Integer.MIN_VALUE;
            } else {
                ljdVar = new ljd(lq4Var);
            }
        } else {
            ljdVar = new ljd(lq4Var);
        }
        Object obj = ljdVar.e;
        int i3 = ljdVar.f;
        try {
            if (i3 == 0) {
                ch3.d0(obj);
                if (ljdVar.getContext().x0(nhb.h) != njdVar) {
                    ore.k("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                ljdVar.d = af7Var;
                ljdVar.f = 1;
                ek2 ek2Var = new ek2(1, p90.B(ljdVar));
                ek2Var.u();
                njdVar.f.A(new kl3(6, ek2Var));
                Object objS = ek2Var.s();
                hu4 hu4Var = hu4.a;
                if (objS == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i3 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                af7Var = ljdVar.d;
                ch3.d0(obj);
            }
            af7Var.invoke();
            return sbi.a;
        } catch (Throwable th) {
            af7Var.invoke();
            throw th;
        }
    }

    public static int c(Context context, String str) {
        if (str == null) {
            ore.n("permission must be non-null");
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new umb(context).b.areNotificationsEnabled() ? 0 : -1;
    }

    public static int d(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManagerE = io.e(context);
                    iNoteProxyOpNoThrow = io.b(appOpsManagerE, strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = io.b(appOpsManagerE, strPermissionToOp, iMyUid, io.d(context));
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static float e(float f2, float f3, float f4) {
        if (f2 < f3) {
            return f3;
        }
        return f2 > f4 ? f4 : f2;
    }

    public static int f(int i2, int i3, int i4) {
        if (i2 < i3) {
            return i3;
        }
        return i2 > i4 ? i4 : i2;
    }

    public static final void g(Drawable drawable, Drawable drawable2) {
        if (drawable2 == null || drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static final dp5 h(af7 af7Var) {
        return new dp5(new a15(af7Var));
    }

    public static final pre i(Context context, Class cls, String str) {
        if (r5h.X0(str)) {
            ore.p("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        if (!str.equals(":memory:")) {
            return new pre(context, cls, str);
        }
        ore.p("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac A[LOOP:1: B:54:0x00a0->B:57:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b2 A[EDGE_INSN: B:79:0x00b2->B:58:0x00b2 BREAK  A[LOOP:1: B:54:0x00a0->B:57:0x00ac], SYNTHETIC] */
    public static final InetAddress j(int i2, int i3, String str) {
        int i4;
        int i5;
        int iR;
        byte[] bArr = new byte[16];
        int i6 = i2;
        int i7 = 0;
        int i8 = -1;
        int i9 = -1;
        while (i6 < i3) {
            if (i7 == 16) {
                return null;
            }
            int i10 = i6 + 2;
            if (i10 <= i3 && str.startsWith("::", i6)) {
                if (i8 != -1) {
                    return null;
                }
                i7 += 2;
                i8 = i7;
                if (i10 == i3) {
                    break;
                }
                i9 = i10;
                i4 = 0;
                i6 = i9;
                while (i6 < i3) {
                    iR = uqi.r(str.charAt(i6));
                    if (iR != -1) {
                        break;
                        break;
                    }
                    i4 = (i4 << 4) + iR;
                    i6++;
                }
                i5 = i6 - i9;
                return i5 == 0 ? null : null;
            }
            if (i7 != 0) {
                if (!str.startsWith(":", i6)) {
                    if (!str.startsWith(".", i6)) {
                        return null;
                    }
                    int i11 = i7 - 2;
                    int i12 = i11;
                    while (i9 < i3) {
                        if (i12 == 16) {
                            return null;
                        }
                        if (i12 != i11) {
                            if (str.charAt(i9) != '.') {
                                return null;
                            }
                            i9++;
                        }
                        int i13 = 0;
                        int i14 = i9;
                        while (i14 < i3) {
                            char cCharAt = str.charAt(i14);
                            if (cqk.i(cCharAt, 48) < 0 || cqk.i(cCharAt, 57) > 0) {
                                break;
                            }
                            if ((i13 == 0 && i9 != i14) || (i13 = ((i13 * 10) + cCharAt) - 48) > 255) {
                                return null;
                            }
                            i14++;
                        }
                        if (i14 - i9 == 0) {
                            return null;
                        }
                        bArr[i12] = (byte) i13;
                        i12++;
                        i9 = i14;
                    }
                    if (i12 != i7 + 2) {
                        return null;
                    }
                    i7 += 2;
                    break;
                }
                i6++;
            }
            i9 = i6;
            i4 = 0;
            i6 = i9;
            while (i6 < i3) {
                iR = uqi.r(str.charAt(i6));
                if (iR != -1) {
                    break;
                }
                i4 = (i4 << 4) + iR;
                i6++;
            }
            i5 = i6 - i9;
            if (i5 == 0 && i5 <= 4) {
                int i15 = i7 + 1;
                bArr[i7] = (byte) (255 & (i4 >>> 8));
                i7 += 2;
                bArr[i15] = (byte) (i4 & 255);
            }
        }
        if (i7 != 16) {
            if (i8 == -1) {
                return null;
            }
            int i16 = i7 - i8;
            System.arraycopy(bArr, i8, bArr, 16 - i16, i16);
            Arrays.fill(bArr, i8, (16 - i7) + i8, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static hm0 k(String str, boolean z) {
        return new hm0(str.concat(z ? "Dark" : "Light"));
    }

    public static ColorStateList l(Context context, int i2) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        jne jneVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        kne kneVar = new kne(resources, theme);
        synchronized (mne.c) {
            try {
                SparseArray sparseArray = (SparseArray) mne.b.get(kneVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (jneVar = (jne) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (jneVar.b.equals(resources.getConfiguration())) {
                        if (theme != null || jneVar.c != 0) {
                            if (theme == null || jneVar.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = jneVar.a;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = mne.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListA = jx3.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (mne.c) {
            try {
                WeakHashMap weakHashMap = mne.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(kneVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(kneVar, sparseArray2);
                }
                sparseArray2.append(i2, new jne(colorStateListA, kneVar.a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static Context m(Context context) {
        mc9 mc9VarA;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            Object systemService = context.getSystemService("locale");
            mc9VarA = systemService != null ? new mc9(new nc9(u4.j(systemService))) : mc9.b;
        } else {
            mc9VarA = mc9.a(y(context));
        }
        if (i2 > 32 || mc9VarA.c()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        iol.s(configuration, mc9VarA);
        return context.createConfigurationContext(configuration);
    }

    public static Object n(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return q4m.b(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        qr7.d();
        return null;
    }

    public static Executor o(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? go.d(context) : wwl.a(new Handler(context.getMainLooper()));
    }

    public static tg6 p(ga gaVar, fzh fzhVar, long j2, long j3) {
        ezh ezhVar;
        a98 a98VarListIterator = fzhVar.a.listIterator(0);
        while (true) {
            if (!a98VarListIterator.hasNext()) {
                ezhVar = null;
                break;
            }
            ezhVar = (ezh) a98VarListIterator.next();
            if (ezhVar.e() == gaVar.b && ezhVar.f()) {
                break;
            }
        }
        if (ezhVar != null) {
            hyh hyhVarB = ezhVar.b();
            for (ble bleVar : gaVar.c) {
                b87 b87Var = bleVar.a;
                int i2 = hyhVarB.a;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    }
                    if (b87Var.equals(hyhVarB.d[i3])) {
                        break;
                    }
                    i3++;
                }
                if (-1 != i3 && ezhVar.g(i3)) {
                    long jX = vqi.X(j3);
                    if (bleVar instanceof zke) {
                        zke zkeVar = (zke) bleVar;
                        long jN = zkeVar.n(vqi.X(j2), jX);
                        return new tg6(jN, zkeVar.d(jN, jX));
                    }
                    if (bleVar instanceof ale) {
                        return ((ale) bleVar).c() != null ? new tg6(0L, jX) : new tg6(1L, jX);
                    }
                    return new tg6();
                }
            }
        }
        return new tg6();
    }

    public static String q(Context context, int i2) {
        return m(context).getString(i2);
    }

    public static final Drawable r(TextView textView) {
        if (Build.VERSION.SDK_INT >= 29) {
            return textView.getTextCursorDrawable();
        }
        try {
            if (l == null) {
                Field declaredField = TextView.class.getDeclaredField("mEditor");
                declaredField.setAccessible(true);
                l = declaredField;
            }
            Field field = l;
            if (field == null) {
                field = null;
            }
            if (field.get(textView) == null) {
                Method declaredMethod = textView.getClass().getDeclaredMethod("createEditorIfNeeded", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(textView, null);
            }
            if (l == null) {
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                declaredField2.setAccessible(true);
                l = declaredField2;
            }
            Field field2 = l;
            if (field2 == null) {
                field2 = null;
            }
            Object obj = field2.get(textView);
            if (obj != null) {
                if (m == null) {
                    Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
                    declaredField3.setAccessible(true);
                    m = declaredField3;
                }
                Field field3 = m;
                if (field3 == null) {
                    field3 = null;
                }
                Object obj2 = field3.get(obj);
                Object[] objArr = obj2 instanceof Object[] ? (Object[]) obj2 : null;
                if (objArr != null) {
                    Object objB1 = a.b1(objArr);
                    if (objB1 instanceof Drawable) {
                        return (Drawable) objB1;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String s(Context context) {
        String str;
        String str2 = j;
        if (str2 != null) {
            return str2;
        }
        String packageName = context.getPackageName();
        try {
            str = context.getPackageManager().getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (str == null) {
            str = "?";
        }
        StringBuilder sb = new StringBuilder("OneExoPlayer/2.24.0");
        sb.append(" (Linux;Android " + Build.VERSION.RELEASE + ")");
        StringBuilder sb2 = new StringBuilder(" App:PackageName/");
        sb2.append(packageName);
        sb.append(sb2.toString());
        sb.append(" App:Version/".concat(str));
        sb.append(" AndroidXMedia3/1.9.3");
        String string = sb.toString();
        j = string;
        return string;
    }

    public static final String t(br4 br4Var) {
        return qt4.j(br4Var.hashCode(), br4Var.getClass().getName(), "@");
    }

    public static final int u(int i2, int i3) {
        if (i3 == 255) {
            return i2;
        }
        if (i3 == 0) {
            return i2 & 16777215;
        }
        return (i2 & 16777215) | ((((i2 >>> 24) * (i3 + (i3 >> 7))) >> 8) << 24);
    }

    /* JADX WARN: Code duplicated, block: B:259:0x02a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.util.ArrayList] */
    public static ka3 v(fka fkaVar) {
        int iU;
        long j2;
        int i2;
        boolean zL;
        List list;
        long jT;
        long jT2;
        int iR;
        int i3;
        boolean zL2;
        List list2;
        String strX;
        ?? arrayList;
        try {
            iU = ch3.U(fkaVar);
            while (true) {
                list2 = r66.a;
                if (i3 < iU) {
                    try {
                        strX = ch3.X(fkaVar, null);
                    } catch (Throwable th) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                        Iterator it = fjf.a.iterator();
                        while (it.hasNext()) {
                            AccountInitializer accountInitializer = ((n6) it.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th);
                                accountInitializer.d().i().g().a(null, th);
                            } catch (Throwable th2) {
                                gm0.V("Payload", "failed to collect exception", th2);
                            }
                        }
                        int iD = qt4.D(pye.a);
                        if (iD != 0) {
                            if (iD != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th;
                        }
                        strX = null;
                    }
                    if (strX != null) {
                        try {
                            switch (strX.hashCode()) {
                                case -1361631597:
                                    if (!strX.equals(ApiProtocol.PARAM_CHAT_ID)) {
                                        try {
                                            fkaVar.x();
                                        } catch (Throwable th3) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                                            Iterator it2 = fjf.a.iterator();
                                            while (it2.hasNext()) {
                                                AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th3);
                                                    accountInitializer2.d().i().g().a(null, th3);
                                                } catch (Throwable th4) {
                                                    gm0.V("Payload", "failed to collect exception", th4);
                                                }
                                            }
                                            int iD2 = qt4.D(pye.a);
                                            if (iD2 != 0) {
                                                if (iD2 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th3;
                                            }
                                        }
                                    } else {
                                        try {
                                            jT = ch3.T(fkaVar, 0L);
                                        } catch (Throwable th5) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                                            Iterator it3 = fjf.a.iterator();
                                            while (it3.hasNext()) {
                                                AccountInitializer accountInitializer3 = ((n6) it3.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th5);
                                                    accountInitializer3.d().i().g().a(null, th5);
                                                } catch (Throwable th6) {
                                                    gm0.V("Payload", "failed to collect exception", th6);
                                                }
                                            }
                                            int iD3 = qt4.D(pye.a);
                                            if (iD3 != 0) {
                                                if (iD3 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th5;
                                            }
                                            jT = 0;
                                        }
                                    }
                                    break;
                                case -1163745329:
                                    if (strX.equals("reactionIds")) {
                                        try {
                                            if (fkaVar.y().a() == 7) {
                                                arrayList = new ArrayList();
                                                int iT0 = fkaVar.t0();
                                                for (int i4 = 0; i4 < iT0; i4++) {
                                                    arrayList.add(fkaVar.S0());
                                                }
                                            } else {
                                                fkaVar.x();
                                                arrayList = 0;
                                            }
                                            if (arrayList == 0) {
                                                arrayList = list2;
                                            }
                                        } catch (Throwable th7) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                                            Iterator it4 = fjf.a.iterator();
                                            while (it4.hasNext()) {
                                                AccountInitializer accountInitializer4 = ((n6) it4.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th7);
                                                    accountInitializer4.d().i().g().a(null, th7);
                                                } catch (Throwable th8) {
                                                    gm0.V("Payload", "failed to collect exception", th8);
                                                }
                                            }
                                            int iD4 = qt4.D(pye.a);
                                            if (iD4 != 0) {
                                                if (iD4 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th7;
                                            }
                                        }
                                        list = (List) arrayList;
                                    } else {
                                        fkaVar.x();
                                    }
                                    break;
                                case -748916528:
                                    if (!strX.equals("isActive")) {
                                        fkaVar.x();
                                    } else {
                                        try {
                                            zL = ch3.L(fkaVar);
                                        } catch (Throwable th9) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                                            Iterator it5 = fjf.a.iterator();
                                            while (it5.hasNext()) {
                                                AccountInitializer accountInitializer5 = ((n6) it5.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th9);
                                                    accountInitializer5.d().i().g().a(null, th9);
                                                } catch (Throwable th10) {
                                                    gm0.V("Payload", "failed to collect exception", th10);
                                                }
                                            }
                                            int iD5 = qt4.D(pye.a);
                                            if (iD5 != 0) {
                                                if (iD5 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th9;
                                            }
                                            zL = false;
                                        }
                                    }
                                    break;
                                case -295931082:
                                    if (!strX.equals("updateTime")) {
                                        fkaVar.x();
                                    } else {
                                        try {
                                            jT2 = ch3.T(fkaVar, j2);
                                        } catch (Throwable th11) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                                            Iterator it6 = fjf.a.iterator();
                                            while (it6.hasNext()) {
                                                AccountInitializer accountInitializer6 = ((n6) it6.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th11);
                                                    accountInitializer6.d().i().g().a(null, th11);
                                                } catch (Throwable th12) {
                                                    gm0.V("Payload", "failed to collect exception", th12);
                                                }
                                            }
                                            int iD6 = qt4.D(pye.a);
                                            if (iD6 != 0) {
                                                if (iD6 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th11;
                                            }
                                            jT2 = j2;
                                        }
                                    }
                                    break;
                                case 90259644:
                                    if (!strX.equals("included")) {
                                        fkaVar.x();
                                    } else {
                                        try {
                                            zL2 = ch3.L(fkaVar);
                                        } catch (Throwable th13) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th13);
                                            Iterator it7 = fjf.a.iterator();
                                            while (it7.hasNext()) {
                                                AccountInitializer accountInitializer7 = ((n6) it7.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th13);
                                                    accountInitializer7.d().i().g().a(null, th13);
                                                } catch (Throwable th14) {
                                                    gm0.V("Payload", "failed to collect exception", th14);
                                                }
                                            }
                                            int iD7 = qt4.D(pye.a);
                                            if (iD7 != 0) {
                                                if (iD7 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th13;
                                            }
                                            zL2 = false;
                                        }
                                    }
                                    break;
                                case 94851343:
                                    if (!strX.equals("count")) {
                                        fkaVar.x();
                                    } else {
                                        try {
                                            iR = ch3.R(fkaVar, i2);
                                        } catch (Throwable th15) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th15);
                                            Iterator it8 = fjf.a.iterator();
                                            while (it8.hasNext()) {
                                                AccountInitializer accountInitializer8 = ((n6) it8.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th15);
                                                    accountInitializer8.d().i().g().a(null, th15);
                                                } catch (Throwable th16) {
                                                    gm0.V("Payload", "failed to collect exception", th16);
                                                }
                                            }
                                            int iD8 = qt4.D(pye.a);
                                            if (iD8 != 0) {
                                                if (iD8 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th15;
                                            }
                                            iR = i2;
                                        }
                                    }
                                    break;
                                default:
                                    fkaVar.x();
                                    break;
                            }
                        } catch (Throwable th17) {
                            try {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th17);
                                Iterator it9 = fjf.a.iterator();
                                while (it9.hasNext()) {
                                    AccountInitializer accountInitializer9 = ((n6) it9.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th17);
                                        accountInitializer9.d().i().g().a(null, th17);
                                    } catch (Throwable th18) {
                                        gm0.V("Payload", "failed to collect exception", th18);
                                    }
                                }
                                int iD9 = qt4.D(pye.a);
                                if (iD9 != 0) {
                                    if (iD9 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th17;
                                }
                                i3++;
                                j2 = 0;
                                i2 = 8;
                            } catch (Throwable th19) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th19);
                                Iterator it10 = fjf.a.iterator();
                                while (it10.hasNext()) {
                                    AccountInitializer accountInitializer10 = ((n6) it10.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th19);
                                        accountInitializer10.d().i().g().a(null, th19);
                                    } catch (Throwable th20) {
                                        gm0.V("Payload", "failed to collect exception", th20);
                                    }
                                }
                                int iD10 = qt4.D(pye.a);
                                if (iD10 != 0) {
                                    if (iD10 == 1) {
                                        throw th19;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                        }
                    }
                    i3++;
                    j2 = 0;
                    i2 = 8;
                }
            }
        } catch (Throwable th21) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th21);
            Iterator it11 = fjf.a.iterator();
            while (it11.hasNext()) {
                AccountInitializer accountInitializer11 = ((n6) it11.next()).a;
                try {
                    gm0.V("Payload", "error while parse payload", th21);
                    accountInitializer11.d().i().g().a(null, th21);
                } catch (Throwable th22) {
                    gm0.V("Payload", "failed to collect exception", th22);
                }
            }
            int iD11 = qt4.D(pye.a);
            if (iD11 != 0) {
                if (iD11 == 1) {
                    throw th21;
                }
                ore.o();
                return null;
            }
            iU = 0;
        }
        j2 = 0;
        i2 = 8;
        zL = true;
        list = null;
        jT = 0;
        jT2 = 0;
        iR = 8;
        i3 = 0;
        zL2 = false;
        List list3 = list;
        if (jT2 != 0) {
            list2 = list3;
        }
        return new ka3(jT, zL, jT2, iR, zL2, list2);
    }

    public static final void w(ij4 ij4Var, long j2) {
        yab.i0(ij4Var.b, null, 0, new gj4(ij4Var, j2, null, 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void x(Context context, String str) {
        synchronized (a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Exception e2) {
                        Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e2);
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                    }
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused3) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
  0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static String y(Context context) {
        String attributeValue;
        synchronized (a) {
            attributeValue = "";
            try {
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    try {
                        try {
                            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                            xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                            int depth = xmlPullParserNewPullParser.getDepth();
                            while (true) {
                                int next = xmlPullParserNewPullParser.next();
                                if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                    if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                        attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (IOException | XmlPullParserException unused2) {
                            Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                            }
                        }
                        if (attributeValue.isEmpty()) {
                            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        }
                    } catch (Throwable th) {
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (FileNotFoundException unused4) {
                    return "";
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return attributeValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (d(r3, r6) == 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.Intent z(android.content.Context r3, android.content.BroadcastReceiver r4, android.content.IntentFilter r5, java.lang.String r6, android.os.Handler r7, int r8) {
        /*
            r0 = r8 & 2
            r1 = 0
            if (r0 != 0) goto L10
            r2 = r8 & 4
            if (r2 == 0) goto La
            goto L10
        La:
            java.lang.String r3 = "One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required"
            defpackage.ore.p(r3)
            return r1
        L10:
            if (r0 == 0) goto L1d
            r0 = r8 & 4
            if (r0 != 0) goto L17
            goto L1d
        L17:
            java.lang.String r3 = "Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED"
            defpackage.ore.p(r3)
            return r1
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r0 < r2) goto L28
            android.content.Intent r3 = defpackage.lpl.b(r3, r4, r5, r6, r7, r8)
            return r3
        L28:
            r8 = r8 & 4
            if (r8 == 0) goto L7c
            if (r6 != 0) goto L7c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r8 = r3.getApplicationContext()
            java.lang.String r8 = r8.getPackageName()
            r6.append(r8)
            java.lang.String r8 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            int r2 = d(r3, r6)
            if (r2 == 0) goto L77
            r2 = 29
            if (r0 < r2) goto L6b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = defpackage.o4.f(r3)
            r6.append(r0)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            int r8 = d(r3, r6)
            if (r8 != 0) goto L6b
            goto L77
        L6b:
            java.lang.String r3 = "Permission "
            java.lang.String r4 = " is required by your application to receive broadcasts, please add it to your manifest"
            java.lang.String r3 = defpackage.c0a.o(r3, r6, r4)
            defpackage.ore.q(r3)
            return r1
        L77:
            android.content.Intent r3 = r3.registerReceiver(r4, r5, r6, r7)
            return r3
        L7c:
            r8 = 0
            android.content.Intent r3 = r3.registerReceiver(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np4.z(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter, java.lang.String, android.os.Handler, int):android.content.Intent");
    }
}
