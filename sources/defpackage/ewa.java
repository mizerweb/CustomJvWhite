package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum ewa implements jwd {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);

    public final int a;

    ewa(int i) {
        this.a = i;
    }

    @Override // defpackage.jwd
    public final int a() {
        return this.a;
    }
}
