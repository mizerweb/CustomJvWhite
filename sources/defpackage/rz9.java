package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public interface rz9 {
    default int E(int i, int i2) {
        return i() ? Math.min(i2, i) : i;
    }

    long I(int i, int i2, int i3, int i4);

    boolean i();

    void q(iq9 iq9Var);

    void setLimitByContentWidthEnabled(boolean z);

    int t(int i, int i2);
}
