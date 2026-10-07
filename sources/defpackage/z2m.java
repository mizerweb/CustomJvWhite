package defpackage;

import java.util.HashSet;
import java.util.Map;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z2m {
    public static Integer a(int i, sr3 sr3Var) {
        if (sr3Var.equals(zfe.a(a09.class))) {
            return Integer.valueOf(R.string.oneme_input_error_name_length);
        }
        if (sr3Var.equals(zfe.a(rf.class))) {
            return Integer.valueOf(R.string.oneme_input_error_incorrect_symbols);
        }
        if (sr3Var.equals(zfe.a(fhb.class))) {
            return Integer.valueOf(R.string.oneme_input_error_name_only_spaces);
        }
        if (!sr3Var.equals(zfe.a(n66.class))) {
            qr7.q(zfe.a(sr3.class), " is not implemented", "Such validation rule (");
            return null;
        }
        int iD = qt4.D(i);
        if (iD == 0) {
            return Integer.valueOf(R.string.oneme_input_error_empty_name);
        }
        if (iD != 1) {
            if (iD == 2) {
                return Integer.valueOf(R.string.oneme_input_error_empty_title);
            }
            ore.o();
        }
        return null;
    }

    public static final String b(String str, Map map, HashSet hashSet) {
        String str2 = (String) map.get(str);
        if (str2 == null || hashSet.contains(str2)) {
            return null;
        }
        return str2;
    }

    public static final boolean c(int i, boolean z) {
        return ixl.e(i, z, jj8.a);
    }
}
