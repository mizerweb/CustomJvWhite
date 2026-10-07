package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j5c {
    public static final j5c a;
    public static final j5c b;
    public static final /* synthetic */ j5c[] c;

    static {
        j5c j5cVar = new j5c("FILED", 0);
        a = j5cVar;
        j5c j5cVar2 = new j5c("PLAIN", 1);
        b = j5cVar2;
        c = new j5c[]{j5cVar, j5cVar2};
    }

    public static j5c valueOf(String str) {
        return (j5c) Enum.valueOf(j5c.class, str);
    }

    public static j5c[] values() {
        return (j5c[]) c.clone();
    }
}
