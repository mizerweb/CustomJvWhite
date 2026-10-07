package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hh0 implements r86 {
    public final int a;
    public final int b;
    public final List c;
    public final List d;

    public hh0(int i, int i2, List list, List list2) {
        this.a = i;
        this.b = i2;
        if (list == null) {
            ore.n("Null audioProfiles");
            throw null;
        }
        this.c = list;
        if (list2 != null) {
            this.d = list2;
        } else {
            ore.n("Null videoProfiles");
            throw null;
        }
    }

    public static hh0 e(int i, int i2, List list, List list2) {
        return new hh0(i, i2, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
    }

    @Override // defpackage.r86
    public final int a() {
        return this.a;
    }

    @Override // defpackage.r86
    public final List b() {
        return this.d;
    }

    @Override // defpackage.r86
    public final int c() {
        return this.b;
    }

    @Override // defpackage.r86
    public final List d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hh0) {
            hh0 hh0Var = (hh0) obj;
            if (this.a == hh0Var.a && this.b == hh0Var.b && this.c.equals(hh0Var.c) && this.d.equals(hh0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb.append(this.a);
        sb.append(", recommendedFileFormat=");
        sb.append(this.b);
        sb.append(", audioProfiles=");
        sb.append(this.c);
        sb.append(", videoProfiles=");
        return qv1.n("}", sb, this.d);
    }
}
