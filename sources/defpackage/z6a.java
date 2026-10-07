package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z6a {
    public static final HashSet a = new HashSet(Arrays.asList(1, 3, 4, 2, 6, 5, 7));
    public static final HashSet b = new HashSet(Arrays.asList(6, 7));
    public static final Set c = Collections.singleton(2);
    public static final HashSet d = new HashSet(Arrays.asList(2, 11));
    public static final HashSet e = new HashSet(Arrays.asList(1, 3, 4));
    public static final HashSet f;
    public static final HashSet g;
    public static final HashSet h;
    public static final f8b i;

    static {
        new HashSet(Arrays.asList(1, 3, 4, 11));
        f = new HashSet(Collections.singletonList(5));
        g = new HashSet(Collections.singletonList(7));
        h = new HashSet(Collections.singletonList(9));
        int[] iArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        f8b f8bVar = new f8b(12);
        for (int i2 = 0; i2 < 12; i2++) {
            f8bVar.h(iArr[i2]);
        }
        i = f8bVar;
    }
}
