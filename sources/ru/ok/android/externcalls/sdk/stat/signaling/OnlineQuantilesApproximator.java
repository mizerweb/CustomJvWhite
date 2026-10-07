package ru.ok.android.externcalls.sdk.stat.signaling;

import defpackage.gm0;
import defpackage.j95;
import defpackage.xw3;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0003\u001a\u001b\u0019B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0018\u0010\u0014\u001a\u00060\u0013R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\b\u0018\u00010\u0016R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/signaling/OnlineQuantilesApproximator;", "", "", "firstValue", "quantile", "", "sizeLimitForNaive", "<init>", "(FFI)V", SdkMetricStatEvent.VALUE_KEY, "Lsbi;", "submit", "(F)V", "get", "()F", "getMin", "getMax", "F", "I", "Lru/ok/android/externcalls/sdk/stat/signaling/OnlineQuantilesApproximator$PSquare;", "pSquare", "Lru/ok/android/externcalls/sdk/stat/signaling/OnlineQuantilesApproximator$PSquare;", "Lru/ok/android/externcalls/sdk/stat/signaling/OnlineQuantilesApproximator$Naive;", "naive", "Lru/ok/android/externcalls/sdk/stat/signaling/OnlineQuantilesApproximator$Naive;", "Companion", "PSquare", "Naive", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OnlineQuantilesApproximator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Naive naive;
    private final PSquare pSquare;
    private final float quantile;
    private final int sizeLimitForNaive;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/signaling/OnlineQuantilesApproximator$Naive;", "", "", "firstValue", "<init>", "(Lru/ok/android/externcalls/sdk/stat/signaling/OnlineQuantilesApproximator;F)V", SdkMetricStatEvent.VALUE_KEY, "Lsbi;", "submit", "(F)V", "get", "()F", "", "array", "Ljava/util/List;", "", "isSorted", "Z", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Naive {
        private final List<Float> array;
        private boolean isSorted;

        public Naive(float f) {
            this.array = xw3.R0(Float.valueOf(f));
        }

        public final float get() {
            if (!this.isSorted) {
                List<Float> list = this.array;
                if (list.size() > 1) {
                    Collections.sort(list);
                }
                this.isSorted = true;
            }
            return this.array.get(gm0.K(OnlineQuantilesApproximator.this.quantile * (this.array.size() - 1))).floatValue();
        }

        public final void submit(float value) {
            this.isSorted = false;
            this.array.add(Float.valueOf(value));
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/signaling/OnlineQuantilesApproximator$PSquare;", "", "", "firstValue", "<init>", "(Lru/ok/android/externcalls/sdk/stat/signaling/OnlineQuantilesApproximator;F)V", "", "isDenormalized", "()Z", "", "size", "()I", SdkMetricStatEvent.VALUE_KEY, "Lsbi;", "submit", "(F)V", "get", "()F", "getMin", "getMax", "", "qs", "[F", "", "ns", "[I", "dns", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class PSquare {
        private final float[] dns;
        private final int[] ns = {1, 2, 3, 4, 1};
        private final float[] qs;

        public PSquare(float f) {
            this.qs = new float[]{f, 0.0f, 0.0f, 0.0f, 0.0f};
            this.dns = new float[]{OnlineQuantilesApproximator.this.quantile * 0.5f, OnlineQuantilesApproximator.this.quantile, (OnlineQuantilesApproximator.this.quantile + 1.0f) * 0.5f};
        }

        private final boolean isDenormalized() {
            return size() < 5;
        }

        public final float get() {
            boolean zIsDenormalized = isDenormalized();
            float[] fArr = this.qs;
            return zIsDenormalized ? fArr[gm0.K(OnlineQuantilesApproximator.this.quantile * (size() - 1))] : fArr[2];
        }

        public final float getMax() {
            boolean zIsDenormalized = isDenormalized();
            float[] fArr = this.qs;
            return zIsDenormalized ? fArr[size() - 1] : fArr[4];
        }

        public final float getMin() {
            return this.qs[0];
        }

        public final int size() {
            return this.ns[4];
        }

        public final void submit(float value) {
            float[] fArr;
            if (isDenormalized()) {
                this.qs[size()] = value;
                int[] iArr = this.ns;
                iArr[4] = iArr[4] + 1;
                Arrays.sort(this.qs, 0, size());
                return;
            }
            int i = 1;
            while (true) {
                fArr = this.qs;
                if (i >= 4) {
                    break;
                }
                if (value < fArr[i]) {
                    int[] iArr2 = this.ns;
                    iArr2[i] = iArr2[i] + 1;
                }
                i++;
            }
            fArr[0] = Math.min(fArr[0], value);
            float[] fArr2 = this.qs;
            fArr2[4] = Math.max(fArr2[4], value);
            int[] iArr3 = this.ns;
            iArr3[4] = iArr3[4] + 1;
            for (int i2 = 1; i2 < 4; i2++) {
                int i3 = i2 - 1;
                float size = (size() * this.dns[i3]) - this.ns[i2];
                int iSignum = (int) Math.signum(size);
                if (Math.abs(size) >= 1.0f) {
                    int[] iArr4 = this.ns;
                    int i4 = i2 + iSignum;
                    if (Math.abs(iArr4[i2] - iArr4[i4]) > 1) {
                        Companion companion = OnlineQuantilesApproximator.INSTANCE;
                        float[] fArr3 = this.qs;
                        float f = fArr3[i3];
                        float f2 = fArr3[i2];
                        int i5 = i2 + 1;
                        float f3 = fArr3[i5];
                        int[] iArr5 = this.ns;
                        int i6 = iArr5[i3];
                        int i7 = iArr5[i2];
                        float fParabolicInterpolation = companion.parabolicInterpolation(f, f2, f3, i6, i7, iArr5[i5], i7 + iSignum);
                        float[] fArr4 = this.qs;
                        if (fArr4[i3] >= fParabolicInterpolation || fParabolicInterpolation >= fArr4[i5]) {
                            float f4 = fArr4[i2];
                            float f5 = fArr4[i4];
                            int[] iArr6 = this.ns;
                            int i8 = iArr6[i2];
                            fArr4[i2] = companion.linearInterpolation(f4, f5, i8, iArr6[i4], i8 + iSignum);
                        } else {
                            fArr4[i2] = fParabolicInterpolation;
                        }
                        int[] iArr7 = this.ns;
                        iArr7[i2] = iArr7[i2] + iSignum;
                    }
                }
            }
        }
    }

    public OnlineQuantilesApproximator(float f, float f2, int i) {
        this.quantile = f2;
        this.sizeLimitForNaive = i;
        this.pSquare = new PSquare(f);
        this.naive = i > 1 ? new Naive(f) : null;
    }

    public final float get() {
        Naive naive = this.naive;
        return naive != null ? naive.get() : this.pSquare.get();
    }

    public final float getMax() {
        return this.pSquare.getMax();
    }

    public final float getMin() {
        return this.pSquare.getMin();
    }

    public final void submit(float value) {
        this.pSquare.submit(value);
        if (this.naive != null) {
            if (this.pSquare.size() > this.sizeLimitForNaive) {
                this.naive = null;
            }
            Naive naive = this.naive;
            if (naive != null) {
                naive.submit(value);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0007J0\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0007¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/signaling/OnlineQuantilesApproximator$Companion;", "", "<init>", "()V", "parabolicInterpolation", "", "q0", "q1", "q2", "n0", "", "n1", "n2", "n", "linearInterpolation", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        public final float linearInterpolation(float q0, float q1, int n0, int n1, int n) {
            return (((q1 - q0) * (n - n0)) / (n1 - n0)) + q0;
        }

        public final float parabolicInterpolation(float q0, float q1, float q2, int n0, int n1, int n2, int n) {
            return (((((q1 - q0) * (n2 - n)) / (n1 - n0)) + (((q2 - q1) * (n - n0)) / (n2 - n1))) * ((n - n1) / (n2 - n0))) + q1;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OnlineQuantilesApproximator(float f, float f2, int i, int i2, j95 j95Var) {
        this(f, f2, (i2 & 4) != 0 ? 20 : i);
    }
}
