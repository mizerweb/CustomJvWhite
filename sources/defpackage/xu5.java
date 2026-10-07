package defpackage;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public interface xu5 {
    static void e(xu5 xu5Var, xu5 xu5Var2) {
        if (xu5Var == xu5Var2) {
            return;
        }
        if (xu5Var2 != null) {
            xu5Var2.g(null);
        }
        if (xu5Var != null) {
            xu5Var.f(null);
        }
    }

    UUID a();

    boolean b();

    DrmSession$DrmSessionException c();

    cd7 d();

    void f(av5 av5Var);

    void g(av5 av5Var);

    int getState();

    boolean h(String str);
}
