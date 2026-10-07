package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h77 {
    public static final mj9 a = new mj9(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final h6g d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ov7(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new h6g(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((c77) list.get(i2)).e);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static g77 b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceG;
        mj9 mj9Var = a;
        cqk.f("getFontSync");
        try {
            Typeface typeface = (Typeface) mj9Var.c(str);
            if (typeface != null) {
                g77 g77Var = new g77(typeface);
                Trace.endSection();
                return g77Var;
            }
            try {
                we5 we5VarA = a77.a(context, list);
                List list2 = we5VarA.b;
                int i3 = we5VarA.a;
                if (i3 == 0) {
                    m77[] m77VarArr = (m77[]) list2.get(0);
                    if (m77VarArr == null || m77VarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = m77VarArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = m77VarArr[i4].e;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    g77 g77Var2 = new g77(i2);
                    Trace.endSection();
                    return g77Var2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    m77[] m77VarArr2 = (m77[]) list2.get(0);
                    f83 f83Var = h9i.a;
                    cqk.f("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceG = h9i.a.g(context, m77VarArr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    f83 f83Var2 = h9i.a;
                    cqk.f("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceG = h9i.a.h(i, context, list2);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceG == null) {
                    g77 g77Var3 = new g77(-3);
                    Trace.endSection();
                    return g77Var3;
                }
                mj9Var.d(str, typefaceG);
                g77 g77Var4 = new g77(typefaceG);
                Trace.endSection();
                return g77Var4;
            } catch (PackageManager.NameNotFoundException unused) {
                g77 g77Var5 = new g77(-1);
                Trace.endSection();
                return g77Var5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
