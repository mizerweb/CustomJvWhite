package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ki0 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    public ki0(int i, long j, long j2, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = str4;
    }

    public final ji0 a() {
        ji0 ji0Var = new ji0();
        ji0Var.b = this.a;
        ji0Var.a = this.b;
        ji0Var.c = this.c;
        ji0Var.d = this.d;
        ji0Var.f = Long.valueOf(this.e);
        ji0Var.g = Long.valueOf(this.f);
        ji0Var.e = this.g;
        return ji0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ki0)) {
            return false;
        }
        ki0 ki0Var = (ki0) obj;
        String str = ki0Var.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!qt4.e(this.b, ki0Var.b)) {
            return false;
        }
        String str3 = ki0Var.c;
        String str4 = this.c;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = ki0Var.d;
        String str6 = this.d;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (this.e != ki0Var.e || this.f != ki0Var.f) {
            return false;
        }
        String str7 = ki0Var.g;
        String str8 = this.g;
        if (str8 == null) {
            return str7 == null;
        }
        return str8.equals(str7);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ qt4.D(this.b)) * 1000003;
        String str2 = this.c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.e;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.g;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.a);
        sb.append(", registrationStatus=");
        int i = this.b;
        if (i == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i == 2) {
            str = "NOT_GENERATED";
        } else if (i == 3) {
            str = "UNREGISTERED";
        } else if (i != 4) {
            str = i != 5 ? "null" : "REGISTER_ERROR";
        } else {
            str = "REGISTERED";
        }
        sb.append(str);
        sb.append(", authToken=");
        sb.append(this.c);
        sb.append(", refreshToken=");
        sb.append(this.d);
        sb.append(", expiresInSecs=");
        sb.append(this.e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f);
        sb.append(", fisError=");
        return zo5.w(sb, this.g, "}");
    }
}
