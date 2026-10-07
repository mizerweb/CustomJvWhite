package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r0m {
    public static final w50 a(oji ojiVar) {
        switch (shi.$EnumSwitchMapping$0[ojiVar.ordinal()]) {
            case 1:
                return w50.UNKNOWN;
            case 2:
                return w50.VIDEO;
            case 3:
                return w50.VIDEO_MSG;
            case 4:
                return w50.PHOTO;
            case 5:
                return w50.FILE;
            case 6:
                return w50.AUDIO;
            case 7:
                return w50.STICKER;
            default:
                return w50.UNKNOWN;
        }
    }

    public static final int b(int i, Object obj) {
        return (i * 31) + (obj != null ? obj.hashCode() : 0);
    }
}
