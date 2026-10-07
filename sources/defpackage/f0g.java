package defpackage;

import com.facebook.common.references.SharedReference$NullReferenceException;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes.dex */
public class f0g {
    public static final IdentityHashMap d = new IdentityHashMap();
    public Object a;
    public int b;
    public final ine c;

    public f0g(Object obj, ine ineVar, boolean z) {
        obj.getClass();
        this.a = obj;
        this.c = ineVar;
        this.b = 1;
        if (z) {
            IdentityHashMap identityHashMap = d;
            synchronized (identityHashMap) {
                try {
                    Integer num = (Integer) identityHashMap.get(obj);
                    if (num == null) {
                        identityHashMap.put(obj, 1);
                    } else {
                        identityHashMap.put(obj, Integer.valueOf(num.intValue() + 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public synchronized void a() {
        if (!d()) {
            throw new SharedReference$NullReferenceException();
        }
        this.b++;
    }

    public void b() {
        int i;
        Object obj;
        synchronized (this) {
            if (!d()) {
                throw new SharedReference$NullReferenceException();
            }
            oc9.i(Boolean.valueOf(this.b > 0));
            i = this.b - 1;
            this.b = i;
        }
        if (i == 0) {
            synchronized (this) {
                obj = this.a;
                this.a = null;
            }
            if (obj != null) {
                ine ineVar = this.c;
                if (ineVar != null) {
                    ineVar.d(obj);
                }
                IdentityHashMap identityHashMap = d;
                synchronized (identityHashMap) {
                    try {
                        Integer num = (Integer) identityHashMap.get(obj);
                        if (num == null) {
                            pj6.m("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                        } else if (num.intValue() == 1) {
                            identityHashMap.remove(obj);
                        } else {
                            identityHashMap.put(obj, Integer.valueOf(num.intValue() - 1));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public synchronized Object c() {
        return this.a;
    }

    public synchronized boolean d() {
        return this.b > 0;
    }
}
