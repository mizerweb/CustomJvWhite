package defpackage;

import android.util.SparseIntArray;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class rz4 implements ThreadFactory {
    public static final SparseIntArray e;
    public final String c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final int a = 9;
    public final int b = e.get(9, 0);

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.put(1, 10);
        sparseIntArray.put(2, 16);
        sparseIntArray.put(3, 13);
        sparseIntArray.put(4, 16);
        sparseIntArray.put(5, 0);
        sparseIntArray.put(6, -2);
        sparseIntArray.put(7, -4);
        sparseIntArray.put(8, -6);
        sparseIntArray.put(9, -5);
        sparseIntArray.put(10, -8);
    }

    public rz4(String str) {
        this.c = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(new o90(this, 6, runnable));
        try {
            thread.setPriority(this.a);
        } catch (Throwable unused) {
        }
        thread.setName(this.c + "-" + this.d.getAndIncrement());
        return thread;
    }
}
