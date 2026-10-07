package defpackage;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class dwi implements awi {
    public final awi a;
    public final Range b;
    public final Range c;
    public final HashSet d;

    public dwi(awi awiVar) {
        this.a = awiVar;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        int iG = awiVar.g();
        this.b = Range.create(Integer.valueOf(iG), Integer.valueOf(((int) Math.ceil(4096.0d / ((double) iG))) * iG));
        int iD = awiVar.d();
        this.c = Range.create(Integer.valueOf(iD), Integer.valueOf(((int) Math.ceil(2160.0d / ((double) iD))) * iD));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET);
    }

    @Override // defpackage.awi
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.awi
    public final Range b(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.c;
        boolean zContains = range.contains(numValueOf);
        awi awiVar = this.a;
        if (zContains && i % awiVar.d() == 0) {
            return this.b;
        }
        StringBuilder sb = new StringBuilder("Not supported height: ");
        sb.append(i);
        sb.append(" which is not in ");
        sb.append(range);
        int iD = awiVar.d();
        sb.append(" or can not be divided by alignment ");
        sb.append(iD);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // defpackage.awi
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.awi
    public final boolean e(int i, int i2) {
        awi awiVar = this.a;
        if (awiVar.e(i, i2)) {
            return true;
        }
        HashSet<Size> hashSet = this.d;
        if (hashSet == null || !hashSet.isEmpty()) {
            for (Size size : hashSet) {
                if (size.getWidth() == i && size.getHeight() == i2) {
                    return true;
                }
            }
        }
        return this.b.contains(Integer.valueOf(i)) && this.c.contains(Integer.valueOf(i2)) && i % awiVar.g() == 0 && i2 % awiVar.d() == 0;
    }

    @Override // defpackage.awi
    public final int g() {
        return this.a.g();
    }

    @Override // defpackage.awi
    public final Range h() {
        return this.a.h();
    }

    @Override // defpackage.awi
    public final Range i(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.b;
        boolean zContains = range.contains(numValueOf);
        awi awiVar = this.a;
        if (zContains && i % awiVar.g() == 0) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder("Not supported width: ");
        sb.append(i);
        sb.append(" which is not in ");
        sb.append(range);
        int iG = awiVar.g();
        sb.append(" or can not be divided by alignment ");
        sb.append(iG);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // defpackage.awi
    public final Range j() {
        return this.b;
    }

    @Override // defpackage.awi
    public final Range k() {
        return this.c;
    }
}
