package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes2.dex */
public class i9i extends f83 {
    public static Class j;
    public static Constructor k;
    public static Method l;
    public static Method m;
    public static boolean n;
    public final Class c;
    public final Constructor d;
    public final Method e;
    public final Method f;
    public final Method g;
    public final Method h;
    public final Method i;

    public i9i() throws NoSuchMethodException {
        Method methodU;
        Constructor<?> constructor;
        Method methodT;
        Method method;
        Method method2;
        Method method3;
        super(7);
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodT = t(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodU = u(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodU = null;
            constructor = null;
            methodT = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.c = cls;
        this.d = constructor;
        this.e = methodT;
        this.f = method;
        this.g = method2;
        this.h = method3;
        this.i = methodU;
    }

    public static boolean p(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        s();
        try {
            return ((Boolean) l.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            qr7.o(e);
            return false;
        }
    }

    public static void s() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (n) {
            return;
        }
        n = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        k = constructor;
        j = cls;
        l = method2;
        m = method;
    }

    public static Method t(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // defpackage.f83
    public final Typeface f(Context context, j77 j77Var, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        k77[] k77VarArr = j77Var.a;
        Method method = this.e;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i2 = 0;
        if (method == null) {
            s();
            try {
                Object objNewInstance2 = k.newInstance(null);
                for (k77 k77Var : k77VarArr) {
                    File fileC = b0m.c(context);
                    if (fileC != null) {
                        try {
                            if (!b0m.a(fileC, resources, k77Var.f)) {
                                fileC.delete();
                                return null;
                            }
                            if (!p(objNewInstance2, fileC.getPath(), k77Var.b, k77Var.c)) {
                                return null;
                            }
                            fileC.delete();
                        } catch (RuntimeException unused) {
                            return null;
                        } finally {
                            fileC.delete();
                        }
                    }
                }
                s();
                try {
                    Object objNewInstance3 = Array.newInstance((Class<?>) j, 1);
                    Array.set(objNewInstance3, 0, objNewInstance2);
                    return (Typeface) m.invoke(null, objNewInstance3);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    qr7.o(e);
                    return null;
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                qr7.o(e2);
                return null;
            }
        }
        try {
            objNewInstance = this.d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int length = k77VarArr.length;
            while (i2 < length) {
                k77 k77Var2 = k77VarArr[i2];
                i9i i9iVar = this;
                Context context2 = context;
                if (i9iVar.o(context2, objNewInstance, k77Var2.a, k77Var2.e, k77Var2.b, k77Var2.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(k77Var2.d))) {
                    i2++;
                    this = i9iVar;
                    context = context2;
                } else {
                    try {
                        i9iVar.h.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                    }
                }
            }
            i9i i9iVar2 = this;
            if (i9iVar2.r(objNewInstance)) {
                return i9iVar2.q(objNewInstance);
            }
        }
        return null;
    }

    @Override // defpackage.f83
    public final Typeface g(Context context, m77[] m77VarArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceQ;
        boolean zBooleanValue;
        if (m77VarArr.length >= 1) {
            Method method = this.e;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (m77 m77Var : m77VarArr) {
                        if (m77Var.e == 0) {
                            Uri uri = m77Var.a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, b0m.d(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.d.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = m77VarArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.h;
                            if (i2 >= length) {
                                if (!z) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!r(objNewInstance) || (typefaceQ = q(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceQ, i);
                            }
                            m77 m77Var2 = m77VarArr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(m77Var2.a);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.f.invoke(objNewInstance, byteBuffer, Integer.valueOf(m77Var2.b), null, Integer.valueOf(m77Var2.c), Integer.valueOf(m77Var2.d ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z = true;
                            }
                            i2++;
                            z = z;
                        }
                    }
                } else {
                    int i3 = (i & 1) == 0 ? HttpStatus.SC_BAD_REQUEST : 700;
                    boolean z2 = (i & 2) != 0;
                    int i4 = Integer.MAX_VALUE;
                    m77 m77Var3 = null;
                    for (m77 m77Var4 : m77VarArr) {
                        int iAbs = (Math.abs(m77Var4.c - i3) * 2) + (m77Var4.d == z2 ? 0 : 1);
                        if (m77Var3 == null || i4 > iAbs) {
                            m77Var3 = m77Var4;
                            i4 = iAbs;
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(m77Var3.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(m77Var3.c).setItalic(m77Var3.d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.f83
    public final Typeface i(Context context, Resources resources, int i, String str) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.e;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.d.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!o(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.h.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (r(objNewInstance)) {
                    return q(objNewInstance);
                }
            }
        } else {
            File fileC = b0m.c(context);
            if (fileC != null) {
                try {
                    if (b0m.a(fileC, resources, i)) {
                        return Typeface.createFromFile(fileC.getPath());
                    }
                    return null;
                } catch (RuntimeException unused3) {
                    return null;
                } finally {
                    fileC.delete();
                }
            }
        }
        return null;
    }

    @Override // defpackage.f83
    public Typeface j(Context context, Typeface typeface, int i) {
        Typeface typefaceA;
        Typeface typefaceB;
        Typeface typefaceA2 = null;
        try {
            typefaceA = bvj.a(typeface, i);
        } catch (RuntimeException unused) {
            typefaceA = null;
        }
        if (typefaceA != null) {
            return typefaceA;
        }
        try {
            typefaceB = avj.b(typeface, i);
        } catch (RuntimeException unused2) {
            typefaceB = null;
        }
        if (typefaceB != null) {
            return typefaceB;
        }
        try {
            typefaceA2 = zuj.a(this, context, typeface, i);
        } catch (RuntimeException unused3) {
        }
        if (typefaceA2 != null) {
            typeface = typefaceA2;
        }
        return typeface;
    }

    public final boolean o(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.e.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface q(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.c, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.i.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean r(Object obj) {
        try {
            return ((Boolean) this.g.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method u(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
