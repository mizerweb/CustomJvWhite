package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gl2 {
    public final List a;

    public gl2(List list) {
        if (list == null || list.isEmpty()) {
            ore.p("Cannot set an empty CaptureStage list.");
            throw null;
        }
        this.a = Collections.unmodifiableList(new ArrayList(list));
    }
}
