package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ruj {
    public int f;
    public int h;
    public float o;
    public String a = "";
    public String b = "";
    public Set c = Collections.EMPTY_SET;
    public String d = "";
    public String e = null;
    public boolean g = false;
    public boolean i = false;
    public final int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int p = -1;
    public boolean q = false;

    public static int c(String str, int i, int i2, String str2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    public final int a(String str, String str2, Set set, String str3) {
        if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iC = c(this.d, c(this.b, c(this.a, 0, 1073741824, str), 2, str2), 4, str3);
        if (iC == -1 || !set.containsAll(this.c)) {
            return 0;
        }
        return (this.c.size() * 4) + iC;
    }

    public final int b() {
        int i = this.l;
        if (i == -1 && this.m == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.m == 1 ? 2 : 0);
    }
}
