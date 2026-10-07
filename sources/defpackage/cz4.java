package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class cz4 implements v7h {
    public static final p61 c = new p61(new hs4(11), lbb.a);
    public final c98 a;
    public final long[] b;

    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    public cz4(ghe gheVar) {
        int i = gheVar.d;
        int i2 = 0;
        long j = -9223372036854775807L;
        if (i == 1) {
            a98 a98VarListIterator = gheVar.listIterator(0);
            Object next = a98VarListIterator.next();
            if (a98VarListIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i2 < 4 && a98VarListIterator.hasNext()) {
                    sb.append(", ");
                    sb.append(a98VarListIterator.next());
                    i2++;
                }
                if (a98VarListIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            bz4 bz4Var = (bz4) next;
            long j2 = bz4Var.b;
            long j3 = bz4Var.c;
            long j4 = j2 == -9223372036854775807L ? 0L : j2;
            c98 c98Var = bz4Var.a;
            if (j3 == -9223372036854775807L) {
                this.a = c98.r(c98Var);
                this.b = new long[]{j4};
                return;
            } else {
                a98 a98Var = c98.b;
                this.a = c98.s(c98Var, ghe.e);
                this.b = new long[]{j4, j3 + j4};
                return;
            }
        }
        long[] jArr = new long[i * 2];
        this.b = jArr;
        Arrays.fill(jArr, BuildConfig.MAX_TIME_TO_UPLOAD);
        ArrayList arrayList = new ArrayList();
        ghe gheVarX = c98.x(gheVar, c);
        int i3 = 0;
        while (i2 < gheVarX.d) {
            bz4 bz4Var2 = (bz4) gheVarX.get(i2);
            long j5 = bz4Var2.b;
            long j6 = bz4Var2.c;
            c98 c98Var2 = bz4Var2.a;
            j5 = j5 == j ? 0L : j5;
            long j7 = j5 + j6;
            if (i3 != 0) {
                int i4 = i3 - 1;
                long j8 = this.b[i4];
                if (j8 < j5) {
                    this.b[i3] = j5;
                    arrayList.add(c98Var2);
                    i3++;
                } else if (j8 == j5 && ((c98) arrayList.get(i4)).isEmpty()) {
                    arrayList.set(i4, c98Var2);
                } else {
                    lvb.G0("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.b[i4] = j5;
                    arrayList.set(i4, c98Var2);
                }
            } else {
                this.b[i3] = j5;
                arrayList.add(c98Var2);
                i3++;
            }
            if (j6 != j) {
                this.b[i3] = j7;
                arrayList.add(ghe.e);
                i3++;
            }
            i2++;
            j = j;
        }
        this.a = c98.n(arrayList);
    }

    @Override // defpackage.v7h
    public final int e(long j) {
        int iB = vqi.b(this.b, j, false);
        if (iB < this.a.size()) {
            return iB;
        }
        return -1;
    }

    @Override // defpackage.v7h
    public final List h(long j) {
        int iF = vqi.f(this.b, j, false);
        if (iF != -1) {
            return (c98) this.a.get(iF);
        }
        a98 a98Var = c98.b;
        return ghe.e;
    }

    @Override // defpackage.v7h
    public final long m(int i) {
        lvb.R(i < this.a.size());
        return this.b[i];
    }

    @Override // defpackage.v7h
    public final int o() {
        return this.a.size();
    }
}
