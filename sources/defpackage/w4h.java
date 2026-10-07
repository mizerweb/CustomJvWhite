package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum w4h implements go8 {
    CAN_WRITE_BINARY_NATIVELY,
    CAN_WRITE_FORMATTED_NUMBERS;

    public final int a = 1 << ordinal();

    w4h() {
    }

    @Override // defpackage.go8
    public final boolean a() {
        return false;
    }

    @Override // defpackage.go8
    public final int h() {
        return this.a;
    }
}
