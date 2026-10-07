package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h2b {
    public static final float a;

    static {
        a(0.0f);
        a(1.0f);
        a = 1.0f;
    }

    public static void a(float f) {
        if (0.0f > f || f > 1.0f) {
            ore.p("Gain must be in range of 0f and 1f");
        }
    }
}
