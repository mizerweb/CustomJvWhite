package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xx7 implements ou6 {
    public final String a;
    public final List b;
    public final boolean c;

    public xx7(String str, List list, boolean z) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}
