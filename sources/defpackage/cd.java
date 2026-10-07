package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class cd {
    public static final cd d = new cd(s66.a, c76.a, 0);
    public final Map a;
    public final Set b;
    public final long c;

    public cd(Map map, Set set, long j) {
        this.a = map;
        this.b = set;
        this.c = j;
    }

    public static cd a(cd cdVar, LinkedHashMap linkedHashMap, pw pwVar, long j, int i) {
        Map map = linkedHashMap;
        if ((i & 1) != 0) {
            map = cdVar.a;
        }
        Set set = pwVar;
        if ((i & 2) != 0) {
            set = cdVar.b;
        }
        if ((i & 4) != 0) {
            j = cdVar.c;
        }
        cdVar.getClass();
        return new cd(map, set, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd)) {
            return false;
        }
        cd cdVar = (cd) obj;
        return this.a.equals(cdVar.a) && this.b.equals(cdVar.b) && this.c == cdVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + nbh.o(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdminWaitingRoomUsers(usersInWaitingRoom=");
        sb.append(this.a);
        sb.append(", lastNewUsersIds=");
        sb.append(this.b);
        sb.append(", lastUpdate=");
        return c0a.m(this.c, ")", sb);
    }
}
