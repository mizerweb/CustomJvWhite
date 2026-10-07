package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c1a extends qbb {
    public static final c1a b = new c1a();

    public final void j(String str, String str2, boolean z) {
        o65.c(b(), ":media-editor/crop", n1g.i(new ylc("image_uri", str), new ylc("file_path", str2), new ylc("mode", (z ? jx4.b : jx4.a).toString())), null, 4);
    }

    public final void k(Long l, int i) {
        o65.c(b(), ":story/editor", n1g.i(new ylc("id", l != null ? String.valueOf(l.longValue()) : null), new ylc("type", String.valueOf(i))), null, 4);
    }

    public final void l() {
        b().f();
    }
}
