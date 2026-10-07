package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public final class uj8 extends ConcurrentHashMap {
    public static final uj8 b = new uj8();
    public final ReentrantLock a;

    public uj8() {
        super(280, 0.8f, 4);
        this.a = new ReentrantLock();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a(String str) {
        String str2 = (String) get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 280) {
            ReentrantLock reentrantLock = this.a;
            if (reentrantLock.tryLock()) {
                try {
                    if (size() >= 280) {
                        clear();
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }
        String strIntern = str.intern();
        put(strIntern, strIntern);
        return strIntern;
    }
}
