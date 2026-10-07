package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yv9 extends qbb {
    public static final yv9 b = new yv9();

    public final void j(String str, String str2) {
        o65.c(b(), ":media-editor/crop", n1g.i(new ylc("image_uri", str), new ylc("file_path", str2), new ylc("mode", "ROUNDED_RECT"), new ylc("screen", "EDITING_MEDIA_CROP")), null, 4);
    }

    public final void k(long j, String str) {
        o65.c(b(), ":photo-editor", n1g.i(new ylc("image_uri", str), new ylc("mode", "CHAT"), new ylc("media_id", String.valueOf(j))), null, 4);
    }

    public final void l() {
        b().f();
    }
}
