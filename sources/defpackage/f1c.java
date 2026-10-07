package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f1c {
    public static final f1c a;
    public static final f1c b;
    public static final f1c c;
    public static final /* synthetic */ f1c[] d;

    static {
        f1c f1cVar = new f1c("Themed", 0);
        a = f1cVar;
        f1c f1cVar2 = new f1c("ContrastPinned", 1);
        f1c f1cVar3 = new f1c("NeutralFade", 2);
        b = f1cVar3;
        f1c f1cVar4 = new f1c("AccentRed", 3);
        c = f1cVar4;
        d = new f1c[]{f1cVar, f1cVar2, f1cVar3, f1cVar4};
    }

    public static f1c valueOf(String str) {
        return (f1c) Enum.valueOf(f1c.class, str);
    }

    public static f1c[] values() {
        return (f1c[]) d.clone();
    }
}
