package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum lt7 implements nt7 {
    /* JADX INFO: Fake field, exist only in values array */
    KEYBOARD_PRESS(3),
    /* JADX INFO: Fake field, exist only in values array */
    VIRTUAL_KEY(1),
    KEYBOARD_TAP(3),
    CONTEXT_CLICK(6),
    GESTURE_START(12),
    CONFIRM(16);

    public final int a;

    lt7(int i) {
        this.a = i;
    }

    @Override // defpackage.nt7
    public final int a() {
        return this.a;
    }
}
