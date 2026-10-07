package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class p0c {
    public static final p0c a;
    public static final p0c b;
    public static final p0c c;
    public static final p0c d;
    public static final /* synthetic */ p0c[] e;

    static {
        p0c p0cVar = new p0c("Themed", 0);
        a = p0cVar;
        p0c p0cVar2 = new p0c("Neutral", 1);
        p0c p0cVar3 = new p0c("NeutralThemed", 2);
        b = p0cVar3;
        p0c p0cVar4 = new p0c("NeutralStatic", 3);
        c = p0cVar4;
        p0c p0cVar5 = new p0c("Negative", 4);
        d = p0cVar5;
        e = new p0c[]{p0cVar, p0cVar2, p0cVar3, p0cVar4, p0cVar5};
    }

    public static p0c valueOf(String str) {
        return (p0c) Enum.valueOf(p0c.class, str);
    }

    public static p0c[] values() {
        return (p0c[]) e.clone();
    }
}
