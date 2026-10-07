package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class x4c {
    public static final x4c a;
    public static final /* synthetic */ x4c[] b;

    /* JADX INFO: Fake field, exist only in values array */
    x4c EF0;

    static {
        x4c x4cVar = new x4c("TITLE", 0);
        x4c x4cVar2 = new x4c("SUBTITLE", 1);
        x4c x4cVar3 = new x4c("NONE", 2);
        a = x4cVar3;
        b = new x4c[]{x4cVar, x4cVar2, x4cVar3};
    }

    public static x4c valueOf(String str) {
        return (x4c) Enum.valueOf(x4c.class, str);
    }

    public static x4c[] values() {
        return (x4c[]) b.clone();
    }
}
