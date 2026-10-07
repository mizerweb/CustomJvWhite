package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class gha {
    public static final gha a;
    public static final gha b;
    public static final gha c;
    public static final /* synthetic */ gha[] d;

    static {
        gha ghaVar = new gha("HIDDEN", 0);
        a = ghaVar;
        gha ghaVar2 = new gha("HAS_MESSAGES", 1);
        b = ghaVar2;
        gha ghaVar3 = new gha("HAS_ERROR", 2);
        c = ghaVar3;
        d = new gha[]{ghaVar, ghaVar2, ghaVar3};
    }

    public static gha valueOf(String str) {
        return (gha) Enum.valueOf(gha.class, str);
    }

    public static gha[] values() {
        return (gha[]) d.clone();
    }
}
