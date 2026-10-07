package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class syl {
    public static final uzh a(tzh tzhVar) {
        nu3 ku3Var;
        rzh rzhVar = tzhVar.a;
        szh szhVar = new szh(rzhVar.a, rzhVar.b);
        int i = tzhVar.b;
        Range range = tzhVar.c;
        boolean z = tzhVar.d;
        mu3 mu3Var = tzhVar.e;
        if (mu3Var.equals(lu3.a)) {
            ku3Var = ou7.f;
        } else {
            if (!(mu3Var instanceof ju3)) {
                ore.o();
                return null;
            }
            ku3Var = new ku3(((ju3) mu3Var).a);
        }
        return new uzh(szhVar, i, range, z, ku3Var, tzhVar.f);
    }

    public static Typeface b(Context context, List list, int i, boolean z, int i2, Handler handler, g9i g9iVar) {
        gx0 gx0Var = new gx0(handler);
        uvc uvcVar = new uvc(g9iVar, 8, gx0Var);
        if (!z) {
            String strA = h77.a(i, list);
            Typeface typeface = (Typeface) h77.a.c(strA);
            if (typeface != null) {
                gx0Var.execute(new og7(g9iVar, 3, typeface));
                return typeface;
            }
            ux5 ux5Var = new ux5(1, uvcVar);
            synchronized (h77.c) {
                try {
                    h6g h6gVar = h77.d;
                    ArrayList arrayList = (ArrayList) h6gVar.get(strA);
                    if (arrayList != null) {
                        arrayList.add(ux5Var);
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ux5Var);
                    h6gVar.put(strA, arrayList2);
                    f77 f77Var = new f77(strA, context, list, i, 1);
                    ThreadPoolExecutor threadPoolExecutor = h77.b;
                    ux5 ux5Var2 = new ux5(2, strA);
                    Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                    b1j b1jVar = new b1j();
                    b1jVar.b = f77Var;
                    b1jVar.c = ux5Var2;
                    b1jVar.d = handler2;
                    threadPoolExecutor.execute(b1jVar);
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (list.size() > 1) {
            ore.p("Fallbacks with blocking fetches are not supported for performance reasons");
            return null;
        }
        c77 c77Var = (c77) list.get(0);
        mj9 mj9Var = h77.a;
        ArrayList arrayList3 = new ArrayList(1);
        Object obj = new Object[]{c77Var}[0];
        Objects.requireNonNull(obj);
        arrayList3.add(obj);
        String strA2 = h77.a(i, Collections.unmodifiableList(arrayList3));
        Typeface typeface2 = (Typeface) h77.a.c(strA2);
        if (typeface2 != null) {
            gx0Var.execute(new og7(g9iVar, 3, typeface2));
            return typeface2;
        }
        if (i2 == -1) {
            ArrayList arrayList4 = new ArrayList(1);
            Object obj2 = new Object[]{c77Var}[0];
            Objects.requireNonNull(obj2);
            arrayList4.add(obj2);
            g77 g77VarB = h77.b(strA2, context, Collections.unmodifiableList(arrayList4), i);
            uvcVar.l(g77VarB);
            return g77VarB.a;
        }
        try {
            try {
                try {
                    g77 g77Var = (g77) h77.b.submit(new f77(strA2, context, c77Var, i, 0)).get(i2, TimeUnit.MILLISECONDS);
                    uvcVar.l(g77Var);
                    return g77Var.a;
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                } catch (TimeoutException unused) {
                    throw new InterruptedException("timeout");
                }
            } catch (InterruptedException e2) {
                throw e2;
            }
        } catch (InterruptedException unused2) {
            ((gx0) uvcVar.c).execute(new v72((g9i) uvcVar.b, -3, 0));
            return null;
        }
    }
}
