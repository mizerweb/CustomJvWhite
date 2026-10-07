package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class b3f {
    public static final b3f a;
    public static final b3f b;
    public static final b3f c;
    public static final /* synthetic */ b3f[] d;

    static {
        b3f b3fVar = new b3f("NETWORK_UNMETERED", 0);
        a = b3fVar;
        b3f b3fVar2 = new b3f("DEVICE_IDLE", 1);
        b = b3fVar2;
        b3f b3fVar3 = new b3f("DEVICE_CHARGING", 2);
        c = b3fVar3;
        d = new b3f[]{b3fVar, b3fVar2, b3fVar3};
    }

    public static b3f valueOf(String str) {
        return (b3f) Enum.valueOf(b3f.class, str);
    }

    public static b3f[] values() {
        return (b3f[]) d.clone();
    }
}
