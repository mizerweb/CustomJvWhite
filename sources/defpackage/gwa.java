package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum gwa implements jwd {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);

    public final int a;

    gwa(int i) {
        this.a = i;
    }

    @Override // defpackage.jwd
    public final int a() {
        return this.a;
    }
}
