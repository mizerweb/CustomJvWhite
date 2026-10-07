package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum c1e {
    _144p("MOBILE"),
    _240p("LOWEST"),
    _360p("LOW"),
    _480p("MEDIUM"),
    _720p("HIGH"),
    _1080p("FULLHD"),
    _1440p("QUADHD"),
    _2160p("ULTRAHD"),
    _4320p("ULTRAHD8K");

    public final String a;

    c1e(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
