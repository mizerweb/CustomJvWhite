package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface vxe extends AutoCloseable {
    void B(int i, String str);

    String B0(int i);

    boolean M0();

    void a(int i, double d);

    void c(int i, long j);

    void d(int i, byte[] bArr);

    void e(int i);

    byte[] getBlob(int i);

    int getColumnCount();

    String getColumnName(int i);

    double getDouble(int i);

    long getLong(int i);

    boolean isNull(int i);

    void reset();

    default boolean s0() {
        return getLong(0) != 0;
    }

    void u();
}
