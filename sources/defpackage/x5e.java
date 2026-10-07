package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x5e implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5e b;

    public /* synthetic */ x5e(y5e y5eVar, int i) {
        this.a = i;
        this.b = y5eVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[LOOP:0: B:11:0x002c->B:21:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0064 A[SYNTHETIC] */
    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        y5e y5eVar = this.b;
        switch (i) {
            case 0:
                y5eVar.d();
                c9b c9bVar = y5eVar.i;
                Object[] objArr = c9bVar.b;
                long[] jArr = c9bVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    y5eVar.removeView((View) objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 == 8) {
                                if (i2 != length) {
                                    i2++;
                                }
                            }
                        } else if (i2 != length) {
                            i2++;
                        }
                    }
                }
                y5eVar.c();
                y5eVar.e();
                if (y5eVar.getChildCount() == 0) {
                    y5eVar.setVisibility(8);
                }
                return sbiVar;
            case 1:
                return Boolean.valueOf(y5eVar.c);
            default:
                y5eVar.d();
                y5eVar.c();
                y5eVar.e();
                return sbiVar;
        }
    }
}
