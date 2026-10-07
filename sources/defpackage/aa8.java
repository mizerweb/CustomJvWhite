package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@mif
public final class aa8 {

    /* JADX INFO: Fake field, exist only in values array */
    aa8 EF5;
    public static final /* synthetic */ aa8[] b = {new aa8("LIGHT", 0), new aa8("MEDIUM", 1), new aa8("HEAVY", 2), new aa8("RIGID", 3), new aa8("SOFT", 4)};
    public static final z98 Companion = new z98();
    public static final ny8 a = rx8.P(2, new q38(3));

    public static aa8 valueOf(String str) {
        return (aa8) Enum.valueOf(aa8.class, str);
    }

    public static aa8[] values() {
        return (aa8[]) b.clone();
    }
}
