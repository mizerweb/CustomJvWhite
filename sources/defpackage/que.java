package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class que {
    public static final que a;
    public static final /* synthetic */ que[] b;

    static {
        que queVar = new que("OVAL", 0);
        a = queVar;
        b = new que[]{queVar, new que("RECT", 1)};
    }

    public static que valueOf(String str) {
        return (que) Enum.valueOf(que.class, str);
    }

    public static que[] values() {
        return (que[]) b.clone();
    }
}
