package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public abstract class t51 {
    public final ConcurrentHashMap a;
    public final ConcurrentHashMap b;
    public final String c;
    public final lhb d;
    public final khb e;
    public final r51 f;
    public final r51 g;
    public final ConcurrentHashMap h;

    public t51() {
        lhb lhbVar = lhb.n;
        khb khbVar = khb.g;
        this.a = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
        this.f = new r51(0);
        this.g = new r51(1);
        this.h = new ConcurrentHashMap();
        this.d = lhbVar;
        this.c = "default";
        this.e = khbVar;
    }

    public static void a(Object obj, jc6 jc6Var) {
        try {
            jc6Var.a(obj);
        } catch (InvocationTargetException e) {
            e("Could not dispatch event: " + obj.getClass() + " to handler " + jc6Var, e);
            throw null;
        }
    }

    public static void b(jc6 jc6Var, uc6 uc6Var) {
        try {
            Object objA = uc6Var.a();
            if (objA == null) {
                return;
            }
            a(objA, jc6Var);
        } catch (InvocationTargetException e) {
            e("Producer " + uc6Var + " threw an exception.", e);
            throw null;
        }
    }

    public static void e(String str, InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        if (cause != null) {
            StringBuilder sbZ = zo5.z(str, ": ");
            sbZ.append(cause.getMessage());
            throw new RuntimeException(sbZ.toString(), cause);
        }
        StringBuilder sbZ2 = zo5.z(str, ": ");
        sbZ2.append(invocationTargetException.getMessage());
        throw new RuntimeException(sbZ2.toString(), invocationTargetException);
    }

    public void c(Object obj) {
        r51 r51Var;
        xxe xxeVar = (xxe) this;
        this.d.getClass();
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = this.h;
        Set set = (Set) concurrentHashMap.get(cls);
        boolean z = false;
        if (set == null) {
            LinkedList linkedList = new LinkedList();
            HashSet hashSet = new HashSet();
            linkedList.add(cls);
            while (!linkedList.isEmpty()) {
                Class cls2 = (Class) linkedList.remove(0);
                hashSet.add(cls2);
                Class superclass = cls2.getSuperclass();
                if (superclass != null) {
                    linkedList.add(superclass);
                }
            }
            set = (Set) concurrentHashMap.putIfAbsent(cls, hashSet);
            if (set == null) {
                set = hashSet;
            }
        }
        Iterator it = set.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            r51Var = this.f;
            if (!zHasNext) {
                break;
            }
            Set set2 = (Set) this.a.get((Class) it.next());
            if (set2 != null && !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    ((ConcurrentLinkedQueue) r51Var.get()).offer(new s51(obj, (jc6) it2.next()));
                }
                z = true;
            }
        }
        if (!z && !(obj instanceof p45)) {
            c(new p45(xxeVar, obj));
        }
        r51 r51Var2 = this.g;
        if (((Boolean) r51Var2.get()).booleanValue()) {
            return;
        }
        r51Var2.set(Boolean.TRUE);
        while (true) {
            try {
                s51 s51Var = (s51) ((ConcurrentLinkedQueue) r51Var.get()).poll();
                if (s51Var == null) {
                    return;
                }
                jc6 jc6Var = s51Var.b;
                if (jc6Var.d) {
                    a(s51Var.a, jc6Var);
                }
            } finally {
                r51Var2.set(Boolean.FALSE);
            }
        }
    }

    public void d(Object obj) {
        if (obj == null) {
            ore.n("Object to register must not be null.");
            return;
        }
        this.d.getClass();
        khb khbVar = this.e;
        HashMap mapO = khbVar.o(obj);
        Iterator it = mapO.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ConcurrentHashMap concurrentHashMap = this.b;
            ConcurrentHashMap concurrentHashMap2 = this.a;
            if (!zHasNext) {
                HashMap mapP = khbVar.p(obj);
                for (Class cls : mapP.keySet()) {
                    Set copyOnWriteArraySet = (Set) concurrentHashMap2.get(cls);
                    if (copyOnWriteArraySet == null) {
                        copyOnWriteArraySet = new CopyOnWriteArraySet();
                        Set set = (Set) concurrentHashMap2.putIfAbsent(cls, copyOnWriteArraySet);
                        if (set != null) {
                            copyOnWriteArraySet = set;
                        }
                    }
                    if (!copyOnWriteArraySet.addAll((Set) mapP.get(cls))) {
                        ore.p("Object already registered.");
                        return;
                    }
                }
                for (Map.Entry entry : mapP.entrySet()) {
                    uc6 uc6Var = (uc6) concurrentHashMap.get((Class) entry.getKey());
                    if (uc6Var != null && uc6Var.d) {
                        for (jc6 jc6Var : (Set) entry.getValue()) {
                            if (!uc6Var.d) {
                                break;
                            } else if (jc6Var.d) {
                                b(jc6Var, uc6Var);
                            }
                        }
                    }
                }
                return;
            }
            Class cls2 = (Class) it.next();
            uc6 uc6Var2 = (uc6) mapO.get(cls2);
            uc6 uc6Var3 = (uc6) concurrentHashMap.putIfAbsent(cls2, uc6Var2);
            if (uc6Var3 != null) {
                StringBuilder sb = new StringBuilder("Producer method for type ");
                sb.append(cls2);
                sb.append(" found on type ");
                sb.append(uc6Var2.a.getClass());
                Class<?> cls3 = uc6Var3.a.getClass();
                sb.append(", but already registered by type ");
                sb.append(cls3);
                sb.append(".");
                throw new IllegalArgumentException(sb.toString());
            }
            Set set2 = (Set) concurrentHashMap2.get(cls2);
            if (set2 != null && !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    b((jc6) it2.next(), uc6Var2);
                }
            }
        }
    }

    public void f(Object obj) {
        if (obj == null) {
            ore.n("Object to unregister must not be null.");
            return;
        }
        this.d.getClass();
        khb khbVar = this.e;
        for (Map.Entry entry : khbVar.o(obj).entrySet()) {
            Class cls = (Class) entry.getKey();
            ConcurrentHashMap concurrentHashMap = this.b;
            uc6 uc6Var = (uc6) concurrentHashMap.get(cls);
            uc6 uc6Var2 = (uc6) entry.getValue();
            if (uc6Var2 == null || !uc6Var2.equals(uc6Var)) {
                c.f(obj.getClass(), " registered?", "Missing event producer for an annotated method. Is ");
                return;
            }
            ((uc6) concurrentHashMap.remove(cls)).d = false;
        }
        for (Map.Entry entry2 : khbVar.p(obj).entrySet()) {
            Set<jc6> set = (Set) this.a.get((Class) entry2.getKey());
            Collection<?> collection = (Collection) entry2.getValue();
            if (set == null || !set.containsAll(collection)) {
                c.f(obj.getClass(), " registered?", "Missing event handler for an annotated method. Is ");
                return;
            }
            for (jc6 jc6Var : set) {
                if (collection.contains(jc6Var)) {
                    jc6Var.d = false;
                }
            }
            set.removeAll(collection);
        }
    }

    public final String toString() {
        return zo5.w(new StringBuilder("[Bus \""), this.c, "\"]");
    }
}
