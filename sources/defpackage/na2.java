package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum na2 implements oa2 {
    CHAT_HEAD("CHAT_HEAD"),
    PROFILE("PROFILE"),
    ATTACH("ATTACH"),
    HISTORY("HISTORY"),
    /* JADX INFO: Fake field, exist only in values array */
    CALL_CONTACT("CALL_CONTACT"),
    CONTACT("CONTACT"),
    RECALL("RECALL");

    public final String a;

    na2(String str) {
        this.a = str;
    }

    @Override // defpackage.oa2
    public final String a() {
        return this.a;
    }
}
