package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j8c {
    public static final j8c a;
    public static final j8c b;
    public static final j8c c;
    public static final j8c d;
    public static final j8c e;
    public static final /* synthetic */ j8c[] f;

    static {
        j8c j8cVar = new j8c("TIMEOUT", 0);
        a = j8cVar;
        j8c j8cVar2 = new j8c("SWIPE", 1);
        b = j8cVar2;
        j8c j8cVar3 = new j8c("MANUAL", 2);
        c = j8cVar3;
        j8c j8cVar4 = new j8c("ROOT_VIEW_DETACHED", 3);
        d = j8cVar4;
        j8c j8cVar5 = new j8c("RIGHT_ELEMENT_CLICK", 4);
        e = j8cVar5;
        f = new j8c[]{j8cVar, j8cVar2, j8cVar3, j8cVar4, j8cVar5};
    }

    public static j8c valueOf(String str) {
        return (j8c) Enum.valueOf(j8c.class, str);
    }

    public static j8c[] values() {
        return (j8c[]) f.clone();
    }
}
