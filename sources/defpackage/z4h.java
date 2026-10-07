package defpackage;

import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z4h {
    public static final Set a = a.p1(new fif[]{bai.b, gai.b, w9i.b, mai.b});

    public static final boolean a(fif fifVar) {
        return fifVar.isInline() && fifVar.equals(kt8.a);
    }

    public static final boolean b(fif fifVar) {
        return fifVar.isInline() && a.contains(fifVar);
    }
}
