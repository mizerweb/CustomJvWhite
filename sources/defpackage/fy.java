package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum fy {
    UNKNOWN("UNKNOWN"),
    /* JADX INFO: Fake field, exist only in values array */
    ADDED("ADDED"),
    /* JADX INFO: Fake field, exist only in values array */
    REMOVED("REMOVED"),
    /* JADX INFO: Fake field, exist only in values array */
    MOVED("MOVED"),
    UPDATED("UPDATED"),
    /* JADX INFO: Fake field, exist only in values array */
    LIST_UPDATED("LIST_UPDATED");

    public static final fy[] d = values();
    public final String a;

    fy(String str) {
        this.a = str;
    }
}
