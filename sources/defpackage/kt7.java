package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum kt7 implements nt7 {
    /* JADX INFO: Fake field, exist only in values array */
    KEYBOARD_RELEASE(7),
    /* JADX INFO: Fake field, exist only in values array */
    VIRTUAL_KEY_RELEASE(8),
    CLOCK_TICK(4),
    TEXT_HANDLE_MOVE(9),
    GESTURE_END(13),
    DRAG_START(25);

    public final int a;

    kt7(int i) {
        this.a = i;
    }

    @Override // defpackage.nt7
    public final int a() {
        return this.a;
    }
}
