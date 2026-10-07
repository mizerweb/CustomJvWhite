package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class lie {
    private final Map a = new HashMap();

    public static class a {
        private final Class a;
        private final xwd b;

        public <RemoteT extends fie> a(Class<RemoteT> cls, xwd xwdVar) {
            this.a = cls;
            this.b = xwdVar;
        }

        public final xwd a() {
            return this.b;
        }

        public final Class b() {
            return this.a;
        }
    }

    public lie(Set<a> set) {
        for (a aVar : set) {
            this.a.put(aVar.b(), aVar.a());
        }
    }

    public static synchronized lie d() {
        return (lie) j0b.c().a(lie.class);
    }

    private final mie f(Class cls) {
        xwd xwdVar = (xwd) this.a.get(cls);
        yab.s(xwdVar);
        return (mie) xwdVar.get();
    }

    public Task a(fie fieVar) {
        yab.t(fieVar, "RemoteModel cannot be null");
        return f(fieVar.getClass()).c(fieVar);
    }

    public Task b(fie fieVar, fq5 fq5Var) {
        yab.t(fieVar, "RemoteModel cannot be null");
        yab.t(fq5Var, "DownloadConditions cannot be null");
        return this.a.containsKey(fieVar.getClass()) ? f(fieVar.getClass()).d(fieVar, fq5Var) : gwl.d(new MlKitException(c0a.o("Feature model '", fieVar.getClass().getSimpleName(), "' doesn't have a corresponding modelmanager registered."), 13));
    }

    public <T extends fie> Task c(Class<T> cls) {
        xwd xwdVar = (xwd) this.a.get(cls);
        yab.s(xwdVar);
        return ((mie) xwdVar.get()).a();
    }

    public Task e(fie fieVar) {
        yab.t(fieVar, "RemoteModel cannot be null");
        return f(fieVar.getClass()).b(fieVar);
    }
}
