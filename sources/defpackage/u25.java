package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface u25 extends q25 {
    void close();

    long f(a35 a35Var);

    Uri getUri();

    default Map p() {
        return Collections.EMPTY_MAP;
    }

    void w(v1i v1iVar);
}
