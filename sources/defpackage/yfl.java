package defpackage;

import android.content.Context;
import java.math.BigInteger;
import java.util.TreeMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yfl {
    public static final kyb a(Context context) {
        kyb kybVar = new kyb(context);
        kybVar.setId(R.id.oneme_location_map_button_current_location);
        kybVar.setMode(hyb.a);
        kybVar.setAppearance(gyb.a);
        kybVar.setIconTintResolver(new vi2(23));
        kybVar.setIcon(R.drawable.icon_location_fill);
        return kybVar;
    }

    public static BigInteger b(int i, int i2, CharSequence charSequence) {
        int i3 = i2 - i;
        BigInteger bigInteger = hl6.a;
        jrc jrcVar = new jrc(((((long) i3) * 3402) >>> 10) + 1);
        int i4 = (i3 & 7) + i;
        int iJ = kxl.j(i, i4, charSequence);
        boolean z = iJ >= 0;
        jrcVar.f(iJ);
        while (i4 < i2) {
            int iE = kxl.e(i4, charSequence);
            z &= iE >= 0;
            jrcVar.n(iE);
            i4 += 8;
        }
        if (z) {
            return jrcVar.D();
        }
        throw new NumberFormatException("illegal syntax");
    }

    public static BigInteger c(CharSequence charSequence, int i, int i2, TreeMap treeMap) {
        int i3 = i2 - i;
        if (i3 <= 400) {
            return b(i, i2, charSequence);
        }
        BigInteger bigInteger = hl6.a;
        int i4 = i2 - (((i3 + 31) >>> 5) << 4);
        return c(charSequence, i4, i2, treeMap).add(ip6.k(c(charSequence, i, i4, treeMap), (BigInteger) treeMap.get(Integer.valueOf(i2 - i4))));
    }
}
