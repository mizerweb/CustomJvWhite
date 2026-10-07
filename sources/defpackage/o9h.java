package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o9h {
    public static final o9h a;
    public static final o9h b;
    public static final o9h c;
    public static final o9h d;
    public static final o9h e;
    public static final /* synthetic */ o9h[] f;

    static {
        o9h o9hVar = new o9h("TAGS", 0);
        a = o9hVar;
        o9h o9hVar2 = new o9h("CONTACT_TAGS", 1);
        b = o9hVar2;
        o9h o9hVar3 = new o9h("COMMANDS", 2);
        c = o9hVar3;
        o9h o9hVar4 = new o9h("DESCRIPTION", 3);
        d = o9hVar4;
        o9h o9hVar5 = new o9h("UNKNOWN", 4);
        e = o9hVar5;
        f = new o9h[]{o9hVar, o9hVar2, o9hVar3, o9hVar4, o9hVar5};
    }

    public static o9h valueOf(String str) {
        return (o9h) Enum.valueOf(o9h.class, str);
    }

    public static o9h[] values() {
        return (o9h[]) f.clone();
    }
}
