package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum qmi {
    b("PREVIEW"),
    c("IMAGE_CAPTURE"),
    d("IMAGE_ANALYSIS"),
    e("VIDEO_CAPTURE"),
    f("STREAM_SHARING"),
    g("UNDEFINED");

    public final Class a;

    qmi(String str) {
        this.a = cls;
    }

    @Override // java.lang.Enum
    public final String toString() {
        switch (pmi.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return "Preview";
            case 2:
                return "ImageCapture";
            case 3:
                return "ImageAnalysis";
            case 4:
                return "VideoCapture";
            case 5:
                return "StreamSharing";
            case 6:
                return "Undefined";
            default:
                ore.o();
                return null;
        }
    }
}
