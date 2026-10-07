package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum qa2 implements ra2 {
    EVERYTHING_OK("everything_ok"),
    TO_CONTACTS("to_contacts"),
    BLOCK("block"),
    CLOSE("close"),
    HIDE("hide");

    public final String a;

    qa2(String str) {
        this.a = str;
    }

    @Override // defpackage.ra2
    public final String getDescription() {
        return this.a;
    }
}
