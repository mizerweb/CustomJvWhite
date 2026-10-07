package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class yje implements Comparable {
    public long b = -9223372036854775807L;
    public final ArrayList a = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.b, ((yje) obj).b);
    }
}
