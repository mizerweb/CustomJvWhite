package defpackage;

import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0010J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\f\u0088\u0001\u0014\u0092\u0001\u00020\u0002¨\u0006\u0018"}, d2 = {"Lsid;", "", "", "flag", "", "g", "(JJ)Z", "", "i", "(J)Ljava/lang/String;", "", "h", "(J)I", "other", DatabaseHelper.COMPRESSED_COLUMN_NAME, "(JLjava/lang/Object;)Z", "a", "J", "f", "()J", "rawValue", "e", "bitIndex", "b", "batterylib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class sid {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long rawValue;

    /* JADX INFO: renamed from: sid$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsid$a;", "", "", SdkMetricStatEvent.VALUE_KEY, "Lsid;", "a", "(J)J", "batterylib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(j95 j95Var) {
        }

        public final long a(long value) {
            return sid.a(value);
        }
    }

    public /* synthetic */ sid(long j) {
        this.rawValue = j;
    }

    public static final long a(long j) {
        return j;
    }

    public static final /* synthetic */ sid b(long j) {
        return new sid(j);
    }

    public static boolean c(long j, Object obj) {
        return (obj instanceof sid) && j == ((sid) obj).j();
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static final int e(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    public static final boolean g(long j, long j2) {
        return (j & j2) != 0;
    }

    public static int h(long j) {
        return Long.hashCode(j);
    }

    public static String i(long j) {
        return "ProcessMask(raw=" + Long.toBinaryString(j) + ')';
    }

    public boolean equals(Object obj) {
        return c(this.rawValue, obj);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getRawValue() {
        return this.rawValue;
    }

    public int hashCode() {
        return h(this.rawValue);
    }

    public final /* synthetic */ long j() {
        return this.rawValue;
    }

    public String toString() {
        return i(this.rawValue);
    }
}
