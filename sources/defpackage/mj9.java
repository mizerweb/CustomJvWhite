package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class mj9 {
    public final int a;
    public final oj9 b;
    public final gp0 c;
    public int d;
    public int e;
    public int f;

    public mj9(int i) {
        this.a = i;
        if (i <= 0) {
            gol.c("maxSize <= 0");
            throw null;
        }
        this.b = new oj9(0);
        this.c = new gp0(19);
    }

    public Object a(Object obj) {
        return null;
    }

    public void b(boolean z, Object obj, Object obj2, Object obj3) {
    }

    public final Object c(Object obj) {
        Object objPut;
        synchronized (this.c) {
            Object obj2 = this.b.a.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            Object objA = a(obj);
            if (objA == null) {
                return null;
            }
            synchronized (this.c) {
                try {
                    objPut = this.b.a.put(obj, objA);
                    if (objPut != null) {
                        this.b.a.put(obj, objPut);
                    } else {
                        this.d += f(obj, objA);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objPut != null) {
                b(false, obj, objA, objPut);
                return objPut;
            }
            i(this.a);
            return objA;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.c) {
            this.d += f(obj, obj2);
            objPut = this.b.a.put(obj, obj2);
            if (objPut != null) {
                this.d -= f(obj, objPut);
            }
        }
        if (objPut != null) {
            b(false, obj, objPut, obj2);
        }
        i(this.a);
        return objPut;
    }

    public final Object e(Object obj) {
        Object objRemove;
        synchronized (this.c) {
            objRemove = this.b.a.remove(obj);
            if (objRemove != null) {
                this.d -= f(obj, objRemove);
            }
        }
        if (objRemove != null) {
            b(false, obj, objRemove, null);
        }
        return objRemove;
    }

    public final int f(Object obj, Object obj2) {
        int iH = h(obj, obj2);
        if (iH >= 0) {
            return iH;
        }
        gol.d("Negative size: " + obj + '=' + obj2);
        throw null;
    }

    public final int g() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public int h(Object obj, Object obj2) {
        return 1;
    }

    public final void i(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (this.b.a.isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d > i && !this.b.a.isEmpty()) {
                        Map.Entry entry = (Map.Entry) ww3.s1(this.b.a.entrySet());
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        this.b.a.remove(key);
                        this.d -= f(key, value);
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            b(true, key, value, null);
        }
        gol.d("LruCache.sizeOf() is reporting inconsistent results!");
        throw null;
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
