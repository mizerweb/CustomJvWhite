package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum j61 {
    CALLBACK("CALLBACK"),
    LINK("LINK"),
    REQUEST_CONTACT("REQUEST_CONTACT"),
    REQUEST_GEO_LOCATION("REQUEST_GEO_LOCATION"),
    CHAT("CHAT"),
    OPEN_APP("OPEN_APP"),
    MESSAGE("MESSAGE"),
    CLIPBOARD("CLIPBOARD"),
    UNKNOWN("UNKNOWN");

    public static final j61[] k = values();
    public final String a;

    j61(String str) {
        this.a = str;
    }
}
