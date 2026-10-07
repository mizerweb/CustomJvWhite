package defpackage;

import android.content.Context;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class rog extends a8j {
    public static final /* synthetic */ zv8[] t = {new z8b(rog.class, "moveFinishJob", "getMoveFinishJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, rog.class, "menuItemJob", "getMenuItemJob()Lkotlinx/coroutines/Job;"), new z8b(rog.class, "deleteSetJob", "getDeleteSetJob()Lkotlinx/coroutines/Job;")};
    public final Context c;
    public final xhh d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final mjg h;
    public final r8e i;
    public final ic6 j;
    public final ic6 k;
    public volatile Long l;
    public volatile int m;
    public volatile Long n;
    public final p3c o;
    public Long p;
    public Long q;
    public final p3c r;
    public final p3c s;

    public rog(Context context, xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.c = context;
        this.d = xhhVar;
        this.e = ny8Var3;
        this.f = ny8Var4;
        this.g = ny8Var5;
        mjg mjgVarA = p90.a(r66.a);
        this.h = mjgVarA;
        this.i = new r8e(mjgVarA);
        this.j = new ic6(null);
        this.k = new ic6(null);
        this.m = -1;
        this.o = qyj.S();
        this.r = qyj.S();
        this.s = qyj.S();
        gm0.n(rog.class.getName(), "loadSections");
        vdh vdhVar = (vdh) ny8Var.getValue();
        e9i.j0(e9i.T(new fz6(e9i.C(new q0d(((wae) vdhVar.g.getValue()).h(), vdhVar, 25), ((um6) ny8Var2.getValue()).k, ((ldh) ny8Var3.getValue()).i, new s11(4, null, 3)), new dyd(2, this, rog.class, "processResult", "processResult(Lone/me/stickerssettings/StickersSettingsViewModel$CombinedResult;)V", 4, 13), 3), ((n0c) xhhVar).b()), this.b);
    }

    public final String B(List list) {
        int size = list != null ? list.size() : 0;
        return this.c.getResources().getQuantityString(R.plurals.oneme_stickers_set_count, size, Integer.valueOf(size));
    }
}
