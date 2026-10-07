package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum pk5 {
    LOW((byte) 1),
    AVERAGE((byte) 2),
    HIGH((byte) 3);

    public static volatile pk5 b;
    public final byte a;

    pk5(byte b2) {
        this.a = b2;
    }

    public final boolean a() {
        return this == LOW;
    }
}
