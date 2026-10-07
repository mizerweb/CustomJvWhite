package defpackage;

import java.util.ArrayList;
import java.util.Objects;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class ab5 {
    public static final int[] c = {8, 13, 11, 2, 0, 1, 7};
    public lhb a = new lhb(16);
    public boolean b;

    public static void a(int i, ArrayList arrayList) {
        if (k4m.f(i, 0, 7, c) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public q51 b(int i, b87 b87Var, boolean z, ArrayList arrayList, w3d w3dVar) {
        jj6 sb7Var;
        String str = b87Var.m;
        if (!uya.l(str)) {
            if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                sb7Var = new to9(this.a, this.b ? 1 : 3);
            } else if (Objects.equals(str, "image/jpeg")) {
                sb7Var = new ic5(1);
            } else if (Objects.equals(str, "image/png")) {
                sb7Var = new uz0(1);
            } else {
                int i2 = z ? 4 : 0;
                if (!this.b) {
                    i2 |= 32;
                }
                sb7Var = new sb7(this.a, i2, null, arrayList, w3dVar);
            }
        } else {
            if (!this.b) {
                return null;
            }
            sb7Var = new z7h(this.a.m(b87Var), b87Var);
        }
        return new q51(sb7Var, i, b87Var);
    }

    public b87 c(b87 b87Var) {
        if (!this.b || !this.a.a(b87Var)) {
            return b87Var;
        }
        a87 a87VarA = b87Var.a();
        String str = b87Var.k;
        a87VarA.m = uya.n("application/x-media3-cues");
        a87VarA.K = this.a.n(b87Var);
        StringBuilder sb = new StringBuilder();
        sb.append(b87Var.n);
        sb.append(str != null ? " ".concat(str) : "");
        a87VarA.j = sb.toString();
        a87VarA.r = BuildConfig.MAX_TIME_TO_UPLOAD;
        return new b87(a87VarA);
    }
}
