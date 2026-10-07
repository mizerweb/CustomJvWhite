package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum m1j implements o1j {
    CANCEL_1S("cancel_1s"),
    SWIPE("swipe"),
    DELETE_ON_PREVIEW("delete_on_preview"),
    DELETE_ON_RECORD("delete_on_record");

    public final String a;

    m1j(String str) {
        this.a = str;
    }

    @Override // defpackage.o1j
    public final String getTitle() {
        return this.a;
    }
}
