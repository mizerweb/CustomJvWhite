package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class ld6 {
    public static final zpe c = new zpe(25);
    public static final LinkedHashMap d = new LinkedHashMap();
    public final ReentrantLock a;
    public final uvc b;

    public ld6(String str, boolean z) {
        ReentrantLock reentrantLock;
        synchronized (c) {
            try {
                LinkedHashMap linkedHashMap = d;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = reentrantLock;
        this.b = z ? new uvc(str) : null;
    }
}
