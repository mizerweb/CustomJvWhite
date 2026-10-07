package defpackage;

import org.apache.http.protocol.HTTP;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v12 sya[], still in use, count: 1, list:
  (r0v12 sya[]) from 0x00cb: CONSTRUCTOR (r0v12 sya[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: ma6.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class sya {
    UNKNOWN("unknown"),
    IMAGE_JPEG("image/jpeg"),
    IMAGE_PNG("image/png"),
    IMAGE_WEBP("image/webp"),
    IMAGE_GIF("image/gif"),
    /* JADX INFO: Fake field, exist only in values array */
    IMAGE_ANY("image/*"),
    IMAGE_HEIC("image/heic"),
    /* JADX INFO: Fake field, exist only in values array */
    IMAGE_HEIF("image/heif"),
    /* JADX INFO: Fake field, exist only in values array */
    IMAGE_AVIF("image/avif"),
    VIDEO_MP4("video/mp4"),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO_ANY("video/*"),
    TEXT_PLAIN(HTTP.PLAIN_TEXT_TYPE),
    TEXT_HTML("text/html"),
    /* JADX INFO: Fake field, exist only in values array */
    TEXT_VCARD("text/x-vcard");

    public static final String[] b = {"image/jpeg", "image/png", "image/webp", "image/gif", "image/*", "image/heic", "image/heif", "image/avif"};
    public static final /* synthetic */ ma6 m;
    public final String a;

    static {
        m = new ma6(new sya[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, new sya("text/x-vcard")});
    }

    public sya(String str) {
        super(str, i);
        this.a = str;
    }

    public static sya valueOf(String str) {
        return (sya) Enum.valueOf(sya.class, str);
    }

    public static sya[] values() {
        return (sya[]) l.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
