package defpackage;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class j0b {
    private static final Object b = new Object();
    private static j0b c;
    private r74 a;

    private j0b() {
    }

    public static j0b c() {
        j0b j0bVar;
        synchronized (b) {
            yab.u("MlKitContext has not been initialized", c != null);
            j0bVar = c;
            yab.s(j0bVar);
        }
        return j0bVar;
    }

    public static j0b d(Context context, List<ComponentRegistrar> list) {
        j0b j0bVar;
        synchronized (b) {
            try {
                yab.u("MlKitContext is already initialized", c == null);
                j0b j0bVar2 = new j0b();
                c = j0bVar2;
                Context contextJ = j(context);
                HashMap map = new HashMap();
                for (ComponentRegistrar componentRegistrar : list) {
                    map.put(componentRegistrar.getClass(), componentRegistrar);
                }
                ArrayList arrayList = new ArrayList(map.values());
                c20 c20Var = vjh.a;
                v64[] v64VarArr = {v64.c(contextJ, Context.class, new Class[0]), v64.c(j0bVar2, j0b.class, new Class[0])};
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new o74((ComponentRegistrar) it.next(), 0));
                }
                r74 r74Var = new r74(c20Var, arrayList2, Arrays.asList(v64VarArr), n74.W);
                j0bVar2.a = r74Var;
                r74Var.c(true);
                j0bVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j0bVar;
    }

    public static j0b e(Context context) {
        j0b j0bVarH;
        synchronized (b) {
            j0bVarH = c;
            if (j0bVarH == null) {
                j0bVarH = h(context);
            }
        }
        return j0bVarH;
    }

    public static j0b f(Context context, List<ComponentRegistrar> list) {
        j0b j0bVarD;
        synchronized (b) {
            j0bVarD = c;
            if (j0bVarD == null) {
                j0bVarD = d(context, list);
            }
        }
        return j0bVarD;
    }

    public static j0b g(Context context, Executor executor) {
        j0b j0bVarI;
        synchronized (b) {
            j0bVarI = c;
            if (j0bVarI == null) {
                j0bVarI = i(context, executor);
            }
        }
        return j0bVarI;
    }

    public static j0b h(Context context) {
        j0b j0bVarI;
        synchronized (b) {
            j0bVarI = i(context, vjh.a);
        }
        return j0bVarI;
    }

    public static j0b i(Context context, Executor executor) {
        j0b j0bVar;
        synchronized (b) {
            yab.u("MlKitContext is already initialized", c == null);
            j0b j0bVar2 = new j0b();
            c = j0bVar2;
            Context contextJ = j(context);
            ArrayList arrayListR = new v2a(contextJ, 14, new pgg(MlKitComponentDiscoveryService.class)).r();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            c cVar = n74.W;
            arrayList.addAll(arrayListR);
            arrayList2.add(v64.c(contextJ, Context.class, new Class[0]));
            arrayList2.add(v64.c(j0bVar2, j0b.class, new Class[0]));
            r74 r74Var = new r74(executor, arrayList, arrayList2, cVar);
            j0bVar2.a = r74Var;
            r74Var.c(true);
            j0bVar = c;
        }
        return j0bVar;
    }

    private static Context j(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public <T> T a(Class<T> cls) {
        yab.u("MlKitContext has been deleted", c == this);
        yab.s(this.a);
        return (T) this.a.a(cls);
    }

    public Context b() {
        return (Context) a(Context.class);
    }
}
