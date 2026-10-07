package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xy8 {
    public static final Logger a;
    public static final eq4 b;

    static {
        ArrayList arrayList;
        eq4 c5hVar = nqh.a;
        a = Logger.getLogger(xy8.class.getName());
        AtomicReference atomicReference = new AtomicReference();
        String property = System.getProperty("io.opentelemetry.context.contextStorageProvider", "");
        if (!"default".equals(property)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ServiceLoader.load(fq4.class).iterator();
            if (it.hasNext()) {
                throw qt4.h(it);
            }
            if (!arrayList2.isEmpty()) {
                if (!property.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    if (it2.hasNext()) {
                        throw qt4.h(it2);
                    }
                    atomicReference.set(new IllegalStateException("io.opentelemetry.context.ContextStorageProvider property set but no matching class could be found, requested: " + property + " but found providers: " + arrayList2));
                } else if (arrayList2.size() == 1) {
                    arrayList2.get(0).getClass();
                    ore.m();
                    return;
                } else {
                    atomicReference.set(new IllegalStateException("Found multiple ContextStorageProvider. Set the io.opentelemetry.context.ContextStorageProvider property to the fully qualified class name of the provider to use. Falling back to default ContextStorage. Found providers: " + arrayList2));
                }
            }
        }
        if (Boolean.getBoolean("io.opentelemetry.context.enableStrictContext")) {
            c5hVar = new c5h();
        }
        synchronized (gq4.b) {
            arrayList = gq4.a;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            c5hVar = (eq4) ((Function) it3.next()).apply(c5hVar);
        }
        b = c5hVar;
        synchronized (gq4.b) {
        }
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            a.log(Level.WARNING, "ContextStorageProvider initialized failed. Using default", th);
        }
    }
}
