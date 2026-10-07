package defpackage;

import java.util.Arrays;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class a1a extends f83 {
    public static final a1a c;
    public static final m65 d;
    public static final m65 e;

    static {
        a1a a1aVar = new a1a(2);
        c = a1aVar;
        f65 f65Var = gp0.g;
        d = f83.c(a1aVar, ":media-picker/select/photo", new String[0], f65Var, 2);
        e = a1aVar.b(":media-editor/crop", (String[]) Arrays.copyOf(new String[0], 0), a.p1(new String[]{"image_uri", "file_path", "mode"}), r1f.a(f65Var), false);
    }
}
