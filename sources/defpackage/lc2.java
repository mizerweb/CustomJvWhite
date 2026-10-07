package defpackage;

import android.os.Build;
import java.util.Collections;
import java.util.Map;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class lc2 {
    public static final Map c = Collections.singletonMap("Google", a.p1(new String[]{"oriole", "raven", "bluejay", "panther", "cheetah", "lynx"}));
    public static final Map d = wm9.Q0(new ylc("google", a.p1(new String[]{"pixel 4", "pixel 4 xl"})), new ylc("samsung", Collections.singleton("sm-g770f")));
    public final kc2 a;
    public final d5h b;

    public lc2(kc2 kc2Var, d5h d5hVar) {
        this.a = kc2Var;
        this.b = d5hVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public final boolean a(String str) {
        boolean z;
        this.b.getClass();
        if (Build.VERSION.SDK_INT <= 32) {
            ag2 ag2Var = bg2.U;
            bg2 bg2VarD = this.a.d(str);
            ag2Var.getClass();
            if (ag2.b(bg2VarD)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z || ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && str.equals("1"));
    }
}
