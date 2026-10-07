package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@mif
public final class lnb {

    /* JADX INFO: Fake field, exist only in values array */
    lnb EF5;
    public static final /* synthetic */ lnb[] b = {new lnb("ERROR", 0), new lnb("SUCCESS", 1), new lnb("WARNING", 2)};
    public static final knb Companion = new knb();
    public static final ny8 a = rx8.P(2, new cka(8));

    public static lnb valueOf(String str) {
        return (lnb) Enum.valueOf(lnb.class, str);
    }

    public static lnb[] values() {
        return (lnb[]) b.clone();
    }
}
