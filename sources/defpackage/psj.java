package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum psj implements lrc {
    OLD_WEBVIEW_BLOCKED(2281),
    /* JADX INFO: Fake field, exist only in values array */
    JS_SYNTAX_ERROR(2282),
    WEBVIEW_ERROR(2283),
    SSL_ERROR(2284),
    HTTP_ERROR(2285),
    NO_URL_ERROR(2286),
    LEFT_BEFORE_INIT(2280);

    public final int a;

    psj(int i) {
        this.a = i;
    }

    @Override // defpackage.lrc
    public final int a() {
        return this.a;
    }
}
