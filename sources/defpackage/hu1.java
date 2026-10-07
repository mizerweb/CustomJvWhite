package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface hu1 {
    default boolean c() {
        return v().a;
    }

    boolean d();

    boolean e();

    boolean f();

    fu1 getId();

    boolean h();

    default boolean i() {
        return c() || isScreenCaptureEnabled();
    }

    boolean isConnected();

    default boolean isScreenCaptureEnabled() {
        return t().a;
    }

    default boolean j() {
        return s() || q();
    }

    boolean k();

    boolean l();

    boolean m();

    long n();

    boolean q();

    boolean r();

    boolean s();

    p4j t();

    int u();

    p4j v();

    boolean w();
}
