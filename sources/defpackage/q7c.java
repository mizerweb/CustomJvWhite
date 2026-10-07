package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q7c {
    public static final q7c a;
    public static final q7c b;
    public static final q7c c;
    public static final q7c d;
    public static final /* synthetic */ q7c[] e;

    static {
        q7c q7cVar = new q7c("COLLAPSED", 0);
        a = q7cVar;
        q7c q7cVar2 = new q7c("ANIMATING_COLLAPSE", 1);
        b = q7cVar2;
        q7c q7cVar3 = new q7c("EXPANDED", 2);
        c = q7cVar3;
        q7c q7cVar4 = new q7c("ANIMATING_EXPAND", 3);
        d = q7cVar4;
        e = new q7c[]{q7cVar, q7cVar2, q7cVar3, q7cVar4};
    }

    public static q7c valueOf(String str) {
        return (q7c) Enum.valueOf(q7c.class, str);
    }

    public static q7c[] values() {
        return (q7c[]) e.clone();
    }
}
