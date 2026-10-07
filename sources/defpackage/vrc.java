package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class vrc implements dk5 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final long f;
    public final dq4 g;
    public sgg h;
    public final r8e i;

    public vrc(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var5;
        this.b = ny8Var;
        this.c = ny8Var3;
        this.d = ny8Var2;
        this.e = ny8Var4;
        long jIncrementAndGet = ej5.b.incrementAndGet();
        this.f = jIncrementAndGet;
        this.g = cqk.a(((n0c) e()).a());
        this.i = new r8e(p90.a(Collections.singletonList(new e55(jIncrementAndGet, new xnh("Дамп perf-трейса (Perfetto)"), R.drawable.icon_folder_add_to, null, null, 24))));
    }

    public static final void d(vrc vrcVar, Context context, File file) {
        Uri uriI = ((ju6) vrcVar.d.getValue()).i(context, file);
        dp4.c(uriI);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("application/json");
        intent.putExtra("android.intent.extra.STREAM", uriI);
        Intent intentCreateChooser = Intent.createChooser(intent, null);
        intentCreateChooser.addFlags(268435456);
        Iterator<T> it = context.getPackageManager().queryIntentActivities(intentCreateChooser, 65536).iterator();
        while (it.hasNext()) {
            context.grantUriPermission(((ResolveInfo) it.next()).activityInfo.packageName, uriI, 3);
        }
        context.startActivity(intentCreateChooser);
    }

    @Override // defpackage.dk5
    public final gjg a() {
        return this.i;
    }

    @Override // defpackage.dk5
    public final void b(e55 e55Var) {
        if (ej5.a(e55Var.a, this.f)) {
            sgg sggVar = this.h;
            int i = 1;
            if (sggVar == null || !sggVar.isActive()) {
                this.h = yab.i0(this.g, ((n0c) e()).b(), 0, new voc(this, null, i), 2);
            } else {
                h8c h8cVar = (h8c) this.e.getValue();
                h8cVar.n("Дамп трейса уже происходит");
                h8cVar.p();
            }
        }
    }

    public final xhh e() {
        return (xhh) this.c.getValue();
    }
}
