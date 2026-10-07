package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class cbg implements jwa {
    public final ArrayList a;

    public cbg(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((bbg) arrayList.get(0)).b;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((bbg) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                }
                j = ((bbg) arrayList.get(i)).b;
            }
        }
        lvb.R(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cbg.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((cbg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
