package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class gw5 {
    public static final ThreadLocal[] a;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal();
        }
        a = threadLocalArr;
    }
}
