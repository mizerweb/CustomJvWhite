package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r38 {
    public static final ifh a = new ifh(new q38(0));
    public static final ifh b = new ifh(new q38(1));

    public static final boolean a(String str) {
        if (str == null ? false : ((lge) a.getValue()).b(str)) {
            return true;
        }
        return str == null ? false : ((lge) b.getValue()).b(str);
    }
}
