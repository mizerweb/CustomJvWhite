package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mj0 implements r86 {
    public final int a;
    public final int b;
    public final List c;
    public final List d;
    public final gh0 e;
    public final ih0 f;

    public mj0(int i, int i2, List list, List list2, gh0 gh0Var, ih0 ih0Var) {
        this.a = i;
        this.b = i2;
        if (list == null) {
            ore.n("Null audioProfiles");
            throw null;
        }
        this.c = list;
        if (list2 == null) {
            ore.n("Null videoProfiles");
            throw null;
        }
        this.d = list2;
        this.e = gh0Var;
        if (ih0Var != null) {
            this.f = ih0Var;
        } else {
            ore.n("Null defaultVideoProfile");
            throw null;
        }
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
        if (obj instanceof mj0) {
            mj0 mj0Var = (mj0) obj;
            if (this.a == mj0Var.a && this.b == mj0Var.b && this.c.equals(mj0Var.c) && this.d.equals(mj0Var.d)) {
                gh0 gh0Var = mj0Var.e;
                gh0 gh0Var2 = this.e;
                if (gh0Var2 != null ? gh0Var2.equals(gh0Var) : gh0Var == null) {
                    if (this.f.equals(mj0Var.f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        gh0 gh0Var = this.e;
        return this.f.hashCode() ^ ((iHashCode ^ (gh0Var == null ? 0 : gh0Var.hashCode())) * 1000003);
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.c + ", videoProfiles=" + this.d + ", defaultAudioProfile=" + this.e + ", defaultVideoProfile=" + this.f + "}";
    }
}
