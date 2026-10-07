package defpackage;

import android.net.Uri;
import android.util.LruCache;
import java.io.File;
import org.apache.http.cookie.ClientCookie;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class wa0 {
    public static final LruCache c = new LruCache(1000);
    public final ny8 a;
    public final ny8 b;

    public wa0(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public static void c(String str) {
        c.remove(str);
    }

    public final ua0 a(String str) {
        Object poeVar;
        boolean zBooleanValue;
        Object poeVar2;
        Object poeVar3;
        Object poeVar4;
        Long lC0;
        LruCache lruCache = c;
        ua0 ua0Var = (ua0) lruCache.get(str);
        if (ua0Var == null) {
            return null;
        }
        String str2 = ua0Var.a;
        Uri uri = Uri.parse(str2);
        String scheme = uri.getScheme();
        boolean zBooleanValue2 = true;
        if (scheme == null || scheme.length() == 0 || cqk.d(uri.getScheme(), "file")) {
            try {
                String path = uri.getPath();
                if (path == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                File file = new File(path);
                try {
                    poeVar2 = Boolean.valueOf(file.exists() && file.canRead());
                } catch (Throwable th) {
                    poeVar2 = new poe(th);
                }
                Object obj = Boolean.FALSE;
                if (poeVar2 instanceof poe) {
                    poeVar2 = obj;
                }
                poeVar = Boolean.valueOf(!((Boolean) poeVar2).booleanValue());
            } catch (Throwable th2) {
                poeVar = new poe(th2);
            }
            Object obj2 = Boolean.TRUE;
            if (poeVar instanceof poe) {
                poeVar = obj2;
            }
            zBooleanValue = ((Boolean) poeVar).booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            gm0.Y(wa0.class.getName(), "Can't return local audio url because file not exist");
            lruCache.remove(str);
            return null;
        }
        long jMax = ua0Var.c + Math.max(((Number) ((f5d) ((wo6) this.b.getValue())).a.P2.a(e5d.S6[198]).i()).longValue(), 60000L);
        ny8 ny8Var = this.a;
        if (jMax > ((s7f) ((et3) ny8Var.getValue())).f()) {
            try {
                poeVar3 = Uri.parse(str2);
            } catch (Throwable th3) {
                poeVar3 = new poe(th3);
            }
            if (poeVar3 instanceof poe) {
                poeVar3 = null;
            }
            Uri uri2 = (Uri) poeVar3;
            if (uri2 != null && !uri2.equals(Uri.EMPTY)) {
                try {
                    String queryParameter = uri2.getQueryParameter(ClientCookie.EXPIRES_ATTR);
                    poeVar4 = Boolean.valueOf(((s7f) ((et3) ny8Var.getValue())).f() >= ((queryParameter == null || (lC0 = y5h.C0(queryParameter)) == null) ? BuildConfig.MAX_TIME_TO_UPLOAD : lC0.longValue()));
                } catch (Throwable th4) {
                    poeVar4 = new poe(th4);
                }
                Object obj3 = Boolean.FALSE;
                if (poeVar4 instanceof poe) {
                    poeVar4 = obj3;
                }
                zBooleanValue2 = ((Boolean) poeVar4).booleanValue();
            }
        }
        if (!zBooleanValue2) {
            return ua0Var;
        }
        lruCache.remove(str);
        return null;
    }

    public final void b(String str, String str2, va0 va0Var) {
        c.put(str, new ua0(str2, va0Var, ((s7f) ((et3) this.a.getValue())).f()));
    }
}
