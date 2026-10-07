package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ksj {
    IMPACT_LIGHT(new long[]{7}, new int[]{65}, new long[]{60}),
    IMPACT_MEDIUM(new long[]{7}, new int[]{145}, new long[]{70}),
    IMPACT_HEAVY(new long[]{7}, new int[]{255}, new long[]{80}),
    IMPACT_RIGID(new long[]{3}, new int[]{225}, new long[]{50}),
    IMPACT_SOFT(new long[]{10}, new int[]{175}, new long[]{55}),
    NOTIFICATION_ERROR(new long[]{14, 48, 14, 48, 14, 48, 20}, new int[]{200, 0, 200, 0, 255, 0, 145}, new long[]{40, 60, 40, 60, 65, 60, 40}),
    NOTIFICATION_SUCCESS(new long[]{14, 65, 14}, new int[]{175, 0, 255}, new long[]{50, 60, 65}),
    NOTIFICATION_WARNING(new long[]{14, 64, 14}, new int[]{225, 0, 175}, new long[]{65, 60, 40}),
    SELECTION_CHANGE(new long[]{1}, new int[]{65}, new long[]{30}),
    /* JADX INFO: Fake field, exist only in values array */
    APP_ERROR(new long[]{30, 10, 150, 10}, new int[]{0, 100, 0, 100}, new long[]{40, 60, 40, 60, 65, 60, 40});

    public final long[] a;
    public final int[] b;
    public final long[] c;

    ksj(long[] jArr, int[] iArr, long[] jArr2) {
        this.a = jArr;
        this.b = iArr;
        this.c = jArr2;
    }
}
