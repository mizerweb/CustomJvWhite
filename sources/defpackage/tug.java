package defpackage;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface tug extends Parcelable {
    default azg o() {
        int i = sug.$EnumSwitchMapping$0[r().ordinal()];
        if (i == 1) {
            return new yyg(x());
        }
        if (i == 2) {
            return new xyg(x());
        }
        if (i == 3 || i == 4) {
            return new zyg(x());
        }
        ore.o();
        return null;
    }

    avg r();

    long x();
}
