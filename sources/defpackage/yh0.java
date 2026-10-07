package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class yh0 extends ge9 {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final tcb g;

    public yh0(long j, Integer num, long j2, byte[] bArr, String str, long j3, tcb tcbVar) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = tcbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ge9) {
            ge9 ge9Var = (ge9) obj;
            yh0 yh0Var = (yh0) ge9Var;
            if (this.a == yh0Var.a) {
                Integer num = yh0Var.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c == yh0Var.c) {
                        if (Arrays.equals(this.d, ge9Var instanceof yh0 ? ((yh0) ge9Var).d : yh0Var.d)) {
                            String str = yh0Var.e;
                            String str2 = this.e;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (this.f == yh0Var.f) {
                                    tcb tcbVar = yh0Var.g;
                                    tcb tcbVar2 = this.g;
                                    if (tcbVar2 != null ? tcbVar2.equals(tcbVar) : tcbVar == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.c;
        int iHashCode2 = (((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f;
        int i2 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        tcb tcbVar = this.g;
        return i2 ^ (tcbVar != null ? tcbVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
