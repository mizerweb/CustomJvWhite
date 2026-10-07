package defpackage;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gp {
    public static final HashSet c = new HashSet();
    public final String a;
    public final String b;

    public gp(String str, String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = ep.a;
        String str = this.b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return hashSet.contains(sb.toString());
    }
}
