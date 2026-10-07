package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum u8k {
    /* JADX INFO: Fake field, exist only in values array */
    ClientInitiatedBidirectional(0, "CIB"),
    /* JADX INFO: Fake field, exist only in values array */
    ServerInitiatedBidirectional(1, "SIB"),
    /* JADX INFO: Fake field, exist only in values array */
    ClientInitiatedUnidirectional(2, "CIU"),
    /* JADX INFO: Fake field, exist only in values array */
    ServerInitiatedUnidirectional(3, "SIU");

    public final int a;
    public final String b;

    u8k(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
